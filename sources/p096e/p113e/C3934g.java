package p096e.p113e;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: e.e.g */
/* compiled from: LruCache */
public class C3934g<K, V> {

    /* renamed from: a */
    private final LinkedHashMap<K, V> f9738a;

    /* renamed from: b */
    private int f9739b;

    /* renamed from: c */
    private int f9740c;

    /* renamed from: d */
    private int f9741d;

    /* renamed from: e */
    private int f9742e;

    /* renamed from: f */
    private int f9743f;

    /* renamed from: g */
    private int f9744g;

    /* renamed from: h */
    private int f9745h;

    public C3934g(int i) {
        if (i > 0) {
            this.f9740c = i;
            this.f9738a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public V mo14072a(K k) {
        return null;
    }

    /* renamed from: a */
    public final V mo14073a(K k, V v) {
        V put;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f9741d++;
            this.f9739b += m13211c(k, v);
            put = this.f9738a.put(k, v);
            if (put != null) {
                this.f9739b -= m13211c(k, put);
            }
        }
        if (put != null) {
            mo14076a(false, k, put, v);
        }
        mo14075a(this.f9740c);
        return put;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14076a(boolean z, K k, V v, V v2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo14078b(K k, V v) {
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        r0 = mo14072a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        if (r0 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r4.f9742e++;
        r1 = r4.f9738a.put(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
        if (r1 == null) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0031, code lost:
        r4.f9738a.put(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
        r4.f9739b += m13211c(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0040, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        if (r1 == null) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0043, code lost:
        mo14076a(false, r5, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0047, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0048, code lost:
        mo14075a(r4.f9740c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004d, code lost:
        return r0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V mo14079b(K r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0054
            monitor-enter(r4)
            java.util.LinkedHashMap<K, V> r0 = r4.f9738a     // Catch:{ all -> 0x0051 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x0051 }
            if (r0 == 0) goto L_0x0013
            int r5 = r4.f9744g     // Catch:{ all -> 0x0051 }
            int r5 = r5 + 1
            r4.f9744g = r5     // Catch:{ all -> 0x0051 }
            monitor-exit(r4)     // Catch:{ all -> 0x0051 }
            return r0
        L_0x0013:
            int r0 = r4.f9745h     // Catch:{ all -> 0x0051 }
            int r0 = r0 + 1
            r4.f9745h = r0     // Catch:{ all -> 0x0051 }
            monitor-exit(r4)     // Catch:{ all -> 0x0051 }
            java.lang.Object r0 = r4.mo14072a((K) r5)
            if (r0 != 0) goto L_0x0022
            r5 = 0
            return r5
        L_0x0022:
            monitor-enter(r4)
            int r1 = r4.f9742e     // Catch:{ all -> 0x004e }
            int r1 = r1 + 1
            r4.f9742e = r1     // Catch:{ all -> 0x004e }
            java.util.LinkedHashMap<K, V> r1 = r4.f9738a     // Catch:{ all -> 0x004e }
            java.lang.Object r1 = r1.put(r5, r0)     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x0037
            java.util.LinkedHashMap<K, V> r2 = r4.f9738a     // Catch:{ all -> 0x004e }
            r2.put(r5, r1)     // Catch:{ all -> 0x004e }
            goto L_0x0040
        L_0x0037:
            int r2 = r4.f9739b     // Catch:{ all -> 0x004e }
            int r3 = r4.m13211c(r5, r0)     // Catch:{ all -> 0x004e }
            int r2 = r2 + r3
            r4.f9739b = r2     // Catch:{ all -> 0x004e }
        L_0x0040:
            monitor-exit(r4)     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x0048
            r2 = 0
            r4.mo14076a(r2, r5, r0, r1)
            return r1
        L_0x0048:
            int r5 = r4.f9740c
            r4.mo14075a(r5)
            return r0
        L_0x004e:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x004e }
            throw r5
        L_0x0051:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0051 }
            throw r5
        L_0x0054:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "key == null"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p096e.p113e.C3934g.mo14079b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final V mo14081c(K k) {
        V remove;
        if (k != null) {
            synchronized (this) {
                remove = this.f9738a.remove(k);
                if (remove != null) {
                    this.f9739b -= m13211c(k, remove);
                }
            }
            if (remove != null) {
                mo14076a(false, k, remove, null);
            }
            return remove;
        }
        throw new NullPointerException("key == null");
    }

    /* renamed from: d */
    public final synchronized Map<K, V> mo14082d() {
        return new LinkedHashMap(this.f9738a);
    }

    public final synchronized String toString() {
        int i;
        i = this.f9744g + this.f9745h;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f9740c), Integer.valueOf(this.f9744g), Integer.valueOf(this.f9745h), Integer.valueOf(i != 0 ? (this.f9744g * 100) / i : 0)});
    }

    /* renamed from: c */
    private int m13211c(K k, V v) {
        int b = mo14078b(k, v);
        if (b >= 0) {
            return b;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Negative size: ");
        sb.append(k);
        sb.append("=");
        sb.append(v);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: c */
    public final synchronized int mo14080c() {
        return this.f9739b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        throw new java.lang.IllegalStateException(r0.toString());
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14075a(int r5) {
        /*
            r4 = this;
        L_0x0000:
            monitor-enter(r4)
            int r0 = r4.f9739b     // Catch:{ all -> 0x0071 }
            if (r0 < 0) goto L_0x0052
            java.util.LinkedHashMap<K, V> r0 = r4.f9738a     // Catch:{ all -> 0x0071 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x0011
            int r0 = r4.f9739b     // Catch:{ all -> 0x0071 }
            if (r0 != 0) goto L_0x0052
        L_0x0011:
            int r0 = r4.f9739b     // Catch:{ all -> 0x0071 }
            if (r0 <= r5) goto L_0x0050
            java.util.LinkedHashMap<K, V> r0 = r4.f9738a     // Catch:{ all -> 0x0071 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x001e
            goto L_0x0050
        L_0x001e:
            java.util.LinkedHashMap<K, V> r0 = r4.f9738a     // Catch:{ all -> 0x0071 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0071 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0071 }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x0071 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0071 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x0071 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0071 }
            java.util.LinkedHashMap<K, V> r2 = r4.f9738a     // Catch:{ all -> 0x0071 }
            r2.remove(r1)     // Catch:{ all -> 0x0071 }
            int r2 = r4.f9739b     // Catch:{ all -> 0x0071 }
            int r3 = r4.m13211c(r1, r0)     // Catch:{ all -> 0x0071 }
            int r2 = r2 - r3
            r4.f9739b = r2     // Catch:{ all -> 0x0071 }
            int r2 = r4.f9743f     // Catch:{ all -> 0x0071 }
            r3 = 1
            int r2 = r2 + r3
            r4.f9743f = r2     // Catch:{ all -> 0x0071 }
            monitor-exit(r4)     // Catch:{ all -> 0x0071 }
            r2 = 0
            r4.mo14076a(r3, r1, r0, r2)
            goto L_0x0000
        L_0x0050:
            monitor-exit(r4)     // Catch:{ all -> 0x0071 }
            return
        L_0x0052:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0071 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
            r0.<init>()     // Catch:{ all -> 0x0071 }
            java.lang.Class r1 = r4.getClass()     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0071 }
            r0.append(r1)     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch:{ all -> 0x0071 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0071 }
            r5.<init>(r0)     // Catch:{ all -> 0x0071 }
            throw r5     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0071 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p096e.p113e.C3934g.mo14075a(int):void");
    }

    /* renamed from: b */
    public final synchronized int mo14077b() {
        return this.f9740c;
    }

    /* renamed from: a */
    public final void mo14074a() {
        mo14075a(-1);
    }
}
