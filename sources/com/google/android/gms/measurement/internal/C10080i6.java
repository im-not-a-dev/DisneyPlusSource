package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.i6 */
final class C10080i6 implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ C10218v5 f23549U;

    /* renamed from: c */
    private final /* synthetic */ AtomicReference f23550c;

    C10080i6(C10218v5 v5Var, AtomicReference atomicReference) {
        this.f23549U = v5Var;
        this.f23550c = atomicReference;
    }

    public final void run() {
        synchronized (this.f23550c) {
            try {
                this.f23550c.set(Integer.valueOf(this.f23549U.mo25900g().mo25814b(this.f23549U.mo25666q().mo25641C(), C10106l.f23631P)));
                this.f23550c.notify();
            } catch (Throwable th) {
                this.f23550c.notify();
                throw th;
            }
        }
    }
}
