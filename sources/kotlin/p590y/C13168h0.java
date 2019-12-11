package kotlin.p590y;

import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: kotlin.y.h0 */
/* compiled from: MapWithDefault.kt */
class C13168h0 {
    /* renamed from: a */
    public static final <K, V> V m40330a(Map<K, ? extends V> map, K k) {
        if (map instanceof C13164f0) {
            return ((C13164f0) map).mo34257a(k);
        }
        V v = map.get(k);
        if (v != null || map.containsKey(k)) {
            return v;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Key ");
        sb.append(k);
        sb.append(" is missing in the map.");
        throw new NoSuchElementException(sb.toString());
    }
}
