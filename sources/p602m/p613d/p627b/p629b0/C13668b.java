package p602m.p613d.p627b.p629b0;

import java.math.BigInteger;
import java.security.SecureRandom;
import p602m.p613d.p627b.C13664a;
import p602m.p613d.p627b.C13666b;
import p602m.p613d.p627b.C13714r;
import p602m.p613d.p627b.p632d0.C13682c;
import p602m.p613d.p627b.p632d0.C13683d;
import p602m.p613d.p627b.p632d0.C13686g;
import p602m.p613d.p627b.p632d0.C13687h;
import p602m.p613d.p653e.p654a.C13805c;
import p602m.p613d.p653e.p654a.C13815f;
import p602m.p613d.p653e.p654a.C13822i;
import p602m.p613d.p653e.p654a.C13833t;

/* renamed from: m.d.b.b0.b */
/* compiled from: ECKeyPairGenerator */
public class C13668b implements C13666b, C13805c {

    /* renamed from: g */
    C13682c f30400g;

    /* renamed from: h */
    SecureRandom f30401h;

    /* renamed from: a */
    public void mo34910a(C13714r rVar) {
        C13683d dVar = (C13683d) rVar;
        this.f30401h = dVar.mo34977a();
        this.f30400g = dVar.mo34937b();
        if (this.f30401h == null) {
            this.f30401h = new SecureRandom();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C13815f mo34911b() {
        return new C13822i();
    }

    /* renamed from: a */
    public C13664a mo34907a() {
        BigInteger d = this.f30400g.mo34933d();
        int bitLength = d.bitLength();
        int i = bitLength >>> 2;
        while (true) {
            BigInteger bigInteger = new BigInteger(bitLength, this.f30401h);
            if (bigInteger.compareTo(C13805c.f30635c) >= 0 && bigInteger.compareTo(d) < 0 && C13833t.m42641c(bigInteger) >= i) {
                return new C13664a(new C13687h(mo34911b().mo35058a(this.f30400g.mo34931b(), bigInteger), this.f30400g), new C13686g(bigInteger, this.f30400g));
            }
        }
    }
}
