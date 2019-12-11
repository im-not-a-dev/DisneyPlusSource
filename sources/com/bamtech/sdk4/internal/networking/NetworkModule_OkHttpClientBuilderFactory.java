package com.bamtech.sdk4.internal.networking;

import com.bamtech.sdk4.internal.networking.cookies.PersistentCookieJar;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import com.google.common.base.Optional;
import java.net.Proxy;
import javax.inject.Provider;
import javax.net.ssl.X509TrustManager;
import okhttp3.Cache;
import okhttp3.OkHttpClient.Builder;
import okhttp3.logging.HttpLoggingInterceptor.Level;

public final class NetworkModule_OkHttpClientBuilderFactory implements C2111c<Builder> {
    private final Provider<Cache> cacheProvider;
    private final Provider<PersistentCookieJar> cookieJarProvider;
    private final Provider<Optional<Level>> levelProvider;
    private final NetworkModule module;
    private final Provider<Proxy> proxyProvider;
    private final Provider<X509TrustManager> trustManagerProvider;
    private final Provider<Optional<String>> userAgentProvider;

    public NetworkModule_OkHttpClientBuilderFactory(NetworkModule networkModule, Provider<Optional<Level>> provider, Provider<Cache> provider2, Provider<Optional<String>> provider3, Provider<X509TrustManager> provider4, Provider<Proxy> provider5, Provider<PersistentCookieJar> provider6) {
        this.module = networkModule;
        this.levelProvider = provider;
        this.cacheProvider = provider2;
        this.userAgentProvider = provider3;
        this.trustManagerProvider = provider4;
        this.proxyProvider = provider5;
        this.cookieJarProvider = provider6;
    }

    public static NetworkModule_OkHttpClientBuilderFactory create(NetworkModule networkModule, Provider<Optional<Level>> provider, Provider<Cache> provider2, Provider<Optional<String>> provider3, Provider<X509TrustManager> provider4, Provider<Proxy> provider5, Provider<PersistentCookieJar> provider6) {
        NetworkModule_OkHttpClientBuilderFactory networkModule_OkHttpClientBuilderFactory = new NetworkModule_OkHttpClientBuilderFactory(networkModule, provider, provider2, provider3, provider4, provider5, provider6);
        return networkModule_OkHttpClientBuilderFactory;
    }

    public Builder get() {
        Builder okHttpClientBuilder = this.module.okHttpClientBuilder((Optional) this.levelProvider.get(), (Cache) this.cacheProvider.get(), (Optional) this.userAgentProvider.get(), (X509TrustManager) this.trustManagerProvider.get(), (Proxy) this.proxyProvider.get(), (PersistentCookieJar) this.cookieJarProvider.get());
        C2113e.m8178a(okHttpClientBuilder, "Cannot return null from a non-@Nullable @Provides method");
        return okHttpClientBuilder;
    }
}
