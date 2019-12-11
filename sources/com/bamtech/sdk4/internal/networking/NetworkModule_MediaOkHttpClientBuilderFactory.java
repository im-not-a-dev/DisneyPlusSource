package com.bamtech.sdk4.internal.networking;

import com.bamtech.sdk4.internal.networking.cookies.PersistentCookieJar;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import com.google.common.base.Optional;
import java.net.Proxy;
import javax.inject.Provider;
import javax.net.ssl.X509TrustManager;
import okhttp3.OkHttpClient.Builder;

public final class NetworkModule_MediaOkHttpClientBuilderFactory implements C2111c<Builder> {
    private final Provider<PersistentCookieJar> cookieJarProvider;
    private final NetworkModule module;
    private final Provider<Proxy> proxyProvider;
    private final Provider<X509TrustManager> trustManagerProvider;
    private final Provider<Optional<String>> userAgentProvider;

    public NetworkModule_MediaOkHttpClientBuilderFactory(NetworkModule networkModule, Provider<Optional<String>> provider, Provider<X509TrustManager> provider2, Provider<Proxy> provider3, Provider<PersistentCookieJar> provider4) {
        this.module = networkModule;
        this.userAgentProvider = provider;
        this.trustManagerProvider = provider2;
        this.proxyProvider = provider3;
        this.cookieJarProvider = provider4;
    }

    public static NetworkModule_MediaOkHttpClientBuilderFactory create(NetworkModule networkModule, Provider<Optional<String>> provider, Provider<X509TrustManager> provider2, Provider<Proxy> provider3, Provider<PersistentCookieJar> provider4) {
        NetworkModule_MediaOkHttpClientBuilderFactory networkModule_MediaOkHttpClientBuilderFactory = new NetworkModule_MediaOkHttpClientBuilderFactory(networkModule, provider, provider2, provider3, provider4);
        return networkModule_MediaOkHttpClientBuilderFactory;
    }

    public Builder get() {
        Builder mediaOkHttpClientBuilder = this.module.mediaOkHttpClientBuilder((Optional) this.userAgentProvider.get(), (X509TrustManager) this.trustManagerProvider.get(), (Proxy) this.proxyProvider.get(), (PersistentCookieJar) this.cookieJarProvider.get());
        C2113e.m8178a(mediaOkHttpClientBuilder, "Cannot return null from a non-@Nullable @Provides method");
        return mediaOkHttpClientBuilder;
    }
}
