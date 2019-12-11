package com.bamtech.sdk4.internal.token;

import com.bamtech.sdk4.internal.configuration.BootstrapConfiguration;
import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.session.InternalSessionStateProvider;
import com.bamtech.sdk4.internal.session.SessionInfoUpdater;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultTokenExchangeManager_Factory implements C2111c<DefaultTokenExchangeManager> {
    private final Provider<BootstrapConfiguration> bootstrapConfigurationProvider;
    private final Provider<TokenClient> clientProvider;
    private final Provider<ConfigurationProvider> configurationProvider;
    private final Provider<InternalSessionStateProvider> internalSessionStateProvider;
    private final Provider<SessionInfoUpdater> sessionInfoUpdaterProvider;

    public DefaultTokenExchangeManager_Factory(Provider<BootstrapConfiguration> provider, Provider<InternalSessionStateProvider> provider2, Provider<TokenClient> provider3, Provider<SessionInfoUpdater> provider4, Provider<ConfigurationProvider> provider5) {
        this.bootstrapConfigurationProvider = provider;
        this.internalSessionStateProvider = provider2;
        this.clientProvider = provider3;
        this.sessionInfoUpdaterProvider = provider4;
        this.configurationProvider = provider5;
    }

    public static DefaultTokenExchangeManager_Factory create(Provider<BootstrapConfiguration> provider, Provider<InternalSessionStateProvider> provider2, Provider<TokenClient> provider3, Provider<SessionInfoUpdater> provider4, Provider<ConfigurationProvider> provider5) {
        DefaultTokenExchangeManager_Factory defaultTokenExchangeManager_Factory = new DefaultTokenExchangeManager_Factory(provider, provider2, provider3, provider4, provider5);
        return defaultTokenExchangeManager_Factory;
    }

    public DefaultTokenExchangeManager get() {
        DefaultTokenExchangeManager defaultTokenExchangeManager = new DefaultTokenExchangeManager((BootstrapConfiguration) this.bootstrapConfigurationProvider.get(), (InternalSessionStateProvider) this.internalSessionStateProvider.get(), (TokenClient) this.clientProvider.get(), (SessionInfoUpdater) this.sessionInfoUpdaterProvider.get(), (ConfigurationProvider) this.configurationProvider.get());
        return defaultTokenExchangeManager;
    }
}
