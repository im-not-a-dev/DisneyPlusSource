package com.bamtechmedia.dominguez.main.p234w;

import javax.inject.Provider;
import p163g.p201e.p203b.p319v.C7885o;
import p163g.p201e.p203b.p319v.C7900q;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.main.w.d */
/* compiled from: MainActivityPaywallHandler_Factory */
public final class C6215d implements C11895c<C6206a> {

    /* renamed from: a */
    private final Provider<C7885o> f14248a;

    /* renamed from: b */
    private final Provider<C7900q> f14249b;

    public C6215d(Provider<C7885o> provider, Provider<C7900q> provider2) {
        this.f14248a = provider;
        this.f14249b = provider2;
    }

    /* renamed from: a */
    public static C6215d m19702a(Provider<C7885o> provider, Provider<C7900q> provider2) {
        return new C6215d(provider, provider2);
    }

    public C6206a get() {
        return new C6206a(this.f14248a, (C7900q) this.f14249b.get());
    }
}
