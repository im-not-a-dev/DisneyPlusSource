package com.bamtech.sdk4.internal.identity.bam;

import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultIdentityManager_Factory implements C2111c<DefaultIdentityManager> {
    private final Provider<DefaultAuthenticationManager> authenticationManagerProvider;
    private final Provider<DefaultBaseIdentityManager> baseIdentityManagerProvider;
    private final Provider<DefaultPasswordManager> passwordManagerProvider;

    public DefaultIdentityManager_Factory(Provider<DefaultAuthenticationManager> provider, Provider<DefaultPasswordManager> provider2, Provider<DefaultBaseIdentityManager> provider3) {
        this.authenticationManagerProvider = provider;
        this.passwordManagerProvider = provider2;
        this.baseIdentityManagerProvider = provider3;
    }

    public static DefaultIdentityManager_Factory create(Provider<DefaultAuthenticationManager> provider, Provider<DefaultPasswordManager> provider2, Provider<DefaultBaseIdentityManager> provider3) {
        return new DefaultIdentityManager_Factory(provider, provider2, provider3);
    }

    public DefaultIdentityManager get() {
        return new DefaultIdentityManager((DefaultAuthenticationManager) this.authenticationManagerProvider.get(), (DefaultPasswordManager) this.passwordManagerProvider.get(), (DefaultBaseIdentityManager) this.baseIdentityManagerProvider.get());
    }
}
