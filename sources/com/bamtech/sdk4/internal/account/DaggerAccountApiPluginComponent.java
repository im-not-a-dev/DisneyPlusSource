package com.bamtech.sdk4.internal.account;

import com.bamtech.core.networking.converters.Converter;
import com.bamtech.sdk4.account.AccountApi;
import com.bamtech.sdk4.account.AccountPlugin;
import com.bamtech.sdk4.account.AccountPlugin_MembersInjector;
import com.bamtech.sdk4.account.DefaultAccountApi_Factory;
import com.bamtech.sdk4.account.DefaultUserProfileApi_Factory;
import com.bamtech.sdk4.account.UserProfileApi;
import com.bamtech.sdk4.extension.account.AccountExtension;
import com.bamtech.sdk4.extension.account.AccountManagerModule;
import com.bamtech.sdk4.extension.account.AccountManagerModule_ManagerFactory;
import com.bamtech.sdk4.extension.account.DefaultUserProfileExtension;
import com.bamtech.sdk4.extension.account.DefaultUserProfileExtension_Factory;
import com.bamtech.sdk4.extension.account.TokenExchangeModule;
import com.bamtech.sdk4.extension.account.TokenExchangeModule_AccountTokenExchangeProviderFactory;
import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.networking.ConverterProvider;
import com.bamtech.sdk4.internal.plugin.DefaultExtensionModule;
import com.bamtech.sdk4.internal.plugin.DefaultExtensionModule_ConfigurationFactory;
import com.bamtech.sdk4.internal.plugin.DefaultExtensionModule_ConverterProviderFactory;
import com.bamtech.sdk4.internal.plugin.DefaultExtensionModule_GetSessionExchangerStoreFactory;
import com.bamtech.sdk4.internal.plugin.DefaultExtensionModule_RenewSessionTransformerFactory;
import com.bamtech.sdk4.internal.plugin.DefaultExtensionModule_ServiceTransactionFactory;
import com.bamtech.sdk4.internal.plugin.DefaultExtensionModule_UserProfileEventFactory;
import com.bamtech.sdk4.internal.token.AccessContextUpdater;
import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import com.bamtech.sdk4.internal.token.AccountTokenExchangeProvider;
import com.bamtech.sdk4.plugin.PluginRegistry;
import com.bamtech.sdk4.session.AccessContextUpdaterModule;
import com.bamtech.sdk4.session.AccessContextUpdaterModule_AccessContextUpdaterFactory;
import com.bamtech.sdk4.session.AccessTokenProviderModule;
import com.bamtech.sdk4.session.AccessTokenProviderModule_AccessTokenProviderFactory;
import com.bamtech.shadow.dagger.p048a.C2110b;
import com.bamtech.shadow.dagger.p048a.C2112d;
import com.bamtech.shadow.dagger.p048a.C2113e;
import javax.inject.Provider;

public final class DaggerAccountApiPluginComponent implements AccountApiPluginComponent {
    private Provider<AccessContextUpdater> accessContextUpdaterProvider;
    private Provider<AccessTokenProvider> accessTokenProvider;
    private Provider<AccountTokenExchangeProvider> accountTokenExchangeProvider;
    private Provider<AccountApi> apiProvider;
    private Provider<AccountClient> clientProvider;
    private Provider<UserProfileClient> clientProvider2;
    private Provider<ConfigurationProvider> configurationProvider;
    private Provider<ConverterProvider> converterProvider;
    private Provider<Converter> converterProvider2;
    private DefaultAccountApi_Factory defaultAccountApiProvider;
    private DefaultAccountClient_Factory defaultAccountClientProvider;
    private DefaultCreateAccountClient_Factory defaultCreateAccountClientProvider;
    private DefaultCreateAccountGrantClient_Factory defaultCreateAccountGrantClientProvider;
    private DefaultGetAccountClient_Factory defaultGetAccountClientProvider;
    private DefaultUpdateAccountClient_Factory defaultUpdateAccountClientProvider;
    private DefaultUserProfileApi_Factory defaultUserProfileApiProvider;
    private DefaultUserProfileClient_Factory defaultUserProfileClientProvider;
    private Provider<DefaultUserProfileExtension> defaultUserProfileExtensionProvider;
    private DefaultExtensionModule_GetSessionExchangerStoreFactory getSessionExchangerStoreProvider;
    private Provider<AccountExtension> managerProvider;
    private Provider<PluginRegistry> registryProvider;
    private DefaultExtensionModule_RenewSessionTransformerFactory renewSessionTransformerProvider;
    private DefaultExtensionModule_ServiceTransactionFactory serviceTransactionProvider;
    private Provider<UserProfileApi> userProfileApiProvider;
    private DefaultExtensionModule_UserProfileEventFactory userProfileEventProvider;

    private static final class Builder implements com.bamtech.sdk4.internal.account.AccountApiPluginComponent.Builder {
        /* access modifiers changed from: private */
        public AccessContextUpdaterModule accessContextUpdaterModule;
        /* access modifiers changed from: private */
        public AccessTokenProviderModule accessTokenProviderModule;
        /* access modifiers changed from: private */
        public AccountManagerModule accountManagerModule;
        /* access modifiers changed from: private */
        public Converter converter;
        /* access modifiers changed from: private */
        public DefaultExtensionModule defaultExtensionModule;
        /* access modifiers changed from: private */
        public PluginRegistry registry;
        /* access modifiers changed from: private */
        public TokenExchangeModule tokenExchangeModule;

        private Builder() {
        }

