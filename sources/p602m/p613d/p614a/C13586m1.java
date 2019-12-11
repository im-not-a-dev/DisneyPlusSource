package p602m.p613d.p614a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import p602m.p613d.p683g.C14079a;

/* renamed from: m.d.a.m1 */
/* compiled from: DERUniversalString */
public class C13586m1 extends C13643t implements C13661z {

    /* renamed from: U */
    private static final char[] f30237U = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: c */
    private final byte[] f30238c;

    public C13586m1(byte[] bArr) {
        this.f30238c = C14079a.m44450a(bArr);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34762a(C13636r rVar) throws IOException {
        rVar.mo34862a(28, mo34819i());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo34764e() {
        return C13485b2.m41537a(this.f30238c.length) + 1 + this.f30238c.length;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo34765f() {
        return false;
    }

    public int hashCode() {
        return C14079a.m44457b(this.f30238c);
    }

    /* renamed from: i */
    public byte[] mo34819i() {
        return C14079a.m44450a(this.f30238c);
    }

    /* renamed from: j */
    public String mo34820j() {
        StringBuffer stringBuffer = new StringBuffer("#");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C13636r(byteArrayOutputStream).mo34790a((C13501f) this);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            for (int i = 0; i != byteArray.length; i++) {
                stringBuffer.append(f30237U[(byteArray[i] >>> 4) & 15]);
                stringBuffer.append(f30237U[byteArray[i] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException unused) {
            throw new C13640s("internal error encoding BitString");
        }
    }

    public String toString() {
        return mo34820j();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo34763a(C13643t tVar) {
        if (!(tVar instanceof C13586m1)) {
            return false;
        }
        return C14079a.m44446a(this.f30238c, ((C13586m1) tVar).f30238c);
    }
}
