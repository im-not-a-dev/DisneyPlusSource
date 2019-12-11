package p163g.p413f.p414a.p424w;

import android.text.TextUtils;
import java.util.Collection;

/* renamed from: g.f.a.w.j */
/* compiled from: Preconditions */
public final class C10774j {
    /* renamed from: a */
    public static void m34016a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: a */
    public static <T> T m34012a(T t) {
        m34013a(t, "Argument must not be null");
        return t;
    }

    /* renamed from: a */
    public static <T> T m34013a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    public static String m34014a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    /* renamed from: a */
    public static <T extends Collection<Y>, Y> T m34015a(T t) {
        if (!t.isEmpty()) {
            return t;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }
}
