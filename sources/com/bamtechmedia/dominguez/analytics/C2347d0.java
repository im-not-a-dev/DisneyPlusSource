package com.bamtechmedia.dominguez.analytics;

import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.analytics.d0 */
/* compiled from: PageLoadAnalytics_Factory */
public final class C2347d0 implements C11895c<C2340b0> {

    /* renamed from: a */
    private final Provider<C2336b> f6554a;

    /* renamed from: b */
    private final Provider<C2348e> f6555b;

    /* renamed from: c */
    private final Provider<C2436p> f6556c;

    /* renamed from: d */
    private final Provider<C2476z> f6557d;

    public C2347d0(Provider<C2336b> provider, Provider<C2348e> provider2, Provider<C2436p> provider3, Provider<C2476z> provider4) {
        this.f6554a = provider;
        this.f6555b = provider2;
        this.f6556c = provider3;
        this.f6557d = provider4;
    }

    /* renamed from: a */
    public static C2347d0 m8850a(Provider<C2336b> provider, Provider<C2348e> provider2, Provider<C2436p> provider3, Provider<C2476z> provider4) {
        return new C2347d0(provider, provider2, provider3, provider4);
    }

    public C2340b0 get() {
        return new C2340b0((C2336b) this.f6554a.get(), (C2348e) this.f6555b.get(), (C2436p) this.f6556c.get(), (C2476z) this.f6557d.get());
    }
}
