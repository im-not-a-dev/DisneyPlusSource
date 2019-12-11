package com.bamtech.sdk4.internal.networking;

import com.bamtech.core.logging.LogDispatcher;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import java.security.KeyStore;
import javax.inject.Provider;
import javax.net.ssl.X509TrustManager;

public final class NetworkModule_TrustManagerFactory implements C2111c<X509TrustManager> {
    private final Provider<Boolean> disableNetworkSecurityProvider;
    private final Provider<KeyStore> keyStoreProvider;
    private final Provider<LogDispatcher> loggerProvider;
    private final NetworkModule module;

    public NetworkModule_TrustManagerFactory(NetworkModule networkModule, Provider<Boolean> provider, Provider<LogDispatcher> provider2, Provider<KeyStore> provider3) {
        this.module = networkModule;
        this.disableNetworkSecurityProvider = provider;
        this.loggerProvider = provider2;
        this.keyStoreProvider = provider3;
    }

    public static NetworkModule_TrustManagerFactory create(NetworkModule networkModule, Provider<Boolean> provider, Provider<LogDispatcher> provider2, Provider<KeyStore> provider3) {
        return new NetworkModule_TrustManagerFactory(networkModule, provider, provider2, provider3);
    }

    public X509TrustManager get() {
        X509TrustManager trustManager = this.module.trustManager(((Boolean) this.disableNetworkSecurityProvider.get()).booleanValue(), (LogDispatcher) this.loggerProvider.get(), (KeyStore) this.keyStoreProvider.get());
        C2113e.m8178a(trustManager, "Cannot return null from a non-@Nullable @Provides method");
        return trustManager;
    }
}
