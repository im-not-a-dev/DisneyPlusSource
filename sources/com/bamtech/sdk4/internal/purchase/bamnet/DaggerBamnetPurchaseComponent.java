package com.bamtech.sdk4.internal.purchase.bamnet;

import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.networking.ConverterProvider;
import com.bamtech.sdk4.internal.plugin.DefaultExtensionModule;
import com.bamtech.sdk4.internal.plugin.DefaultExtensionModule_ConfigurationFactory;
import com.bamtech.sdk4.internal.plugin.DefaultExtensionModule_ConverterProviderFactory;
import com.bamtech.sdk4.internal.plugin.DefaultExtensionModule_RenewSessionTransformerFactory;
import com.bamtech.sdk4.internal.plugin.DefaultExtensionModule_ServiceTransactionFactory;
import com.bamtech.sdk4.internal.purchase.DefaultPurchaseClient_Factory;
import com.bamtech.sdk4.internal.purchase.DefaultPurchaseManager_Factory;
import com.bamtech.sdk4.internal.purchase.PurchaseClient;
import com.bamtech.sdk4.internal.purchase.PurchaseManager;
import com.bamtech.sdk4.internal.token.AccessContextUpdater;
import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import com.bamtech.sdk4.plugin.PluginRegistry;
import com.bamtech.sdk4.purchase.DefaultPurchaseExtension_Factory;
import com.bamtech.sdk4.purchase.PurchaseExtension;
import com.bamtech.sdk4.purchase.bamnet.BamnetPurchaseApi;
import com.bamtech.sdk4.purchase.bamnet.BamnetPurchasePlugin;
import com.bamtech.sdk4.purchase.bamnet.BamnetPurchasePlugin_MembersInjector;
import com.bamtech.sdk4.purchase.bamnet.DefaultBamnetPurchaseApi_Factory;
import com.bamtech.sdk4.session.AccessContextUpdaterModule;
import com.bamtech.sdk4.session.AccessContextUpdaterModule_AccessContextUpdaterFactory;
import com.bamtech.sdk4.session.AccessTokenProviderModule;
import com.bamtech.sdk4.session.AccessTokenProviderModule_AccessTokenProviderFactory;
import com.bamtech.shadow.dagger.p048a.C2110b;
import com.bamtech.shadow.dagger.p048a.C2112d;
import com.bamtech.shadow.dagger.p048a.C2113e;
import javax.inject.Provider;

public final class DaggerBamnetPurchaseComponent implements BamnetPurchaseComponent {
    private Provider<AccessContextUpdater> accessContextUpdaterProvider;
    private Provider<AccessTokenProvider> accessTokenProvider;
    private Provider<PurchaseClient> clientProvider;
    private Provider<ConfigurationProvider> configurationProvider;
    private Provider<ConverterProvider> converterProvider;
    private DefaultBamnetPurchaseApi_Factory defaultBamnetPurchaseApiProvider;
    private DefaultPurchaseClient_Factory defaultPurchaseClientProvider;
    private DefaultPurchaseExtension_Factory defaultPurchaseExtensionProvider;
    private DefaultPurchaseManager_Factory defaultPurchaseManagerProvider;
    private Provider<PurchaseManager> managerProvider;
    private Provider<PurchaseExtension> purchaseApiProvider;
    private Provider<PluginRegistry> registryProvider;
    private DefaultExtensionModule_RenewSessionTransformerFactory renewSessionTransformerProvider;
    private Provider<BamnetPurchaseApi> serviceProvider;
    private DefaultExtensionModule_ServiceTransactionFactory serviceTransactionProvider;

    private static final class Builder implements com.bamtech.sdk4.internal.purchase.bamnet.BamnetPurchaseComponent.Builder {
        /* access modifiers changed from: private */
        public AccessContextUpdaterModule accessContextUpdaterModule;
        /* access modifiers changed from: private */
        public AccessTokenProviderModule accessTokenProviderModule;
        /* access modifiers changed from: private */
        public DefaultExtensionModule defaultExtensionModule;
        /* access modifiers changed from: private */
        public PluginRegistry registry;

