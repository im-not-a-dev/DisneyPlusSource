package com.bamtechmedia.dominguez.purchase;

import com.bamnet.iap.Market;
import javax.inject.Provider;
import p163g.p201e.p203b.p319v.C7873f;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.purchase.g */
/* compiled from: MarketHolder_Factory */
public final class C7049g implements C11895c<MarketHolder> {

    /* renamed from: a */
    private final Provider<Market> f15653a;

    /* renamed from: b */
    private final Provider<C7873f> f15654b;

    public C7049g(Provider<Market> provider, Provider<C7873f> provider2) {
        this.f15653a = provider;
        this.f15654b = provider2;
    }

    /* renamed from: a */
    public static C7049g m21383a(Provider<Market> provider, Provider<C7873f> provider2) {
        return new C7049g(provider, provider2);
    }

    public MarketHolder get() {
        return new MarketHolder(this.f15653a, (C7873f) this.f15654b.get());
    }
}
