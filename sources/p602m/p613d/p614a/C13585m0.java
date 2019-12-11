package p602m.p613d.p614a;

import java.io.IOException;
import java.util.Enumeration;

/* renamed from: m.d.a.m0 */
/* compiled from: BERTaggedObject */
public class C13585m0 extends C13479a0 {
    public C13585m0(boolean z, int i, C13501f fVar) {
        super(z, i, fVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34762a(C13636r rVar) throws IOException {
        Enumeration enumeration;
        rVar.mo34860a(160, this.f30017c);
        rVar.mo34859a(128);
        if (!this.f30014U) {
            if (!this.f30015V) {
                C13501f fVar = this.f30016W;
                if (fVar instanceof C13630p) {
                    if (fVar instanceof C13509g0) {
                        enumeration = ((C13509g0) fVar).mo34798j();
                    } else {
                        enumeration = new C13509g0(((C13630p) fVar).mo34797i()).mo34798j();
                    }
                } else if (fVar instanceof C13646u) {
                    enumeration = ((C13646u) fVar).mo34871i();
                } else if (fVar instanceof C13652w) {
                    enumeration = ((C13652w) fVar).mo34881i();
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("not implemented: ");
                    sb.append(this.f30016W.getClass().getName());
                    throw new C13518i(sb.toString());
                }
                while (enumeration.hasMoreElements()) {
                    rVar.mo34790a((C13501f) enumeration.nextElement());
                }
            } else {
                rVar.mo34790a(this.f30016W);
            }
        }
        rVar.mo34859a(0);
        rVar.mo34859a(0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo34764e() throws IOException {
        int b;
        if (this.f30014U) {
            return C13485b2.m41539b(this.f30017c) + 1;
        }
        int e = this.f30016W.mo34785a().mo34764e();
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
