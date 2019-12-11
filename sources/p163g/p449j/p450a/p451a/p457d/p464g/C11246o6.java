package p163g.p449j.p450a.p451a.p457d.p464g;

import java.util.Map.Entry;

/* renamed from: g.j.a.a.d.g.o6 */
final class C11246o6 implements Comparable<C11246o6>, Entry<K, V> {

    /* renamed from: U */
    private V f26389U;

    /* renamed from: V */
    private final /* synthetic */ C11169j6 f26390V;

    /* renamed from: c */
    private final K f26391c;

    C11246o6(C11169j6 j6Var, Entry<K, V> entry) {
        this(j6Var, (Comparable) entry.getKey(), entry.getValue());
    }

    /* renamed from: a */
    private static boolean m35866a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((C11246o6) obj).getKey());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        return m35866a(this.f26391c, entry.getKey()) && m35866a(this.f26389U, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.f26391c;
    }

    public final V getValue() {
        return this.f26389U;
    }

    public final int hashCode() {
        K k = this.f26391c;
        int i = 0;
        int hashCode = k == null ? 0 : k.hashCode();
        V v = this.f26389U;
        if (v != null) {
            i = v.hashCode();
        }
        return hashCode ^ i;
    }

    public final V setValue(V v) {
        this.f26390V.m35414f();
        V v2 = this.f26389U;
        this.f26389U = v;
        return v2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f26391c);
        String valueOf2 = String.valueOf(this.f26389U);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }

    C11246o6(C11169j6 j6Var, K k, V v) {
        this.f26390V = j6Var;
        this.f26391c = k;
        this.f26389U = v;
    }
}
