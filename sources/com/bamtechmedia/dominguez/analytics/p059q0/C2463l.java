package com.bamtechmedia.dominguez.analytics.p059q0;

import android.content.SharedPreferences;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.analytics.q0.l */
/* compiled from: RealPaywallAnalyticsStore_Factory */
public final class C2463l implements C11895c<C2461k> {

    /* renamed from: a */
    private final Provider<SharedPreferences> f6752a;

    public C2463l(Provider<SharedPreferences> provider) {
        this.f6752a = provider;
    }

    /* renamed from: a */
    public static C2463l m9046a(Provider<SharedPreferences> provider) {
        return new C2463l(provider);
    }

    public C2461k get() {
        return new C2461k((SharedPreferences) this.f6752a.get());
    }
}
