package kotlin.p590y;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.Pair;

/* renamed from: kotlin.y.j0 */
/* compiled from: Maps.kt */
class C13173j0 extends C13170i0 {
    /* renamed from: a */
    public static <K, V> Map<K, V> m40350a() {
        C13204z zVar = C13204z.f29642c;
        if (zVar != null) {
            return zVar;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<K, V>");
    }

    /* renamed from: b */
    public static <K, V> Map<K, V> m40360b(Pair<? extends K, ? extends V>... pairArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(m40349a(pairArr.length));
        m40361b((Map<? super K, ? super V>) linkedHashMap, pairArr);
        return linkedHashMap;
    }

    /* renamed from: c */
    public static final <K, V> Map<K, V> m40363c(Pair<? extends K, ? extends V>[] pairArr) {
        int length = pairArr.length;
        if (length == 0) {
            return m40350a();
        }
        if (length == 1) {
            return C13170i0.m40332a(pairArr[0]);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m40349a(pairArr.length));
        m40357a(pairArr, (M) linkedHashMap);
        return linkedHashMap;
    }

    /* renamed from: d */
    public static <K, V> Map<K, V> m40364d(Map<? extends K, ? extends V> map) {
        int size = map.size();
        if (size == 0) {
            return m40350a();
        }
        if (size != 1) {
            return m40365e(map);
        }
        return C13170i0.m40331a(map);
    }

    /* renamed from: e */
    public static <K, V> Map<K, V> m40365e(Map<? extends K, ? extends V> map) {
        return new LinkedHashMap(map);
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m40356a(Pair<? extends K, ? extends V>... pairArr) {
        if (pairArr.length <= 0) {
            return m40350a();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m40349a(pairArr.length));
        m40357a(pairArr, (M) linkedHashMap);
        return linkedHashMap;
    }

    /* renamed from: b */
    public static <K, V> V m40359b(Map<K, ? extends V> map, K k) {
        return C13168h0.m40330a(map, k);
    }

    /* renamed from: a */
    public static int m40349a(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return i + (i / 3);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: b */
    public static final <K, V> void m40361b(Map<? super K, ? super V> map, Pair<? extends K, ? extends V>[] pairArr) {
        for (Pair<? extends K, ? extends V> pair : pairArr) {
            map.put(pair.mo31013a(), pair.mo31014b());
        }
    }

    /* renamed from: a */
    public static final <K, V> void m40358a(Map<? super K, ? super V> map, Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        for (Pair pair : iterable) {
            map.put(pair.mo31013a(), pair.mo31014b());
        }
    }

    /* renamed from: c */
    public static final <K, V> Map<K, V> m40362c(Map<K, ? extends V> map) {
        int size = map.size();
        if (size == 0) {
            return m40350a();
        }
        if (size != 1) {
            return map;
        }
        return C13170i0.m40331a(map);
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m40351a(Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        Map<K, V> map;
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                map = m40350a();
            } else if (size != 1) {
                map = new LinkedHashMap<>(m40349a(collection.size()));
                m40352a(iterable, (M) map);
            } else {
                map = C13170i0.m40332a((Pair) (iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next()));
            }
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        m40352a(iterable, (M) linkedHashMap);
        return m40362c((Map<K, ? extends V>) linkedHashMap);
    }

    /* renamed from: a */
    public static final <K, V, M extends Map<? super K, ? super V>> M m40352a(Iterable<? extends Pair<? extends K, ? extends V>> iterable, M m) {
        m40358a((Map<? super K, ? super V>) m, iterable);
        return m;
    }

    /* renamed from: a */
    public static final <K, V, M extends Map<? super K, ? super V>> M m40357a(Pair<? extends K, ? extends V>[] pairArr, M m) {
        m40361b((Map<? super K, ? super V>) m, pairArr);
        return m;
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m40354a(Map<? extends K, ? extends V> map, Pair<? extends K, ? extends V> pair) {
        if (map.isEmpty()) {
            return C13170i0.m40332a(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.mo31015c(), pair.mo31016d());
        return linkedHashMap;
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m40355a(Map<? extends K, ? extends V> map, Pair<? extends K, ? extends V>[] pairArr) {
        if (map.isEmpty()) {
            return m40363c(pairArr);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        m40361b((Map<? super K, ? super V>) linkedHashMap, pairArr);
        return linkedHashMap;
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m40353a(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }
}
