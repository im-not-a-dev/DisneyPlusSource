package p602m.p613d.p614a;

import java.io.IOException;
import p602m.p613d.p683g.C14079a;
import p602m.p613d.p683g.C14090j;

/* renamed from: m.d.a.l1 */
/* compiled from: DERUTF8String */
public class C13567l1 extends C13643t implements C13661z {

    /* renamed from: c */
    private final byte[] f30199c;

    C13567l1(byte[] bArr) {
        this.f30199c = bArr;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo34763a(C13643t tVar) {
        if (!(tVar instanceof C13567l1)) {
            return false;
        }
        return C14079a.m44446a(this.f30199c, ((C13567l1) tVar).f30199c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo34764e() throws IOException {
        return C13485b2.m41537a(this.f30199c.length) + 1 + this.f30199c.length;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo34765f() {
        return false;
    }

    public int hashCode() {
        return C14079a.m44457b(this.f30199c);
    }

    /* renamed from: i */
    public String mo34816i() {
        return C14090j.m44490c(this.f30199c);
    }

    public String toString() {
        return mo34816i();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34762a(C13636r rVar) throws IOException {
        rVar.mo34862a(12, this.f30199c);
    }
}
