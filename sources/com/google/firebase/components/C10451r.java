package com.google.firebase.components;

import com.google.android.gms.common.internal.C9908u;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p163g.p449j.p482b.p483e.C11519a;
import p163g.p449j.p482b.p483e.C11520b;
import p163g.p449j.p482b.p483e.C11521c;
import p163g.p449j.p482b.p483e.C11522d;

/* renamed from: com.google.firebase.components.r */
/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
class C10451r implements C11522d, C11521c {

    /* renamed from: a */
    private final Map<Class<?>, ConcurrentHashMap<C11520b<Object>, Executor>> f24783a = new HashMap();

    /* renamed from: b */
    private Queue<C11519a<?>> f24784b = new ArrayDeque();

    /* renamed from: c */
    private final Executor f24785c;

    C10451r(Executor executor) {
        this.f24785c = executor;
    }

    /* renamed from: b */
    private synchronized Set<Entry<C11520b<Object>, Executor>> m33019b(C11519a<?> aVar) {
        Map map;
        map = (Map) this.f24783a.get(aVar.mo29448b());
        return map == null ? Collections.emptySet() : map.entrySet();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r0.hasNext() == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        r1 = (java.util.Map.Entry) r0.next();
        ((java.util.concurrent.Executor) r1.getValue()).execute(com.google.firebase.components.C10450q.m33017a(r1, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        r0 = m33019b(r4).iterator();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo27258a(p163g.p449j.p482b.p483e.C11519a<?> r4) {
        /*
            r3 = this;
            com.google.android.gms.common.internal.C9908u.m30853a(r4)
            monitor-enter(r3)
            java.util.Queue<g.j.b.e.a<?>> r0 = r3.f24784b     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x000f
            java.util.Queue<g.j.b.e.a<?>> r0 = r3.f24784b     // Catch:{ all -> 0x0033 }
            r0.add(r4)     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x000f:
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            java.util.Set r0 = r3.m33019b(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0032
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            java.lang.Runnable r1 = com.google.firebase.components.C10450q.m33017a(r1, r4)
            r2.execute(r1)
            goto L_0x0018
        L_0x0032:
            return
        L_0x0033:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.C10451r.mo27258a(g.j.b.e.a):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized <T> void mo27261b(java.lang.Class<T> r2, p163g.p449j.p482b.p483e.C11520b<? super T> r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.common.internal.C9908u.m30853a(r2)     // Catch:{ all -> 0x0029 }
            com.google.android.gms.common.internal.C9908u.m30853a(r3)     // Catch:{ all -> 0x0029 }
            java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<g.j.b.e.b<java.lang.Object>, java.util.concurrent.Executor>> r0 = r1.f24783a     // Catch:{ all -> 0x0029 }
            boolean r0 = r0.containsKey(r2)     // Catch:{ all -> 0x0029 }
            if (r0 != 0) goto L_0x0011
            monitor-exit(r1)
            return
        L_0x0011:
            java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<g.j.b.e.b<java.lang.Object>, java.util.concurrent.Executor>> r0 = r1.f24783a     // Catch:{ all -> 0x0029 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x0029 }
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0     // Catch:{ all -> 0x0029 }
            r0.remove(r3)     // Catch:{ all -> 0x0029 }
            boolean r3 = r0.isEmpty()     // Catch:{ all -> 0x0029 }
            if (r3 == 0) goto L_0x0027
            java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<g.j.b.e.b<java.lang.Object>, java.util.concurrent.Executor>> r3 = r1.f24783a     // Catch:{ all -> 0x0029 }
            r3.remove(r2)     // Catch:{ all -> 0x0029 }
        L_0x0027:
            monitor-exit(r1)
            return
        L_0x0029:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.C10451r.mo27261b(java.lang.Class, g.j.b.e.b):void");
    }

    /* renamed from: a */
    public synchronized <T> void mo27260a(Class<T> cls, Executor executor, C11520b<? super T> bVar) {
        C9908u.m30853a(cls);
        C9908u.m30853a(bVar);
        C9908u.m30853a(executor);
        if (!this.f24783a.containsKey(cls)) {
            this.f24783a.put(cls, new ConcurrentHashMap());
        }
        ((ConcurrentHashMap) this.f24783a.get(cls)).put(bVar, executor);
    }

    /* renamed from: a */
    public <T> void mo27259a(Class<T> cls, C11520b<? super T> bVar) {
        mo27260a(cls, this.f24785c, bVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo27257a() {
        Queue<C11519a> queue;
        synchronized (this) {
            if (this.f24784b != null) {
                queue = this.f24784b;
                this.f24784b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (C11519a a : queue) {
                mo27258a(a);
            }
        }
    }
}
