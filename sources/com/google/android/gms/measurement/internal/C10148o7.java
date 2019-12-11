package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.o7 */
final class C10148o7 implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ String f23829U;

    /* renamed from: V */
    private final /* synthetic */ String f23830V;

    /* renamed from: W */
    private final /* synthetic */ String f23831W;

    /* renamed from: X */
    private final /* synthetic */ C10028d9 f23832X;

    /* renamed from: Y */
    private final /* synthetic */ C9993a7 f23833Y;

    /* renamed from: c */
    private final /* synthetic */ AtomicReference f23834c;

    C10148o7(C9993a7 a7Var, AtomicReference atomicReference, String str, String str2, String str3, C10028d9 d9Var) {
        this.f23833Y = a7Var;
        this.f23834c = atomicReference;
        this.f23829U = str;
        this.f23830V = str2;
        this.f23831W = str3;
        this.f23832X = d9Var;
    }

    public final void run() {
        synchronized (this.f23834c) {
            try {
                C10000b3 d = this.f23833Y.f23283d;
                if (d == null) {
                    this.f23833Y.mo25898e().mo25874t().mo25911a("Failed to get conditional properties", C10099k3.m31423a(this.f23829U), this.f23830V, this.f23831W);
                    this.f23834c.set(Collections.emptyList());
                    this.f23834c.notify();
                    return;
                }
                if (TextUtils.isEmpty(this.f23829U)) {
                    this.f23834c.set(d.mo25614a(this.f23830V, this.f23831W, this.f23832X));
                } else {
                    this.f23834c.set(d.mo25615a(this.f23829U, this.f23830V, this.f23831W));
                }
                this.f23833Y.m31091J();
                this.f23834c.notify();
            } catch (RemoteException e) {
                try {
                    this.f23833Y.mo25898e().mo25874t().mo25911a("Failed to get conditional properties", C10099k3.m31423a(this.f23829U), this.f23830V, e);
                    this.f23834c.set(Collections.emptyList());
                    this.f23834c.notify();
                } catch (Throwable th) {
                    this.f23834c.notify();
                    throw th;
                }
            }
        }
    }
}
