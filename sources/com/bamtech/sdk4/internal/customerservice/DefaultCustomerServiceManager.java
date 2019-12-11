package com.bamtech.sdk4.internal.customerservice;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import javax.inject.Provider;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/customerservice/DefaultCustomerServiceManager;", "Lcom/bamtech/sdk4/internal/customerservice/CustomerServiceManager;", "transactionProvider", "Ljavax/inject/Provider;", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "tokenProvider", "Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;", "client", "Lcom/bamtech/sdk4/internal/customerservice/CustomerServiceClient;", "(Ljavax/inject/Provider;Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;Lcom/bamtech/sdk4/internal/customerservice/CustomerServiceClient;)V", "createSupportCode", "Lio/reactivex/Single;", "", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: CustomerServiceManager.kt */
public final class DefaultCustomerServiceManager implements CustomerServiceManager {
    public DefaultCustomerServiceManager(Provider<ServiceTransaction> provider, AccessTokenProvider accessTokenProvider, CustomerServiceClient customerServiceClient) {
    }
}
