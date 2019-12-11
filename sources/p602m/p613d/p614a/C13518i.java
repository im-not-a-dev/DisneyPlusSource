package p602m.p613d.p614a;

import java.io.IOException;

/* renamed from: m.d.a.i */
/* compiled from: ASN1Exception */
public class C13518i extends IOException {

    /* renamed from: c */
    private Throwable f30106c;

    C13518i(String str) {
        super(str);
    }

    public Throwable getCause() {
        return this.f30106c;
    }

    C13518i(String str, Throwable th) {
        super(str);
        this.f30106c = th;
    }
}
