package p512h.p515d;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: h.d.a */
/* compiled from: DaggerCollections */
public final class C11893a {
    /* renamed from: a */
    private static int m38121a(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: b */
    static <T> HashSet<T> m38122b(int i) {
        return new HashSet<>(m38121a(i));
    }

    /* renamed from: c */
    public static <K, V> LinkedHashMap<K, V> m38123c(int i) {
        return new LinkedHashMap<>(m38121a(i));
    }

    /* renamed from: d */
    public static <T> List<T> m38124d(int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        return new ArrayList(i);
    }
}
