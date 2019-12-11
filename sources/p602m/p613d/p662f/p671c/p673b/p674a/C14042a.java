package p602m.p613d.p662f.p671c.p673b.p674a;

import java.io.IOException;
import java.security.PrivateKey;
import p602m.p613d.p614a.p621i2.C13521a;
import p602m.p613d.p614a.p625m2.C13587a;
import p602m.p613d.p662f.p663a.C13970a;
import p602m.p613d.p662f.p663a.C13974e;
import p602m.p613d.p662f.p664b.p665a.C13984b;
import p602m.p613d.p662f.p681d.p682a.C14068a;
import p602m.p613d.p662f.p681d.p682a.C14069b;
import p602m.p613d.p662f.p681d.p682a.C14075h;
import p602m.p613d.p662f.p681d.p682a.C14076i;

/* renamed from: m.d.f.c.b.a.a */
/* compiled from: BCMcElieceCCA2PrivateKey */
public class C14042a implements PrivateKey {

    /* renamed from: c */
    private C13984b f31053c;

    public C14042a(C13984b bVar) {
        this.f31053c = bVar;
    }

    /* renamed from: a */
    public C14069b mo35479a() {
        return this.f31053c.mo35339c();
    }

    /* renamed from: b */
    public C14076i mo35480b() {
        return this.f31053c.mo35340d();
    }

    /* renamed from: c */
    public C14068a mo35481c() {
        return this.f31053c.mo35341e();
    }

    /* renamed from: d */
    public int mo35482d() {
        return this.f31053c.mo35342f();
    }

    /* renamed from: e */
    public int mo35483e() {
        return this.f31053c.mo35343g();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C14042a)) {
            return false;
        }
        C14042a aVar = (C14042a) obj;
        if (mo35483e() != aVar.mo35483e() || mo35482d() != aVar.mo35482d() || !mo35479a().equals(aVar.mo35479a()) || !mo35480b().equals(aVar.mo35480b()) || !mo35485f().equals(aVar.mo35485f()) || !mo35481c().equals(aVar.mo35481c())) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public C14075h mo35485f() {
        return this.f31053c.mo35344h();
    }

    public String getAlgorithm() {
        return "McEliece-CCA2";
    }

    public byte[] getEncoded() {
        try {
            C13970a aVar = new C13970a(mo35483e(), mo35482d(), mo35479a(), mo35480b(), mo35485f(), C14048g.m44352a(this.f31053c.mo35338b()));
            return new C13521a(new C13587a(C13974e.f30864d), aVar).mo34828d();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return (((((((((this.f31053c.mo35342f() * 37) + this.f31053c.mo35343g()) * 37) + this.f31053c.mo35339c().hashCode()) * 37) + this.f31053c.mo35340d().hashCode()) * 37) + this.f31053c.mo35344h().hashCode()) * 37) + this.f31053c.mo35341e().hashCode();
    }
}
