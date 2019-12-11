package com.bamtechmedia.dominguez.analytics;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.LocationManager;
import android.telephony.TelephonyManager;
import com.bamtechmedia.dominguez.analytics.p054l0.C2374a;
import com.bamtechmedia.dominguez.analytics.p055m0.C2399m;
import com.bamtechmedia.dominguez.analytics.p056n0.C2414a;
import com.bamtechmedia.dominguez.analytics.p056n0.C2426c;
import com.bamtechmedia.dominguez.analytics.p056n0.C2428e;
import com.bamtechmedia.dominguez.analytics.p057o0.C2434c;
import com.bamtechmedia.dominguez.core.utils.C5850n;
import java.util.Set;
import p163g.p201e.p203b.C5368a;

/* renamed from: com.bamtechmedia.dominguez.analytics.s */
/* compiled from: FeatureAnalyticsModule */
public abstract class C2469s {
    /* renamed from: a */
    static C2351f m9058a(Set<C2434c> set, C2360g gVar, C2374a aVar, C2336b bVar, C2364i iVar) {
        C2351f fVar = new C2351f(set, gVar, aVar, bVar, iVar);
        return fVar;
    }

    /* renamed from: b */
    static SharedPreferences m9061b(Context context) {
        return new C5850n(context, "AnalyticsSharedPrefs");
    }

    /* renamed from: c */
    static TelephonyManager m9062c(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    /* renamed from: a */
    static C2414a m9059a(C2426c cVar, C2428e eVar, C2336b bVar, C2399m mVar, C2364i iVar) {
        C2414a aVar = new C2414a(cVar, eVar, bVar, mVar, iVar);
        return aVar;
    }

    /* renamed from: a */
    static LocationManager m9057a(Context context) {
        return (LocationManager) context.getSystemService("location");
    }

    /* renamed from: a */
    static C5368a m9060a(C2436p pVar) {
        return new C5368a((C2447q) pVar);
    }
}
