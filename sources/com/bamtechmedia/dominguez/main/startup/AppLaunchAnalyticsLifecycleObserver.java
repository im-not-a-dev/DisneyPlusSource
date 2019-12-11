package com.bamtechmedia.dominguez.main.startup;

import androidx.lifecycle.C0708c;
import androidx.lifecycle.C0710d;
import androidx.lifecycle.C0722m;
import com.bamtech.sdk4.subscription.Subscription;
import com.bamtech.sdk4.subscription.SubscriptionApi;
import com.bamtech.sdk4.useractivity.GlimpseEvent;
import com.bamtech.sdk4.useractivity.GlimpseEvent.Custom;
import com.bamtechmedia.dominguez.analytics.C2335a0;
import com.bamtechmedia.dominguez.analytics.C2476z;
import com.bamtechmedia.dominguez.core.BuildInfo;
import com.bamtechmedia.dominguez.core.utils.C5855o;
import com.bamtechmedia.dominguez.core.utils.C5859p;
import com.uber.autodispose.android.lifecycle.C10541b;
import java.util.List;
import java.util.Map;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C12880j;
import p163g.p503n.p504a.C11790c0;
import p163g.p503n.p504a.C11792d0;
import p163g.p503n.p504a.C11793e;
import p520io.reactivex.C11969r;
import p520io.reactivex.C11974s;
import p520io.reactivex.Single;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\"\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\u0016\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/main/startup/AppLaunchAnalyticsLifecycleObserver;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "glimpse", "Lcom/bamtechmedia/dominguez/analytics/GlimpseAnalytics;", "buildInfo", "Lcom/bamtechmedia/dominguez/core/BuildInfo;", "versionCheck", "Lcom/bamtechmedia/dominguez/main/startup/VersionCheck;", "subscriptionApi", "Lcom/bamtech/sdk4/subscription/SubscriptionApi;", "ioScheduler", "Lio/reactivex/Scheduler;", "(Lcom/bamtechmedia/dominguez/analytics/GlimpseAnalytics;Lcom/bamtechmedia/dominguez/core/BuildInfo;Lcom/bamtechmedia/dominguez/main/startup/VersionCheck;Lcom/bamtech/sdk4/subscription/SubscriptionApi;Lio/reactivex/Scheduler;)V", "extras", "", "", "", "subscriptions", "", "Lcom/bamtech/sdk4/subscription/Subscription;", "markInstallOrUpdate", "Lkotlin/Pair;", "onCreate", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "Companion", "appStart_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: AppLaunchAnalyticsLifecycleObserver.kt */
public final class AppLaunchAnalyticsLifecycleObserver implements C0710d {

    /* renamed from: U */
    private final BuildInfo f14163U;

    /* renamed from: V */
    private final C6199m f14164V;

    /* renamed from: W */
    private final SubscriptionApi f14165W;

    /* renamed from: X */
    private final C11969r f14166X;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C2476z f14167c;

    /* renamed from: com.bamtechmedia.dominguez.main.startup.AppLaunchAnalyticsLifecycleObserver$a */
    /* compiled from: AppLaunchAnalyticsLifecycleObserver.kt */
    public static final class C6173a {
        private C6173a() {
        }

        public /* synthetic */ C6173a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.main.startup.AppLaunchAnalyticsLifecycleObserver$b */
    /* compiled from: AppLaunchAnalyticsLifecycleObserver.kt */
    static final class C6174b<T, R> implements Function<T, R> {

        /* renamed from: c */
        final /* synthetic */ AppLaunchAnalyticsLifecycleObserver f14168c;

        C6174b(AppLaunchAnalyticsLifecycleObserver appLaunchAnalyticsLifecycleObserver) {
            this.f14168c = appLaunchAnalyticsLifecycleObserver;
        }

