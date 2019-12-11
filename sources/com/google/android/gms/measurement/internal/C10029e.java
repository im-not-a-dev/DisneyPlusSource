package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.e */
final class C10029e implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ C9996b f23392U;

    /* renamed from: c */
    private final /* synthetic */ C10135n5 f23393c;

    C10029e(C9996b bVar, C10135n5 n5Var) {
        this.f23392U = bVar;
        this.f23393c = n5Var;
    }

    public final void run() {
        this.f23393c.mo25894a();
        if (C10072h9.m31319a()) {
            this.f23393c.mo25897d().mo25800a((Runnable) this);
            return;
        }
        boolean c = this.f23392U.mo25610c();
        this.f23392U.f23297c = 0;
        if (c) {
            this.f23392U.mo25609b();
        }
    }
}
