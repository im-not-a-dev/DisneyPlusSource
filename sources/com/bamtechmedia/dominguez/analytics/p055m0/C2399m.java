package com.bamtechmedia.dominguez.analytics.p055m0;

import android.app.Application;
import com.bamtech.sdk4.internal.media.adengine.DefaultAdvertisingIdProvider;
import com.bamtechmedia.dominguez.analytics.p057o0.C2434c;
import com.bamtechmedia.dominguez.core.BuildInfo;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.C11969r;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001a\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u00130\u0012H\u0016R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\f8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/analytics/contributors/PlatformAnalyticsContributor;", "Lcom/bamtechmedia/dominguez/analytics/globalvalues/AnalyticsStateContributor;", "application", "Landroid/app/Application;", "buildInfo", "Lcom/bamtechmedia/dominguez/core/BuildInfo;", "isTablet", "", "ioScheduler", "Lio/reactivex/Scheduler;", "(Landroid/app/Application;Lcom/bamtechmedia/dominguez/core/BuildInfo;ZLio/reactivex/Scheduler;)V", "aaid", "", "getAaid", "()Ljava/lang/String;", "deviceTypeValue", "getDeviceTypeValue", "createState", "Lio/reactivex/Single;", "", "Companion", "analytics_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.analytics.m0.m */
/* compiled from: PlatformAnalyticsContributor.kt */
public final class C2399m implements C2434c {

    /* renamed from: a */
    private final Application f6641a;

    /* renamed from: b */
    private final BuildInfo f6642b;

    /* renamed from: c */
    private final boolean f6643c;

    /* renamed from: d */
    private final C11969r f6644d;

    /* renamed from: com.bamtechmedia.dominguez.analytics.m0.m$a */
    /* compiled from: PlatformAnalyticsContributor.kt */
    public static final class C2400a {
        private C2400a() {
        }

        public /* synthetic */ C2400a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.analytics.m0.m$b */
    /* compiled from: PlatformAnalyticsContributor.kt */
    static final class C2401b<V> implements Callable<T> {

        /* renamed from: c */
        final /* synthetic */ C2399m f6645c;

        C2401b(C2399m mVar) {
            this.f6645c = mVar;
        }

        public final Map<String, String> call() {
            return C13173j0.m40356a(C12907r.m40244a("deviceType", this.f6645c.m8944c()), C12907r.m40244a("deviceAdId", this.f6645c.mo11528b()));
        }
    }

    static {
        new C2400a(null);
    }

    public C2399m(Application application, BuildInfo buildInfo, boolean z, C11969r rVar) {
        this.f6641a = application;
        this.f6642b = buildInfo;
        this.f6643c = z;
        this.f6644d = rVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final String m8944c() {
        if (C2402n.$EnumSwitchMapping$0[this.f6642b.mo12780c().ordinal()] != 1) {
            return this.f6643c ? "Tablet" : "Mobile Phone";
        }
        return "Android TV";
    }

    /* renamed from: b */
    public final String mo11528b() {
        String id = new DefaultAdvertisingIdProvider(this.f6641a).getId();
        return id != null ? id : "";
    }

    /* renamed from: a */
    public Single<Map<String, String>> mo11521a() {
        Single<Map<String, String>> a = Single.m38401c((Callable<? extends T>) new C2401b<Object>(this)).mo30220b(this.f6644d).mo30203a(1000, TimeUnit.MILLISECONDS, this.f6644d);
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "Single.fromCallable {\n  …ILLISECONDS, ioScheduler)");
        return a;
    }
}
