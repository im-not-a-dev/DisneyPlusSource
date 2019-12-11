package p096e.p113e;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: e.e.h */
/* compiled from: MapCollections */
abstract class C3935h<K, V> {

    /* renamed from: a */
    C3937b f9746a;

    /* renamed from: b */
    C3938c f9747b;

    /* renamed from: c */
    C3940e f9748c;

    /* renamed from: e.e.h$a */
    /* compiled from: MapCollections */
    final class C3936a<T> implements Iterator<T> {

        /* renamed from: U */
        int f9749U;

        /* renamed from: V */
        int f9750V;

        /* renamed from: W */
        boolean f9751W = false;

        /* renamed from: c */
        final int f9753c;

        C3936a(int i) {
            this.f9753c = i;
            this.f9749U = C3935h.this.mo14023c();
        }

        public boolean hasNext() {
            return this.f9750V < this.f9749U;
        }

        public T next() {
            if (hasNext()) {
                T a = C3935h.this.mo14016a(this.f9750V, this.f9753c);
                this.f9750V++;
                this.f9751W = true;
                return a;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f9751W) {
                this.f9750V--;
                this.f9749U--;
                this.f9751W = false;
                C3935h.this.mo14019a(this.f9750V);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: e.e.h$b */
    /* compiled from: MapCollections */
    final class C3937b implements Set<Entry<K, V>> {
        C3937b() {
        }

        /* renamed from: a */
        public boolean mo14092a(Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            mo14092a((Entry) obj);
            throw null;
        }

        public boolean addAll(Collection<? extends Entry<K, V>> collection) {
            int c = C3935h.this.mo14023c();
            for (Entry entry : collection) {
                C3935h.this.mo14020a(entry.getKey(), entry.getValue());
            }
            return c != C3935h.this.mo14023c();
        }

        public void clear() {
            C3935h.this.mo14018a();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            int a = C3935h.this.mo14015a(entry.getKey());
            if (a < 0) {
                return false;
            }
            return C3932e.m13194a(C3935h.this.mo14016a(a, 1), entry.getValue());
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            return C3935h.m13224a((Set<T>) this, obj);
        }

        public int hashCode() {
            int i;
            int i2;
            int i3 = 0;
            for (int c = C3935h.this.mo14023c() - 1; c >= 0; c--) {
                Object a = C3935h.this.mo14016a(c, 0);
                Object a2 = C3935h.this.mo14016a(c, 1);
                if (a == null) {
                    i = 0;
                } else {
                    i = a.hashCode();
                }
                if (a2 == null) {
                    i2 = 0;
                } else {
                    i2 = a2.hashCode();
                }
                i3 += i ^ i2;
            }
            return i3;
        }

        public boolean isEmpty() {
            return C3935h.this.mo14023c() == 0;
        }

        public Iterator<Entry<K, V>> iterator() {
            return new C3939d();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return C3935h.this.mo14023c();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: e.e.h$c */
    /* compiled from: MapCollections */
    final class C3938c implements Set<K> {
        C3938c() {
        }

        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C3935h.this.mo14018a();
        }

        public boolean contains(Object obj) {
            return C3935h.this.mo14015a(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            return C3935h.m13223a(C3935h.this.mo14022b(), collection);
        }

        public boolean equals(Object obj) {
            return C3935h.m13224a((Set<T>) this, obj);
        }

        public int hashCode() {
            int i;
            int i2 = 0;
            for (int c = C3935h.this.mo14023c() - 1; c >= 0; c--) {
                Object a = C3935h.this.mo14016a(c, 0);
                if (a == null) {
                    i = 0;
                } else {
                    i = a.hashCode();
                }
                i2 += i;
            }
            return i2;
        }

        public boolean isEmpty() {
            return C3935h.this.mo14023c() == 0;
        }

        public Iterator<K> iterator() {
            return new C3936a(0);
        }

        public boolean remove(Object obj) {
            int a = C3935h.this.mo14015a(obj);
            if (a < 0) {
                return false;
            }
            C3935h.this.mo14019a(a);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return C3935h.m13225b(C3935h.this.mo14022b(), collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return C3935h.m13226c(C3935h.this.mo14022b(), collection);
        }

        public int size() {
            return C3935h.this.mo14023c();
        }

        public Object[] toArray() {
            return C3935h.this.mo14085b(0);
        }

        public <T> T[] toArray(T[] tArr) {
            return C3935h.this.mo14084a(tArr, 0);
        }
    }

    /* renamed from: e.e.h$d */
    /* compiled from: MapCollections */
    final class C3939d implements Iterator<Entry<K, V>>, Entry<K, V> {

        /* renamed from: U */
        int f9756U;

        /* renamed from: V */
        boolean f9757V = false;

        /* renamed from: c */
        int f9759c;

        C3939d() {
            this.f9759c = C3935h.this.mo14023c() - 1;
            this.f9756U = -1;
        }

        public boolean equals(Object obj) {
            if (this.f9757V) {
                boolean z = false;
                if (!(obj instanceof Entry)) {
                    return false;
                }
                Entry entry = (Entry) obj;
                if (C3932e.m13194a(entry.getKey(), C3935h.this.mo14016a(this.f9756U, 0)) && C3932e.m13194a(entry.getValue(), C3935h.this.mo14016a(this.f9756U, 1))) {
                    z = true;
                }
                return z;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public K getKey() {
            if (this.f9757V) {
                return C3935h.this.mo14016a(this.f9756U, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.f9757V) {
                return C3935h.this.mo14016a(this.f9756U, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.f9756U < this.f9759c;
        }

        public int hashCode() {
            int i;
            if (this.f9757V) {
                int i2 = 0;
                Object a = C3935h.this.mo14016a(this.f9756U, 0);
                Object a2 = C3935h.this.mo14016a(this.f9756U, 1);
                if (a == null) {
                    i = 0;
                } else {
                    i = a.hashCode();
                }
                if (a2 != null) {
                    i2 = a2.hashCode();
                }
                return i ^ i2;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public void remove() {
            if (this.f9757V) {
                C3935h.this.mo14019a(this.f9756U);
                this.f9756U--;
                this.f9759c--;
                this.f9757V = false;
                return;
            }
            throw new IllegalStateException();
        }

        public V setValue(V v) {
            if (this.f9757V) {
                return C3935h.this.mo14017a(this.f9756U, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append("=");
            sb.append(getValue());
            return sb.toString();
        }

        public Entry<K, V> next() {
            if (hasNext()) {
                this.f9756U++;
                this.f9757V = true;
                return this;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: e.e.h$e */
    /* compiled from: MapCollections */
    final class C3940e implements Collection<V> {
        C3940e() {
        }

        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C3935h.this.mo14018a();
        }

        public boolean contains(Object obj) {
            return C3935h.this.mo14021b(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return C3935h.this.mo14023c() == 0;
        }

        public Iterator<V> iterator() {
            return new C3936a(1);
        }

        public boolean remove(Object obj) {
            int b = C3935h.this.mo14021b(obj);
            if (b < 0) {
                return false;
            }
            C3935h.this.mo14019a(b);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int c = C3935h.this.mo14023c();
            int i = 0;
            boolean z = false;
            while (i < c) {
                if (collection.contains(C3935h.this.mo14016a(i, 1))) {
                    C3935h.this.mo14019a(i);
                    i--;
                    c--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            int c = C3935h.this.mo14023c();
            int i = 0;
            boolean z = false;
            while (i < c) {
                if (!collection.contains(C3935h.this.mo14016a(i, 1))) {
                    C3935h.this.mo14019a(i);
                    i--;
                    c--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public int size() {
            return C3935h.this.mo14023c();
        }

        public Object[] toArray() {
            return C3935h.this.mo14085b(1);
        }

        public <T> T[] toArray(T[] tArr) {
            return C3935h.this.mo14084a(tArr, 1);
        }
    }

    C3935h() {
    }

    /* renamed from: a */
    public static <K, V> boolean m13223a(Map<K, V> map, Collection<?> collection) {
        for (Object containsKey : collection) {
            if (!map.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static <K, V> boolean m13225b(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        for (Object remove : collection) {
            map.remove(remove);
        }
        return size != map.size();
    }

    /* renamed from: c */
    public static <K, V> boolean m13226c(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo14015a(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo14016a(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract V mo14017a(int i, V v);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo14018a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo14019a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo14020a(K k, V v);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo14021b(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Map<K, V> mo14022b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract int mo14023c();

    /* renamed from: d */
    public Set<Entry<K, V>> mo14086d() {
        if (this.f9746a == null) {
            this.f9746a = new C3937b<>();
        }
        return this.f9746a;
    }

    /* renamed from: e */
    public Set<K> mo14087e() {
        if (this.f9747b == null) {
            this.f9747b = new C3938c<>();
        }
        return this.f9747b;
    }

    /* renamed from: f */
    public Collection<V> mo14088f() {
        if (this.f9748c == null) {
            this.f9748c = new C3940e<>();
        }
        return this.f9748c;
    }

    /* renamed from: a */
    public <T> T[] mo14084a(T[] tArr, int i) {
        int c = mo14023c();
        if (tArr.length < c) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), c);
        }
        for (int i2 = 0; i2 < c; i2++) {
            tArr[i2] = mo14016a(i2, i);
        }
        if (tArr.length > c) {
            tArr[c] = null;
        }
        return tArr;
    }

    /* renamed from: b */
    public Object[] mo14085b(int i) {
        int c = mo14023c();
        Object[] objArr = new Object[c];
        for (int i2 = 0; i2 < c; i2++) {
            objArr[i2] = mo14016a(i2, i);
        }
        return objArr;
    }

    /* renamed from: a */
    public static <T> boolean m13224a(Set<T> set, Object obj) {
        boolean z = true;
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() != set2.size() || !set.containsAll(set2)) {
                    z = false;
                }
                return z;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }
}
