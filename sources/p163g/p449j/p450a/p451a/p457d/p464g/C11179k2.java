package p163g.p449j.p450a.p451a.p457d.p464g;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: g.j.a.a.d.g.k2 */
final class C11179k2<T> implements C11137h2<T>, Serializable {

    /* renamed from: c */
    private final T f26291c;

    C11179k2(T t) {
        this.f26291c = t;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11179k2)) {
            return false;
        }
        C11179k2 k2Var = (C11179k2) obj;
        T t = this.f26291c;
        T t2 = k2Var.f26291c;
        if (t == t2 || (t != null && t.equals(t2))) {
            return true;
        }
        return false;
    }

    public final T get() {
        return this.f26291c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f26291c});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f26291c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("Suppliers.ofInstance(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
