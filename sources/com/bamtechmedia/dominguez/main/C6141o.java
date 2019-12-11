package com.bamtechmedia.dominguez.main;

import com.bamtech.sdk4.subscription.SubscriptionApi;
import com.bamtechmedia.dominguez.analytics.C2350e0;
import com.bamtechmedia.dominguez.purchase.MarketHolder;
import javax.inject.Provider;
import p163g.p174d.p175a.p176a.C4796b;
import p163g.p174d.p175a.p177b.C4815e;
import p163g.p201e.p203b.p307o.C7614e;
import p163g.p201e.p203b.p319v.C7900q;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.main.o */
/* compiled from: MainActivityTvBindingModule_ActivityModule_ProvidePaywallServicesInteractorFactory */
public final class C6141o implements C11895c<C7900q> {

    /* renamed from: a */
    private final Provider<MarketHolder> f14115a;

    /* renamed from: b */
    private final Provider<C4796b> f14116b;

    /* renamed from: c */
    private final Provider<C4815e> f14117c;

    /* renamed from: d */
    private final Provider<SubscriptionApi> f14118d;

    /* renamed from: e */
    private final Provider<MainActivity> f14119e;

    /* renamed from: f */
    private final Provider<C7614e> f14120f;

    /* renamed from: g */
    private final Provider<C2350e0> f14121g;

    public C6141o(Provider<MarketHolder> provider, Provider<C4796b> provider2, Provider<C4815e> provider3, Provider<SubscriptionApi> provider4, Provider<MainActivity> provider5, Provider<C7614e> provider6, Provider<C2350e0> provider7) {
        this.f14115a = provider;
        this.f14116b = provider2;
        this.f14117c = provider3;
        this.f14118d = provider4;
        this.f14119e = provider5;
        this.f14120f = provider6;
        this.f14121g = provider7;
    }

    /* renamed from: a */
    public static C6141o m19575a(Provider<MarketHolder> provider, Provider<C4796b> provider2, Provider<C4815e> provider3, Provider<SubscriptionApi> provider4, Provider<MainActivity> provider5, Provider<C7614e> provider6, Provider<C2350e0> provider7) {
        C6141o oVar = new C6141o(provider, provider2, provider3, provider4, provider5, provider6, provider7);
        return oVar;
    }

    /* renamed from: a */
    public static C7900q m19576a(MarketHolder marketHolder, C4796b bVar, C4815e eVar, SubscriptionApi subscriptionApi, MainActivity mainActivity, C7614e eVar2, C2350e0 e0Var) {
        C7900q a = C6139m.m19572a(marketHolder, bVar, eVar, subscriptionApi, mainActivity, eVar2, e0Var);
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public C7900q get() {
        return m19576a((MarketHolder) this.f14115a.get(), (C4796b) this.f14116b.get(), (C4815e) this.f14117c.get(), (SubscriptionApi) this.f14118d.get(), (MainActivity) this.f14119e.get(), (C7614e) this.f14120f.get(), (C2350e0) this.f14121g.get());
    }
}
