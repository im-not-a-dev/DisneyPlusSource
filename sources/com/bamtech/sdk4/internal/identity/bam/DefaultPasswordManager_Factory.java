package com.bamtech.sdk4.internal.identity.bam;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultPasswordManager_Factory implements C2111c<DefaultPasswordManager> {
    private final Provider<AccessTokenProvider> accessTokenProvider;
    private final Provider<IdentityClient> clientProvider;
    private final Provider<CommonIdentityTokenManager> commonIdentityTokenManagerProvider;
    private final Provider<ServiceTransaction> transactionProvider;

    public DefaultPasswordManager_Factory(Provider<ServiceTransaction> provider, Provider<IdentityClient> provider2, Provider<AccessTokenProvider> provider3, Provider<CommonIdentityTokenManager> provider4) {
        this.transactionProvider = provider;
        this.clientProvider = provider2;
        this.accessTokenProvider = provider3;
        this.commonIdentityTokenManagerProvider = provider4;
    }

    public static DefaultPasswordManager_Factory create(Provider<ServiceTransaction> provider, Provider<IdentityClient> provider2, Provider<AccessTokenProvider> provider3, Provider<CommonIdentityTokenManager> provider4) {
        return new DefaultPasswordManager_Factory(provider, provider2, provider3, provider4);
    }

    public DefaultPasswordManager get() {
        return new DefaultPasswordManager(this.transactionProvider, (IdentityClient) this.clientProvider.get(), (AccessTokenProvider) this.accessTokenProvider.get(), (CommonIdentityTokenManager) this.commonIdentityTokenManagerProvider.get());
    }
}
