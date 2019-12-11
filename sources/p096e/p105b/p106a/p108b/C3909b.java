package p096e.p105b.p106a.p108b;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.WeakHashMap;

/* renamed from: e.b.a.b.b */
/* compiled from: SafeIterableMap */
public class C3909b<K, V> implements Iterable<Entry<K, V>> {

    /* renamed from: U */
    private C3912c<K, V> f9689U;

    /* renamed from: V */
    private WeakHashMap<C3915f<K, V>, Boolean> f9690V = new WeakHashMap<>();

    /* renamed from: W */
    private int f9691W = 0;

    /* renamed from: c */
    C3912c<K, V> f9692c;

    /* renamed from: e.b.a.b.b$a */
    /* compiled from: SafeIterableMap */
    static class C3910a<K, V> extends C3914e<K, V> {
        C3910a(C3912c<K, V> cVar, C3912c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C3912c<K, V> mo13992b(C3912c<K, V> cVar) {
            return cVar.f9695W;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public C3912c<K, V> mo13993c(C3912c<K, V> cVar) {
            return cVar.f9694V;
        }
    }

    /* renamed from: e.b.a.b.b$b */
    /* compiled from: SafeIterableMap */
    private static class C3911b<K, V> extends C3914e<K, V> {
        C3911b(C3912c<K, V> cVar, C3912c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C3912c<K, V> mo13992b(C3912c<K, V> cVar) {
            return cVar.f9694V;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public C3912c<K, V> mo13993c(C3912c<K, V> cVar) {
            return cVar.f9695W;
        }
    }

    /* renamed from: e.b.a.b.b$c */
    /* compiled from: SafeIterableMap */
    static class C3912c<K, V> implements Entry<K, V> {

        /* renamed from: U */
        final V f9693U;

        /* renamed from: V */
        C3912c<K, V> f9694V;

        /* renamed from: W */
        C3912c<K, V> f9695W;

        /* renamed from: c */
        final K f9696c;

        C3912c(K k, V v) {
            this.f9696c = k;
            this.f9693U = v;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C3912c)) {
                return false;
            }
            C3912c cVar = (C3912c) obj;
            if (!this.f9696c.equals(cVar.f9696c) || !this.f9693U.equals(cVar.f9693U)) {
                z = false;
            }
            return z;
        }

        public K getKey() {
            return this.f9696c;
        }

        public V getValue() {
            return this.f9693U;
        }

        public int hashCode() {
            return this.f9696c.hashCode() ^ this.f9693U.hashCode();
        }

        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f9696c);
            sb.append("=");
            sb.append(this.f9693U);
            return sb.toString();
        }
    }

    /* renamed from: e.b.a.b.b$d */
    /* compiled from: SafeIterableMap */
    private class C3913d implements Iterator<Entry<K, V>>, C3915f<K, V> {

        /* renamed from: U */
        private boolean f9697U = true;

        /* renamed from: c */
        private C3912c<K, V> f9699c;

        C3913d() {
        }

        /* renamed from: a */
        public void mo14000a(C3912c<K, V> cVar) {
            C3912c<K, V> cVar2 = this.f9699c;
            if (cVar == cVar2) {
                this.f9699c = cVar2.f9695W;
                this.f9697U = this.f9699c == null;
            }
        }

        public boolean hasNext() {
            boolean z = true;
            if (this.f9697U) {
                if (C3909b.this.f9692c == null) {
                    z = false;
                }
                return z;
            }
            C3912c<K, V> cVar = this.f9699c;
            if (cVar == null || cVar.f9694V == null) {
                z = false;
            }
            return z;
        }

        public Entry<K, V> next() {
            if (this.f9697U) {
                this.f9697U = false;
                this.f9699c = C3909b.this.f9692c;
            } else {
                C3912c<K, V> cVar = this.f9699c;
                this.f9699c = cVar != null ? cVar.f9694V : null;
            }
            return this.f9699c;
        }
    }

    /* renamed from: e.b.a.b.b$e */
    /* compiled from: SafeIterableMap */
    private static abstract class C3914e<K, V> implements Iterator<Entry<K, V>>, C3915f<K, V> {

        /* renamed from: U */
        C3912c<K, V> f9700U;

        /* renamed from: c */
        C3912c<K, V> f9701c;

