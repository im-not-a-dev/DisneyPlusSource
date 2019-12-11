package com.google.android.gms.measurement.module;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.C9908u;
import com.google.android.gms.measurement.internal.C10145o4;
import p163g.p449j.p450a.p451a.p457d.p464g.C11161ic;

public class Analytics {

    /* renamed from: a */
    private static volatile Analytics f24096a;

    private Analytics(C10145o4 o4Var) {
        C9908u.m30853a(o4Var);
    }

    @Keep
    public static Analytics getInstance(Context context) {
        if (f24096a == null) {
            synchronized (Analytics.class) {
                if (f24096a == null) {
                    f24096a = new Analytics(C10145o4.m31729a(context, (C11161ic) null));
                }
            }
        }
        return f24096a;
    }
}
