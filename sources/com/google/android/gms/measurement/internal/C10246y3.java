package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import com.google.android.gms.common.internal.C9908u;

/* renamed from: com.google.android.gms.measurement.internal.y3 */
public final class C10246y3 {

    /* renamed from: a */
    private final String f24063a;

    /* renamed from: b */
    private final long f24064b;

    /* renamed from: c */
    private boolean f24065c;

    /* renamed from: d */
    private long f24066d;

    /* renamed from: e */
    private final /* synthetic */ C10196t3 f24067e;

    public C10246y3(C10196t3 t3Var, String str, long j) {
        this.f24067e = t3Var;
        C9908u.m30863b(str);
        this.f24063a = str;
        this.f24064b = j;
    }

    /* renamed from: a */
    public final long mo26196a() {
        if (!this.f24065c) {
            this.f24065c = true;
            this.f24066d = this.f24067e.m31822B().getLong(this.f24063a, this.f24064b);
        }
        return this.f24066d;
    }

    /* renamed from: a */
    public final void mo26197a(long j) {
        Editor edit = this.f24067e.m31822B().edit();
        edit.putLong(this.f24063a, j);
        edit.apply();
        this.f24066d = j;
    }
}
