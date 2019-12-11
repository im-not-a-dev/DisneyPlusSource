package com.google.android.exoplayer2.p393v0;

/* renamed from: com.google.android.exoplayer2.v0.j */
/* compiled from: ConditionVariable */
public final class C9548j {

    /* renamed from: a */
    private boolean f22272a;

    /* renamed from: a */
    public synchronized void mo24637a() throws InterruptedException {
        while (!this.f22272a) {
            wait();
        }
    }

    /* renamed from: b */
    public synchronized boolean mo24638b() {
        boolean z;
        z = this.f22272a;
        this.f22272a = false;
        return z;
    }

    /* renamed from: c */
    public synchronized boolean mo24639c() {
        if (this.f22272a) {
            return false;
        }
        this.f22272a = true;
        notifyAll();
        return true;
    }
}
