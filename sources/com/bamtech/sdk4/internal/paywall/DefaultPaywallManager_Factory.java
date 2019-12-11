package com.bamtech.sdk4.internal.paywall;

import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultPaywallManager_Factory implements C2111c<DefaultPaywallManager> {
    private final Provider<AccessTokenProvider> accessTokenProvider;
    private final Provider<PaywallClient> paywallClientProvider;

    public DefaultPaywallManager_Factory(Provider<PaywallClient> provider, Provider<AccessTokenProvider> provider2) {
        this.paywallClientProvider = provider;
        this.accessTokenProvider = provider2;
    }

    public static DefaultPaywallManager_Factory create(Provider<PaywallClient> provider, Provider<AccessTokenProvider> provider2) {
        return new DefaultPaywallManager_Factory(provider, provider2);
    }

    public DefaultPaywallManager get() {
        return new DefaultPaywallManager((PaywallClient) this.paywallClientProvider.get(), (AccessTokenProvider) this.accessTokenProvider.get());
    }
}
