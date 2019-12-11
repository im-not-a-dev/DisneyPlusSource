package com.bamtech.sdk4.internal.subscription;

import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultSubscriptionManager_Factory implements C2111c<DefaultSubscriptionManager> {
    private final Provider<SubscriptionClient> clientProvider;
    private final Provider<AccessTokenProvider> tokenProvider;

    public DefaultSubscriptionManager_Factory(Provider<AccessTokenProvider> provider, Provider<SubscriptionClient> provider2) {
        this.tokenProvider = provider;
        this.clientProvider = provider2;
    }

    public static DefaultSubscriptionManager_Factory create(Provider<AccessTokenProvider> provider, Provider<SubscriptionClient> provider2) {
        return new DefaultSubscriptionManager_Factory(provider, provider2);
    }

    public DefaultSubscriptionManager get() {
        return new DefaultSubscriptionManager((AccessTokenProvider) this.tokenProvider.get(), (SubscriptionClient) this.clientProvider.get());
    }
}
