package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.p397z.C9918a;

/* renamed from: com.google.android.gms.measurement.internal.l7 */
final class C10114l7 implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ boolean f23704U;

    /* renamed from: V */
    private final /* synthetic */ C10061g9 f23705V;

    /* renamed from: W */
    private final /* synthetic */ C10028d9 f23706W;

    /* renamed from: X */
    private final /* synthetic */ C10061g9 f23707X;

    /* renamed from: Y */
    private final /* synthetic */ C9993a7 f23708Y;

    /* renamed from: c */
    private final /* synthetic */ boolean f23709c;

    C10114l7(C9993a7 a7Var, boolean z, boolean z2, C10061g9 g9Var, C10028d9 d9Var, C10061g9 g9Var2) {
        this.f23708Y = a7Var;
        this.f23709c = z;
        this.f23704U = z2;
        this.f23705V = g9Var;
        this.f23706W = d9Var;
        this.f23707X = g9Var2;
    }

    public final void run() {
        C10000b3 d = this.f23708Y.f23283d;
        if (d == null) {
            this.f23708Y.mo25898e().mo25874t().mo25908a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.f23709c) {
            this.f23708Y.mo25592a(d, (C9918a) this.f23704U ? null : this.f23705V, this.f23706W);
        } else {
            try {
                if (TextUtils.isEmpty(this.f23707X.f23502c)) {
                    d.mo25620a(this.f23705V, this.f23706W);
                } else {
                    d.mo25619a(this.f23705V);
                }
            } catch (RemoteException e) {
                this.f23708Y.mo25898e().mo25874t().mo25909a("Failed to send conditional user property to the service", e);
            }
        }
        this.f23708Y.m31091J();
    }
}
