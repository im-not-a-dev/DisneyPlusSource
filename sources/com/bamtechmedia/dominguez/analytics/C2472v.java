package com.bamtechmedia.dominguez.analytics;

import javax.inject.Provider;
import p163g.p201e.p203b.C5368a;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.analytics.v */
/* compiled from: FeatureAnalyticsModule_ProvideInAppMessageManagerFactory */
public final class C2472v implements C11895c<C5368a> {

    /* renamed from: a */
    private final Provider<C2436p> f6768a;

    public C2472v(Provider<C2436p> provider) {
        this.f6768a = provider;
    }

    /* renamed from: a */
    public static C2472v m9067a(Provider<C2436p> provider) {
        return new C2472v(provider);
    }

    /* renamed from: a */
    public static C5368a m9068a(C2436p pVar) {
        C5368a a = C2469s.m9060a(pVar);
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public C5368a get() {
        return m9068a((C2436p) this.f6768a.get());
    }
}
