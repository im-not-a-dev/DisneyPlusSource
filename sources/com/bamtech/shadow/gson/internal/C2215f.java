package com.bamtech.shadow.gson.internal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: com.bamtech.shadow.gson.internal.f */
/* compiled from: LinkedTreeMap */
public final class C2215f<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: a0 */
    private static final Comparator<Comparable> f6304a0 = new C2216a();

    /* renamed from: U */
    C2222e<K, V> f6305U;

    /* renamed from: V */
    int f6306V;

    /* renamed from: W */
    int f6307W;

    /* renamed from: X */
    final C2222e<K, V> f6308X;

    /* renamed from: Y */
    private C2217b f6309Y;

    /* renamed from: Z */
    private C2219c f6310Z;

    /* renamed from: c */
    Comparator<? super K> f6311c;

    /* renamed from: com.bamtech.shadow.gson.internal.f$a */
    /* compiled from: LinkedTreeMap */
    static class C2216a implements Comparator<Comparable> {
        C2216a() {
        }

        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* renamed from: com.bamtech.shadow.gson.internal.f$b */
    /* compiled from: LinkedTreeMap */
    class C2217b extends AbstractSet<Entry<K, V>> {

        /* renamed from: com.bamtech.shadow.gson.internal.f$b$a */
        /* compiled from: LinkedTreeMap */
        class C2218a extends C2221d<Entry<K, V>> {
            C2218a(C2217b bVar) {
                super();
            }

            public Entry<K, V> next() {
                return mo11236a();
            }
        }

        C2217b() {
        }

        public void clear() {
            C2215f.this.clear();
        }

        public boolean contains(Object obj) {
            return (obj instanceof Entry) && C2215f.this.mo11210a((Entry) obj) != null;
        }

        public Iterator<Entry<K, V>> iterator() {
            return new C2218a(this);
        }

        public boolean remove(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            C2222e a = C2215f.this.mo11210a((Entry) obj);
            if (a == null) {
                return false;
            }
            C2215f.this.mo11211a(a, true);
            return true;
        }

        public int size() {
            return C2215f.this.f6306V;
        }
    }

    /* renamed from: com.bamtech.shadow.gson.internal.f$c */
    /* compiled from: LinkedTreeMap */
    final class C2219c extends AbstractSet<K> {

        /* renamed from: com.bamtech.shadow.gson.internal.f$c$a */
        /* compiled from: LinkedTreeMap */
        class C2220a extends C2221d<K> {
            C2220a(C2219c cVar) {
                super();
            }

            public K next() {
                return mo11236a().f6322Y;
            }
        }

        C2219c() {
        }

        public void clear() {
            C2215f.this.clear();
        }

        public boolean contains(Object obj) {
            return C2215f.this.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return new C2220a(this);
        }

        public boolean remove(Object obj) {
            return C2215f.this.mo11213c(obj) != null;
        }

        public int size() {
            return C2215f.this.f6306V;
        }
    }

    /* renamed from: com.bamtech.shadow.gson.internal.f$d */
    /* compiled from: LinkedTreeMap */
    private abstract class C2221d<T> implements Iterator<T> {

        /* renamed from: U */
        C2222e<K, V> f6314U = null;

        /* renamed from: V */
        int f6315V;

        /* renamed from: c */
        C2222e<K, V> f6317c;

        C2221d() {
            C2215f fVar = C2215f.this;
            this.f6317c = fVar.f6308X.f6320W;
            this.f6315V = fVar.f6307W;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C2222e<K, V> mo11236a() {
            C2222e<K, V> eVar = this.f6317c;
            C2215f fVar = C2215f.this;
            if (eVar == fVar.f6308X) {
                throw new NoSuchElementException();
            } else if (fVar.f6307W == this.f6315V) {
                this.f6317c = eVar.f6320W;
                this.f6314U = eVar;
                return eVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.f6317c != C2215f.this.f6308X;
        }

        public final void remove() {
            C2222e<K, V> eVar = this.f6314U;
            if (eVar != null) {
                C2215f.this.mo11211a(eVar, true);
                this.f6314U = null;
                this.f6315V = C2215f.this.f6307W;
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: com.bamtech.shadow.gson.internal.f$e */
    /* compiled from: LinkedTreeMap */
    static final class C2222e<K, V> implements Entry<K, V> {

        /* renamed from: U */
        C2222e<K, V> f6318U;

        /* renamed from: V */
        C2222e<K, V> f6319V;

        /* renamed from: W */
        C2222e<K, V> f6320W;

        /* renamed from: X */
        C2222e<K, V> f6321X;

        /* renamed from: Y */
        final K f6322Y;

        /* renamed from: Z */
        V f6323Z;

        /* renamed from: a0 */
        int f6324a0;

        /* renamed from: c */
        C2222e<K, V> f6325c;

        C2222e() {
            this.f6322Y = null;
            this.f6321X = this;
            this.f6320W = this;
        }

        /* renamed from: a */
        public C2222e<K, V> mo11239a() {
            C2222e eVar = this;
            for (C2222e eVar2 = this.f6318U; eVar2 != null; eVar2 = eVar2.f6318U) {
                eVar = eVar2;
            }
            return eVar;
        }

        /* renamed from: b */
        public C2222e<K, V> mo11240b() {
            C2222e eVar = this;
            for (C2222e eVar2 = this.f6319V; eVar2 != null; eVar2 = eVar2.f6319V) {
                eVar = eVar2;
            }
            return eVar;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            K k = this.f6322Y;
            if (k == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k.equals(entry.getKey())) {
                return false;
            }
            V v = this.f6323Z;
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
            return this.f6322Y;
        }

        public V getValue() {
            return this.f6323Z;
        }

        public int hashCode() {
            K k = this.f6322Y;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f6323Z;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            V v2 = this.f6323Z;
            this.f6323Z = v;
            return v2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f6322Y);
            sb.append("=");
            sb.append(this.f6323Z);
            return sb.toString();
        }

        C2222e(C2222e<K, V> eVar, K k, C2222e<K, V> eVar2, C2222e<K, V> eVar3) {
            this.f6325c = eVar;
            this.f6322Y = k;
            this.f6324a0 = 1;
            this.f6320W = eVar2;
            this.f6321X = eVar3;
            eVar3.f6320W = this;
            eVar2.f6321X = this;
        }
    }

    static {
        Class<C2215f> cls = C2215f.class;
    }

    public C2215f() {
        this(f6304a0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C2222e<K, V> mo11209a(K k, boolean z) {
        int i;
        C2222e<K, V> eVar;
        Comparator<? super K> comparator = this.f6311c;
        C2222e<K, V> eVar2 = this.f6305U;
        if (eVar2 != null) {
            Comparable comparable = comparator == f6304a0 ? (Comparable) k : null;
            while (true) {
                if (comparable != null) {
                    i = comparable.compareTo(eVar2.f6322Y);
                } else {
                    i = comparator.compare(k, eVar2.f6322Y);
                }
                if (i == 0) {
                    return eVar2;
                }
                C2222e<K, V> eVar3 = i < 0 ? eVar2.f6318U : eVar2.f6319V;
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
        C2222e<K, V> eVar4 = this.f6308X;
        if (eVar2 != null) {
            eVar = new C2222e<>(eVar2, k, eVar4, eVar4.f6321X);
            if (i < 0) {
                eVar2.f6318U = eVar;
            } else {
                eVar2.f6319V = eVar;
            }
            m8559b(eVar2, true);
        } else if (comparator != f6304a0 || (k instanceof Comparable)) {
            eVar = new C2222e<>(eVar2, k, eVar4, eVar4.f6321X);
            this.f6305U = eVar;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(k.getClass().getName());
            sb.append(" is not Comparable");
            throw new ClassCastException(sb.toString());
        }
        this.f6306V++;
        this.f6307W++;
        return eVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C2222e<K, V> mo11212b(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return mo11209a((K) obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C2222e<K, V> mo11213c(Object obj) {
        C2222e<K, V> b = mo11212b(obj);
        if (b != null) {
            mo11211a(b, true);
        }
        return b;
    }

    public void clear() {
        this.f6305U = null;
        this.f6306V = 0;
        this.f6307W++;
        C2222e<K, V> eVar = this.f6308X;
        eVar.f6321X = eVar;
        eVar.f6320W = eVar;
    }

    public boolean containsKey(Object obj) {
        return mo11212b(obj) != null;
    }

    public Set<Entry<K, V>> entrySet() {
        C2217b bVar = this.f6309Y;
        if (bVar != null) {
            return bVar;
        }
        C2217b bVar2 = new C2217b<>();
        this.f6309Y = bVar2;
        return bVar2;
    }

    public V get(Object obj) {
        C2222e b = mo11212b(obj);
        if (b != null) {
            return b.f6323Z;
        }
        return null;
    }

    public Set<K> keySet() {
        C2219c cVar = this.f6310Z;
        if (cVar != null) {
            return cVar;
        }
        C2219c cVar2 = new C2219c<>();
        this.f6310Z = cVar2;
        return cVar2;
    }

    public V put(K k, V v) {
        if (k != null) {
            C2222e a = mo11209a(k, true);
            V v2 = a.f6323Z;
            a.f6323Z = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    public V remove(Object obj) {
        C2222e c = mo11213c(obj);
        if (c != null) {
            return c.f6323Z;
        }
        return null;
    }

    public int size() {
        return this.f6306V;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.Comparator<? super K>, code=java.util.Comparator, for r2v0, types: [java.util.Comparator<? super K>, java.util.Comparator] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2215f(java.util.Comparator r2) {
        /*
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f6306V = r0
            r1.f6307W = r0
            com.bamtech.shadow.gson.internal.f$e r0 = new com.bamtech.shadow.gson.internal.f$e
            r0.<init>()
            r1.f6308X = r0
            if (r2 == 0) goto L_0x0012
            goto L_0x0014
        L_0x0012:
            java.util.Comparator<java.lang.Comparable> r2 = f6304a0
        L_0x0014:
            r1.f6311c = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.shadow.gson.internal.C2215f.<init>(java.util.Comparator):void");
    }

    /* renamed from: b */
    private void m8559b(C2222e<K, V> eVar, boolean z) {
        while (eVar != null) {
            C2222e<K, V> eVar2 = eVar.f6318U;
            C2222e<K, V> eVar3 = eVar.f6319V;
            int i = 0;
            int i2 = eVar2 != null ? eVar2.f6324a0 : 0;
            int i3 = eVar3 != null ? eVar3.f6324a0 : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                C2222e<K, V> eVar4 = eVar3.f6318U;
                C2222e<K, V> eVar5 = eVar3.f6319V;
                int i5 = eVar5 != null ? eVar5.f6324a0 : 0;
                if (eVar4 != null) {
                    i = eVar4.f6324a0;
                }
                int i6 = i - i5;
                if (i6 == -1 || (i6 == 0 && !z)) {
                    m8555a(eVar);
                } else {
                    m8558b(eVar3);
                    m8555a(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                C2222e<K, V> eVar6 = eVar2.f6318U;
                C2222e<K, V> eVar7 = eVar2.f6319V;
                int i7 = eVar7 != null ? eVar7.f6324a0 : 0;
                if (eVar6 != null) {
                    i = eVar6.f6324a0;
                }
                int i8 = i - i7;
                if (i8 == 1 || (i8 == 0 && !z)) {
                    m8558b(eVar);
                } else {
                    m8555a(eVar2);
                    m8558b(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                eVar.f6324a0 = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.f6324a0 = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.f6325c;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C2222e<K, V> mo11210a(Entry<?, ?> entry) {
        C2222e<K, V> b = mo11212b(entry.getKey());
        if (b != null && m8557a((Object) b.f6323Z, entry.getValue())) {
            return b;
        }
        return null;
    }

    /* renamed from: a */
    private boolean m8557a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo11211a(C2222e<K, V> eVar, boolean z) {
        int i;
        if (z) {
            C2222e<K, V> eVar2 = eVar.f6321X;
            eVar2.f6320W = eVar.f6320W;
            eVar.f6320W.f6321X = eVar2;
        }
        C2222e<K, V> eVar3 = eVar.f6318U;
        C2222e<K, V> eVar4 = eVar.f6319V;
        C2222e<K, V> eVar5 = eVar.f6325c;
        int i2 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                m8556a(eVar, eVar3);
                eVar.f6318U = null;
            } else if (eVar4 != null) {
                m8556a(eVar, eVar4);
                eVar.f6319V = null;
            } else {
                m8556a(eVar, null);
            }
            m8559b(eVar5, false);
            this.f6306V--;
            this.f6307W++;
            return;
        }
        C2222e<K, V> b = eVar3.f6324a0 > eVar4.f6324a0 ? eVar3.mo11240b() : eVar4.mo11239a();
        mo11211a(b, false);
        C2222e<K, V> eVar6 = eVar.f6318U;
        if (eVar6 != null) {
            i = eVar6.f6324a0;
            b.f6318U = eVar6;
            eVar6.f6325c = b;
            eVar.f6318U = null;
        } else {
            i = 0;
        }
        C2222e<K, V> eVar7 = eVar.f6319V;
        if (eVar7 != null) {
            i2 = eVar7.f6324a0;
            b.f6319V = eVar7;
            eVar7.f6325c = b;
            eVar.f6319V = null;
        }
        b.f6324a0 = Math.max(i, i2) + 1;
        m8556a(eVar, b);
    }

    /* renamed from: b */
    private void m8558b(C2222e<K, V> eVar) {
        C2222e<K, V> eVar2 = eVar.f6318U;
        C2222e<K, V> eVar3 = eVar.f6319V;
        C2222e<K, V> eVar4 = eVar2.f6318U;
        C2222e<K, V> eVar5 = eVar2.f6319V;
        eVar.f6318U = eVar5;
        if (eVar5 != null) {
            eVar5.f6325c = eVar;
        }
        m8556a(eVar, eVar2);
        eVar2.f6319V = eVar;
        eVar.f6325c = eVar2;
        int i = 0;
        eVar.f6324a0 = Math.max(eVar3 != null ? eVar3.f6324a0 : 0, eVar5 != null ? eVar5.f6324a0 : 0) + 1;
        int i2 = eVar.f6324a0;
        if (eVar4 != null) {
            i = eVar4.f6324a0;
        }
        eVar2.f6324a0 = Math.max(i2, i) + 1;
    }

    /* renamed from: a */
    private void m8556a(C2222e<K, V> eVar, C2222e<K, V> eVar2) {
        C2222e<K, V> eVar3 = eVar.f6325c;
        eVar.f6325c = null;
        if (eVar2 != null) {
            eVar2.f6325c = eVar3;
        }
        if (eVar3 == null) {
            this.f6305U = eVar2;
        } else if (eVar3.f6318U == eVar) {
            eVar3.f6318U = eVar2;
        } else {
            eVar3.f6319V = eVar2;
        }
    }

    /* renamed from: a */
    private void m8555a(C2222e<K, V> eVar) {
        C2222e<K, V> eVar2 = eVar.f6318U;
        C2222e<K, V> eVar3 = eVar.f6319V;
        C2222e<K, V> eVar4 = eVar3.f6318U;
        C2222e<K, V> eVar5 = eVar3.f6319V;
        eVar.f6319V = eVar4;
        if (eVar4 != null) {
            eVar4.f6325c = eVar;
        }
        m8556a(eVar, eVar3);
        eVar3.f6318U = eVar;
        eVar.f6325c = eVar3;
        int i = 0;
        eVar.f6324a0 = Math.max(eVar2 != null ? eVar2.f6324a0 : 0, eVar4 != null ? eVar4.f6324a0 : 0) + 1;
        int i2 = eVar.f6324a0;
        if (eVar5 != null) {
            i = eVar5.f6324a0;
        }
        eVar3.f6324a0 = Math.max(i2, i) + 1;
    }
}
