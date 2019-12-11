package com.bamtech.sdk4.internal.media;

import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.media.drm.DefaultWidevineDrmProvider;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class WidevineVerifier_Factory implements C2111c<WidevineVerifier> {
    private final Provider<ConfigurationProvider> configurationProvider;
    private final Provider<DefaultWidevineDrmProvider> drmProvider;

    public WidevineVerifier_Factory(Provider<ConfigurationProvider> provider, Provider<DefaultWidevineDrmProvider> provider2) {
        this.configurationProvider = provider;
        this.drmProvider = provider2;
    }

    public static WidevineVerifier_Factory create(Provider<ConfigurationProvider> provider, Provider<DefaultWidevineDrmProvider> provider2) {
        return new WidevineVerifier_Factory(provider, provider2);
    }

    public WidevineVerifier get() {
        return new WidevineVerifier((ConfigurationProvider) this.configurationProvider.get(), (DefaultWidevineDrmProvider) this.drmProvider.get());
    }
}
