package com.bamtech.sdk4.internal.content;

import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import com.bamtech.sdk4.session.RenewSessionTransformers;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultContentExtension_Factory implements C2111c<DefaultContentExtension> {
    private final Provider<ContentClient> clientProvider;
    private final Provider<RenewSessionTransformers> sessionTransformersProvider;
    private final Provider<AccessTokenProvider> tokenProvider;

    public DefaultContentExtension_Factory(Provider<AccessTokenProvider> provider, Provider<ContentClient> provider2, Provider<RenewSessionTransformers> provider3) {
        this.tokenProvider = provider;
        this.clientProvider = provider2;
        this.sessionTransformersProvider = provider3;
    }

    public static DefaultContentExtension_Factory create(Provider<AccessTokenProvider> provider, Provider<ContentClient> provider2, Provider<RenewSessionTransformers> provider3) {
        return new DefaultContentExtension_Factory(provider, provider2, provider3);
    }

    public DefaultContentExtension get() {
        return new DefaultContentExtension((AccessTokenProvider) this.tokenProvider.get(), (ContentClient) this.clientProvider.get(), (RenewSessionTransformers) this.sessionTransformersProvider.get());
    }
}
