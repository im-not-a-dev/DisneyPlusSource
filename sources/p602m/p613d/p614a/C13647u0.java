package p602m.p613d.p614a;

import java.io.IOException;

/* renamed from: m.d.a.u0 */
/* compiled from: DERExternalParser */
public class C13647u0 implements C13501f, C13651v1 {

    /* renamed from: c */
    private C13658y f30356c;

    public C13647u0(C13658y yVar) {
        this.f30356c = yVar;
    }

    /* renamed from: a */
    public C13643t mo34785a() {
        String str = "unable to get DER object";
        try {
            return mo34768b();
        } catch (IOException e) {
            throw new C13640s(str, e);
        } catch (IllegalArgumentException e2) {
            throw new C13640s(str, e2);
        }
    }

    /* renamed from: b */
    public C13643t mo34768b() throws IOException {
        try {
            return new C13644t0(this.f30356c.mo34897b());
        } catch (IllegalArgumentException e) {
            throw new C13518i(e.getMessage(), e);
        }
    }
}
