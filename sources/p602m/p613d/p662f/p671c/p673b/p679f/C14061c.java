package p602m.p613d.p662f.p671c.p673b.p679f;

import java.io.IOException;
import java.security.PrivateKey;
import p602m.p613d.p614a.C13626o;
import p602m.p613d.p614a.p621i2.C13521a;
import p602m.p613d.p614a.p625m2.C13587a;
import p602m.p613d.p662f.p663a.C13974e;
import p602m.p613d.p662f.p663a.C13978i;
import p602m.p613d.p662f.p663a.C13981l;
import p602m.p613d.p662f.p664b.p670e.C13996a;
import p602m.p613d.p662f.p664b.p670e.C14027u;
import p602m.p613d.p662f.p664b.p670e.C14028v;
import p602m.p613d.p662f.p664b.p670e.C14028v.C14030b;
import p602m.p613d.p662f.p664b.p670e.C14035y;
import p602m.p613d.p662f.p671c.p672a.C14040e;
import p602m.p613d.p683g.C14079a;

/* renamed from: m.d.f.c.b.f.c */
/* compiled from: BCXMSSPrivateKey */
public class C14061c implements PrivateKey, C14040e {

    /* renamed from: U */
    private final C13626o f31077U;

    /* renamed from: c */
    private final C14028v f31078c;

    public C14061c(C13521a aVar) throws IOException {
        C13978i a = C13978i.m44081a(aVar.mo34802e().mo34823f());
        this.f31077U = a.mo35326f().mo34822e();
        C13981l a2 = C13981l.m44091a(aVar.mo34803f());
        try {
            C14030b bVar = new C14030b(new C14027u(a.mo35325e(), C14063e.m44375a(this.f31077U)));
            bVar.mo35465a(a2.mo35331f());
            bVar.mo35471d(a2.mo35335j());
            bVar.mo35470c(a2.mo35334i());
            bVar.mo35467a(a2.mo35332g());
            bVar.mo35469b(a2.mo35333h());
            if (a2.mo35330e() != null) {
                bVar.mo35466a((C13996a) C14035y.m44325b(a2.mo35330e()));
            }
            this.f31078c = bVar.mo35468a();
        } catch (ClassNotFoundException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("ClassNotFoundException processing BDS state: ");
            sb.append(e.getMessage());
            throw new IOException(sb.toString());
        }
    }

    /* renamed from: a */
    private C13981l m44374a() {
        byte[] c = this.f31078c.mo35464c();
        int b = this.f31078c.mo35463b().mo35458b();
        int a = (int) C14035y.m44317a(c, 0, 4);
        if (C14035y.m44319a(this.f31078c.mo35463b().mo35459c(), (long) a)) {
            byte[] b2 = C14035y.m44327b(c, 4, b);
            int i = 4 + b;
            byte[] b3 = C14035y.m44327b(c, i, b);
            int i2 = i + b;
            byte[] b4 = C14035y.m44327b(c, i2, b);
            int i3 = i2 + b;
            byte[] b5 = C14035y.m44327b(c, i3, b);
            int i4 = i3 + b;
            C13981l lVar = new C13981l(a, b2, b3, b4, b5, C14035y.m44327b(c, i4, c.length - i4));
            return lVar;
        }
        throw new IllegalArgumentException("index out of bounds");
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C14061c)) {
            return false;
        }
        C14061c cVar = (C14061c) obj;
        if (!this.f31077U.equals(cVar.f31077U) || !C14079a.m44446a(this.f31078c.mo35464c(), cVar.f31078c.mo35464c())) {
            z = false;
        }
        return z;
    }

    public String getAlgorithm() {
        return "XMSS";
    }

    public byte[] getEncoded() {
        try {
            return new C13521a(new C13587a(C13974e.f30867g, new C13978i(this.f31078c.mo35463b().mo35459c(), new C13587a(this.f31077U))), m44374a()).mo34828d();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return this.f31077U.hashCode() + (C14079a.m44457b(this.f31078c.mo35464c()) * 37);
    }
}
