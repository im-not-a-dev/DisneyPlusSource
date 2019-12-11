package p163g.p449j.p487c;

import java.util.Map.Entry;
import java.util.Set;
import p163g.p449j.p487c.p490y.C11603g;

/* renamed from: g.j.c.o */
/* compiled from: JsonObject */
public final class C11562o extends C11559l {

    /* renamed from: a */
    private final C11603g<String, C11559l> f27023a = new C11603g<>();

    /* renamed from: a */
    public void mo29548a(String str, C11559l lVar) {
        if (lVar == null) {
            lVar = C11561n.f27022a;
        }
        this.f27023a.put(str, lVar);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C11562o) && ((C11562o) obj).f27023a.equals(this.f27023a));
    }

    public int hashCode() {
        return this.f27023a.hashCode();
    }

    /* renamed from: i */
    public Set<Entry<String, C11559l>> mo29551i() {
        return this.f27023a.entrySet();
    }
}
