package com.bamtech.sdk4.internal.purchase;

import com.bamtech.sdk4.internal.token.AccessContextUpdater;
import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultPurchaseManager_Factory implements C2111c<DefaultPurchaseManager> {
    private final Provider<PurchaseClient> clientProvider;
    private final Provider<AccessTokenProvider> tokenProvider;
    private final Provider<AccessContextUpdater> updaterProvider;

    public DefaultPurchaseManager_Factory(Provider<AccessTokenProvider> provider, Provider<PurchaseClient> provider2, Provider<AccessContextUpdater> provider3) {
        this.tokenProvider = provider;
        this.clientProvider = provider2;
        this.updaterProvider = provider3;
    }

    public static DefaultPurchaseManager_Factory create(Provider<AccessTokenProvider> provider, Provider<PurchaseClient> provider2, Provider<AccessContextUpdater> provider3) {
        return new DefaultPurchaseManager_Factory(provider, provider2, provider3);
    }

    public DefaultPurchaseManager get() {
        return new DefaultPurchaseManager((AccessTokenProvider) this.tokenProvider.get(), (PurchaseClient) this.clientProvider.get(), (AccessContextUpdater) this.updaterProvider.get());
    }
}
