package com.bamtechmedia.dominguez.analytics;

import com.bamtechmedia.dominguez.analytics.p055m0.C2399m;
import com.bamtechmedia.dominguez.analytics.p056n0.C2414a;
import com.bamtechmedia.dominguez.analytics.p056n0.C2426c;
import com.bamtechmedia.dominguez.analytics.p056n0.C2428e;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.analytics.u */
/* compiled from: FeatureAnalyticsModule_ProvideGlimpseAnalyticsViewModelFactory */
public final class C2471u implements C11895c<C2414a> {

    /* renamed from: a */
    private final Provider<C2426c> f6763a;

    /* renamed from: b */
    private final Provider<C2428e> f6764b;

    /* renamed from: c */
    private final Provider<C2336b> f6765c;

    /* renamed from: d */
    private final Provider<C2399m> f6766d;

    /* renamed from: e */
    private final Provider<C2364i> f6767e;

    public C2471u(Provider<C2426c> provider, Provider<C2428e> provider2, Provider<C2336b> provider3, Provider<C2399m> provider4, Provider<C2364i> provider5) {
        this.f6763a = provider;
        this.f6764b = provider2;
        this.f6765c = provider3;
        this.f6766d = provider4;
        this.f6767e = provider5;
    }

    /* renamed from: a */
    public static C2471u m9066a(Provider<C2426c> provider, Provider<C2428e> provider2, Provider<C2336b> provider3, Provider<C2399m> provider4, Provider<C2364i> provider5) {
        C2471u uVar = new C2471u(provider, provider2, provider3, provider4, provider5);
        return uVar;
    }

    /* renamed from: a */
    public static C2414a m9065a(C2426c cVar, C2428e eVar, C2336b bVar, C2399m mVar, C2364i iVar) {
        C2414a a = C2469s.m9059a(cVar, eVar, bVar, mVar, iVar);
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public C2414a get() {
        return m9065a((C2426c) this.f6763a.get(), (C2428e) this.f6764b.get(), (C2336b) this.f6765c.get(), (C2399m) this.f6766d.get(), (C2364i) this.f6767e.get());
    }
}
