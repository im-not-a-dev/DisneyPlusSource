package com.bamtechmedia.dominguez.core.utils;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.C12907r;
import kotlin.Pair;

/* renamed from: com.bamtechmedia.dominguez.core.utils.p */
/* compiled from: MapExt.kt */
public final class C5859p {
    /* renamed from: a */
    public static final <T> T m18897a(Map<String, ?> map, String str, String... strArr) {
        return m18898a(map, C13199w.m40583d((Collection) C13183n.m40498a(str), (Iterable) C13174k.m40412l(strArr)));
    }

    /* renamed from: a */
    public static final <T> T m18898a(Map<String, ?> map, List<String> list) {
        if (list.size() == 1) {
            T t = map.get(C13199w.m40589f((List) list));
            if (!(t instanceof Object)) {
                t = null;
            }
            return t;
        }
        Object obj = map.get(C13199w.m40589f((List) list));
        if (!(obj instanceof Map)) {
            obj = null;
        }
        Map map2 = (Map) obj;
        if (map2 != null) {
            return m18898a(map2, C13199w.m40571c((Iterable) list, 1));
        }
        return null;
    }

    /* renamed from: a */
    public static final Map<String, Object> m18901a(Map<String, ? extends Object> map, boolean z, String str, Object obj) {
        return z ? m18900a(map, C12907r.m40244a(str, obj)) : map;
    }

    /* renamed from: a */
    public static final <T, U> Map<T, U> m18900a(Map<T, ? extends U> map, Pair<? extends T, ? extends U> pair) {
        Object d = pair.mo31016d();
        if (d == null) {
            return map;
        }
        Map a = C13173j0.m40354a((Map) map, C12907r.m40244a(pair.mo31015c(), d));
        return a != null ? a : map;
    }

    /* renamed from: a */
    public static final <T, U> Map<T, U> m18899a(Map<T, ? extends U> map, T t, U u) {
        return m18900a(map, new Pair<>(t, u));
    }
}
