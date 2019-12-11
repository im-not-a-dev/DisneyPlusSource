package com.bamtech.sdk4.internal.identity.bam;

import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultIdentityClient_Factory implements C2111c<DefaultIdentityClient> {
    private final Provider<DefaultAuthenticationClient> authenticationClientProvider;
    private final Provider<DefaultPasswordClient> passwordClientProvider;
    private final Provider<DefaultRegistrationClient> registrationClientProvider;

    public DefaultIdentityClient_Factory(Provider<DefaultAuthenticationClient> provider, Provider<DefaultRegistrationClient> provider2, Provider<DefaultPasswordClient> provider3) {
        this.authenticationClientProvider = provider;
        this.registrationClientProvider = provider2;
        this.passwordClientProvider = provider3;
    }

    public static DefaultIdentityClient_Factory create(Provider<DefaultAuthenticationClient> provider, Provider<DefaultRegistrationClient> provider2, Provider<DefaultPasswordClient> provider3) {
        return new DefaultIdentityClient_Factory(provider, provider2, provider3);
    }

    public DefaultIdentityClient get() {
        return new DefaultIdentityClient((DefaultAuthenticationClient) this.authenticationClientProvider.get(), (DefaultRegistrationClient) this.registrationClientProvider.get(), (DefaultPasswordClient) this.passwordClientProvider.get());
    }
}
