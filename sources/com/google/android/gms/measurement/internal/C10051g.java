package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C9908u;
import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.g */
public final class C10051g {

    /* renamed from: a */
    final String f23470a;

    /* renamed from: b */
    final String f23471b;

    /* renamed from: c */
    private final String f23472c;

    /* renamed from: d */
    final long f23473d;

    /* renamed from: e */
    final long f23474e;

    /* renamed from: f */
    final C10073i f23475f;

    private C10051g(C10145o4 o4Var, String str, String str2, String str3, long j, long j2, C10073i iVar) {
        C9908u.m30863b(str2);
        C9908u.m30863b(str3);
        C9908u.m30853a(iVar);
        this.f23470a = str2;
        this.f23471b = str3;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f23472c = str;
        this.f23473d = j;
        this.f23474e = j2;
        long j3 = this.f23474e;
        if (j3 != 0 && j3 > this.f23473d) {
            o4Var.mo25898e().mo25877w().mo25910a("Event created with reverse previous/current timestamps. appId, name", C10099k3.m31423a(str2), C10099k3.m31423a(str3));
        }
        this.f23475f = iVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C10051g mo25761a(C10145o4 o4Var, long j) {
        C10051g gVar = new C10051g(o4Var, this.f23472c, this.f23470a, this.f23471b, this.f23473d, j, this.f23475f);
        return gVar;
    }

    public final String toString() {
        String str = this.f23470a;
        String str2 = this.f23471b;
        String valueOf = String.valueOf(this.f23475f);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("Event{appId='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        sb.append("', params=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }

    C10051g(C10145o4 o4Var, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        C10073i iVar;
        C9908u.m30863b(str2);
        C9908u.m30863b(str3);
        this.f23470a = str2;
        this.f23471b = str3;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f23472c = str;
        this.f23473d = j;
        this.f23474e = j2;
        long j3 = this.f23474e;
        if (j3 != 0 && j3 > this.f23473d) {
            o4Var.mo25898e().mo25877w().mo25909a("Event created with reverse previous/current timestamps. appId", C10099k3.m31423a(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            iVar = new C10073i(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                if (str4 == null) {
                    o4Var.mo25898e().mo25874t().mo25908a("Param name can't be null");
                    it.remove();
                } else {
                    Object a = o4Var.mo26022G().mo26217a(str4, bundle2.get(str4));
                    if (a == null) {
                        o4Var.mo25898e().mo25877w().mo25909a("Param value can't be null", o4Var.mo26021F().mo25796b(str4));
                        it.remove();
                    } else {
                        o4Var.mo26022G().mo26221a(bundle2, str4, a);
                    }
                }
            }
            iVar = new C10073i(bundle2);
        }
        this.f23475f = iVar;
    }
}
