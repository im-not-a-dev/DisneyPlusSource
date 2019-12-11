package p602m.p613d.p662f.p671c.p673b.p674a;

import java.security.PrivateKey;
import p602m.p613d.p627b.C13697f;
import p602m.p613d.p662f.p664b.p665a.C13988f;
import p602m.p613d.p662f.p681d.p682a.C14068a;
import p602m.p613d.p662f.p681d.p682a.C14069b;
import p602m.p613d.p662f.p681d.p682a.C14075h;
import p602m.p613d.p662f.p681d.p682a.C14076i;

/* renamed from: m.d.f.c.b.a.c */
/* compiled from: BCMcEliecePrivateKey */
public class C14044c implements C13697f, PrivateKey {

    /* renamed from: c */
    private C13988f f31055c;

    public C14044c(C13988f fVar) {
        this.f31055c = fVar;
    }

    /* renamed from: a */
    public C14069b mo35499a() {
        return this.f31055c.mo35348b();
    }

    /* renamed from: b */
    public C14076i mo35500b() {
        return this.f31055c.mo35349c();
    }

    /* renamed from: c */
    public int mo35501c() {
        return this.f31055c.mo35350d();
    }

    /* renamed from: d */
    public int mo35502d() {
        return this.f31055c.mo35351e();
    }

    /* renamed from: e */
    public C14075h mo35503e() {
        return this.f31055c.mo35352f();
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C14044c)) {
            return false;
        }
        C14044c cVar = (C14044c) obj;
        if (mo35502d() == cVar.mo35502d() && mo35501c() == cVar.mo35501c() && mo35499a().equals(cVar.mo35499a()) && mo35500b().equals(cVar.mo35500b()) && mo35506g().equals(cVar.mo35506g()) && mo35503e().equals(cVar.mo35503e()) && mo35505f().equals(cVar.mo35505f())) {
            z = true;
        }
        return z;
    }

    /* renamed from: f */
    public C14075h mo35505f() {
        return this.f31055c.mo35353g();
    }

    /* renamed from: g */
    public C14068a mo35506g() {
        return this.f31055c.mo35354h();
    }

    public String getAlgorithm() {
        return "McEliece";
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] getEncoded() {
        /*
            r9 = this;
            m.d.f.a.c r8 = new m.d.f.a.c
            m.d.f.b.a.f r0 = r9.f31055c
            int r1 = r0.mo35351e()
            m.d.f.b.a.f r0 = r9.f31055c
            int r2 = r0.mo35350d()
            m.d.f.b.a.f r0 = r9.f31055c
            m.d.f.d.a.b r3 = r0.mo35348b()
            m.d.f.b.a.f r0 = r9.f31055c
            m.d.f.d.a.i r4 = r0.mo35349c()
            m.d.f.b.a.f r0 = r9.f31055c
            m.d.f.d.a.h r5 = r0.mo35352f()
            m.d.f.b.a.f r0 = r9.f31055c
            m.d.f.d.a.h r6 = r0.mo35353g()
            m.d.f.b.a.f r0 = r9.f31055c
            m.d.f.d.a.a r7 = r0.mo35354h()
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = 0
            m.d.a.m2.a r1 = new m.d.a.m2.a     // Catch:{ IOException -> 0x0041 }
            m.d.a.o r2 = p602m.p613d.p662f.p663a.C13974e.f30863c     // Catch:{ IOException -> 0x0041 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0041 }
            m.d.a.i2.a r2 = new m.d.a.i2.a     // Catch:{ IOException -> 0x0041 }
            r2.<init>(r1, r8)     // Catch:{ IOException -> 0x0041 }
            byte[] r0 = r2.mo34828d()     // Catch:{  }
        L_0x0041:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p602m.p613d.p662f.p671c.p673b.p674a.C14044c.getEncoded():byte[]");
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return (((((((((((this.f31055c.mo35350d() * 37) + this.f31055c.mo35351e()) * 37) + this.f31055c.mo35348b().hashCode()) * 37) + this.f31055c.mo35349c().hashCode()) * 37) + this.f31055c.mo35352f().hashCode()) * 37) + this.f31055c.mo35353g().hashCode()) * 37) + this.f31055c.mo35354h().hashCode();
    }
}
