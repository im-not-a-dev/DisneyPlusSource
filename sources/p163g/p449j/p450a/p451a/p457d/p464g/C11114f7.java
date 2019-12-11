package p163g.p449j.p450a.p451a.p457d.p464g;

import java.nio.ByteBuffer;

/* renamed from: g.j.a.a.d.g.f7 */
final class C11114f7 {

    /* renamed from: a */
    private static final C11128g7 f26204a;

    static {
        C11128g7 g7Var;
        if (!(C11058c7.m34858a() && C11058c7.m34863b()) || C11242o2.m35820a()) {
            g7Var = new C11184k7();
        } else {
            g7Var = new C11219m7();
        }
        f26204a = g7Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static int m35215a(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static int m35216a(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static int m35217a(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* renamed from: a */
    public static boolean m35221a(byte[] bArr) {
        return f26204a.mo28526a(bArr, 0, bArr.length);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m35226b(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return m35215a((int) b);
        }
        if (i3 == 1) {
            return m35216a((int) b, (int) bArr[i]);
        }
        if (i3 == 2) {
            return m35217a((int) b, (int) bArr[i], (int) bArr[i + 1]);
        }
        throw new AssertionError();
    }

    /* renamed from: c */
    static String m35227c(byte[] bArr, int i, int i2) throws C11258p4 {
        return f26204a.mo28527b(bArr, i, i2);
    }

    /* renamed from: a */
    public static boolean m35222a(byte[] bArr, int i, int i2) {
        return f26204a.mo28526a(bArr, i, i2);
    }

    /* renamed from: a */
    static int m35218a(CharSequence charSequence) {
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
                                throw new C11170j7(i2, length2);
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
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    static int m35219a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f26204a.mo28524a(charSequence, bArr, i, i2);
    }

    /* renamed from: a */
    static void m35220a(CharSequence charSequence, ByteBuffer byteBuffer) {
        C11128g7 g7Var = f26204a;
        if (byteBuffer.hasArray()) {
            int arrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(m35219a(charSequence, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
        } else if (byteBuffer.isDirect()) {
            g7Var.mo28525a(charSequence, byteBuffer);
        } else {
            C11128g7.m35245b(charSequence, byteBuffer);
        }
    }
}
