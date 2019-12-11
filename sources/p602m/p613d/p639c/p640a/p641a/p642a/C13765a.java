package p602m.p613d.p639c.p640a.p641a.p642a;

import java.io.IOException;
import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import p602m.p613d.p614a.C13501f;
import p602m.p613d.p614a.C13565l;
import p602m.p613d.p614a.C13641s0;
import p602m.p613d.p614a.C13643t;
import p602m.p613d.p614a.p621i2.C13521a;
import p602m.p613d.p614a.p623k2.C13529a;
import p602m.p613d.p614a.p625m2.C13587a;
import p602m.p613d.p614a.p625m2.C13588b;
import p602m.p613d.p614a.p626n2.C13617c;
import p602m.p613d.p614a.p626n2.C13625k;
import p602m.p613d.p627b.p632d0.C13682c;
import p602m.p613d.p627b.p632d0.C13686g;
import p602m.p613d.p639c.p640a.p641a.p643b.C13773b;
import p602m.p613d.p639c.p640a.p641a.p643b.C13774c;
import p602m.p613d.p639c.p640a.p641a.p643b.C13776e;
import p602m.p613d.p639c.p640a.p644b.C13778b;
import p602m.p613d.p649d.p650a.C13788b;
import p602m.p613d.p649d.p650a.C13789c;
import p602m.p613d.p649d.p650a.C13791e;
import p602m.p613d.p649d.p652c.C13799e;
import p602m.p613d.p649d.p652c.C13800f;

/* renamed from: m.d.c.a.a.a.a */
/* compiled from: BCECPrivateKey */
public class C13765a implements ECPrivateKey, C13789c, C13791e, C13788b {

    /* renamed from: U */
    private boolean f30573U;

    /* renamed from: V */
    private transient BigInteger f30574V;

    /* renamed from: W */
    private transient ECParameterSpec f30575W;

    /* renamed from: X */
    private transient C13778b f30576X;

    /* renamed from: Y */
    private transient C13641s0 f30577Y;

    /* renamed from: c */
    private String f30578c = "EC";

    protected C13765a() {
        new C13776e();
    }

    /* renamed from: a */
    private void m42253a(C13521a aVar) throws IOException {
        C13617c a = C13617c.m41808a(aVar.mo34802e().mo34823f());
        this.f30575W = C13773b.m42270a(a, C13773b.m42275a(this.f30576X, a));
        C13501f f = aVar.mo34803f();
        if (f instanceof C13565l) {
            this.f30574V = C13565l.m41715a((Object) f).mo34814i();
            return;
        }
        C13529a a2 = C13529a.m41666a((Object) f);
        this.f30574V = a2.mo34812e();
        this.f30577Y = a2.mo34813f();
    }

