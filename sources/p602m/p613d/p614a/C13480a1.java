package p602m.p613d.p614a;

import java.io.IOException;
import p602m.p613d.p683g.C14079a;
import p602m.p613d.p683g.C14090j;

/* renamed from: m.d.a.a1 */
/* compiled from: DERNumericString */
public class C13480a1 extends C13643t implements C13661z {

    /* renamed from: c */
    private final byte[] f30018c;

    C13480a1(byte[] bArr) {
        this.f30018c = bArr;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34762a(C13636r rVar) throws IOException {
        rVar.mo34862a(18, this.f30018c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo34764e() {
        return C13485b2.m41537a(this.f30018c.length) + 1 + this.f30018c.length;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo34765f() {
        return false;
    }

    public int hashCode() {
        return C14079a.m44457b(this.f30018c);
    }

    /* renamed from: i */
    public String mo34775i() {
        return C14090j.m44489b(this.f30018c);
    }

    public String toString() {
        return mo34775i();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo34763a(C13643t tVar) {
        if (!(tVar instanceof C13480a1)) {
            return false;
        }
        return C14079a.m44446a(this.f30018c, ((C13480a1) tVar).f30018c);
    }
}
