package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.C9908u;
import p163g.p449j.p450a.p451a.p457d.p464g.C11127g6;

/* renamed from: com.google.android.gms.measurement.internal.b */
abstract class C9996b {

    /* renamed from: d */
    private static volatile Handler f23294d;

    /* renamed from: a */
    private final C10135n5 f23295a;

    /* renamed from: b */
    private final Runnable f23296b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public volatile long f23297c;

    C9996b(C10135n5 n5Var) {
        C9908u.m30853a(n5Var);
        this.f23295a = n5Var;
        this.f23296b = new C10029e(this, n5Var);
    }

    /* renamed from: d */
    private final Handler m31126d() {
        Handler handler;
        if (f23294d != null) {
            return f23294d;
        }
        synchronized (C9996b.class) {
            if (f23294d == null) {
                f23294d = new C11127g6(this.f23295a.mo25895b().getMainLooper());
            }
            handler = f23294d;
        }
        return handler;
    }

    /* renamed from: a */
    public final void mo25608a(long j) {
        mo25607a();
        if (j >= 0) {
            this.f23297c = this.f23295a.mo25896c().mo25474c();
            if (!m31126d().postDelayed(this.f23296b, j)) {
                this.f23295a.mo25898e().mo25874t().mo25909a("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    /* renamed from: b */
    public abstract void mo25609b();

    /* renamed from: c */
    public final boolean mo25610c() {
        return this.f23297c != 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo25607a() {
        this.f23297c = 0;
        m31126d().removeCallbacks(this.f23296b);
    }
}
