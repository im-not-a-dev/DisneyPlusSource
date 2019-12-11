package p602m.p613d.p653e.p654a;

import java.math.BigInteger;

/* renamed from: m.d.e.a.a */
/* compiled from: AbstractECMultiplier */
public abstract class C13803a implements C13815f {
    /* renamed from: a */
    public C13816g mo35058a(C13816g gVar, BigInteger bigInteger) {
        int signum = bigInteger.signum();
        if (signum == 0 || gVar.mo35157n()) {
            return gVar.mo35148f().mo35091k();
        }
        C13816g b = mo35059b(gVar, bigInteger.abs());
        if (signum <= 0) {
            b = b.mo35160q();
        }
        C13804b.m42340a(b);
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C13816g mo35059b(C13816g gVar, BigInteger bigInteger);
}
