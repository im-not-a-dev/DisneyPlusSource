package com.bumptech.glide.load.p334n.p335a0;

import com.bumptech.glide.load.p334n.p335a0.C8172m;
import java.util.Queue;
import p163g.p413f.p414a.p424w.C10775k;

/* renamed from: com.bumptech.glide.load.n.a0.d */
/* compiled from: BaseKeyPool */
abstract class C8158d<T extends C8172m> {

    /* renamed from: a */
    private final Queue<T> f17435a = C10775k.m34028a(20);

    C8158d() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract T mo21237a();

    /* renamed from: a */
    public void mo21239a(T t) {
        if (this.f17435a.size() < 20) {
            this.f17435a.offer(t);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public T mo21240b() {
        T t = (C8172m) this.f17435a.poll();
        return t == null ? mo21237a() : t;
    }
}
