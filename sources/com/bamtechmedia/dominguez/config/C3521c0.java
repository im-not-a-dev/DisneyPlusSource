package com.bamtechmedia.dominguez.config;

import com.bamtechmedia.dominguez.dictionaries.C6072g;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.config.c0 */
/* compiled from: FeatureConfigModule_RatingsDictionaryFactory */
public final class C3521c0 implements C11895c<C3572r0> {

    /* renamed from: a */
    private final Provider<C6072g> f8816a;

    public C3521c0(Provider<C6072g> provider) {
        this.f8816a = provider;
    }

    /* renamed from: a */
    public static C3521c0 m11928a(Provider<C6072g> provider) {
        return new C3521c0(provider);
    }

    /* renamed from: a */
    public static C3572r0 m11929a(C6072g gVar) {
        C3572r0 c = C3567p.m12025c(gVar);
        C11897e.m38130a(c, "Cannot return null from a non-@Nullable @Provides method");
        return c;
    }

    public C3572r0 get() {
        return m11929a((C6072g) this.f8816a.get());
    }
}
