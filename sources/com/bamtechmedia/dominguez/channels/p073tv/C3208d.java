package com.bamtechmedia.dominguez.channels.p073tv;

import android.content.Context;
import android.content.SharedPreferences;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.channels.tv.d */
/* compiled from: FeatureChannelModule_ProvideChannelsPrefsFactory */
public final class C3208d implements C11895c<SharedPreferences> {

    /* renamed from: a */
    private final Provider<Context> f8180a;

    public C3208d(Provider<Context> provider) {
        this.f8180a = provider;
    }

    /* renamed from: a */
    public static C3208d m11160a(Provider<Context> provider) {
        return new C3208d(provider);
    }

    /* renamed from: a */
    public static SharedPreferences m11159a(Context context) {
        SharedPreferences a = C3207c.m11157a(context);
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public SharedPreferences get() {
        return m11159a((Context) this.f8180a.get());
    }
}
