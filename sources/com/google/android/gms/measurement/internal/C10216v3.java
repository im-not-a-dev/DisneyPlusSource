package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import com.google.android.gms.common.internal.C9908u;

/* renamed from: com.google.android.gms.measurement.internal.v3 */
public final class C10216v3 {

    /* renamed from: a */
    private final String f23983a;

    /* renamed from: b */
    private final boolean f23984b;

    /* renamed from: c */
    private boolean f23985c;

    /* renamed from: d */
    private boolean f23986d;

    /* renamed from: e */
    private final /* synthetic */ C10196t3 f23987e;

    public C10216v3(C10196t3 t3Var, String str, boolean z) {
        this.f23987e = t3Var;
        C9908u.m30863b(str);
        this.f23983a = str;
        this.f23984b = z;
    }

    /* renamed from: a */
    public final boolean mo26127a() {
        if (!this.f23985c) {
            this.f23985c = true;
            this.f23986d = this.f23987e.m31822B().getBoolean(this.f23983a, this.f23984b);
        }
        return this.f23986d;
    }

    /* renamed from: a */
    public final void mo26126a(boolean z) {
        Editor edit = this.f23987e.m31822B().edit();
        edit.putBoolean(this.f23983a, z);
        edit.apply();
        this.f23986d = z;
    }
}
