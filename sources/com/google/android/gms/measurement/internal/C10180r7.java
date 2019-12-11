package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.r7 */
final class C10180r7 implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ C10190s7 f23894U;

    /* renamed from: c */
    private final /* synthetic */ C10000b3 f23895c;

    C10180r7(C10190s7 s7Var, C10000b3 b3Var) {
        this.f23894U = s7Var;
        this.f23895c = b3Var;
    }

    public final void run() {
        synchronized (this.f23894U) {
            this.f23894U.f23924c = false;
            if (!this.f23894U.f23923V.mo25585C()) {
                this.f23894U.f23923V.mo25898e().mo25869B().mo25908a("Connected to service");
                this.f23894U.f23923V.mo25591a(this.f23895c);
            }
        }
    }
}
