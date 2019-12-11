package com.bamtechmedia.dominguez.config;

import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.config.q */
/* compiled from: FeatureConfigModule_AppConfigMapFactory */
public final class C3569q implements C11895c<C3524e> {

    /* renamed from: a */
    private final Provider<AppConfigRepository> f8902a;

    public C3569q(Provider<AppConfigRepository> provider) {
        this.f8902a = provider;
    }

    /* renamed from: a */
    public static C3569q m12028a(Provider<AppConfigRepository> provider) {
        return new C3569q(provider);
    }

    /* renamed from: a */
    public static C3524e m12027a(AppConfigRepository appConfigRepository) {
        C3524e a = C3567p.m12013a(appConfigRepository);
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public C3524e get() {
        return m12027a((AppConfigRepository) this.f8902a.get());
    }
}
