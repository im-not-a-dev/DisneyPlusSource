package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.u5 */
final class C10208u5 implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ C10218v5 f23975U;

    /* renamed from: c */
    private final /* synthetic */ AtomicReference f23976c;

    C10208u5(C10218v5 v5Var, AtomicReference atomicReference) {
        this.f23975U = v5Var;
        this.f23976c = atomicReference;
    }

    public final void run() {
        synchronized (this.f23976c) {
            try {
                this.f23976c.set(Boolean.valueOf(this.f23975U.mo25900g().mo25823g(this.f23975U.mo25666q().mo25641C())));
                this.f23976c.notify();
            } catch (Throwable th) {
                this.f23976c.notify();
                throw th;
            }
        }
    }
}
