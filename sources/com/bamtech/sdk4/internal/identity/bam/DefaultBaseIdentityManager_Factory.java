package com.bamtech.sdk4.internal.identity.bam;

import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultBaseIdentityManager_Factory implements C2111c<DefaultBaseIdentityManager> {
    private final Provider<BaseIdentityClient> clientProvider;
    private final Provider<CommonIdentityTokenManager> commonIdentityTokenManagerProvider;

    public DefaultBaseIdentityManager_Factory(Provider<BaseIdentityClient> provider, Provider<CommonIdentityTokenManager> provider2) {
        this.clientProvider = provider;
        this.commonIdentityTokenManagerProvider = provider2;
    }

    public static DefaultBaseIdentityManager_Factory create(Provider<BaseIdentityClient> provider, Provider<CommonIdentityTokenManager> provider2) {
        return new DefaultBaseIdentityManager_Factory(provider, provider2);
    }

    public DefaultBaseIdentityManager get() {
        return new DefaultBaseIdentityManager((BaseIdentityClient) this.clientProvider.get(), (CommonIdentityTokenManager) this.commonIdentityTokenManagerProvider.get());
    }
}
