package p602m.p613d.p614a;

import java.io.IOException;

/* renamed from: m.d.a.t1 */
/* compiled from: DLTaggedObject */
public class C13645t1 extends C13479a0 {

    /* renamed from: X */
    private static final byte[] f30354X = new byte[0];

    public C13645t1(boolean z, int i, C13501f fVar) {
        super(z, i, fVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34762a(C13636r rVar) throws IOException {
        int i = 160;
        if (!this.f30014U) {
            C13643t h = this.f30016W.mo34785a().mo34770h();
            if (this.f30015V) {
                rVar.mo34860a(160, this.f30017c);
                rVar.mo34866b(h.mo34764e());
                rVar.mo34790a((C13501f) h);
                return;
            }
            if (!h.mo34765f()) {
                i = 128;
            }
            rVar.mo34860a(i, this.f30017c);
            rVar.mo34863a(h);
            return;
        }
        rVar.mo34861a(160, this.f30017c, f30354X);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo34764e() throws IOException {
        int b;
        if (this.f30014U) {
            return C13485b2.m41539b(this.f30017c) + 1;
        }
        int e = this.f30016W.mo34785a().mo34770h().mo34764e();
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
        return this.f30016W.mo34785a().mo34770h().mo34765f();
    }
}
