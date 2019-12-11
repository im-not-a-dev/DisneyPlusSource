package com.bamtech.sdk4.internal.configuration;

import com.bamtech.sdk4.internal.core.Storage;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultConfigurationManager_Factory implements C2111c<DefaultConfigurationManager> {
    private final Provider<BootstrapConfiguration> bootstrapConfigurationProvider;
    private final Provider<ConfigurationClient> configurationClientProvider;
    private final Provider<EmbeddedConfiguration> embeddedConfigurationProvider;
    private final Provider<Storage> storageProvider;

    public DefaultConfigurationManager_Factory(Provider<BootstrapConfiguration> provider, Provider<ConfigurationClient> provider2, Provider<EmbeddedConfiguration> provider3, Provider<Storage> provider4) {
        this.bootstrapConfigurationProvider = provider;
        this.configurationClientProvider = provider2;
        this.embeddedConfigurationProvider = provider3;
        this.storageProvider = provider4;
    }

    public static DefaultConfigurationManager_Factory create(Provider<BootstrapConfiguration> provider, Provider<ConfigurationClient> provider2, Provider<EmbeddedConfiguration> provider3, Provider<Storage> provider4) {
        return new DefaultConfigurationManager_Factory(provider, provider2, provider3, provider4);
    }

    public DefaultConfigurationManager get() {
        return new DefaultConfigurationManager((BootstrapConfiguration) this.bootstrapConfigurationProvider.get(), (ConfigurationClient) this.configurationClientProvider.get(), (EmbeddedConfiguration) this.embeddedConfigurationProvider.get(), (Storage) this.storageProvider.get());
    }
}
