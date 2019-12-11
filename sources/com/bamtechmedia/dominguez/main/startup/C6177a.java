package com.bamtechmedia.dominguez.main.startup;

import com.bamtech.sdk4.subscription.SubscriptionApi;
import com.bamtechmedia.dominguez.analytics.C2476z;
import com.bamtechmedia.dominguez.core.BuildInfo;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p520io.reactivex.C11969r;

/* renamed from: com.bamtechmedia.dominguez.main.startup.a */
/* compiled from: AppLaunchAnalyticsLifecycleObserver_Factory */
public final class C6177a implements C11895c<AppLaunchAnalyticsLifecycleObserver> {

    /* renamed from: a */
    private final Provider<C2476z> f14171a;

    /* renamed from: b */
    private final Provider<BuildInfo> f14172b;

    /* renamed from: c */
    private final Provider<C6199m> f14173c;

    /* renamed from: d */
    private final Provider<SubscriptionApi> f14174d;

    /* renamed from: e */
    private final Provider<C11969r> f14175e;

    public C6177a(Provider<C2476z> provider, Provider<BuildInfo> provider2, Provider<C6199m> provider3, Provider<SubscriptionApi> provider4, Provider<C11969r> provider5) {
        this.f14171a = provider;
        this.f14172b = provider2;
        this.f14173c = provider3;
        this.f14174d = provider4;
        this.f14175e = provider5;
    }

    /* renamed from: a */
    public static C6177a m19641a(Provider<C2476z> provider, Provider<BuildInfo> provider2, Provider<C6199m> provider3, Provider<SubscriptionApi> provider4, Provider<C11969r> provider5) {
        C6177a aVar = new C6177a(provider, provider2, provider3, provider4, provider5);
        return aVar;
    }

    public AppLaunchAnalyticsLifecycleObserver get() {
        AppLaunchAnalyticsLifecycleObserver appLaunchAnalyticsLifecycleObserver = new AppLaunchAnalyticsLifecycleObserver((C2476z) this.f14171a.get(), (BuildInfo) this.f14172b.get(), (C6199m) this.f14173c.get(), (SubscriptionApi) this.f14174d.get(), (C11969r) this.f14175e.get());
        return appLaunchAnalyticsLifecycleObserver;
    }
}
