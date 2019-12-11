package com.bumptech.glide.load.p334n.p335a0;

import com.bumptech.glide.load.p334n.p335a0.C8172m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.n.a0.h */
/* compiled from: GroupedLinkedMap */
class C8162h<K extends C8172m, V> {

    /* renamed from: a */
    private final C8163a<K, V> f17436a = new C8163a<>();

    /* renamed from: b */
    private final Map<K, C8163a<K, V>> f17437b = new HashMap();

    /* renamed from: com.bumptech.glide.load.n.a0.h$a */
    /* compiled from: GroupedLinkedMap */
    private static class C8163a<K, V> {

        /* renamed from: a */
        final K f17438a;

        /* renamed from: b */
        private List<V> f17439b;

        /* renamed from: c */
        C8163a<K, V> f17440c;

        /* renamed from: d */
        C8163a<K, V> f17441d;

        C8163a() {
            this(null);
        }

        /* renamed from: a */
        public V mo21251a() {
            int b = mo21253b();
            if (b > 0) {
                return this.f17439b.remove(b - 1);
            }
            return null;
        }

        /* renamed from: b */
        public int mo21253b() {
            List<V> list = this.f17439b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        C8163a(K k) {
            this.f17441d = this;
            this.f17440c = this;
            this.f17438a = k;
        }

        /* renamed from: a */
        public void mo21252a(V v) {
            if (this.f17439b == null) {
                this.f17439b = new ArrayList();
            }
            this.f17439b.add(v);
        }
    }

    C8162h() {
    }

    /* renamed from: b */
    private void m23683b(C8163a<K, V> aVar) {
        m23684c(aVar);
        C8163a<K, V> aVar2 = this.f17436a;
        aVar.f17441d = aVar2.f17441d;
        aVar.f17440c = aVar2;
        m23685d(aVar);
    }

    /* renamed from: c */
    private static <K, V> void m23684c(C8163a<K, V> aVar) {
        C8163a<K, V> aVar2 = aVar.f17441d;
        aVar2.f17440c = aVar.f17440c;
        aVar.f17440c.f17441d = aVar2;
    }

    /* renamed from: d */
    private static <K, V> void m23685d(C8163a<K, V> aVar) {
        aVar.f17440c.f17441d = aVar;
        aVar.f17441d.f17440c = aVar;
    }

    /* renamed from: a */
    public void mo21249a(K k, V v) {
        C8163a aVar = (C8163a) this.f17437b.get(k);
        if (aVar == null) {
            aVar = new C8163a(k);
            m23683b(aVar);
            this.f17437b.put(k, aVar);
        } else {
            k.mo21232a();
        }
        aVar.mo21252a(v);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        boolean z = false;
        for (C8163a<K, V> aVar = this.f17436a.f17440c; !aVar.equals(this.f17436a); aVar = aVar.f17440c) {
            z = true;
            sb.append('{');
            sb.append(aVar.f17438a);
            sb.append(':');
            sb.append(aVar.mo21253b());
            sb.append("}, ");
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }

    /* renamed from: a */
    public V mo21248a(K k) {
        C8163a aVar = (C8163a) this.f17437b.get(k);
        if (aVar == null) {
            aVar = new C8163a(k);
            this.f17437b.put(k, aVar);
        } else {
            k.mo21232a();
        }
        m23682a(aVar);
        return aVar.mo21251a();
    }

    /* renamed from: a */
    public V mo21247a() {
        for (C8163a<K, V> aVar = this.f17436a.f17441d; !aVar.equals(this.f17436a); aVar = aVar.f17441d) {
            V a = aVar.mo21251a();
            if (a != null) {
                return a;
            }
            m23684c(aVar);
            this.f17437b.remove(aVar.f17438a);
            ((C8172m) aVar.f17438a).mo21232a();
        }
        return null;
    }

    /* renamed from: a */
    private void m23682a(C8163a<K, V> aVar) {
        m23684c(aVar);
        C8163a<K, V> aVar2 = this.f17436a;
        aVar.f17441d = aVar2;
        aVar.f17440c = aVar2.f17440c;
        m23685d(aVar);
    }
}
