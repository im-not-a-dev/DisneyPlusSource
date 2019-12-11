package p602m.p613d.p614a.p626n2;

import p602m.p613d.p614a.C13484b1;
import p602m.p613d.p614a.C13589n;
import p602m.p613d.p614a.C13630p;
import p602m.p613d.p614a.C13643t;
import p602m.p613d.p653e.p654a.C13806d;
import p602m.p613d.p653e.p654a.C13816g;
import p602m.p613d.p683g.C14079a;

/* renamed from: m.d.a.n2.g */
/* compiled from: X9ECPoint */
public class C13621g extends C13589n {

    /* renamed from: U */
    private C13806d f30285U;

    /* renamed from: V */
    private C13816g f30286V;

    /* renamed from: c */
    private final C13630p f30287c;

    public C13621g(C13816g gVar) {
        this(gVar, false);
    }

    /* renamed from: a */
    public C13643t mo34785a() {
        return this.f30287c;
    }

    /* renamed from: e */
    public synchronized C13816g mo34841e() {
        if (this.f30286V == null) {
            this.f30286V = this.f30285U.mo35067a(this.f30287c.mo34797i()).mo35161r();
        }
        return this.f30286V;
    }

    public C13621g(C13816g gVar, boolean z) {
        this.f30286V = gVar.mo35161r();
        this.f30287c = new C13484b1(gVar.mo35136a(z));
    }

    public C13621g(C13806d dVar, byte[] bArr) {
        this.f30285U = dVar;
        this.f30287c = new C13484b1(C14079a.m44450a(bArr));
    }

    public C13621g(C13806d dVar, C13630p pVar) {
        this(dVar, pVar.mo34797i());
    }
}
