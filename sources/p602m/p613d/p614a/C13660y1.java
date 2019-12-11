package p602m.p613d.p614a;

import java.io.IOException;
import java.util.Enumeration;

/* renamed from: m.d.a.y1 */
/* compiled from: LazyEncodedSequence */
class C13660y1 extends C13646u {

    /* renamed from: U */
    private byte[] f30376U;

    C13660y1(byte[] bArr) throws IOException {
        this.f30376U = bArr;
    }

    /* renamed from: l */
    private void m41966l() {
        C13657x1 x1Var = new C13657x1(this.f30376U);
        while (x1Var.hasMoreElements()) {
            this.f30355c.addElement(x1Var.nextElement());
        }
        this.f30376U = null;
    }

    /* renamed from: a */
    public synchronized C13501f mo34870a(int i) {
        if (this.f30376U != null) {
            m41966l();
        }
        return super.mo34870a(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo34764e() throws IOException {
        byte[] bArr = this.f30376U;
        if (bArr != null) {
            return C13485b2.m41537a(bArr.length) + 1 + this.f30376U.length;
        }
        return super.mo34770h().mo34764e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public C13643t mo34769g() {
        if (this.f30376U != null) {
            m41966l();
        }
        return super.mo34769g();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public C13643t mo34770h() {
        if (this.f30376U != null) {
            m41966l();
        }
        return super.mo34770h();
    }

    /* renamed from: i */
    public synchronized Enumeration mo34871i() {
        if (this.f30376U == null) {
            return super.mo34871i();
        }
        return new C13657x1(this.f30376U);
    }

    /* renamed from: j */
    public synchronized int mo34873j() {
        if (this.f30376U != null) {
            m41966l();
        }
        return super.mo34873j();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34762a(C13636r rVar) throws IOException {
        byte[] bArr = this.f30376U;
        if (bArr != null) {
            rVar.mo34862a(48, bArr);
        } else {
            super.mo34770h().mo34762a(rVar);
        }
    }
}
