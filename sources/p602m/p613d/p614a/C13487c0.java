package p602m.p613d.p614a;

import java.io.IOException;
import p602m.p613d.p683g.C14079a;
import p602m.p613d.p683g.C14090j;

/* renamed from: m.d.a.c0 */
/* compiled from: ASN1UTCTime */
public class C13487c0 extends C13643t {

    /* renamed from: c */
    private byte[] f30025c;

    C13487c0(byte[] bArr) {
        this.f30025c = bArr;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34762a(C13636r rVar) throws IOException {
        rVar.mo34859a(23);
        int length = this.f30025c.length;
        rVar.mo34866b(length);
        for (int i = 0; i != length; i++) {
            rVar.mo34859a((int) this.f30025c[i]);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo34764e() {
        int length = this.f30025c.length;
        return C13485b2.m41537a(length) + 1 + length;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo34765f() {
        return false;
    }

    public int hashCode() {
        return C14079a.m44457b(this.f30025c);
    }

    public String toString() {
        return C14090j.m44489b(this.f30025c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo34763a(C13643t tVar) {
        if (!(tVar instanceof C13487c0)) {
            return false;
        }
        return C14079a.m44446a(this.f30025c, ((C13487c0) tVar).f30025c);
    }
}
