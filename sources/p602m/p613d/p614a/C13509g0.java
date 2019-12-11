package p602m.p613d.p614a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

/* renamed from: m.d.a.g0 */
/* compiled from: BEROctetString */
public class C13509g0 extends C13630p {
    /* access modifiers changed from: private */

    /* renamed from: U */
    public C13630p[] f30085U;

    /* renamed from: m.d.a.g0$a */
    /* compiled from: BEROctetString */
    class C13510a implements Enumeration {

        /* renamed from: a */
        int f30086a = 0;

        C13510a() {
        }

        public boolean hasMoreElements() {
            return this.f30086a < C13509g0.this.f30085U.length;
        }

        public Object nextElement() {
            C13630p[] a = C13509g0.this.f30085U;
            int i = this.f30086a;
            this.f30086a = i + 1;
            return a[i];
        }
    }

    public C13509g0(byte[] bArr) {
        super(bArr);
    }

    /* renamed from: k */
    private Vector m41607k() {
        Vector vector = new Vector();
        int i = 0;
        while (true) {
            byte[] bArr = this.f30339c;
            if (i >= bArr.length) {
                return vector;
            }
            int i2 = i + 1000;
            byte[] bArr2 = new byte[((i2 > bArr.length ? bArr.length : i2) - i)];
            System.arraycopy(this.f30339c, i, bArr2, 0, bArr2.length);
            vector.addElement(new C13484b1(bArr2));
            i = i2;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo34764e() throws IOException {
        Enumeration j = mo34798j();
        int i = 0;
        while (j.hasMoreElements()) {
            i += ((C13501f) j.nextElement()).mo34785a().mo34764e();
        }
        return i + 2 + 2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo34765f() {
        return true;
    }

    /* renamed from: i */
    public byte[] mo34797i() {
        return this.f30339c;
    }

    /* renamed from: j */
    public Enumeration mo34798j() {
        if (this.f30085U == null) {
            return m41607k().elements();
        }
        return new C13510a();
    }

    public C13509g0(C13630p[] pVarArr) {
        super(m41605a(pVarArr));
        this.f30085U = pVarArr;
    }

    /* renamed from: a */
    private static byte[] m41605a(C13630p[] pVarArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (i != pVarArr.length) {
            try {
                byteArrayOutputStream.write(pVarArr[i].mo34797i());
                i++;
            } catch (ClassCastException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append(pVarArr[i].getClass().getName());
                sb.append(" found in input should only contain DEROctetString");
                throw new IllegalArgumentException(sb.toString());
            } catch (IOException e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("exception converting octets ");
                sb2.append(e.toString());
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: a */
    public void mo34762a(C13636r rVar) throws IOException {
        rVar.mo34859a(36);
        rVar.mo34859a(128);
        Enumeration j = mo34798j();
        while (j.hasMoreElements()) {
            rVar.mo34790a((C13501f) j.nextElement());
        }
        rVar.mo34859a(0);
        rVar.mo34859a(0);
    }

    /* renamed from: a */
    static C13509g0 m41604a(C13646u uVar) {
        C13630p[] pVarArr = new C13630p[uVar.mo34873j()];
        Enumeration i = uVar.mo34871i();
        int i2 = 0;
        while (i.hasMoreElements()) {
            int i3 = i2 + 1;
            pVarArr[i2] = (C13630p) i.nextElement();
            i2 = i3;
        }
        return new C13509g0(pVarArr);
    }
}
