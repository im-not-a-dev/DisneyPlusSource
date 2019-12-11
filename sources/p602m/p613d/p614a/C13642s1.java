package p602m.p613d.p614a;

import java.io.IOException;
import java.util.Enumeration;

/* renamed from: m.d.a.s1 */
/* compiled from: DLSet */
public class C13642s1 extends C13652w {

    /* renamed from: V */
    private int f30348V = -1;

    public C13642s1() {
    }

    /* renamed from: m */
    private int m41894m() throws IOException {
        if (this.f30348V < 0) {
            int i = 0;
            Enumeration i2 = mo34881i();
            while (i2.hasMoreElements()) {
                i += ((C13501f) i2.nextElement()).mo34785a().mo34770h().mo34764e();
            }
            this.f30348V = i;
        }
        return this.f30348V;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34762a(C13636r rVar) throws IOException {
        C13636r b = rVar.mo34791b();
        int m = m41894m();
        rVar.mo34859a(49);
        rVar.mo34866b(m);
        Enumeration i = mo34881i();
        while (i.hasMoreElements()) {
            b.mo34790a((C13501f) i.nextElement());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo34764e() throws IOException {
        int m = m41894m();
        return C13485b2.m41537a(m) + 1 + m;
    }

    public C13642s1(C13501f fVar) {
        super(fVar);
    }

    public C13642s1(C13508g gVar) {
        super(gVar, false);
    }

    public C13642s1(C13501f[] fVarArr) {
        super(fVarArr, false);
    }
}
