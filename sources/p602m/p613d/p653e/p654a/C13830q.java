package p602m.p613d.p653e.p654a;

import java.math.BigInteger;
import p602m.p613d.p653e.p654a.C13806d.C13807a;
import p602m.p613d.p653e.p654a.C13816g.C13817a;

/* renamed from: m.d.e.a.q */
/* compiled from: Tnaf */
class C13830q {

    /* renamed from: a */
    private static final BigInteger f30685a = C13805c.f30634b.negate();

    /* renamed from: b */
    private static final BigInteger f30686b = C13805c.f30635c.negate();

    /* renamed from: c */
    private static final BigInteger f30687c = C13805c.f30636d.negate();

    /* renamed from: d */
    public static final C13836w[] f30688d;

    /* renamed from: e */
    public static final byte[][] f30689e = {null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, 1}};

    /* renamed from: f */
    public static final C13836w[] f30690f;

    /* renamed from: g */
    public static final byte[][] f30691g = {null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, -1}};

    static {
        BigInteger bigInteger = f30685a;
        f30688d = new C13836w[]{null, new C13836w(C13805c.f30634b, C13805c.f30633a), null, new C13836w(f30687c, f30685a), null, new C13836w(bigInteger, bigInteger), null, new C13836w(C13805c.f30634b, f30685a), null};
        BigInteger bigInteger2 = C13805c.f30634b;
        f30690f = new C13836w[]{null, new C13836w(C13805c.f30634b, C13805c.f30633a), null, new C13836w(f30687c, C13805c.f30634b), null, new C13836w(f30685a, C13805c.f30634b), null, new C13836w(bigInteger2, bigInteger2), null};
    }

    /* renamed from: a */
    public static byte m42608a(int i) {
        return (byte) (i == 0 ? -1 : 1);
    }

    /* renamed from: a */
    public static BigInteger m42611a(byte b, C13836w wVar) {
        BigInteger bigInteger = wVar.f30700a;
        BigInteger multiply = bigInteger.multiply(bigInteger);
        BigInteger multiply2 = wVar.f30700a.multiply(wVar.f30701b);
        BigInteger bigInteger2 = wVar.f30701b;
        BigInteger shiftLeft = bigInteger2.multiply(bigInteger2).shiftLeft(1);
        if (b == 1) {
            return multiply.add(multiply2).add(shiftLeft);
        }
        if (b == -1) {
            return multiply.subtract(multiply2).add(shiftLeft);
        }
        throw new IllegalArgumentException("mu must be 1 or -1");
    }

    /* JADX INFO: used method not loaded: m.d.e.a.p.a(java.math.BigInteger):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0090, code lost:
        if (r7.mo35203a(f30686b) < 0) goto L_0x0092;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p602m.p613d.p653e.p654a.C13836w m42615a(p602m.p613d.p653e.p654a.C13829p r7, p602m.p613d.p653e.p654a.C13829p r8, byte r9) {
        /*
            int r0 = r7.mo35207b()
            int r1 = r8.mo35207b()
            if (r1 != r0) goto L_0x00ac
            r0 = -1
            r1 = 1
            if (r9 == r1) goto L_0x0019
            if (r9 != r0) goto L_0x0011
            goto L_0x0019
        L_0x0011:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "mu must be 1 or -1"
            r7.<init>(r8)
            throw r7
        L_0x0019:
            java.math.BigInteger r2 = r7.mo35211d()
            java.math.BigInteger r3 = r8.mo35211d()
            m.d.e.a.p r7 = r7.mo35208b(r2)
            m.d.e.a.p r8 = r8.mo35208b(r3)
            m.d.e.a.p r4 = r7.mo35206a(r7)
            if (r9 != r1) goto L_0x0034
            m.d.e.a.p r4 = r4.mo35206a(r8)
            goto L_0x0038
        L_0x0034:
            m.d.e.a.p r4 = r4.mo35209b(r8)
        L_0x0038:
            m.d.e.a.p r5 = r8.mo35206a(r8)
            m.d.e.a.p r5 = r5.mo35206a(r8)
            m.d.e.a.p r8 = r5.mo35206a(r8)
            if (r9 != r1) goto L_0x004f
            m.d.e.a.p r5 = r7.mo35209b(r5)
            m.d.e.a.p r7 = r7.mo35206a(r8)
            goto L_0x0057
        L_0x004f:
            m.d.e.a.p r5 = r7.mo35206a(r5)
            m.d.e.a.p r7 = r7.mo35209b(r8)
        L_0x0057:
            java.math.BigInteger r8 = p602m.p613d.p653e.p654a.C13805c.f30634b
            int r8 = r4.mo35203a(r8)
            r6 = 0
            if (r8 < 0) goto L_0x006c
            java.math.BigInteger r8 = f30685a
            int r8 = r5.mo35203a(r8)
            if (r8 >= 0) goto L_0x0069
            goto L_0x0074
        L_0x0069:
            r8 = 0
            r6 = 1
            goto L_0x0077
        L_0x006c:
            java.math.BigInteger r8 = p602m.p613d.p653e.p654a.C13805c.f30635c
            int r8 = r7.mo35203a(r8)
            if (r8 < 0) goto L_0x0076
        L_0x0074:
            r8 = r9
            goto L_0x0077
        L_0x0076:
            r8 = 0
        L_0x0077:
            java.math.BigInteger r1 = f30685a
            int r1 = r4.mo35203a(r1)
            if (r1 >= 0) goto L_0x008a
            java.math.BigInteger r7 = p602m.p613d.p653e.p654a.C13805c.f30634b
            int r7 = r5.mo35203a(r7)
            if (r7 < 0) goto L_0x0088
            goto L_0x0092
        L_0x0088:
            r6 = -1
            goto L_0x0094
        L_0x008a:
            java.math.BigInteger r0 = f30686b
            int r7 = r7.mo35203a(r0)
            if (r7 >= 0) goto L_0x0094
        L_0x0092:
            int r7 = -r9
            byte r8 = (byte) r7
        L_0x0094:
            long r0 = (long) r6
            java.math.BigInteger r7 = java.math.BigInteger.valueOf(r0)
            java.math.BigInteger r7 = r2.add(r7)
            long r8 = (long) r8
            java.math.BigInteger r8 = java.math.BigInteger.valueOf(r8)
            java.math.BigInteger r8 = r3.add(r8)
            m.d.e.a.w r9 = new m.d.e.a.w
            r9.<init>(r7, r8)
            return r9
        L_0x00ac:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "lambda0 and lambda1 do not have same scale"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p602m.p613d.p653e.p654a.C13830q.m42615a(m.d.e.a.p, m.d.e.a.p, byte):m.d.e.a.w");
    }

    /* renamed from: a */
    public static C13829p m42613a(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, byte b, int i, int i2) {
        int i3 = ((i + 5) / 2) + i2;
        BigInteger multiply = bigInteger2.multiply(bigInteger.shiftRight(((i - i3) - 2) + b));
        BigInteger add = multiply.add(bigInteger3.multiply(multiply.shiftRight(i)));
        int i4 = i3 - i2;
        BigInteger shiftRight = add.shiftRight(i4);
        if (add.testBit(i4 - 1)) {
            shiftRight = shiftRight.add(C13805c.f30634b);
        }
        return new C13829p(shiftRight, i2);
    }

    /* renamed from: a */
    public static BigInteger[] m42617a(byte b, int i, boolean z) {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        if (b == 1 || b == -1) {
            if (z) {
                bigInteger = C13805c.f30635c;
                bigInteger2 = BigInteger.valueOf((long) b);
            } else {
                bigInteger = C13805c.f30633a;
                bigInteger2 = C13805c.f30634b;
            }
            BigInteger bigInteger4 = bigInteger2;
            BigInteger bigInteger5 = bigInteger;
            int i2 = 1;
            while (i2 < i) {
                if (b == 1) {
                    bigInteger3 = bigInteger4;
                } else {
                    bigInteger3 = bigInteger4.negate();
                }
                i2++;
                BigInteger bigInteger6 = bigInteger4;
                bigInteger4 = bigInteger3.subtract(bigInteger5.shiftLeft(1));
                bigInteger5 = bigInteger6;
            }
            return new BigInteger[]{bigInteger5, bigInteger4};
        }
        throw new IllegalArgumentException("mu must be 1 or -1");
    }

    /* renamed from: a */
    public static BigInteger m42610a(byte b, int i) {
        if (i != 4) {
            BigInteger[] a = m42617a(b, i, false);
            BigInteger bit = C13805c.f30633a.setBit(i);
            return C13805c.f30635c.multiply(a[0]).multiply(a[1].modInverse(bit)).mod(bit);
        } else if (b == 1) {
            return BigInteger.valueOf(6);
        } else {
            return BigInteger.valueOf(10);
        }
    }

    /* renamed from: a */
    public static BigInteger[] m42618a(C13807a aVar) {
        if (aVar.mo35095o()) {
            int j = aVar.mo35090j();
            int intValue = aVar.mo35082d().mo35117l().intValue();
            byte a = m42608a(intValue);
            int a2 = m42609a(aVar.mo35085f());
            BigInteger[] a3 = m42617a(a, (j + 3) - intValue, false);
            if (a == 1) {
                a3[0] = a3[0].negate();
                a3[1] = a3[1].negate();
            }
            return new BigInteger[]{C13805c.f30634b.add(a3[1]).shiftRight(a2), C13805c.f30634b.add(a3[0]).shiftRight(a2).negate()};
        }
        throw new IllegalArgumentException("si is defined for Koblitz curves only");
    }

    /* renamed from: a */
    protected static int m42609a(BigInteger bigInteger) {
        if (bigInteger != null) {
            if (bigInteger.equals(C13805c.f30635c)) {
                return 1;
            }
            if (bigInteger.equals(C13805c.f30637e)) {
                return 2;
            }
        }
        throw new IllegalArgumentException("h (Cofactor) must be 2 or 4");
    }

    /* renamed from: a */
    public static C13836w m42614a(BigInteger bigInteger, int i, byte b, BigInteger[] bigIntegerArr, byte b2, byte b3) {
        BigInteger bigInteger2;
        byte b4 = b2;
        if (b4 == 1) {
            bigInteger2 = bigIntegerArr[0].add(bigIntegerArr[1]);
        } else {
            bigInteger2 = bigIntegerArr[0].subtract(bigIntegerArr[1]);
        }
        BigInteger bigInteger3 = bigInteger2;
        int i2 = i;
        BigInteger bigInteger4 = bigInteger;
        BigInteger bigInteger5 = m42617a(b4, i, true)[1];
        byte b5 = b;
        int i3 = i;
        byte b6 = b3;
        C13836w a = m42615a(m42613a(bigInteger4, bigIntegerArr[0], bigInteger5, b5, i3, (int) b6), m42613a(bigInteger4, bigIntegerArr[1], bigInteger5, b5, i3, (int) b6), b4);
        return new C13836w(bigInteger.subtract(bigInteger3.multiply(a.f30700a)).subtract(BigInteger.valueOf(2).multiply(bigIntegerArr[1]).multiply(a.f30701b)), bigIntegerArr[1].multiply(a.f30700a).subtract(bigIntegerArr[0].multiply(a.f30701b)));
    }

    /* renamed from: a */
    public static C13817a m42612a(C13817a aVar, byte[] bArr) {
        C13817a aVar2 = (C13817a) aVar.mo35160q();
        C13817a aVar3 = (C13817a) aVar.mo35148f().mo35091k();
        int i = 0;
        for (int length = bArr.length - 1; length >= 0; length--) {
            i++;
            byte b = bArr[length];
            if (b != 0) {
                aVar3 = (C13817a) aVar3.mo35167c(i).mo35134a((C13816g) b > 0 ? aVar : aVar2);
                i = 0;
            }
        }
        return i > 0 ? aVar3.mo35167c(i) : aVar3;
    }

    /* renamed from: a */
    public static byte[] m42616a(byte b, C13836w wVar, byte b2, BigInteger bigInteger, BigInteger bigInteger2, C13836w[] wVarArr) {
        BigInteger bigInteger3;
        int i;
        byte b3;
        boolean z;
        if (b == 1 || b == -1) {
            int bitLength = m42611a(b, wVar).bitLength();
            byte[] bArr = new byte[(bitLength > 30 ? bitLength + 4 + b2 : b2 + 34)];
            BigInteger shiftRight = bigInteger.shiftRight(1);
            BigInteger bigInteger4 = wVar.f30700a;
            BigInteger bigInteger5 = wVar.f30701b;
            int i2 = 0;
            while (true) {
                if (bigInteger4.equals(C13805c.f30633a) && bigInteger5.equals(C13805c.f30633a)) {
                    return bArr;
                }
                if (bigInteger4.testBit(0)) {
                    BigInteger mod = bigInteger4.add(bigInteger5.multiply(bigInteger2)).mod(bigInteger);
                    if (mod.compareTo(shiftRight) >= 0) {
                        i = mod.subtract(bigInteger).intValue();
                    } else {
                        i = mod.intValue();
                    }
                    byte b4 = (byte) i;
                    bArr[i2] = b4;
                    if (b4 < 0) {
                        b3 = (byte) (-b4);
                        z = false;
                    } else {
                        b3 = b4;
                        z = true;
                    }
                    if (z) {
                        bigInteger4 = bigInteger4.subtract(wVarArr[b3].f30700a);
                        bigInteger5 = bigInteger5.subtract(wVarArr[b3].f30701b);
                    } else {
                        bigInteger4 = bigInteger4.add(wVarArr[b3].f30700a);
                        bigInteger5 = bigInteger5.add(wVarArr[b3].f30701b);
                    }
                } else {
                    bArr[i2] = 0;
                }
                if (b == 1) {
                    bigInteger3 = bigInteger5.add(bigInteger4.shiftRight(1));
                } else {
                    bigInteger3 = bigInteger5.subtract(bigInteger4.shiftRight(1));
                }
                i2++;
                BigInteger negate = bigInteger4.shiftRight(1).negate();
                bigInteger4 = bigInteger3;
                bigInteger5 = negate;
            }
        } else {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
    }

    /* renamed from: a */
    public static C13817a[] m42619a(C13817a aVar, byte b) {
        byte[][] bArr = b == 0 ? f30689e : f30691g;
        C13817a[] aVarArr = new C13817a[((bArr.length + 1) >>> 1)];
        aVarArr[0] = aVar;
        int length = bArr.length;
        for (int i = 3; i < length; i += 2) {
            aVarArr[i >>> 1] = m42612a(aVar, bArr[i]);
        }
        aVar.mo35148f().mo35071a((C13816g[]) aVarArr);
        return aVarArr;
    }
}
