package com.bamtechmedia.dominguez.profiles;

import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;
import p520io.reactivex.Single;

/* renamed from: com.bamtechmedia.dominguez.profiles.y */
/* compiled from: FeatureProfilesModule_ProvidesIsAutoplayEnabledFactory */
public final class C6968y implements C11895c<Single<Boolean>> {

    /* renamed from: a */
    private final Provider<C6782s> f15483a;

    public C6968y(Provider<C6782s> provider) {
        this.f15483a = provider;
    }

    /* renamed from: a */
    public static C6968y m21226a(Provider<C6782s> provider) {
        return new C6968y(provider);
    }

    /* renamed from: a */
    public static Single<Boolean> m21227a(C6782s sVar) {
        Single<Boolean> a = C6855u.m21019a(sVar);
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public Single<Boolean> get() {
        return m21227a((C6782s) this.f15483a.get());
    }
}
