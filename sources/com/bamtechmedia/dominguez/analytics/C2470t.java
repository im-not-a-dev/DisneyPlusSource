package com.bamtechmedia.dominguez.analytics;

import com.bamtechmedia.dominguez.analytics.p054l0.C2374a;
import com.bamtechmedia.dominguez.analytics.p057o0.C2434c;
import java.util.Set;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.analytics.t */
/* compiled from: FeatureAnalyticsModule_ProvideAdobeAnalyticsViewModelFactory */
public final class C2470t implements C11895c<C2351f> {

    /* renamed from: a */
    private final Provider<Set<C2434c>> f6758a;

    /* renamed from: b */
    private final Provider<C2360g> f6759b;

    /* renamed from: c */
    private final Provider<C2374a> f6760c;

    /* renamed from: d */
    private final Provider<C2336b> f6761d;

    /* renamed from: e */
    private final Provider<C2364i> f6762e;

    public C2470t(Provider<Set<C2434c>> provider, Provider<C2360g> provider2, Provider<C2374a> provider3, Provider<C2336b> provider4, Provider<C2364i> provider5) {
        this.f6758a = provider;
        this.f6759b = provider2;
        this.f6760c = provider3;
        this.f6761d = provider4;
        this.f6762e = provider5;
    }

    /* renamed from: a */
    public static C2470t m9064a(Provider<Set<C2434c>> provider, Provider<C2360g> provider2, Provider<C2374a> provider3, Provider<C2336b> provider4, Provider<C2364i> provider5) {
        C2470t tVar = new C2470t(provider, provider2, provider3, provider4, provider5);
        return tVar;
    }

    /* renamed from: a */
    public static C2351f m9063a(Set<C2434c> set, C2360g gVar, C2374a aVar, C2336b bVar, C2364i iVar) {
        C2351f a = C2469s.m9058a(set, gVar, aVar, bVar, iVar);
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public C2351f get() {
        return m9063a((Set) this.f6758a.get(), (C2360g) this.f6759b.get(), (C2374a) this.f6760c.get(), (C2336b) this.f6761d.get(), (C2364i) this.f6762e.get());
    }
}
