package com.bamtech.shadow.dagger.p048a;

import com.bamtech.shadow.dagger.Lazy;
import javax.inject.Provider;

/* renamed from: com.bamtech.shadow.dagger.a.b */
/* compiled from: DoubleCheck */
public final class C2110b<T> implements Provider<T>, Lazy<T> {

    /* renamed from: c */
    private static final Object f6090c = new Object();

    /* renamed from: a */
    private volatile Provider<T> f6091a;

    /* renamed from: b */
    private volatile Object f6092b = f6090c;

    private C2110b(Provider<T> provider) {
        this.f6091a = provider;
    }

    /* renamed from: a */
    public static <P extends Provider<T>, T> Lazy<T> m8172a(P p) {
        if (p instanceof Lazy) {
            return (Lazy) p;
        }
        C2113e.m8177a(p);
        return new C2110b((Provider) p);
    }

    /* renamed from: b */
    public static <P extends Provider<T>, T> Provider<T> m8173b(P p) {
        C2113e.m8177a(p);
        if (p instanceof C2110b) {
            return p;
        }
        return new C2110b(p);
    }

    public T get() {
        T t = this.f6092b;
        if (t == f6090c) {
            synchronized (this) {
                t = this.f6092b;
                if (t == f6090c) {
                    t = this.f6091a.get();
                    T t2 = this.f6092b;
                    if (t2 != f6090c) {
                        if (t2 != t) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Scoped provider was invoked recursively returning different results: ");
                            sb.append(t2);
                            sb.append(" & ");
                            sb.append(t);
                            sb.append(". This is likely due to a circular dependency.");
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                    this.f6092b = t;
                    this.f6091a = null;
                }
            }
        }
        return t;
    }
}
