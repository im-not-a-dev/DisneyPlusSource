package com.bamtechmedia.dominguez.analytics.p055m0;

import com.bamtechmedia.dominguez.analytics.C2350e0;
import com.bamtechmedia.dominguez.core.BuildInfo;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p520io.reactivex.C11969r;

/* renamed from: com.bamtechmedia.dominguez.analytics.m0.q */
/* compiled from: PurchaseContributor_Factory */
public final class C2406q implements C11895c<C2404p> {

    /* renamed from: a */
    private final Provider<C2350e0> f6654a;

    /* renamed from: b */
    private final Provider<BuildInfo> f6655b;

    /* renamed from: c */
    private final Provider<C11969r> f6656c;

    public C2406q(Provider<C2350e0> provider, Provider<BuildInfo> provider2, Provider<C11969r> provider3) {
        this.f6654a = provider;
        this.f6655b = provider2;
        this.f6656c = provider3;
    }

    /* renamed from: a */
    public static C2406q m8953a(Provider<C2350e0> provider, Provider<BuildInfo> provider2, Provider<C11969r> provider3) {
        return new C2406q(provider, provider2, provider3);
    }

    public C2404p get() {
        return new C2404p((C2350e0) this.f6654a.get(), (BuildInfo) this.f6655b.get(), (C11969r) this.f6656c.get());
    }
}
