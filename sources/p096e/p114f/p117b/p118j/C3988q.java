package p096e.p114f.p117b.p118j;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: e.f.b.j.q */
/* compiled from: ResolutionNode */
public class C3988q {

    /* renamed from: a */
    HashSet<C3988q> f10139a = new HashSet<>(2);

    /* renamed from: b */
    int f10140b = 0;

    /* renamed from: a */
    public void mo14481a(C3988q qVar) {
        this.f10139a.add(qVar);
    }

    /* renamed from: b */
    public void mo14482b() {
        this.f10140b = 0;
        Iterator it = this.f10139a.iterator();
        while (it.hasNext()) {
            ((C3988q) it.next()).mo14482b();
        }
    }

    /* renamed from: c */
    public void mo14476c() {
        this.f10140b = 0;
        this.f10139a.clear();
    }

    /* renamed from: d */
    public void mo14477d() {
    }

    /* renamed from: a */
    public void mo14480a() {
        this.f10140b = 1;
        Iterator it = this.f10139a.iterator();
        while (it.hasNext()) {
            ((C3988q) it.next()).mo14477d();
        }
    }
}
