package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.q7 */
final class C10170q7 implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ String f23868U;

    /* renamed from: V */
    private final /* synthetic */ String f23869V;

    /* renamed from: W */
    private final /* synthetic */ String f23870W;

    /* renamed from: X */
    private final /* synthetic */ boolean f23871X;

    /* renamed from: Y */
    private final /* synthetic */ C10028d9 f23872Y;

    /* renamed from: Z */
    private final /* synthetic */ C9993a7 f23873Z;

    /* renamed from: c */
    private final /* synthetic */ AtomicReference f23874c;

    C10170q7(C9993a7 a7Var, AtomicReference atomicReference, String str, String str2, String str3, boolean z, C10028d9 d9Var) {
        this.f23873Z = a7Var;
        this.f23874c = atomicReference;
        this.f23868U = str;
        this.f23869V = str2;
        this.f23870W = str3;
        this.f23871X = z;
        this.f23872Y = d9Var;
    }

    public final void run() {
        synchronized (this.f23874c) {
            try {
                C10000b3 d = this.f23873Z.f23283d;
                if (d == null) {
                    this.f23873Z.mo25898e().mo25874t().mo25911a("Failed to get user properties", C10099k3.m31423a(this.f23868U), this.f23869V, this.f23870W);
                    this.f23874c.set(Collections.emptyList());
                    this.f23874c.notify();
                    return;
                }
                if (TextUtils.isEmpty(this.f23868U)) {
                    this.f23874c.set(d.mo25617a(this.f23869V, this.f23870W, this.f23871X, this.f23872Y));
                } else {
                    this.f23874c.set(d.mo25616a(this.f23868U, this.f23869V, this.f23870W, this.f23871X));
                }
                this.f23873Z.m31091J();
                this.f23874c.notify();
            } catch (RemoteException e) {
                try {
                    this.f23873Z.mo25898e().mo25874t().mo25911a("Failed to get user properties", C10099k3.m31423a(this.f23868U), this.f23869V, e);
                    this.f23874c.set(Collections.emptyList());
                    this.f23874c.notify();
                } catch (Throwable th) {
                    this.f23874c.notify();
                    throw th;
                }
            }
        }
    }
}
