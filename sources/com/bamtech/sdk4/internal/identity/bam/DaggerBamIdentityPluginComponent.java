package com.bamtech.sdk4.internal.identity.bam;

import com.bamtech.core.networking.converters.Converter;
import com.bamtech.sdk4.identity.bam.BamIdentityApi;
import com.bamtech.sdk4.identity.bam.BamIdentityPlugin;
import com.bamtech.sdk4.identity.bam.BamIdentityPlugin_MembersInjector;
import com.bamtech.sdk4.identity.bam.DefaultBamIdentityApi_Factory;
import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.core.Storage;
import com.bamtech.sdk4.internal.networking.ConverterProvider;
import com.bamtech.sdk4.internal.plugin.DefaultExtensionModule;
import com.bamtech.sdk4.internal.plugin.DefaultExtensionModule_ConfigurationFactory;
import com.bamtech.sdk4.internal.plugin.DefaultExtensionModule_ConverterProviderFactory;
import com.bamtech.sdk4.internal.plugin.DefaultExtensionModule_ServiceTransactionFactory;
import com.bamtech.sdk4.internal.plugin.DefaultExtensionModule_StorageFactory;
import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import com.bamtech.sdk4.plugin.PluginRegistry;
import com.bamtech.sdk4.session.AccessTokenProviderModule;
import com.bamtech.sdk4.session.AccessTokenProviderModule_AccessTokenProviderFactory;
import com.bamtech.shadow.dagger.p048a.C2110b;
import com.bamtech.shadow.dagger.p048a.C2112d;
import com.bamtech.shadow.dagger.p048a.C2113e;
import com.bamtech.shadow.gson.GsonBuilder;
import javax.inject.Provider;

public final class DaggerBamIdentityPluginComponent implements BamIdentityPluginComponent {
    private Provider<AccessTokenProvider> accessTokenProvider;
    private Provider<BaseIdentityClient> baseIdentityClientProvider;
    private Provider<IdentityClient> clientProvider;
    private Provider<CommonIdentityTokenManager> commonIdentityTokenManagerProvider;
    private Provider<ConfigurationProvider> configurationProvider;
    private Provider<ConverterProvider> converterProvider;
    private Provider<Converter> converterProvider2;
    private DefaultAuthenticationClient_Factory defaultAuthenticationClientProvider;
    private DefaultAuthenticationManager_Factory defaultAuthenticationManagerProvider;
    private DefaultBamIdentityApi_Factory defaultBamIdentityApiProvider;
    private DefaultBaseIdentityClient_Factory defaultBaseIdentityClientProvider;
    private DefaultBaseIdentityManager_Factory defaultBaseIdentityManagerProvider;
    private DefaultCommonIdentityTokenManager_Factory defaultCommonIdentityTokenManagerProvider;
    private DefaultIdentityClient_Factory defaultIdentityClientProvider;
    private DefaultIdentityManager_Factory defaultIdentityManagerProvider;
    private DefaultPasswordClient_Factory defaultPasswordClientProvider;
    private DefaultPasswordManager_Factory defaultPasswordManagerProvider;
    private DefaultRegistrationClient_Factory defaultRegistrationClientProvider;
    private Provider<GsonBuilder> gsonBuilderProvider;
    private Provider<Converter> identityConverterProvider;
    private Provider<IdentityManager> identityManagerProvider;
    private Provider<PluginRegistry> registryProvider;
    private Provider<BamIdentityApi> serviceProvider;
    private DefaultExtensionModule_ServiceTransactionFactory serviceTransactionProvider;
    private Provider<Storage> storageProvider;

    private static final class Builder implements com.bamtech.sdk4.internal.identity.bam.BamIdentityPluginComponent.Builder {
        /* access modifiers changed from: private */
        public AccessTokenProviderModule accessTokenProviderModule;
        /* access modifiers changed from: private */
        public AuthenticationFlowConverterModule authenticationFlowConverterModule;
        /* access modifiers changed from: private */
        public Converter converter;
        /* access modifiers changed from: private */
        public DefaultExtensionModule defaultExtensionModule;
        /* access modifiers changed from: private */
        public PluginRegistry registry;

        private Builder() {
        }

