package com.bamtechmedia.dominguez.analytics.p055m0;

import com.bamtechmedia.dominguez.analytics.p057o0.C2434c;
import com.bamtechmedia.dominguez.analytics.p059q0.C2450b;
import com.bamtechmedia.dominguez.analytics.p059q0.C2451c;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.C11969r;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001a\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/analytics/contributors/DeepLinkContributor;", "Lcom/bamtechmedia/dominguez/analytics/globalvalues/AnalyticsStateContributor;", "deepLinkAnalyticsStore", "Lcom/bamtechmedia/dominguez/analytics/sharedstore/DeepLinkAnalyticsStore;", "ioScheduler", "Lio/reactivex/Scheduler;", "(Lcom/bamtechmedia/dominguez/analytics/sharedstore/DeepLinkAnalyticsStore;Lio/reactivex/Scheduler;)V", "createState", "Lio/reactivex/Single;", "", "", "analytics_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.analytics.m0.g */
/* compiled from: DeepLinkContributor.kt */
public final class C2390g implements C2434c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2451c f6627a;

    /* renamed from: b */
    private final C11969r f6628b;

    /* renamed from: com.bamtechmedia.dominguez.analytics.m0.g$a */
    /* compiled from: DeepLinkContributor.kt */
    static final class C2391a<V> implements Callable<T> {

        /* renamed from: c */
        final /* synthetic */ C2390g f6629c;

        C2391a(C2390g gVar) {
            this.f6629c = gVar;
        }

        public final Map<String, String> call() {
            C2450b a = this.f6629c.f6627a.mo11583a();
            if (a == null) {
                return C13173j0.m40350a();
            }
            return C13173j0.m40356a(C12907r.m40244a("deeplinkUrl", a.mo11579b()), C12907r.m40244a("deeplinkPageLanding", a.mo11578a()));
        }
    }

    public C2390g(C2451c cVar, C11969r rVar) {
        this.f6627a = cVar;
        this.f6628b = rVar;
    }

    /* renamed from: a */
    public Single<Map<String, String>> mo11521a() {
        Single<Map<String, String>> b = Single.m38401c((Callable<? extends T>) new C2391a<Object>(this)).mo30220b(this.f6628b);
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "Single.fromCallable {\n  ….subscribeOn(ioScheduler)");
        return b;
    }
}
