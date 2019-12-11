package p096e.p121h.p134r;

/* renamed from: e.h.r.i */
/* compiled from: Preconditions */
public final class C4117i {
    /* renamed from: a */
    public static <T> T m14095a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static <T> T m14096a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: a */
    public static int m14094a(int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException();
    }
}
