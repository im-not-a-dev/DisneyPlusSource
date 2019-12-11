package com.bamtech.sdk4.internal.media.adengine;

import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultAdEngineClient_Factory implements C2111c<DefaultAdEngineClient> {
    private final Provider<ConfigurationProvider> configurationProvider;

    public DefaultAdEngineClient_Factory(Provider<ConfigurationProvider> provider) {
        this.configurationProvider = provider;
    }

    public static DefaultAdEngineClient_Factory create(Provider<ConfigurationProvider> provider) {
        return new DefaultAdEngineClient_Factory(provider);
    }

    public DefaultAdEngineClient get() {
        return new DefaultAdEngineClient((ConfigurationProvider) this.configurationProvider.get());
    }
}
