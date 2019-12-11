package com.bamtechmedia.dominguez.analytics;

import com.bamtechmedia.dominguez.config.C3524e;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.analytics.j */
/* compiled from: AnalyticsConfig_Factory */
public final class C2368j implements C11895c<C2364i> {

    /* renamed from: a */
    private final Provider<C3524e> f6578a;

    public C2368j(Provider<C3524e> provider) {
        this.f6578a = provider;
    }

    /* renamed from: a */
    public static C2368j m8889a(Provider<C3524e> provider) {
        return new C2368j(provider);
    }

    public C2364i get() {
        return new C2364i((C3524e) this.f6578a.get());
    }
}
