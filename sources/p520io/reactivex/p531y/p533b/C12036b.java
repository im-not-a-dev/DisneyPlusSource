package p520io.reactivex.p531y.p533b;

import p520io.reactivex.functions.C11948d;

/* renamed from: io.reactivex.y.b.b */
/* compiled from: ObjectHelper */
public final class C12036b {

    /* renamed from: a */
    static final C11948d<Object, Object> f27757a = new C12037a();

    /* renamed from: io.reactivex.y.b.b$a */
    /* compiled from: ObjectHelper */
    static final class C12037a implements C11948d<Object, Object> {
        C12037a() {
        }

        /* renamed from: a */
        public boolean mo30263a(Object obj, Object obj2) {
            return C12036b.m38664a(obj, obj2);
        }
    }

    /* renamed from: a */
    public static int m38659a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    /* renamed from: a */
    public static int m38661a(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i > 0 ? 1 : 0;
    }

    /* renamed from: a */
    public static <T> T m38663a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    public static boolean m38664a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: a */
    public static <T> C11948d<T, T> m38662a() {
        return f27757a;
    }

    /* renamed from: a */
    public static int m38660a(int i, String str) {
        if (i > 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" > 0 required but it was ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
