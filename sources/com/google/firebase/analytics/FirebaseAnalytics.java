package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.C9908u;
import com.google.android.gms.measurement.internal.C10072h9;
import com.google.android.gms.measurement.internal.C10136n6;
import com.google.android.gms.measurement.internal.C10145o4;
import com.google.firebase.iid.FirebaseInstanceId;
import p163g.p449j.p450a.p451a.p457d.p464g.C11161ic;
import p163g.p449j.p450a.p451a.p457d.p464g.C11189kc;

public final class FirebaseAnalytics {

    /* renamed from: d */
    private static volatile FirebaseAnalytics f24733d;

    /* renamed from: a */
    private final C10145o4 f24734a;

    /* renamed from: b */
    private final C11189kc f24735b;

    /* renamed from: c */
    private final boolean f24736c;

    private FirebaseAnalytics(C10145o4 o4Var) {
        C9908u.m30853a(o4Var);
        this.f24734a = o4Var;
        this.f24735b = null;
        this.f24736c = false;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f24733d == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f24733d == null) {
                    if (C11189kc.m35503f(context)) {
                        f24733d = new FirebaseAnalytics(C11189kc.m35483a(context));
                    } else {
                        f24733d = new FirebaseAnalytics(C10145o4.m31729a(context, (C11161ic) null));
                    }
                }
            }
        }
        return f24733d;
    }

    @Keep
    public static C10136n6 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        if (!C11189kc.m35503f(context)) {
            return null;
        }
        C11189kc a = C11189kc.m35484a(context, (String) null, (String) null, (String) null, bundle);
        if (a == null) {
            return null;
        }
        return new C10423b(a);
    }

    @Keep
    public final String getFirebaseInstanceId() {
        return FirebaseInstanceId.getInstance().getId();
    }

    @Keep
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        if (this.f24736c) {
            this.f24735b.mo28632a(activity, str, str2);
        } else if (!C10072h9.m31319a()) {
            this.f24734a.mo25898e().mo25877w().mo25908a("setCurrentScreen must be called from the main thread");
        } else {
            this.f24734a.mo26017B().mo26169a(activity, str, str2);
        }
    }

    private FirebaseAnalytics(C11189kc kcVar) {
        C9908u.m30853a(kcVar);
        this.f24734a = null;
        this.f24735b = kcVar;
        this.f24736c = true;
    }
}
