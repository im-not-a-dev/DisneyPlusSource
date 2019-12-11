package p163g.p449j.p450a.p451a.p457d.p464g;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: g.j.a.a.d.g.j5 */
public final class C11168j5<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: U */
    private static final C11168j5 f26269U;

    /* renamed from: c */
    private boolean f26270c = true;

    static {
        C11168j5 j5Var = new C11168j5();
        f26269U = j5Var;
        j5Var.f26270c = false;
    }

    private C11168j5() {
    }

    /* renamed from: b */
    private static int m35399b(Object obj) {
        if (obj instanceof byte[]) {
            return C11111f4.m35150a((byte[]) obj);
        }
        if (!(obj instanceof C11167j4)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public static <K, V> C11168j5<K, V> m35400d() {
        return f26269U;
    }

    /* renamed from: e */
    private final void m35401e() {
        if (!this.f26270c) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: a */
    public final void mo28587a(C11168j5<K, V> j5Var) {
        m35401e();
        if (!j5Var.isEmpty()) {
            putAll(j5Var);
        }
    }

    /* renamed from: c */
    public final C11168j5<K, V> mo28590c() {
        return isEmpty() ? new C11168j5<>() : new C11168j5<>(this);
    }

    public final void clear() {
        m35401e();
        super.clear();
    }

    public final Set<Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L_0x005d
            java.util.Map r7 = (java.util.Map) r7
            r0 = 1
            if (r6 == r7) goto L_0x0059
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L_0x0016
        L_0x0014:
            r7 = 0
            goto L_0x005a
        L_0x0016:
            java.util.Set r2 = r6.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x001e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0059
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L_0x0035
            goto L_0x0014
        L_0x0035:
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r7.get(r3)
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L_0x0052
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L_0x0052
            byte[] r4 = (byte[]) r4
            byte[] r3 = (byte[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L_0x0056
        L_0x0052:
            boolean r3 = r4.equals(r3)
        L_0x0056:
            if (r3 != 0) goto L_0x001e
            goto L_0x0014
        L_0x0059:
            r7 = 1
        L_0x005a:
            if (r7 == 0) goto L_0x005d
            return r0
        L_0x005d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p449j.p450a.p451a.p457d.p464g.C11168j5.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = 0;
        for (Entry entry : entrySet()) {
            i += m35399b(entry.getValue()) ^ m35399b(entry.getKey());
        }
        return i;
    }

    public final V put(K k, V v) {
        m35401e();
        C11111f4.m35151a(k);
        C11111f4.m35151a(v);
        return super.put(k, v);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        m35401e();
        for (Object next : map.keySet()) {
            C11111f4.m35151a(next);
            C11111f4.m35151a(map.get(next));
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        m35401e();
        return super.remove(obj);
    }

    private C11168j5(Map<K, V> map) {
        super(map);
    }

    /* renamed from: a */
    public final boolean mo28588a() {
        return this.f26270c;
    }

    /* renamed from: b */
    public final void mo28589b() {
        this.f26270c = false;
    }
}
