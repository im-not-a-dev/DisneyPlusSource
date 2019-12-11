package p602m.p613d.p662f.p671c.p673b.p679f;

import java.io.IOException;
import java.security.PrivateKey;
import p602m.p613d.p614a.C13626o;
import p602m.p613d.p614a.p621i2.C13521a;
import p602m.p613d.p614a.p625m2.C13587a;
import p602m.p613d.p662f.p663a.C13974e;
import p602m.p613d.p662f.p663a.C13979j;
import p602m.p613d.p662f.p663a.C13980k;
import p602m.p613d.p662f.p663a.C13981l;
import p602m.p613d.p662f.p664b.p670e.C13997b;
import p602m.p613d.p662f.p664b.p670e.C14017o;
import p602m.p613d.p662f.p664b.p670e.C14018p;
import p602m.p613d.p662f.p664b.p670e.C14018p.C14020b;
import p602m.p613d.p662f.p664b.p670e.C14035y;
import p602m.p613d.p662f.p671c.p672a.C14041f;
import p602m.p613d.p683g.C14079a;

/* renamed from: m.d.f.c.b.f.a */
/* compiled from: BCXMSSMTPrivateKey */
public class C14059a implements PrivateKey, C14041f {

    /* renamed from: U */
    private final C14018p f31073U;

    /* renamed from: c */
    private final C13626o f31074c;

    public C14059a(C13521a aVar) throws IOException {
        C13979j a = C13979j.m44085a(aVar.mo34802e().mo34823f());
        this.f31074c = a.mo35329g().mo34822e();
        C13981l a2 = C13981l.m44091a(aVar.mo34803f());
        try {
            C14020b bVar = new C14020b(new C14017o(a.mo35327e(), a.mo35328f(), C14063e.m44375a(this.f31074c)));
            bVar.mo35440a((long) a2.mo35331f());
            bVar.mo35446d(a2.mo35335j());
            bVar.mo35445c(a2.mo35334i());
            bVar.mo35442a(a2.mo35332g());
            bVar.mo35444b(a2.mo35333h());
            if (a2.mo35330e() != null) {
                bVar.mo35441a((C13997b) C14035y.m44325b(a2.mo35330e()));
            }
            this.f31073U = bVar.mo35443a();
        } catch (ClassNotFoundException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("ClassNotFoundException processing BDS state: ");
            sb.append(e.getMessage());
            throw new IOException(sb.toString());
        }
    }

    /* renamed from: a */
    private C13980k m44373a() {
        byte[] c = this.f31073U.mo35439c();
        int b = this.f31073U.mo35438b().mo35432b();
        int c2 = this.f31073U.mo35438b().mo35433c();
        int i = (c2 + 7) / 8;
        int a = (int) C14035y.m44317a(c, 0, i);
        if (C14035y.m44319a(c2, (long) a)) {
            int i2 = i + 0;
            byte[] b2 = C14035y.m44327b(c, i2, b);
            int i3 = i2 + b;
            byte[] b3 = C14035y.m44327b(c, i3, b);
            int i4 = i3 + b;
            byte[] b4 = C14035y.m44327b(c, i4, b);
            int i5 = i4 + b;
            byte[] b5 = C14035y.m44327b(c, i5, b);
            int i6 = i5 + b;
            C13980k kVar = new C13980k(a, b2, b3, b4, b5, C14035y.m44327b(c, i6, c.length - i6));
            return kVar;
        }
        throw new IllegalArgumentException("index out of bounds");
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C14059a)) {
            return false;
        }
        C14059a aVar = (C14059a) obj;
        if (!this.f31074c.equals(aVar.f31074c) || !C14079a.m44446a(this.f31073U.mo35439c(), aVar.f31073U.mo35439c())) {
            z = false;
        }
        return z;
    }

    public String getAlgorithm() {
        return "XMSSMT";
    }

    public byte[] getEncoded() {
        try {
            return new C13521a(new C13587a(C13974e.f30868h, new C13979j(this.f31073U.mo35438b().mo35433c(), this.f31073U.mo35438b().mo35434d(), new C13587a(this.f31074c))), m44373a()).mo34828d();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return this.f31074c.hashCode() + (C14079a.m44457b(this.f31073U.mo35439c()) * 37);
    }
}
