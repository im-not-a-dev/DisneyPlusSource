package com.bamtechmedia.dominguez.analytics.p055m0;

import com.bamtechmedia.dominguez.analytics.p057o0.C2434c;
import com.bamtechmedia.dominguez.analytics.p059q0.C2449a;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.C11969r;
import p520io.reactivex.Single;
import p520io.reactivex.p531y.p536e.p542f.C12478t;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001a\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/analytics/contributors/AcquisitionContributor;", "Lcom/bamtechmedia/dominguez/analytics/globalvalues/AnalyticsStateContributor;", "acquisitionStore", "Lcom/bamtechmedia/dominguez/analytics/sharedstore/AcquisitionAnalyticsStore;", "ioScheduler", "Lio/reactivex/Scheduler;", "(Lcom/bamtechmedia/dominguez/analytics/sharedstore/AcquisitionAnalyticsStore;Lio/reactivex/Scheduler;)V", "createState", "Lio/reactivex/Single;", "", "", "analytics_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.analytics.m0.a */
/* compiled from: AcquisitionContributor.kt */
public final class C2380a implements C2434c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2449a f6604a;

    /* renamed from: b */
    private final C11969r f6605b;

    /* renamed from: com.bamtechmedia.dominguez.analytics.m0.a$a */
    /* compiled from: AcquisitionContributor.kt */
    static final class C2381a<V> implements Callable<T> {

        /* renamed from: c */
        final /* synthetic */ C2380a f6606c;

        C2381a(C2380a aVar) {
            this.f6606c = aVar;
        }

        public final Map<String, String> call() {
            return C13173j0.m40356a(C12907r.m40244a("acquisitionType", this.f6606c.f6604a.mo11577b()), C12907r.m40244a("cid", this.f6606c.f6604a.mo11576a()));
        }
    }

    public C2380a(C2449a aVar, C11969r rVar) {
        this.f6604a = aVar;
        this.f6605b = rVar;
    }

    /* renamed from: a */
    public Single<Map<String, String>> mo11521a() {
        Single<Map<String, String>> b = new C12478t(new C2381a(this)).mo30220b(this.f6605b);
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "SingleFromCallable {\n   ….subscribeOn(ioScheduler)");
        return b;
    }
}
