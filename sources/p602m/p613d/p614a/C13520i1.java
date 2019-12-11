package p602m.p613d.p614a;

import java.io.IOException;

/* renamed from: m.d.a.i1 */
/* compiled from: DERSetParser */
public class C13520i1 implements C13655x {

    /* renamed from: c */
    private C13658y f30107c;

    C13520i1(C13658y yVar) {
        this.f30107c = yVar;
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
        return new C13516h1(this.f30107c.mo34897b(), false);
    }
}
