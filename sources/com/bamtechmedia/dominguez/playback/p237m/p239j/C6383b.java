package com.bamtechmedia.dominguez.playback.p237m.p239j;

import com.bamtechmedia.dominguez.config.C3524e;
import com.bamtechmedia.dominguez.core.BuildInfo;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.playback.m.j.b */
/* compiled from: ConvivaConfig_Factory */
public final class C6383b implements C11895c<C6381a> {

    /* renamed from: a */
    private final Provider<C3524e> f14495a;

    /* renamed from: b */
    private final Provider<BuildInfo> f14496b;

    public C6383b(Provider<C3524e> provider, Provider<BuildInfo> provider2) {
        this.f14495a = provider;
        this.f14496b = provider2;
    }

    /* renamed from: a */
    public static C6383b m20004a(Provider<C3524e> provider, Provider<BuildInfo> provider2) {
        return new C6383b(provider, provider2);
    }

    public C6381a get() {
        return new C6381a((C3524e) this.f14495a.get(), (BuildInfo) this.f14496b.get());
    }
}
