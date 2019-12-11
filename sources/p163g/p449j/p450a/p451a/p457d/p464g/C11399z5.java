package p163g.p449j.p450a.p451a.p457d.p464g;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: g.j.a.a.d.g.z5 */
final class C11399z5 {

    /* renamed from: c */
    private static final C11399z5 f26720c = new C11399z5();

    /* renamed from: a */
    private final C11141h6 f26721a = new C11056c5();

    /* renamed from: b */
    private final ConcurrentMap<Class<?>, C11077d6<?>> f26722b = new ConcurrentHashMap();

    private C11399z5() {
    }

    /* renamed from: a */
    public static C11399z5 m36838a() {
        return f26720c;
    }

    /* renamed from: a */
    public final <T> C11077d6<T> mo29197a(Class<T> cls) {
        String str = "messageType";
        C11111f4.m35153a(cls, str);
        C11077d6<T> d6Var = (C11077d6) this.f26722b.get(cls);
        if (d6Var != null) {
            return d6Var;
        }
        C11077d6<T> a = this.f26721a.mo28344a(cls);
        C11111f4.m35153a(cls, str);
        C11111f4.m35153a(a, "schema");
        C11077d6 d6Var2 = (C11077d6) this.f26722b.putIfAbsent(cls, a);
        return d6Var2 != null ? d6Var2 : a;
    }

    /* renamed from: a */
    public final <T> C11077d6<T> mo29198a(T t) {
        return mo29197a(t.getClass());
    }
}
