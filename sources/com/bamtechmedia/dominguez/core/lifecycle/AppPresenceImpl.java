package com.bamtechmedia.dominguez.core.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.C0708c;
import androidx.lifecycle.C0722m;
import com.bamtechmedia.dominguez.core.C3585a;
import com.bamtechmedia.dominguez.core.lifecycle.C5765a.C5766a;
import com.bamtechmedia.dominguez.core.lifecycle.C5765a.C5766a.C5767a;
import com.bamtechmedia.dominguez.core.lifecycle.C5765a.C5766a.C5768b;
import com.bamtechmedia.dominguez.core.lifecycle.C5765a.C5766a.C5769c;
import com.jakewharton.rxrelay2.C10531b;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p164a.p165a.C4705m;
import p520io.reactivex.Observable;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 12\u00020\u0001:\u00011B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u001c\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\nH\u0002J\u001c\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0012\u0010%\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0012\u0010&\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0012\u0010'\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u001c\u0010(\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010)\u001a\u0004\u0018\u00010$H\u0016J\u0012\u0010*\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0012\u0010+\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0010\u0010,\u001a\u00020 2\u0006\u0010-\u001a\u00020.H\u0016J\u000e\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000700H\u0016R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\n8@X\u0004¢\u0006\f\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u00118@X\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\u00020\u00168\u0000@\u0000X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u00062"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/lifecycle/AppPresenceImpl;", "Lcom/bamtechmedia/dominguez/core/lifecycle/AppPresenceApi;", "config", "Lcom/bamtechmedia/dominguez/core/CoreCommonConfig;", "(Lcom/bamtechmedia/dominguez/core/CoreCommonConfig;)V", "appPresenceRelay", "Lcom/jakewharton/rxrelay2/PublishRelay;", "Lcom/bamtechmedia/dominguez/core/lifecycle/AppPresenceApi$AppPresenceResponse;", "kotlin.jvm.PlatformType", "backgroundedAtMillis", "", "currentTimeMillis", "currentTimeMillis$annotations", "()V", "getCurrentTimeMillis$coreCommon_release", "()J", "maxBackgroundBeforeForcedFreshStartMinutes", "", "maxBackgroundBeforeForcedFreshStartMinutes$annotations", "getMaxBackgroundBeforeForcedFreshStartMinutes$coreCommon_release", "()I", "shouldLogForeground", "", "shouldLogForeground$annotations", "getShouldLogForeground$coreCommon_release", "()Z", "setShouldLogForeground$coreCommon_release", "(Z)V", "getForegroundState", "hasExceededBackgroundTimeLimit", "backgroundTimeMillis", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "onStop", "owner", "Landroidx/lifecycle/LifecycleOwner;", "streamUpdates", "Lio/reactivex/Observable;", "Companion", "coreCommon_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: AppPresenceImpl.kt */
public final class AppPresenceImpl implements C5765a {

    /* renamed from: U */
    private C10531b<C5766a> f13521U;

    /* renamed from: V */
    private long f13522V = -1;

    /* renamed from: W */
    private final C3585a f13523W;

    /* renamed from: c */
    private boolean f13524c;

    /* renamed from: com.bamtechmedia.dominguez.core.lifecycle.AppPresenceImpl$a */
    /* compiled from: AppPresenceImpl.kt */
    public static final class C5764a {
        private C5764a() {
        }

        public /* synthetic */ C5764a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C5764a(null);
    }

    public AppPresenceImpl(C3585a aVar) {
        this.f13523W = aVar;
        C10531b<C5766a> n = C10531b.m33228n();
        Intrinsics.checkReturnedValueIsNotNull((Object) n, "PublishRelay.create<AppPresenceResponse>()");
        this.f13521U = n;
    }

    /* renamed from: a */
    private final C5766a m18703a(long j) {
        if (j == -1) {
            return C5768b.f13526a;
        }
        if (m18704b(j)) {
            return new C5769c(1, false);
        }
        return C5768b.f13526a;
    }

    /* renamed from: a */
    public /* synthetic */ void mo4126a(C0722m mVar) {
        C0708c.m3735d(this, mVar);
    }

    /* renamed from: b */
    public final long mo17650b() {
        return System.currentTimeMillis();
    }

    /* renamed from: b */
    public /* synthetic */ void mo4127b(C0722m mVar) {
        C0708c.m3732a(this, mVar);
    }

    /* renamed from: c */
    public final int mo17651c() {
        return this.f13523W.mo12794b();
    }

    /* renamed from: c */
    public /* synthetic */ void mo4128c(C0722m mVar) {
        C0708c.m3734c(this, mVar);
    }

    /* renamed from: d */
    public void mo4129d(C0722m mVar) {
        this.f13521U.accept(C5767a.f13525a);
        this.f13522V = mo17650b();
        this.f13524c = true;
    }

    /* renamed from: e */
    public /* synthetic */ void mo4130e(C0722m mVar) {
        C0708c.m3733b(this, mVar);
    }

    /* renamed from: f */
    public /* synthetic */ void mo4131f(C0722m mVar) {
        C0708c.m3736e(this, mVar);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        C4705m.m16375b();
    }

    public void onActivityResumed(Activity activity) {
        C4705m.m16370a(activity);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        if (this.f13524c) {
            this.f13521U.accept(m18703a(this.f13522V));
            this.f13522V = -1;
            this.f13524c = false;
        }
    }

    public void onActivityStopped(Activity activity) {
    }

    /* renamed from: b */
    private final boolean m18704b(long j) {
        return TimeUnit.MILLISECONDS.toMinutes(mo17650b() - j) >= ((long) mo17651c());
    }

    /* renamed from: a */
    public Observable<C5766a> mo17649a() {
        Observable<C5766a> i = this.f13521U.mo30197i();
        Intrinsics.checkReturnedValueIsNotNull((Object) i, "appPresenceRelay.share()");
        return i;
    }
}