        private Builder() {
        }

        public BamnetPurchaseComponent build() {
            if (this.defaultExtensionModule == null) {
                this.defaultExtensionModule = new DefaultExtensionModule();
            }
            if (this.accessTokenProviderModule == null) {
                this.accessTokenProviderModule = new AccessTokenProviderModule();
            }
            if (this.accessContextUpdaterModule == null) {
                this.accessContextUpdaterModule = new AccessContextUpdaterModule();
            }
            if (this.registry != null) {
                return new DaggerBamnetPurchaseComponent(this);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(PluginRegistry.class.getCanonicalName());
            sb.append(" must be set");
            throw new IllegalStateException(sb.toString());
        }

        public Builder registry(PluginRegistry pluginRegistry) {
            C2113e.m8177a(pluginRegistry);
            this.registry = pluginRegistry;
            return this;
        }
    }

    public static com.bamtech.sdk4.internal.purchase.bamnet.BamnetPurchaseComponent.Builder builder() {
        return new Builder();
    }

    private void initialize(Builder builder) {
        this.registryProvider = C2112d.m8174a(builder.registry);
        this.serviceTransactionProvider = DefaultExtensionModule_ServiceTransactionFactory.create(builder.defaultExtensionModule, this.registryProvider);
        this.accessTokenProvider = C2110b.m8173b(AccessTokenProviderModule_AccessTokenProviderFactory.create(builder.accessTokenProviderModule, this.registryProvider));
        this.configurationProvider = C2110b.m8173b(DefaultExtensionModule_ConfigurationFactory.create(builder.defaultExtensionModule, this.registryProvider));
        this.converterProvider = C2110b.m8173b(DefaultExtensionModule_ConverterProviderFactory.create(builder.defaultExtensionModule, this.registryProvider));
        this.defaultPurchaseClientProvider = DefaultPurchaseClient_Factory.create(this.configurationProvider, this.converterProvider);
        this.clientProvider = C2110b.m8173b(this.defaultPurchaseClientProvider);
        this.accessContextUpdaterProvider = C2110b.m8173b(AccessContextUpdaterModule_AccessContextUpdaterFactory.create(builder.accessContextUpdaterModule, this.registryProvider));
        this.defaultPurchaseManagerProvider = DefaultPurchaseManager_Factory.create(this.accessTokenProvider, this.clientProvider, this.accessContextUpdaterProvider);
        this.managerProvider = C2110b.m8173b(this.defaultPurchaseManagerProvider);
        this.renewSessionTransformerProvider = DefaultExtensionModule_RenewSessionTransformerFactory.create(builder.defaultExtensionModule, this.registryProvider);
        this.defaultPurchaseExtensionProvider = DefaultPurchaseExtension_Factory.create(this.serviceTransactionProvider, this.managerProvider, this.renewSessionTransformerProvider);
        this.purchaseApiProvider = C2110b.m8173b(this.defaultPurchaseExtensionProvider);
        this.defaultBamnetPurchaseApiProvider = DefaultBamnetPurchaseApi_Factory.create(this.purchaseApiProvider);
        this.serviceProvider = C2110b.m8173b(this.defaultBamnetPurchaseApiProvider);
    }

    private BamnetPurchasePlugin injectBamnetPurchasePlugin(BamnetPurchasePlugin bamnetPurchasePlugin) {
        BamnetPurchasePlugin_MembersInjector.injectApi(bamnetPurchasePlugin, (BamnetPurchaseApi) this.serviceProvider.get());
        return bamnetPurchasePlugin;
    }

    public void inject(BamnetPurchasePlugin bamnetPurchasePlugin) {
        injectBamnetPurchasePlugin(bamnetPurchasePlugin);
    }

    private DaggerBamnetPurchaseComponent(Builder builder) {
        initialize(builder);
    }
}
