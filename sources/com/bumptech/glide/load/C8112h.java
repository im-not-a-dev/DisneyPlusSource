package com.bumptech.glide.load;

import java.security.MessageDigest;
import p163g.p413f.p414a.p424w.C10774j;

/* renamed from: com.bumptech.glide.load.h */
/* compiled from: Option */
public final class C8112h<T> {

    /* renamed from: e */
    private static final C8114b<Object> f17371e = new C8113a();

    /* renamed from: a */
    private final T f17372a;

    /* renamed from: b */
    private final C8114b<T> f17373b;

    /* renamed from: c */
    private final String f17374c;

    /* renamed from: d */
    private volatile byte[] f17375d;

    /* renamed from: com.bumptech.glide.load.h$a */
    /* compiled from: Option */
    class C8113a implements C8114b<Object> {
        C8113a() {
        }

        /* renamed from: a */
        public void mo21160a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    /* renamed from: com.bumptech.glide.load.h$b */
    /* compiled from: Option */
    public interface C8114b<T> {
        /* renamed from: a */
        void mo21160a(byte[] bArr, T t, MessageDigest messageDigest);
    }

    private C8112h(String str, T t, C8114b<T> bVar) {
        C10774j.m34014a(str);
        this.f17374c = str;
        this.f17372a = t;
        C10774j.m34012a(bVar);
        this.f17373b = bVar;
    }

    /* renamed from: a */
    public static <T> C8112h<T> m23531a(String str) {
        return new C8112h<>(str, null, m23534b());
    }

    /* renamed from: b */
    private static <T> C8114b<T> m23534b() {
        return f17371e;
    }

    /* renamed from: c */
    private byte[] m23535c() {
        if (this.f17375d == null) {
            this.f17375d = this.f17374c.getBytes(C8111g.f17370a);
        }
        return this.f17375d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8112h)) {
            return false;
        }
        return this.f17374c.equals(((C8112h) obj).f17374c);
    }

    public int hashCode() {
        return this.f17374c.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Option{key='");
        sb.append(this.f17374c);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public static <T> C8112h<T> m23532a(String str, T t) {
        return new C8112h<>(str, t, m23534b());
    }

    /* renamed from: a */
    public static <T> C8112h<T> m23533a(String str, T t, C8114b<T> bVar) {
        return new C8112h<>(str, t, bVar);
    }

    /* renamed from: a */
    public T mo21155a() {
        return this.f17372a;
    }

    /* renamed from: a */
    public void mo21156a(T t, MessageDigest messageDigest) {
        this.f17373b.mo21160a(m23535c(), t, messageDigest);
    }
}
