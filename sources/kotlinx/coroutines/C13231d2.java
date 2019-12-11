package kotlinx.coroutines;

/* renamed from: kotlinx.coroutines.d2 */
/* compiled from: EventLoop.common.kt */
public final class C13231d2 {

    /* renamed from: a */
    private static final ThreadLocal<C13402u0> f29659a = new ThreadLocal<>();

    /* renamed from: b */
    public static final C13231d2 f29660b = new C13231d2();

    private C13231d2() {
    }

    /* renamed from: a */
    public final C13402u0 mo34367a() {
        C13402u0 u0Var = (C13402u0) f29659a.get();
        if (u0Var != null) {
            return u0Var;
        }
        C13402u0 a = C13413x0.m41265a();
        f29659a.set(a);
        return a;
    }

    /* renamed from: b */
    public final void mo34369b() {
        f29659a.set(null);
    }

    /* renamed from: a */
    public final void mo34368a(C13402u0 u0Var) {
        f29659a.set(u0Var);
    }
}
