package com.bamtechmedia.dominguez.analytics;

import android.content.Context;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.analytics.r */
/* compiled from: BrazeAnalyticsImpl_Factory */
public final class C2468r implements C11895c<C2447q> {

    /* renamed from: a */
    private final Provider<Context> f6755a;

    /* renamed from: b */
    private final Provider<C2336b> f6756b;

    /* renamed from: c */
    private final Provider<C2364i> f6757c;

    public C2468r(Provider<Context> provider, Provider<C2336b> provider2, Provider<C2364i> provider3) {
        this.f6755a = provider;
        this.f6756b = provider2;
        this.f6757c = provider3;
    }

    /* renamed from: a */
    public static C2468r m9056a(Provider<Context> provider, Provider<C2336b> provider2, Provider<C2364i> provider3) {
        return new C2468r(provider, provider2, provider3);
    }

    public C2447q get() {
        return new C2447q((Context) this.f6755a.get(), (C2336b) this.f6756b.get(), (C2364i) this.f6757c.get());
    }
}
