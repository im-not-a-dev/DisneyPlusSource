package p602m.p613d.p614a;

import java.io.IOException;
import java.io.InputStream;
import p602m.p613d.p683g.p685l.C14099a;

/* renamed from: m.d.a.h0 */
/* compiled from: BEROctetStringParser */
public class C13515h0 implements C13633q {

    /* renamed from: c */
    private C13658y f30103c;

    C13515h0(C13658y yVar) {
        this.f30103c = yVar;
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
        return new C13509g0(C14099a.m44520a(mo34786c()));
    }

    /* renamed from: c */
    public InputStream mo34786c() {
        return new C13631p0(this.f30103c);
    }
}
