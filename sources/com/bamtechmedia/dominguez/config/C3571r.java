package com.bamtechmedia.dominguez.config;

import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;
import p520io.reactivex.Single;

/* renamed from: com.bamtechmedia.dominguez.config.r */
/* compiled from: FeatureConfigModule_AppConfigMapOnceFactory */
public final class C3571r implements C11895c<Single<C3524e>> {

    /* renamed from: a */
    private final Provider<AppConfigRepository> f8904a;

    public C3571r(Provider<AppConfigRepository> provider) {
        this.f8904a = provider;
    }

    /* renamed from: a */
    public static C3571r m12029a(Provider<AppConfigRepository> provider) {
        return new C3571r(provider);
    }

    /* renamed from: a */
    public static Single<C3524e> m12030a(AppConfigRepository appConfigRepository) {
        Single<C3524e> b = C3567p.m12023b(appConfigRepository);
        C11897e.m38130a(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }

    public Single<C3524e> get() {
        return m12030a((AppConfigRepository) this.f8904a.get());
    }
}
