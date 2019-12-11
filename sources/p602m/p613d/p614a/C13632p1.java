package p602m.p613d.p614a;

import java.io.IOException;

/* renamed from: m.d.a.p1 */
/* compiled from: DLBitString */
public class C13632p1 extends C13486c {
    public C13632p1(byte[] bArr, int i) {
        super(bArr, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34762a(C13636r rVar) throws IOException {
        byte[] bArr = this.f30024c;
        byte[] bArr2 = new byte[(bArr.length + 1)];
        bArr2[0] = (byte) mo34781k();
        System.arraycopy(bArr, 0, bArr2, 1, bArr2.length - 1);
        rVar.mo34862a(3, bArr2);
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
}
