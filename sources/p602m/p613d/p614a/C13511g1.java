package p602m.p613d.p614a;

import java.io.IOException;

/* renamed from: m.d.a.g1 */
/* compiled from: DERSequenceParser */
public class C13511g1 implements C13649v {

    /* renamed from: c */
    private C13658y f30088c;

    C13511g1(C13658y yVar) {
        this.f30088c = yVar;
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
        return new C13503f1(this.f30088c.mo34897b());
    }
}
