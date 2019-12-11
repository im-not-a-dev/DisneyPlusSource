package com.bamtechmedia.dominguez.analytics.p058p0;

import com.bamtechmedia.dominguez.analytics.p059q0.C2452d;
import com.bamtechmedia.dominguez.auth.p066r0.C2793c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.C11969r;
import p520io.reactivex.Completable;
import p520io.reactivex.functions.C11945a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/analytics/loginstatus/AnalyticsLogoutAction;", "Lcom/bamtechmedia/dominguez/auth/logout/LogOutAction;", "loginStatusStore", "Lcom/bamtechmedia/dominguez/analytics/sharedstore/LoginStatusAnalyticsStore;", "ioScheduler", "Lio/reactivex/Scheduler;", "(Lcom/bamtechmedia/dominguez/analytics/sharedstore/LoginStatusAnalyticsStore;Lio/reactivex/Scheduler;)V", "logOutActionId", "", "getLogOutActionId", "()Ljava/lang/String;", "onLogout", "Lio/reactivex/Completable;", "onSoftLogout", "Companion", "analytics_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.analytics.p0.c */
/* compiled from: AnalyticsLogoutAction.kt */
public final class C2442c implements C2793c {

    /* renamed from: a */
    private final String f6732a = "analytics";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2452d f6733b;

    /* renamed from: c */
    private final C11969r f6734c;

    /* renamed from: com.bamtechmedia.dominguez.analytics.p0.c$a */
    /* compiled from: AnalyticsLogoutAction.kt */
    public static final class C2443a {
        private C2443a() {
        }

        public /* synthetic */ C2443a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.analytics.p0.c$b */
    /* compiled from: AnalyticsLogoutAction.kt */
    static final class C2444b implements C11945a {

        /* renamed from: a */
        final /* synthetic */ C2442c f6735a;

        C2444b(C2442c cVar) {
            this.f6735a = cVar;
        }

        public final void run() {
            this.f6735a.f6733b.mo11586a("false");
        }
    }

    static {
        new C2443a(null);
    }

    public C2442c(C2452d dVar, C11969r rVar) {
        this.f6733b = dVar;
        this.f6734c = rVar;
    }

    /* renamed from: b */
    public String mo11571b() {
        return this.f6732a;
    }

    /* renamed from: c */
    public Completable mo11572c() {
        Completable h = Completable.m38169h();
        Intrinsics.checkReturnedValueIsNotNull((Object) h, "Completable.complete()");
        return h;
    }

    /* renamed from: a */
    public Completable mo11570a() {
        Completable b = Completable.m38166c((C11945a) new C2444b(this)).mo30051b(this.f6734c);
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "Completable.fromAction {….subscribeOn(ioScheduler)");
        return b;
    }
}
