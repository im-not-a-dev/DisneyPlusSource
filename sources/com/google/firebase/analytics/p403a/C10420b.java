package com.google.firebase.analytics.p403a;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.C9908u;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.analytics.connector.internal.C10425b;
import java.util.concurrent.ConcurrentHashMap;
import p163g.p449j.p482b.C11510a;
import p163g.p449j.p482b.C11512c;
import p163g.p449j.p482b.p483e.C11519a;
import p163g.p449j.p482b.p483e.C11522d;

/* renamed from: com.google.firebase.analytics.a.b */
public class C10420b implements C10419a {

    /* renamed from: b */
    private static volatile C10419a f24737b;

    /* renamed from: a */
    private final AppMeasurement f24738a;

    private C10420b(AppMeasurement appMeasurement) {
        C9908u.m30853a(appMeasurement);
        this.f24738a = appMeasurement;
        new ConcurrentHashMap();
    }

    /* renamed from: a */
    public static C10419a m32927a(C11512c cVar, Context context, C11522d dVar) {
        C9908u.m30853a(cVar);
        C9908u.m30853a(context);
        C9908u.m30853a(dVar);
        C9908u.m30853a(context.getApplicationContext());
        if (f24737b == null) {
            synchronized (C10420b.class) {
                if (f24737b == null) {
                    Bundle bundle = new Bundle(1);
                    if (cVar.mo29435f()) {
                        dVar.mo27260a(C11510a.class, C10422d.f24740c, C10421c.f24739a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", cVar.mo29433e());
                    }
                    f24737b = new C10420b(AppMeasurement.m31053a(context, bundle));
                }
            }
        }
        return f24737b;
    }

    /* renamed from: a */
    public void mo27211a(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (C10425b.m32946a(str) && C10425b.m32947a(str2, bundle) && C10425b.m32949a(str, str2, bundle)) {
            this.f24738a.logEventInternal(str, str2, bundle);
        }
    }

    /* renamed from: a */
    public void mo27212a(String str, String str2, Object obj) {
        if (C10425b.m32946a(str) && C10425b.m32948a(str, str2)) {
            this.f24738a.mo25494a(str, str2, obj);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m32928a(C11519a aVar) {
        boolean z = ((C11510a) aVar.mo29447a()).f26907a;
        synchronized (C10420b.class) {
            ((C10420b) f24737b).f24738a.mo25495a(z);
        }
    }
}
