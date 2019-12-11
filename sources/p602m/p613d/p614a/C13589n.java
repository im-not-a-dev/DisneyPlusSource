package p602m.p613d.p614a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import p602m.p613d.p683g.C14082c;

/* renamed from: m.d.a.n */
/* compiled from: ASN1Object */
public abstract class C13589n implements C13501f, C14082c {
    /* renamed from: a */
    public abstract C13643t mo34785a();

    /* renamed from: a */
    public byte[] mo34827a(String str) throws IOException {
        if (str.equals("DER")) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new C13494d1(byteArrayOutputStream).mo34790a(this);
            return byteArrayOutputStream.toByteArray();
        } else if (!str.equals("DL")) {
            return mo34828d();
        } else {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            new C13635q1(byteArrayOutputStream2).mo34790a(this);
            return byteArrayOutputStream2.toByteArray();
        }
    }

    /* renamed from: d */
    public byte[] mo34828d() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new C13636r(byteArrayOutputStream).mo34790a((C13501f) this);
        return byteArrayOutputStream.toByteArray();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13501f)) {
            return false;
        }
        return mo34785a().equals(((C13501f) obj).mo34785a());
    }

    public int hashCode() {
        return mo34785a().hashCode();
    }
}
