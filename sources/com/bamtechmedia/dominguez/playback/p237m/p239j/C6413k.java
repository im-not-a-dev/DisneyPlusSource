package com.bamtechmedia.dominguez.playback.p237m.p239j;

import com.bamtechmedia.dominguez.analytics.C2348e;
import com.bamtechmedia.dominguez.analytics.C2476z;
import com.bamtechmedia.dominguez.core.content.assets.C3628c;
import com.bamtechmedia.dominguez.offline.C6240b;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p520io.reactivex.C11969r;

/* renamed from: com.bamtechmedia.dominguez.playback.m.j.k */
/* compiled from: UpNextAnalytics_Factory */
public final class C6413k implements C11895c<C6410j> {

    /* renamed from: a */
    private final Provider<C2348e> f14544a;

    /* renamed from: b */
    private final Provider<C2476z> f14545b;

    /* renamed from: c */
    private final Provider<C3628c> f14546c;

    /* renamed from: d */
    private final Provider<C11969r> f14547d;

    /* renamed from: e */
    private final Provider<C6240b> f14548e;

    public C6413k(Provider<C2348e> provider, Provider<C2476z> provider2, Provider<C3628c> provider3, Provider<C11969r> provider4, Provider<C6240b> provider5) {
        this.f14544a = provider;
        this.f14545b = provider2;
        this.f14546c = provider3;
        this.f14547d = provider4;
        this.f14548e = provider5;
    }

    /* renamed from: a */
    public static C6413k m20066a(Provider<C2348e> provider, Provider<C2476z> provider2, Provider<C3628c> provider3, Provider<C11969r> provider4, Provider<C6240b> provider5) {
        C6413k kVar = new C6413k(provider, provider2, provider3, provider4, provider5);
        return kVar;
    }

    public C6410j get() {
        C6410j jVar = new C6410j((C2348e) this.f14544a.get(), (C2476z) this.f14545b.get(), (C3628c) this.f14546c.get(), (C11969r) this.f14547d.get(), (C6240b) this.f14548e.get());
        return jVar;
    }
}
