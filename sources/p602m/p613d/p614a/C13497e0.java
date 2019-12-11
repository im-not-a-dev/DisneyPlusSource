package p602m.p613d.p614a;

import java.io.IOException;

/* renamed from: m.d.a.e0 */
/* compiled from: BERApplicationSpecificParser */
public class C13497e0 implements C13482b {

    /* renamed from: U */
    private final C13658y f30060U;

    /* renamed from: c */
    private final int f30061c;

    C13497e0(int i, C13658y yVar) {
        this.f30061c = i;
        this.f30060U = yVar;
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
        return new C13493d0(this.f30061c, this.f30060U.mo34897b());
    }
}
