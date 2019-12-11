package p602m.p613d.p662f.p671c.p673b.p674a;

import java.io.IOException;
import java.security.PublicKey;
import p602m.p613d.p614a.C13501f;
import p602m.p613d.p614a.p625m2.C13587a;
import p602m.p613d.p614a.p625m2.C13588b;
import p602m.p613d.p662f.p663a.C13973d;
import p602m.p613d.p662f.p663a.C13974e;
import p602m.p613d.p662f.p664b.p665a.C13989g;
import p602m.p613d.p662f.p681d.p682a.C14068a;

/* renamed from: m.d.f.c.b.a.d */
/* compiled from: BCMcEliecePublicKey */
public class C14045d implements PublicKey {

    /* renamed from: c */
    private C13989g f31056c;

    public C14045d(C13989g gVar) {
        this.f31056c = gVar;
    }

    /* renamed from: a */
    public C14068a mo35511a() {
        return this.f31056c.mo35355b();
    }

    /* renamed from: b */
    public int mo35512b() {
        return this.f31056c.mo35356c();
    }

    /* renamed from: c */
    public int mo35513c() {
        return this.f31056c.mo35357d();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C14045d)) {
            return false;
        }
        C14045d dVar = (C14045d) obj;
        if (this.f31056c.mo35356c() == dVar.mo35512b() && this.f31056c.mo35357d() == dVar.mo35513c() && this.f31056c.mo35355b().equals(dVar.mo35511a())) {
            return true;
        }
        return false;
    }

    public String getAlgorithm() {
        return "McEliece";
    }

    public byte[] getEncoded() {
        try {
            return new C13588b(new C13587a(C13974e.f30863c), (C13501f) new C13973d(this.f31056c.mo35356c(), this.f31056c.mo35357d(), this.f31056c.mo35355b())).mo34828d();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return ((this.f31056c.mo35356c() + (this.f31056c.mo35357d() * 37)) * 37) + this.f31056c.mo35355b().hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("McEliecePublicKey:\n");
        sb.append(" length of the code         : ");
        sb.append(this.f31056c.mo35356c());
        String str = "\n";
        sb.append(str);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        sb3.append(" error correction capability: ");
        sb3.append(this.f31056c.mo35357d());
        sb3.append(str);
        String sb4 = sb3.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(sb4);
        sb5.append(" generator matrix           : ");
        sb5.append(this.f31056c.mo35355b());
        return sb5.toString();
    }
}
