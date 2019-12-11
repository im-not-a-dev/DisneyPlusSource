package p602m.p613d.p614a;

import java.io.IOException;
import java.util.Enumeration;

/* renamed from: m.d.a.f1 */
/* compiled from: DERSequence */
public class C13503f1 extends C13646u {

    /* renamed from: U */
    private int f30073U = -1;

    public C13503f1() {
    }

    /* renamed from: l */
    private int m41587l() throws IOException {
        if (this.f30073U < 0) {
            int i = 0;
            Enumeration i2 = mo34871i();
            while (i2.hasMoreElements()) {
                i += ((C13501f) i2.nextElement()).mo34785a().mo34769g().mo34764e();
            }
            this.f30073U = i;
        }
        return this.f30073U;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34762a(C13636r rVar) throws IOException {
        C13636r a = rVar.mo34789a();
        int l = m41587l();
        rVar.mo34859a(48);
        rVar.mo34866b(l);
        Enumeration i = mo34871i();
        while (i.hasMoreElements()) {
            a.mo34790a((C13501f) i.nextElement());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo34764e() throws IOException {
        int l = m41587l();
        return C13485b2.m41537a(l) + 1 + l;
    }

    public C13503f1(C13508g gVar) {
        super(gVar);
    }
}
