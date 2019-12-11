package com.bamtech.sdk4.internal.paywall;

import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.networking.ConverterProvider;
import com.bamtech.sdk4.internal.plugin.DefaultExtensionModule;
import com.bamtech.sdk4.internal.plugin.DefaultExtensionModule_ConfigurationFactory;
import com.bamtech.sdk4.internal.plugin.DefaultExtensionModule_ConverterProviderFactory;
import com.bamtech.sdk4.internal.plugin.DefaultExtensionModule_ServiceTransactionFactory;
import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import com.bamtech.sdk4.paywall.DefaultPaywallApi_Factory;
import com.bamtech.sdk4.paywall.PaywallApi;
import com.bamtech.sdk4.paywall.PaywallPlugin;
import com.bamtech.sdk4.paywall.PaywallPlugin_MembersInjector;
import com.bamtech.sdk4.plugin.PluginRegistry;
import com.bamtech.sdk4.session.AccessTokenProviderModule;
import com.bamtech.sdk4.session.AccessTokenProviderModule_AccessTokenProviderFactory;
import com.bamtech.shadow.dagger.p048a.C2110b;
import com.bamtech.shadow.dagger.p048a.C2112d;
import com.bamtech.shadow.dagger.p048a.C2113e;
import javax.inject.Provider;

public final class DaggerPaywallPluginComponent implements PaywallPluginComponent {
    private Provider<AccessTokenProvider> accessTokenProvider;
    private Provider<PaywallClient> clientProvider;
    private Provider<ConfigurationProvider> configurationProvider;
    private Provider<ConverterProvider> converterProvider;
    private DefaultPaywallApi_Factory defaultPaywallApiProvider;
    private DefaultPaywallClient_Factory defaultPaywallClientProvider;
    private Provider<DefaultPaywallManager> defaultPaywallManagerProvider;
    private Provider<PluginRegistry> registryProvider;
    private Provider<PaywallApi> serviceProvider;
    private DefaultExtensionModule_ServiceTransactionFactory serviceTransactionProvider;

    private static final class Builder implements com.bamtech.sdk4.internal.paywall.PaywallPluginComponent.Builder {
        /* access modifiers changed from: private */
        public AccessTokenProviderModule accessTokenProviderModule;
        /* access modifiers changed from: private */
        public DefaultExtensionModule defaultExtensionModule;
        /* access modifiers changed from: private */
        public PluginRegistry registry;

        private Builder() {
        }

        public PaywallPluginComponent build() {
            if (this.defaultExtensionModule == null) {
                this.defaultExtensionModule = new DefaultExtensionModule();
            }
            if (this.accessTokenProviderModule == null) {
                this.accessTokenProviderModule = new AccessTokenProviderModule();
            }
            if (this.registry != null) {
                return new DaggerPaywallPluginComponent(this);
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

    public static com.bamtech.sdk4.internal.paywall.PaywallPluginComponent.Builder builder() {
        return new Builder();
    }

    private void initialize(Builder builder) {
        this.registryProvider = C2112d.m8174a(builder.registry);
        this.serviceTransactionProvider = DefaultExtensionModule_ServiceTransactionFactory.create(builder.defaultExtensionModule, this.registryProvider);
        this.configurationProvider = C2110b.m8173b(DefaultExtensionModule_ConfigurationFactory.create(builder.defaultExtensionModule, this.registryProvider));
        this.converterProvider = C2110b.m8173b(DefaultExtensionModule_ConverterProviderFactory.create(builder.defaultExtensionModule, this.registryProvider));
        this.defaultPaywallClientProvider = DefaultPaywallClient_Factory.create(this.configurationProvider, this.converterProvider);
        this.clientProvider = C2110b.m8173b(this.defaultPaywallClientProvider);
        this.accessTokenProvider = C2110b.m8173b(AccessTokenProviderModule_AccessTokenProviderFactory.create(builder.accessTokenProviderModule, this.registryProvider));
        this.defaultPaywallManagerProvider = C2110b.m8173b(DefaultPaywallManager_Factory.create(this.clientProvider, this.accessTokenProvider));
        this.defaultPaywallApiProvider = DefaultPaywallApi_Factory.create(this.serviceTransactionProvider, this.defaultPaywallManagerProvider);
        this.serviceProvider = C2110b.m8173b(this.defaultPaywallApiProvider);
    }

    private PaywallPlugin injectPaywallPlugin(PaywallPlugin paywallPlugin) {
        PaywallPlugin_MembersInjector.injectApi(paywallPlugin, (PaywallApi) this.serviceProvider.get());
        return paywallPlugin;
    }

    public void inject(PaywallPlugin paywallPlugin) {
        injectPaywallPlugin(paywallPlugin);
    }

    private DaggerPaywallPluginComponent(Builder builder) {
        initialize(builder);
    }
}
