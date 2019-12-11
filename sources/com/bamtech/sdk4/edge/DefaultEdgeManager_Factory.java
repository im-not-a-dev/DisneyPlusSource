package com.bamtech.sdk4.edge;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultEdgeManager_Factory implements C2111c<DefaultEdgeManager> {
    private final Provider<AccessTokenProvider> accessTokenProvider;
    private final Provider<EdgeClient> clientProvider;
    private final Provider<ServiceTransaction> transactionProvider;

    public DefaultEdgeManager_Factory(Provider<EdgeClient> provider, Provider<AccessTokenProvider> provider2, Provider<ServiceTransaction> provider3) {
        this.clientProvider = provider;
        this.accessTokenProvider = provider2;
        this.transactionProvider = provider3;
    }

    public static DefaultEdgeManager_Factory create(Provider<EdgeClient> provider, Provider<AccessTokenProvider> provider2, Provider<ServiceTransaction> provider3) {
        return new DefaultEdgeManager_Factory(provider, provider2, provider3);
    }

    public DefaultEdgeManager get() {
        return new DefaultEdgeManager((EdgeClient) this.clientProvider.get(), (AccessTokenProvider) this.accessTokenProvider.get(), this.transactionProvider);
    }
}
