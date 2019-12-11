package p602m.p613d.p614a;

import java.io.IOException;
import p602m.p613d.p683g.C14079a;

/* renamed from: m.d.a.a */
/* compiled from: ASN1ApplicationSpecific */
public abstract class C13478a extends C13643t {

    /* renamed from: U */
    protected final int f30011U;

    /* renamed from: V */
    protected final byte[] f30012V;

    /* renamed from: c */
    protected final boolean f30013c;

    C13478a(boolean z, int i, byte[] bArr) {
        this.f30013c = z;
        this.f30011U = i;
        this.f30012V = C14079a.m44450a(bArr);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34762a(C13636r rVar) throws IOException {
        rVar.mo34861a(this.f30013c ? 96 : 64, this.f30011U, this.f30012V);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo34764e() throws IOException {
        return C13485b2.m41539b(this.f30011U) + C13485b2.m41537a(this.f30012V.length) + this.f30012V.length;
    }

    /* renamed from: f */
    public boolean mo34765f() {
        return this.f30013c;
    }

    public int hashCode() {
        return (this.f30013c ^ this.f30011U) ^ C14079a.m44457b(this.f30012V) ? 1 : 0;
    }

    /* renamed from: i */
    public int mo34767i() {
        return this.f30011U;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo34763a(C13643t tVar) {
        boolean z = false;
        if (!(tVar instanceof C13478a)) {
            return false;
        }
        C13478a aVar = (C13478a) tVar;
        if (this.f30013c == aVar.f30013c && this.f30011U == aVar.f30011U && C14079a.m44446a(this.f30012V, aVar.f30012V)) {
            z = true;
        }
        return z;
    }
}
