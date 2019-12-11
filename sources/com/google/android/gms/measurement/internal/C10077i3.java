package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.C9908u;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.i3 */
public final class C10077i3 extends C10101k5 {

    /* renamed from: c */
    private static final AtomicReference<String[]> f23531c = new AtomicReference<>();

    /* renamed from: d */
    private static final AtomicReference<String[]> f23532d = new AtomicReference<>();

    /* renamed from: e */
    private static final AtomicReference<String[]> f23533e = new AtomicReference<>();

    C10077i3(C10145o4 o4Var) {
        super(o4Var);
    }

    /* renamed from: t */
    private final boolean m31328t() {
        mo25894a();
        return this.f23701a.mo26035m() && this.f23701a.mo25898e().mo25873a(3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo25795a(String str) {
        if (str == null) {
            return null;
        }
        if (!m31328t()) {
            return str;
        }
        return m31327a(str, C10157p5.f23852b, C10157p5.f23851a, f23531c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo25796b(String str) {
        if (str == null) {
            return null;
        }
        if (!m31328t()) {
            return str;
        }
        return m31327a(str, C10146o5.f23827b, C10146o5.f23826a, f23532d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo25797c(String str) {
        if (str == null) {
            return null;
        }
        if (!m31328t()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return m31327a(str, C10178r5.f23888b, C10178r5.f23887a, f23533e);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("experiment_id");
        sb.append("(");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final boolean mo25655r() {
        return false;
    }

    /* renamed from: a */
    private static String m31327a(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        C9908u.m30853a(strArr);
        C9908u.m30853a(strArr2);
        C9908u.m30853a(atomicReference);
        C9908u.m30860a(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (C10251y8.m31985e(str, strArr[i])) {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    if (strArr3[i] == null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(strArr2[i]);
                        sb.append("(");
                        sb.append(strArr[i]);
                        sb.append(")");
                        strArr3[i] = sb.toString();
                    }
                    str2 = strArr3[i];
                }
                return str2;
            }
        }
        return str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo25794a(C10084j jVar) {
        if (jVar == null) {
            return null;
        }
        if (!m31328t()) {
            return jVar.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(jVar.f23560V);
        sb.append(",name=");
        sb.append(mo25795a(jVar.f23562c));
        sb.append(",params=");
        sb.append(m31326a(jVar.f23559U));
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo25793a(C10051g gVar) {
        if (gVar == null) {
            return null;
        }
        if (!m31328t()) {
            return gVar.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Event{appId='");
        sb.append(gVar.f23470a);
        sb.append("', name='");
        sb.append(mo25795a(gVar.f23471b));
        sb.append("', params=");
        sb.append(m31326a(gVar.f23475f));
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    private final String m31326a(C10073i iVar) {
        if (iVar == null) {
            return null;
        }
        if (!m31328t()) {
            return iVar.toString();
        }
        return mo25792a(iVar.mo25785c());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo25792a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!m31328t()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        for (String str : bundle.keySet()) {
            if (sb.length() != 0) {
                sb.append(", ");
            } else {
                sb.append("Bundle[{");
            }
            sb.append(mo25796b(str));
            sb.append("=");
            sb.append(bundle.get(str));
        }
        sb.append("}]");
        return sb.toString();
    }
}
