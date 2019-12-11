package com.bamtechmedia.dominguez.analytics;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.C0722m;
import androidx.lifecycle.C0733v;
import com.appboy.C1440a;
import com.appboy.C1476d;
import com.appboy.p024n.C1486a.C1488b;
import com.bamtechmedia.dominguez.core.BuildInfo;
import com.bamtechmedia.dominguez.core.BuildInfo.Environment;
import com.bamtechmedia.dominguez.core.p087h.C3824a;
import com.bamtechmedia.dominguez.core.p087h.C3824a.C3825a;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p163g.p164a.p165a.C4705m;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0016B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/analytics/AnalyticsInitializationAction;", "Lcom/bamtechmedia/dominguez/core/app/AppInitializationAction;", "analyticsBackgroundResponder", "Lcom/bamtechmedia/dominguez/analytics/AnalyticsBackgroundResponder;", "analyticsLifecycleResponder", "Lcom/bamtechmedia/dominguez/analytics/AnalyticsLifecycleResponder;", "pageLoadAnalytics", "Lcom/bamtechmedia/dominguez/analytics/PageLoadAnalyticsCallbacks;", "buildInfo", "Lcom/bamtechmedia/dominguez/core/BuildInfo;", "isTelevision", "", "(Lcom/bamtechmedia/dominguez/analytics/AnalyticsBackgroundResponder;Lcom/bamtechmedia/dominguez/analytics/AnalyticsLifecycleResponder;Lcom/bamtechmedia/dominguez/analytics/PageLoadAnalyticsCallbacks;Lcom/bamtechmedia/dominguez/core/BuildInfo;Z)V", "processLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "kotlin.jvm.PlatformType", "initializeAdobe", "", "application", "Landroid/app/Application;", "initializeBraze", "onApplicationCreate", "BrazeEnvironment", "analytics_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.analytics.k */
/* compiled from: AnalyticsInitializationAction.kt */
public final class C2370k implements C3824a {

    /* renamed from: a */
    private final C0722m f6581a = C0733v.m3782i();

    /* renamed from: b */
    private final AnalyticsBackgroundResponder f6582b;

    /* renamed from: c */
    private final C2373l f6583c;

    /* renamed from: d */
    private final C2345c0 f6584d;

    /* renamed from: e */
    private final BuildInfo f6585e;

    /* renamed from: f */
    private final boolean f6586f;

    /* renamed from: com.bamtechmedia.dominguez.analytics.k$a */
    /* compiled from: AnalyticsInitializationAction.kt */
    private enum C2371a {
        PROD("802476044819", "7d85580d-3cfd-4515-8d13-04b31c1a379b"),
        DEV("386345974412", "8109ede3-53a6-4fd2-bdf0-86ee4bed50f7");
        

        /* renamed from: U */
        private final String f6590U;

        /* renamed from: c */
        private final String f6591c;

        private C2371a(String str, String str2) {
            this.f6591c = str;
            this.f6590U = str2;
        }

        /* renamed from: a */
        public final String mo11496a() {
            return this.f6590U;
        }

        /* renamed from: b */
        public final String mo11497b() {
            return this.f6591c;
        }
    }

    public C2370k(AnalyticsBackgroundResponder analyticsBackgroundResponder, C2373l lVar, C2345c0 c0Var, BuildInfo buildInfo, boolean z) {
        this.f6582b = analyticsBackgroundResponder;
        this.f6583c = lVar;
        this.f6584d = c0Var;
        this.f6585e = buildInfo;
        this.f6586f = z;
    }

    /* renamed from: b */
    private final void m8893b(Application application) {
        C0722m mVar = this.f6581a;
        C12880j.m40222a((Object) mVar, "processLifecycleOwner");
        mVar.getLifecycle().mo4134a(this.f6582b);
        C4705m.m16371a((Context) application);
        C4705m.m16374a(Boolean.valueOf(false));
        application.registerActivityLifecycleCallbacks(this.f6583c);
    }

    /* renamed from: c */
    private final void m8894c(Application application) {
        C2371a aVar = this.f6585e.mo12778a() == Environment.PROD ? C2371a.PROD : C2371a.DEV;
        C1488b bVar = new C1488b();
        bVar.mo6697a(aVar.mo11496a());
        bVar.mo6700b("sdk.iad-03.braze.com");
        bVar.mo6704d(this.f6585e.mo12785g());
        bVar.mo6698a(this.f6585e.mo12782e());
        bVar.mo6702c(aVar.mo11497b());
        bVar.mo6701b(true);
        bVar.mo6703c(true);
        C1440a.m6918a((Context) application, bVar.mo6699a());
        if (this.f6586f) {
            C1440a.m6920b(application.getApplicationContext());
        } else {
            application.registerActivityLifecycleCallbacks(new C1476d(true, true));
        }
    }

    /* renamed from: a */
    public int mo11494a() {
        return C3825a.m12913a(this);
    }

    /* renamed from: a */
    public void mo11495a(Application application) {
        application.registerActivityLifecycleCallbacks(this.f6584d);
        m8893b(application);
        m8894c(application);
    }
}
