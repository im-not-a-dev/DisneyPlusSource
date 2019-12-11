package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.y2 */
public final class C10245y2<V> {

    /* renamed from: g */
    private static final Object f24056g = new Object();

    /* renamed from: a */
    private final String f24057a;

    /* renamed from: b */
    private final C10255z2<V> f24058b;

    /* renamed from: c */
    private final V f24059c;

    /* renamed from: d */
    private final Object f24060d;

    /* renamed from: e */
    private volatile V f24061e;

    /* renamed from: f */
    private volatile V f24062f;

    private C10245y2(String str, V v, V v2, C10255z2<V> z2Var) {
        this.f24060d = new Object();
        this.f24061e = null;
        this.f24062f = null;
        this.f24057a = str;
        this.f24059c = v;
        this.f24058b = z2Var;
    }

    /* renamed from: a */
    public final String mo26195a() {
        return this.f24057a;
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 173 */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0021, code lost:
        return r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V mo26194a(V r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f24060d
            monitor-enter(r0)
            monitor-exit(r0)     // Catch:{ all -> 0x008b }
            if (r5 == 0) goto L_0x0007
            return r5
        L_0x0007:
            com.google.android.gms.measurement.internal.h9 r5 = com.google.android.gms.measurement.internal.C10106l.f23642a
            if (r5 != 0) goto L_0x000e
            V r5 = r4.f24059c
            return r5
        L_0x000e:
            java.lang.Object r5 = f24056g
            monitor-enter(r5)
            boolean r0 = com.google.android.gms.measurement.internal.C10072h9.m31319a()     // Catch:{ all -> 0x0086 }
            if (r0 == 0) goto L_0x0022
            V r0 = r4.f24062f     // Catch:{ all -> 0x0086 }
            if (r0 != 0) goto L_0x001e
            V r0 = r4.f24059c     // Catch:{ all -> 0x0086 }
            goto L_0x0020
        L_0x001e:
            V r0 = r4.f24062f     // Catch:{ all -> 0x0086 }
        L_0x0020:
            monitor-exit(r5)     // Catch:{ all -> 0x0086 }
            return r0
        L_0x0022:
            boolean r0 = com.google.android.gms.measurement.internal.C10072h9.m31319a()     // Catch:{ all -> 0x0086 }
            if (r0 != 0) goto L_0x007e
            com.google.android.gms.measurement.internal.h9 r0 = com.google.android.gms.measurement.internal.C10106l.f23642a     // Catch:{ all -> 0x0086 }
            java.util.List r0 = com.google.android.gms.measurement.internal.C10106l.f23644b     // Catch:{ SecurityException -> 0x0062 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ SecurityException -> 0x0062 }
        L_0x0032:
            boolean r1 = r0.hasNext()     // Catch:{ SecurityException -> 0x0062 }
            if (r1 == 0) goto L_0x0066
            java.lang.Object r1 = r0.next()     // Catch:{ SecurityException -> 0x0062 }
            com.google.android.gms.measurement.internal.y2 r1 = (com.google.android.gms.measurement.internal.C10245y2) r1     // Catch:{ SecurityException -> 0x0062 }
            java.lang.Object r2 = f24056g     // Catch:{ SecurityException -> 0x0062 }
            monitor-enter(r2)     // Catch:{ SecurityException -> 0x0062 }
            boolean r3 = com.google.android.gms.measurement.internal.C10072h9.m31319a()     // Catch:{ all -> 0x005f }
            if (r3 != 0) goto L_0x0057
            com.google.android.gms.measurement.internal.z2<V> r3 = r1.f24058b     // Catch:{ all -> 0x005f }
            if (r3 == 0) goto L_0x0052
            com.google.android.gms.measurement.internal.z2<V> r3 = r1.f24058b     // Catch:{ all -> 0x005f }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x005f }
            goto L_0x0053
        L_0x0052:
            r3 = 0
        L_0x0053:
            r1.f24062f = r3     // Catch:{ all -> 0x005f }
            monitor-exit(r2)     // Catch:{ all -> 0x005f }
            goto L_0x0032
        L_0x0057:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x005f }
            java.lang.String r1 = "Refreshing flag cache must be done on a worker thread."
            r0.<init>(r1)     // Catch:{ all -> 0x005f }
            throw r0     // Catch:{ all -> 0x005f }
        L_0x005f:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x005f }
            throw r0     // Catch:{ SecurityException -> 0x0062 }
        L_0x0062:
            r0 = move-exception
            com.google.android.gms.measurement.internal.C10106l.m31493a(r0)     // Catch:{ all -> 0x0086 }
        L_0x0066:
            monitor-exit(r5)     // Catch:{ all -> 0x0086 }
            com.google.android.gms.measurement.internal.z2<V> r5 = r4.f24058b
            if (r5 != 0) goto L_0x0070
            com.google.android.gms.measurement.internal.h9 r5 = com.google.android.gms.measurement.internal.C10106l.f23642a
            V r5 = r4.f24059c
            return r5
        L_0x0070:
            java.lang.Object r5 = r5.get()     // Catch:{ SecurityException -> 0x0075 }
            return r5
        L_0x0075:
            r5 = move-exception
            com.google.android.gms.measurement.internal.C10106l.m31493a(r5)
            com.google.android.gms.measurement.internal.h9 r5 = com.google.android.gms.measurement.internal.C10106l.f23642a
            V r5 = r4.f24059c
            return r5
        L_0x007e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0086 }
            java.lang.String r1 = "Tried to refresh flag cache on main thread or on package side."
            r0.<init>(r1)     // Catch:{ all -> 0x0086 }
            throw r0     // Catch:{ all -> 0x0086 }
        L_0x0086:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0086 }
            throw r0
        L_0x0089:
            monitor-exit(r0)     // Catch:{ all -> 0x008b }
            throw r5
        L_0x008b:
            r5 = move-exception
            goto L_0x0089
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C10245y2.mo26194a(java.lang.Object):java.lang.Object");
    }
}
