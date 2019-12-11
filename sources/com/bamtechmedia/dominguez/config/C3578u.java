package com.bamtechmedia.dominguez.config;

import com.bamtechmedia.dominguez.core.BuildInfo;
import com.bamtechmedia.dominguez.dictionaries.C6063a;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;
import p520io.reactivex.Single;

/* renamed from: com.bamtechmedia.dominguez.config.u */
/* compiled from: FeatureConfigModule_DictionaryConfigFactory */
public final class C3578u implements C11895c<Single<C6063a>> {

    /* renamed from: a */
    private final Provider<AppConfigRepository> f8909a;

    /* renamed from: b */
    private final Provider<BuildInfo> f8910b;

    public C3578u(Provider<AppConfigRepository> provider, Provider<BuildInfo> provider2) {
        this.f8909a = provider;
        this.f8910b = provider2;
    }

    /* renamed from: a */
    public static C3578u m12044a(Provider<AppConfigRepository> provider, Provider<BuildInfo> provider2) {
        return new C3578u(provider, provider2);
    }

    /* renamed from: a */
    public static Single<C6063a> m12045a(AppConfigRepository appConfigRepository, BuildInfo buildInfo) {
        Single<C6063a> a = C3567p.m12018a(appConfigRepository, buildInfo);
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public Single<C6063a> get() {
        return m12045a((AppConfigRepository) this.f8909a.get(), (BuildInfo) this.f8910b.get());
    }
}
