package p602m.p613d.p614a;

import java.io.IOException;
import p602m.p613d.p683g.C14079a;
import p602m.p613d.p683g.C14088i;

/* renamed from: m.d.a.h */
/* compiled from: ASN1Enumerated */
public class C13514h extends C13643t {

    /* renamed from: U */
    private static C13514h[] f30101U = new C13514h[12];

    /* renamed from: c */
    private final byte[] f30102c;

    public C13514h(byte[] bArr) {
        if (C14088i.m44484b("org.spongycastle.asn1.allow_unsafe_integer") || !C13565l.m41716b(bArr)) {
            this.f30102c = C14079a.m44450a(bArr);
            return;
        }
        throw new IllegalArgumentException("malformed enumerated");
    }

    /* renamed from: b */
    static C13514h m41620b(byte[] bArr) {
        if (bArr.length > 1) {
            return new C13514h(bArr);
        }
        if (bArr.length != 0) {
            byte b = bArr[0] & 255;
            C13514h[] hVarArr = f30101U;
            if (b >= hVarArr.length) {
                return new C13514h(C14079a.m44450a(bArr));
            }
            C13514h hVar = hVarArr[b];
            if (hVar == null) {
                hVar = new C13514h(C14079a.m44450a(bArr));
                hVarArr[b] = hVar;
            }
            return hVar;
        }
        throw new IllegalArgumentException("ENUMERATED has zero length");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34762a(C13636r rVar) throws IOException {
        rVar.mo34862a(10, this.f30102c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo34764e() {
        return C13485b2.m41537a(this.f30102c.length) + 1 + this.f30102c.length;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo34765f() {
        return false;
    }

    public int hashCode() {
        return C14079a.m44457b(this.f30102c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo34763a(C13643t tVar) {
        if (!(tVar instanceof C13514h)) {
            return false;
        }
        return C14079a.m44446a(this.f30102c, ((C13514h) tVar).f30102c);
    }
}
