package p163g.p449j.p450a.p451a.p457d.p464g;

import java.util.Map.Entry;

/* renamed from: g.j.a.a.d.g.s4 */
final class C11301s4<K> implements Entry<K, Object> {

    /* renamed from: c */
    private Entry<K, C11272q4> f26502c;

    private C11301s4(Entry<K, C11272q4> entry) {
        this.f26502c = entry;
    }

    /* renamed from: a */
    public final C11272q4 mo28891a() {
        return (C11272q4) this.f26502c.getValue();
    }

    public final K getKey() {
        return this.f26502c.getKey();
    }

    public final Object getValue() {
        if (((C11272q4) this.f26502c.getValue()) == null) {
            return null;
        }
        C11272q4.m35963c();
        throw null;
    }

    public final Object setValue(Object obj) {
        if (obj instanceof C11259p5) {
            return ((C11272q4) this.f26502c.getValue()).mo29046a((C11259p5) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
