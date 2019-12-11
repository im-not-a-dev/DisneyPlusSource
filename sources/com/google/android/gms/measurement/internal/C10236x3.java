package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import android.util.Pair;
import com.google.android.gms.common.internal.C9908u;

/* renamed from: com.google.android.gms.measurement.internal.x3 */
public final class C10236x3 {

    /* renamed from: a */
    private final String f24028a;

    /* renamed from: b */
    private final String f24029b;

    /* renamed from: c */
    private final String f24030c;

    /* renamed from: d */
    private final long f24031d;

    /* renamed from: e */
    private final /* synthetic */ C10196t3 f24032e;

    private C10236x3(C10196t3 t3Var, String str, long j) {
        this.f24032e = t3Var;
        C9908u.m30863b(str);
        C9908u.m30860a(j > 0);
        this.f24028a = String.valueOf(str).concat(":start");
        this.f24029b = String.valueOf(str).concat(":count");
        this.f24030c = String.valueOf(str).concat(":value");
        this.f24031d = j;
    }

    /* renamed from: b */
    private final void m31945b() {
        this.f24032e.mo25662j();
        long c = this.f24032e.mo25896c().mo25474c();
        Editor edit = this.f24032e.m31822B().edit();
        edit.remove(this.f24029b);
        edit.remove(this.f24030c);
        edit.putLong(this.f24028a, c);
        edit.apply();
    }

    /* renamed from: c */
    private final long m31946c() {
        return this.f24032e.m31822B().getLong(this.f24028a, 0);
    }

    /* renamed from: a */
    public final void mo26181a(String str, long j) {
        this.f24032e.mo25662j();
        if (m31946c() == 0) {
            m31945b();
        }
        if (str == null) {
            str = "";
        }
        long j2 = this.f24032e.m31822B().getLong(this.f24029b, 0);
        if (j2 <= 0) {
            Editor edit = this.f24032e.m31822B().edit();
            edit.putString(this.f24030c, str);
            edit.putLong(this.f24029b, 1);
            edit.apply();
            return;
        }
        long j3 = j2 + 1;
        boolean z = (this.f24032e.mo25903m().mo26241u().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j3;
        Editor edit2 = this.f24032e.m31822B().edit();
        if (z) {
            edit2.putString(this.f24030c, str);
        }
        edit2.putLong(this.f24029b, j3);
        edit2.apply();
    }

    /* renamed from: a */
    public final Pair<String, Long> mo26180a() {
        long j;
        this.f24032e.mo25662j();
        this.f24032e.mo25662j();
        long c = m31946c();
        if (c == 0) {
            m31945b();
            j = 0;
        } else {
            j = Math.abs(c - this.f24032e.mo25896c().mo25474c());
        }
        long j2 = this.f24031d;
        if (j < j2) {
            return null;
        }
        if (j > (j2 << 1)) {
            m31945b();
            return null;
        }
        String string = this.f24032e.m31822B().getString(this.f24030c, null);
        long j3 = this.f24032e.m31822B().getLong(this.f24029b, 0);
        m31945b();
        if (string == null || j3 <= 0) {
            return C10196t3.f23930A;
        }
        return new Pair<>(string, Long.valueOf(j3));
    }
}