        public AccountApiPluginComponent build() {
            if (this.defaultExtensionModule == null) {
                this.defaultExtensionModule = new DefaultExtensionModule();
            }
            if (this.accessTokenProviderModule == null) {
                this.accessTokenProviderModule = new AccessTokenProviderModule();
            }
            if (this.tokenExchangeModule == null) {
                this.tokenExchangeModule = new TokenExchangeModule();
            }
            if (this.accountManagerModule == null) {
                this.accountManagerModule = new AccountManagerModule();
            }
            if (this.accessContextUpdaterModule == null) {
                this.accessContextUpdaterModule = new AccessContextUpdaterModule();
            }
            if (this.registry != null) {
                return new DaggerAccountApiPluginComponent(this);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(PluginRegistry.class.getCanonicalName());
            sb.append(" must be set");
            throw new IllegalStateException(sb.toString());
        }

        public Builder converter(Converter converter2) {
            this.converter = converter2;
            return this;
        }

        public Builder registry(PluginRegistry pluginRegistry) {
            C2113e.m8177a(pluginRegistry);
            this.registry = pluginRegistry;
            return this;
        }
    }

    public static com.bamtech.sdk4.internal.account.AccountApiPluginComponent.Builder builder() {
        return new Builder();
    }

    private void initialize(Builder builder) {
        this.registryProvider = C2112d.m8174a(builder.registry);
        this.serviceTransactionProvider = DefaultExtensionModule_ServiceTransactionFactory.create(builder.defaultExtensionModule, this.registryProvider);
        this.configurationProvider = C2110b.m8173b(DefaultExtensionModule_ConfigurationFactory.create(builder.defaultExtensionModule, this.registryProvider));
        this.converterProvider = C2110b.m8173b(DefaultExtensionModule_ConverterProviderFactory.create(builder.defaultExtensionModule, this.registryProvider));
        this.converterProvider2 = C2112d.m8176b(builder.converter);
        this.defaultCreateAccountClientProvider = DefaultCreateAccountClient_Factory.create(this.configurationProvider, this.converterProvider, this.converterProvider2);
        this.defaultCreateAccountGrantClientProvider = DefaultCreateAccountGrantClient_Factory.create(this.configurationProvider, this.converterProvider);
        this.defaultGetAccountClientProvider = DefaultGetAccountClient_Factory.create(this.configurationProvider, this.converterProvider, this.converterProvider2);
        this.defaultUpdateAccountClientProvider = DefaultUpdateAccountClient_Factory.create(this.configurationProvider, this.converterProvider, this.converterProvider2);
        this.defaultAccountClientProvider = DefaultAccountClient_Factory.create(this.defaultCreateAccountClientProvider, this.defaultCreateAccountGrantClientProvider, this.defaultGetAccountClientProvider, this.defaultUpdateAccountClientProvider);
        this.clientProvider = C2110b.m8173b(this.defaultAccountClientProvider);
        this.accessTokenProvider = C2110b.m8173b(AccessTokenProviderModule_AccessTokenProviderFactory.create(builder.accessTokenProviderModule, this.registryProvider));
        this.accountTokenExchangeProvider = C2110b.m8173b(TokenExchangeModule_AccountTokenExchangeProviderFactory.create(builder.tokenExchangeModule, this.registryProvider));
        this.renewSessionTransformerProvider = DefaultExtensionModule_RenewSessionTransformerFactory.create(builder.defaultExtensionModule, this.registryProvider);
        this.getSessionExchangerStoreProvider = DefaultExtensionModule_GetSessionExchangerStoreFactory.create(builder.defaultExtensionModule, this.registryProvider);
        this.managerProvider = C2110b.m8173b(AccountManagerModule_ManagerFactory.create(builder.accountManagerModule, this.clientProvider, this.accessTokenProvider, this.accountTokenExchangeProvider, this.renewSessionTransformerProvider, this.getSessionExchangerStoreProvider));
        this.defaultAccountApiProvider = DefaultAccountApi_Factory.create(this.serviceTransactionProvider, this.managerProvider);
        this.apiProvider = C2110b.m8173b(this.defaultAccountApiProvider);
        this.defaultUserProfileClientProvider = DefaultUserProfileClient_Factory.create(this.configurationProvider, this.converterProvider, this.converterProvider2);
        this.clientProvider2 = C2110b.m8173b(this.defaultUserProfileClientProvider);
        this.accessContextUpdaterProvider = C2110b.m8173b(AccessContextUpdaterModule_AccessContextUpdaterFactory.create(builder.accessContextUpdaterModule, this.registryProvider));
        this.userProfileEventProvider = DefaultExtensionModule_UserProfileEventFactory.create(builder.defaultExtensionModule, this.registryProvider);
        this.defaultUserProfileExtensionProvider = C2110b.m8173b(DefaultUserProfileExtension_Factory.create(this.clientProvider2, this.accessTokenProvider, this.accountTokenExchangeProvider, this.accessContextUpdaterProvider, this.userProfileEventProvider, this.renewSessionTransformerProvider));
        this.defaultUserProfileApiProvider = DefaultUserProfileApi_Factory.create(this.serviceTransactionProvider, this.defaultUserProfileExtensionProvider);
        this.userProfileApiProvider = C2110b.m8173b(this.defaultUserProfileApiProvider);
    }

    private AccountPlugin injectAccountPlugin(AccountPlugin accountPlugin) {
        AccountPlugin_MembersInjector.injectApi(accountPlugin, (AccountApi) this.apiProvider.get());
        AccountPlugin_MembersInjector.injectProfileApi(accountPlugin, (UserProfileApi) this.userProfileApiProvider.get());
        return accountPlugin;
    }

    public void inject(AccountPlugin accountPlugin) {
        injectAccountPlugin(accountPlugin);
    }

    private DaggerAccountApiPluginComponent(Builder builder) {
        initialize(builder);
    }
}
