package p602m.p613d.p614a;

import java.io.IOException;

/* renamed from: m.d.a.k1 */
/* compiled from: DERTaggedObject */
public class C13528k1 extends C13479a0 {

    /* renamed from: X */
    private static final byte[] f30124X = new byte[0];

    public C13528k1(boolean z, int i, C13501f fVar) {
        super(z, i, fVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34762a(C13636r rVar) throws IOException {
        int i = 160;
        if (!this.f30014U) {
            C13643t g = this.f30016W.mo34785a().mo34769g();
            if (this.f30015V) {
                rVar.mo34860a(160, this.f30017c);
                rVar.mo34866b(g.mo34764e());
                rVar.mo34790a((C13501f) g);
                return;
            }
            if (!g.mo34765f()) {
                i = 128;
            }
            rVar.mo34860a(i, this.f30017c);
            rVar.mo34863a(g);
            return;
        }
        rVar.mo34861a(160, this.f30017c, f30124X);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo34764e() throws IOException {
        int b;
        if (this.f30014U) {
            return C13485b2.m41539b(this.f30017c) + 1;
        }
        int e = this.f30016W.mo34785a().mo34769g().mo34764e();
        if (this.f30015V) {
            b = C13485b2.m41539b(this.f30017c) + C13485b2.m41537a(e);
        } else {
            e--;
            b = C13485b2.m41539b(this.f30017c);
        }
        return b + e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo34765f() {
        if (this.f30014U || this.f30015V) {
            return true;
        }
        return this.f30016W.mo34785a().mo34769g().mo34765f();
    }
}
