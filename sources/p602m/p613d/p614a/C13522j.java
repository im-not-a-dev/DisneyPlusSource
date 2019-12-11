package p602m.p613d.p614a;

import java.io.IOException;
import p602m.p613d.p683g.C14079a;

/* renamed from: m.d.a.j */
/* compiled from: ASN1GeneralizedTime */
public class C13522j extends C13643t {

    /* renamed from: c */
    private byte[] f30111c;

    C13522j(byte[] bArr) {
        this.f30111c = bArr;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34762a(C13636r rVar) throws IOException {
        rVar.mo34862a(24, this.f30111c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo34764e() {
        int length = this.f30111c.length;
        return C13485b2.m41537a(length) + 1 + length;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo34765f() {
        return false;
    }

    public int hashCode() {
        return C14079a.m44457b(this.f30111c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo34763a(C13643t tVar) {
        if (!(tVar instanceof C13522j)) {
            return false;
        }
        return C14079a.m44446a(this.f30111c, ((C13522j) tVar).f30111c);
    }
}
