package com.bamtech.sdk4.purchase;

import com.bamtech.sdk4.internal.purchase.PurchaseManager;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.session.RenewSessionTransformers;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultPurchaseExtension_Factory implements C2111c<DefaultPurchaseExtension> {
    private final Provider<PurchaseManager> managerProvider;
    private final Provider<RenewSessionTransformers> renewSessionTransformersProvider;
    private final Provider<ServiceTransaction> transactionProvider;

    public DefaultPurchaseExtension_Factory(Provider<ServiceTransaction> provider, Provider<PurchaseManager> provider2, Provider<RenewSessionTransformers> provider3) {
        this.transactionProvider = provider;
        this.managerProvider = provider2;
        this.renewSessionTransformersProvider = provider3;
    }

    public static DefaultPurchaseExtension_Factory create(Provider<ServiceTransaction> provider, Provider<PurchaseManager> provider2, Provider<RenewSessionTransformers> provider3) {
        return new DefaultPurchaseExtension_Factory(provider, provider2, provider3);
    }

    public DefaultPurchaseExtension get() {
        return new DefaultPurchaseExtension(this.transactionProvider, (PurchaseManager) this.managerProvider.get(), (RenewSessionTransformers) this.renewSessionTransformersProvider.get());
    }
}
