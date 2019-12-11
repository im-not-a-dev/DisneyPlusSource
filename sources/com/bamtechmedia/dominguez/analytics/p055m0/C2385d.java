package com.bamtechmedia.dominguez.analytics.p055m0;

import android.content.Context;
import javax.inject.Provider;
import p163g.p500m.p501a.C11760v;
import p512h.p515d.C11895c;
import p520io.reactivex.C11969r;

/* renamed from: com.bamtechmedia.dominguez.analytics.m0.d */
/* compiled from: AdobeContributor_Factory */
public final class C2385d implements C11895c<C2383c> {

    /* renamed from: a */
    private final Provider<Context> f6613a;

    /* renamed from: b */
    private final Provider<C11760v> f6614b;

    /* renamed from: c */
    private final Provider<C11969r> f6615c;

    public C2385d(Provider<Context> provider, Provider<C11760v> provider2, Provider<C11969r> provider3) {
        this.f6613a = provider;
        this.f6614b = provider2;
        this.f6615c = provider3;
    }

    /* renamed from: a */
    public static C2385d m8922a(Provider<Context> provider, Provider<C11760v> provider2, Provider<C11969r> provider3) {
        return new C2385d(provider, provider2, provider3);
    }

    public C2383c get() {
        return new C2383c((Context) this.f6613a.get(), (C11760v) this.f6614b.get(), (C11969r) this.f6615c.get());
    }
}
