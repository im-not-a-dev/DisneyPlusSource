package p163g.p174d.p178b.p193j0;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p163g.p174d.p178b.C5326w;

/* renamed from: g.d.b.j0.e */
/* compiled from: TrackList */
public class C5291e implements Iterable<C5290d> {

    /* renamed from: U */
    List<C5293f> f12662U;

    /* renamed from: V */
    List<C5285a> f12663V;

    /* renamed from: W */
    List<C5288c> f12664W;

    /* renamed from: X */
    List<C5288c> f12665X;

    /* renamed from: Y */
    List<C5290d> f12666Y;

    /* renamed from: c */
    private WeakReference<C5326w> f12667c;

    @Deprecated
    /* renamed from: g.d.b.j0.e$a */
    /* compiled from: TrackList */
    static class C5292a implements Iterator<C5290d> {

        /* renamed from: U */
        private final Iterator<C5293f> f12668U = this.f12673c.f12662U.iterator();

        /* renamed from: V */
        private final Iterator<C5285a> f12669V = this.f12673c.f12663V.iterator();

        /* renamed from: W */
        private final Iterator<C5288c> f12670W = this.f12673c.f12664W.iterator();

        /* renamed from: X */
        private final Iterator<C5288c> f12671X = this.f12673c.f12665X.iterator();

        /* renamed from: Y */
        private final Iterator<C5290d> f12672Y = this.f12673c.f12666Y.iterator();

        /* renamed from: c */
        private final C5291e f12673c;

        C5292a(C5291e eVar) {
            this.f12673c = eVar;
        }

        public boolean hasNext() {
            return this.f12668U.hasNext() || this.f12669V.hasNext() || this.f12670W.hasNext() || this.f12671X.hasNext() || this.f12672Y.hasNext();
        }

        public C5290d next() {
            if (this.f12668U.hasNext()) {
                return (C5290d) this.f12668U.next();
            }
            if (this.f12669V.hasNext()) {
                return (C5290d) this.f12669V.next();
            }
            if (this.f12670W.hasNext()) {
                return (C5290d) this.f12670W.next();
            }
            if (this.f12671X.hasNext()) {
                return (C5290d) this.f12671X.next();
            }
            return (C5290d) this.f12672Y.next();
        }
    }

    public C5291e() {
        this.f12662U = new ArrayList();
        this.f12663V = new ArrayList();
        this.f12664W = new ArrayList();
        this.f12666Y = new ArrayList();
        this.f12665X = new ArrayList();
    }

    /* renamed from: a */
    private void m17740a(Collection<C5290d> collection) {
        for (C5290d a : collection) {
            mo16876a(a);
        }
    }

    /* renamed from: b */
    public void mo16877b() {
        if (!this.f12664W.isEmpty()) {
            this.f12664W.add(0, new C5286b((C5326w) this.f12667c.get()));
        }
    }

    /* renamed from: c */
    public Collection<C5285a> mo16879c() {
        HashMap hashMap = new HashMap();
        for (C5285a aVar : this.f12663V) {
            hashMap.put(aVar.mo16867a(), aVar);
        }
        return hashMap.values();
    }

    /* renamed from: d */
    public List<C5285a> mo16880d() {
        return this.f12663V;
    }

    /* renamed from: e */
    public List<C5288c> mo16881e() {
        return this.f12664W;
    }

    public Iterator<C5290d> iterator() {
        return new C5292a(this);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TrackList: ");
        Iterator it = iterator();
        while (true) {
            str = ",\n";
            if (!it.hasNext()) {
                break;
            }
            sb.append(((C5290d) it.next()).toString());
            sb.append(str);
        }
        for (C5290d dVar : this.f12665X) {
            sb.append(dVar.toString());
            sb.append(str);
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public void mo16875a(C5288c cVar) {
        if (cVar == null) {
            return;
        }
        if (cVar.mo16863h()) {
            this.f12665X.add(cVar);
        } else {
            this.f12664W.add(cVar);
        }
    }

    /* renamed from: b */
    public boolean mo16878b(C5290d dVar) {
        boolean z = (dVar == null || dVar.mo16871d() == null || dVar.mo16871d().get() != null) ? false : true;
        WeakReference<C5326w> weakReference = this.f12667c;
        boolean z2 = (weakReference == null || weakReference.get() == null) ? false : true;
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo16876a(C5290d dVar) {
        if (mo16878b(dVar)) {
            dVar.mo16868a(this.f12667c);
        }
        if (dVar instanceof C5293f) {
            this.f12662U.add((C5293f) dVar);
        } else if (dVar instanceof C5285a) {
            this.f12663V.add((C5285a) dVar);
        } else if (dVar instanceof C5288c) {
            mo16875a((C5288c) dVar);
        } else {
            this.f12666Y.add(dVar);
        }
    }

    public C5291e(Collection<C5290d> collection) {
        this();
        m17740a(collection);
    }

    public C5291e(C5326w wVar, Collection<C5290d> collection) {
        this();
        this.f12667c = new WeakReference<>(wVar);
        m17740a(collection);
    }
}