        C3914e(C3912c<K, V> cVar, C3912c<K, V> cVar2) {
            this.f9701c = cVar2;
            this.f9700U = cVar;
        }

        /* renamed from: a */
        public void mo14000a(C3912c<K, V> cVar) {
            if (this.f9701c == cVar && cVar == this.f9700U) {
                this.f9700U = null;
                this.f9701c = null;
            }
            C3912c<K, V> cVar2 = this.f9701c;
            if (cVar2 == cVar) {
                this.f9701c = mo13992b(cVar2);
            }
            if (this.f9700U == cVar) {
                this.f9700U = m13138a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract C3912c<K, V> mo13992b(C3912c<K, V> cVar);

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public abstract C3912c<K, V> mo13993c(C3912c<K, V> cVar);

        public boolean hasNext() {
            return this.f9700U != null;
        }

        public Entry<K, V> next() {
            C3912c<K, V> cVar = this.f9700U;
            this.f9700U = m13138a();
            return cVar;
        }

        /* renamed from: a */
        private C3912c<K, V> m13138a() {
            C3912c<K, V> cVar = this.f9700U;
            C3912c<K, V> cVar2 = this.f9701c;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return mo13993c(cVar);
        }
    }

    /* renamed from: e.b.a.b.b$f */
    /* compiled from: SafeIterableMap */
    interface C3915f<K, V> {
        /* renamed from: a */
        void mo14000a(C3912c<K, V> cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C3912c<K, V> mo13977a(K k) {
        C3912c<K, V> cVar = this.f9692c;
        while (cVar != null && !cVar.f9696c.equals(k)) {
            cVar = cVar.f9694V;
        }
        return cVar;
    }

    /* renamed from: b */
    public V mo13978b(K k, V v) {
        C3912c a = mo13977a(k);
        if (a != null) {
            return a.f9693U;
        }
        mo13982a(k, v);
        return null;
    }

    /* renamed from: c */
    public Entry<K, V> mo13984c() {
        return this.f9692c;
    }

    /* renamed from: d */
    public C3913d mo13985d() {
        C3913d dVar = new C3913d<>();
        this.f9690V.put(dVar, Boolean.valueOf(false));
        return dVar;
    }

    /* renamed from: e */
    public Entry<K, V> mo13986e() {
        return this.f9689U;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3909b)) {
            return false;
        }
        C3909b bVar = (C3909b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Entry entry = (Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        if (it.hasNext() || it2.hasNext()) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Entry) it.next()).hashCode();
        }
        return i;
    }

    public Iterator<Entry<K, V>> iterator() {
        C3910a aVar = new C3910a(this.f9692c, this.f9689U);
        this.f9690V.put(aVar, Boolean.valueOf(false));
        return aVar;
    }

    public V remove(K k) {
        C3912c a = mo13977a(k);
        if (a == null) {
            return null;
        }
        this.f9691W--;
        if (!this.f9690V.isEmpty()) {
            for (C3915f a2 : this.f9690V.keySet()) {
                a2.mo14000a(a);
            }
        }
        C3912c<K, V> cVar = a.f9695W;
        if (cVar != null) {
            cVar.f9694V = a.f9694V;
        } else {
            this.f9692c = a.f9694V;
        }
        C3912c<K, V> cVar2 = a.f9694V;
        if (cVar2 != null) {
            cVar2.f9695W = a.f9695W;
        } else {
            this.f9689U = a.f9695W;
        }
        a.f9694V = null;
        a.f9695W = null;
        return a.f9693U;
    }

    public int size() {
        return this.f9691W;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C3912c<K, V> mo13982a(K k, V v) {
        C3912c<K, V> cVar = new C3912c<>(k, v);
        this.f9691W++;
        C3912c<K, V> cVar2 = this.f9689U;
        if (cVar2 == null) {
            this.f9692c = cVar;
            this.f9689U = this.f9692c;
            return cVar;
        }
        cVar2.f9694V = cVar;
        cVar.f9695W = cVar2;
        this.f9689U = cVar;
        return cVar;
    }

    /* renamed from: b */
    public Iterator<Entry<K, V>> mo13983b() {
        C3911b bVar = new C3911b(this.f9689U, this.f9692c);
        this.f9690V.put(bVar, Boolean.valueOf(false));
        return bVar;
    }
}
