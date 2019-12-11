package p602m.p613d.p614a;

import java.io.IOException;
import p602m.p613d.p683g.C14079a;

/* renamed from: m.d.a.n1 */
/* compiled from: DERVideotexString */
public class C13591n1 extends C13643t implements C13661z {

    /* renamed from: c */
    private final byte[] f30246c;

    public C13591n1(byte[] bArr) {
        this.f30246c = C14079a.m44450a(bArr);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34762a(C13636r rVar) throws IOException {
        rVar.mo34862a(21, this.f30246c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo34764e() {
        return C13485b2.m41537a(this.f30246c.length) + 1 + this.f30246c.length;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo34765f() {
        return false;
    }

    public int hashCode() {
        return C14079a.m44457b(this.f30246c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo34763a(C13643t tVar) {
        if (!(tVar instanceof C13591n1)) {
            return false;
        }
        return C14079a.m44446a(this.f30246c, ((C13591n1) tVar).f30246c);
    }
}
