package com.bamtechmedia.dominguez.config;

import com.bamtechmedia.dominguez.dictionaries.C6072g;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.config.w */
/* compiled from: FeatureConfigModule_LanguageSelectionDictionaryFactory */
public final class C3580w implements C11895c<C3572r0> {

    /* renamed from: a */
    private final Provider<C6072g> f8911a;

    public C3580w(Provider<C6072g> provider) {
        this.f8911a = provider;
    }

    /* renamed from: a */
    public static C3580w m12048a(Provider<C6072g> provider) {
        return new C3580w(provider);
    }

    /* renamed from: a */
    public static C3572r0 m12047a(C6072g gVar) {
        C3572r0 a = C3567p.m12015a(gVar);
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public C3572r0 get() {
        return m12047a((C6072g) this.f8911a.get());
    }
}
