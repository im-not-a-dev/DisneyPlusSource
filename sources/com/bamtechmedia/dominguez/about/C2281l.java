package com.bamtechmedia.dominguez.about;

import android.content.SharedPreferences;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.about.l */
/* compiled from: PersistedDebugOverrides_Factory */
public final class C2281l implements C11895c<C2279k> {

    /* renamed from: a */
    private final Provider<SharedPreferences> f6415a;

    public C2281l(Provider<SharedPreferences> provider) {
        this.f6415a = provider;
    }

    /* renamed from: a */
    public static C2281l m8713a(Provider<SharedPreferences> provider) {
        return new C2281l(provider);
    }

    public C2279k get() {
        return new C2279k((SharedPreferences) this.f6415a.get());
    }
}
