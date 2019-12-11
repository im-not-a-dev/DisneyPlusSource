package p163g.p449j.p450a.p451a.p457d.p464g;

import java.io.Serializable;

/* renamed from: g.j.a.a.d.g.g2 */
public final class C11123g2 {
    /* renamed from: a */
    public static <T> C11137h2<T> m35241a(C11137h2<T> h2Var) {
        if ((h2Var instanceof C11151i2) || (h2Var instanceof C11165j2)) {
            return h2Var;
        }
        if (h2Var instanceof Serializable) {
            return new C11165j2(h2Var);
        }
        return new C11151i2(h2Var);
    }

    /* renamed from: a */
    public static <T> C11137h2<T> m35242a(T t) {
        return new C11179k2(t);
    }
}
