package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.r0 */
final class C9782r0 extends C9739g1 {

    /* renamed from: a */
    private WeakReference<C9755k0> f22946a;

    C9782r0(C9755k0 k0Var) {
        this.f22946a = new WeakReference<>(k0Var);
    }

    /* renamed from: a */
    public final void mo25173a() {
        C9755k0 k0Var = (C9755k0) this.f22946a.get();
        if (k0Var != null) {
            k0Var.m30357o();
        }
    }
}
