package com.bamtechmedia.dominguez.analytics.p058p0;

import com.bamtechmedia.dominguez.analytics.p059q0.C2452d;
import com.bamtechmedia.dominguez.auth.p065q0.C2783b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.C11969r;
import p520io.reactivex.Completable;
import p520io.reactivex.functions.C11945a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/analytics/loginstatus/AnalyticsLoginAction;", "Lcom/bamtechmedia/dominguez/auth/login/LogInAction;", "loginStatusStore", "Lcom/bamtechmedia/dominguez/analytics/sharedstore/LoginStatusAnalyticsStore;", "ioScheduler", "Lio/reactivex/Scheduler;", "(Lcom/bamtechmedia/dominguez/analytics/sharedstore/LoginStatusAnalyticsStore;Lio/reactivex/Scheduler;)V", "onLogin", "Lio/reactivex/Completable;", "Companion", "analytics_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.analytics.p0.a */
/* compiled from: AnalyticsLoginAction.kt */
public final class C2438a implements C2783b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2452d f6727a;

    /* renamed from: b */
    private final C11969r f6728b;

    /* renamed from: com.bamtechmedia.dominguez.analytics.p0.a$a */
    /* compiled from: AnalyticsLoginAction.kt */
    public static final class C2439a {
        private C2439a() {
        }

        public /* synthetic */ C2439a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.analytics.p0.a$b */
    /* compiled from: AnalyticsLoginAction.kt */
    static final class C2440b implements C11945a {

        /* renamed from: a */
        final /* synthetic */ C2438a f6729a;

        C2440b(C2438a aVar) {
            this.f6729a = aVar;
        }

        public final void run() {
            this.f6729a.f6727a.mo11586a("true");
        }
    }

    static {
        new C2439a(null);
    }

    public C2438a(C2452d dVar, C11969r rVar) {
        this.f6727a = dVar;
        this.f6728b = rVar;
    }

    /* renamed from: a */
    public Completable mo11569a() {
        Completable b = Completable.m38166c((C11945a) new C2440b(this)).mo30051b(this.f6728b);
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "Completable.fromAction {….subscribeOn(ioScheduler)");
        return b;
    }
}
