package p163g.p449j.p450a.p451a.p457d.p464g;

import java.io.Serializable;

/* renamed from: g.j.a.a.d.g.j2 */
final class C11165j2<T> implements C11137h2<T>, Serializable {

    /* renamed from: U */
    private volatile transient boolean f26262U;

    /* renamed from: V */
    private transient T f26263V;

    /* renamed from: c */
    private final C11137h2<T> f26264c;

    C11165j2(C11137h2<T> h2Var) {
        C11088e2.m35014a(h2Var);
        this.f26264c = h2Var;
    }

    public final T get() {
        if (!this.f26262U) {
            synchronized (this) {
                if (!this.f26262U) {
                    T t = this.f26264c.get();
                    this.f26263V = t;
                    this.f26262U = true;
                    return t;
                }
            }
        }
        return this.f26263V;
    }

    public final String toString() {
        Object obj;
        if (this.f26262U) {
            String valueOf = String.valueOf(this.f26263V);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        } else {
            obj = this.f26264c;
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
