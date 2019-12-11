package p602m.p613d.p683g.p684k;

/* renamed from: m.d.g.k.e */
/* compiled from: EncoderException */
public class C14096e extends IllegalStateException {

    /* renamed from: c */
    private Throwable f31117c;

    C14096e(String str, Throwable th) {
        super(str);
        this.f31117c = th;
    }

    public Throwable getCause() {
        return this.f31117c;
    }
}
