package p602m.p613d.p614a;

import java.io.IOException;
import java.util.Enumeration;

/* renamed from: m.d.a.h1 */
/* compiled from: DERSet */
public class C13516h1 extends C13652w {

    /* renamed from: V */
    private int f30104V = -1;

    public C13516h1() {
    }

    /* renamed from: m */
    private int m41628m() throws IOException {
        if (this.f30104V < 0) {
            int i = 0;
            Enumeration i2 = mo34881i();
            while (i2.hasMoreElements()) {
                i += ((C13501f) i2.nextElement()).mo34785a().mo34769g().mo34764e();
            }
            this.f30104V = i;
        }
        return this.f30104V;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34762a(C13636r rVar) throws IOException {
        C13636r a = rVar.mo34789a();
        int m = m41628m();
        rVar.mo34859a(49);
        rVar.mo34866b(m);
        Enumeration i = mo34881i();
        while (i.hasMoreElements()) {
            a.mo34790a((C13501f) i.nextElement());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo34764e() throws IOException {
        int m = m41628m();
        return C13485b2.m41537a(m) + 1 + m;
    }

    C13516h1(C13508g gVar, boolean z) {
        super(gVar, z);
    }
}
