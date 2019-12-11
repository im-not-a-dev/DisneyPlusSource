package com.bamtechmedia.dominguez.app;

import com.bamtechmedia.dominguez.app.C2486c0.C2487a;
import com.bamtechmedia.dominguez.core.BuildInfo;
import com.bamtechmedia.dominguez.core.BuildInfo.C3584a;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p512h.p513c.C11871b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0013"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/app/DominguezTvApplication;", "Lcom/bamtechmedia/dominguez/app/BaseApplication;", "()V", "appComponent", "Lcom/bamtechmedia/dominguez/app/TvAppComponent;", "getAppComponent", "()Lcom/bamtechmedia/dominguez/app/TvAppComponent;", "setAppComponent", "(Lcom/bamtechmedia/dominguez/app/TvAppComponent;)V", "buildInfo", "Lcom/bamtechmedia/dominguez/core/BuildInfo;", "getBuildInfo", "()Lcom/bamtechmedia/dominguez/core/BuildInfo;", "applicationInjector", "Ldagger/android/AndroidInjector;", "injectWorkerFactoryMembers", "", "workerFactory", "Lcom/bamtechmedia/dominguez/app/DominguezWorkerFactory;", "tv_prodGoogleRelease"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DominguezTvApplication.kt */
public final class DominguezTvApplication extends C2481a {

    /* renamed from: X */
    public C2486c0 f6772X;

    /* renamed from: Y */
    private final BuildInfo f6773Y = new BuildInfo("prod", "google", C3584a.TV, 163625);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C11871b<? extends C2481a> mo11591a() {
        C2487a c = C2505s.m9271c();
        c.mo11598a(this);
        C2486c0 build = c.build();
        C12880j.m40222a((Object) build, "DaggerTvAppComponent.bui…his)\n            .build()");
        return build;
    }

    /* renamed from: b */
    public BuildInfo mo11593b() {
        return this.f6773Y;
    }

    /* renamed from: a */
    public void mo11592a(C2680u uVar) {
        C2486c0 c0Var = this.f6772X;
        if (c0Var != null) {
            c0Var.mo11597a(uVar);
        } else {
            C12880j.m40227c("appComponent");
            throw null;
        }
    }
}
