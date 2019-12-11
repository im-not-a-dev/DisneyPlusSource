package androidx.coordinatorlayout.widget;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p096e.p113e.C3941i;
import p096e.p121h.p134r.C4114f;
import p096e.p121h.p134r.C4115g;

/* renamed from: androidx.coordinatorlayout.widget.a */
/* compiled from: DirectedAcyclicGraph */
public final class C0451a<T> {

    /* renamed from: a */
    private final C4114f<ArrayList<T>> f2047a = new C4115g(10);

    /* renamed from: b */
    private final C3941i<T, ArrayList<T>> f2048b = new C3941i<>();

    /* renamed from: c */
    private final ArrayList<T> f2049c = new ArrayList<>();

    /* renamed from: d */
    private final HashSet<T> f2050d = new HashSet<>();

    /* renamed from: a */
    public void mo2570a(T t) {
        if (!this.f2048b.containsKey(t)) {
            this.f2048b.put(t, null);
        }
    }

    /* renamed from: b */
    public boolean mo2573b(T t) {
        return this.f2048b.containsKey(t);
    }

    /* renamed from: c */
    public List mo2574c(T t) {
        return (List) this.f2048b.get(t);
    }

    /* renamed from: d */
    public List<T> mo2575d(T t) {
        int size = this.f2048b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList arrayList2 = (ArrayList) this.f2048b.mo14157d(i);
            if (arrayList2 != null && arrayList2.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f2048b.mo14151b(i));
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public boolean mo2576e(T t) {
        int size = this.f2048b.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) this.f2048b.mo14157d(i);
            if (arrayList != null && arrayList.contains(t)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private ArrayList<T> m2461c() {
        ArrayList<T> arrayList = (ArrayList) this.f2047a.mo14666a();
        return arrayList == null ? new ArrayList<>() : arrayList;
    }

    /* renamed from: b */
    public ArrayList<T> mo2572b() {
        this.f2049c.clear();
        this.f2050d.clear();
        int size = this.f2048b.size();
        for (int i = 0; i < size; i++) {
            m2459a(this.f2048b.mo14151b(i), this.f2049c, this.f2050d);
        }
        return this.f2049c;
    }

    /* renamed from: a */
    public void mo2571a(T t, T t2) {
        if (!this.f2048b.containsKey(t) || !this.f2048b.containsKey(t2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayList = (ArrayList) this.f2048b.get(t);
        if (arrayList == null) {
            arrayList = m2461c();
            this.f2048b.put(t, arrayList);
        }
        arrayList.add(t2);
    }

    /* renamed from: a */
    public void mo2569a() {
        int size = this.f2048b.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) this.f2048b.mo14157d(i);
            if (arrayList != null) {
                m2460a(arrayList);
            }
        }
        this.f2048b.clear();
    }

    /* renamed from: a */
    private void m2459a(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (!hashSet.contains(t)) {
                hashSet.add(t);
                ArrayList arrayList2 = (ArrayList) this.f2048b.get(t);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        m2459a(arrayList2.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(t);
                arrayList.add(t);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    /* renamed from: a */
    private void m2460a(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f2047a.mo14667a(arrayList);
    }
}
