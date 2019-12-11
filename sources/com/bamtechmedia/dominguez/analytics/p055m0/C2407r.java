package com.bamtechmedia.dominguez.analytics.p055m0;

import com.bamtech.sdk4.session.SessionInfo;
import com.bamtechmedia.dominguez.analytics.p057o0.C2434c;
import com.bamtechmedia.dominguez.analytics.p057o0.C2435d;
import java.util.Map;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.C11969r;
import p520io.reactivex.Single;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u00012\u00020\u0002:\u0001\rB\u001f\b\u0007\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001a\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n0\u0004H\u0016J\u001a\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n0\u0004H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/analytics/contributors/SdkContributor;", "Lcom/bamtechmedia/dominguez/analytics/globalvalues/AnalyticsStateContributor;", "Lcom/bamtechmedia/dominguez/analytics/globalvalues/ConvivaMetaDataContributor;", "sdkSessionInfoSingle", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/session/SessionInfo;", "ioScheduler", "Lio/reactivex/Scheduler;", "(Lio/reactivex/Single;Lio/reactivex/Scheduler;)V", "createMetaData", "", "", "createState", "Companion", "analytics_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.analytics.m0.r */
/* compiled from: SdkContributor.kt */
public final class C2407r implements C2434c, C2435d {

    /* renamed from: a */
    private final Single<SessionInfo> f6657a;

    /* renamed from: b */
    private final C11969r f6658b;

    /* renamed from: com.bamtechmedia.dominguez.analytics.m0.r$a */
    /* compiled from: SdkContributor.kt */
    public static final class C2408a {
        private C2408a() {
        }

        public /* synthetic */ C2408a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.analytics.m0.r$b */
    /* compiled from: SdkContributor.kt */
    static final class C2409b<T, R> implements Function<T, R> {

        /* renamed from: c */
        public static final C2409b f6659c = new C2409b();

