package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.j2 */
final class C9753j2 implements Runnable {

    /* renamed from: c */
    private final /* synthetic */ C9749i2 f22865c;

    C9753j2(C9749i2 i2Var) {
        this.f22865c = i2Var;
    }

    public final void run() {
        this.f22865c.f22858m.lock();
        try {
            this.f22865c.m30322i();
        } finally {
            this.f22865c.f22858m.unlock();
        }
    }
}
