package p602m.p613d.p639c.p640a.p641a.p642a;

import java.io.IOException;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import p602m.p613d.p614a.C13484b1;
import p602m.p613d.p614a.C13630p;
import p602m.p613d.p614a.C13643t;
import p602m.p613d.p614a.p625m2.C13587a;
import p602m.p613d.p614a.p625m2.C13588b;
import p602m.p613d.p614a.p626n2.C13617c;
import p602m.p613d.p614a.p626n2.C13621g;
import p602m.p613d.p614a.p626n2.C13624j;
import p602m.p613d.p614a.p626n2.C13625k;
import p602m.p613d.p627b.p632d0.C13682c;
import p602m.p613d.p627b.p632d0.C13687h;
import p602m.p613d.p639c.p640a.p641a.p643b.C13773b;
import p602m.p613d.p639c.p640a.p641a.p643b.C13774c;
import p602m.p613d.p639c.p640a.p641a.p643b.C13775d;
import p602m.p613d.p639c.p640a.p644b.C13778b;
import p602m.p613d.p649d.p650a.C13788b;
import p602m.p613d.p649d.p650a.C13790d;
import p602m.p613d.p649d.p652c.C13799e;
import p602m.p613d.p649d.p652c.C13801g;
import p602m.p613d.p653e.p654a.C13806d;
import p602m.p613d.p653e.p654a.C13816g;

/* renamed from: m.d.c.a.a.a.b */
/* compiled from: BCECPublicKey */
public class C13766b implements ECPublicKey, C13790d, C13788b {

    /* renamed from: U */
    private boolean f30579U;

    /* renamed from: V */
    private transient C13687h f30580V;

    /* renamed from: W */
    private transient ECParameterSpec f30581W;

    /* renamed from: X */
    private transient C13778b f30582X;

    /* renamed from: c */
    private String f30583c = "EC";

    public C13766b(String str, ECPublicKeySpec eCPublicKeySpec, C13778b bVar) {
        this.f30583c = str;
        this.f30581W = eCPublicKeySpec.getParams();
        this.f30580V = new C13687h(C13773b.m42276a(this.f30581W, eCPublicKeySpec.getW(), false), C13773b.m42272a(bVar, eCPublicKeySpec.getParams()));
        this.f30582X = bVar;
    }

    /* renamed from: a */
    private ECParameterSpec m42256a(EllipticCurve ellipticCurve, C13682c cVar) {
        return new ECParameterSpec(ellipticCurve, new ECPoint(cVar.mo34931b().mo35141c().mo35117l(), cVar.mo34931b().mo35144d().mo35117l()), cVar.mo34933d(), cVar.mo34932c().intValue());
    }