        C2409b() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0020, code lost:
            if (r1 != null) goto L_0x0024;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0045, code lost:
            if (r6 != null) goto L_0x0049;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.Map<java.lang.String, java.lang.String> apply(com.bamtech.sdk4.session.SessionInfo r6) {
            /*
                r5 = this;
                r0 = 4
                kotlin.Pair[] r0 = new kotlin.Pair[r0]
                com.bamtech.sdk4.session.SessionDeviceInfo r1 = r6.getDevice()
                java.lang.String r1 = r1.getId()
                java.lang.String r2 = "deviceId"
                kotlin.Pair r1 = kotlin.C12907r.m40244a(r2, r1)
                r2 = 0
                r0[r2] = r1
                com.bamtech.sdk4.session.SessionAccountInfo r1 = r6.getAccount()
                java.lang.String r2 = "unknown"
                if (r1 == 0) goto L_0x0023
                java.lang.String r1 = r1.getId()
                if (r1 == 0) goto L_0x0023
                goto L_0x0024
            L_0x0023:
                r1 = r2
            L_0x0024:
                java.lang.String r3 = "accountId"
                kotlin.Pair r1 = kotlin.C12907r.m40244a(r3, r1)
                r3 = 1
                r0[r3] = r1
                r1 = 2
                java.lang.String r3 = r6.getId()
                java.lang.String r4 = "sessionId"
                kotlin.Pair r3 = kotlin.C12907r.m40244a(r4, r3)
                r0[r1] = r3
                r1 = 3
                com.bamtech.sdk4.session.SessionProfileInfo r6 = r6.getProfile()
                if (r6 == 0) goto L_0x0048
                java.lang.String r6 = r6.getId()
                if (r6 == 0) goto L_0x0048
                goto L_0x0049
            L_0x0048:
                r6 = r2
            L_0x0049:
                java.lang.String r2 = "profileId"
                kotlin.Pair r6 = kotlin.C12907r.m40244a(r2, r6)
                r0[r1] = r6
                java.util.Map r6 = kotlin.p590y.C13173j0.m40356a(r0)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.analytics.p055m0.C2407r.C2409b.apply(com.bamtech.sdk4.session.SessionInfo):java.util.Map");
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.analytics.m0.r$c */
    /* compiled from: SdkContributor.kt */
    static final class C2410c<T, R> implements Function<T, R> {

        /* renamed from: c */
        public static final C2410c f6660c = new C2410c();

        C2410c() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x005c, code lost:
            if (r6 != null) goto L_0x0060;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0020, code lost:
            if (r1 != null) goto L_0x0024;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0045, code lost:
            if (r3 != null) goto L_0x0049;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.Map<java.lang.String, java.lang.String> apply(com.bamtech.sdk4.session.SessionInfo r6) {
            /*
                r5 = this;
                r0 = 5
                kotlin.Pair[] r0 = new kotlin.Pair[r0]
                com.bamtech.sdk4.session.SessionDeviceInfo r1 = r6.getDevice()
                java.lang.String r1 = r1.getId()
                java.lang.String r2 = "dssDeviceId "
                kotlin.Pair r1 = kotlin.C12907r.m40244a(r2, r1)
                r2 = 0
                r0[r2] = r1
                com.bamtech.sdk4.session.SessionAccountInfo r1 = r6.getAccount()
                java.lang.String r2 = ""
                if (r1 == 0) goto L_0x0023
                java.lang.String r1 = r1.getId()
                if (r1 == 0) goto L_0x0023
                goto L_0x0024
            L_0x0023:
                r1 = r2
            L_0x0024:
                java.lang.String r3 = "dssAccountId "
                kotlin.Pair r1 = kotlin.C12907r.m40244a(r3, r1)
                r3 = 1
                r0[r3] = r1
                r1 = 2
                java.lang.String r3 = r6.getId()
                java.lang.String r4 = "dssSessionId "
                kotlin.Pair r3 = kotlin.C12907r.m40244a(r4, r3)
                r0[r1] = r3
                r1 = 3
                com.bamtech.sdk4.session.SessionProfileInfo r3 = r6.getProfile()
                if (r3 == 0) goto L_0x0048
                java.lang.String r3 = r3.getId()
                if (r3 == 0) goto L_0x0048
                goto L_0x0049
            L_0x0048:
                r3 = r2
            L_0x0049:
                java.lang.String r4 = "dssProfileId "
                kotlin.Pair r3 = kotlin.C12907r.m40244a(r4, r3)
                r0[r1] = r3
                r1 = 4
                com.bamtech.sdk4.session.SessionProfileInfo r6 = r6.getProfile()
                if (r6 == 0) goto L_0x005f
                java.lang.String r6 = r6.getId()
                if (r6 == 0) goto L_0x005f
                goto L_0x0060
            L_0x005f:
                r6 = r2
            L_0x0060:
                java.lang.String r2 = "brazeId"
                kotlin.Pair r6 = kotlin.C12907r.m40244a(r2, r6)
                r0[r1] = r6
                java.util.Map r6 = kotlin.p590y.C13173j0.m40356a(r0)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.analytics.p055m0.C2407r.C2410c.apply(com.bamtech.sdk4.session.SessionInfo):java.util.Map");
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.analytics.m0.r$d */
    /* compiled from: SdkContributor.kt */
    static final class C2411d<T, R> implements Function<Throwable, Map<String, ? extends String>> {

        /* renamed from: c */
        public static final C2411d f6661c = new C2411d();

        C2411d() {
        }

        /* renamed from: a */
        public final Map<String, String> apply(Throwable th) {
            String str = "";
            return C13173j0.m40356a(C12907r.m40244a("dssDeviceId ", str), C12907r.m40244a("dssAccountId ", str), C12907r.m40244a("dssSessionId ", str), C12907r.m40244a("dssProfileId ", str));
        }
    }

    static {
        new C2408a(null);
    }

    public C2407r(Single<SessionInfo> single, C11969r rVar) {
        this.f6657a = single;
        this.f6658b = rVar;
    }

    /* renamed from: a */
    public Single<Map<String, String>> mo11521a() {
        Single<Map<String, String>> b = this.f6657a.mo30233g(C2410c.f6660c).mo30237i(C2411d.f6661c).mo30220b(this.f6658b);
        C12880j.m40222a((Object) b, "sdkSessionInfoSingle\n   ….subscribeOn(ioScheduler)");
        return b;
    }

    /* renamed from: b */
    public Single<Map<String, String>> mo11526b() {
        Single<Map<String, String>> b = this.f6657a.mo30233g(C2409b.f6659c).mo30220b(this.f6658b);
        C12880j.m40222a((Object) b, "sdkSessionInfoSingle.map….subscribeOn(ioScheduler)");
        return b;
    }
}
