package com.bamtech.sdk4.internal.session;

import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultSessionInfoExtension_Factory implements C2111c<DefaultSessionInfoExtension> {
    private final Provider<SessionInfoUpdater> sessionInfoUpdaterProvider;
    private final Provider<AccessTokenProvider> tokenProvider;

    public DefaultSessionInfoExtension_Factory(Provider<AccessTokenProvider> provider, Provider<SessionInfoUpdater> provider2) {
        this.tokenProvider = provider;
        this.sessionInfoUpdaterProvider = provider2;
    }

    public static DefaultSessionInfoExtension_Factory create(Provider<AccessTokenProvider> provider, Provider<SessionInfoUpdater> provider2) {
        return new DefaultSessionInfoExtension_Factory(provider, provider2);
    }

    public DefaultSessionInfoExtension get() {
        return new DefaultSessionInfoExtension((AccessTokenProvider) this.tokenProvider.get(), (SessionInfoUpdater) this.sessionInfoUpdaterProvider.get());
    }
}
