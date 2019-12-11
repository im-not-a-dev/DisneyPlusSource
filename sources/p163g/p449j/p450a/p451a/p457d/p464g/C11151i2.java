package p163g.p449j.p450a.p451a.p457d.p464g;

/* renamed from: g.j.a.a.d.g.i2 */
final class C11151i2<T> implements C11137h2<T> {

    /* renamed from: U */
    private volatile boolean f26244U;

    /* renamed from: V */
    private T f26245V;

    /* renamed from: c */
    private volatile C11137h2<T> f26246c;

    C11151i2(C11137h2<T> h2Var) {
        C11088e2.m35014a(h2Var);
        this.f26246c = h2Var;
    }

    public final T get() {
        if (!this.f26244U) {
            synchronized (this) {
                if (!this.f26244U) {
                    T t = this.f26246c.get();
                    this.f26245V = t;
                    this.f26244U = true;
                    this.f26246c = null;
                    return t;
                }
            }
        }
        return this.f26245V;
    }

    public final String toString() {
        Object obj = this.f26246c;
        if (obj == null) {
            String valueOf = String.valueOf(this.f26245V);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
