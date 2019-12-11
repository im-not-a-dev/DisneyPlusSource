package p512h.p515d;

import p512h.C11868a;

/* renamed from: h.d.d */
/* compiled from: InstanceFactory */
public final class C11896d<T> implements C11895c<T>, C11868a<T> {

    /* renamed from: a */
    private final T f27540a;

    static {
        new C11896d(null);
    }

    private C11896d(T t) {
        this.f27540a = t;
    }

    /* renamed from: a */
    public static <T> C11895c<T> m38128a(T t) {
        C11897e.m38130a(t, "instance cannot be null");
        return new C11896d(t);
    }

    public T get() {
        return this.f27540a;
    }
}
