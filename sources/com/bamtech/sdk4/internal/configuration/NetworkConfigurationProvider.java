package com.bamtech.sdk4.internal.configuration;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import javax.inject.Provider;
import kotlin.Metadata;
import okhttp3.OkHttpClient.Builder;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/configuration/NetworkConfigurationProvider;", "", "mediaOkHttpBuilder", "Lokhttp3/OkHttpClient$Builder;", "getMediaOkHttpBuilder", "()Lokhttp3/OkHttpClient$Builder;", "okHttpClientBuilder", "getOkHttpClientBuilder", "transactionProvider", "Ljavax/inject/Provider;", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "getTransactionProvider", "()Ljavax/inject/Provider;", "userAgent", "", "getUserAgent", "()Ljava/lang/String;", "sdk-configuration"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: NetworkConfigurationProvider.kt */
public interface NetworkConfigurationProvider {
    Builder getMediaOkHttpBuilder();

    Builder getOkHttpClientBuilder();

    Provider<ServiceTransaction> getTransactionProvider();

    String getUserAgent();
}
