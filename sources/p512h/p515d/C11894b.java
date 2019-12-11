package p512h.p515d;

import javax.inject.Provider;
import p512h.C11868a;

/* renamed from: h.d.b */
/* compiled from: DoubleCheck */
public final class C11894b<T> implements Provider<T>, C11868a<T> {

    /* renamed from: c */
    private static final Object f27537c = new Object();

    /* renamed from: a */
    private volatile Provider<T> f27538a;

    /* renamed from: b */
    private volatile Object f27539b = f27537c;

    private C11894b(Provider<T> provider) {
        this.f27538a = provider;
    }

    /* renamed from: a */
    public static Object m38126a(Object obj, Object obj2) {
        if (!(obj != f27537c) || obj == obj2) {
            return obj2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Scoped provider was invoked recursively returning different results: ");
        sb.append(obj);
        sb.append(" & ");
        sb.append(obj2);
        sb.append(". This is likely due to a circular dependency.");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: b */
    public static <P extends Provider<T>, T> Provider<T> m38127b(P p) {
        C11897e.m38129a(p);
        if (p instanceof C11894b) {
            return p;
        }
        return new C11894b(p);
    }

    public T get() {
        T t = this.f27539b;
        if (t == f27537c) {
            synchronized (this) {
                t = this.f27539b;
                if (t == f27537c) {
                    t = this.f27538a.get();
                    m38126a(this.f27539b, t);
                    this.f27539b = t;
                    this.f27538a = null;
                }
            }
        }
        return t;
    }

    /* renamed from: a */
    public static <P extends Provider<T>, T> C11868a<T> m38125a(P p) {
        if (p instanceof C11868a) {
            return (C11868a) p;
        }
        C11897e.m38129a(p);
        return new C11894b((Provider) p);
    }
}
