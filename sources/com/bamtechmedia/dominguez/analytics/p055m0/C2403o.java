package com.bamtechmedia.dominguez.analytics.p055m0;

import android.app.Application;
import com.bamtechmedia.dominguez.core.BuildInfo;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p520io.reactivex.C11969r;

/* renamed from: com.bamtechmedia.dominguez.analytics.m0.o */
/* compiled from: PlatformAnalyticsContributor_Factory */
public final class C2403o implements C11895c<C2399m> {

    /* renamed from: a */
    private final Provider<Application> f6646a;

    /* renamed from: b */
    private final Provider<BuildInfo> f6647b;

    /* renamed from: c */
    private final Provider<Boolean> f6648c;

    /* renamed from: d */
    private final Provider<C11969r> f6649d;

    public C2403o(Provider<Application> provider, Provider<BuildInfo> provider2, Provider<Boolean> provider3, Provider<C11969r> provider4) {
        this.f6646a = provider;
        this.f6647b = provider2;
        this.f6648c = provider3;
        this.f6649d = provider4;
    }

    /* renamed from: a */
    public static C2403o m8947a(Provider<Application> provider, Provider<BuildInfo> provider2, Provider<Boolean> provider3, Provider<C11969r> provider4) {
        return new C2403o(provider, provider2, provider3, provider4);
    }

    public C2399m get() {
        return new C2399m((Application) this.f6646a.get(), (BuildInfo) this.f6647b.get(), ((Boolean) this.f6648c.get()).booleanValue(), (C11969r) this.f6649d.get());
    }
}
