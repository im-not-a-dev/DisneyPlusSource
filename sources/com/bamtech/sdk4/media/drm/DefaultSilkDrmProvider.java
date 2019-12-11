package com.bamtech.sdk4.media.drm;

import com.bamtech.sdk4.internal.configuration.NetworkConfigurationProvider;
import com.bamtech.sdk4.internal.media.SilkDrmClient;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.telemetry.dust.DustExtensionsKt;
import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import java.util.UUID;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient.Builder;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001)B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ2\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010\u00152\u0006\u0010\"\u001a\u00020#H\u0016J2\u0010$\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010\u00152\u0006\u0010\"\u001a\u00020#H\u0016J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001d0'2\u0006\u0010(\u001a\u00020\u0015H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\nX\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\nX\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u00020\u0015X\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006*"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/drm/DefaultSilkDrmProvider;", "Lcom/bamtech/sdk4/media/drm/SilkDrmProvider;", "Lcom/bamtech/sdk4/internal/configuration/NetworkConfigurationProvider;", "provider", "client", "Lcom/bamtech/sdk4/internal/media/SilkDrmClient;", "accessTokenProvider", "Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;", "(Lcom/bamtech/sdk4/internal/configuration/NetworkConfigurationProvider;Lcom/bamtech/sdk4/internal/media/SilkDrmClient;Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;)V", "mediaOkHttpBuilder", "Lokhttp3/OkHttpClient$Builder;", "getMediaOkHttpBuilder", "()Lokhttp3/OkHttpClient$Builder;", "okHttpClientBuilder", "getOkHttpClientBuilder", "transactionProvider", "Ljavax/inject/Provider;", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "getTransactionProvider", "()Ljavax/inject/Provider;", "userAgent", "", "getUserAgent", "()Ljava/lang/String;", "uuid", "Ljava/util/UUID;", "getUuid", "()Ljava/util/UUID;", "executeKeyRequest", "", "transaction", "licenseUrl", "data", "playbackSessionId", "isOffline", "", "executeProvisionRequest", "url", "getKey", "Lio/reactivex/Single;", "uri", "Companion", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DefaultSilkDrmProvider.kt */
public final class DefaultSilkDrmProvider implements SilkDrmProvider, NetworkConfigurationProvider {
    private final /* synthetic */ NetworkConfigurationProvider $$delegate_0;
    private final AccessTokenProvider accessTokenProvider;
    /* access modifiers changed from: private */
    public final SilkDrmClient client;
    private final UUID uuid;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/drm/DefaultSilkDrmProvider$Companion;", "", "()V", "GET_ENCRYPTION_KEY", "", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: DefaultSilkDrmProvider.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new Companion(null);
    }

    public DefaultSilkDrmProvider(NetworkConfigurationProvider networkConfigurationProvider, SilkDrmClient silkDrmClient, AccessTokenProvider accessTokenProvider2) {
        this.$$delegate_0 = networkConfigurationProvider;
        this.client = silkDrmClient;
        this.accessTokenProvider = accessTokenProvider2;
    }

    public byte[] executeKeyRequest(ServiceTransaction serviceTransaction, String str, byte[] bArr, String str2, boolean z) {
        Object c = getKey(str).mo30224c();
        Intrinsics.checkReturnedValueIsNotNull(c, "getKey(licenseUrl).blockingGet()");
        return (byte[]) c;
    }

    public byte[] executeProvisionRequest(ServiceTransaction serviceTransaction, String str, byte[] bArr, String str2, boolean z) {
        return new byte[0];
    }

    public Single<byte[]> getKey(String str) {
        ServiceTransaction serviceTransaction = (ServiceTransaction) getTransactionProvider().get();
        AccessTokenProvider accessTokenProvider2 = this.accessTokenProvider;
        Intrinsics.checkReturnedValueIsNotNull((Object) serviceTransaction, "transaction");
        Single a = accessTokenProvider2.getAccessToken(serviceTransaction).mo30233g(DefaultSilkDrmProvider$getKey$1.INSTANCE).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new DefaultSilkDrmProvider$getKey$2<Object,Object>(this, serviceTransaction, str));
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "accessTokenProvider.getA…p, uri)\n                }");
        return DustExtensionsKt.withDust$default(a, serviceTransaction, "urn:bamtech:dust:bamsdk:api:media:encryptionKeyProvider:getEncryptionKey", (Object) null, 4, (Object) null);
    }

    public Builder getMediaOkHttpBuilder() {
        return this.$$delegate_0.getMediaOkHttpBuilder();
    }

    public Builder getOkHttpClientBuilder() {
        return this.$$delegate_0.getOkHttpClientBuilder();
    }

    public Provider<ServiceTransaction> getTransactionProvider() {
        return this.$$delegate_0.getTransactionProvider();
    }

    public String getUserAgent() {
        return this.$$delegate_0.getUserAgent();
    }

    public UUID getUuid() {
        return this.uuid;
    }
}
