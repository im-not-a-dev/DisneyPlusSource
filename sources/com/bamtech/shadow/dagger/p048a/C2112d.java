package com.bamtech.shadow.dagger.p048a;

import com.bamtech.shadow.dagger.Lazy;

/* renamed from: com.bamtech.shadow.dagger.a.d */
/* compiled from: InstanceFactory */
public final class C2112d<T> implements C2111c<T>, Lazy<T> {

    /* renamed from: b */
    private static final C2112d<Object> f6093b = new C2112d<>(null);

    /* renamed from: a */
    private final T f6094a;

    private C2112d(T t) {
        this.f6094a = t;
    }

    /* renamed from: a */
    public static <T> C2111c<T> m8174a(T t) {
        C2113e.m8178a(t, "instance cannot be null");
        return new C2112d(t);
    }

    /* renamed from: b */
    public static <T> C2111c<T> m8176b(T t) {
        if (t == null) {
            return m8175a();
        }
        return new C2112d(t);
    }

    public T get() {
        return this.f6094a;
    }

    /* renamed from: a */
    private static <T> C2112d<T> m8175a() {
        return f6093b;
    }
}
