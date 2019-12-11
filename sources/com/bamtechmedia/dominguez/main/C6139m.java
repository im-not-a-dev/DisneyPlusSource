package com.bamtechmedia.dominguez.main;

import com.bamtech.sdk4.subscription.SubscriptionApi;
import com.bamtechmedia.dominguez.analytics.C2350e0;
import com.bamtechmedia.dominguez.purchase.MarketHolder;
import p163g.p174d.p175a.p176a.C4796b;
import p163g.p174d.p175a.p177b.C4815e;
import p163g.p201e.p203b.p307o.C7614e;
import p163g.p201e.p203b.p307o.C7620j;
import p163g.p201e.p203b.p307o.p308p.C7629c;
import p163g.p201e.p203b.p319v.C7824b;
import p163g.p201e.p203b.p319v.C7900q;

/* renamed from: com.bamtechmedia.dominguez.main.m */
/* compiled from: MainActivityTvBindingModule */
abstract class C6139m {
    /* renamed from: a */
    static C7629c m19571a() {
        return new C7620j();
    }

    /* renamed from: a */
    static C7900q m19572a(MarketHolder marketHolder, C4796b bVar, C4815e eVar, SubscriptionApi subscriptionApi, MainActivity mainActivity, C7614e eVar2, C2350e0 e0Var) {
        MarketHolder marketHolder2 = marketHolder;
        C4796b bVar2 = bVar;
        C4815e eVar3 = eVar;
        SubscriptionApi subscriptionApi2 = subscriptionApi;
        C7824b bVar3 = new C7824b(marketHolder2, bVar2, eVar3, subscriptionApi2, "base64key", e0Var, eVar2, mainActivity.getLifecycle());
        return bVar3;
    }
}
