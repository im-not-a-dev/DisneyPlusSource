package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.c6 */
final class C10014c6 implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ C10218v5 f23345U;

    /* renamed from: c */
    private final /* synthetic */ AtomicReference f23346c;

    C10014c6(C10218v5 v5Var, AtomicReference atomicReference) {
        this.f23345U = v5Var;
        this.f23346c = atomicReference;
    }

    public final void run() {
        synchronized (this.f23346c) {
            try {
                this.f23346c.set(this.f23345U.mo25900g().mo25824h(this.f23345U.mo25666q().mo25641C()));
                this.f23346c.notify();
            } catch (Throwable th) {
                this.f23346c.notify();
                throw th;
            }
        }
    }
}
