package p163g.p449j.p450a.p451a.p457d.p464g;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: g.j.a.a.d.g.v4 */
final class C11344v4<K> implements Iterator<Entry<K, Object>> {

    /* renamed from: c */
    private Iterator<Entry<K, Object>> f26579c;

    public C11344v4(Iterator<Entry<K, Object>> it) {
        this.f26579c = it;
    }

    public final boolean hasNext() {
        return this.f26579c.hasNext();
    }

    public final /* synthetic */ Object next() {
        Entry entry = (Entry) this.f26579c.next();
        return entry.getValue() instanceof C11272q4 ? new C11301s4(entry) : entry;
    }

    public final void remove() {
        this.f26579c.remove();
    }
}
