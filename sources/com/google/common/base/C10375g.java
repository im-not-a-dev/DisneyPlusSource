package com.google.common.base;

/* renamed from: com.google.common.base.g */
/* compiled from: Present */
final class C10375g<T> extends Optional<T> {

    /* renamed from: c */
    private final T f24679c;

    C10375g(T t) {
        this.f24679c = t;
    }

    /* renamed from: a */
    public T mo27104a() {
        return this.f24679c;
    }

    /* renamed from: b */
    public boolean mo27106b() {
        return true;
    }

    /* renamed from: c */
    public T mo27107c() {
        return this.f24679c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10375g)) {
            return false;
        }
        return this.f24679c.equals(((C10375g) obj).f24679c);
    }

    public int hashCode() {
        return this.f24679c.hashCode() + 1502476572;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Optional.of(");
        sb.append(this.f24679c);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public T mo27105a(T t) {
        C10374f.m32810a(t, (Object) "use Optional.orNull() instead of Optional.or(null)");
        return this.f24679c;
    }
}
