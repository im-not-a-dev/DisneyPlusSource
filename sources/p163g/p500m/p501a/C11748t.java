package p163g.p500m.p501a;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: g.m.a.t */
/* compiled from: LinkedHashTreeMap */
final class C11748t<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: b0 */
    private static final Comparator<Comparable> f27350b0 = new C11749a();

    /* renamed from: U */
    C11757g<K, V>[] f27351U;

    /* renamed from: V */
    final C11757g<K, V> f27352V;

    /* renamed from: W */
    int f27353W;

    /* renamed from: X */
    int f27354X;

    /* renamed from: Y */
    int f27355Y;

    /* renamed from: Z */
    private C11752d f27356Z;

    /* renamed from: a0 */
    private C11754e f27357a0;

    /* renamed from: c */
    Comparator<? super K> f27358c;

    /* renamed from: g.m.a.t$a */
    /* compiled from: LinkedHashTreeMap */
    class C11749a implements Comparator<Comparable> {
        C11749a() {
        }

        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* renamed from: g.m.a.t$b */
    /* compiled from: LinkedHashTreeMap */
    static final class C11750b<K, V> {

        /* renamed from: a */
        private C11757g<K, V> f27359a;

        /* renamed from: b */
        private int f27360b;

        /* renamed from: c */
        private int f27361c;

        /* renamed from: d */
        private int f27362d;

        C11750b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo29836a(int i) {
            this.f27360b = ((Integer.highestOneBit(i) * 2) - 1) - i;
            this.f27362d = 0;
            this.f27361c = 0;
            this.f27359a = null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo29837a(C11757g<K, V> gVar) {
            gVar.f27371V = null;
            gVar.f27378c = null;
            gVar.f27370U = null;
            gVar.f27377b0 = 1;
            int i = this.f27360b;
            if (i > 0) {
                int i2 = this.f27362d;
                if ((i2 & 1) == 0) {
                    this.f27362d = i2 + 1;
                    this.f27360b = i - 1;
                    this.f27361c++;
                }
            }
            gVar.f27378c = this.f27359a;
            this.f27359a = gVar;
            this.f27362d++;
            int i3 = this.f27360b;
            if (i3 > 0) {
                int i4 = this.f27362d;
                if ((i4 & 1) == 0) {
                    this.f27362d = i4 + 1;
                    this.f27360b = i3 - 1;
                    this.f27361c++;
                }
            }
            int i5 = 4;
            while (true) {
                int i6 = i5 - 1;
                if ((this.f27362d & i6) == i6) {
                    int i7 = this.f27361c;
                    if (i7 == 0) {
                        C11757g<K, V> gVar2 = this.f27359a;
                        C11757g<K, V> gVar3 = gVar2.f27378c;
                        C11757g<K, V> gVar4 = gVar3.f27378c;
                        gVar3.f27378c = gVar4.f27378c;
                        this.f27359a = gVar3;
                        gVar3.f27370U = gVar4;
                        gVar3.f27371V = gVar2;
                        gVar3.f27377b0 = gVar2.f27377b0 + 1;
                        gVar4.f27378c = gVar3;
                        gVar2.f27378c = gVar3;
                    } else if (i7 == 1) {
                        C11757g<K, V> gVar5 = this.f27359a;
                        C11757g<K, V> gVar6 = gVar5.f27378c;
                        this.f27359a = gVar6;
                        gVar6.f27371V = gVar5;
                        gVar6.f27377b0 = gVar5.f27377b0 + 1;
                        gVar5.f27378c = gVar6;
                        this.f27361c = 0;
                    } else if (i7 == 2) {
                        this.f27361c = 0;
                    }
                    i5 *= 2;
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C11757g<K, V> mo29835a() {
            C11757g<K, V> gVar = this.f27359a;
            if (gVar.f27378c == null) {
                return gVar;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: g.m.a.t$c */
    /* compiled from: LinkedHashTreeMap */
    static class C11751c<K, V> {

        /* renamed from: a */
        private C11757g<K, V> f27363a;

        C11751c() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo29839a(C11757g<K, V> gVar) {
            C11757g<K, V> gVar2 = null;
            while (true) {
                C11757g<K, V> gVar3 = gVar2;
                gVar2 = gVar;
                C11757g<K, V> gVar4 = gVar3;
                if (gVar2 != null) {
                    gVar2.f27378c = gVar4;
                    gVar = gVar2.f27370U;
                } else {
                    this.f27363a = gVar4;
                    return;
                }
            }
        }

        /* renamed from: a */
        public C11757g<K, V> mo29838a() {
            C11757g<K, V> gVar = this.f27363a;
            if (gVar == null) {
                return null;
            }
            C11757g<K, V> gVar2 = gVar.f27378c;
            gVar.f27378c = null;
            C11757g<K, V> gVar3 = gVar.f27371V;
            while (true) {
                C11757g<K, V> gVar4 = gVar2;
                gVar2 = gVar3;
                C11757g<K, V> gVar5 = gVar4;
                if (gVar2 != null) {
                    gVar2.f27378c = gVar5;
                    gVar3 = gVar2.f27370U;
                } else {
                    this.f27363a = gVar5;
                    return gVar;
                }
            }
        }
    }

    /* renamed from: g.m.a.t$d */
    /* compiled from: LinkedHashTreeMap */
    final class C11752d extends AbstractSet<Entry<K, V>> {

        /* renamed from: g.m.a.t$d$a */
        /* compiled from: LinkedHashTreeMap */
        class C11753a extends C11756f<Entry<K, V>> {
            C11753a(C11752d dVar) {
                super();
            }

            public Entry<K, V> next() {
                return mo29852a();
            }
        }

        C11752d() {
        }

        public void clear() {
            C11748t.this.clear();
        }

        public boolean contains(Object obj) {
            return (obj instanceof Entry) && C11748t.this.mo29821a((Entry) obj) != null;
        }

        public Iterator<Entry<K, V>> iterator() {
            return new C11753a(this);
        }

        public boolean remove(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            C11757g a = C11748t.this.mo29821a((Entry) obj);
            if (a == null) {
                return false;
            }
            C11748t.this.mo29822a(a, true);
            return true;
        }

        public int size() {
            return C11748t.this.f27353W;
        }
    }

    /* renamed from: g.m.a.t$e */
    /* compiled from: LinkedHashTreeMap */
    final class C11754e extends AbstractSet<K> {

        /* renamed from: g.m.a.t$e$a */
        /* compiled from: LinkedHashTreeMap */
        class C11755a extends C11756f<K> {
            C11755a(C11754e eVar) {
                super();
            }

            public K next() {
                return mo29852a().f27374Y;
            }
        }

        C11754e() {
        }

        public void clear() {
            C11748t.this.clear();
        }

        public boolean contains(Object obj) {
            return C11748t.this.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return new C11755a(this);
        }

        public boolean remove(Object obj) {
            return C11748t.this.mo29824c(obj) != null;
        }

        public int size() {
            return C11748t.this.f27353W;
        }
    }

    /* renamed from: g.m.a.t$f */
    /* compiled from: LinkedHashTreeMap */
    abstract class C11756f<T> implements Iterator<T> {

        /* renamed from: U */
        C11757g<K, V> f27366U = null;

        /* renamed from: V */
        int f27367V;

        /* renamed from: c */
        C11757g<K, V> f27369c;

        C11756f() {
            C11748t tVar = C11748t.this;
            this.f27369c = tVar.f27352V.f27372W;
            this.f27367V = tVar.f27354X;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C11757g<K, V> mo29852a() {
            C11757g<K, V> gVar = this.f27369c;
            C11748t tVar = C11748t.this;
            if (gVar == tVar.f27352V) {
                throw new NoSuchElementException();
            } else if (tVar.f27354X == this.f27367V) {
                this.f27369c = gVar.f27372W;
                this.f27366U = gVar;
                return gVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.f27369c != C11748t.this.f27352V;
        }

        public final void remove() {
            C11757g<K, V> gVar = this.f27366U;
            if (gVar != null) {
                C11748t.this.mo29822a(gVar, true);
                this.f27366U = null;
                this.f27367V = C11748t.this.f27354X;
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: g.m.a.t$g */
    /* compiled from: LinkedHashTreeMap */
    static final class C11757g<K, V> implements Entry<K, V> {

        /* renamed from: U */
        C11757g<K, V> f27370U;

        /* renamed from: V */
        C11757g<K, V> f27371V;

        /* renamed from: W */
        C11757g<K, V> f27372W;

        /* renamed from: X */
        C11757g<K, V> f27373X;

        /* renamed from: Y */
        final K f27374Y;

        /* renamed from: Z */
        final int f27375Z;

        /* renamed from: a0 */
        V f27376a0;

        /* renamed from: b0 */
        int f27377b0;

        /* renamed from: c */
        C11757g<K, V> f27378c;

        C11757g() {
            this.f27374Y = null;
            this.f27375Z = -1;
            this.f27373X = this;
            this.f27372W = this;
        }

        /* renamed from: a */
        public C11757g<K, V> mo29855a() {
            C11757g gVar = this;
            for (C11757g gVar2 = this.f27370U; gVar2 != null; gVar2 = gVar2.f27370U) {
                gVar = gVar2;
            }
            return gVar;
        }

        /* renamed from: b */
        public C11757g<K, V> mo29856b() {
            C11757g gVar = this;
            for (C11757g gVar2 = this.f27371V; gVar2 != null; gVar2 = gVar2.f27371V) {
                gVar = gVar2;
            }
            return gVar;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            K k = this.f27374Y;
            if (k == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k.equals(entry.getKey())) {
                return false;
            }
            V v = this.f27376a0;
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
            return this.f27374Y;
        }

        public V getValue() {
            return this.f27376a0;
        }

        public int hashCode() {
            K k = this.f27374Y;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f27376a0;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            V v2 = this.f27376a0;
            this.f27376a0 = v;
            return v2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f27374Y);
            sb.append("=");
            sb.append(this.f27376a0);
            return sb.toString();
        }

        C11757g(C11757g<K, V> gVar, K k, int i, C11757g<K, V> gVar2, C11757g<K, V> gVar3) {
            this.f27378c = gVar;
            this.f27374Y = k;
            this.f27375Z = i;
            this.f27377b0 = 1;
            this.f27372W = gVar2;
            this.f27373X = gVar3;
            gVar3.f27372W = this;
            gVar2.f27373X = this;
        }
    }

    static {
        Class<C11748t> cls = C11748t.class;
    }

    C11748t() {
        this(null);
    }

    /* renamed from: a */
    private static int m37840a(int i) {
        int i2 = i ^ ((i >>> 20) ^ (i >>> 12));
        return (i2 >>> 4) ^ ((i2 >>> 7) ^ i2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C11757g<K, V> mo29820a(K k, boolean z) {
        int i;
        C11757g<K, V> gVar;
        C11757g<K, V> gVar2;
        int i2;
        Comparator<? super K> comparator = this.f27358c;
        C11757g<K, V>[] gVarArr = this.f27351U;
        int a = m37840a(k.hashCode());
        int length = (gVarArr.length - 1) & a;
        C11757g<K, V> gVar3 = gVarArr[length];
        if (gVar3 != null) {
            Comparable comparable = comparator == f27350b0 ? (Comparable) k : null;
            while (true) {
                if (comparable != null) {
                    i2 = comparable.compareTo(gVar3.f27374Y);
                } else {
                    i2 = comparator.compare(k, gVar3.f27374Y);
                }
                if (i2 == 0) {
                    return gVar3;
                }
                C11757g<K, V> gVar4 = i2 < 0 ? gVar3.f27370U : gVar3.f27371V;
                if (gVar4 == null) {
                    gVar = gVar3;
                    i = i2;
                    break;
                }
                gVar3 = gVar4;
            }
        } else {
            gVar = gVar3;
            i = 0;
        }
        if (!z) {
            return null;
        }
        C11757g<K, V> gVar5 = this.f27352V;
        if (gVar != null) {
            gVar2 = new C11757g<>(gVar, k, a, gVar5, gVar5.f27373X);
            if (i < 0) {
                gVar.f27370U = gVar2;
            } else {
                gVar.f27371V = gVar2;
            }
            m37847b(gVar, true);
        } else if (comparator != f27350b0 || (k instanceof Comparable)) {
            gVar2 = new C11757g<>(gVar, k, a, gVar5, gVar5.f27373X);
            gVarArr[length] = gVar2;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(k.getClass().getName());
            sb.append(" is not Comparable");
            throw new ClassCastException(sb.toString());
        }
        int i3 = this.f27353W;
        this.f27353W = i3 + 1;
        if (i3 > this.f27355Y) {
            m37841a();
        }
        this.f27354X++;
        return gVar2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C11757g<K, V> mo29823b(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return mo29820a((K) obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C11757g<K, V> mo29824c(Object obj) {
        C11757g<K, V> b = mo29823b(obj);
        if (b != null) {
            mo29822a(b, true);
        }
        return b;
    }

    public void clear() {
        Arrays.fill(this.f27351U, null);
        this.f27353W = 0;
        this.f27354X++;
        C11757g<K, V> gVar = this.f27352V;
        C11757g<K, V> gVar2 = gVar.f27372W;
        while (gVar2 != gVar) {
            C11757g<K, V> gVar3 = gVar2.f27372W;
            gVar2.f27373X = null;
            gVar2.f27372W = null;
            gVar2 = gVar3;
        }
        gVar.f27373X = gVar;
        gVar.f27372W = gVar;
    }

    public boolean containsKey(Object obj) {
        return mo29823b(obj) != null;
    }

    public Set<Entry<K, V>> entrySet() {
        C11752d dVar = this.f27356Z;
        if (dVar != null) {
            return dVar;
        }
        C11752d dVar2 = new C11752d<>();
        this.f27356Z = dVar2;
        return dVar2;
    }

    public V get(Object obj) {
        C11757g b = mo29823b(obj);
        if (b != null) {
            return b.f27376a0;
        }
        return null;
    }

    public Set<K> keySet() {
        C11754e eVar = this.f27357a0;
        if (eVar != null) {
            return eVar;
        }
        C11754e eVar2 = new C11754e<>();
        this.f27357a0 = eVar2;
        return eVar2;
    }

    public V put(K k, V v) {
        if (k != null) {
            C11757g a = mo29820a(k, true);
            V v2 = a.f27376a0;
            a.f27376a0 = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    public V remove(Object obj) {
        C11757g c = mo29824c(obj);
        if (c != null) {
            return c.f27376a0;
        }
        return null;
    }

    public int size() {
        return this.f27353W;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.Comparator<? super K>, code=java.util.Comparator, for r2v0, types: [java.util.Comparator<? super K>, java.util.Comparator] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C11748t(java.util.Comparator r2) {
        /*
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f27353W = r0
            r1.f27354X = r0
            if (r2 == 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            java.util.Comparator<java.lang.Comparable> r2 = f27350b0
        L_0x000d:
            r1.f27358c = r2
            g.m.a.t$g r2 = new g.m.a.t$g
            r2.<init>()
            r1.f27352V = r2
            r2 = 16
            g.m.a.t$g[] r2 = new p163g.p500m.p501a.C11748t.C11757g[r2]
            r1.f27351U = r2
            g.m.a.t$g<K, V>[] r2 = r1.f27351U
            int r0 = r2.length
            int r0 = r0 / 2
            int r2 = r2.length
            int r2 = r2 / 4
            int r0 = r0 + r2
            r1.f27355Y = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p500m.p501a.C11748t.<init>(java.util.Comparator):void");
    }

    /* renamed from: b */
    private void m37847b(C11757g<K, V> gVar, boolean z) {
        while (gVar != null) {
            C11757g<K, V> gVar2 = gVar.f27370U;
            C11757g<K, V> gVar3 = gVar.f27371V;
            int i = 0;
            int i2 = gVar2 != null ? gVar2.f27377b0 : 0;
            int i3 = gVar3 != null ? gVar3.f27377b0 : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                C11757g<K, V> gVar4 = gVar3.f27370U;
                C11757g<K, V> gVar5 = gVar3.f27371V;
                int i5 = gVar5 != null ? gVar5.f27377b0 : 0;
                if (gVar4 != null) {
                    i = gVar4.f27377b0;
                }
                int i6 = i - i5;
                if (i6 == -1 || (i6 == 0 && !z)) {
                    m37842a(gVar);
                } else {
                    m37846b(gVar3);
                    m37842a(gVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                C11757g<K, V> gVar6 = gVar2.f27370U;
                C11757g<K, V> gVar7 = gVar2.f27371V;
                int i7 = gVar7 != null ? gVar7.f27377b0 : 0;
                if (gVar6 != null) {
                    i = gVar6.f27377b0;
                }
                int i8 = i - i7;
                if (i8 == 1 || (i8 == 0 && !z)) {
                    m37846b(gVar);
                } else {
                    m37842a(gVar2);
                    m37846b(gVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                gVar.f27377b0 = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                gVar.f27377b0 = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            gVar = gVar.f27378c;
        }
    }

    /* renamed from: b */
    private void m37846b(C11757g<K, V> gVar) {
        C11757g<K, V> gVar2 = gVar.f27370U;
        C11757g<K, V> gVar3 = gVar.f27371V;
        C11757g<K, V> gVar4 = gVar2.f27370U;
        C11757g<K, V> gVar5 = gVar2.f27371V;
        gVar.f27370U = gVar5;
        if (gVar5 != null) {
            gVar5.f27378c = gVar;
        }
        m37843a(gVar, gVar2);
        gVar2.f27371V = gVar;
        gVar.f27378c = gVar2;
        int i = 0;
        gVar.f27377b0 = Math.max(gVar3 != null ? gVar3.f27377b0 : 0, gVar5 != null ? gVar5.f27377b0 : 0) + 1;
        int i2 = gVar.f27377b0;
        if (gVar4 != null) {
            i = gVar4.f27377b0;
        }
        gVar2.f27377b0 = Math.max(i2, i) + 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C11757g<K, V> mo29821a(Entry<?, ?> entry) {
        C11757g<K, V> b = mo29823b(entry.getKey());
        if (b != null && m37844a((Object) b.f27376a0, entry.getValue())) {
            return b;
        }
        return null;
    }

    /* renamed from: a */
    private boolean m37844a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo29822a(C11757g<K, V> gVar, boolean z) {
        int i;
        if (z) {
            C11757g<K, V> gVar2 = gVar.f27373X;
            gVar2.f27372W = gVar.f27372W;
            gVar.f27372W.f27373X = gVar2;
            gVar.f27373X = null;
            gVar.f27372W = null;
        }
        C11757g<K, V> gVar3 = gVar.f27370U;
        C11757g<K, V> gVar4 = gVar.f27371V;
        C11757g<K, V> gVar5 = gVar.f27378c;
        int i2 = 0;
        if (gVar3 == null || gVar4 == null) {
            if (gVar3 != null) {
                m37843a(gVar, gVar3);
                gVar.f27370U = null;
            } else if (gVar4 != null) {
                m37843a(gVar, gVar4);
                gVar.f27371V = null;
            } else {
                m37843a(gVar, null);
            }
            m37847b(gVar5, false);
            this.f27353W--;
            this.f27354X++;
            return;
        }
        C11757g<K, V> b = gVar3.f27377b0 > gVar4.f27377b0 ? gVar3.mo29856b() : gVar4.mo29855a();
        mo29822a(b, false);
        C11757g<K, V> gVar6 = gVar.f27370U;
        if (gVar6 != null) {
            i = gVar6.f27377b0;
            b.f27370U = gVar6;
            gVar6.f27378c = b;
            gVar.f27370U = null;
        } else {
            i = 0;
        }
        C11757g<K, V> gVar7 = gVar.f27371V;
        if (gVar7 != null) {
            i2 = gVar7.f27377b0;
            b.f27371V = gVar7;
            gVar7.f27378c = b;
            gVar.f27371V = null;
        }
        b.f27377b0 = Math.max(i, i2) + 1;
        m37843a(gVar, b);
    }

    /* renamed from: a */
    private void m37843a(C11757g<K, V> gVar, C11757g<K, V> gVar2) {
        C11757g<K, V> gVar3 = gVar.f27378c;
        gVar.f27378c = null;
        if (gVar2 != null) {
            gVar2.f27378c = gVar3;
        }
        if (gVar3 == null) {
            int i = gVar.f27375Z;
            C11757g<K, V>[] gVarArr = this.f27351U;
            gVarArr[i & (gVarArr.length - 1)] = gVar2;
        } else if (gVar3.f27370U == gVar) {
            gVar3.f27370U = gVar2;
        } else {
            gVar3.f27371V = gVar2;
        }
    }

    /* renamed from: a */
    private void m37842a(C11757g<K, V> gVar) {
        C11757g<K, V> gVar2 = gVar.f27370U;
        C11757g<K, V> gVar3 = gVar.f27371V;
        C11757g<K, V> gVar4 = gVar3.f27370U;
        C11757g<K, V> gVar5 = gVar3.f27371V;
        gVar.f27371V = gVar4;
        if (gVar4 != null) {
            gVar4.f27378c = gVar;
        }
        m37843a(gVar, gVar3);
        gVar3.f27370U = gVar;
        gVar.f27378c = gVar3;
        int i = 0;
        gVar.f27377b0 = Math.max(gVar2 != null ? gVar2.f27377b0 : 0, gVar4 != null ? gVar4.f27377b0 : 0) + 1;
        int i2 = gVar.f27377b0;
        if (gVar5 != null) {
            i = gVar5.f27377b0;
        }
        gVar3.f27377b0 = Math.max(i2, i) + 1;
    }

    /* renamed from: a */
    private void m37841a() {
        this.f27351U = m37845a(this.f27351U);
        C11757g<K, V>[] gVarArr = this.f27351U;
        this.f27355Y = (gVarArr.length / 2) + (gVarArr.length / 4);
    }

    /* renamed from: a */
    static <K, V> C11757g<K, V>[] m37845a(C11757g<K, V>[] gVarArr) {
        int length = gVarArr.length;
        C11757g<K, V>[] gVarArr2 = new C11757g[(length * 2)];
        C11751c cVar = new C11751c();
        C11750b bVar = new C11750b();
        C11750b bVar2 = new C11750b();
        for (int i = 0; i < length; i++) {
            C11757g<K, V> gVar = gVarArr[i];
            if (gVar != null) {
                cVar.mo29839a(gVar);
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    C11757g a = cVar.mo29838a();
                    if (a == null) {
                        break;
                    } else if ((a.f27375Z & length) == 0) {
                        i2++;
                    } else {
                        i3++;
                    }
                }
                bVar.mo29836a(i2);
                bVar2.mo29836a(i3);
                cVar.mo29839a(gVar);
                while (true) {
                    C11757g a2 = cVar.mo29838a();
                    if (a2 == null) {
                        break;
                    } else if ((a2.f27375Z & length) == 0) {
                        bVar.mo29837a(a2);
                    } else {
                        bVar2.mo29837a(a2);
                    }
                }
                C11757g<K, V> gVar2 = null;
                gVarArr2[i] = i2 > 0 ? bVar.mo29835a() : null;
                int i4 = i + length;
                if (i3 > 0) {
                    gVar2 = bVar2.mo29835a();
                }
                gVarArr2[i4] = gVar2;
            }
        }
        return gVarArr2;
    }
}
