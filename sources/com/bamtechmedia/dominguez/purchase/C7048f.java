package com.bamtechmedia.dominguez.purchase;

import com.bamtech.sdk4.Session;
import javax.inject.Provider;
import p163g.p174d.p175a.p177b.C4812c;
import p163g.p174d.p175a.p177b.C4815e;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;
import p520io.reactivex.Single;

/* renamed from: com.bamtechmedia.dominguez.purchase.f */
/* compiled from: FeaturePaywallModule_ProvideRedemptionDelegateFactory */
public final class C7048f implements C11895c<C4815e> {

    /* renamed from: a */
    private final Provider<Single<Session>> f15651a;

    /* renamed from: b */
    private final Provider<C4812c> f15652b;

    public C7048f(Provider<Single<Session>> provider, Provider<C4812c> provider2) {
        this.f15651a = provider;
        this.f15652b = provider2;
    }

    /* renamed from: a */
    public static C7048f m21381a(Provider<Single<Session>> provider, Provider<C4812c> provider2) {
        return new C7048f(provider, provider2);
    }

    /* renamed from: a */
    public static C4815e m21382a(Single<Session> single, C4812c cVar) {
        C4815e a = C7040b.m21370a(single, cVar);
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public C4815e get() {
        return m21382a((Single) this.f15651a.get(), (C4812c) this.f15652b.get());
    }
}
