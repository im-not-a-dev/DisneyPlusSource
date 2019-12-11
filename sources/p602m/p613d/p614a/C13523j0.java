package p602m.p613d.p614a;

import java.io.IOException;

/* renamed from: m.d.a.j0 */
/* compiled from: BERSequenceParser */
public class C13523j0 implements C13649v {

    /* renamed from: c */
    private C13658y f30112c;

    C13523j0(C13658y yVar) {
        this.f30112c = yVar;
    }

    /* renamed from: a */
    public C13643t mo34785a() {
        try {
            return mo34768b();
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    /* renamed from: b */
    public C13643t mo34768b() throws IOException {
        return new C13519i0(this.f30112c.mo34897b());
    }
}
