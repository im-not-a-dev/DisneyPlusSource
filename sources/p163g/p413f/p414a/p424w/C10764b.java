package p163g.p413f.p414a.p424w;

import p096e.p113e.C3926a;
import p096e.p113e.C3941i;

/* renamed from: g.f.a.w.b */
/* compiled from: CachedHashCodeArrayMap */
public final class C10764b<K, V> extends C3926a<K, V> {

    /* renamed from: b0 */
    private int f25471b0;

    /* renamed from: a */
    public V mo14147a(int i, V v) {
        this.f25471b0 = 0;
        return super.mo14147a(i, v);
    }

    /* renamed from: c */
    public V mo14153c(int i) {
        this.f25471b0 = 0;
        return super.mo14153c(i);
    }

    public void clear() {
        this.f25471b0 = 0;
        super.clear();
    }

    public int hashCode() {
        if (this.f25471b0 == 0) {
            this.f25471b0 = super.hashCode();
        }
        return this.f25471b0;
    }

    public V put(K k, V v) {
        this.f25471b0 = 0;
        return super.put(k, v);
    }

    /* renamed from: a */
    public void mo14149a(C3941i<? extends K, ? extends V> iVar) {
        this.f25471b0 = 0;
        super.mo14149a(iVar);
    }
}
