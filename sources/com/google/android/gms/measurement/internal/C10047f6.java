package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.f6 */
final class C10047f6 implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ C10218v5 f23461U;

    /* renamed from: c */
    private final /* synthetic */ AtomicReference f23462c;

    C10047f6(C10218v5 v5Var, AtomicReference atomicReference) {
        this.f23461U = v5Var;
        this.f23462c = atomicReference;
    }

    public final void run() {
        synchronized (this.f23462c) {
            try {
                this.f23462c.set(Long.valueOf(this.f23461U.mo25900g().mo25811a(this.f23461U.mo25666q().mo25641C(), C10106l.f23630O)));
                this.f23462c.notify();
            } catch (Throwable th) {
                this.f23462c.notify();
                throw th;
            }
        }
    }
}
