package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.t7 */
final class C10200t7 implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ C10190s7 f23957U;

    /* renamed from: c */
    private final /* synthetic */ C10000b3 f23958c;

    C10200t7(C10190s7 s7Var, C10000b3 b3Var) {
        this.f23957U = s7Var;
        this.f23958c = b3Var;
    }

    public final void run() {
        synchronized (this.f23957U) {
            this.f23957U.f23924c = false;
            if (!this.f23957U.f23923V.mo25585C()) {
                this.f23957U.f23923V.mo25898e().mo25868A().mo25908a("Connected to remote service");
                this.f23957U.f23923V.mo25591a(this.f23958c);
            }
        }
    }
}
