package com.bamtechmedia.dominguez.config;

import com.bamtechmedia.dominguez.dictionaries.C6072g;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.config.d0 */
/* compiled from: FeatureConfigModule_SdkErrorsDictionaryFactory */
public final class C3523d0 implements C11895c<C3572r0> {

    /* renamed from: a */
    private final Provider<C6072g> f8819a;

    public C3523d0(Provider<C6072g> provider) {
        this.f8819a = provider;
    }

    /* renamed from: a */
    public static C3523d0 m11931a(Provider<C6072g> provider) {
        return new C3523d0(provider);
    }

    /* renamed from: a */
    public static C3572r0 m11932a(C6072g gVar) {
        C3572r0 d = C3567p.m12026d(gVar);
        C11897e.m38130a(d, "Cannot return null from a non-@Nullable @Provides method");
        return d;
    }

    public C3572r0 get() {
        return m11932a((C6072g) this.f8819a.get());
    }
}
