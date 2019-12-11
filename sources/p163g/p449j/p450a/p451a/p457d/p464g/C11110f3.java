package p163g.p449j.p450a.p451a.p457d.p464g;

import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: g.j.a.a.d.g.f3 */
class C11110f3 extends C11054c3 {

    /* renamed from: W */
    protected final byte[] f26197W;

    C11110f3(byte[] bArr) {
        if (bArr != null) {
            this.f26197W = bArr;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public final C11342v2 mo28510a(int i, int i2) {
        int b = C11342v2.m36530b(0, i2, size());
        if (b == 0) {
            return C11342v2.f26574U;
        }
        return new C11383y2(this.f26197W, mo28515e(), b);
    }

    /* renamed from: c */
    public final boolean mo28514c() {
        int e = mo28515e();
        return C11114f7.m35222a(this.f26197W, e, size() + e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo28515e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11342v2) || size() != ((C11342v2) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C11110f3)) {
            return obj.equals(this);
        }
        C11110f3 f3Var = (C11110f3) obj;
        int d = mo29071d();
        int d2 = f3Var.mo29071d();
        if (d == 0 || d2 == 0 || d == d2) {
            return mo28513a((C11342v2) f3Var, 0, size());
        }
        return false;
    }

    /* renamed from: f */
    public byte mo28517f(int i) {
        return this.f26197W[i];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public byte mo28518g(int i) {
        return this.f26197W[i];
    }

    public int size() {
        return this.f26197W.length;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo28512a(C11299s2 s2Var) throws IOException {
        s2Var.mo28690a(this.f26197W, mo28515e(), size());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo28511a(Charset charset) {
        return new String(this.f26197W, mo28515e(), size(), charset);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo28513a(C11342v2 v2Var, int i, int i2) {
        if (i2 > v2Var.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 > v2Var.size()) {
            int size2 = v2Var.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (!(v2Var instanceof C11110f3)) {
            return v2Var.mo28510a(0, i2).equals(mo28510a(0, i2));
        } else {
            C11110f3 f3Var = (C11110f3) v2Var;
            byte[] bArr = this.f26197W;
            byte[] bArr2 = f3Var.f26197W;
            int e = mo28515e() + i2;
            int e2 = mo28515e();
            int e3 = f3Var.mo28515e();
            while (e2 < e) {
                if (bArr[e2] != bArr2[e3]) {
                    return false;
                }
                e2++;
                e3++;
            }
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo28509a(int i, int i2, int i3) {
        return C11111f4.m35147a(i, this.f26197W, mo28515e(), i3);
    }
}
