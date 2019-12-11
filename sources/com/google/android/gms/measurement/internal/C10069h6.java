package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.h6 */
final class C10069h6 implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ C10218v5 f23519U;

    /* renamed from: c */
    private final /* synthetic */ AtomicReference f23520c;

    C10069h6(C10218v5 v5Var, AtomicReference atomicReference) {
        this.f23519U = v5Var;
        this.f23520c = atomicReference;
    }

    public final void run() {
        synchronized (this.f23520c) {
            try {
                this.f23520c.set(Double.valueOf(this.f23519U.mo25900g().mo25816c(this.f23519U.mo25666q().mo25641C(), C10106l.f23632Q)));
                this.f23520c.notify();
            } catch (Throwable th) {
                this.f23520c.notify();
                throw th;
            }
        }
    }
}
