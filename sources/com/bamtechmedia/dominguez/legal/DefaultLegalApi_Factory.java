package com.bamtechmedia.dominguez.legal;

import java.util.Locale;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import p163g.p201e.p203b.p204d.C5403j0;
import p163g.p500m.p501a.C11760v;
import p512h.p515d.C11895c;

public final class DefaultLegalApi_Factory implements C11895c<DefaultLegalApi> {
    private final Provider<LegalApiConfig> configProvider;
    private final Provider<C5403j0> countryCodeProvider;
    private final Provider<Locale> localeProvider;
    private final Provider<C11760v> moshiProvider;
    private final Provider<OkHttpClient> okHttpClientProvider;

    public DefaultLegalApi_Factory(Provider<LegalApiConfig> provider, Provider<C5403j0> provider2, Provider<OkHttpClient> provider3, Provider<Locale> provider4, Provider<C11760v> provider5) {
        this.configProvider = provider;
        this.countryCodeProvider = provider2;
        this.okHttpClientProvider = provider3;
        this.localeProvider = provider4;
        this.moshiProvider = provider5;
    }

    public static DefaultLegalApi_Factory create(Provider<LegalApiConfig> provider, Provider<C5403j0> provider2, Provider<OkHttpClient> provider3, Provider<Locale> provider4, Provider<C11760v> provider5) {
        DefaultLegalApi_Factory defaultLegalApi_Factory = new DefaultLegalApi_Factory(provider, provider2, provider3, provider4, provider5);
        return defaultLegalApi_Factory;
    }

    public static DefaultLegalApi newInstance(LegalApiConfig legalApiConfig, C5403j0 j0Var, OkHttpClient okHttpClient, Provider<Locale> provider, C11760v vVar) {
        DefaultLegalApi defaultLegalApi = new DefaultLegalApi(legalApiConfig, j0Var, okHttpClient, provider, vVar);
        return defaultLegalApi;
    }

    public DefaultLegalApi get() {
        DefaultLegalApi defaultLegalApi = new DefaultLegalApi((LegalApiConfig) this.configProvider.get(), (C5403j0) this.countryCodeProvider.get(), (OkHttpClient) this.okHttpClientProvider.get(), this.localeProvider, (C11760v) this.moshiProvider.get());
        return defaultLegalApi;
    }
}
