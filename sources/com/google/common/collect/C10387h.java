package com.google.common.collect;

import com.google.common.collect.C10385g.C10386a;
import java.io.Serializable;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.common.collect.h */
/* compiled from: ImmutableMap */
public abstract class C10387h<K, V> implements Map<K, V>, Serializable {

    /* renamed from: U */
    private transient ImmutableSet<K> f24692U;

    /* renamed from: V */
    private transient C10385g<V> f24693V;

    /* renamed from: c */
    private transient ImmutableSet<Entry<K, V>> f24694c;

    /* renamed from: com.google.common.collect.h$a */
    /* compiled from: ImmutableMap */
    public static class C10388a<K, V> {

        /* renamed from: a */
        Comparator<? super V> f24695a;

        /* renamed from: b */
        Object[] f24696b;

        /* renamed from: c */
        int f24697c = 0;

        /* renamed from: d */
        boolean f24698d = false;

        C10388a(int i) {
            this.f24696b = new Object[(i * 2)];
        }

        /* renamed from: a */
        private void m32867a(int i) {
            int i2 = i * 2;
            Object[] objArr = this.f24696b;
            if (i2 > objArr.length) {
                this.f24696b = Arrays.copyOf(objArr, C10386a.m32859a(objArr.length, i2));
                this.f24698d = false;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo27184b() {
            int i;
            if (this.f24695a != null) {
                if (this.f24698d) {
                    this.f24696b = Arrays.copyOf(this.f24696b, this.f24697c * 2);
                }
                Entry[] entryArr = new Entry[this.f24697c];
                int i2 = 0;
                while (true) {
                    i = this.f24697c;
                    if (i2 >= i) {
                        break;
                    }
                    Object[] objArr = this.f24696b;
                    int i3 = i2 * 2;
                    entryArr[i2] = new SimpleImmutableEntry(objArr[i3], objArr[i3 + 1]);
                    i2++;
                }
                Arrays.sort(entryArr, 0, i, C10398n.m32887a(this.f24695a).mo27189a(C10393l.m32878a()));
                for (int i4 = 0; i4 < this.f24697c; i4++) {
                    int i5 = i4 * 2;
                    this.f24696b[i5] = entryArr[i4].getKey();
                    this.f24696b[i5 + 1] = entryArr[i4].getValue();
                }
            }
        }

        /* renamed from: a */
        public C10388a<K, V> mo27182a(K k, V v) {
            m32867a(this.f24697c + 1);
            C10381c.m32851a((Object) k, (Object) v);
            Object[] objArr = this.f24696b;
            int i = this.f24697c;
            objArr[i * 2] = k;
            objArr[(i * 2) + 1] = v;
            this.f24697c = i + 1;
            return this;
        }

        /* renamed from: a */
        public C10387h<K, V> mo27183a() {
            mo27184b();
            this.f24698d = true;
            return C10401q.m32895a(this.f24697c, this.f24696b);
        }
    }

    C10387h() {
    }

    /* renamed from: a */
    public static <K, V> C10387h<K, V> m32861a(K k, V v, K k2, V v2) {
        C10381c.m32851a((Object) k, (Object) v);
        C10381c.m32851a((Object) k2, (Object) v2);
        return C10401q.m32895a(2, new Object[]{k, v, k2, v2});
    }

    /* renamed from: d */
    public static <K, V> C10387h<K, V> m32863d() {
        return C10401q.f24707Z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract ImmutableSet<Entry<K, V>> mo27164a();

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract ImmutableSet<K> mo27165b();

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public abstract C10385g<V> mo27166c();

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public boolean equals(Object obj) {
        return C10393l.m32880a(this, obj);
    }

    public abstract V get(Object obj);

    public final V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    public int hashCode() {
        return C10407s.m32915a(entrySet());
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return C10393l.m32879a(this);
    }

    public ImmutableSet<Entry<K, V>> entrySet() {
        ImmutableSet<Entry<K, V>> immutableSet = this.f24694c;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<Entry<K, V>> a = mo27164a();
        this.f24694c = a;
        return a;
    }

    public ImmutableSet<K> keySet() {
        ImmutableSet<K> immutableSet = this.f24692U;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<K> b = mo27165b();
        this.f24692U = b;
        return b;
    }

    public C10385g<V> values() {
        C10385g<V> gVar = this.f24693V;
        if (gVar != null) {
            return gVar;
        }
        C10385g<V> c = mo27166c();
        this.f24693V = c;
        return c;
    }

    /* renamed from: a */
    public static <K, V> C10387h<K, V> m32862a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        C10381c.m32851a((Object) k, (Object) v);
        C10381c.m32851a((Object) k2, (Object) v2);
        C10381c.m32851a((Object) k3, (Object) v3);
        C10381c.m32851a((Object) k4, (Object) v4);
        return C10401q.m32895a(4, new Object[]{k, v, k2, v2, k3, v3, k4, v4});
    }

    /* renamed from: a */
    public static <K, V> C10388a<K, V> m32860a(int i) {
        C10381c.m32850a(i, "expectedSize");
        return new C10388a<>(i);
    }
}