    /* renamed from: Y */
    public C13816g mo35004Y() {
        C13816g c = this.f30580V.mo34940c();
        return this.f30581W == null ? c.mo35150h() : c;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C13766b)) {
            return false;
        }
        C13766b bVar = (C13766b) obj;
        if (this.f30580V.mo34940c().mo35140b(bVar.f30580V.mo34940c()) && mo35005a().equals(bVar.mo35005a())) {
            z = true;
        }
        return z;
    }

    public String getAlgorithm() {
        return this.f30583c;
    }

    public byte[] getEncoded() {
        return C13775d.m42293a(new C13588b(new C13587a(C13625k.f30320n, C13767c.m42260a(this.f30581W, this.f30579U)), C13630p.m41856a((Object) new C13621g(this.f30580V.mo34940c(), this.f30579U).mo34785a()).mo34797i()));
    }

    public String getFormat() {
        return "X.509";
    }

    public C13799e getParameters() {
        ECParameterSpec eCParameterSpec = this.f30581W;
        if (eCParameterSpec == null) {
            return null;
        }
        return C13773b.m42273a(eCParameterSpec, this.f30579U);
    }

    public ECParameterSpec getParams() {
        return this.f30581W;
    }

    public ECPoint getW() {
        C13816g c = this.f30580V.mo34940c();
        return new ECPoint(c.mo35141c().mo35117l(), c.mo35144d().mo35117l());
    }

    public int hashCode() {
        return this.f30580V.mo34940c().hashCode() ^ mo35005a().hashCode();
    }

    public String toString() {
        return C13774c.m42280a("EC", this.f30580V.mo34940c(), mo35005a());
    }

    /* renamed from: a */
    private void m42257a(C13588b bVar) {
        C13617c a = C13617c.m41808a(bVar.mo34824e().mo34823f());
        C13806d a2 = C13773b.m42275a(this.f30582X, a);
        this.f30581W = C13773b.m42270a(a, a2);
        byte[] i = bVar.mo34825f().mo34779i();
        C13630p b1Var = new C13484b1(i);
        if (i[0] == 4 && i[1] == i.length - 2 && ((i[2] == 2 || i[2] == 3) && new C13624j().mo34845a(a2) >= i.length - 3)) {
            try {
                b1Var = (C13630p) C13643t.m41897a(i);
            } catch (IOException unused) {
                throw new IllegalArgumentException("error recovering public key");
            }
        }
        this.f30580V = new C13687h(new C13621g(a2, b1Var).mo34841e(), C13774c.m42286a(this.f30582X, a));
    }

    public C13766b(String str, C13801g gVar, C13778b bVar) {
        this.f30583c = str;
        if (gVar.mo35039a() != null) {
            EllipticCurve a = C13773b.m42271a(gVar.mo35039a().mo35043a(), gVar.mo35039a().mo35047e());
            this.f30580V = new C13687h(gVar.mo35051b(), C13774c.m42287a(bVar, gVar.mo35039a()));
            this.f30581W = C13773b.m42269a(a, gVar.mo35039a());
        } else {
            this.f30580V = new C13687h(bVar.mo35028b().mo35043a().mo35063a(gVar.mo35051b().mo35141c().mo35117l(), gVar.mo35051b().mo35144d().mo35117l()), C13773b.m42272a(bVar, (ECParameterSpec) null));
            this.f30581W = null;
        }
        this.f30582X = bVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C13799e mo35005a() {
        ECParameterSpec eCParameterSpec = this.f30581W;
        if (eCParameterSpec != null) {
            return C13773b.m42273a(eCParameterSpec, this.f30579U);
        }
        return this.f30582X.mo35028b();
    }

    public C13766b(String str, C13687h hVar, ECParameterSpec eCParameterSpec, C13778b bVar) {
        C13682c b = hVar.mo34938b();
        this.f30583c = str;
        this.f30580V = hVar;
        if (eCParameterSpec == null) {
            this.f30581W = m42256a(C13773b.m42271a(b.mo34930a(), b.mo34934e()), b);
        } else {
            this.f30581W = eCParameterSpec;
        }
        this.f30582X = bVar;
    }

    public C13766b(String str, C13687h hVar, C13799e eVar, C13778b bVar) {
        C13682c b = hVar.mo34938b();
        this.f30583c = str;
        if (eVar == null) {
            this.f30581W = m42256a(C13773b.m42271a(b.mo34930a(), b.mo34934e()), b);
        } else {
            this.f30581W = C13773b.m42269a(C13773b.m42271a(eVar.mo35043a(), eVar.mo35047e()), eVar);
        }
        this.f30580V = hVar;
        this.f30582X = bVar;
    }

    public C13766b(String str, C13687h hVar, C13778b bVar) {
        this.f30583c = str;
        this.f30580V = hVar;
        this.f30581W = null;
        this.f30582X = bVar;
    }

    public C13766b(ECPublicKey eCPublicKey, C13778b bVar) {
        this.f30583c = eCPublicKey.getAlgorithm();
        this.f30581W = eCPublicKey.getParams();
        this.f30580V = new C13687h(C13773b.m42276a(this.f30581W, eCPublicKey.getW(), false), C13773b.m42272a(bVar, eCPublicKey.getParams()));
    }

    C13766b(String str, C13588b bVar, C13778b bVar2) {
        this.f30583c = str;
        this.f30582X = bVar2;
        m42257a(bVar);
    }
}
