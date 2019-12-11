package p163g.p449j.p450a.p451a.p457d.p464g;

import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: g.j.a.a.d.g.l6 */
final class C11205l6 implements Iterator<Entry<K, V>> {

    /* renamed from: U */
    private Iterator<Entry<K, V>> f26349U;

    /* renamed from: V */
    private final /* synthetic */ C11169j6 f26350V;

    /* renamed from: c */
    private int f26351c;

    private C11205l6(C11169j6 j6Var) {
        this.f26350V = j6Var;
        this.f26351c = this.f26350V.f26271U.size();
    }

    /* renamed from: a */
    private final Iterator<Entry<K, V>> m35717a() {
        if (this.f26349U == null) {
            this.f26349U = this.f26350V.f26275Y.entrySet().iterator();
        }
        return this.f26349U;
    }

    public final boolean hasNext() {
        int i = this.f26351c;
        return (i > 0 && i <= this.f26350V.f26271U.size()) || m35717a().hasNext();
    }

    public final /* synthetic */ Object next() {
        if (m35717a().hasNext()) {
            return (Entry) m35717a().next();
        }
        List b = this.f26350V.f26271U;
        int i = this.f26351c - 1;
        this.f26351c = i;
        return (Entry) b.get(i);
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* synthetic */ C11205l6(C11169j6 j6Var, C11155i6 i6Var) {
        this(j6Var);
    }
}
