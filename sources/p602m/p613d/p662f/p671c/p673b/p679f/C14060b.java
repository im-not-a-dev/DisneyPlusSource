package p602m.p613d.p662f.p671c.p673b.p679f;

import java.io.IOException;
import java.security.PublicKey;
import p602m.p613d.p614a.C13501f;
import p602m.p613d.p614a.C13626o;
import p602m.p613d.p614a.p625m2.C13587a;
import p602m.p613d.p614a.p625m2.C13588b;
import p602m.p613d.p662f.p663a.C13974e;
import p602m.p613d.p662f.p663a.C13979j;
import p602m.p613d.p662f.p663a.C13982m;
import p602m.p613d.p662f.p664b.p670e.C14017o;
import p602m.p613d.p662f.p664b.p670e.C14021q;
import p602m.p613d.p662f.p664b.p670e.C14021q.C14023b;
import p602m.p613d.p662f.p671c.p672a.C14041f;
import p602m.p613d.p683g.C14079a;

/* renamed from: m.d.f.c.b.f.b */
/* compiled from: BCXMSSMTPublicKey */
public class C14060b implements PublicKey, C14041f {

    /* renamed from: U */
    private final C14021q f31075U;

    /* renamed from: c */
    private final C13626o f31076c;

    public C14060b(C13588b bVar) throws IOException {
        C13979j a = C13979j.m44085a(bVar.mo34824e().mo34823f());
        this.f31076c = a.mo35329g().mo34822e();
        C13982m a2 = C13982m.m44099a(bVar.mo34826g());
        C14023b bVar2 = new C14023b(new C14017o(a.mo35327e(), a.mo35328f(), C14063e.m44375a(this.f31076c)));
        bVar2.mo35451a(a2.mo35336e());
        bVar2.mo35453b(a2.mo35337f());
        this.f31075U = bVar2.mo35452a();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C14060b)) {
            return false;
        }
        C14060b bVar = (C14060b) obj;
        if (!this.f31076c.equals(bVar.f31076c) || !C14079a.m44446a(this.f31075U.mo35450e(), bVar.f31075U.mo35450e())) {
            z = false;
        }
        return z;
    }

    public final String getAlgorithm() {
        return "XMSSMT";
    }

    public byte[] getEncoded() {
        try {
            return new C13588b(new C13587a(C13974e.f30868h, new C13979j(this.f31075U.mo35447b().mo35433c(), this.f31075U.mo35447b().mo35434d(), new C13587a(this.f31076c))), (C13501f) new C13982m(this.f31075U.mo35448c(), this.f31075U.mo35449d())).mo34828d();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return this.f31076c.hashCode() + (C14079a.m44457b(this.f31075U.mo35450e()) * 37);
    }
}
