package com.bamtech.sdk4.internal.token;

import com.bamtech.sdk4.account.legacy.LegacyAccountExtension;
import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.session.InternalSessionStateProvider;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultRefreshAccessContextHelper_Factory implements C2111c<DefaultRefreshAccessContextHelper> {
    private final Provider<ConfigurationProvider> configurationProvider;
    private final Provider<DeviceAccessContextHelper> deviceContextHelperProvider;
    private final Provider<InternalSessionStateProvider> internalSessionStateProvider;
    private final Provider<LegacyAccountExtension> legacyExtensionProvider;
    private final Provider<RefreshActionPlanner> refreshActionPlannerProvider;
    private final Provider<TokenExchangeManager> tokenExchangeManagerProvider;

    public DefaultRefreshAccessContextHelper_Factory(Provider<ConfigurationProvider> provider, Provider<InternalSessionStateProvider> provider2, Provider<TokenExchangeManager> provider3, Provider<DeviceAccessContextHelper> provider4, Provider<RefreshActionPlanner> provider5, Provider<LegacyAccountExtension> provider6) {
        this.configurationProvider = provider;
        this.internalSessionStateProvider = provider2;
        this.tokenExchangeManagerProvider = provider3;
        this.deviceContextHelperProvider = provider4;
        this.refreshActionPlannerProvider = provider5;
        this.legacyExtensionProvider = provider6;
    }

    public static DefaultRefreshAccessContextHelper_Factory create(Provider<ConfigurationProvider> provider, Provider<InternalSessionStateProvider> provider2, Provider<TokenExchangeManager> provider3, Provider<DeviceAccessContextHelper> provider4, Provider<RefreshActionPlanner> provider5, Provider<LegacyAccountExtension> provider6) {
        DefaultRefreshAccessContextHelper_Factory defaultRefreshAccessContextHelper_Factory = new DefaultRefreshAccessContextHelper_Factory(provider, provider2, provider3, provider4, provider5, provider6);
        return defaultRefreshAccessContextHelper_Factory;
    }

    public DefaultRefreshAccessContextHelper get() {
        DefaultRefreshAccessContextHelper defaultRefreshAccessContextHelper = new DefaultRefreshAccessContextHelper((ConfigurationProvider) this.configurationProvider.get(), (InternalSessionStateProvider) this.internalSessionStateProvider.get(), (TokenExchangeManager) this.tokenExchangeManagerProvider.get(), (DeviceAccessContextHelper) this.deviceContextHelperProvider.get(), (RefreshActionPlanner) this.refreshActionPlannerProvider.get(), this.legacyExtensionProvider);
        return defaultRefreshAccessContextHelper;
    }
}
