package com.bamtechmedia.dominguez.legal;

import com.bamtechmedia.dominguez.analytics.C2334a;
import com.bamtechmedia.dominguez.analytics.C2348e;
import javax.inject.Provider;
import p512h.p515d.C11895c;

public final class LegalCenterAnalytics_Factory implements C11895c<LegalCenterAnalytics> {
    private final Provider<C2334a> activePageOverrideProvider;
    private final Provider<C2348e> adobeProvider;

    public LegalCenterAnalytics_Factory(Provider<C2334a> provider, Provider<C2348e> provider2) {
        this.activePageOverrideProvider = provider;
        this.adobeProvider = provider2;
    }

    public static LegalCenterAnalytics_Factory create(Provider<C2334a> provider, Provider<C2348e> provider2) {
        return new LegalCenterAnalytics_Factory(provider, provider2);
    }

    public static LegalCenterAnalytics newInstance(C2334a aVar, C2348e eVar) {
        return new LegalCenterAnalytics(aVar, eVar);
    }

    public LegalCenterAnalytics get() {
        return new LegalCenterAnalytics((C2334a) this.activePageOverrideProvider.get(), (C2348e) this.adobeProvider.get());
    }
}
