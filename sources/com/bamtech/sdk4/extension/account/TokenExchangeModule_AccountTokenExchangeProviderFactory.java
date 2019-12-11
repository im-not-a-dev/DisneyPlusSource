package com.bamtech.sdk4.extension.account;

import com.bamtech.sdk4.internal.token.AccountTokenExchangeProvider;
import com.bamtech.sdk4.plugin.PluginRegistry;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import javax.inject.Provider;

public final class TokenExchangeModule_AccountTokenExchangeProviderFactory implements C2111c<AccountTokenExchangeProvider> {
    private final TokenExchangeModule module;
    private final Provider<PluginRegistry> registryProvider;

    public TokenExchangeModule_AccountTokenExchangeProviderFactory(TokenExchangeModule tokenExchangeModule, Provider<PluginRegistry> provider) {
        this.module = tokenExchangeModule;
        this.registryProvider = provider;
    }

    public static TokenExchangeModule_AccountTokenExchangeProviderFactory create(TokenExchangeModule tokenExchangeModule, Provider<PluginRegistry> provider) {
        return new TokenExchangeModule_AccountTokenExchangeProviderFactory(tokenExchangeModule, provider);
    }

    public AccountTokenExchangeProvider get() {
        AccountTokenExchangeProvider accountTokenExchangeProvider = this.module.accountTokenExchangeProvider((PluginRegistry) this.registryProvider.get());
        C2113e.m8178a(accountTokenExchangeProvider, "Cannot return null from a non-@Nullable @Provides method");
        return accountTokenExchangeProvider;
    }
}
