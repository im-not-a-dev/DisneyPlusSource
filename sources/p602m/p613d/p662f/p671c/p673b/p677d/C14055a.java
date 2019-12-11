package p602m.p613d.p662f.p671c.p673b.p677d;

import java.io.IOException;
import java.security.PrivateKey;
import p602m.p613d.p614a.C13484b1;
import p602m.p613d.p614a.C13626o;
import p602m.p613d.p614a.C13630p;
import p602m.p613d.p614a.p621i2.C13521a;
import p602m.p613d.p614a.p625m2.C13587a;
import p602m.p613d.p662f.p663a.C13974e;
import p602m.p613d.p662f.p663a.C13977h;
import p602m.p613d.p662f.p664b.p669d.C13994a;
import p602m.p613d.p662f.p671c.p672a.C14039d;
import p602m.p613d.p683g.C14079a;

/* renamed from: m.d.f.c.b.d.a */
/* compiled from: BCSphincs256PrivateKey */
public class C14055a implements PrivateKey, C14039d {

    /* renamed from: U */
    private final C13994a f31069U;

    /* renamed from: c */
    private final C13626o f31070c;

    public C14055a(C13521a aVar) throws IOException {
        this.f31070c = C13977h.m44078a(aVar.mo34802e().mo34823f()).mo35324e().mo34822e();
        this.f31069U = new C13994a(C13630p.m41856a((Object) aVar.mo34803f()).mo34797i());
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C14055a)) {
            return false;
        }
        C14055a aVar = (C14055a) obj;
        if (!this.f31070c.equals(aVar.f31070c) || !C14079a.m44446a(this.f31069U.mo35369b(), aVar.f31069U.mo35369b())) {
            z = false;
        }
        return z;
    }

    public final String getAlgorithm() {
        return "SPHINCS-256";
    }

    public byte[] getEncoded() {
        try {
            return new C13521a(new C13587a(C13974e.f30865e, new C13977h(new C13587a(this.f31070c))), new C13484b1(this.f31069U.mo35369b())).mo34828d();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return this.f31070c.hashCode() + (C14079a.m44457b(this.f31069U.mo35369b()) * 37);
    }
}
