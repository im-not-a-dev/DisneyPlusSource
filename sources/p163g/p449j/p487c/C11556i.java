package p163g.p449j.p487c;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: g.j.c.i */
/* compiled from: JsonArray */
public final class C11556i extends C11559l implements Iterable<C11559l> {

    /* renamed from: c */
    private final List<C11559l> f27021c = new ArrayList();

    /* renamed from: a */
    public void mo29533a(C11559l lVar) {
        if (lVar == null) {
            lVar = C11561n.f27022a;
        }
        this.f27021c.add(lVar);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C11556i) && ((C11556i) obj).f27021c.equals(this.f27021c));
    }

    public int hashCode() {
        return this.f27021c.hashCode();
    }

    public Iterator<C11559l> iterator() {
        return this.f27021c.iterator();
    }
}
