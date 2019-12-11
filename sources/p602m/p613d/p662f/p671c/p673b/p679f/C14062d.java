package p602m.p613d.p662f.p671c.p673b.p679f;

import java.io.IOException;
import java.security.PublicKey;
import p602m.p613d.p614a.C13501f;
import p602m.p613d.p614a.C13626o;
import p602m.p613d.p614a.p625m2.C13587a;
import p602m.p613d.p614a.p625m2.C13588b;
import p602m.p613d.p662f.p663a.C13974e;
import p602m.p613d.p662f.p663a.C13978i;
import p602m.p613d.p662f.p663a.C13982m;
import p602m.p613d.p662f.p664b.p670e.C14027u;
import p602m.p613d.p662f.p664b.p670e.C14031w;
import p602m.p613d.p662f.p664b.p670e.C14031w.C14033b;
import p602m.p613d.p662f.p671c.p672a.C14040e;
import p602m.p613d.p683g.C14079a;

/* renamed from: m.d.f.c.b.f.d */
/* compiled from: BCXMSSPublicKey */
public class C14062d implements PublicKey, C14040e {

    /* renamed from: U */
    private final C13626o f31079U;

    /* renamed from: c */
    private final C14031w f31080c;

    public C14062d(C13588b bVar) throws IOException {
        C13978i a = C13978i.m44081a(bVar.mo34824e().mo34823f());
        this.f31079U = a.mo35326f().mo34822e();
        C13982m a2 = C13982m.m44099a(bVar.mo34826g());
        C14033b bVar2 = new C14033b(new C14027u(a.mo35325e(), C14063e.m44375a(this.f31079U)));
        bVar2.mo35476a(a2.mo35336e());
        bVar2.mo35478b(a2.mo35337f());
        this.f31080c = bVar2.mo35477a();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C14062d)) {
            return false;
        }
        C14062d dVar = (C14062d) obj;
        if (!this.f31079U.equals(dVar.f31079U) || !C14079a.m44446a(this.f31080c.mo35475e(), dVar.f31080c.mo35475e())) {
            z = false;
        }
        return z;
    }

    public final String getAlgorithm() {
        return "XMSS";
    }

    public byte[] getEncoded() {
        try {
            return new C13588b(new C13587a(C13974e.f30867g, new C13978i(this.f31080c.mo35472b().mo35459c(), new C13587a(this.f31079U))), (C13501f) new C13982m(this.f31080c.mo35473c(), this.f31080c.mo35474d())).mo34828d();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return this.f31079U.hashCode() + (C14079a.m44457b(this.f31080c.mo35475e()) * 37);
    }
}
