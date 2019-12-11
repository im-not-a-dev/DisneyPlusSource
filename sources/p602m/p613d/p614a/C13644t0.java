package p602m.p613d.p614a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: m.d.a.t0 */
/* compiled from: DERExternal */
public class C13644t0 extends C13643t {

    /* renamed from: U */
    private C13565l f30349U;

    /* renamed from: V */
    private C13643t f30350V;

    /* renamed from: W */
    private int f30351W;

    /* renamed from: X */
    private C13643t f30352X;

    /* renamed from: c */
    private C13626o f30353c;

    public C13644t0(C13508g gVar) {
        int i = 0;
        C13643t a = m41905a(gVar, 0);
        if (a instanceof C13626o) {
            this.f30353c = (C13626o) a;
            a = m41905a(gVar, 1);
            i = 1;
        }
        if (a instanceof C13565l) {
            this.f30349U = (C13565l) a;
            i++;
            a = m41905a(gVar, i);
        }
        if (!(a instanceof C13479a0)) {
            this.f30350V = a;
            i++;
            a = m41905a(gVar, i);
        }
        if (gVar.mo34794a() != i + 1) {
            throw new IllegalArgumentException("input vector too large");
        } else if (a instanceof C13479a0) {
            C13479a0 a0Var = (C13479a0) a;
            m41906a(a0Var.mo34772j());
            this.f30352X = a0Var.mo34771i();
        } else {
            throw new IllegalArgumentException("No tagged object found in vector. Structure doesn't seem to be of type External");
        }
    }

    /* renamed from: a */
    private C13643t m41905a(C13508g gVar, int i) {
        if (gVar.mo34794a() > i) {
            return gVar.mo34795a(i).mo34785a();
        }
        throw new IllegalArgumentException("too few objects in input vector");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo34764e() throws IOException {
        return mo34828d().length;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo34765f() {
        return true;
    }

    public int hashCode() {
        C13626o oVar = this.f30353c;
        int hashCode = oVar != null ? oVar.hashCode() : 0;
        C13565l lVar = this.f30349U;
        if (lVar != null) {
            hashCode ^= lVar.hashCode();
        }
        C13643t tVar = this.f30350V;
        if (tVar != null) {
            hashCode ^= tVar.hashCode();
        }
        return hashCode ^ this.f30352X.hashCode();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34762a(C13636r rVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C13626o oVar = this.f30353c;
        String str = "DER";
        if (oVar != null) {
            byteArrayOutputStream.write(oVar.mo34827a(str));
        }
        C13565l lVar = this.f30349U;
        if (lVar != null) {
            byteArrayOutputStream.write(lVar.mo34827a(str));
        }
        C13643t tVar = this.f30350V;
        if (tVar != null) {
            byteArrayOutputStream.write(tVar.mo34827a(str));
        }
        byteArrayOutputStream.write(new C13528k1(true, this.f30351W, this.f30352X).mo34827a(str));
        rVar.mo34861a(32, 8, byteArrayOutputStream.toByteArray());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo34763a(C13643t tVar) {
        if (!(tVar instanceof C13644t0)) {
            return false;
        }
        if (this == tVar) {
            return true;
        }
        C13644t0 t0Var = (C13644t0) tVar;
        C13626o oVar = this.f30353c;
        if (oVar != null) {
            C13626o oVar2 = t0Var.f30353c;
            if (oVar2 == null || !oVar2.equals(oVar)) {
                return false;
            }
        }
        C13565l lVar = this.f30349U;
        if (lVar != null) {
            C13565l lVar2 = t0Var.f30349U;
            if (lVar2 == null || !lVar2.equals(lVar)) {
                return false;
            }
        }
        C13643t tVar2 = this.f30350V;
        if (tVar2 != null) {
            C13643t tVar3 = t0Var.f30350V;
            if (tVar3 == null || !tVar3.equals(tVar2)) {
                return false;
            }
        }
        return this.f30352X.equals(t0Var.f30352X);
    }

    /* renamed from: a */
    private void m41906a(int i) {
        if (i < 0 || i > 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("invalid encoding value: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        this.f30351W = i;
    }
}
