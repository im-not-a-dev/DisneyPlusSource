package com.google.common.base;

/* renamed from: com.google.common.base.a */
/* compiled from: Absent */
final class C10366a<T> extends Optional<T> {

    /* renamed from: c */
    static final C10366a<Object> f24671c = new C10366a<>();

    private C10366a() {
    }

    /* renamed from: e */
    static <T> Optional<T> m32797e() {
        return f24671c;
    }

    /* renamed from: a */
    public T mo27104a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    /* renamed from: b */
    public boolean mo27106b() {
        return false;
    }

    /* renamed from: c */
    public T mo27107c() {
        return null;
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return 2040732332;
    }

    public String toString() {
        return "Optional.absent()";
    }

    /* renamed from: a */
    public T mo27105a(T t) {
        C10374f.m32810a(t, (Object) "use Optional.orNull() instead of Optional.or(null)");
        return t;
    }
}
