package p602m.p613d.p614a;

import java.io.IOException;

/* renamed from: m.d.a.t */
/* compiled from: ASN1Primitive */
public abstract class C13643t extends C13589n {
    C13643t() {
    }

    /* renamed from: a */
    public static C13643t m41897a(byte[] bArr) throws IOException {
        C13526k kVar = new C13526k(bArr);
        try {
            C13643t d = kVar.mo34811d();
            if (kVar.available() == 0) {
                return d;
            }
            throw new IOException("Extra data detected in stream");
        } catch (ClassCastException unused) {
            throw new IOException("cannot recognise object in stream");
        }
    }

    /* renamed from: a */
    public C13643t mo34785a() {
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo34762a(C13636r rVar) throws IOException;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract boolean mo34763a(C13643t tVar);

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public abstract int mo34764e() throws IOException;

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13501f) || !mo34763a(((C13501f) obj).mo34785a())) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public abstract boolean mo34765f();

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public C13643t mo34769g() {
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public C13643t mo34770h() {
        return this;
    }
}
