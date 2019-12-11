package com.bamtech.sdk4.internal.token;

import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.session.InternalSessionStateProvider;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultAccessContextUpdater_Factory implements C2111c<DefaultAccessContextUpdater> {
    private final Provider<ConfigurationProvider> configurationProvider;
    private final Provider<DeviceAccessContextHelper> deviceAccessContextHelperProvider;
    private final Provider<InternalSessionStateProvider> internalSessionStateProvider;
    private final Provider<RefreshAccessContextHelper> refreshAccessContextHelperProvider;
    private final Provider<TokenExchangeManager> tokenExchangeManagerProvider;

    public DefaultAccessContextUpdater_Factory(Provider<ConfigurationProvider> provider, Provider<TokenExchangeManager> provider2, Provider<InternalSessionStateProvider> provider3, Provider<RefreshAccessContextHelper> provider4, Provider<DeviceAccessContextHelper> provider5) {
        this.configurationProvider = provider;
        this.tokenExchangeManagerProvider = provider2;
        this.internalSessionStateProvider = provider3;
        this.refreshAccessContextHelperProvider = provider4;
        this.deviceAccessContextHelperProvider = provider5;
    }

    public static DefaultAccessContextUpdater_Factory create(Provider<ConfigurationProvider> provider, Provider<TokenExchangeManager> provider2, Provider<InternalSessionStateProvider> provider3, Provider<RefreshAccessContextHelper> provider4, Provider<DeviceAccessContextHelper> provider5) {
        DefaultAccessContextUpdater_Factory defaultAccessContextUpdater_Factory = new DefaultAccessContextUpdater_Factory(provider, provider2, provider3, provider4, provider5);
        return defaultAccessContextUpdater_Factory;
    }

    public DefaultAccessContextUpdater get() {
        DefaultAccessContextUpdater defaultAccessContextUpdater = new DefaultAccessContextUpdater((ConfigurationProvider) this.configurationProvider.get(), (TokenExchangeManager) this.tokenExchangeManagerProvider.get(), (InternalSessionStateProvider) this.internalSessionStateProvider.get(), (RefreshAccessContextHelper) this.refreshAccessContextHelperProvider.get(), (DeviceAccessContextHelper) this.deviceAccessContextHelperProvider.get());
        return defaultAccessContextUpdater;
    }
}
