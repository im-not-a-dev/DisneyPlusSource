package com.bamtechmedia.dominguez.analytics;

import android.content.Context;
import android.location.LocationManager;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.analytics.w */
/* compiled from: FeatureAnalyticsModule_ProvideLocationManagerFactory */
public final class C2473w implements C11895c<LocationManager> {

    /* renamed from: a */
    private final Provider<Context> f6769a;

    public C2473w(Provider<Context> provider) {
        this.f6769a = provider;
    }

    /* renamed from: a */
    public static C2473w m9070a(Provider<Context> provider) {
        return new C2473w(provider);
    }

    /* renamed from: a */
    public static LocationManager m9069a(Context context) {
        LocationManager a = C2469s.m9057a(context);
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public LocationManager get() {
        return m9069a((Context) this.f6769a.get());
    }
}
