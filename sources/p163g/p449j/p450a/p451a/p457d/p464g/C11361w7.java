package p163g.p449j.p450a.p451a.p457d.p464g;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

/* renamed from: g.j.a.a.d.g.w7 */
public final class C11361w7 {

    /* renamed from: a */
    private final ByteBuffer f26588a;

    /* renamed from: b */
    private C11197l3 f26589b;

    /* renamed from: c */
    private int f26590c;

    private C11361w7(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, 0, i2));
    }

    /* renamed from: a */
    public static C11361w7 m36642a(byte[] bArr, int i, int i2) {
        return new C11361w7(bArr, 0, i2);
    }

    /* renamed from: b */
    public static C11361w7 m36647b(byte[] bArr) {
        return new C11361w7(bArr, 0, bArr.length);
    }

    /* renamed from: c */
    public static int m36649c(int i, int i2) {
        return m36644b(i) + m36648c(i2);
    }

    /* renamed from: d */
    public static int m36650d(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: e */
    private final void m36651e(int i) throws IOException {
        byte b = (byte) i;
        if (this.f26588a.hasRemaining()) {
            this.f26588a.put(b);
            return;
        }
        throw new C11347v7(this.f26588a.position(), this.f26588a.limit());
    }

    private C11361w7(ByteBuffer byteBuffer) {
        this.f26588a = byteBuffer;
        this.f26588a.order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: c */
    public static int m36648c(int i) {
        if (i >= 0) {
            return m36650d(i);
        }
        return 10;
    }

    /* renamed from: a */
    public final void mo29122a(int i, boolean z) throws IOException {
        mo29118a(i, 0);
        byte b = z ? (byte) 1 : 0;
        if (this.f26588a.hasRemaining()) {
            this.f26588a.put(b);
            return;
        }
        throw new C11347v7(this.f26588a.position(), this.f26588a.limit());
    }

    /* renamed from: b */
    public final void mo29125b(int i, int i2) throws IOException {
        mo29118a(i, 0);
        if (i2 >= 0) {
            mo29117a(i2);
        } else {
            mo29123a((long) i2);
        }
    }

    /* renamed from: b */
    public static int m36646b(int i, String str) {
        int b = m36644b(i);
        int a = m36641a((CharSequence) str);
        return b + m36650d(a) + a;
    }

    /* renamed from: a */
    public final void mo29121a(int i, String str) throws IOException {
        mo29118a(i, 2);
        try {
            int d = m36650d(str.length());
            if (d == m36650d(str.length() * 3)) {
                int position = this.f26588a.position();
                if (this.f26588a.remaining() >= d) {
                    this.f26588a.position(position + d);
                    m36643a((CharSequence) str, this.f26588a);
                    int position2 = this.f26588a.position();
                    this.f26588a.position(position);
                    mo29117a((position2 - position) - d);
                    this.f26588a.position(position2);
                    return;
                }
                throw new C11347v7(position + d, this.f26588a.limit());
            }
            mo29117a(m36641a((CharSequence) str));
            m36643a((CharSequence) str, this.f26588a);
        } catch (BufferOverflowException e) {
            C11347v7 v7Var = new C11347v7(this.f26588a.position(), this.f26588a.limit());
            v7Var.initCause(e);
            throw v7Var;
        }
    }

    /* renamed from: b */
    public static int m36645b(int i, C11099e8 e8Var) {
        int b = m36644b(i);
        int b2 = e8Var.mo28491b();
        return b + m36650d(b2) + b2;
    }

    /* renamed from: b */
    public static int m36644b(int i) {
        return m36650d(i << 3);
    }

    /* renamed from: a */
    public final void mo29119a(int i, C11099e8 e8Var) throws IOException {
        mo29118a(i, 2);
        if (e8Var.f26175a < 0) {
            e8Var.mo28491b();
        }
        mo29117a(e8Var.f26175a);
        e8Var.mo28252a(this);
    }

    /* renamed from: a */
    public final void mo29120a(int i, C11259p5 p5Var) throws IOException {
        if (this.f26589b == null) {
            this.f26589b = C11197l3.m35546a(this.f26588a);
            this.f26590c = this.f26588a.position();
        } else if (this.f26590c != this.f26588a.position()) {
            this.f26589b.mo28681b(this.f26588a.array(), this.f26590c, this.f26588a.position() - this.f26590c);
            this.f26590c = this.f26588a.position();
        }
        C11197l3 l3Var = this.f26589b;
        l3Var.mo28666a(i, p5Var);
        l3Var.mo28657a();
        this.f26590c = this.f26588a.position();
    }

    /* renamed from: a */
    private static int m36641a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                StringBuilder sb = new StringBuilder(39);
                                sb.append("Unpaired surrogate at index ");
                                sb.append(i2);
                                throw new IllegalArgumentException(sb.toString());
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        long j = ((long) i3) + 4294967296L;
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(j);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: a */
    private static void m36643a(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i;
        int i2;
        if (!byteBuffer.isReadOnly()) {
            String str = "Unpaired surrogate at index ";
            int i3 = 0;
            if (byteBuffer.hasArray()) {
                try {
                    byte[] array = byteBuffer.array();
                    int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
                    int remaining = byteBuffer.remaining();
                    int length = charSequence.length();
                    int i4 = remaining + arrayOffset;
                    while (i3 < length) {
                        int i5 = i3 + arrayOffset;
                        if (i5 >= i4) {
                            break;
                        }
                        char charAt = charSequence.charAt(i3);
                        if (charAt >= 128) {
                            break;
                        }
                        array[i5] = (byte) charAt;
                        i3++;
                    }
                    if (i3 == length) {
                        i = arrayOffset + length;
                    } else {
                        i = arrayOffset + i3;
                        while (i3 < length) {
                            char charAt2 = charSequence.charAt(i3);
                            if (charAt2 < 128 && i < i4) {
                                i2 = i + 1;
                                array[i] = (byte) charAt2;
                            } else if (charAt2 < 2048 && i <= i4 - 2) {
                                int i6 = i + 1;
                                array[i] = (byte) ((charAt2 >>> 6) | 960);
                                i = i6 + 1;
                                array[i6] = (byte) ((charAt2 & '?') | 128);
                                i3++;
                            } else if ((charAt2 < 55296 || 57343 < charAt2) && i <= i4 - 3) {
                                int i7 = i + 1;
                                array[i] = (byte) ((charAt2 >>> 12) | 480);
                                int i8 = i7 + 1;
                                array[i7] = (byte) (((charAt2 >>> 6) & 63) | 128);
                                i2 = i8 + 1;
                                array[i8] = (byte) ((charAt2 & '?') | 128);
                            } else if (i <= i4 - 4) {
                                int i9 = i3 + 1;
                                if (i9 != charSequence.length()) {
                                    char charAt3 = charSequence.charAt(i9);
                                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                                        int i10 = i + 1;
                                        array[i] = (byte) ((codePoint >>> 18) | 240);
                                        int i11 = i10 + 1;
                                        array[i10] = (byte) (((codePoint >>> 12) & 63) | 128);
                                        int i12 = i11 + 1;
                                        array[i11] = (byte) (((codePoint >>> 6) & 63) | 128);
                                        i = i12 + 1;
                                        array[i12] = (byte) ((codePoint & 63) | 128);
                                        i3 = i9;
                                        i3++;
                                    } else {
                                        i3 = i9;
                                    }
                                }
                                int i13 = i3 - 1;
                                StringBuilder sb = new StringBuilder(39);
                                sb.append(str);
                                sb.append(i13);
                                throw new IllegalArgumentException(sb.toString());
                            } else {
                                StringBuilder sb2 = new StringBuilder(37);
                                sb2.append("Failed writing ");
                                sb2.append(charAt2);
                                sb2.append(" at index ");
                                sb2.append(i);
                                throw new ArrayIndexOutOfBoundsException(sb2.toString());
                            }
                            i = i2;
                            i3++;
                        }
                    }
                    byteBuffer.position(i - byteBuffer.arrayOffset());
                } catch (ArrayIndexOutOfBoundsException e) {
                    BufferOverflowException bufferOverflowException = new BufferOverflowException();
                    bufferOverflowException.initCause(e);
                    throw bufferOverflowException;
                }
            } else {
                int length2 = charSequence.length();
                while (i3 < length2) {
                    char charAt4 = charSequence.charAt(i3);
                    if (charAt4 < 128) {
                        byteBuffer.put((byte) charAt4);
                    } else if (charAt4 < 2048) {
                        byteBuffer.put((byte) ((charAt4 >>> 6) | 960));
                        byteBuffer.put((byte) ((charAt4 & '?') | 128));
                    } else if (charAt4 < 55296 || 57343 < charAt4) {
                        byteBuffer.put((byte) ((charAt4 >>> 12) | 480));
                        byteBuffer.put((byte) (((charAt4 >>> 6) & 63) | 128));
                        byteBuffer.put((byte) ((charAt4 & '?') | 128));
                    } else {
                        int i14 = i3 + 1;
                        if (i14 != charSequence.length()) {
                            char charAt5 = charSequence.charAt(i14);
                            if (Character.isSurrogatePair(charAt4, charAt5)) {
                                int codePoint2 = Character.toCodePoint(charAt4, charAt5);
                                byteBuffer.put((byte) ((codePoint2 >>> 18) | 240));
                                byteBuffer.put((byte) (((codePoint2 >>> 12) & 63) | 128));
                                byteBuffer.put((byte) (((codePoint2 >>> 6) & 63) | 128));
                                byteBuffer.put((byte) ((codePoint2 & 63) | 128));
                                i3 = i14;
                            } else {
                                i3 = i14;
                            }
                        }
                        int i15 = i3 - 1;
                        StringBuilder sb3 = new StringBuilder(39);
                        sb3.append(str);
                        sb3.append(i15);
                        throw new IllegalArgumentException(sb3.toString());
                    }
                    i3++;
                }
            }
        } else {
            throw new ReadOnlyBufferException();
        }
    }

    /* renamed from: a */
    public final void mo29124a(byte[] bArr) throws IOException {
        int length = bArr.length;
        if (this.f26588a.remaining() >= length) {
            this.f26588a.put(bArr, 0, length);
            return;
        }
        throw new C11347v7(this.f26588a.position(), this.f26588a.limit());
    }

    /* renamed from: a */
    public final void mo29118a(int i, int i2) throws IOException {
        mo29117a((i << 3) | i2);
    }

    /* renamed from: a */
    public final void mo29117a(int i) throws IOException {
        while ((i & -128) != 0) {
            m36651e((i & 127) | 128);
            i >>>= 7;
        }
        m36651e(i);
    }

    /* renamed from: a */
    public final void mo29123a(long j) throws IOException {
        while ((-128 & j) != 0) {
            m36651e((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m36651e((int) j);
    }
}
