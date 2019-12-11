package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.NoSuchElementException;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator;

class BoundedByteString extends LiteralByteString {
    private final int bytesLength;
    private final int bytesOffset;

    private class BoundedByteIterator implements ByteIterator {
        private final int limit;
        private int position;

        public boolean hasNext() {
            return this.position < this.limit;
        }

        public byte nextByte() {
            int i = this.position;
            if (i < this.limit) {
                byte[] bArr = BoundedByteString.this.bytes;
                this.position = i + 1;
                return bArr[i];
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        private BoundedByteIterator() {
            this.position = BoundedByteString.this.getOffsetIntoBytes();
            this.limit = this.position + BoundedByteString.this.size();
        }

        public Byte next() {
            return Byte.valueOf(nextByte());
        }
    }

    BoundedByteString(byte[] bArr, int i, int i2) {
        super(bArr);
        if (i < 0) {
            StringBuilder sb = new StringBuilder(29);
            sb.append("Offset too small: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 < 0) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append("Length too small: ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        } else if (((long) i) + ((long) i2) <= ((long) bArr.length)) {
            this.bytesOffset = i;
            this.bytesLength = i2;
        } else {
            StringBuilder sb3 = new StringBuilder(48);
            sb3.append("Offset+Length too large: ");
            sb3.append(i);
            sb3.append("+");
            sb3.append(i2);
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    public byte byteAt(int i) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(28);
            sb.append("Index too small: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        } else if (i < size()) {
            return this.bytes[this.bytesOffset + i];
        } else {
            int size = size();
            StringBuilder sb2 = new StringBuilder(41);
            sb2.append("Index too large: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(size);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
    }

    /* access modifiers changed from: protected */
    public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.bytes, getOffsetIntoBytes() + i, bArr, i2, i3);
    }

    /* access modifiers changed from: protected */
    public int getOffsetIntoBytes() {
        return this.bytesOffset;
    }

    public int size() {
        return this.bytesLength;
    }

    public ByteIterator iterator() {
        return new BoundedByteIterator();
    }
}
