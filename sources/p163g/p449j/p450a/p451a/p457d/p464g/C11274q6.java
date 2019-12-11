package p163g.p449j.p450a.p451a.p457d.p464g;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: g.j.a.a.d.g.q6 */
class C11274q6 extends AbstractSet<Entry<K, V>> {

    /* renamed from: c */
    private final /* synthetic */ C11169j6 f26447c;

    private C11274q6(C11169j6 j6Var) {
        this.f26447c = j6Var;
    }

    public /* synthetic */ boolean add(Object obj) {
        Entry entry = (Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f26447c.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public void clear() {
        this.f26447c.clear();
    }

    public boolean contains(Object obj) {
        Entry entry = (Entry) obj;
        Object obj2 = this.f26447c.get(entry.getKey());
        Object value = entry.getValue();
        return obj2 == value || (obj2 != null && obj2.equals(value));
    }

    public Iterator<Entry<K, V>> iterator() {
        return new C11289r6(this.f26447c, null);
    }

    public boolean remove(Object obj) {
        Entry entry = (Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f26447c.remove(entry.getKey());
        return true;
    }

    public int size() {
        return this.f26447c.size();
    }

    /* synthetic */ C11274q6(C11169j6 j6Var, C11155i6 i6Var) {
        this(j6Var);
    }
}
