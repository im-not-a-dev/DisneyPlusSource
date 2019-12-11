package com.bamtechmedia.dominguez.about;

import com.bamtech.sdk4.content.SearchOverrides;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.about.i */
/* compiled from: FeatureAboutModule_ProvideSearchOverridesFactory */
public final class C2276i implements C11895c<SearchOverrides> {

    /* renamed from: a */
    private final Provider<C2279k> f6410a;

    public C2276i(Provider<C2279k> provider) {
        this.f6410a = provider;
    }

    /* renamed from: a */
    public static C2276i m8706a(Provider<C2279k> provider) {
        return new C2276i(provider);
    }

    /* renamed from: a */
    public static SearchOverrides m8705a(C2279k kVar) {
        SearchOverrides a = C2275h.m8704a(kVar);
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public SearchOverrides get() {
        return m8705a((C2279k) this.f6410a.get());
    }
}
