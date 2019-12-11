package p096e.p113e;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: e.e.a */
/* compiled from: ArrayMap */
public class C3926a<K, V> extends C3941i<K, V> implements Map<K, V> {

    /* renamed from: a0 */
    C3935h<K, V> f9709a0;

    /* renamed from: e.e.a$a */
    /* compiled from: ArrayMap */
    class C3927a extends C3935h<K, V> {
        C3927a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Object mo14016a(int i, int i2) {
            return C3926a.this.f9765U[(i << 1) + i2];
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public int mo14021b(Object obj) {
            return C3926a.this.mo14152c(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public int mo14023c() {
            return C3926a.this.f9766V;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo14015a(Object obj) {
            return C3926a.this.mo14150b(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Map<K, V> mo14022b() {
            return C3926a.this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo14020a(K k, V v) {
            C3926a.this.put(k, v);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public V mo14017a(int i, V v) {
            return C3926a.this.mo14147a(i, v);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo14019a(int i) {
            C3926a.this.mo14153c(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo14018a() {
            C3926a.this.clear();
        }
    }

    public C3926a() {
    }

    /* renamed from: b */
    private C3935h<K, V> m13148b() {
        if (this.f9709a0 == null) {
            this.f9709a0 = new C3927a();
        }
        return this.f9709a0;
    }

    /* renamed from: a */
    public boolean mo14010a(Collection<?> collection) {
        return C3935h.m13226c(this, collection);
    }

    public Set<Entry<K, V>> entrySet() {
        return m13148b().mo14086d();
    }

    public Set<K> keySet() {
        return m13148b().mo14087e();
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        mo14148a(this.f9766V + map.size());
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public Collection<V> values() {
        return m13148b().mo14088f();
    }

    public C3926a(int i) {
        super(i);
    }

    public C3926a(C3941i iVar) {
        super(iVar);
    }
}
