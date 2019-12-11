package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator;

class RopeByteString extends ByteString {
    /* access modifiers changed from: private */
    public static final int[] minLengthByDepth;
    private int hash;
    /* access modifiers changed from: private */
    public final ByteString left;
    private final int leftLength;
    /* access modifiers changed from: private */
    public final ByteString right;
    private final int totalLength;
    private final int treeDepth;

    private static class Balancer {
        private final Stack<ByteString> prefixesStack;

        private Balancer() {
            this.prefixesStack = new Stack<>();
        }

        /* access modifiers changed from: private */
        public ByteString balance(ByteString byteString, ByteString byteString2) {
            doBalance(byteString);
            doBalance(byteString2);
            ByteString byteString3 = (ByteString) this.prefixesStack.pop();
            while (!this.prefixesStack.isEmpty()) {
                byteString3 = new RopeByteString((ByteString) this.prefixesStack.pop(), byteString3);
            }
            return byteString3;
        }

        private void doBalance(ByteString byteString) {
            if (byteString.isBalanced()) {
                insert(byteString);
            } else if (byteString instanceof RopeByteString) {
                RopeByteString ropeByteString = (RopeByteString) byteString;
                doBalance(ropeByteString.left);
                doBalance(ropeByteString.right);
            } else {
                String valueOf = String.valueOf(String.valueOf(byteString.getClass()));
                StringBuilder sb = new StringBuilder(valueOf.length() + 49);
                sb.append("Has a new type of ByteString been created? Found ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }

        private int getDepthBinForLength(int i) {
            int binarySearch = Arrays.binarySearch(RopeByteString.minLengthByDepth, i);
            return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
        }

        private void insert(ByteString byteString) {
            int depthBinForLength = getDepthBinForLength(byteString.size());
            int i = RopeByteString.minLengthByDepth[depthBinForLength + 1];
            if (this.prefixesStack.isEmpty() || ((ByteString) this.prefixesStack.peek()).size() >= i) {
                this.prefixesStack.push(byteString);
                return;
            }
            int i2 = RopeByteString.minLengthByDepth[depthBinForLength];
            ByteString byteString2 = (ByteString) this.prefixesStack.pop();
            while (!this.prefixesStack.isEmpty() && ((ByteString) this.prefixesStack.peek()).size() < i2) {
                byteString2 = new RopeByteString((ByteString) this.prefixesStack.pop(), byteString2);
            }
            RopeByteString ropeByteString = new RopeByteString(byteString2, byteString);
            while (!this.prefixesStack.isEmpty()) {
                if (((ByteString) this.prefixesStack.peek()).size() >= RopeByteString.minLengthByDepth[getDepthBinForLength(ropeByteString.size()) + 1]) {
                    break;
                }
                ropeByteString = new RopeByteString((ByteString) this.prefixesStack.pop(), ropeByteString);
            }
            this.prefixesStack.push(ropeByteString);
        }
    }

    private static class PieceIterator implements Iterator<LiteralByteString> {
        private final Stack<RopeByteString> breadCrumbs;
        private LiteralByteString next;

        private LiteralByteString getLeafByLeft(ByteString byteString) {
            while (byteString instanceof RopeByteString) {
                RopeByteString ropeByteString = (RopeByteString) byteString;
                this.breadCrumbs.push(ropeByteString);
                byteString = ropeByteString.left;
            }
            return (LiteralByteString) byteString;
        }

        private LiteralByteString getNextNonEmptyLeaf() {
            while (!this.breadCrumbs.isEmpty()) {
                LiteralByteString leafByLeft = getLeafByLeft(((RopeByteString) this.breadCrumbs.pop()).right);
                if (!leafByLeft.isEmpty()) {
                    return leafByLeft;
                }
            }
            return null;
        }

        public boolean hasNext() {
            return this.next != null;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        private PieceIterator(ByteString byteString) {
            this.breadCrumbs = new Stack<>();
            this.next = getLeafByLeft(byteString);
        }

        public LiteralByteString next() {
            LiteralByteString literalByteString = this.next;
            if (literalByteString != null) {
                this.next = getNextNonEmptyLeaf();
                return literalByteString;
            }
            throw new NoSuchElementException();
        }
    }

    private class RopeByteIterator implements ByteIterator {
        private ByteIterator bytes;
        int bytesRemaining;
        private final PieceIterator pieces;

        public boolean hasNext() {
            return this.bytesRemaining > 0;
        }

        public byte nextByte() {
            if (!this.bytes.hasNext()) {
                this.bytes = this.pieces.next().iterator();
            }
            this.bytesRemaining--;
            return this.bytes.nextByte();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        private RopeByteIterator() {
            this.pieces = new PieceIterator(RopeByteString.this);
            this.bytes = this.pieces.next().iterator();
            this.bytesRemaining = RopeByteString.this.size();
        }

        public Byte next() {
            return Byte.valueOf(nextByte());
        }
    }

    private class RopeInputStream extends InputStream {
        private LiteralByteString currentPiece;
        private int currentPieceIndex;
        private int currentPieceOffsetInRope;
        private int currentPieceSize;
        private int mark;
        private PieceIterator pieceIterator;

        public RopeInputStream() {
            initialize();
        }

        private void advanceIfCurrentPieceFullyRead() {
            if (this.currentPiece != null) {
                int i = this.currentPieceIndex;
                int i2 = this.currentPieceSize;
                if (i == i2) {
                    this.currentPieceOffsetInRope += i2;
                    this.currentPieceIndex = 0;
                    if (this.pieceIterator.hasNext()) {
                        this.currentPiece = this.pieceIterator.next();
                        this.currentPieceSize = this.currentPiece.size();
                        return;
                    }
                    this.currentPiece = null;
                    this.currentPieceSize = 0;
                }
            }
        }

        private void initialize() {
            this.pieceIterator = new PieceIterator(RopeByteString.this);
            this.currentPiece = this.pieceIterator.next();
            this.currentPieceSize = this.currentPiece.size();
            this.currentPieceIndex = 0;
            this.currentPieceOffsetInRope = 0;
        }

        private int readSkipInternal(byte[] bArr, int i, int i2) {
            int i3 = i;
            int i4 = i2;
            while (true) {
                if (i4 <= 0) {
                    break;
                }
                advanceIfCurrentPieceFullyRead();
                if (this.currentPiece != null) {
                    int min = Math.min(this.currentPieceSize - this.currentPieceIndex, i4);
                    if (bArr != null) {
                        this.currentPiece.copyTo(bArr, this.currentPieceIndex, i3, min);
                        i3 += min;
                    }
                    this.currentPieceIndex += min;
                    i4 -= min;
                } else if (i4 == i2) {
                    return -1;
                }
            }
            return i2 - i4;
        }

        public int available() throws IOException {
            return RopeByteString.this.size() - (this.currentPieceOffsetInRope + this.currentPieceIndex);
        }

        public void mark(int i) {
            this.mark = this.currentPieceOffsetInRope + this.currentPieceIndex;
        }

        public boolean markSupported() {
            return true;
        }

        public int read(byte[] bArr, int i, int i2) {
            if (bArr == null) {
                throw new NullPointerException();
            } else if (i >= 0 && i2 >= 0 && i2 <= bArr.length - i) {
                return readSkipInternal(bArr, i, i2);
            } else {
                throw new IndexOutOfBoundsException();
            }
        }

        public synchronized void reset() {
            initialize();
            readSkipInternal(null, 0, this.mark);
        }

        public long skip(long j) {
            if (j >= 0) {
                if (j > 2147483647L) {
                    j = 2147483647L;
                }
                return (long) readSkipInternal(null, 0, (int) j);
            }
            throw new IndexOutOfBoundsException();
        }

        public int read() throws IOException {
            advanceIfCurrentPieceFullyRead();
            LiteralByteString literalByteString = this.currentPiece;
            if (literalByteString == null) {
                return -1;
            }
            int i = this.currentPieceIndex;
            this.currentPieceIndex = i + 1;
            return literalByteString.byteAt(i) & 255;
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 1;
        while (i > 0) {
            arrayList.add(Integer.valueOf(i));
            int i3 = i2 + i;
            i2 = i;
            i = i3;
        }
        arrayList.add(Integer.valueOf(Integer.MAX_VALUE));
        minLengthByDepth = new int[arrayList.size()];
        int i4 = 0;
        while (true) {
            int[] iArr = minLengthByDepth;
            if (i4 < iArr.length) {
                iArr[i4] = ((Integer) arrayList.get(i4)).intValue();
                i4++;
            } else {
                return;
            }
        }
    }

    static ByteString concatenate(ByteString byteString, ByteString byteString2) {
        RopeByteString ropeByteString = byteString instanceof RopeByteString ? (RopeByteString) byteString : null;
        if (byteString2.size() == 0) {
            return byteString;
        }
        if (byteString.size() != 0) {
            int size = byteString.size() + byteString2.size();
            if (size < 128) {
                return concatenateBytes(byteString, byteString2);
            }
            if (ropeByteString != null && ropeByteString.right.size() + byteString2.size() < 128) {
                byteString2 = new RopeByteString(ropeByteString.left, concatenateBytes(ropeByteString.right, byteString2));
            } else if (ropeByteString == null || ropeByteString.left.getTreeDepth() <= ropeByteString.right.getTreeDepth() || ropeByteString.getTreeDepth() <= byteString2.getTreeDepth()) {
                if (size >= minLengthByDepth[Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1]) {
                    return new RopeByteString(byteString, byteString2);
                }
                return new Balancer().balance(byteString, byteString2);
            } else {
                byteString2 = new RopeByteString(ropeByteString.left, new RopeByteString(ropeByteString.right, byteString2));
            }
        }
        return byteString2;
    }

    private static LiteralByteString concatenateBytes(ByteString byteString, ByteString byteString2) {
        int size = byteString.size();
        int size2 = byteString2.size();
        byte[] bArr = new byte[(size + size2)];
        byteString.copyTo(bArr, 0, 0, size);
        byteString2.copyTo(bArr, 0, size, size2);
        return new LiteralByteString(bArr);
    }

    private boolean equalsFragments(ByteString byteString) {
        PieceIterator pieceIterator = new PieceIterator(this);
        LiteralByteString literalByteString = (LiteralByteString) pieceIterator.next();
        PieceIterator pieceIterator2 = new PieceIterator(byteString);
        LiteralByteString literalByteString2 = (LiteralByteString) pieceIterator2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = literalByteString.size() - i;
            int size2 = literalByteString2.size() - i2;
            int min = Math.min(size, size2);
            if (!(i == 0 ? literalByteString.equalsRange(literalByteString2, i2, min) : literalByteString2.equalsRange(literalByteString, i, min))) {
                return false;
            }
            i3 += min;
            int i4 = this.totalLength;
            if (i3 < i4) {
                if (min == size) {
                    literalByteString = (LiteralByteString) pieceIterator.next();
                    i = 0;
                } else {
                    i += min;
                }
                if (min == size2) {
                    literalByteString2 = (LiteralByteString) pieceIterator2.next();
                    i2 = 0;
                } else {
                    i2 += min;
                }
            } else if (i3 == i4) {
                return true;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            this.left.copyToInternal(bArr, i, i2, i3);
        } else if (i >= i5) {
            this.right.copyToInternal(bArr, i - i5, i2, i3);
        } else {
            int i6 = i5 - i;
            this.left.copyToInternal(bArr, i, i2, i6);
            this.right.copyToInternal(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        if (this.totalLength != byteString.size()) {
            return false;
        }
        if (this.totalLength == 0) {
            return true;
        }
        if (this.hash != 0) {
            int peekCachedHashCode = byteString.peekCachedHashCode();
            if (!(peekCachedHashCode == 0 || this.hash == peekCachedHashCode)) {
                return false;
            }
        }
        return equalsFragments(byteString);
    }

    /* access modifiers changed from: protected */
    public int getTreeDepth() {
        return this.treeDepth;
    }

    public int hashCode() {
        int i = this.hash;
        if (i == 0) {
            int i2 = this.totalLength;
            i = partialHash(i2, 0, i2);
            if (i == 0) {
                i = 1;
            }
            this.hash = i;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    public boolean isBalanced() {
        return this.totalLength >= minLengthByDepth[this.treeDepth];
    }

    public boolean isValidUtf8() {
        int partialIsValidUtf8 = this.left.partialIsValidUtf8(0, 0, this.leftLength);
        ByteString byteString = this.right;
        if (byteString.partialIsValidUtf8(partialIsValidUtf8, 0, byteString.size()) == 0) {
            return true;
        }
        return false;
    }

    public CodedInputStream newCodedInput() {
        return CodedInputStream.newInstance((InputStream) new RopeInputStream());
    }

    /* access modifiers changed from: protected */
    public int partialHash(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            return this.left.partialHash(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.right.partialHash(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.right.partialHash(this.left.partialHash(i, i2, i6), 0, i3 - i6);
    }

    /* access modifiers changed from: protected */
    public int partialIsValidUtf8(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            return this.left.partialIsValidUtf8(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.right.partialIsValidUtf8(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.right.partialIsValidUtf8(this.left.partialIsValidUtf8(i, i2, i6), 0, i3 - i6);
    }

    /* access modifiers changed from: protected */
    public int peekCachedHashCode() {
        return this.hash;
    }

    public int size() {
        return this.totalLength;
    }

    public String toString(String str) throws UnsupportedEncodingException {
        return new String(toByteArray(), str);
    }

    /* access modifiers changed from: 0000 */
    public void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException {
        int i3 = i + i2;
        int i4 = this.leftLength;
        if (i3 <= i4) {
            this.left.writeToInternal(outputStream, i, i2);
        } else if (i >= i4) {
            this.right.writeToInternal(outputStream, i - i4, i2);
        } else {
            int i5 = i4 - i;
            this.left.writeToInternal(outputStream, i, i5);
            this.right.writeToInternal(outputStream, 0, i2 - i5);
        }
    }

    private RopeByteString(ByteString byteString, ByteString byteString2) {
        this.hash = 0;
        this.left = byteString;
        this.right = byteString2;
        this.leftLength = byteString.size();
        this.totalLength = this.leftLength + byteString2.size();
        this.treeDepth = Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1;
    }

    public ByteIterator iterator() {
        return new RopeByteIterator();
    }
}
