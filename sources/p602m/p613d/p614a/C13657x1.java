package p602m.p613d.p614a;

import java.io.IOException;
import java.util.Enumeration;

/* renamed from: m.d.a.x1 */
/* compiled from: LazyConstructionEnumeration */
class C13657x1 implements Enumeration {

    /* renamed from: a */
    private C13526k f30370a;

    /* renamed from: b */
    private Object f30371b = m41955a();

    public C13657x1(byte[] bArr) {
        this.f30370a = new C13526k(bArr, true);
    }

    /* renamed from: a */
    private Object m41955a() {
        try {
            return this.f30370a.mo34811d();
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("malformed DER construction: ");
            sb.append(e);
            throw new C13640s(sb.toString(), e);
        }
    }

    public boolean hasMoreElements() {
        return this.f30371b != null;
    }

    public Object nextElement() {
        Object obj = this.f30371b;
        this.f30371b = m41955a();
        return obj;
    }
}
