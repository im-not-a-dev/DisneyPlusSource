package p602m.p613d.p662f.p671c.p673b.p674a;

import java.io.IOException;
import java.security.PublicKey;
import p602m.p613d.p614a.C13501f;
import p602m.p613d.p614a.p625m2.C13587a;
import p602m.p613d.p614a.p625m2.C13588b;
import p602m.p613d.p627b.C13697f;
import p602m.p613d.p662f.p663a.C13971b;
import p602m.p613d.p662f.p663a.C13974e;
import p602m.p613d.p662f.p664b.p665a.C13985c;
import p602m.p613d.p662f.p681d.p682a.C14068a;

/* renamed from: m.d.f.c.b.a.b */
/* compiled from: BCMcElieceCCA2PublicKey */
public class C14043b implements C13697f, PublicKey {

    /* renamed from: c */
    private C13985c f31054c;

    public C14043b(C13985c cVar) {
        this.f31054c = cVar;
    }

    /* renamed from: a */
    public C14068a mo35490a() {
        return this.f31054c.mo35345c();
    }

    /* renamed from: b */
    public int mo35491b() {
        return this.f31054c.mo35346d();
    }

    /* renamed from: c */
    public int mo35492c() {
        return this.f31054c.mo35347e();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C14043b)) {
            return false;
        }
        C14043b bVar = (C14043b) obj;
        if (this.f31054c.mo35346d() == bVar.mo35491b() && this.f31054c.mo35347e() == bVar.mo35492c() && this.f31054c.mo35345c().equals(bVar.mo35490a())) {
            return true;
        }
        return false;
    }

    public String getAlgorithm() {
        return "McEliece-CCA2";
    }

    public byte[] getEncoded() {
        try {
            return new C13588b(new C13587a(C13974e.f30864d), (C13501f) new C13971b(this.f31054c.mo35346d(), this.f31054c.mo35347e(), this.f31054c.mo35345c(), C14048g.m44352a(this.f31054c.mo35338b()))).mo34828d();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return ((this.f31054c.mo35346d() + (this.f31054c.mo35347e() * 37)) * 37) + this.f31054c.mo35345c().hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("McEliecePublicKey:\n");
        sb.append(" length of the code         : ");
        sb.append(this.f31054c.mo35346d());
        String str = "\n";
        sb.append(str);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        sb3.append(" error correction capability: ");
        sb3.append(this.f31054c.mo35347e());
        sb3.append(str);
        String sb4 = sb3.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(sb4);
        sb5.append(" generator matrix           : ");
        sb5.append(this.f31054c.mo35345c().toString());
        return sb5.toString();
    }
}
