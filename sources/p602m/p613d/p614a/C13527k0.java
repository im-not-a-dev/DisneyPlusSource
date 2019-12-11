package p602m.p613d.p614a;

import java.io.IOException;
import java.util.Enumeration;

/* renamed from: m.d.a.k0 */
/* compiled from: BERSet */
public class C13527k0 extends C13652w {
    public C13527k0() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34762a(C13636r rVar) throws IOException {
        rVar.mo34859a(49);
        rVar.mo34859a(128);
        Enumeration i = mo34881i();
        while (i.hasMoreElements()) {
            rVar.mo34790a((C13501f) i.nextElement());
        }
        rVar.mo34859a(0);
        rVar.mo34859a(0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo34764e() throws IOException {
        Enumeration i = mo34881i();
        int i2 = 0;
        while (i.hasMoreElements()) {
            i2 += ((C13501f) i.nextElement()).mo34785a().mo34764e();
        }
        return i2 + 2 + 2;
    }

    public C13527k0(C13501f fVar) {
        super(fVar);
    }

    public C13527k0(C13508g gVar) {
        super(gVar, false);
    }

    public C13527k0(C13501f[] fVarArr) {
        super(fVarArr, false);
    }
}
