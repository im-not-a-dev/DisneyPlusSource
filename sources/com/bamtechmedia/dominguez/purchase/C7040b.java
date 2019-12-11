package com.bamtechmedia.dominguez.purchase;

import android.content.Context;
import com.bamnet.iap.BamnetIAPPurchase;
import com.bamtech.sdk4.Session;
import com.bamtech.sdk4.paywall.PaywallApi;
import p163g.p174d.p175a.p176a.C4795a;
import p163g.p174d.p175a.p176a.C4796b;
import p163g.p174d.p175a.p177b.C4798a;
import p163g.p174d.p175a.p177b.C4807b;
import p163g.p174d.p175a.p177b.C4812c;
import p163g.p174d.p175a.p177b.C4815e;
import p163g.p201e.p203b.p277b0.C7234z;
import p163g.p201e.p203b.p319v.C7873f;
import p163g.p201e.p203b.p319v.p322c0.C7863a;
import p520io.reactivex.Single;

/* renamed from: com.bamtechmedia.dominguez.purchase.b */
/* compiled from: FeaturePaywallModule */
public abstract class C7040b {
    /* renamed from: a */
    static PaywallApi m21367a(C7234z zVar) {
        return (PaywallApi) zVar.mo20024a(PaywallApi.class);
    }

    /* renamed from: a */
    static C4796b m21368a(MarketHolder marketHolder, C7873f fVar) {
        return new C7863a(new C4795a(marketHolder.mo19811g()), fVar);
    }

    /* renamed from: a */
    static C4815e m21370a(Single<Session> single, C4812c cVar) {
        return new C4798a((Session) single.mo30224c(), cVar);
    }

    /* renamed from: a */
    static C4812c m21369a(Context context, Single<Session> single, Class<? extends BamnetIAPPurchase> cls) {
        return new C4807b(context, (Session) single.mo30224c(), cls);
    }
}
