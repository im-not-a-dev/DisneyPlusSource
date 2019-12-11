package com.bamtech.sdk4.internal.configuration;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import javax.inject.Provider;
import kotlin.Metadata;
import okhttp3.OkHttpClient.Builder;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B3\b\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nR\u0014\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/configuration/DefaultNetworkConfigurationProvider;", "Lcom/bamtech/sdk4/internal/configuration/NetworkConfigurationProvider;", "userAgent", "", "okHttpClientBuilder", "Lokhttp3/OkHttpClient$Builder;", "mediaOkHttpBuilder", "transactionProvider", "Ljavax/inject/Provider;", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "(Ljava/lang/String;Lokhttp3/OkHttpClient$Builder;Lokhttp3/OkHttpClient$Builder;Ljavax/inject/Provider;)V", "getMediaOkHttpBuilder", "()Lokhttp3/OkHttpClient$Builder;", "getOkHttpClientBuilder", "getTransactionProvider", "()Ljavax/inject/Provider;", "getUserAgent", "()Ljava/lang/String;", "sdk-configuration"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: NetworkConfigurationProvider.kt */
public final class DefaultNetworkConfigurationProvider implements NetworkConfigurationProvider {
    private final Builder mediaOkHttpBuilder;
    private final Builder okHttpClientBuilder;
    private final Provider<ServiceTransaction> transactionProvider;
    private final String userAgent;

    public DefaultNetworkConfigurationProvider(String str, Builder builder, Builder builder2, Provider<ServiceTransaction> provider) {
        this.userAgent = str;
        this.okHttpClientBuilder = builder;
        this.mediaOkHttpBuilder = builder2;
        this.transactionProvider = provider;
    }

    public Builder getMediaOkHttpBuilder() {
        return this.mediaOkHttpBuilder;
    }

    public Builder getOkHttpClientBuilder() {
        return this.okHttpClientBuilder;
    }

    public Provider<ServiceTransaction> getTransactionProvider() {
        return this.transactionProvider;
    }

    public String getUserAgent() {
        return this.userAgent;
    }
}
