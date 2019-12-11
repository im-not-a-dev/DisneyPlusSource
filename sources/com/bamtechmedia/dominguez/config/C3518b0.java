package com.bamtechmedia.dominguez.config;

import android.content.SharedPreferences;
import com.bamtechmedia.dominguez.config.p082t0.C3577a;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.config.b0 */
/* compiled from: FeatureConfigModule_ProvideTunneledPlaybackRandomValueFactory */
public final class C3518b0 implements C11895c<C3577a> {

    /* renamed from: a */
    private final Provider<SharedPreferences> f8812a;

    public C3518b0(Provider<SharedPreferences> provider) {
        this.f8812a = provider;
    }

    /* renamed from: a */
    public static C3518b0 m11922a(Provider<SharedPreferences> provider) {
        return new C3518b0(provider);
    }

    /* renamed from: a */
    public static C3577a m11923a(SharedPreferences sharedPreferences) {
        C3577a a = C3567p.m12016a(sharedPreferences);
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public C3577a get() {
        return m11923a((SharedPreferences) this.f8812a.get());
    }
}
