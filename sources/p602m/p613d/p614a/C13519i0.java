package p602m.p613d.p614a;

import java.io.IOException;
import java.util.Enumeration;

/* renamed from: m.d.a.i0 */
/* compiled from: BERSequence */
public class C13519i0 extends C13646u {
    public C13519i0() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34762a(C13636r rVar) throws IOException {
        rVar.mo34859a(48);
        rVar.mo34859a(128);
        Enumeration i = mo34871i();
        while (i.hasMoreElements()) {
            rVar.mo34790a((C13501f) i.nextElement());
        }
        rVar.mo34859a(0);
        rVar.mo34859a(0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo34764e() throws IOException {
        Enumeration i = mo34871i();
        int i2 = 0;
        while (i.hasMoreElements()) {
            i2 += ((C13501f) i.nextElement()).mo34785a().mo34764e();
        }
        return i2 + 2 + 2;
    }

    public C13519i0(C13508g gVar) {
        super(gVar);
    }
}
