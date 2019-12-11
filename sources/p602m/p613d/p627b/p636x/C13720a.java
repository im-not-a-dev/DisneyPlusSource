package p602m.p613d.p627b.p636x;

import java.math.BigInteger;
import p602m.p613d.p627b.C13671c;
import p602m.p613d.p627b.C13697f;
import p602m.p613d.p627b.p632d0.C13686g;
import p602m.p613d.p627b.p632d0.C13687h;
import p602m.p613d.p653e.p654a.C13816g;

/* renamed from: m.d.b.x.a */
/* compiled from: ECDHBasicAgreement */
public class C13720a implements C13671c {

    /* renamed from: a */
    private C13686g f30471a;

    /* renamed from: a */
    public int mo34913a() {
        return (this.f30471a.mo34938b().mo34930a().mo35090j() + 7) / 8;
    }

    /* renamed from: b */
    public void mo34915b(C13697f fVar) {
        this.f30471a = (C13686g) fVar;
    }

    /* renamed from: a */
    public BigInteger mo34914a(C13697f fVar) {
        C13687h hVar = (C13687h) fVar;
        if (hVar.mo34938b().equals(this.f30471a.mo34938b())) {
            C13816g r = hVar.mo34940c().mo35131a(this.f30471a.mo34939c()).mo35161r();
            if (!r.mo35157n()) {
                return r.mo35141c().mo35117l();
            }
            throw new IllegalStateException("Infinity is not a valid agreement value for ECDH");
        }
        throw new IllegalStateException("ECDH public key has wrong domain parameters");
    }
}
