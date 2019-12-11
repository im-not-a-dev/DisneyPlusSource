package com.bamtech.sdk4.internal.service;

import com.bamtech.sdk4.internal.configuration.BootstrapConfiguration;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import javax.inject.Provider;

public final class ServiceTransactionModule_TransactionFactory implements C2111c<ServiceTransaction> {
    private final Provider<BootstrapConfiguration> bootstrapConfigurationProvider;
    private final Provider<DebugServiceTransaction> debugProvider;
    private final Provider<DefaultServiceTransaction> p1_772401952Provider;

    public ServiceTransactionModule_TransactionFactory(Provider<BootstrapConfiguration> provider, Provider<DefaultServiceTransaction> provider2, Provider<DebugServiceTransaction> provider3) {
        this.bootstrapConfigurationProvider = provider;
        this.p1_772401952Provider = provider2;
        this.debugProvider = provider3;
    }

    public static ServiceTransactionModule_TransactionFactory create(Provider<BootstrapConfiguration> provider, Provider<DefaultServiceTransaction> provider2, Provider<DebugServiceTransaction> provider3) {
        return new ServiceTransactionModule_TransactionFactory(provider, provider2, provider3);
    }

    public ServiceTransaction get() {
        ServiceTransaction transaction = ServiceTransactionModule.transaction((BootstrapConfiguration) this.bootstrapConfigurationProvider.get(), this.p1_772401952Provider, this.debugProvider);
        C2113e.m8178a(transaction, "Cannot return null from a non-@Nullable @Provides method");
        return transaction;
    }
}
