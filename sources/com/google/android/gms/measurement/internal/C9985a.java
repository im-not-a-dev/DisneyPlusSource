package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.C9908u;
import java.util.Map;
import p096e.p113e.C3926a;

/* renamed from: com.google.android.gms.measurement.internal.a */
public final class C9985a extends C10021d2 {

    /* renamed from: b */
    private final Map<String, Long> f23266b = new C3926a();

    /* renamed from: c */
    private final Map<String, Integer> f23267c = new C3926a();

    /* renamed from: d */
    private long f23268d;

    public C9985a(C10145o4 o4Var) {
        super(o4Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m31082c(String str, long j) {
        mo25661h();
        mo25662j();
        C9908u.m30863b(str);
        if (this.f23267c.isEmpty()) {
            this.f23268d = j;
        }
        Integer num = (Integer) this.f23267c.get(str);
        if (num != null) {
            this.f23267c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (this.f23267c.size() >= 100) {
            mo25898e().mo25877w().mo25908a("Too many ads visible");
        } else {
            this.f23267c.put(str, Integer.valueOf(1));
            this.f23266b.put(str, Long.valueOf(j));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m31083d(String str, long j) {
        mo25661h();
        mo25662j();
        C9908u.m30863b(str);
        Integer num = (Integer) this.f23267c.get(str);
        if (num != null) {
            C10229w6 B = mo25668s().mo26165B();
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.f23267c.remove(str);
                Long l = (Long) this.f23266b.get(str);
                if (l == null) {
                    mo25898e().mo25874t().mo25908a("First ad unit exposure time was never set");
                } else {
                    long longValue = j - l.longValue();
                    this.f23266b.remove(str);
                    m31079a(str, longValue, B);
                }
                if (this.f23267c.isEmpty()) {
                    long j2 = this.f23268d;
                    if (j2 == 0) {
                        mo25898e().mo25874t().mo25908a("First ad exposure time was never set");
                        return;
                    } else {
                        m31076a(j - j2, B);
                        this.f23268d = 0;
                    }
                }
                return;
            }
            this.f23267c.put(str, Integer.valueOf(intValue));
            return;
        }
        mo25898e().mo25874t().mo25909a("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    /* renamed from: a */
    public final void mo25576a(String str, long j) {
        if (str == null || str.length() == 0) {
            mo25898e().mo25874t().mo25908a("Ad unit id must be a non-empty string");
        } else {
            mo25897d().mo25800a((Runnable) new C10009c1(this, str, j));
        }
    }

    /* renamed from: b */
    public final void mo25577b(String str, long j) {
        if (str == null || str.length() == 0) {
            mo25898e().mo25874t().mo25908a("Ad unit id must be a non-empty string");
        } else {
            mo25897d().mo25800a((Runnable) new C9997b0(this, str, j));
        }
    }

    /* renamed from: a */
    private final void m31076a(long j, C10229w6 w6Var) {
        if (w6Var == null) {
            mo25898e().mo25869B().mo25908a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            mo25898e().mo25869B().mo25909a("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            C10219v6.m31932a(w6Var, bundle, true);
            mo25665p().mo26161b("am", "_xa", bundle);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m31080b(long j) {
        for (String put : this.f23266b.keySet()) {
            this.f23266b.put(put, Long.valueOf(j));
        }
        if (!this.f23266b.isEmpty()) {
            this.f23268d = j;
        }
    }

    /* renamed from: a */
    private final void m31079a(String str, long j, C10229w6 w6Var) {
        if (w6Var == null) {
            mo25898e().mo25869B().mo25908a("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            mo25898e().mo25869B().mo25909a("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            C10219v6.m31932a(w6Var, bundle, true);
            mo25665p().mo26161b("am", "_xu", bundle);
        }
    }

    /* renamed from: a */
    public final void mo25575a(long j) {
        C10229w6 B = mo25668s().mo26165B();
        for (String str : this.f23266b.keySet()) {
            m31079a(str, j - ((Long) this.f23266b.get(str)).longValue(), B);
        }
        if (!this.f23266b.isEmpty()) {
            m31076a(j - this.f23268d, B);
        }
        m31080b(j);
    }
}
