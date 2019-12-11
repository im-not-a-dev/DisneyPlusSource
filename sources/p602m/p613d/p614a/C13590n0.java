package p602m.p613d.p614a;

import java.io.IOException;

/* renamed from: m.d.a.n0 */
/* compiled from: BERTaggedObjectParser */
public class C13590n0 implements C13483b0 {

    /* renamed from: U */
    private int f30243U;

    /* renamed from: V */
    private C13658y f30244V;

    /* renamed from: c */
    private boolean f30245c;

    C13590n0(boolean z, int i, C13658y yVar) {
        this.f30245c = z;
        this.f30243U = i;
        this.f30244V = yVar;
    }

    /* renamed from: a */
    public C13643t mo34785a() {
        try {
            return mo34768b();
        } catch (IOException e) {
            throw new C13640s(e.getMessage());
        }
    }

    /* renamed from: b */
    public C13643t mo34768b() throws IOException {
        return this.f30244V.mo34896a(this.f30245c, this.f30243U);
    }
}
