package p512h.p515d;

import javax.inject.Provider;

/* renamed from: h.d.g */
/* compiled from: SingleCheck */
public final class C11901g<T> implements Provider<T> {

    /* renamed from: c */
    private static final Object f27545c = new Object();

    /* renamed from: a */
    private volatile Provider<T> f27546a;

    /* renamed from: b */
    private volatile Object f27547b = f27545c;

    private C11901g(Provider<T> provider) {
        this.f27546a = provider;
    }

    /* renamed from: a */
    public static <P extends Provider<T>, T> Provider<T> m38136a(P p) {
        if ((p instanceof C11901g) || (p instanceof C11894b)) {
            return p;
        }
        C11897e.m38129a(p);
        return new C11901g((Provider) p);
    }

    public T get() {
        T t = this.f27547b;
        if (t != f27545c) {
            return t;
        }
        Provider<T> provider = this.f27546a;
        if (provider == null) {
            return this.f27547b;
        }
        T t2 = provider.get();
        this.f27547b = t2;
        this.f27546a = null;
        return t2;
    }
}
