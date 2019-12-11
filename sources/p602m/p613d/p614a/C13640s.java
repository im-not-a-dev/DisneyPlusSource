package p602m.p613d.p614a;

/* renamed from: m.d.a.s */
/* compiled from: ASN1ParsingException */
public class C13640s extends IllegalStateException {

    /* renamed from: c */
    private Throwable f30347c;

    public C13640s(String str) {
        super(str);
    }

    public Throwable getCause() {
        return this.f30347c;
    }

    public C13640s(String str, Throwable th) {
        super(str);
        this.f30347c = th;
    }
}
