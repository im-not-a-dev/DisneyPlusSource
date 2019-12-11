package com.bamtech.sdk4.session;

import com.bamtech.sdk4.internal.token.ExternalGrantExchange;
import com.bamtech.sdk4.plugin.PluginRegistry;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import javax.inject.Provider;

public final class GrantExchangeModule_GrantExchangeProviderFactory implements C2111c<ExternalGrantExchange> {
    private final GrantExchangeModule module;
    private final Provider<PluginRegistry> registryProvider;

    public GrantExchangeModule_GrantExchangeProviderFactory(GrantExchangeModule grantExchangeModule, Provider<PluginRegistry> provider) {
        this.module = grantExchangeModule;
        this.registryProvider = provider;
    }

    public static GrantExchangeModule_GrantExchangeProviderFactory create(GrantExchangeModule grantExchangeModule, Provider<PluginRegistry> provider) {
        return new GrantExchangeModule_GrantExchangeProviderFactory(grantExchangeModule, provider);
    }

    public static ExternalGrantExchange proxyGrantExchangeProvider(GrantExchangeModule grantExchangeModule, PluginRegistry pluginRegistry) {
        ExternalGrantExchange grantExchangeProvider = grantExchangeModule.grantExchangeProvider(pluginRegistry);
        C2113e.m8178a(grantExchangeProvider, "Cannot return null from a non-@Nullable @Provides method");
        return grantExchangeProvider;
    }

    public ExternalGrantExchange get() {
        ExternalGrantExchange grantExchangeProvider = this.module.grantExchangeProvider((PluginRegistry) this.registryProvider.get());
        C2113e.m8178a(grantExchangeProvider, "Cannot return null from a non-@Nullable @Provides method");
        return grantExchangeProvider;
    }
}
