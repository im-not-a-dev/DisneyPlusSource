package com.bamtechmedia.dominguez.main.startup;

import com.bamtechmedia.dominguez.config.C3524e;
import com.bamtechmedia.dominguez.core.utils.C5855o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.Single;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/main/startup/ConfigInitialization;", "Lcom/bamtechmedia/dominguez/main/startup/InitializationAction;", "appConfigMapOnce", "Lio/reactivex/Single;", "Lcom/bamtechmedia/dominguez/config/AppConfigMap;", "appLaunchAnalytics", "Lcom/bamtechmedia/dominguez/main/startup/AppLaunchAnalyticsLifecycleObserver;", "versionCheck", "Lcom/bamtechmedia/dominguez/main/startup/VersionCheck;", "(Lio/reactivex/Single;Lcom/bamtechmedia/dominguez/main/startup/AppLaunchAnalyticsLifecycleObserver;Lcom/bamtechmedia/dominguez/main/startup/VersionCheck;)V", "initialize", "Lio/reactivex/Completable;", "appStart_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.main.startup.b */
/* compiled from: ConfigInitialization.kt */
public final class C6178b implements C6187g {

    /* renamed from: a */
    private final Single<C3524e> f14176a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C6199m f14177b;

    /* renamed from: com.bamtechmedia.dominguez.main.startup.b$a */
    /* compiled from: ConfigInitialization.kt */
    static final class C6179a<T, R> implements Function<C3524e, CompletableSource> {

        /* renamed from: c */
        final /* synthetic */ C6178b f14178c;

        C6179a(C6178b bVar) {
            this.f14178c = bVar;
        }

        /* renamed from: a */
        public final Completable apply(C3524e eVar) {
            return this.f14178c.f14177b.mo18801c();
        }
    }

    public C6178b(Single<C3524e> single, AppLaunchAnalyticsLifecycleObserver appLaunchAnalyticsLifecycleObserver, C6199m mVar) {
        this.f14176a = single;
        this.f14177b = mVar;
    }

    /* renamed from: a */
    public Completable mo18783a() {
        C5855o oVar = C5855o.f13640a;
        Completable b = this.f14176a.mo30217b((Function<? super T, ? extends CompletableSource>) new C6179a<Object,Object>(this));
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "appConfigMapOnce.flatMap…sionCheck.markVersion() }");
        return b;
    }
}
