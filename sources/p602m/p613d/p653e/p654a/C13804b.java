package p602m.p613d.p653e.p654a;

import java.math.BigInteger;
import p602m.p613d.p653e.p654a.C13806d.C13807a;
import p602m.p613d.p653e.p654a.p659y.C13945a;
import p602m.p613d.p653e.p654a.p659y.C13946b;
import p602m.p613d.p653e.p660b.C13950b;
import p602m.p613d.p653e.p660b.C13955g;

/* renamed from: m.d.e.a.b */
/* compiled from: ECAlgorithms */
public class C13804b {
    /* renamed from: a */
    public static boolean m42350a(C13806d dVar) {
        return m42351a(dVar.mo35089i());
    }

    /* renamed from: b */
    public static boolean m42353b(C13806d dVar) {
        return m42354b(dVar.mo35089i());
    }

    /* renamed from: a */
    public static boolean m42351a(C13950b bVar) {
        return bVar.mo35283b() > 1 && bVar.mo35284c().equals(C13805c.f30635c) && (bVar instanceof C13955g);
    }

    /* renamed from: b */
    public static boolean m42354b(C13950b bVar) {
        return bVar.mo35283b() == 1;
    }

    /* renamed from: a */
    public static C13816g m42339a(C13806d dVar, C13816g gVar) {
        if (dVar.mo35075a(gVar.mo35148f())) {
            return dVar.mo35079b(gVar);
        }
        throw new IllegalArgumentException("Point must be on the same curve");
    }

    /* renamed from: b */
    public static C13816g m42352b(C13816g gVar, BigInteger bigInteger, C13816g gVar2, BigInteger bigInteger2) {
        C13806d f = gVar.mo35148f();
        C13816g a = m42339a(f, gVar2);
        if (!(f instanceof C13807a) || !((C13807a) f).mo35095o()) {
            C13945a h = f.mo35087h();
            if (h instanceof C13946b) {
                C13816g a2 = m42346a(new C13816g[]{gVar, a}, new BigInteger[]{bigInteger, bigInteger2}, (C13946b) h);
                m42340a(a2);
                return a2;
            }
            C13816g a3 = m42342a(gVar, bigInteger, a, bigInteger2);
            m42340a(a3);
            return a3;
        }
        C13816g a4 = gVar.mo35131a(bigInteger).mo35134a(a.mo35131a(bigInteger2));
        m42340a(a4);
        return a4;
    }

    /* renamed from: a */
    public static void m42349a(C13812e[] eVarArr, int i, int i2, C13812e eVar) {
        C13812e[] eVarArr2 = new C13812e[i2];
        int i3 = 0;
        eVarArr2[0] = eVarArr[i];
        while (true) {
            i3++;
            if (i3 >= i2) {
                break;
            }
            eVarArr2[i3] = eVarArr2[i3 - 1].mo35106c(eVarArr[i + i3]);
        }
        int i4 = i3 - 1;
        if (eVar != null) {
            eVarArr2[i4] = eVarArr2[i4].mo35106c(eVar);
        }
        C13812e e = eVarArr2[i4].mo35110e();
        while (i4 > 0) {
            int i5 = i4 - 1;
            int i6 = i4 + i;
            C13812e eVar2 = eVarArr[i6];
            eVarArr[i6] = eVarArr2[i5].mo35106c(e);
            e = e.mo35106c(eVar2);
            i4 = i5;
        }
        eVarArr[i] = e;
    }

    /* renamed from: a */
    public static C13816g m42341a(C13816g gVar, BigInteger bigInteger) {
        BigInteger abs = bigInteger.abs();
        C13816g k = gVar.mo35148f().mo35091k();
        int bitLength = abs.bitLength();
        if (bitLength > 0) {
            if (abs.testBit(0)) {
                k = gVar;
            }
            for (int i = 1; i < bitLength; i++) {
                gVar = gVar.mo35166v();
                if (abs.testBit(i)) {
                    k = k.mo35134a(gVar);
                }
            }
        }
        return bigInteger.signum() < 0 ? k.mo35160q() : k;
    }

    /* renamed from: a */
    public static C13816g m42340a(C13816g gVar) {
        if (gVar.mo35159p()) {
            return gVar;
        }
        throw new IllegalArgumentException("Invalid point");
    }

