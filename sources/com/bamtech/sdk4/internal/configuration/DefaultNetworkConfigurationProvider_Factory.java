package com.bamtech.sdk4.internal.configuration;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;
import okhttp3.OkHttpClient.Builder;

public final class DefaultNetworkConfigurationProvider_Factory implements C2111c<DefaultNetworkConfigurationProvider> {
    private final Provider<Builder> mediaOkHttpBuilderProvider;
    private final Provider<Builder> okHttpClientBuilderProvider;
    private final Provider<ServiceTransaction> transactionProvider;
    private final Provider<String> userAgentProvider;

    public DefaultNetworkConfigurationProvider_Factory(Provider<String> provider, Provider<Builder> provider2, Provider<Builder> provider3, Provider<ServiceTransaction> provider4) {
        this.userAgentProvider = provider;
        this.okHttpClientBuilderProvider = provider2;
        this.mediaOkHttpBuilderProvider = provider3;
        this.transactionProvider = provider4;
    }

    public static DefaultNetworkConfigurationProvider_Factory create(Provider<String> provider, Provider<Builder> provider2, Provider<Builder> provider3, Provider<ServiceTransaction> provider4) {
        return new DefaultNetworkConfigurationProvider_Factory(provider, provider2, provider3, provider4);
    }

    public DefaultNetworkConfigurationProvider get() {
        return new DefaultNetworkConfigurationProvider((String) this.userAgentProvider.get(), (Builder) this.okHttpClientBuilderProvider.get(), (Builder) this.mediaOkHttpBuilderProvider.get(), this.transactionProvider);
    }
}
