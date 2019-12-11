package p602m.p613d.p614a;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: m.d.a.c1 */
/* compiled from: DEROctetStringParser */
public class C13488c1 implements C13633q {

    /* renamed from: c */
    private C13648u1 f30026c;

    C13488c1(C13648u1 u1Var) {
        this.f30026c = u1Var;
    }

    /* renamed from: a */
    public C13643t mo34785a() {
        try {
            return mo34768b();
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("IOException converting stream to byte array: ");
            sb.append(e.getMessage());
            throw new C13640s(sb.toString(), e);
        }
    }

    /* renamed from: b */
    public C13643t mo34768b() throws IOException {
        return new C13484b1(this.f30026c.mo34877b());
    }

    /* renamed from: c */
    public InputStream mo34786c() {
        return this.f30026c;
    }
}
