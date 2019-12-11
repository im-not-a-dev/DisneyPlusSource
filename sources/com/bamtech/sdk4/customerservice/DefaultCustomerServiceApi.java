package com.bamtech.sdk4.customerservice;

import com.bamtech.sdk4.internal.customerservice.CustomerServiceManager;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import javax.inject.Provider;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo31007d2 = {"Lcom/bamtech/sdk4/customerservice/DefaultCustomerServiceApi;", "Lcom/bamtech/sdk4/customerservice/CustomerServiceApi;", "transactionProvider", "Ljavax/inject/Provider;", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "manager", "Lcom/bamtech/sdk4/internal/customerservice/CustomerServiceManager;", "(Ljavax/inject/Provider;Lcom/bamtech/sdk4/internal/customerservice/CustomerServiceManager;)V", "createSupportCode", "Lio/reactivex/Single;", "", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: CustomerServiceApi.kt */
public final class DefaultCustomerServiceApi implements CustomerServiceApi {
    public DefaultCustomerServiceApi(Provider<ServiceTransaction> provider, CustomerServiceManager customerServiceManager) {
    }
}
