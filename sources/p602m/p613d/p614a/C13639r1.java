package p602m.p613d.p614a;

import java.io.IOException;
import java.util.Enumeration;

/* renamed from: m.d.a.r1 */
/* compiled from: DLSequence */
public class C13639r1 extends C13646u {

    /* renamed from: U */
    private int f30346U = -1;

    public C13639r1() {
    }

    /* renamed from: l */
    private int m41887l() throws IOException {
        if (this.f30346U < 0) {
            int i = 0;
            Enumeration i2 = mo34871i();
            while (i2.hasMoreElements()) {
                i += ((C13501f) i2.nextElement()).mo34785a().mo34770h().mo34764e();
            }
            this.f30346U = i;
        }
        return this.f30346U;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34762a(C13636r rVar) throws IOException {
        C13636r b = rVar.mo34791b();
        int l = m41887l();
        rVar.mo34859a(48);
        rVar.mo34866b(l);
        Enumeration i = mo34871i();
        while (i.hasMoreElements()) {
            b.mo34790a((C13501f) i.nextElement());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo34764e() throws IOException {
        int l = m41887l();
        return C13485b2.m41537a(l) + 1 + l;
    }

    public C13639r1(C13508g gVar) {
        super(gVar);
    }
}
