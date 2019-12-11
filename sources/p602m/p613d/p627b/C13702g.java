package p602m.p613d.p627b;

/* renamed from: m.d.b.g */
/* compiled from: CryptoException */
public class C13702g extends Exception {

    /* renamed from: c */
    private Throwable f30467c;

    public C13702g(String str) {
        super(str);
    }

    public Throwable getCause() {
        return this.f30467c;
    }

    public C13702g(String str, Throwable th) {
        super(str);
        this.f30467c = th;
    }
}