    /* renamed from: a */
    static C13816g m42342a(C13816g gVar, BigInteger bigInteger, C13816g gVar2, BigInteger bigInteger2) {
        boolean z = false;
        boolean z2 = bigInteger.signum() < 0;
        if (bigInteger2.signum() < 0) {
            z = true;
        }
        BigInteger abs = bigInteger.abs();
        BigInteger abs2 = bigInteger2.abs();
        int max = Math.max(2, Math.min(16, C13833t.m42628a(abs.bitLength())));
        int max2 = Math.max(2, Math.min(16, C13833t.m42628a(abs2.bitLength())));
        C13832s a = C13833t.m42632a(gVar, max, true);
        C13832s a2 = C13833t.m42632a(gVar2, max2, true);
        return m42347a(z2 ? a.mo35220b() : a.mo35218a(), z2 ? a.mo35218a() : a.mo35220b(), C13833t.m42639b(max, abs), z ? a2.mo35220b() : a2.mo35218a(), z ? a2.mo35218a() : a2.mo35220b(), C13833t.m42639b(max2, abs2));
    }

    /* renamed from: a */
    static C13816g m42343a(C13816g gVar, BigInteger bigInteger, C13821h hVar, BigInteger bigInteger2) {
        boolean z = false;
        boolean z2 = bigInteger.signum() < 0;
        if (bigInteger2.signum() < 0) {
            z = true;
        }
        BigInteger abs = bigInteger.abs();
        BigInteger abs2 = bigInteger2.abs();
        int max = Math.max(2, Math.min(16, C13833t.m42628a(Math.max(abs.bitLength(), abs2.bitLength()))));
        C13816g a = C13833t.m42630a(gVar, max, true, hVar);
        C13832s a2 = C13833t.m42631a(gVar);
        C13832s a3 = C13833t.m42631a(a);
        return m42347a(z2 ? a2.mo35220b() : a2.mo35218a(), z2 ? a2.mo35218a() : a2.mo35220b(), C13833t.m42639b(max, abs), z ? a3.mo35220b() : a3.mo35218a(), z ? a3.mo35218a() : a3.mo35220b(), C13833t.m42639b(max, abs2));
    }

    /* renamed from: a */
    private static C13816g m42347a(C13816g[] gVarArr, C13816g[] gVarArr2, byte[] bArr, C13816g[] gVarArr3, C13816g[] gVarArr4, byte[] bArr2) {
        C13816g gVar;
        int max = Math.max(bArr.length, bArr2.length);
        C13816g k = gVarArr[0].mo35148f().mo35091k();
        int i = max - 1;
        C13816g gVar2 = k;
        int i2 = 0;
        while (i >= 0) {
            byte b = i < bArr.length ? bArr[i] : 0;
            byte b2 = i < bArr2.length ? bArr2[i] : 0;
            if ((b | b2) == 0) {
                i2++;
            } else {
                if (b != 0) {
                    gVar = k.mo35134a((b < 0 ? gVarArr2 : gVarArr)[Math.abs(b) >>> 1]);
                } else {
                    gVar = k;
                }
                if (b2 != 0) {
                    gVar = gVar.mo35134a((b2 < 0 ? gVarArr4 : gVarArr3)[Math.abs(b2) >>> 1]);
                }
                if (i2 > 0) {
                    gVar2 = gVar2.mo35138b(i2);
                    i2 = 0;
                }
                gVar2 = gVar2.mo35145d(gVar);
            }
            i--;
        }
        return i2 > 0 ? gVar2.mo35138b(i2) : gVar2;
    }

    /* renamed from: a */
    static C13816g m42345a(C13816g[] gVarArr, BigInteger[] bigIntegerArr) {
        int length = gVarArr.length;
        boolean[] zArr = new boolean[length];
        C13832s[] sVarArr = new C13832s[length];
        byte[][] bArr = new byte[length][];
        for (int i = 0; i < length; i++) {
            BigInteger bigInteger = bigIntegerArr[i];
            zArr[i] = bigInteger.signum() < 0;
            BigInteger abs = bigInteger.abs();
            int max = Math.max(2, Math.min(16, C13833t.m42628a(abs.bitLength())));
            sVarArr[i] = C13833t.m42632a(gVarArr[i], max, true);
            bArr[i] = C13833t.m42639b(max, abs);
        }
        return m42348a(zArr, sVarArr, bArr);
    }

