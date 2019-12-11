package p602m.p613d.p614a;

import java.io.IOException;
import p602m.p613d.p683g.C14079a;
import p602m.p613d.p683g.C14090j;

/* renamed from: m.d.a.w0 */
/* compiled from: DERGeneralString */
public class C13653w0 extends C13643t implements C13661z {

    /* renamed from: c */
    private final byte[] f30364c;

    C13653w0(byte[] bArr) {
        this.f30364c = bArr;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34762a(C13636r rVar) throws IOException {
        rVar.mo34862a(27, this.f30364c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo34764e() {
        return C13485b2.m41537a(this.f30364c.length) + 1 + this.f30364c.length;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo34765f() {
        return false;
    }

    public int hashCode() {
        return C14079a.m44457b(this.f30364c);
    }

    /* renamed from: i */
    public String mo34887i() {
        return C14090j.m44489b(this.f30364c);
    }

    public String toString() {
        return mo34887i();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo34763a(C13643t tVar) {
        if (!(tVar instanceof C13653w0)) {
            return false;
        }
        return C14079a.m44446a(this.f30364c, ((C13653w0) tVar).f30364c);
    }
}
