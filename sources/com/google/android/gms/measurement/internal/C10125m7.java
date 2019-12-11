package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.p397z.C9918a;

/* renamed from: com.google.android.gms.measurement.internal.m7 */
final class C10125m7 implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ boolean f23726U;

    /* renamed from: V */
    private final /* synthetic */ C10084j f23727V;

    /* renamed from: W */
    private final /* synthetic */ C10028d9 f23728W;

    /* renamed from: X */
    private final /* synthetic */ String f23729X;

    /* renamed from: Y */
    private final /* synthetic */ C9993a7 f23730Y;

    /* renamed from: c */
    private final /* synthetic */ boolean f23731c;

    C10125m7(C9993a7 a7Var, boolean z, boolean z2, C10084j jVar, C10028d9 d9Var, String str) {
        this.f23730Y = a7Var;
        this.f23731c = z;
        this.f23726U = z2;
        this.f23727V = jVar;
        this.f23728W = d9Var;
        this.f23729X = str;
    }

    public final void run() {
        C10000b3 d = this.f23730Y.f23283d;
        if (d == null) {
            this.f23730Y.mo25898e().mo25874t().mo25908a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.f23731c) {
            this.f23730Y.mo25592a(d, (C9918a) this.f23726U ? null : this.f23727V, this.f23728W);
        } else {
            try {
                if (TextUtils.isEmpty(this.f23729X)) {
                    d.mo25621a(this.f23727V, this.f23728W);
                } else {
                    d.mo25622a(this.f23727V, this.f23729X, this.f23730Y.mo25898e().mo25870C());
                }
            } catch (RemoteException e) {
                this.f23730Y.mo25898e().mo25874t().mo25909a("Failed to send event to the service", e);
            }
        }
        this.f23730Y.m31091J();
    }
}
