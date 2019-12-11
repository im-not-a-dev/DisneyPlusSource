package p602m.p613d.p614a;

import java.io.IOException;

/* renamed from: m.d.a.l0 */
/* compiled from: BERSetParser */
public class C13566l0 implements C13655x {

    /* renamed from: c */
    private C13658y f30198c;

    C13566l0(C13658y yVar) {
        this.f30198c = yVar;
    }

    /* renamed from: a */
    public C13643t mo34785a() {
        try {
            return mo34768b();
        } catch (IOException e) {
            throw new C13640s(e.getMessage(), e);
        }
    }

    /* renamed from: b */
    public C13643t mo34768b() throws IOException {
        return new C13527k0(this.f30198c.mo34897b());
    }
}
