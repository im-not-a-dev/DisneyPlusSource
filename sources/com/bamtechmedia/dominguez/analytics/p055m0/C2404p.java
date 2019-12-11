package com.bamtechmedia.dominguez.analytics.p055m0;

import com.bamtechmedia.dominguez.analytics.C2350e0;
import com.bamtechmedia.dominguez.analytics.p057o0.C2434c;
import com.bamtechmedia.dominguez.core.BuildInfo;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.C11969r;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001a\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b0\nH\u0016J \u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/analytics/contributors/PurchaseContributor;", "Lcom/bamtechmedia/dominguez/analytics/globalvalues/AnalyticsStateContributor;", "paywallStore", "Lcom/bamtechmedia/dominguez/analytics/PaywallAnalyticsStore;", "buildInfo", "Lcom/bamtechmedia/dominguez/core/BuildInfo;", "ioScheduler", "Lio/reactivex/Scheduler;", "(Lcom/bamtechmedia/dominguez/analytics/PaywallAnalyticsStore;Lcom/bamtechmedia/dominguez/core/BuildInfo;Lio/reactivex/Scheduler;)V", "createState", "Lio/reactivex/Single;", "", "", "specifyAdobeProducts", "purchaseMethod", "purchaseName", "purchasePrice", "analytics_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.analytics.m0.p */
/* compiled from: PurchaseContributor.kt */
public final class C2404p implements C2434c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2350e0 f6650a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final BuildInfo f6651b;

    /* renamed from: c */
    private final C11969r f6652c;

    /* renamed from: com.bamtechmedia.dominguez.analytics.m0.p$a */
    /* compiled from: PurchaseContributor.kt */
    static final class C2405a<V> implements Callable<T> {

        /* renamed from: c */
        final /* synthetic */ C2404p f6653c;

        C2405a(C2404p pVar) {
            this.f6653c = pVar;
        }

        public final Map<String, String> call() {
            C2404p pVar = this.f6653c;
            return C13173j0.m40356a(C12907r.m40244a("userPurchaseSKU", this.f6653c.f6650a.mo11473c()), C12907r.m40244a("userPurchaseMethod", this.f6653c.f6651b.mo12779b().name()), C12907r.m40244a("userPurchaseStartDate", this.f6653c.f6650a.mo11477e()), C12907r.m40244a("userPurchaseEndDate", this.f6653c.f6650a.mo11479f()), C12907r.m40244a("userProductName", this.f6653c.f6650a.mo11471b()), C12907r.m40244a("s.products", pVar.m8950a(pVar.f6651b.mo12779b().name(), this.f6653c.f6650a.mo11471b(), this.f6653c.f6650a.mo11469a())));
        }
    }

    public C2404p(C2350e0 e0Var, BuildInfo buildInfo, C11969r rVar) {
        this.f6650a = e0Var;
        this.f6651b = buildInfo;
        this.f6652c = rVar;
    }

    /* renamed from: a */
    public Single<Map<String, String>> mo11521a() {
        Single<Map<String, String>> b = Single.m38401c((Callable<? extends T>) new C2405a<Object>(this)).mo30220b(this.f6652c);
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "Single.fromCallable {\n  ….subscribeOn(ioScheduler)");
        return b;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final String m8950a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(';');
        sb.append(str2);
        sb.append(";1;");
        sb.append(C12839z.m40186e(str3, 1));
        return sb.toString();
    }
}
