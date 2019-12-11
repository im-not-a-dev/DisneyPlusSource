package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import p163g.p449j.p450a.p451a.p457d.p464g.C11127g6;

/* renamed from: com.google.android.gms.measurement.internal.b8 */
public final class C10005b8 extends C10046f5 {

    /* renamed from: c */
    private Handler f23315c;

    /* renamed from: d */
    private long f23316d = mo25896c().mo25472a();

    /* renamed from: e */
    private long f23317e = this.f23316d;

    /* renamed from: f */
    private final C9996b f23318f = new C10038e8(this, this.f23701a);

    /* renamed from: g */
    private final C9996b f23319g = new C10027d8(this, this.f23701a);

    C10005b8(C10145o4 o4Var) {
        super(o4Var);
    }

    /* renamed from: E */
    private final void m31147E() {
        synchronized (this) {
            if (this.f23315c == null) {
                this.f23315c = new C11127g6(Looper.getMainLooper());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public final void m31148F() {
        mo25662j();
        mo25636a(false, false);
        mo25664o().mo25575a(mo25896c().mo25472a());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m31149a(long j) {
        mo25662j();
        m31147E();
        if (mo25900g().mo25821e(mo25666q().mo25641C(), C10106l.f23649d0)) {
            mo25899f().f23953y.mo26126a(false);
        }
        mo25898e().mo25869B().mo25909a("Activity resumed, time", Long.valueOf(j));
        this.f23316d = j;
        this.f23317e = this.f23316d;
        if (this.f23701a.mo26028f()) {
            if (mo25900g().mo25835p(mo25666q().mo25641C())) {
                mo25635a(mo25896c().mo25474c(), false);
                return;
            }
            this.f23318f.mo25607a();
            this.f23319g.mo25607a();
            if (mo25899f().mo26090a(mo25896c().mo25474c())) {
                mo25899f().f23946r.mo26126a(true);
                mo25899f().f23951w.mo26197a(0);
            }
            if (mo25899f().f23946r.mo26127a()) {
                this.f23318f.mo25608a(Math.max(0, mo25899f().f23944p.mo26196a() - mo25899f().f23951w.mo26196a()));
            } else {
                this.f23319g.mo25608a(Math.max(0, 3600000 - mo25899f().f23951w.mo26196a()));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m31152b(long j) {
        mo25662j();
        m31147E();
        if (mo25900g().mo25821e(mo25666q().mo25641C(), C10106l.f23649d0)) {
            mo25899f().f23953y.mo26126a(true);
        }
        this.f23318f.mo25607a();
        this.f23319g.mo25607a();
        mo25898e().mo25869B().mo25909a("Activity paused, time", Long.valueOf(j));
        if (this.f23316d != 0) {
            mo25899f().f23951w.mo26197a(mo25899f().f23951w.mo26196a() + (j - this.f23316d));
        }
    }

    /* renamed from: c */
    private final void m31154c(long j) {
        mo25662j();
        mo25898e().mo25869B().mo25909a("Session started, time", Long.valueOf(mo25896c().mo25472a()));
        Long valueOf = mo25900g().mo25831n(mo25666q().mo25641C()) ? Long.valueOf(j / 1000) : null;
        mo25665p().mo26152a("auto", "_sid", (Object) valueOf, j);
        mo25899f().f23946r.mo26126a(false);
        Bundle bundle = new Bundle();
        if (mo25900g().mo25831n(mo25666q().mo25641C())) {
            bundle.putLong("_sid", valueOf.longValue());
        }
        mo25665p().mo26149a("auto", "_s", j, bundle);
        mo25899f().f23950v.mo26197a(j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: B */
    public final void mo25632B() {
        mo25662j();
        this.f23318f.mo25607a();
        this.f23319g.mo25607a();
        this.f23316d = 0;
        this.f23317e = this.f23316d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final void mo25633C() {
        mo25662j();
        m31154c(mo25896c().mo25474c());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: D */
    public final long mo25634D() {
        long a = mo25896c().mo25472a();
        long j = a - this.f23317e;
        this.f23317e = a;
        return j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final boolean mo25604z() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo25635a(long j, boolean z) {
        mo25662j();
        m31147E();
        this.f23318f.mo25607a();
        this.f23319g.mo25607a();
        if (mo25899f().mo26090a(j)) {
            mo25899f().f23946r.mo26126a(true);
            mo25899f().f23951w.mo26197a(0);
        }
        if (z && mo25900g().mo25837q(mo25666q().mo25641C())) {
            mo25899f().f23950v.mo26197a(j);
        }
        if (mo25899f().f23946r.mo26127a()) {
            m31154c(j);
        } else {
            this.f23319g.mo25608a(Math.max(0, 3600000 - mo25899f().f23951w.mo26196a()));
        }
    }

    /* renamed from: a */
    public final boolean mo25636a(boolean z, boolean z2) {
        mo25662j();
        mo25754x();
        long a = mo25896c().mo25472a();
        mo25899f().f23950v.mo26197a(mo25896c().mo25474c());
        long j = a - this.f23316d;
        if (z || j >= 1000) {
            mo25899f().f23951w.mo26197a(j);
            mo25898e().mo25869B().mo25909a("Recording user engagement, ms", Long.valueOf(j));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j);
            C10219v6.m31932a(mo25668s().mo26165B(), bundle, true);
            if (mo25900g().mo25839r(mo25666q().mo25641C())) {
                if (mo25900g().mo25821e(mo25666q().mo25641C(), C10106l.f23659i0)) {
                    if (!z2) {
                        mo25634D();
                    }
                } else if (z2) {
                    bundle.putLong("_fr", 1);
                } else {
                    mo25634D();
                }
            }
            if (!mo25900g().mo25821e(mo25666q().mo25641C(), C10106l.f23659i0) || !z2) {
                mo25665p().mo26161b("auto", "_e", bundle);
            }
            this.f23316d = a;
            this.f23319g.mo25607a();
            this.f23319g.mo25608a(Math.max(0, 3600000 - mo25899f().f23951w.mo26196a()));
            return true;
        }
        mo25898e().mo25869B().mo25909a("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j));
        return false;
    }
}
