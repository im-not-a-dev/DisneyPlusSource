package com.bamtechmedia.dominguez.analytics;

import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.analytics.k0 */
/* compiled from: TransactionIdProviderImpl_Factory */
public final class C2372k0 implements C11895c<C2369j0> {

    /* renamed from: a */
    private final Provider<C2361g0> f6592a;

    public C2372k0(Provider<C2361g0> provider) {
        this.f6592a = provider;
    }

    /* renamed from: a */
    public static C2372k0 m8899a(Provider<C2361g0> provider) {
        return new C2372k0(provider);
    }

    public C2369j0 get() {
        return new C2369j0((C2361g0) this.f6592a.get());
    }
}
