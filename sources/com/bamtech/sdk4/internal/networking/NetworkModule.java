package com.bamtech.sdk4.internal.networking;

import com.bamtech.core.logging.LogDispatcher;
import com.bamtech.core.logging.LogDispatcher.DefaultImpls;
import com.bamtech.core.networking.converters.C1685b;
import com.bamtech.core.networking.converters.C1686c;
import com.bamtech.core.networking.converters.Converter;
import com.bamtech.core.networking.p038f.C1692a;
import com.bamtech.core.networking.p039g.C1693a;
import com.bamtech.core.networking.p039g.C1695b;
import com.bamtech.core.networking.p039g.C1696c;
import com.bamtech.sdk4.internal.networking.cookies.PersistentCookieJar;
import com.google.common.base.Optional;
import java.net.Proxy;
import java.security.KeyStore;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import okhttp3.C14247n;
import okhttp3.Cache;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient.Builder;
import okhttp3.logging.HttpLoggingInterceptor;
import okhttp3.logging.HttpLoggingInterceptor.Level;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J8\u0010\u0003\u001a\u00020\u00042\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u0007J\u0012\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u0004H\u0007JT\u0010\u0011\u001a\u00020\u00042\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u0007J\b\u0010\u0016\u001a\u00020\u0017H\u0007J\b\u0010\u0018\u001a\u00020\u0017H\u0007J(\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0007J\u001a\u0010\u001f\u001a\u00020 *\u00020\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0006H\u0002¨\u0006!"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/networking/NetworkModule;", "", "()V", "mediaOkHttpClientBuilder", "Lokhttp3/OkHttpClient$Builder;", "userAgent", "Lcom/google/common/base/Optional;", "", "trustManager", "Ljavax/net/ssl/X509TrustManager;", "proxy", "Ljava/net/Proxy;", "cookieJar", "Lcom/bamtech/sdk4/internal/networking/cookies/PersistentCookieJar;", "okHttpClient", "Lokhttp3/OkHttpClient;", "builder", "okHttpClientBuilder", "level", "Lokhttp3/logging/HttpLoggingInterceptor$Level;", "cache", "Lokhttp3/Cache;", "rawBytesConverter", "Lcom/bamtech/core/networking/converters/Converter;", "stringConverter", "disableNetworkSecurity", "", "logger", "Lcom/bamtech/core/logging/LogDispatcher;", "keyStore", "Ljava/security/KeyStore;", "addLoggingInterceptor", "", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: NetworkModule.kt */
public final class NetworkModule {
    private final void addLoggingInterceptor(Builder builder, Optional<Level> optional) {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.mo36191a((Level) optional.mo27105a(Level.NONE));
        builder.mo35818a((Interceptor) httpLoggingInterceptor);
        builder.mo35818a((Interceptor) NetworkModule$addLoggingInterceptor$1.INSTANCE);
    }

    public final Builder mediaOkHttpClientBuilder(Optional<String> optional, X509TrustManager x509TrustManager, Proxy proxy, PersistentCookieJar persistentCookieJar) {
        Builder builder = new Builder();
        String str = (String) optional.mo27107c();
        if (str != null) {
            C12880j.m40222a((Object) str, "it");
            builder.mo35818a((Interceptor) new C1692a(str));
        }
        if (proxy != null) {
            builder.mo35814a(proxy);
        }
        C1696c.m7805a(builder, x509TrustManager);
        if (persistentCookieJar != null) {
            builder.mo35819a((C14247n) persistentCookieJar);
        }
        return builder;
    }

    public final OkHttpClient okHttpClient(Builder builder) {
        OkHttpClient a = builder.mo35820a();
        C12880j.m40222a((Object) a, "builder.build()");
        return a;
    }

    public final Builder okHttpClientBuilder(Optional<Level> optional, Cache cache, Optional<String> optional2, X509TrustManager x509TrustManager, Proxy proxy, PersistentCookieJar persistentCookieJar) {
        Builder builder = new Builder();
        addLoggingInterceptor(builder, optional);
        if (cache != null) {
            builder.mo35817a(cache);
        }
        String str = (String) optional2.mo27107c();
        if (str != null) {
            C12880j.m40222a((Object) str, "it");
            builder.mo35818a((Interceptor) new C1692a(str));
        }
        if (proxy != null) {
            builder.mo35814a(proxy);
        }
        C1696c.m7805a(builder, x509TrustManager);
        if (persistentCookieJar != null) {
            builder.mo35819a((C14247n) persistentCookieJar);
        }
        return builder;
    }

    public final Converter rawBytesConverter() {
        return new C1685b();
    }

    public final Converter stringConverter() {
        return new C1686c(null, 1, null);
    }

    public final X509TrustManager trustManager(boolean z, LogDispatcher logDispatcher, KeyStore keyStore) {
        if (z) {
            DefaultImpls.d$default(logDispatcher, "OkHttpSocketFactory", "Disabling Network Security for Charles", false, 4, null);
            return new C1695b(logDispatcher);
        } else if (keyStore != null) {
            DefaultImpls.d$default(logDispatcher, "OkHttpSocketFactory", "Using Custom Keystore for Charles", false, 4, null);
            return C1693a.f5885b.mo7509a(keyStore);
        } else {
            DefaultImpls.d$default(logDispatcher, "OkHttpSocketFactory", "Using Default TrustManager", false, 4, null);
            return C1696c.m7804a(logDispatcher);
        }
    }
}
