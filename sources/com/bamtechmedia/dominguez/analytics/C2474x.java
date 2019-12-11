package com.bamtechmedia.dominguez.analytics;

import android.content.Context;
import android.content.SharedPreferences;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.analytics.x */
/* compiled from: FeatureAnalyticsModule_ProvidePaywallSharedPreferencesFactory */
public final class C2474x implements C11895c<SharedPreferences> {

    /* renamed from: a */
    private final Provider<Context> f6770a;

    public C2474x(Provider<Context> provider) {
        this.f6770a = provider;
    }

    /* renamed from: a */
    public static C2474x m9072a(Provider<Context> provider) {
        return new C2474x(provider);
    }

    /* renamed from: a */
    public static SharedPreferences m9071a(Context context) {
        SharedPreferences b = C2469s.m9061b(context);
        C11897e.m38130a(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }

    public SharedPreferences get() {
        return m9071a((Context) this.f6770a.get());
    }
}
