package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.C9908u;
import p163g.p449j.p450a.p451a.p457d.p464g.C11161ic;

/* renamed from: com.google.android.gms.measurement.internal.s5 */
public final class C10188s5 {

    /* renamed from: a */
    final Context f23909a;

    /* renamed from: b */
    String f23910b;

    /* renamed from: c */
    String f23911c;

    /* renamed from: d */
    String f23912d;

    /* renamed from: e */
    Boolean f23913e;

    /* renamed from: f */
    long f23914f;

    /* renamed from: g */
    C11161ic f23915g;

    /* renamed from: h */
    boolean f23916h = true;

    public C10188s5(Context context, C11161ic icVar) {
        C9908u.m30853a(context);
        Context applicationContext = context.getApplicationContext();
        C9908u.m30853a(applicationContext);
        this.f23909a = applicationContext;
        if (icVar != null) {
            this.f23915g = icVar;
            this.f23910b = icVar.f26257Y;
            this.f23911c = icVar.f26256X;
            this.f23912d = icVar.f26255W;
            this.f23916h = icVar.f26254V;
            this.f23914f = icVar.f26253U;
            Bundle bundle = icVar.f26258Z;
            if (bundle != null) {
                this.f23913e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
