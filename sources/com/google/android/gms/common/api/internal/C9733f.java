package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.C9924k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C9908u;
import com.google.android.gms.common.internal.C9915x0;
import com.google.android.gms.common.internal.C9916y;

@Deprecated
/* renamed from: com.google.android.gms.common.api.internal.f */
public final class C9733f {

    /* renamed from: d */
    private static final Object f22829d = new Object();

    /* renamed from: e */
    private static C9733f f22830e;

    /* renamed from: a */
    private final String f22831a;

    /* renamed from: b */
    private final Status f22832b;

    /* renamed from: c */
    private final boolean f22833c;

    C9733f(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(C9924k.common_google_play_services_unknown_issue));
        boolean z = false;
        if (identifier != 0) {
            if (resources.getInteger(identifier) != 0) {
                z = true;
            }
            this.f22833c = !z;
        } else {
            this.f22833c = false;
        }
        String a = C9915x0.m30884a(context);
        if (a == null) {
            a = new C9916y(context).mo25448a("google_app_id");
        }
        if (TextUtils.isEmpty(a)) {
            this.f22832b = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.f22831a = null;
            return;
        }
        this.f22831a = a;
        this.f22832b = Status.f22695X;
    }

    /* renamed from: a */
    public static Status m30270a(Context context) {
        Status status;
        C9908u.m30854a(context, (Object) "Context must not be null.");
        synchronized (f22829d) {
            if (f22830e == null) {
                f22830e = new C9733f(context);
            }
            status = f22830e.f22832b;
        }
        return status;
    }

    /* renamed from: b */
    public static boolean m30273b() {
        return m30271a("isMeasurementExplicitlyDisabled").f22833c;
    }

    /* renamed from: a */
    public static String m30272a() {
        return m30271a("getGoogleAppId").f22831a;
    }

    /* renamed from: a */
    private static C9733f m30271a(String str) {
        C9733f fVar;
        synchronized (f22829d) {
            if (f22830e != null) {
                fVar = f22830e;
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
                sb.append("Initialize must be called before ");
                sb.append(str);
                sb.append(".");
                throw new IllegalStateException(sb.toString());
            }
        }
        return fVar;
    }
}
