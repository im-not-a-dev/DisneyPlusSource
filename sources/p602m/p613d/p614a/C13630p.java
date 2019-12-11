package p602m.p613d.p614a;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import p602m.p613d.p683g.C14079a;
import p602m.p613d.p683g.C14090j;
import p602m.p613d.p683g.p684k.C14097f;

/* renamed from: m.d.a.p */
/* compiled from: ASN1OctetString */
public abstract class C13630p extends C13643t implements C13633q {

    /* renamed from: c */
    byte[] f30339c;

    public C13630p(byte[] bArr) {
        if (bArr != null) {
            this.f30339c = bArr;
            return;
        }
        throw new NullPointerException("string cannot be null");
    }

    /* renamed from: a */
    public static C13630p m41857a(C13479a0 a0Var, boolean z) {
        C13643t i = a0Var.mo34771i();
        if (z || (i instanceof C13630p)) {
            return m41856a((Object) i);
        }
        return C13509g0.m41604a(C13646u.m41915a((Object) i));
    }

    /* renamed from: b */
    public C13643t mo34768b() {
        mo34785a();
        return this;
    }

    /* renamed from: c */
    public InputStream mo34786c() {
        return new ByteArrayInputStream(this.f30339c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public C13643t mo34769g() {
        return new C13484b1(this.f30339c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public C13643t mo34770h() {
        return new C13484b1(this.f30339c);
    }

    public int hashCode() {
        return C14079a.m44457b(mo34797i());
    }

    /* renamed from: i */
    public byte[] mo34797i() {
        return this.f30339c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("#");
        sb.append(C14090j.m44489b(C14097f.m44508a(this.f30339c)));
        return sb.toString();
    }

    /* renamed from: a */
    public static C13630p m41856a(Object obj) {
        if (obj == null || (obj instanceof C13630p)) {
            return (C13630p) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return m41856a((Object) C13643t.m41897a((byte[]) obj));
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("failed to construct OCTET STRING from byte[]: ");
                sb.append(e.getMessage());
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            if (obj instanceof C13501f) {
                C13643t a = ((C13501f) obj).mo34785a();
                if (a instanceof C13630p) {
                    return (C13630p) a;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("illegal object in getInstance: ");
            sb2.append(obj.getClass().getName());
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo34763a(C13643t tVar) {
        if (!(tVar instanceof C13630p)) {
            return false;
        }
        return C14079a.m44446a(this.f30339c, ((C13630p) tVar).f30339c);
    }
}