        public BamIdentityPluginComponent build() {
            if (this.defaultExtensionModule == null) {
                this.defaultExtensionModule = new DefaultExtensionModule();
            }
            if (this.authenticationFlowConverterModule == null) {
                this.authenticationFlowConverterModule = new AuthenticationFlowConverterModule();
            }
            if (this.accessTokenProviderModule == null) {
                this.accessTokenProviderModule = new AccessTokenProviderModule();
            }
            if (this.registry != null) {
                return new DaggerBamIdentityPluginComponent(this);
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

    public static com.bamtech.sdk4.internal.identity.bam.BamIdentityPluginComponent.Builder builder() {
        return new Builder();
    }

    private void initialize(Builder builder) {
        this.registryProvider = C2112d.m8174a(builder.registry);
        this.serviceTransactionProvider = DefaultExtensionModule_ServiceTransactionFactory.create(builder.defaultExtensionModule, this.registryProvider);
        this.configurationProvider = C2110b.m8173b(DefaultExtensionModule_ConfigurationFactory.create(builder.defaultExtensionModule, this.registryProvider));
        this.converterProvider = C2110b.m8173b(DefaultExtensionModule_ConverterProviderFactory.create(builder.defaultExtensionModule, this.registryProvider));
        this.gsonBuilderProvider = C2110b.m8173b(AuthenticationFlowConverterModule_GsonBuilderFactory.create(builder.authenticationFlowConverterModule));
        this.identityConverterProvider = C2110b.m8173b(AuthenticationFlowConverterModule_IdentityConverterFactory.create(builder.authenticationFlowConverterModule, this.gsonBuilderProvider));
        this.defaultAuthenticationClientProvider = DefaultAuthenticationClient_Factory.create(this.configurationProvider, this.converterProvider, this.identityConverterProvider);
        this.defaultRegistrationClientProvider = DefaultRegistrationClient_Factory.create(this.configurationProvider, this.converterProvider);
        this.defaultPasswordClientProvider = DefaultPasswordClient_Factory.create(this.configurationProvider, this.converterProvider);
        this.defaultIdentityClientProvider = DefaultIdentityClient_Factory.create(this.defaultAuthenticationClientProvider, this.defaultRegistrationClientProvider, this.defaultPasswordClientProvider);
        this.clientProvider = C2110b.m8173b(this.defaultIdentityClientProvider);
        this.accessTokenProvider = C2110b.m8173b(AccessTokenProviderModule_AccessTokenProviderFactory.create(builder.accessTokenProviderModule, this.registryProvider));
        this.storageProvider = C2110b.m8173b(DefaultExtensionModule_StorageFactory.create(builder.defaultExtensionModule, this.registryProvider));
        this.defaultAuthenticationManagerProvider = DefaultAuthenticationManager_Factory.create(this.configurationProvider, this.clientProvider, this.accessTokenProvider, this.storageProvider, this.identityConverterProvider);
        this.defaultCommonIdentityTokenManagerProvider = DefaultCommonIdentityTokenManager_Factory.create(this.configurationProvider, this.storageProvider, this.identityConverterProvider);
        this.commonIdentityTokenManagerProvider = C2110b.m8173b(this.defaultCommonIdentityTokenManagerProvider);
        this.defaultPasswordManagerProvider = DefaultPasswordManager_Factory.create(this.serviceTransactionProvider, this.clientProvider, this.accessTokenProvider, this.commonIdentityTokenManagerProvider);
        this.converterProvider2 = C2112d.m8176b(builder.converter);
        this.defaultBaseIdentityClientProvider = DefaultBaseIdentityClient_Factory.create(this.configurationProvider, this.converterProvider, this.converterProvider2);
        this.baseIdentityClientProvider = C2110b.m8173b(this.defaultBaseIdentityClientProvider);
        this.defaultBaseIdentityManagerProvider = DefaultBaseIdentityManager_Factory.create(this.baseIdentityClientProvider, this.commonIdentityTokenManagerProvider);
        this.defaultIdentityManagerProvider = DefaultIdentityManager_Factory.create(this.defaultAuthenticationManagerProvider, this.defaultPasswordManagerProvider, this.defaultBaseIdentityManagerProvider);
        this.identityManagerProvider = C2110b.m8173b(this.defaultIdentityManagerProvider);
        this.defaultBamIdentityApiProvider = DefaultBamIdentityApi_Factory.create(this.serviceTransactionProvider, this.identityManagerProvider);
        this.serviceProvider = C2110b.m8173b(this.defaultBamIdentityApiProvider);
    }

    private BamIdentityPlugin injectBamIdentityPlugin(BamIdentityPlugin bamIdentityPlugin) {
        BamIdentityPlugin_MembersInjector.injectApi(bamIdentityPlugin, (BamIdentityApi) this.serviceProvider.get());
        return bamIdentityPlugin;
    }

    public void inject(BamIdentityPlugin bamIdentityPlugin) {
        injectBamIdentityPlugin(bamIdentityPlugin);
    }

    private DaggerBamIdentityPluginComponent(Builder builder) {
        initialize(builder);
    }
}
