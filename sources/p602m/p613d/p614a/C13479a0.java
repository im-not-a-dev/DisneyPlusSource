package p602m.p613d.p614a;

import java.io.IOException;

/* renamed from: m.d.a.a0 */
/* compiled from: ASN1TaggedObject */
public abstract class C13479a0 extends C13643t implements C13483b0 {

    /* renamed from: U */
    boolean f30014U = false;

    /* renamed from: V */
    boolean f30015V = true;

    /* renamed from: W */
    C13501f f30016W = null;

    /* renamed from: c */
    int f30017c;

    public C13479a0(boolean z, int i, C13501f fVar) {
        if (fVar instanceof C13496e) {
            this.f30015V = true;
        } else {
            this.f30015V = z;
        }
        this.f30017c = i;
        if (this.f30015V) {
            this.f30016W = fVar;
            return;
        }
        boolean z2 = fVar.mo34785a() instanceof C13652w;
        this.f30016W = fVar;
    }

    /* renamed from: a */
    public static C13479a0 m41519a(Object obj) {
        if (obj == null || (obj instanceof C13479a0)) {
            return (C13479a0) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return m41519a((Object) C13643t.m41897a((byte[]) obj));
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("failed to construct tagged object from byte[]: ");
                sb.append(e.getMessage());
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("unknown object in getInstance: ");
            sb2.append(obj.getClass().getName());
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: b */
    public C13643t mo34768b() {
        mo34785a();
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public C13643t mo34769g() {
        return new C13528k1(this.f30015V, this.f30017c, this.f30016W);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public C13643t mo34770h() {
        return new C13645t1(this.f30015V, this.f30017c, this.f30016W);
    }

    public int hashCode() {
        int i = this.f30017c;
        C13501f fVar = this.f30016W;
        return fVar != null ? i ^ fVar.hashCode() : i;
    }

    /* renamed from: i */
    public C13643t mo34771i() {
        C13501f fVar = this.f30016W;
        if (fVar != null) {
            return fVar.mo34785a();
        }
        return null;
    }

    /* renamed from: j */
    public int mo34772j() {
        return this.f30017c;
    }

    /* renamed from: k */
    public boolean mo34773k() {
        return this.f30015V;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(this.f30017c);
        sb.append("]");
        sb.append(this.f30016W);
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo34763a(C13643t tVar) {
        if (!(tVar instanceof C13479a0)) {
            return false;
        }
        C13479a0 a0Var = (C13479a0) tVar;
        if (this.f30017c != a0Var.f30017c || this.f30014U != a0Var.f30014U || this.f30015V != a0Var.f30015V) {
            return false;
        }
        C13501f fVar = this.f30016W;
        if (fVar == null) {
            if (a0Var.f30016W != null) {
                return false;
            }
        } else if (!fVar.mo34785a().equals(a0Var.f30016W.mo34785a())) {
            return false;
        }
        return true;
    }
}
