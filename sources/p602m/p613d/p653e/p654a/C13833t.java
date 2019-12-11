package p602m.p613d.p653e.p654a;

import java.math.BigInteger;

/* renamed from: m.d.e.a.t */
/* compiled from: WNafUtil */
public abstract class C13833t {

    /* renamed from: a */
    private static final int[] f30695a = {13, 41, 121, 337, 897, 2305};

    /* renamed from: b */
    private static final byte[] f30696b = new byte[0];

    /* renamed from: c */
    private static final int[] f30697c = new int[0];

    /* renamed from: d */
    private static final C13816g[] f30698d = new C13816g[0];

    /* renamed from: a */
    public static int[] m42636a(BigInteger bigInteger) {
        if ((bigInteger.bitLength() >>> 16) != 0) {
            throw new IllegalArgumentException("'k' must have bitlength < 2^16");
        } else if (bigInteger.signum() == 0) {
            return f30697c;
        } else {
            BigInteger add = bigInteger.shiftLeft(1).add(bigInteger);
            int bitLength = add.bitLength();
            int[] iArr = new int[(bitLength >> 1)];
            BigInteger xor = add.xor(bigInteger);
            int i = bitLength - 1;
            int i2 = 1;
            int i3 = 0;
            int i4 = 0;
            while (i2 < i) {
                if (!xor.testBit(i2)) {
                    i4++;
                } else {
                    int i5 = i3 + 1;
                    iArr[i3] = i4 | ((bigInteger.testBit(i2) ? -1 : 1) << 16);
                    i2++;
                    i3 = i5;
                    i4 = 1;
                }
                i2++;
            }
            int i6 = i3 + 1;
            iArr[i3] = 65536 | i4;
            if (iArr.length > i6) {
                iArr = m42637a(iArr, i6);
            }
            return iArr;
        }
    }

    /* renamed from: b */
    public static byte[] m42640b(BigInteger bigInteger) {
        if (bigInteger.signum() == 0) {
            return f30696b;
        }
        BigInteger add = bigInteger.shiftLeft(1).add(bigInteger);
        int bitLength = add.bitLength() - 1;
        byte[] bArr = new byte[bitLength];
        BigInteger xor = add.xor(bigInteger);
        int i = 1;
        while (i < bitLength) {
            if (xor.testBit(i)) {
                bArr[i - 1] = (byte) (bigInteger.testBit(i) ? -1 : 1);
                i++;
            }
            i++;
        }
        bArr[bitLength - 1] = 1;
        return bArr;
    }

    /* renamed from: c */
    public static int m42641c(BigInteger bigInteger) {
        if (bigInteger.signum() == 0) {
            return 0;
        }
        return bigInteger.shiftLeft(1).add(bigInteger).xor(bigInteger).bitCount();
    }

    /* renamed from: b */
    public static byte[] m42639b(int i, BigInteger bigInteger) {
        if (i == 2) {
            return m42640b(bigInteger);
        }
        if (i < 2 || i > 8) {
            throw new IllegalArgumentException("'width' must be in the range [2, 8]");
        } else if (bigInteger.signum() == 0) {
            return f30696b;
        } else {
            byte[] bArr = new byte[(bigInteger.bitLength() + 1)];
            int i2 = 1 << i;
            int i3 = i2 - 1;
            int i4 = i2 >>> 1;
            BigInteger bigInteger2 = bigInteger;
            int i5 = 0;
            int i6 = 0;
            boolean z = false;
            while (i5 <= bigInteger2.bitLength()) {
                if (bigInteger2.testBit(i5) == z) {
                    i5++;
                } else {
                    bigInteger2 = bigInteger2.shiftRight(i5);
                    int intValue = bigInteger2.intValue() & i3;
                    if (z) {
                        intValue++;
                    }
                    z = (intValue & i4) != 0;
                    if (z) {
                        intValue -= i2;
                    }
                    if (i6 > 0) {
                        i5--;
                    }
                    int i7 = i6 + i5;
                    int i8 = i7 + 1;
                    bArr[i7] = (byte) intValue;
                    i6 = i8;
                    i5 = i;
                }
            }
            if (bArr.length > i6) {
                bArr = m42634a(bArr, i6);
            }
            return bArr;
        }
    }

    /* renamed from: a */
    public static int[] m42635a(int i, BigInteger bigInteger) {
        if (i == 2) {
            return m42636a(bigInteger);
        }
        if (i < 2 || i > 16) {
            throw new IllegalArgumentException("'width' must be in the range [2, 16]");
        } else if ((bigInteger.bitLength() >>> 16) != 0) {
            throw new IllegalArgumentException("'k' must have bitlength < 2^16");
        } else if (bigInteger.signum() == 0) {
            return f30697c;
        } else {
            int[] iArr = new int[((bigInteger.bitLength() / i) + 1)];
            int i2 = 1 << i;
            int i3 = i2 - 1;
            int i4 = i2 >>> 1;
            BigInteger bigInteger2 = bigInteger;
            int i5 = 0;
            int i6 = 0;
            boolean z = false;
            while (i5 <= bigInteger2.bitLength()) {
                if (bigInteger2.testBit(i5) == z) {
                    i5++;
                } else {
                    bigInteger2 = bigInteger2.shiftRight(i5);
                    int intValue = bigInteger2.intValue() & i3;
                    if (z) {
                        intValue++;
                    }
                    z = (intValue & i4) != 0;
                    if (z) {
                        intValue -= i2;
                    }
                    if (i6 > 0) {
                        i5--;
                    }
                    int i7 = i6 + 1;
                    iArr[i6] = i5 | (intValue << 16);
                    i5 = i;
                    i6 = i7;
                }
            }
            if (iArr.length > i6) {
                iArr = m42637a(iArr, i6);
            }
            return iArr;
        }
    }

