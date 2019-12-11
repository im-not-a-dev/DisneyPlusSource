package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.u0 */
abstract class C9791u0 {

    /* renamed from: a */
    private final C9785s0 f22974a;

    protected C9791u0(C9785s0 s0Var) {
        this.f22974a = s0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo25127a();

    /* renamed from: a */
    public final void mo25246a(C9788t0 t0Var) {
        t0Var.f22958a.lock();
        try {
            if (t0Var.f22968k == this.f22974a) {
                mo25127a();
                t0Var.f22958a.unlock();
            }
        } finally {
            t0Var.f22958a.unlock();
        }
    }
}
