package com.bamtechmedia.dominguez.analytics.p055m0;

import com.bamtechmedia.dominguez.analytics.p057o0.C2434c;
import com.bamtechmedia.dominguez.analytics.p059q0.C2452d;
import com.bamtechmedia.dominguez.analytics.p059q0.C2467o;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.C11969r;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001a\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b0\nH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/analytics/contributors/LoginStatusContributor;", "Lcom/bamtechmedia/dominguez/analytics/globalvalues/AnalyticsStateContributor;", "loginStore", "Lcom/bamtechmedia/dominguez/analytics/sharedstore/LoginStatusAnalyticsStore;", "userSubscriptionInfoAnalyticsStore", "Lcom/bamtechmedia/dominguez/analytics/sharedstore/UserSubscriptionInfoAnalyticsStore;", "ioScheduler", "Lio/reactivex/Scheduler;", "(Lcom/bamtechmedia/dominguez/analytics/sharedstore/LoginStatusAnalyticsStore;Lcom/bamtechmedia/dominguez/analytics/sharedstore/UserSubscriptionInfoAnalyticsStore;Lio/reactivex/Scheduler;)V", "createState", "Lio/reactivex/Single;", "", "", "analytics_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.analytics.m0.k */
/* compiled from: LoginStatusContributor.kt */
public final class C2396k implements C2434c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2452d f6634a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2467o f6635b;

    /* renamed from: c */
    private final C11969r f6636c;

    /* renamed from: com.bamtechmedia.dominguez.analytics.m0.k$a */
    /* compiled from: LoginStatusContributor.kt */
    static final class C2397a<V> implements Callable<T> {

        /* renamed from: c */
        final /* synthetic */ C2396k f6637c;

        C2397a(C2396k kVar) {
            this.f6637c = kVar;
        }

        public final Map<String, String> call() {
            return C13173j0.m40356a(C12907r.m40244a("loginStatus", this.f6637c.f6634a.mo11585a()), C12907r.m40244a("userSubscriptionState", this.f6637c.f6635b.mo11589b()), C12907r.m40244a("userVisitorState", this.f6637c.f6635b.mo11587a()));
        }
    }

    public C2396k(C2452d dVar, C2467o oVar, C11969r rVar) {
        this.f6634a = dVar;
        this.f6635b = oVar;
        this.f6636c = rVar;
    }

    /* renamed from: a */
    public Single<Map<String, String>> mo11521a() {
        Single<Map<String, String>> b = Single.m38401c((Callable<? extends T>) new C2397a<Object>(this)).mo30220b(this.f6636c);
        C12880j.m40222a((Object) b, "Single.fromCallable {\n  ….subscribeOn(ioScheduler)");
        return b;
    }
}
