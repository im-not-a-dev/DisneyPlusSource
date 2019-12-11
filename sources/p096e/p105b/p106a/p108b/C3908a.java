package p096e.p105b.p106a.p108b;

import java.util.HashMap;
import java.util.Map.Entry;

/* renamed from: e.b.a.b.a */
/* compiled from: FastSafeIterableMap */
public class C3908a<K, V> extends C3909b<K, V> {

    /* renamed from: X */
    private HashMap<K, C3912c<K, V>> f9688X = new HashMap<>();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C3912c<K, V> mo13977a(K k) {
        return (C3912c) this.f9688X.get(k);
    }

    /* renamed from: b */
    public V mo13978b(K k, V v) {
        C3912c a = mo13977a(k);
        if (a != null) {
            return a.f9693U;
        }
        this.f9688X.put(k, mo13982a(k, v));
        return null;
    }

    public boolean contains(K k) {
        return this.f9688X.containsKey(k);
    }

    public V remove(K k) {
        V remove = super.remove(k);
        this.f9688X.remove(k);
        return remove;
    }

    /* renamed from: b */
    public Entry<K, V> mo13979b(K k) {
        if (contains(k)) {
            return ((C3912c) this.f9688X.get(k)).f9695W;
        }
        return null;
    }
}
