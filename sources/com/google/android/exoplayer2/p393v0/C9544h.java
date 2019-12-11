package com.google.android.exoplayer2.p393v0;

import android.util.Pair;
import com.google.android.exoplayer2.C8723g0;
import java.util.ArrayList;

/* renamed from: com.google.android.exoplayer2.v0.h */
/* compiled from: CodecSpecificDataUtil */
public final class C9544h {

    /* renamed from: a */
    private static final byte[] f22262a = {0, 0, 0, 1};

    /* renamed from: b */
    private static final int[] f22263b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: c */
    private static final int[] f22264c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: a */
    public static Pair<Integer, Integer> m29334a(byte[] bArr) throws C8723g0 {
        return m29333a(new C9571v(bArr), false);
    }

    /* renamed from: a */
    public static byte[] m29337a(int i, int i2, int i3) {
        return new byte[]{(byte) (((i << 3) & 248) | ((i2 >> 1) & 7)), (byte) (((i2 << 7) & 128) | ((i3 << 3) & 120))};
    }

    /* renamed from: b */
    public static String m29340b(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    /* renamed from: a */
    public static Pair<Integer, Integer> m29333a(C9571v vVar, boolean z) throws C8723g0 {
        int a = m29331a(vVar);
        int b = m29339b(vVar);
        int a2 = vVar.mo24660a(4);
        if (a == 5 || a == 29) {
            b = m29339b(vVar);
            a = m29331a(vVar);
            if (a == 22) {
                a2 = vVar.mo24660a(4);
            }
        }
        boolean z2 = true;
        if (z) {
            if (!(a == 1 || a == 2 || a == 3 || a == 4 || a == 6 || a == 7 || a == 17)) {
                switch (a) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unsupported audio object type: ");
                        sb.append(a);
                        throw new C8723g0(sb.toString());
                }
            }
            m29335a(vVar, a, a2);
            switch (a) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int a3 = vVar.mo24660a(2);
                    if (a3 == 2 || a3 == 3) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Unsupported epConfig: ");
                        sb2.append(a3);
                        throw new C8723g0(sb2.toString());
                    }
            }
        }
        int i = f22264c[a2];
        if (i == -1) {
            z2 = false;
        }
        C9537e.m29299a(z2);
        return Pair.create(Integer.valueOf(b), Integer.valueOf(i));
    }

    /* renamed from: b */
    public static byte[][] m29342b(byte[] bArr) {
        if (!m29341b(bArr, 0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            arrayList.add(Integer.valueOf(i));
            i = m29332a(bArr, i + f22262a.length);
        } while (i != -1);
        byte[][] bArr2 = new byte[arrayList.size()][];
        int i2 = 0;
        while (i2 < arrayList.size()) {
            int intValue = ((Integer) arrayList.get(i2)).intValue();
            byte[] bArr3 = new byte[((i2 < arrayList.size() + -1 ? ((Integer) arrayList.get(i2 + 1)).intValue() : bArr.length) - intValue)];
            System.arraycopy(bArr, intValue, bArr3, 0, bArr3.length);
            bArr2[i2] = bArr3;
            i2++;
        }
        return bArr2;
    }

    /* renamed from: b */
    private static boolean m29341b(byte[] bArr, int i) {
        if (bArr.length - i <= f22262a.length) {
            return false;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr2 = f22262a;
            if (i2 >= bArr2.length) {
                return true;
            }
            if (bArr[i + i2] != bArr2[i2]) {
                return false;
            }
            i2++;
        }
    }

    /* renamed from: a */
    public static byte[] m29336a(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        int i5 = -1;
        while (true) {
            int[] iArr = f22263b;
            if (i4 >= iArr.length) {
                break;
            }
            if (i == iArr[i4]) {
                i5 = i4;
            }
            i4++;
        }
        int i6 = -1;
        while (true) {
            int[] iArr2 = f22264c;
            if (i3 >= iArr2.length) {
                break;
            }
            if (i2 == iArr2[i3]) {
                i6 = i3;
            }
            i3++;
        }
        if (i != -1 && i6 != -1) {
            return m29337a(2, i5, i6);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid sample rate or number of channels: ");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    private static int m29339b(C9571v vVar) {
        int a = vVar.mo24660a(4);
        if (a == 15) {
            return vVar.mo24660a(24);
        }
        C9537e.m29299a(a < 13);
        return f22263b[a];
    }

    /* renamed from: a */
    public static byte[] m29338a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = f22262a;
        byte[] bArr3 = new byte[(bArr2.length + i2)];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, f22262a.length, i2);
        return bArr3;
    }

    /* renamed from: a */
    private static int m29332a(byte[] bArr, int i) {
        int length = bArr.length - f22262a.length;
        while (i <= length) {
            if (m29341b(bArr, i)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: a */
    private static int m29331a(C9571v vVar) {
        int a = vVar.mo24660a(5);
        return a == 31 ? vVar.mo24660a(6) + 32 : a;
    }

    /* renamed from: a */
    private static void m29335a(C9571v vVar, int i, int i2) {
        vVar.mo24670c(1);
        if (vVar.mo24673e()) {
            vVar.mo24670c(14);
        }
        boolean e = vVar.mo24673e();
        if (i2 != 0) {
            if (i == 6 || i == 20) {
                vVar.mo24670c(3);
            }
            if (e) {
                if (i == 22) {
                    vVar.mo24670c(16);
                }
                if (i == 17 || i == 19 || i == 20 || i == 23) {
                    vVar.mo24670c(3);
                }
                vVar.mo24670c(1);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException();
    }
}
