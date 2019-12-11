package p163g.p441i.p442a.p443a.p445r;

import java.util.Arrays;

/* renamed from: g.i.a.a.r.a */
/* compiled from: CharTypes */
public final class C10916a {

    /* renamed from: a */
    private static final char[] f25903a = "0123456789ABCDEF".toCharArray();

    /* renamed from: b */
    private static final byte[] f25904b;

    /* renamed from: c */
    private static final int[] f25905c;

    /* renamed from: d */
    private static final int[] f25906d;

    /* renamed from: e */
    private static final int[] f25907e;

    /* renamed from: f */
    private static final int[] f25908f;

    /* renamed from: g */
    private static final int[] f25909g = new int[128];

    static {
        int length = f25903a.length;
        f25904b = new byte[length];
        for (int i = 0; i < length; i++) {
            f25904b[i] = (byte) f25903a[i];
        }
        int[] iArr = new int[256];
        for (int i2 = 0; i2 < 32; i2++) {
            iArr[i2] = -1;
        }
        iArr[34] = 1;
        iArr[92] = 1;
        f25905c = iArr;
        int[] iArr2 = f25905c;
        int[] iArr3 = new int[iArr2.length];
        System.arraycopy(iArr2, 0, iArr3, 0, iArr3.length);
        for (int i3 = 128; i3 < 256; i3++) {
            int i4 = (i3 & 224) == 192 ? 2 : (i3 & 240) == 224 ? 3 : (i3 & 248) == 240 ? 4 : -1;
            iArr3[i3] = i4;
        }
        f25906d = iArr3;
        int[] iArr4 = new int[256];
        Arrays.fill(iArr4, -1);
        for (int i5 = 33; i5 < 256; i5++) {
            if (Character.isJavaIdentifierPart((char) i5)) {
                iArr4[i5] = 0;
            }
        }
        iArr4[64] = 0;
        iArr4[35] = 0;
        iArr4[42] = 0;
        iArr4[45] = 0;
        iArr4[43] = 0;
        f25907e = iArr4;
        int[] iArr5 = new int[256];
        System.arraycopy(f25907e, 0, iArr5, 0, iArr5.length);
        Arrays.fill(iArr5, 128, 128, 0);
        int[] iArr6 = new int[256];
        System.arraycopy(f25906d, 128, iArr6, 128, 128);
        Arrays.fill(iArr6, 0, 32, -1);
        iArr6[9] = 0;
        iArr6[10] = 10;
        iArr6[13] = 13;
        iArr6[42] = 42;
        int[] iArr7 = new int[256];
        System.arraycopy(f25906d, 128, iArr7, 128, 128);
        Arrays.fill(iArr7, 0, 32, -1);
        iArr7[32] = 1;
        iArr7[9] = 1;
        iArr7[10] = 10;
        iArr7[13] = 13;
        iArr7[47] = 47;
        iArr7[35] = 35;
        int[] iArr8 = new int[128];
        for (int i6 = 0; i6 < 32; i6++) {
            iArr8[i6] = -1;
        }
        iArr8[34] = 34;
        iArr8[92] = 92;
        iArr8[8] = 98;
        iArr8[9] = 116;
        iArr8[12] = 102;
        iArr8[10] = 110;
        iArr8[13] = 114;
        f25908f = iArr8;
        Arrays.fill(f25909g, -1);
        for (int i7 = 0; i7 < 10; i7++) {
            f25909g[i7 + 48] = i7;
        }
        for (int i8 = 0; i8 < 6; i8++) {
            int[] iArr9 = f25909g;
            int i9 = i8 + 10;
            iArr9[i8 + 97] = i9;
            iArr9[i8 + 65] = i9;
        }
    }

    /* renamed from: a */
    public static void m34445a(StringBuilder sb, String str) {
        int[] iArr = f25908f;
        int length = iArr.length;
        int length2 = str.length();
        for (int i = 0; i < length2; i++) {
            char charAt = str.charAt(i);
            if (charAt >= length || iArr[charAt] == 0) {
                sb.append(charAt);
            } else {
                sb.append('\\');
                int i2 = iArr[charAt];
                if (i2 < 0) {
                    sb.append('u');
                    sb.append('0');
                    sb.append('0');
                    sb.append(f25903a[charAt >> 4]);
                    sb.append(f25903a[charAt & 15]);
                } else {
                    sb.append((char) i2);
                }
            }
        }
    }

    /* renamed from: b */
    public static char[] m34447b() {
        return (char[]) f25903a.clone();
    }

    /* renamed from: c */
    public static int[] m34448c() {
        return f25908f;
    }

    /* renamed from: a */
    public static byte[] m34446a() {
        return (byte[]) f25904b.clone();
    }
}
