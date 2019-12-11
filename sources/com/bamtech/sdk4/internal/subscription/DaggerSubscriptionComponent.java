package com.bamtech.sdk4.internal.subscription;

import com.bamtech.core.networking.converters.Converter;
import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.plugin.DefaultExtensionModule;
import com.bamtech.sdk4.internal.plugin.DefaultExtensionModule_ConfigurationFactory;
import com.bamtech.sdk4.internal.plugin.DefaultExtensionModule_RenewSessionTransformerFactory;
import com.bamtech.sdk4.internal.plugin.DefaultExtensionModule_ServiceTransactionFactory;
import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import com.bamtech.sdk4.plugin.PluginRegistry;
import com.bamtech.sdk4.session.AccessTokenProviderModule;
import com.bamtech.sdk4.session.AccessTokenProviderModule_AccessTokenProviderFactory;
import com.bamtech.sdk4.subscription.DefaultSubscriptionApi_Factory;
import com.bamtech.sdk4.subscription.DefaultSubscriptionExtension_Factory;
import com.bamtech.sdk4.subscription.SubscriptionApi;
import com.bamtech.sdk4.subscription.SubscriptionExtension;
import com.bamtech.sdk4.subscription.SubscriptionPlugin;
import com.bamtech.sdk4.subscription.SubscriptionPlugin_MembersInjector;
import com.bamtech.shadow.dagger.p048a.C2110b;
import com.bamtech.shadow.dagger.p048a.C2112d;
import com.bamtech.shadow.dagger.p048a.C2113e;
import com.bamtech.shadow.gson.GsonBuilder;
import javax.inject.Provider;

public final class DaggerSubscriptionComponent implements SubscriptionComponent {
    private Provider<AccessTokenProvider> accessTokenProvider;
    private Provider<SubscriptionClient> clientProvider;
    private Provider<ConfigurationProvider> configurationProvider;
    private DefaultSubscriptionApi_Factory defaultSubscriptionApiProvider;
    private DefaultSubscriptionClient_Factory defaultSubscriptionClientProvider;
    private DefaultSubscriptionExtension_Factory defaultSubscriptionExtensionProvider;
    private DefaultSubscriptionManager_Factory defaultSubscriptionManagerProvider;
    private Provider<DeviceSubscriptionManager> deviceSubscriptionManagerProvider;
    private Provider<GsonBuilder> gsonBuilderProvider;
    private Provider<Converter> identityConverterProvider;
    private Provider<SubscriptionManager> managerProvider;
    private Provider<PluginRegistry> registryProvider;
    private DefaultExtensionModule_RenewSessionTransformerFactory renewSessionTransformerProvider;
    private Provider<SubscriptionApi> serviceProvider;
    private DefaultExtensionModule_ServiceTransactionFactory serviceTransactionProvider;
    private Provider<SubscriptionExtension> subscriptionApiProvider;

    private static final class Builder implements com.bamtech.sdk4.internal.subscription.SubscriptionComponent.Builder {
        /* access modifiers changed from: private */
        public AccessTokenProviderModule accessTokenProviderModule;
        /* access modifiers changed from: private */
        public DefaultExtensionModule defaultExtensionModule;
        /* access modifiers changed from: private */
        public PluginRegistry registry;
        /* access modifiers changed from: private */
        public SubscriptionConverterModule subscriptionConverterModule;

        private Builder() {
        }

        public SubscriptionComponent build() {
            if (this.defaultExtensionModule == null) {
                this.defaultExtensionModule = new DefaultExtensionModule();
            }
            if (this.accessTokenProviderModule == null) {
                this.accessTokenProviderModule = new AccessTokenProviderModule();
            }
            if (this.subscriptionConverterModule == null) {
                this.subscriptionConverterModule = new SubscriptionConverterModule();
            }
            if (this.registry != null) {
                return new DaggerSubscriptionComponent(this);
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

    public static com.bamtech.sdk4.internal.subscription.SubscriptionComponent.Builder builder() {
        return new Builder();
    }

    private void initialize(Builder builder) {
        this.registryProvider = C2112d.m8174a(builder.registry);
        this.serviceTransactionProvider = DefaultExtensionModule_ServiceTransactionFactory.create(builder.defaultExtensionModule, this.registryProvider);
        this.accessTokenProvider = C2110b.m8173b(AccessTokenProviderModule_AccessTokenProviderFactory.create(builder.accessTokenProviderModule, this.registryProvider));
        this.configurationProvider = C2110b.m8173b(DefaultExtensionModule_ConfigurationFactory.create(builder.defaultExtensionModule, this.registryProvider));
        this.gsonBuilderProvider = C2110b.m8173b(SubscriptionConverterModule_GsonBuilderFactory.create(builder.subscriptionConverterModule));
        this.identityConverterProvider = C2110b.m8173b(SubscriptionConverterModule_IdentityConverterFactory.create(builder.subscriptionConverterModule, this.gsonBuilderProvider));
        this.defaultSubscriptionClientProvider = DefaultSubscriptionClient_Factory.create(this.configurationProvider, this.identityConverterProvider);
        this.clientProvider = C2110b.m8173b(this.defaultSubscriptionClientProvider);
        this.defaultSubscriptionManagerProvider = DefaultSubscriptionManager_Factory.create(this.accessTokenProvider, this.clientProvider);
        this.managerProvider = C2110b.m8173b(this.defaultSubscriptionManagerProvider);
        this.deviceSubscriptionManagerProvider = C2110b.m8173b(this.defaultSubscriptionManagerProvider);
        this.renewSessionTransformerProvider = DefaultExtensionModule_RenewSessionTransformerFactory.create(builder.defaultExtensionModule, this.registryProvider);
        this.defaultSubscriptionExtensionProvider = DefaultSubscriptionExtension_Factory.create(this.serviceTransactionProvider, this.managerProvider, this.deviceSubscriptionManagerProvider, this.renewSessionTransformerProvider);
        this.subscriptionApiProvider = C2110b.m8173b(this.defaultSubscriptionExtensionProvider);
        this.defaultSubscriptionApiProvider = DefaultSubscriptionApi_Factory.create(this.subscriptionApiProvider);
        this.serviceProvider = C2110b.m8173b(this.defaultSubscriptionApiProvider);
    }

    private SubscriptionPlugin injectSubscriptionPlugin(SubscriptionPlugin subscriptionPlugin) {
        SubscriptionPlugin_MembersInjector.injectApi(subscriptionPlugin, (SubscriptionApi) this.serviceProvider.get());
        return subscriptionPlugin;
    }

    public void inject(SubscriptionPlugin subscriptionPlugin) {
        injectSubscriptionPlugin(subscriptionPlugin);
    }

    private DaggerSubscriptionComponent(Builder builder) {
        initialize(builder);
    }
}
