package com.bamtech.sdk4.internal.media.drm;

import com.bamtech.core.networking.C1679a;
import com.bamtech.core.networking.Link;
import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.configuration.DrmServiceConfigurationKt;
import com.bamtech.sdk4.internal.configuration.NetworkConfigurationProvider;
import com.bamtech.sdk4.internal.configuration.TelemetryServiceConfiguration;
import com.bamtech.sdk4.internal.networking.ConverterProvider;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.telemetry.EventBuffer;
import com.bamtech.sdk4.internal.telemetry.dust.Dust$Events;
import com.bamtech.sdk4.internal.telemetry.dust.DustClientConstants;
import com.bamtech.sdk4.internal.telemetry.dust.DustExtensionsKt;
import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import com.bamtech.sdk4.media.QOSNetworkHelper;
import com.bamtech.sdk4.media.drm.PlayReadyDrmProvider;
import java.util.UUID;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C12880j;
import okhttp3.OkHttpClient.Builder;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p524d0.C11920c;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J2\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020'2\b\u0010+\u001a\u0004\u0018\u00010\u001f2\u0006\u0010,\u001a\u00020-H\u0016J2\u0010.\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020'2\b\u0010+\u001a\u0004\u0018\u00010\u001f2\u0006\u0010,\u001a\u00020-H\u0016J,\u00100\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020402012\u0006\u0010(\u001a\u00020\u001b2\b\u0010/\u001a\u0004\u0018\u00010\u001fH\u0002J:\u00105\u001a\b\u0012\u0004\u0012\u00020'012\u0006\u0010(\u001a\u00020\u001b2\b\u0010)\u001a\u0004\u0018\u00010\u001f2\u0006\u00106\u001a\u00020'2\b\u0010+\u001a\u0004\u0018\u00010\u001f2\u0006\u0010,\u001a\u00020-H\u0016J8\u00107\u001a\b\u0012\u0004\u0012\u00020'012\u0006\u0010(\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020\u001f2\u0006\u00106\u001a\u00020'2\b\u0010+\u001a\u0004\u0018\u00010\u001f2\u0006\u0010,\u001a\u00020-H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00020\u0012X\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0012\u0010\u0015\u001a\u00020\u0012X\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0012\u0010\u001e\u001a\u00020\u001fX\u0005¢\u0006\u0006\u001a\u0004\b \u0010!R\u0016\u0010\"\u001a\u0004\u0018\u00010#X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u00068"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/drm/DefaultPlayReadyDrmProvider;", "Lcom/bamtech/sdk4/media/drm/PlayReadyDrmProvider;", "Lcom/bamtech/sdk4/internal/configuration/NetworkConfigurationProvider;", "provider", "configurationProvider", "Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;", "converters", "Lcom/bamtech/sdk4/internal/networking/ConverterProvider;", "accessTokenProvider", "Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;", "eventBuffer", "Lcom/bamtech/sdk4/internal/telemetry/EventBuffer;", "dustConstants", "Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants;", "qosNetworkHelper", "Lcom/bamtech/sdk4/media/QOSNetworkHelper;", "(Lcom/bamtech/sdk4/internal/configuration/NetworkConfigurationProvider;Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;Lcom/bamtech/sdk4/internal/networking/ConverterProvider;Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;Lcom/bamtech/sdk4/internal/telemetry/EventBuffer;Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants;Lcom/bamtech/sdk4/media/QOSNetworkHelper;)V", "mediaOkHttpBuilder", "Lokhttp3/OkHttpClient$Builder;", "getMediaOkHttpBuilder", "()Lokhttp3/OkHttpClient$Builder;", "okHttpClientBuilder", "getOkHttpClientBuilder", "getQosNetworkHelper", "()Lcom/bamtech/sdk4/media/QOSNetworkHelper;", "transactionProvider", "Ljavax/inject/Provider;", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "getTransactionProvider", "()Ljavax/inject/Provider;", "userAgent", "", "getUserAgent", "()Ljava/lang/String;", "uuid", "Ljava/util/UUID;", "getUuid", "()Ljava/util/UUID;", "executeKeyRequest", "", "transaction", "licenseUrl", "data", "playbackSessionId", "isOffline", "", "executeProvisionRequest", "url", "getLicenseLink", "Lio/reactivex/Single;", "Lkotlin/Pair;", "Lcom/bamtech/core/networking/Link;", "Lcom/bamtech/sdk4/internal/configuration/TelemetryServiceConfiguration;", "getPlayReadyLicense", "requestData", "provisionPlayReady", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DefaultPlayReadyDrmProvider.kt */
public final class DefaultPlayReadyDrmProvider implements PlayReadyDrmProvider, NetworkConfigurationProvider {
    private final /* synthetic */ NetworkConfigurationProvider $$delegate_0;
    /* access modifiers changed from: private */
    public final AccessTokenProvider accessTokenProvider;
    private final ConfigurationProvider configurationProvider;
    /* access modifiers changed from: private */
    public final ConverterProvider converters;
    /* access modifiers changed from: private */
    public final DustClientConstants dustConstants;
    /* access modifiers changed from: private */
    public final EventBuffer eventBuffer;
    private final QOSNetworkHelper qosNetworkHelper;
    private final UUID uuid = UUID.fromString("9a04f079-9840-4286-ab92-e65be0885f95");

    public DefaultPlayReadyDrmProvider(NetworkConfigurationProvider networkConfigurationProvider, ConfigurationProvider configurationProvider2, ConverterProvider converterProvider, AccessTokenProvider accessTokenProvider2, EventBuffer eventBuffer2, DustClientConstants dustClientConstants, QOSNetworkHelper qOSNetworkHelper) {
        this.$$delegate_0 = networkConfigurationProvider;
        this.configurationProvider = configurationProvider2;
        this.converters = converterProvider;
        this.accessTokenProvider = accessTokenProvider2;
        this.eventBuffer = eventBuffer2;
        this.dustConstants = dustClientConstants;
        this.qosNetworkHelper = qOSNetworkHelper;
    }

    private final Single<Pair<Link, TelemetryServiceConfiguration>> getLicenseLink(ServiceTransaction serviceTransaction, String str) {
        Single single;
        if (!(str == null || C12832w.m40118a(str))) {
            single = this.configurationProvider.getServiceConfiguration(serviceTransaction, DefaultPlayReadyDrmProvider$getLicenseLink$1.INSTANCE).mo30233g(new DefaultPlayReadyDrmProvider$getLicenseLink$2(str));
            C12880j.m40222a((Object) single, "configurationProvider.ge…metryConfig\n            }");
        } else {
            single = this.configurationProvider.getServiceLink(serviceTransaction, DefaultPlayReadyDrmProvider$getLicenseLink$3.INSTANCE).mo30233g(new DefaultPlayReadyDrmProvider$getLicenseLink$4(this, serviceTransaction));
            C12880j.m40222a((Object) single, "configurationProvider.ge…lemetry\n                }");
        }
        return DustExtensionsKt.withDust$default(single, serviceTransaction, DrmServiceConfigurationKt.getPLAY_READY_GET_LICENSE_URL(Dust$Events.INSTANCE), (Object) null, 4, (Object) null);
    }

    public byte[] executeKeyRequest(ServiceTransaction serviceTransaction, String str, byte[] bArr, String str2, boolean z) {
        Object c = getPlayReadyLicense(serviceTransaction, str, bArr, str2, z).mo30224c();
        C12880j.m40222a(c, "getPlayReadyLicense(tran… isOffline).blockingGet()");
        return (byte[]) c;
    }

    public byte[] executeProvisionRequest(ServiceTransaction serviceTransaction, String str, byte[] bArr, String str2, boolean z) {
        Object c = provisionPlayReady(serviceTransaction, str, bArr, str2, z).mo30224c();
        C12880j.m40222a(c, "provisionPlayReady(trans… isOffline).blockingGet()");
        return (byte[]) c;
    }

    public Builder getMediaOkHttpBuilder() {
        return this.$$delegate_0.getMediaOkHttpBuilder();
    }

    public Builder getOkHttpClientBuilder() {
        return this.$$delegate_0.getOkHttpClientBuilder();
    }

    public Single<byte[]> getPlayReadyLicense(ServiceTransaction serviceTransaction, String str, byte[] bArr, String str2, boolean z) {
        Single licenseLink = getLicenseLink(serviceTransaction, str);
        DefaultPlayReadyDrmProvider$getPlayReadyLicense$1 defaultPlayReadyDrmProvider$getPlayReadyLicense$1 = new DefaultPlayReadyDrmProvider$getPlayReadyLicense$1(this, str2, serviceTransaction, z, bArr);
        Single<byte[]> a = licenseLink.mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) defaultPlayReadyDrmProvider$getPlayReadyLicense$1);
        C12880j.m40222a((Object) a, "getLicenseLink(transacti…ICENSE)\n                }");
        return a;
    }

    public final QOSNetworkHelper getQosNetworkHelper() {
        return this.qosNetworkHelper;
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

    public Single<byte[]> provisionPlayReady(ServiceTransaction serviceTransaction, String str, byte[] bArr, String str2, boolean z) {
        Single b = Single.m38399b(C1679a.m7776a(new DefaultPlayReadyDrmProvider$provisionPlayReady$1(str)));
        C12880j.m40222a((Object) b, "Single.just(link {\n     …d(Method.POST)\n        })");
        Single a = C11920c.m38475a(b, this.configurationProvider.getServiceConfiguration(serviceTransaction, DefaultPlayReadyDrmProvider$provisionPlayReady$2.INSTANCE));
        DefaultPlayReadyDrmProvider$provisionPlayReady$3 defaultPlayReadyDrmProvider$provisionPlayReady$3 = new DefaultPlayReadyDrmProvider$provisionPlayReady$3(this, str2, serviceTransaction, z, bArr);
        Single<byte[]> a2 = a.mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) defaultPlayReadyDrmProvider$provisionPlayReady$3);
        C12880j.m40222a((Object) a2, "Single.just(link {\n     …VISION)\n                }");
        return a2;
    }
}