        /* renamed from: a */
        public final Map<String, Object> apply(List<Subscription> list) {
            return this.f14168c.m19630a(list);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.main.startup.AppLaunchAnalyticsLifecycleObserver$c */
    /* compiled from: AppLaunchAnalyticsLifecycleObserver.kt */
    static final class C6175c<T> implements Consumer<Map<String, ? extends Object>> {

        /* renamed from: c */
        final /* synthetic */ AppLaunchAnalyticsLifecycleObserver f14169c;

        C6175c(AppLaunchAnalyticsLifecycleObserver appLaunchAnalyticsLifecycleObserver) {
            this.f14169c = appLaunchAnalyticsLifecycleObserver;
        }

        /* renamed from: a */
        public final void accept(Map<String, ? extends Object> map) {
            C2476z a = this.f14169c.f14167c;
            Custom appLaunched = GlimpseEvent.Companion.getAppLaunched();
            C12880j.m40222a((Object) map, "it");
            a.mo11536a("", appLaunched, map);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.main.startup.AppLaunchAnalyticsLifecycleObserver$d */
    /* compiled from: AppLaunchAnalyticsLifecycleObserver.kt */
    static final class C6176d<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C6176d f14170c = new C6176d();

        C6176d() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
        }
    }

    static {
        new C6173a(null);
    }

    public AppLaunchAnalyticsLifecycleObserver(C2476z zVar, BuildInfo buildInfo, C6199m mVar, SubscriptionApi subscriptionApi, C11969r rVar) {
        this.f14167c = zVar;
        this.f14163U = buildInfo;
        this.f14164V = mVar;
        this.f14165W = subscriptionApi;
        this.f14166X = rVar;
    }

    /* renamed from: a */
    public /* synthetic */ void mo4126a(C0722m mVar) {
        C0708c.m3735d(this, mVar);
    }

    /* renamed from: b */
    public void mo4127b(C0722m mVar) {
        C5855o oVar = C5855o.f13640a;
        Single b = this.f14165W.getSubscriptions().mo30233g(new C6174b(this)).mo30220b(this.f14166X);
        C12880j.m40222a((Object) b, "subscriptionApi.getSubsc….subscribeOn(ioScheduler)");
        C10541b a = C10541b.m33254a(mVar);
        C12880j.m40222a((Object) a, "AndroidLifecycleScopeProvider.from(\n    this)");
        Object a2 = b.mo30215a((C11974s<T, ? extends R>) C11793e.m37930a((C11790c0) a));
        C12880j.m40222a(a2, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((C11792d0) a2).mo29920a(new C6175c(this), C6176d.f14170c);
    }

    /* renamed from: c */
    public /* synthetic */ void mo4128c(C0722m mVar) {
        C0708c.m3734c(this, mVar);
    }

    /* renamed from: d */
    public /* synthetic */ void mo4129d(C0722m mVar) {
        C0708c.m3737f(this, mVar);
    }

    /* renamed from: e */
    public /* synthetic */ void mo4130e(C0722m mVar) {
        C0708c.m3733b(this, mVar);
    }

    /* renamed from: f */
    public /* synthetic */ void mo4131f(C0722m mVar) {
        C0708c.m3736e(this, mVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Map<String, Object> m19630a(List<Subscription> list) {
        Map map;
        Map a = C13173j0.m40356a(C12907r.m40244a("appName", "Disney+"), C12907r.m40244a("appVersion", String.valueOf(this.f14163U.mo12781d())));
        Subscription subscription = (Subscription) C13199w.m40591g((List) list);
        if (subscription != null) {
            map = C13173j0.m40356a(C12907r.m40244a("isActive", Boolean.valueOf(subscription.isActive())), C12907r.m40244a("source", subscription.getSource()));
        } else {
            map = null;
        }
        return C5859p.m18900a(C5859p.m18900a(a, C12907r.m40244a("subscription", map)), m19631b());
    }

    /* renamed from: b */
    private final Pair<String, Object> m19631b() {
        boolean z = true;
        boolean z2 = this.f14164V.mo18799a() == -1;
        if (this.f14164V.mo18799a() == this.f14163U.mo12781d()) {
            z = false;
        }
        if (z2) {
            return new Pair<>("installTimestamp", C2335a0.f6535b.mo11444a());
        } else if (!z) {
            return new Pair<>("", null);
        } else {
            return new Pair<>("updateTimestamp", C2335a0.f6535b.mo11444a());
        }
    }
}
