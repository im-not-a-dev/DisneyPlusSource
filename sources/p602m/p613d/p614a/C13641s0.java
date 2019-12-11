package p602m.p613d.p614a;

import java.io.IOException;

/* renamed from: m.d.a.s0 */
/* compiled from: DERBitString */
public class C13641s0 extends C13486c {
    public C13641s0(byte[] bArr, int i) {
        super(bArr, i);
    }

    /* renamed from: a */
    public static C13641s0 m41890a(Object obj) {
        if (obj == null || (obj instanceof C13641s0)) {
            return (C13641s0) obj;
        }
        if (obj instanceof C13632p1) {
            C13632p1 p1Var = (C13632p1) obj;
            return new C13641s0(p1Var.f30024c, p1Var.f30023U);
        } else if (obj instanceof byte[]) {
            try {
                return (C13641s0) C13643t.m41897a((byte[]) obj);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("encoding error in getInstance: ");
                sb.append(e.toString());
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("illegal object in getInstance: ");
            sb2.append(obj.getClass().getName());
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo34764e() {
        return C13485b2.m41537a(this.f30024c.length + 1) + 1 + this.f30024c.length + 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo34765f() {
        return false;
    }

    public C13641s0(byte[] bArr) {
        this(bArr, 0);
    }

    public C13641s0(C13501f fVar) throws IOException {
        super(fVar.mo34785a().mo34827a("DER"), 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34762a(C13636r rVar) throws IOException {
        byte[] a = C13486c.m41541a(this.f30024c, this.f30023U);
        byte[] bArr = new byte[(a.length + 1)];
        bArr[0] = (byte) mo34781k();
        System.arraycopy(a, 0, bArr, 1, bArr.length - 1);
        rVar.mo34862a(3, bArr);
    }
}
