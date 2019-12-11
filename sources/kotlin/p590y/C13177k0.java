package kotlin.p590y;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.Pair;

/* renamed from: kotlin.y.k0 */
/* compiled from: _Maps.kt */
class C13177k0 extends C13173j0 {
    /* renamed from: f */
    public static <K, V> List<Pair<K, V>> m40416f(Map<? extends K, ? extends V> map) {
        if (map.size() == 0) {
            return C13185o.m40513a();
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return C13185o.m40513a();
        }
        Entry entry = (Entry) it.next();
        if (!it.hasNext()) {
            return C13183n.m40498a(new Pair(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new Pair(entry.getKey(), entry.getValue()));
        do {
            Entry entry2 = (Entry) it.next();
            arrayList.add(new Pair(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }
}