    /* renamed from: a */
    public static C13832s m42631a(C13816g gVar) {
        return m42633a(gVar.mo35148f().mo35068a(gVar, "bc_wnaf"));
    }

    /* renamed from: a */
    public static C13832s m42633a(C13827n nVar) {
        if (nVar == null || !(nVar instanceof C13832s)) {
            return new C13832s();
        }
        return (C13832s) nVar;
    }

    /* renamed from: a */
    public static int m42628a(int i) {
        return m42629a(i, f30695a);
    }

    /* renamed from: a */
    public static int m42629a(int i, int[] iArr) {
        int i2 = 0;
        while (i2 < iArr.length && i >= iArr[i2]) {
            i2++;
        }
        return i2 + 2;
    }

    /* renamed from: a */
    public static C13816g m42630a(C13816g gVar, int i, boolean z, C13821h hVar) {
        C13806d f = gVar.mo35148f();
        C13832s a = m42632a(gVar, i, z);
        C13816g a2 = hVar.mo35175a(gVar);
        String str = "bc_wnaf";
        C13832s a3 = m42633a(f.mo35068a(a2, str));
        C13816g c = a.mo35221c();
        if (c != null) {
            a3.mo35216a(hVar.mo35175a(c));
        }
        C13816g[] a4 = a.mo35218a();
        C13816g[] gVarArr = new C13816g[a4.length];
        for (int i2 = 0; i2 < a4.length; i2++) {
            gVarArr[i2] = hVar.mo35175a(a4[i2]);
        }
        a3.mo35217a(gVarArr);
        if (z) {
            C13816g[] gVarArr2 = new C13816g[gVarArr.length];
            for (int i3 = 0; i3 < gVarArr2.length; i3++) {
                gVarArr2[i3] = gVarArr[i3].mo35160q();
            }
            a3.mo35219b(gVarArr2);
        }
        f.mo35070a(a2, str, (C13827n) a3);
        return a2;
    }

    /* renamed from: a */
    public static C13832s m42632a(C13816g gVar, int i, boolean z) {
        int i2;
        int i3;
        C13806d f = gVar.mo35148f();
        String str = "bc_wnaf";
        C13832s a = m42633a(f.mo35068a(gVar, str));
        int i4 = 0;
        int max = 1 << Math.max(0, i - 2);
        C13816g[] a2 = a.mo35218a();
        if (a2 == null) {
            a2 = f30698d;
            i2 = 0;
        } else {
            i2 = a2.length;
        }
        if (i2 < max) {
            a2 = m42638a(a2, max);
            if (max == 1) {
                a2[0] = gVar.mo35161r();
            } else {
                if (i2 == 0) {
                    a2[0] = gVar;
                    i3 = 1;
                } else {
                    i3 = i2;
                }
                C13812e eVar = null;
                if (max == 2) {
                    a2[1] = gVar.mo35165u();
                } else {
                    C13816g c = a.mo35221c();
                    C13816g gVar2 = a2[i3 - 1];
                    if (c == null) {
                        c = a2[0].mo35166v();
                        a.mo35216a(c);
                        if (!c.mo35157n() && C13804b.m42353b(f) && f.mo35090j() >= 64) {
                            int g = f.mo35086g();
                            if (g == 2 || g == 3 || g == 4) {
                                C13812e a3 = c.mo35130a(0);
                                c = f.mo35063a(c.mo35155l().mo35117l(), c.mo35156m().mo35117l());
                                C13812e j = a3.mo35115j();
                                gVar2 = gVar2.mo35139b(j).mo35142c(j.mo35106c(a3));
                                if (i2 == 0) {
                                    a2[0] = gVar2;
                                }
                                eVar = a3;
                            }
                        }
                    }
                    while (i3 < max) {
                        int i5 = i3 + 1;
                        gVar2 = gVar2.mo35134a(c);
                        a2[i3] = gVar2;
                        i3 = i5;
                    }
                }
                f.mo35073a(a2, i2, max - i2, eVar);
            }
        }
        a.mo35217a(a2);
        if (z) {
            C13816g[] b = a.mo35220b();
            if (b == null) {
                b = new C13816g[max];
            } else {
                i4 = b.length;
                if (i4 < max) {
                    b = m42638a(b, max);
                }
            }
            while (i4 < max) {
                b[i4] = a2[i4].mo35160q();
                i4++;
            }
            a.mo35219b(b);
        }
        f.mo35070a(gVar, str, (C13827n) a);
        return a;
    }

    /* renamed from: a */
    private static byte[] m42634a(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        return bArr2;
    }

    /* renamed from: a */
    private static int[] m42637a(int[] iArr, int i) {
        int[] iArr2 = new int[i];
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
        return iArr2;
    }

    /* renamed from: a */
    private static C13816g[] m42638a(C13816g[] gVarArr, int i) {
        C13816g[] gVarArr2 = new C13816g[i];
        System.arraycopy(gVarArr, 0, gVarArr2, 0, gVarArr.length);
        return gVarArr2;
    }
}
