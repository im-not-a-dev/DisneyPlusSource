package p602m.p613d.p683g.p684k;

/* renamed from: m.d.g.k.c */
/* compiled from: DecoderException */
public class C14094c extends IllegalStateException {

    /* renamed from: c */
    private Throwable f31116c;

    C14094c(String str, Throwable th) {
        super(str);
        this.f31116c = th;
    }

    public Throwable getCause() {
        return this.f31116c;
    }
}
