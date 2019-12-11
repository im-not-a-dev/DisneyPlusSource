package p602m.p613d.p653e.p654a;

import java.math.BigInteger;

/* renamed from: m.d.e.a.i */
/* compiled from: FixedPointCombMultiplier */
public class C13822i extends C13803a {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo35176a(int i) {
        return i > 257 ? 6 : 5;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C13816g mo35059b(C13816g gVar, BigInteger bigInteger) {
        C13806d f = gVar.mo35148f();
        int a = C13824k.m42553a(f);
        if (bigInteger.bitLength() <= a) {
            C13823j a2 = C13824k.m42554a(gVar, mo35176a(a));
            C13816g[] b = a2.mo35181b();
            int c = a2.mo35182c();
            int i = ((a + c) - 1) / c;
            int i2 = (c * i) - 1;
            C13816g k = f.mo35091k();
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = 0;
                for (int i5 = i2 - i3; i5 >= 0; i5 -= i) {
                    i4 <<= 1;
                    if (bigInteger.testBit(i5)) {
                        i4 |= 1;
                    }
                }
                k = k.mo35145d(b[i4]);
            }
            return k.mo35134a(a2.mo35177a());
        }
        throw new IllegalStateException("fixed-point comb doesn't support scalars larger than the curve order");
    }
}
