package com.bamtech.sdk4.extension.account;

import com.bamtech.sdk4.internal.account.AccountClient;
import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import com.bamtech.sdk4.internal.token.AccountTokenExchangeProvider;
import com.bamtech.sdk4.session.ReauthorizationHandlerRegistry;
import com.bamtech.sdk4.session.RenewSessionTransformers;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import javax.inject.Provider;

public final class AccountManagerModule_ManagerFactory implements C2111c<AccountExtension> {
    private final Provider<AccountClient> clientProvider;
    private final AccountManagerModule module;
    private final Provider<ReauthorizationHandlerRegistry> reauthorizationHandlerRegistryProvider;
    private final Provider<RenewSessionTransformers> renewSessionTransformersProvider;
    private final Provider<AccountTokenExchangeProvider> tokenExchangeProvider;
    private final Provider<AccessTokenProvider> tokenProvider;

    public AccountManagerModule_ManagerFactory(AccountManagerModule accountManagerModule, Provider<AccountClient> provider, Provider<AccessTokenProvider> provider2, Provider<AccountTokenExchangeProvider> provider3, Provider<RenewSessionTransformers> provider4, Provider<ReauthorizationHandlerRegistry> provider5) {
        this.module = accountManagerModule;
        this.clientProvider = provider;
        this.tokenProvider = provider2;
        this.tokenExchangeProvider = provider3;
        this.renewSessionTransformersProvider = provider4;
        this.reauthorizationHandlerRegistryProvider = provider5;
    }

    public static AccountManagerModule_ManagerFactory create(AccountManagerModule accountManagerModule, Provider<AccountClient> provider, Provider<AccessTokenProvider> provider2, Provider<AccountTokenExchangeProvider> provider3, Provider<RenewSessionTransformers> provider4, Provider<ReauthorizationHandlerRegistry> provider5) {
        AccountManagerModule_ManagerFactory accountManagerModule_ManagerFactory = new AccountManagerModule_ManagerFactory(accountManagerModule, provider, provider2, provider3, provider4, provider5);
        return accountManagerModule_ManagerFactory;
    }

    public AccountExtension get() {
        AccountExtension manager = this.module.manager((AccountClient) this.clientProvider.get(), (AccessTokenProvider) this.tokenProvider.get(), (AccountTokenExchangeProvider) this.tokenExchangeProvider.get(), (RenewSessionTransformers) this.renewSessionTransformersProvider.get(), (ReauthorizationHandlerRegistry) this.reauthorizationHandlerRegistryProvider.get());
        C2113e.m8178a(manager, "Cannot return null from a non-@Nullable @Provides method");
        return manager;
    }
}
