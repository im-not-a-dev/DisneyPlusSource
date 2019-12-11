package com.bamtechmedia.dominguez.config;

import com.bamtechmedia.dominguez.core.BuildInfo;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.config.d */
/* compiled from: AppConfigImpl_Factory */
public final class C3522d implements C11895c<C3519c> {

    /* renamed from: a */
    private final Provider<C3524e> f8817a;

    /* renamed from: b */
    private final Provider<BuildInfo> f8818b;

    public C3522d(Provider<C3524e> provider, Provider<BuildInfo> provider2) {
        this.f8817a = provider;
        this.f8818b = provider2;
    }

    /* renamed from: a */
    public static C3522d m11930a(Provider<C3524e> provider, Provider<BuildInfo> provider2) {
        return new C3522d(provider, provider2);
    }

    public C3519c get() {
        return new C3519c((C3524e) this.f8817a.get(), (BuildInfo) this.f8818b.get());
    }
}
