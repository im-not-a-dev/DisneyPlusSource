package kotlin.reflect.jvm.internal.pcollections;

import java.io.Serializable;

final class MapEntry<K, V> implements Serializable {
    public final K key;
    public final V value;

    public MapEntry(K k, V v) {
        this.key = k;
        this.value = v;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof MapEntry)) {
            return false;
        }
        MapEntry mapEntry = (MapEntry) obj;
        K k = this.key;
        if (k != null ? k.equals(mapEntry.key) : mapEntry.key == null) {
            V v = this.value;
            V v2 = mapEntry.value;
            if (v != null ? v.equals(v2) : v2 == null) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        K k = this.key;
        int i = 0;
        int hashCode = k == null ? 0 : k.hashCode();
        V v = this.value;
        if (v != null) {
            i = v.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.key);
        sb.append("=");
        sb.append(this.value);
        return sb.toString();
    }
}
