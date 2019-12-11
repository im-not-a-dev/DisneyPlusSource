package com.bamtechmedia.dominguez.analytics;

import android.content.Context;
import android.telephony.TelephonyManager;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.analytics.y */
/* compiled from: FeatureAnalyticsModule_ProvideTelephonyManagerFactory */
public final class C2475y implements C11895c<TelephonyManager> {

    /* renamed from: a */
    private final Provider<Context> f6771a;

    public C2475y(Provider<Context> provider) {
        this.f6771a = provider;
    }

    /* renamed from: a */
    public static C2475y m9074a(Provider<Context> provider) {
        return new C2475y(provider);
    }

    /* renamed from: a */
    public static TelephonyManager m9073a(Context context) {
        TelephonyManager c = C2469s.m9062c(context);
        C11897e.m38130a(c, "Cannot return null from a non-@Nullable @Provides method");
        return c;
    }

    public TelephonyManager get() {
        return m9073a((Context) this.f6771a.get());
    }
}
