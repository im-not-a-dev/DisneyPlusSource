package kotlin.p590y;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.jvm.internal.C12880j;

/* renamed from: kotlin.y.i0 */
/* compiled from: MapsJVM.kt */
class C13170i0 extends C13168h0 {
    /* renamed from: a */
    public static <K, V> Map<K, V> m40332a(Pair<? extends K, ? extends V> pair) {
        Map<K, V> singletonMap = Collections.singletonMap(pair.mo31015c(), pair.mo31016d());
        C12880j.m40222a((Object) singletonMap, "java.util.Collections.si…(pair.first, pair.second)");
        return singletonMap;
    }

    /* renamed from: b */
    public static <K extends Comparable<? super K>, V> SortedMap<K, V> m40334b(Map<? extends K, ? extends V> map) {
        return new TreeMap(map);
    }

    /* renamed from: a */
    public static <K, V> SortedMap<K, V> m40333a(Map<? extends K, ? extends V> map, Comparator<? super K> comparator) {
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        return treeMap;
    }

    /* renamed from: a */
    public static final <K, V> Map<K, V> m40331a(Map<? extends K, ? extends V> map) {
        Entry entry = (Entry) map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        C12880j.m40222a((Object) singletonMap, "java.util.Collections.singletonMap(key, value)");
        C12880j.m40222a((Object) singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }
}
