package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import com.google.android.gms.common.internal.C9908u;

/* renamed from: com.google.android.gms.measurement.internal.a4 */
public final class C9990a4 {

    /* renamed from: a */
    private final String f23272a;

    /* renamed from: b */
    private boolean f23273b;

    /* renamed from: c */
    private String f23274c;

    /* renamed from: d */
    private final /* synthetic */ C10196t3 f23275d;

    public C9990a4(C10196t3 t3Var, String str, String str2) {
        this.f23275d = t3Var;
        C9908u.m30863b(str);
        this.f23272a = str;
    }

    /* renamed from: a */
    public final String mo25580a() {
        if (!this.f23273b) {
            this.f23273b = true;
            this.f23274c = this.f23275d.m31822B().getString(this.f23272a, null);
        }
        return this.f23274c;
    }

    /* renamed from: a */
    public final void mo25581a(String str) {
        if (!C10251y8.m31985e(str, this.f23274c)) {
            Editor edit = this.f23275d.m31822B().edit();
            edit.putString(this.f23272a, str);
            edit.apply();
            this.f23274c = str;
        }
    }
}
