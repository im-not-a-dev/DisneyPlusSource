package p602m.p613d.p653e.p654a;

import java.math.BigInteger;

/* renamed from: m.d.e.a.k */
/* compiled from: FixedPointUtil */
public class C13824k {
    /* renamed from: a */
    public static int m42553a(C13806d dVar) {
        BigInteger m = dVar.mo35093m();
        return m == null ? dVar.mo35090j() + 1 : m.bitLength();
    }

    /* renamed from: a */
    public static C13823j m42555a(C13827n nVar) {
        if (nVar == null || !(nVar instanceof C13823j)) {
            return new C13823j();
        }
        return (C13823j) nVar;
    }

    /* renamed from: a */
    public static C13823j m42554a(C13816g gVar, int i) {
        C13806d f = gVar.mo35148f();
        int i2 = 1 << i;
        String str = "bc_fixed_point";
        C13823j a = m42555a(f.mo35068a(gVar, str));
        C13816g[] b = a.mo35181b();
        if (b == null || b.length < i2) {
            int a2 = ((m42553a(f) + i) - 1) / i;
            C13816g[] gVarArr = new C13816g[(i + 1)];
            gVarArr[0] = gVar;
            for (int i3 = 1; i3 < i; i3++) {
                gVarArr[i3] = gVarArr[i3 - 1].mo35138b(a2);
            }
            gVarArr[i] = gVarArr[0].mo35143c(gVarArr[1]);
            f.mo35071a(gVarArr);
            C13816g[] gVarArr2 = new C13816g[i2];
            gVarArr2[0] = gVarArr[0];
            for (int i4 = i - 1; i4 >= 0; i4--) {
                C13816g gVar2 = gVarArr[i4];
                int i5 = 1 << i4;
                for (int i6 = i5; i6 < i2; i6 += i5 << 1) {
                    gVarArr2[i6] = gVarArr2[i6 - i5].mo35134a(gVar2);
                }
            }
            f.mo35071a(gVarArr2);
            a.mo35179a(gVarArr[i]);
            a.mo35180a(gVarArr2);
            a.mo35178a(i);
            f.mo35070a(gVar, str, (C13827n) a);
        }
        return a;
    }
}
