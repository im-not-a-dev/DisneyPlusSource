package p163g.p449j.p487c.p490y;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: g.j.c.y.g */
/* compiled from: LinkedTreeMap */
public final class C11603g<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: a0 */
    private static final Comparator<Comparable> f27062a0 = new C11604a();

    /* renamed from: U */
    C11610e<K, V> f27063U;

    /* renamed from: V */
    int f27064V;

    /* renamed from: W */
    int f27065W;

    /* renamed from: X */
    final C11610e<K, V> f27066X;

    /* renamed from: Y */
    private C11605b f27067Y;

    /* renamed from: Z */
    private C11607c f27068Z;

    /* renamed from: c */
    Comparator<? super K> f27069c;

    /* renamed from: g.j.c.y.g$a */
    /* compiled from: LinkedTreeMap */
    static class C11604a implements Comparator<Comparable> {
        C11604a() {
        }

        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* renamed from: g.j.c.y.g$b */
    /* compiled from: LinkedTreeMap */
    class C11605b extends AbstractSet<Entry<K, V>> {

        /* renamed from: g.j.c.y.g$b$a */
        /* compiled from: LinkedTreeMap */
        class C11606a extends C11609d<Entry<K, V>> {
            C11606a(C11605b bVar) {
                super();
            }

            public Entry<K, V> next() {
                return mo29631a();
            }
        }

        C11605b() {
        }

        public void clear() {
            C11603g.this.clear();
        }

        public boolean contains(Object obj) {
            return (obj instanceof Entry) && C11603g.this.mo29605a((Entry) obj) != null;
        }

        public Iterator<Entry<K, V>> iterator() {
            return new C11606a(this);
        }

        public boolean remove(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            C11610e a = C11603g.this.mo29605a((Entry) obj);
            if (a == null) {
                return false;
            }
            C11603g.this.mo29606a(a, true);
            return true;
        }

        public int size() {
            return C11603g.this.f27064V;
        }
    }

    /* renamed from: g.j.c.y.g$c */
    /* compiled from: LinkedTreeMap */
    final class C11607c extends AbstractSet<K> {

        /* renamed from: g.j.c.y.g$c$a */
        /* compiled from: LinkedTreeMap */
        class C11608a extends C11609d<K> {
            C11608a(C11607c cVar) {
                super();
            }

            public K next() {
                return mo29631a().f27080Y;
            }
        }

        C11607c() {
        }

        public void clear() {
            C11603g.this.clear();
        }

        public boolean contains(Object obj) {
            return C11603g.this.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return new C11608a(this);
        }

        public boolean remove(Object obj) {
            return C11603g.this.mo29608c(obj) != null;
        }

        public int size() {
            return C11603g.this.f27064V;
        }
    }

    /* renamed from: g.j.c.y.g$d */
    /* compiled from: LinkedTreeMap */
    private abstract class C11609d<T> implements Iterator<T> {

        /* renamed from: U */
        C11610e<K, V> f27072U = null;

        /* renamed from: V */
        int f27073V;

        /* renamed from: c */
        C11610e<K, V> f27075c;

        C11609d() {
            C11603g gVar = C11603g.this;
            this.f27075c = gVar.f27066X.f27078W;
            this.f27073V = gVar.f27065W;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C11610e<K, V> mo29631a() {
            C11610e<K, V> eVar = this.f27075c;
            C11603g gVar = C11603g.this;
            if (eVar == gVar.f27066X) {
                throw new NoSuchElementException();
            } else if (gVar.f27065W == this.f27073V) {
                this.f27075c = eVar.f27078W;
                this.f27072U = eVar;
                return eVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.f27075c != C11603g.this.f27066X;
        }

        public final void remove() {
            C11610e<K, V> eVar = this.f27072U;
            if (eVar != null) {
                C11603g.this.mo29606a(eVar, true);
                this.f27072U = null;
                this.f27073V = C11603g.this.f27065W;
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: g.j.c.y.g$e */
    /* compiled from: LinkedTreeMap */
    static final class C11610e<K, V> implements Entry<K, V> {

        /* renamed from: U */
        C11610e<K, V> f27076U;

        /* renamed from: V */
        C11610e<K, V> f27077V;

        /* renamed from: W */
        C11610e<K, V> f27078W;

        /* renamed from: X */
        C11610e<K, V> f27079X;

        /* renamed from: Y */
        final K f27080Y;

        /* renamed from: Z */
        V f27081Z;

        /* renamed from: a0 */
        int f27082a0;

        /* renamed from: c */
        C11610e<K, V> f27083c;

        C11610e() {
            this.f27080Y = null;
            this.f27079X = this;
            this.f27078W = this;
        }

        /* renamed from: a */
        public C11610e<K, V> mo29634a() {
            C11610e eVar = this;
            for (C11610e eVar2 = this.f27076U; eVar2 != null; eVar2 = eVar2.f27076U) {
                eVar = eVar2;
            }
            return eVar;
        }

        /* renamed from: b */
        public C11610e<K, V> mo29635b() {
            C11610e eVar = this;
            for (C11610e eVar2 = this.f27077V; eVar2 != null; eVar2 = eVar2.f27077V) {
                eVar = eVar2;
            }
            return eVar;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            K k = this.f27080Y;
            if (k == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k.equals(entry.getKey())) {
                return false;
            }
            V v = this.f27081Z;
            if (v == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!v.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        public K getKey() {
            return this.f27080Y;
        }

        public V getValue() {
            return this.f27081Z;
        }

        public int hashCode() {
            K k = this.f27080Y;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f27081Z;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            V v2 = this.f27081Z;
            this.f27081Z = v;
            return v2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f27080Y);
            sb.append("=");
            sb.append(this.f27081Z);
            return sb.toString();
        }

        C11610e(C11610e<K, V> eVar, K k, C11610e<K, V> eVar2, C11610e<K, V> eVar3) {
            this.f27083c = eVar;
            this.f27080Y = k;
            this.f27082a0 = 1;
            this.f27078W = eVar2;
            this.f27079X = eVar3;
            eVar3.f27078W = this;
            eVar2.f27079X = this;
        }
    }

    static {
        Class<C11603g> cls = C11603g.class;
    }

    public C11603g() {
        this(f27062a0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C11610e<K, V> mo29604a(K k, boolean z) {
        int i;
        C11610e<K, V> eVar;
        Comparator<? super K> comparator = this.f27069c;
        C11610e<K, V> eVar2 = this.f27063U;
        if (eVar2 != null) {
            Comparable comparable = comparator == f27062a0 ? (Comparable) k : null;
            while (true) {
                if (comparable != null) {
                    i = comparable.compareTo(eVar2.f27080Y);
                } else {
                    i = comparator.compare(k, eVar2.f27080Y);
                }
                if (i == 0) {
                    return eVar2;
                }
                C11610e<K, V> eVar3 = i < 0 ? eVar2.f27076U : eVar2.f27077V;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        C11610e<K, V> eVar4 = this.f27066X;
        if (eVar2 != null) {
            eVar = new C11610e<>(eVar2, k, eVar4, eVar4.f27079X);
            if (i < 0) {
                eVar2.f27076U = eVar;
            } else {
                eVar2.f27077V = eVar;
            }
            m37387b(eVar2, true);
        } else if (comparator != f27062a0 || (k instanceof Comparable)) {
            eVar = new C11610e<>(eVar2, k, eVar4, eVar4.f27079X);
            this.f27063U = eVar;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(k.getClass().getName());
            sb.append(" is not Comparable");
            throw new ClassCastException(sb.toString());
        }
        this.f27064V++;
        this.f27065W++;
        return eVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C11610e<K, V> mo29607b(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return mo29604a((K) obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C11610e<K, V> mo29608c(Object obj) {
        C11610e<K, V> b = mo29607b(obj);
        if (b != null) {
            mo29606a(b, true);
        }
        return b;
    }

    public void clear() {
        this.f27063U = null;
        this.f27064V = 0;
        this.f27065W++;
        C11610e<K, V> eVar = this.f27066X;
        eVar.f27079X = eVar;
        eVar.f27078W = eVar;
    }

    public boolean containsKey(Object obj) {
        return mo29607b(obj) != null;
    }

    public Set<Entry<K, V>> entrySet() {
        C11605b bVar = this.f27067Y;
        if (bVar != null) {
            return bVar;
        }
        C11605b bVar2 = new C11605b<>();
        this.f27067Y = bVar2;
        return bVar2;
    }

    public V get(Object obj) {
        C11610e b = mo29607b(obj);
        if (b != null) {
            return b.f27081Z;
        }
        return null;
    }

    public Set<K> keySet() {
        C11607c cVar = this.f27068Z;
        if (cVar != null) {
            return cVar;
        }
        C11607c cVar2 = new C11607c<>();
        this.f27068Z = cVar2;
        return cVar2;
    }

    public V put(K k, V v) {
        if (k != null) {
            C11610e a = mo29604a(k, true);
            V v2 = a.f27081Z;
            a.f27081Z = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    public V remove(Object obj) {
        C11610e c = mo29608c(obj);
        if (c != null) {
            return c.f27081Z;
        }
        return null;
    }

    public int size() {
        return this.f27064V;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.Comparator<? super K>, code=java.util.Comparator, for r2v0, types: [java.util.Comparator<? super K>, java.util.Comparator] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C11603g(java.util.Comparator r2) {
        /*
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f27064V = r0
            r1.f27065W = r0
            g.j.c.y.g$e r0 = new g.j.c.y.g$e
            r0.<init>()
            r1.f27066X = r0
            if (r2 == 0) goto L_0x0012
            goto L_0x0014
        L_0x0012:
            java.util.Comparator<java.lang.Comparable> r2 = f27062a0
        L_0x0014:
            r1.f27069c = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p449j.p487c.p490y.C11603g.<init>(java.util.Comparator):void");
    }

    /* renamed from: b */
    private void m37387b(C11610e<K, V> eVar, boolean z) {
        while (eVar != null) {
            C11610e<K, V> eVar2 = eVar.f27076U;
            C11610e<K, V> eVar3 = eVar.f27077V;
            int i = 0;
            int i2 = eVar2 != null ? eVar2.f27082a0 : 0;
            int i3 = eVar3 != null ? eVar3.f27082a0 : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                C11610e<K, V> eVar4 = eVar3.f27076U;
                C11610e<K, V> eVar5 = eVar3.f27077V;
                int i5 = eVar5 != null ? eVar5.f27082a0 : 0;
                if (eVar4 != null) {
                    i = eVar4.f27082a0;
                }
                int i6 = i - i5;
                if (i6 == -1 || (i6 == 0 && !z)) {
                    m37383a(eVar);
                } else {
                    m37386b(eVar3);
                    m37383a(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                C11610e<K, V> eVar6 = eVar2.f27076U;
                C11610e<K, V> eVar7 = eVar2.f27077V;
                int i7 = eVar7 != null ? eVar7.f27082a0 : 0;
                if (eVar6 != null) {
                    i = eVar6.f27082a0;
                }
                int i8 = i - i7;
                if (i8 == 1 || (i8 == 0 && !z)) {
                    m37386b(eVar);
                } else {
                    m37383a(eVar2);
                    m37386b(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                eVar.f27082a0 = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.f27082a0 = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.f27083c;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C11610e<K, V> mo29605a(Entry<?, ?> entry) {
        C11610e<K, V> b = mo29607b(entry.getKey());
        if (b != null && m37385a((Object) b.f27081Z, entry.getValue())) {
            return b;
        }
        return null;
    }

    /* renamed from: a */
    private boolean m37385a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo29606a(C11610e<K, V> eVar, boolean z) {
        int i;
        if (z) {
            C11610e<K, V> eVar2 = eVar.f27079X;
            eVar2.f27078W = eVar.f27078W;
            eVar.f27078W.f27079X = eVar2;
        }
        C11610e<K, V> eVar3 = eVar.f27076U;
        C11610e<K, V> eVar4 = eVar.f27077V;
        C11610e<K, V> eVar5 = eVar.f27083c;
        int i2 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                m37384a(eVar, eVar3);
                eVar.f27076U = null;
            } else if (eVar4 != null) {
                m37384a(eVar, eVar4);
                eVar.f27077V = null;
            } else {
                m37384a(eVar, null);
            }
            m37387b(eVar5, false);
            this.f27064V--;
            this.f27065W++;
            return;
        }
        C11610e<K, V> b = eVar3.f27082a0 > eVar4.f27082a0 ? eVar3.mo29635b() : eVar4.mo29634a();
        mo29606a(b, false);
        C11610e<K, V> eVar6 = eVar.f27076U;
        if (eVar6 != null) {
            i = eVar6.f27082a0;
            b.f27076U = eVar6;
            eVar6.f27083c = b;
            eVar.f27076U = null;
        } else {
            i = 0;
        }
        C11610e<K, V> eVar7 = eVar.f27077V;
        if (eVar7 != null) {
            i2 = eVar7.f27082a0;
            b.f27077V = eVar7;
            eVar7.f27083c = b;
            eVar.f27077V = null;
        }
        b.f27082a0 = Math.max(i, i2) + 1;
        m37384a(eVar, b);
    }

    /* renamed from: b */
    private void m37386b(C11610e<K, V> eVar) {
        C11610e<K, V> eVar2 = eVar.f27076U;
        C11610e<K, V> eVar3 = eVar.f27077V;
        C11610e<K, V> eVar4 = eVar2.f27076U;
        C11610e<K, V> eVar5 = eVar2.f27077V;
        eVar.f27076U = eVar5;
        if (eVar5 != null) {
            eVar5.f27083c = eVar;
        }
        m37384a(eVar, eVar2);
        eVar2.f27077V = eVar;
        eVar.f27083c = eVar2;
        int i = 0;
        eVar.f27082a0 = Math.max(eVar3 != null ? eVar3.f27082a0 : 0, eVar5 != null ? eVar5.f27082a0 : 0) + 1;
        int i2 = eVar.f27082a0;
        if (eVar4 != null) {
            i = eVar4.f27082a0;
        }
        eVar2.f27082a0 = Math.max(i2, i) + 1;
    }

    /* renamed from: a */
    private void m37384a(C11610e<K, V> eVar, C11610e<K, V> eVar2) {
        C11610e<K, V> eVar3 = eVar.f27083c;
        eVar.f27083c = null;
        if (eVar2 != null) {
            eVar2.f27083c = eVar3;
        }
        if (eVar3 == null) {
            this.f27063U = eVar2;
        } else if (eVar3.f27076U == eVar) {
            eVar3.f27076U = eVar2;
        } else {
            eVar3.f27077V = eVar2;
        }
    }

    /* renamed from: a */
    private void m37383a(C11610e<K, V> eVar) {
        C11610e<K, V> eVar2 = eVar.f27076U;
        C11610e<K, V> eVar3 = eVar.f27077V;
        C11610e<K, V> eVar4 = eVar3.f27076U;
        C11610e<K, V> eVar5 = eVar3.f27077V;
        eVar.f27077V = eVar4;
        if (eVar4 != null) {
            eVar4.f27083c = eVar;
        }
        m37384a(eVar, eVar3);
        eVar3.f27076U = eVar;
        eVar.f27083c = eVar3;
        int i = 0;
        eVar.f27082a0 = Math.max(eVar2 != null ? eVar2.f27082a0 : 0, eVar4 != null ? eVar4.f27082a0 : 0) + 1;
        int i2 = eVar.f27082a0;
        if (eVar5 != null) {
            i = eVar5.f27082a0;
        }
        eVar3.f27082a0 = Math.max(i2, i) + 1;
    }
}
