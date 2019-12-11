package com.bamtech.sdk4.subscription;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.subscription.DeviceSubscriptionManager;
import com.bamtech.sdk4.internal.subscription.SubscriptionManager;
import com.bamtech.sdk4.session.RenewSessionTransformers;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultSubscriptionExtension_Factory implements C2111c<DefaultSubscriptionExtension> {
    private final Provider<DeviceSubscriptionManager> deviceSubscriptionManagerProvider;
    private final Provider<SubscriptionManager> managerProvider;
    private final Provider<RenewSessionTransformers> renewSessionTransformersProvider;
    private final Provider<ServiceTransaction> transactionProvider;

    public DefaultSubscriptionExtension_Factory(Provider<ServiceTransaction> provider, Provider<SubscriptionManager> provider2, Provider<DeviceSubscriptionManager> provider3, Provider<RenewSessionTransformers> provider4) {
        this.transactionProvider = provider;
        this.managerProvider = provider2;
        this.deviceSubscriptionManagerProvider = provider3;
        this.renewSessionTransformersProvider = provider4;
    }

    public static DefaultSubscriptionExtension_Factory create(Provider<ServiceTransaction> provider, Provider<SubscriptionManager> provider2, Provider<DeviceSubscriptionManager> provider3, Provider<RenewSessionTransformers> provider4) {
        return new DefaultSubscriptionExtension_Factory(provider, provider2, provider3, provider4);
    }

    public DefaultSubscriptionExtension get() {
        return new DefaultSubscriptionExtension(this.transactionProvider, (SubscriptionManager) this.managerProvider.get(), (DeviceSubscriptionManager) this.deviceSubscriptionManagerProvider.get(), (RenewSessionTransformers) this.renewSessionTransformersProvider.get());
    }
}
