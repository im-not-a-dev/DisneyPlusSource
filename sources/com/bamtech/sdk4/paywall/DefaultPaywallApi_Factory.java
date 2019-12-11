package com.bamtech.sdk4.paywall;

import com.bamtech.sdk4.internal.paywall.PaywallManager;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultPaywallApi_Factory implements C2111c<DefaultPaywallApi> {
    private final Provider<PaywallManager> paywallManagerProvider;
    private final Provider<ServiceTransaction> transactionProvider;

    public DefaultPaywallApi_Factory(Provider<ServiceTransaction> provider, Provider<PaywallManager> provider2) {
        this.transactionProvider = provider;
        this.paywallManagerProvider = provider2;
    }

    public static DefaultPaywallApi_Factory create(Provider<ServiceTransaction> provider, Provider<PaywallManager> provider2) {
        return new DefaultPaywallApi_Factory(provider, provider2);
    }

    public DefaultPaywallApi get() {
        return new DefaultPaywallApi(this.transactionProvider, (PaywallManager) this.paywallManagerProvider.get());
    }
}
