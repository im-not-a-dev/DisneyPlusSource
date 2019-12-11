package p163g.p174d.p178b.p184f0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: g.d.b.f0.b */
/* compiled from: DateRangePool */
public class C4957b {

    /* renamed from: a */
    Set<C4956a> f12179a = new HashSet();

    /* renamed from: b */
    List<C4956a> f12180b = new ArrayList();

    /* renamed from: c */
    int f12181c = 0;

    /* renamed from: b */
    private void m17189b() {
        Collections.sort(this.f12180b);
    }

    /* renamed from: a */
    public void mo16425a(List<C4956a> list) {
        boolean z = false;
        for (C4956a aVar : list) {
            if (!this.f12179a.contains(aVar)) {
                this.f12179a.add(aVar);
                this.f12180b.add(aVar);
                z = true;
            }
        }
        if (z) {
            m17189b();
        }
    }

    /* renamed from: b */
    public void mo16426b(long j) {
        if (!this.f12180b.isEmpty()) {
            for (int i = this.f12181c; i >= 0; i--) {
                if (i < this.f12180b.size() && !((C4956a) this.f12180b.get(i)).mo16417a(j)) {
                    this.f12181c = i;
                }
            }
        }
    }

    /* renamed from: a */
    public List<C4956a> mo16423a(long j) {
        if (this.f12180b.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = this.f12181c; i < this.f12180b.size(); i++) {
            if (i < this.f12180b.size()) {
                C4956a aVar = (C4956a) this.f12180b.get(i);
                if (!aVar.mo16417a(j)) {
                    return arrayList;
                }
                arrayList.add(aVar);
                this.f12181c++;
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo16424a() {
        this.f12179a.clear();
        this.f12180b.clear();
    }
}
