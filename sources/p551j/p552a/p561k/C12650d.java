package p551j.p552a.p561k;

/* renamed from: j.a.k.d */
/* compiled from: ThreadLocalContextManager */
public class C12650d implements C12648b {

    /* renamed from: a */
    private final ThreadLocal<C12647a> f29330a = new C12651a(this);

    /* renamed from: j.a.k.d$a */
    /* compiled from: ThreadLocalContextManager */
    class C12651a extends ThreadLocal<C12647a> {
        C12651a(C12650d dVar) {
        }

        /* access modifiers changed from: protected */
        public C12647a initialValue() {
            return new C12647a();
        }
    }

    /* renamed from: b */
    public C12647a mo30961b() {
        return (C12647a) this.f29330a.get();
    }
}