    /* renamed from: X */
    public BigInteger mo34993X() {
        return this.f30574V;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C13765a)) {
            return false;
        }
        C13765a aVar = (C13765a) obj;
        if (mo34993X().equals(aVar.mo34993X()) && mo34994a().equals(aVar.mo34994a())) {
            z = true;
        }
        return z;
    }

    public String getAlgorithm() {
        return this.f30578c;
    }

    public byte[] getEncoded() {
        int i;
        C13529a aVar;
        C13617c a = C13767c.m42260a(this.f30575W, this.f30573U);
        ECParameterSpec eCParameterSpec = this.f30575W;
        if (eCParameterSpec == null) {
            i = C13774c.m42278a(this.f30576X, (BigInteger) null, getS());
        } else {
            i = C13774c.m42278a(this.f30576X, eCParameterSpec.getOrder(), getS());
        }
        if (this.f30577Y != null) {
            aVar = new C13529a(i, getS(), this.f30577Y, a);
        } else {
            aVar = new C13529a(i, getS(), a);
        }
        try {
            return new C13521a(new C13587a(C13625k.f30320n, a), aVar).mo34827a("DER");
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public C13799e getParameters() {
        ECParameterSpec eCParameterSpec = this.f30575W;
        if (eCParameterSpec == null) {
            return null;
        }
        return C13773b.m42273a(eCParameterSpec, this.f30573U);
    }

    public ECParameterSpec getParams() {
        return this.f30575W;
    }

    public BigInteger getS() {
        return this.f30574V;
    }

    public int hashCode() {
        return mo34993X().hashCode() ^ mo34994a().hashCode();
    }

    public String toString() {
        return C13774c.m42279a("EC", this.f30574V, mo34994a());
    }

    public C13765a(ECPrivateKey eCPrivateKey, C13778b bVar) {
        new C13776e();
        this.f30574V = eCPrivateKey.getS();
        this.f30578c = eCPrivateKey.getAlgorithm();
        this.f30575W = eCPrivateKey.getParams();
        this.f30576X = bVar;
    }

    public C13765a(String str, C13800f fVar, C13778b bVar) {
        new C13776e();
        this.f30578c = str;
        this.f30574V = fVar.mo35050b();
        if (fVar.mo35039a() != null) {
            this.f30575W = C13773b.m42269a(C13773b.m42271a(fVar.mo35039a().mo35043a(), fVar.mo35039a().mo35047e()), fVar.mo35039a());
        } else {
            this.f30575W = null;
        }
        this.f30576X = bVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C13799e mo34994a() {
        ECParameterSpec eCParameterSpec = this.f30575W;
        if (eCParameterSpec != null) {
            return C13773b.m42273a(eCParameterSpec, this.f30573U);
        }
        return this.f30576X.mo35028b();
    }

    /* renamed from: a */
    private C13641s0 m42252a(C13766b bVar) {
        try {
            return C13588b.m41764a(C13643t.m41897a(bVar.getEncoded())).mo34825f();
        } catch (IOException unused) {
            return null;
        }
    }

    public C13765a(String str, ECPrivateKeySpec eCPrivateKeySpec, C13778b bVar) {
        new C13776e();
        this.f30578c = str;
        this.f30574V = eCPrivateKeySpec.getS();
        this.f30575W = eCPrivateKeySpec.getParams();
        this.f30576X = bVar;
    }

    public C13765a(String str, C13686g gVar, C13766b bVar, ECParameterSpec eCParameterSpec, C13778b bVar2) {
        new C13776e();
        C13682c b = gVar.mo34938b();
        this.f30578c = str;
        this.f30574V = gVar.mo34939c();
        this.f30576X = bVar2;
        if (eCParameterSpec == null) {
            this.f30575W = new ECParameterSpec(C13773b.m42271a(b.mo34930a(), b.mo34934e()), new ECPoint(b.mo34931b().mo35141c().mo35117l(), b.mo34931b().mo35144d().mo35117l()), b.mo34933d(), b.mo34932c().intValue());
        } else {
            this.f30575W = eCParameterSpec;
        }
        this.f30577Y = m42252a(bVar);
    }

    public C13765a(String str, C13686g gVar, C13766b bVar, C13799e eVar, C13778b bVar2) {
        new C13776e();
        C13682c b = gVar.mo34938b();
        this.f30578c = str;
        this.f30574V = gVar.mo34939c();
        this.f30576X = bVar2;
        if (eVar == null) {
            this.f30575W = new ECParameterSpec(C13773b.m42271a(b.mo34930a(), b.mo34934e()), new ECPoint(b.mo34931b().mo35141c().mo35117l(), b.mo34931b().mo35144d().mo35117l()), b.mo34933d(), b.mo34932c().intValue());
        } else {
            this.f30575W = C13773b.m42269a(C13773b.m42271a(eVar.mo35043a(), eVar.mo35047e()), eVar);
        }
        try {
            this.f30577Y = m42252a(bVar);
        } catch (Exception unused) {
            this.f30577Y = null;
        }
    }

    public C13765a(String str, C13686g gVar, C13778b bVar) {
        new C13776e();
        this.f30578c = str;
        this.f30574V = gVar.mo34939c();
        this.f30575W = null;
        this.f30576X = bVar;
    }

    C13765a(String str, C13521a aVar, C13778b bVar) throws IOException {
        new C13776e();
        this.f30578c = str;
        this.f30576X = bVar;
        m42253a(aVar);
    }
}
