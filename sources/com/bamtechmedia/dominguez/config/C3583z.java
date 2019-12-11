package com.bamtechmedia.dominguez.config;

import com.bamtechmedia.dominguez.dictionaries.C6072g;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.config.z */
/* compiled from: FeatureConfigModule_PaywallDictionaryFactory */
public final class C3583z implements C11895c<C3572r0> {

    /* renamed from: a */
    private final Provider<C6072g> f8913a;

    public C3583z(Provider<C6072g> provider) {
        this.f8913a = provider;
    }

    /* renamed from: a */
    public static C3583z m12053a(Provider<C6072g> provider) {
        return new C3583z(provider);
    }

    /* renamed from: a */
    public static C3572r0 m12052a(C6072g gVar) {
        C3572r0 b = C3567p.m12021b(gVar);
        C11897e.m38130a(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }

    public C3572r0 get() {
        return m12052a((C6072g) this.f8913a.get());
    }
}
