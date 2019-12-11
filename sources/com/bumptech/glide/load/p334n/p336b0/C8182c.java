package com.bumptech.glide.load.p334n.p336b0;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p163g.p413f.p414a.p424w.C10774j;

/* renamed from: com.bumptech.glide.load.n.b0.c */
/* compiled from: DiskCacheWriteLocker */
final class C8182c {

    /* renamed from: a */
    private final Map<String, C8183a> f17473a = new HashMap();

    /* renamed from: b */
    private final C8184b f17474b = new C8184b();

    /* renamed from: com.bumptech.glide.load.n.b0.c$a */
    /* compiled from: DiskCacheWriteLocker */
    private static class C8183a {

        /* renamed from: a */
        final Lock f17475a = new ReentrantLock();

        /* renamed from: b */
        int f17476b;

        C8183a() {
        }
    }

    /* renamed from: com.bumptech.glide.load.n.b0.c$b */
    /* compiled from: DiskCacheWriteLocker */
    private static class C8184b {

        /* renamed from: a */
        private final Queue<C8183a> f17477a = new ArrayDeque();

        C8184b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C8183a mo21275a() {
            C8183a aVar;
            synchronized (this.f17477a) {
                aVar = (C8183a) this.f17477a.poll();
            }
            return aVar == null ? new C8183a() : aVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo21276a(C8183a aVar) {
            synchronized (this.f17477a) {
                if (this.f17477a.size() < 10) {
                    this.f17477a.offer(aVar);
                }
            }
        }
    }

    C8182c() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo21273a(String str) {
        C8183a aVar;
        synchronized (this) {
            aVar = (C8183a) this.f17473a.get(str);
            if (aVar == null) {
                aVar = this.f17474b.mo21275a();
                this.f17473a.put(str, aVar);
            }
            aVar.f17476b++;
        }
        aVar.f17475a.lock();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo21274b(String str) {
        C8183a aVar;
        synchronized (this) {
            Object obj = this.f17473a.get(str);
            C10774j.m34012a(obj);
            aVar = (C8183a) obj;
            if (aVar.f17476b >= 1) {
                aVar.f17476b--;
                if (aVar.f17476b == 0) {
                    C8183a aVar2 = (C8183a) this.f17473a.remove(str);
                    if (aVar2.equals(aVar)) {
                        this.f17474b.mo21276a(aVar2);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Removed the wrong lock, expected to remove: ");
                        sb.append(aVar);
                        sb.append(", but actually removed: ");
                        sb.append(aVar2);
                        sb.append(", safeKey: ");
                        sb.append(str);
                        throw new IllegalStateException(sb.toString());
                    }
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Cannot release a lock that is not held, safeKey: ");
                sb2.append(str);
                sb2.append(", interestedThreads: ");
                sb2.append(aVar.f17476b);
                throw new IllegalStateException(sb2.toString());
            }
        }
        aVar.f17475a.unlock();
    }
}
