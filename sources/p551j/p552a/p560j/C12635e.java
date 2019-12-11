package p551j.p552a.p560j;

/* renamed from: j.a.j.e */
/* compiled from: ConnectionException */
public class C12635e extends RuntimeException {

    /* renamed from: U */
    private Integer f29296U = null;

    /* renamed from: c */
    private Long f29297c = null;

    public C12635e(String str, Throwable th) {
        super(str, th);
    }

    /* renamed from: a */
    public Long mo30936a() {
        return this.f29297c;
    }

    /* renamed from: b */
    public Integer mo30937b() {
        return this.f29296U;
    }

    public C12635e(String str, Throwable th, Long l, Integer num) {
        super(str, th);
        this.f29297c = l;
        this.f29296U = num;
    }
}
