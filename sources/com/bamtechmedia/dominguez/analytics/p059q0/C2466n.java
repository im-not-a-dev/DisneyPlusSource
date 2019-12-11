package com.bamtechmedia.dominguez.analytics.p059q0;

import android.content.SharedPreferences;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.analytics.q0.n */
/* compiled from: RealUserSubscriptionInfoAnalyticsStore_Factory */
public final class C2466n implements C11895c<C2464m> {

    /* renamed from: a */
    private final Provider<SharedPreferences> f6754a;

    public C2466n(Provider<SharedPreferences> provider) {
        this.f6754a = provider;
    }

    /* renamed from: a */
    public static C2466n m9051a(Provider<SharedPreferences> provider) {
        return new C2466n(provider);
    }

    public C2464m get() {
        return new C2464m((SharedPreferences) this.f6754a.get());
    }
}
