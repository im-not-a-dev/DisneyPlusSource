package com.bamtech.sdk4.internal.networking;

import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient.Builder;

public final class NetworkModule_OkHttpClientFactory implements C2111c<OkHttpClient> {
    private final Provider<Builder> builderProvider;
    private final NetworkModule module;

    public NetworkModule_OkHttpClientFactory(NetworkModule networkModule, Provider<Builder> provider) {
        this.module = networkModule;
        this.builderProvider = provider;
    }

    public static NetworkModule_OkHttpClientFactory create(NetworkModule networkModule, Provider<Builder> provider) {
        return new NetworkModule_OkHttpClientFactory(networkModule, provider);
    }

    public OkHttpClient get() {
        OkHttpClient okHttpClient = this.module.okHttpClient((Builder) this.builderProvider.get());
        C2113e.m8178a(okHttpClient, "Cannot return null from a non-@Nullable @Provides method");
        return okHttpClient;
    }
}
