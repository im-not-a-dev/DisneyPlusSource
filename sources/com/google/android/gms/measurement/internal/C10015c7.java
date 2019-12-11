package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.c7 */
final class C10015c7 implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ C10028d9 f23347U;

    /* renamed from: V */
    private final /* synthetic */ C9993a7 f23348V;

    /* renamed from: c */
    private final /* synthetic */ AtomicReference f23349c;

    C10015c7(C9993a7 a7Var, AtomicReference atomicReference, C10028d9 d9Var) {
        this.f23348V = a7Var;
        this.f23349c = atomicReference;
        this.f23347U = d9Var;
    }

    public final void run() {
        synchronized (this.f23349c) {
            try {
                C10000b3 d = this.f23348V.f23283d;
                if (d == null) {
                    this.f23348V.mo25898e().mo25874t().mo25908a("Failed to get app instance id");
                    this.f23349c.notify();
                    return;
                }
                this.f23349c.set(d.mo25612a(this.f23347U));
                String str = (String) this.f23349c.get();
                if (str != null) {
                    this.f23348V.mo25665p().mo26148a(str);
                    this.f23348V.mo25899f().f23940l.mo25581a(str);
                }
                this.f23348V.m31091J();
                this.f23349c.notify();
            } catch (RemoteException e) {
                try {
                    this.f23348V.mo25898e().mo25874t().mo25909a("Failed to get app instance id", e);
                    this.f23349c.notify();
                } catch (Throwable th) {
                    this.f23349c.notify();
                    throw th;
                }
            }
        }
    }
}
