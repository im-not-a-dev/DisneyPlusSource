package com.bamtechmedia.dominguez.purchase;

import com.bamtech.sdk4.paywall.PaywallApi;
import javax.inject.Provider;
import p163g.p201e.p203b.p277b0.C7234z;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.purchase.d */
/* compiled from: FeaturePaywallModule_PaywallApiFactory */
public final class C7046d implements C11895c<PaywallApi> {

    /* renamed from: a */
    private final Provider<C7234z> f15647a;

    public C7046d(Provider<C7234z> provider) {
        this.f15647a = provider;
    }

    /* renamed from: a */
    public static C7046d m21378a(Provider<C7234z> provider) {
        return new C7046d(provider);
    }

    /* renamed from: a */
    public static PaywallApi m21377a(C7234z zVar) {
        PaywallApi a = C7040b.m21367a(zVar);
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public PaywallApi get() {
        return m21377a((C7234z) this.f15647a.get());
    }
}
