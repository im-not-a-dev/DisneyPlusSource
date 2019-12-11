package p602m.p613d.p662f.p671c.p673b.p677d;

import java.io.IOException;
import java.security.PublicKey;
import p602m.p613d.p614a.C13626o;
import p602m.p613d.p614a.p625m2.C13587a;
import p602m.p613d.p614a.p625m2.C13588b;
import p602m.p613d.p662f.p663a.C13974e;
import p602m.p613d.p662f.p663a.C13977h;
import p602m.p613d.p662f.p664b.p669d.C13995b;
import p602m.p613d.p662f.p671c.p672a.C14039d;
import p602m.p613d.p683g.C14079a;

/* renamed from: m.d.f.c.b.d.b */
/* compiled from: BCSphincs256PublicKey */
public class C14056b implements PublicKey, C14039d {

    /* renamed from: U */
    private final C13995b f31071U;

    /* renamed from: c */
    private final C13626o f31072c;

    public C14056b(C13588b bVar) {
        this.f31072c = C13977h.m44078a(bVar.mo34824e().mo34823f()).mo35324e().mo34822e();
        this.f31071U = new C13995b(bVar.mo34825f().mo34779i());
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C14056b)) {
            return false;
        }
        C14056b bVar = (C14056b) obj;
        if (!this.f31072c.equals(bVar.f31072c) || !C14079a.m44446a(this.f31071U.mo35370b(), bVar.f31071U.mo35370b())) {
            z = false;
        }
        return z;
    }

    public final String getAlgorithm() {
        return "SPHINCS-256";
    }

    public byte[] getEncoded() {
        try {
            return new C13588b(new C13587a(C13974e.f30865e, new C13977h(new C13587a(this.f31072c))), this.f31071U.mo35370b()).mo34828d();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return this.f31072c.hashCode() + (C14079a.m44457b(this.f31071U.mo35370b()) * 37);
    }
}
