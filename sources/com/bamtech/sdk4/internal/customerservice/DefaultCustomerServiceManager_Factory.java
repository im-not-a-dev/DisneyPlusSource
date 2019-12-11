package com.bamtech.sdk4.internal.customerservice;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultCustomerServiceManager_Factory implements C2111c<DefaultCustomerServiceManager> {
    private final Provider<CustomerServiceClient> clientProvider;
    private final Provider<AccessTokenProvider> tokenProvider;
    private final Provider<ServiceTransaction> transactionProvider;

    public DefaultCustomerServiceManager_Factory(Provider<ServiceTransaction> provider, Provider<AccessTokenProvider> provider2, Provider<CustomerServiceClient> provider3) {
        this.transactionProvider = provider;
        this.tokenProvider = provider2;
        this.clientProvider = provider3;
    }

    public static DefaultCustomerServiceManager_Factory create(Provider<ServiceTransaction> provider, Provider<AccessTokenProvider> provider2, Provider<CustomerServiceClient> provider3) {
        return new DefaultCustomerServiceManager_Factory(provider, provider2, provider3);
    }

    public DefaultCustomerServiceManager get() {
        return new DefaultCustomerServiceManager(this.transactionProvider, (AccessTokenProvider) this.tokenProvider.get(), (CustomerServiceClient) this.clientProvider.get());
    }
}
