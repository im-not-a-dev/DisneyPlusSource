package com.bamtech.sdk4.customerservice;

import com.bamtech.sdk4.internal.customerservice.CustomerServiceManager;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultCustomerServiceApi_Factory implements C2111c<DefaultCustomerServiceApi> {
    private final Provider<CustomerServiceManager> managerProvider;
    private final Provider<ServiceTransaction> transactionProvider;

    public DefaultCustomerServiceApi_Factory(Provider<ServiceTransaction> provider, Provider<CustomerServiceManager> provider2) {
        this.transactionProvider = provider;
        this.managerProvider = provider2;
    }

    public static DefaultCustomerServiceApi_Factory create(Provider<ServiceTransaction> provider, Provider<CustomerServiceManager> provider2) {
        return new DefaultCustomerServiceApi_Factory(provider, provider2);
    }

    public DefaultCustomerServiceApi get() {
        return new DefaultCustomerServiceApi(this.transactionProvider, (CustomerServiceManager) this.managerProvider.get());
    }
}
