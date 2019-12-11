package com.google.common.base;

import java.io.Serializable;

public abstract class Optional<T> implements Serializable {
    Optional() {
    }

    /* renamed from: b */
    public static <T> Optional<T> m32790b(T t) {
        return t == null ? m32792d() : new C10375g(t);
    }

    /* renamed from: c */
    public static <T> Optional<T> m32791c(T t) {
        C10374f.m32809a(t);
        return new C10375g(t);
    }

    /* renamed from: d */
    public static <T> Optional<T> m32792d() {
        return C10366a.m32797e();
    }

    /* renamed from: a */
    public abstract T mo27104a();

    /* renamed from: a */
    public abstract T mo27105a(T t);

    /* renamed from: b */
    public abstract boolean mo27106b();

    /* renamed from: c */
    public abstract T mo27107c();
}
