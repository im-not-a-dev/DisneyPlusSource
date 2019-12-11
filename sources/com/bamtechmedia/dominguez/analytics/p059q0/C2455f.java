package com.bamtechmedia.dominguez.analytics.p059q0;

import android.content.SharedPreferences;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.analytics.q0.f */
/* compiled from: RealAcquisitionAnalyticsStore_Factory */
public final class C2455f implements C11895c<C2453e> {

    /* renamed from: a */
    private final Provider<SharedPreferences> f6746a;

    public C2455f(Provider<SharedPreferences> provider) {
        this.f6746a = provider;
    }

    /* renamed from: a */
    public static C2455f m9028a(Provider<SharedPreferences> provider) {
        return new C2455f(provider);
    }

    public C2453e get() {
        return new C2453e((SharedPreferences) this.f6746a.get());
    }
}
