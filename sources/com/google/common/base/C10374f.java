package com.google.common.base;

/* renamed from: com.google.common.base.f */
/* compiled from: Preconditions */
public final class C10374f {
    /* renamed from: a */
    public static void m32813a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: b */
    public static int m32815b(int i, int i2) {
        m32819d(i, i2, "index");
        return i;
    }

    /* renamed from: c */
    public static int m32818c(int i, int i2, String str) {
        if (i >= 0 && i < i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m32812a(i, i2, str));
    }

    /* renamed from: d */
    public static int m32819d(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m32816b(i, i2, str));
    }

    /* renamed from: a */
    public static void m32814a(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalStateException(C10376h.m32825a(str, obj));
        }
    }

    /* renamed from: b */
    private static String m32816b(int i, int i2, String str) {
        if (i < 0) {
            return C10376h.m32825a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return C10376h.m32825a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("negative size: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public static <T> T m32809a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static <T> T m32810a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: a */
    public static int m32808a(int i, int i2) {
        m32818c(i, i2, "index");
        return i;
    }

    /* renamed from: b */
    public static void m32817b(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException(m32811a(i, i2, i3));
        }
    }

    /* renamed from: a */
    private static String m32812a(int i, int i2, String str) {
        if (i < 0) {
            return C10376h.m32825a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return C10376h.m32825a("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("negative size: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    private static String m32811a(int i, int i2, int i3) {
        if (i < 0 || i > i3) {
            return m32816b(i, i3, "start index");
        }
        if (i2 < 0 || i2 > i3) {
            return m32816b(i2, i3, "end index");
        }
        return C10376h.m32825a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
    }
}
