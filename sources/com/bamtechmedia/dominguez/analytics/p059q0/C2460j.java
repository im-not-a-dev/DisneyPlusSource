package com.bamtechmedia.dominguez.analytics.p059q0;

import android.content.SharedPreferences;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.analytics.q0.j */
/* compiled from: RealLoginStatusAnalyticsStore_Factory */
public final class C2460j implements C11895c<C2458i> {

    /* renamed from: a */
    private final Provider<SharedPreferences> f6750a;

    public C2460j(Provider<SharedPreferences> provider) {
        this.f6750a = provider;
    }

    /* renamed from: a */
    public static C2460j m9034a(Provider<SharedPreferences> provider) {
        return new C2460j(provider);
    }

    public C2458i get() {
        return new C2458i((SharedPreferences) this.f6750a.get());
    }
}
