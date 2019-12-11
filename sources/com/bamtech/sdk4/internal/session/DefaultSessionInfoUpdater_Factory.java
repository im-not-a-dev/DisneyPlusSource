package com.bamtech.sdk4.internal.session;

import com.bamtech.sdk4.session.SessionInfoStorage;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultSessionInfoUpdater_Factory implements C2111c<DefaultSessionInfoUpdater> {
    private final Provider<SessionClient> sessionClientProvider;
    private final Provider<SessionInfoStorage> sessionStorageProvider;

    public DefaultSessionInfoUpdater_Factory(Provider<SessionClient> provider, Provider<SessionInfoStorage> provider2) {
        this.sessionClientProvider = provider;
        this.sessionStorageProvider = provider2;
    }

    public static DefaultSessionInfoUpdater_Factory create(Provider<SessionClient> provider, Provider<SessionInfoStorage> provider2) {
        return new DefaultSessionInfoUpdater_Factory(provider, provider2);
    }

    public DefaultSessionInfoUpdater get() {
        return new DefaultSessionInfoUpdater((SessionClient) this.sessionClientProvider.get(), (SessionInfoStorage) this.sessionStorageProvider.get());
    }
}