    /* renamed from: a */
    static C13816g m42346a(C13816g[] gVarArr, BigInteger[] bigIntegerArr, C13946b bVar) {
        BigInteger m = gVarArr[0].mo35148f().mo35093m();
        int i = r2 << 1;
        BigInteger[] bigIntegerArr2 = new BigInteger[i];
        int i2 = 0;
        for (int i3 = 0; i3 < r2; i3++) {
            BigInteger[] a = bVar.mo35273a(bigIntegerArr[i3].mod(m));
            int i4 = i2 + 1;
            bigIntegerArr2[i2] = a[0];
            i2 = i4 + 1;
            bigIntegerArr2[i4] = a[1];
        }
        C13821h a2 = bVar.mo35271a();
        if (bVar.mo35272b()) {
            return m42344a(gVarArr, a2, bigIntegerArr2);
        }
        C13816g[] gVarArr2 = new C13816g[i];
        int i5 = 0;
        for (C13816g gVar : gVarArr) {
            C13816g a3 = a2.mo35175a(gVar);
            int i6 = i5 + 1;
            gVarArr2[i5] = gVar;
            i5 = i6 + 1;
            gVarArr2[i6] = a3;
        }
        return m42345a(gVarArr2, bigIntegerArr2);
    }

    /* renamed from: a */
    static C13816g m42344a(C13816g[] gVarArr, C13821h hVar, BigInteger[] bigIntegerArr) {
        C13816g[] gVarArr2 = gVarArr;
        int length = gVarArr2.length;
        int i = length << 1;
        boolean[] zArr = new boolean[i];
        C13832s[] sVarArr = new C13832s[i];
        byte[][] bArr = new byte[i][];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 << 1;
            int i4 = i3 + 1;
            BigInteger bigInteger = bigIntegerArr[i3];
            zArr[i3] = bigInteger.signum() < 0;
            BigInteger abs = bigInteger.abs();
            BigInteger bigInteger2 = bigIntegerArr[i4];
            zArr[i4] = bigInteger2.signum() < 0;
            BigInteger abs2 = bigInteger2.abs();
            int max = Math.max(2, Math.min(16, C13833t.m42628a(Math.max(abs.bitLength(), abs2.bitLength()))));
            C13816g gVar = gVarArr2[i2];
            C13816g a = C13833t.m42630a(gVar, max, true, hVar);
            sVarArr[i3] = C13833t.m42631a(gVar);
            sVarArr[i4] = C13833t.m42631a(a);
            bArr[i3] = C13833t.m42639b(max, abs);
            bArr[i4] = C13833t.m42639b(max, abs2);
        }
        return m42348a(zArr, sVarArr, bArr);
    }

    /* renamed from: a */
    private static C13816g m42348a(boolean[] zArr, C13832s[] sVarArr, byte[][] bArr) {
        int i = 0;
        for (byte[] length : bArr) {
            i = Math.max(i, length.length);
        }
        C13816g k = sVarArr[0].mo35218a()[0].mo35148f().mo35091k();
        int i2 = i - 1;
        C13816g gVar = k;
        int i3 = 0;
        while (i2 >= 0) {
            C13816g gVar2 = k;
            for (int i4 = 0; i4 < r0; i4++) {
                byte[] bArr2 = bArr[i4];
                byte b = i2 < bArr2.length ? bArr2[i2] : 0;
                if (b != 0) {
                    int abs = Math.abs(b);
                    C13832s sVar = sVarArr[i4];
                    gVar2 = gVar2.mo35134a(((b < 0) == zArr[i4] ? sVar.mo35218a() : sVar.mo35220b())[abs >>> 1]);
                }
            }
            if (gVar2 == k) {
                i3++;
            } else {
                if (i3 > 0) {
                    gVar = gVar.mo35138b(i3);
                    i3 = 0;
                }
                gVar = gVar.mo35145d(gVar2);
            }
            i2--;
        }
        return i3 > 0 ? gVar.mo35138b(i3) : gVar;
    }
}
