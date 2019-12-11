package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.p397z.C9918a;

/* renamed from: com.google.android.gms.measurement.internal.b7 */
final class C10004b7 implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ C10201t8 f23311U;

    /* renamed from: V */
    private final /* synthetic */ C10028d9 f23312V;

    /* renamed from: W */
    private final /* synthetic */ C9993a7 f23313W;

    /* renamed from: c */
    private final /* synthetic */ boolean f23314c;

    C10004b7(C9993a7 a7Var, boolean z, C10201t8 t8Var, C10028d9 d9Var) {
        this.f23313W = a7Var;
        this.f23314c = z;
        this.f23311U = t8Var;
        this.f23312V = d9Var;
    }

    public final void run() {
        C10000b3 d = this.f23313W.f23283d;
        if (d == null) {
            this.f23313W.mo25898e().mo25874t().mo25908a("Discarding data. Failed to set user attribute");
            return;
        }
        this.f23313W.mo25592a(d, (C9918a) this.f23314c ? null : this.f23311U, this.f23312V);
        this.f23313W.m31091J();
    }
}
