package com.bamtech.sdk4.internal.session;

import com.bamtech.sdk4.account.legacy.LegacyContextExtension;
import com.bamtech.sdk4.internal.configuration.BootstrapConfiguration;
import com.bamtech.sdk4.internal.core.Storage;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultInternalSessionStateProvider_Factory implements C2111c<DefaultInternalSessionStateProvider> {
    private final Provider<BootstrapConfiguration> bootstrapConfigurationProvider;
    private final Provider<LegacyContextExtension> legacyContextExtensionProvider;
    private final Provider<Storage> storageProvider;
    private final Provider<ServiceTransaction> transactionProvider;

    public DefaultInternalSessionStateProvider_Factory(Provider<ServiceTransaction> provider, Provider<Storage> provider2, Provider<BootstrapConfiguration> provider3, Provider<LegacyContextExtension> provider4) {
        this.transactionProvider = provider;
        this.storageProvider = provider2;
        this.bootstrapConfigurationProvider = provider3;
        this.legacyContextExtensionProvider = provider4;
    }

    public static DefaultInternalSessionStateProvider_Factory create(Provider<ServiceTransaction> provider, Provider<Storage> provider2, Provider<BootstrapConfiguration> provider3, Provider<LegacyContextExtension> provider4) {
        return new DefaultInternalSessionStateProvider_Factory(provider, provider2, provider3, provider4);
    }

    public DefaultInternalSessionStateProvider get() {
        return new DefaultInternalSessionStateProvider(this.transactionProvider, (Storage) this.storageProvider.get(), (BootstrapConfiguration) this.bootstrapConfigurationProvider.get(), this.legacyContextExtensionProvider);
    }
}
