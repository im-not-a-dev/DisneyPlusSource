package com.bamtechmedia.dominguez.purchase;

import javax.inject.Provider;
import p163g.p174d.p175a.p176a.C4796b;
import p163g.p201e.p203b.p319v.C7873f;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.purchase.c */
/* compiled from: FeaturePaywallModule_BindPurchaseDelegateFactory */
public final class C7045c implements C11895c<C4796b> {

    /* renamed from: a */
    private final Provider<MarketHolder> f15645a;

    /* renamed from: b */
    private final Provider<C7873f> f15646b;

    public C7045c(Provider<MarketHolder> provider, Provider<C7873f> provider2) {
        this.f15645a = provider;
        this.f15646b = provider2;
    }

    /* renamed from: a */
    public static C7045c m21375a(Provider<MarketHolder> provider, Provider<C7873f> provider2) {
        return new C7045c(provider, provider2);
    }

    /* renamed from: a */
    public static C4796b m21376a(MarketHolder marketHolder, C7873f fVar) {
        C4796b a = C7040b.m21368a(marketHolder, fVar);
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public C4796b get() {
        return m21376a((MarketHolder) this.f15645a.get(), (C7873f) this.f15646b.get());
    }
}
