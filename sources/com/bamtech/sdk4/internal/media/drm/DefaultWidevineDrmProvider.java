package com.bamtech.sdk4.internal.media.drm;

import com.bamtech.core.networking.Link;
import com.bamtech.sdk4.configuration.DeviceType;
import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.configuration.DrmServiceConfigurationKt;
import com.bamtech.sdk4.internal.configuration.NetworkConfigurationProvider;
import com.bamtech.sdk4.internal.configuration.Services;
import com.bamtech.sdk4.internal.configuration.TelemetryServiceConfiguration;
import com.bamtech.sdk4.internal.networking.ConverterProvider;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.telemetry.EventBuffer;
import com.bamtech.sdk4.internal.telemetry.dust.Dust$Events;
import com.bamtech.sdk4.internal.telemetry.dust.DustClientConstants;
import com.bamtech.sdk4.internal.telemetry.dust.DustExtensionsKt;
import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import com.bamtech.sdk4.media.QOSNetworkHelper;
import com.bamtech.sdk4.media.drm.WidevineDrmProvider;
import java.util.UUID;
import java.util.concurrent.Callable;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient.Builder;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J@\u0010/\u001a\b\u0012\u0004\u0012\u000201002\u0006\u00102\u001a\u00020$2\u0018\u00103\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020504002\u0006\u00106\u001a\u0002012\u0006\u00107\u001a\u00020(H\u0007J2\u00108\u001a\u0002012\u0006\u00102\u001a\u00020$2\u0006\u00109\u001a\u00020(2\u0006\u0010:\u001a\u0002012\b\u0010;\u001a\u0004\u0018\u00010(2\u0006\u0010<\u001a\u00020=H\u0016J2\u0010>\u001a\u0002012\u0006\u00102\u001a\u00020$2\u0006\u0010?\u001a\u00020(2\u0006\u0010:\u001a\u0002012\b\u0010;\u001a\u0004\u0018\u00010(2\u0006\u0010<\u001a\u00020=H\u0016J:\u0010@\u001a\b\u0012\u0004\u0012\u000201002\u0006\u00102\u001a\u00020$2\b\u0010A\u001a\u0004\u0018\u00010(2\u0006\u00106\u001a\u0002012\b\u0010;\u001a\u0004\u0018\u00010(2\u0006\u0010<\u001a\u00020=H\u0016J:\u0010B\u001a\b\u0012\u0004\u0012\u000201002\u0006\u00102\u001a\u00020$2\b\u00109\u001a\u0004\u0018\u00010(2\u0006\u00106\u001a\u0002012\b\u0010;\u001a\u0004\u0018\u00010(2\u0006\u0010<\u001a\u00020=H\u0016J1\u0010C\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020504002\u0006\u00102\u001a\u00020$2\b\u0010?\u001a\u0004\u0018\u00010(H\u0010¢\u0006\u0002\bDJ0\u0010E\u001a\b\u0012\u0004\u0012\u000201002\u0006\u00102\u001a\u00020$2\u0006\u00106\u001a\u0002012\b\u0010;\u001a\u0004\u0018\u00010(2\u0006\u0010<\u001a\u00020=H\u0016J\"\u0010F\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020504002\u0006\u00102\u001a\u00020$H\u0002J\"\u0010G\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020504002\u0006\u00102\u001a\u00020$H\u0002J6\u0010H\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020504002\u0006\u00102\u001a\u00020$2\b\u0010A\u001a\u0004\u0018\u00010(2\u0006\u00106\u001a\u000201H\u0002J\b\u0010I\u001a\u00020=H\u0002J&\u0010J\u001a\b\u0012\u0004\u0012\u000201002\u0006\u00102\u001a\u00020$2\u0006\u00106\u001a\u0002012\u0006\u0010K\u001a\u00020=H\u0016J5\u0010L\u001a\b\u0012\u0004\u0012\u000201002\u0006\u00102\u001a\u00020$2\u0006\u00106\u001a\u0002012\u0017\u0010M\u001a\u0013\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a¢\u0006\u0002\b\u001dJ0\u0010N\u001a\b\u0012\u0004\u0012\u000201002\u0006\u00102\u001a\u00020$2\u0006\u00106\u001a\u0002012\b\u0010;\u001a\u0004\u0018\u00010(2\u0006\u0010<\u001a\u00020=H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u00020\u0014X\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0012\u0010\u0017\u001a\u00020\u0014X\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a¢\u0006\u0002\b\u001d¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\"\u0010 \u001a\u0013\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a¢\u0006\u0002\b\u001d¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0018\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#X\u0005¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0012\u0010'\u001a\u00020(X\u0005¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0016\u0010+\u001a\u0004\u0018\u00010,X\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.¨\u0006O"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/drm/DefaultWidevineDrmProvider;", "Lcom/bamtech/sdk4/media/drm/WidevineDrmProvider;", "Lcom/bamtech/sdk4/internal/configuration/NetworkConfigurationProvider;", "provider", "configurationProvider", "Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;", "converters", "Lcom/bamtech/sdk4/internal/networking/ConverterProvider;", "accessTokenProvider", "Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;", "eventBuffer", "Lcom/bamtech/sdk4/internal/telemetry/EventBuffer;", "dustConstants", "Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants;", "qosNetworkHelper", "Lcom/bamtech/sdk4/media/QOSNetworkHelper;", "(Lcom/bamtech/sdk4/internal/configuration/NetworkConfigurationProvider;Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;Lcom/bamtech/sdk4/internal/networking/ConverterProvider;Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;Lcom/bamtech/sdk4/internal/telemetry/EventBuffer;Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants;Lcom/bamtech/sdk4/media/QOSNetworkHelper;)V", "getConfigurationProvider$extension_media_release", "()Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;", "mediaOkHttpBuilder", "Lokhttp3/OkHttpClient$Builder;", "getMediaOkHttpBuilder", "()Lokhttp3/OkHttpClient$Builder;", "okHttpClientBuilder", "getOkHttpClientBuilder", "releasePermanently", "Lkotlin/Function1;", "Lcom/bamtech/sdk4/internal/configuration/Services;", "Lcom/bamtech/core/networking/Link;", "Lkotlin/ExtensionFunctionType;", "getReleasePermanently", "()Lkotlin/jvm/functions/Function1;", "releaseTemporary", "getReleaseTemporary", "transactionProvider", "Ljavax/inject/Provider;", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "getTransactionProvider", "()Ljavax/inject/Provider;", "userAgent", "", "getUserAgent", "()Ljava/lang/String;", "uuid", "Ljava/util/UUID;", "getUuid", "()Ljava/util/UUID;", "downloadNewOfflineLicense", "Lio/reactivex/Single;", "", "transaction", "licenseLink", "Lkotlin/Pair;", "Lcom/bamtech/sdk4/internal/configuration/TelemetryServiceConfiguration;", "requestData", "dust", "executeKeyRequest", "licenseUrl", "data", "playbackSessionId", "isOffline", "", "executeProvisionRequest", "url", "getWidevineCertificate", "provisioningUrl", "getWidevineLicense", "getWidevineLicenseLink", "getWidevineLicenseLink$extension_media_release", "getWidevineOfflineLicense", "getWidevineOfflineLicenseLink", "getWidevineOfflineLicenseRenewLink", "getWidevineProvisioningLink", "isTv", "releaseWidevineOfflineLicense", "permanently", "releaseWidevineOfflineLicenseInternal", "linkFunc", "renewWidevineOfflineLicense", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DefaultWidevineDrmProvider.kt */
public class DefaultWidevineDrmProvider implements WidevineDrmProvider, NetworkConfigurationProvider {
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
    /* access modifiers changed from: private */
    public final QOSNetworkHelper qosNetworkHelper;
    private final Function1<Services, Link> releasePermanently = DefaultWidevineDrmProvider$releasePermanently$1.INSTANCE;
    private final Function1<Services, Link> releaseTemporary = DefaultWidevineDrmProvider$releaseTemporary$1.INSTANCE;
    private final UUID uuid = UUID.fromString("edef8ba9-79d6-4ace-a3c8-27dcd51d21ed");

    public DefaultWidevineDrmProvider(NetworkConfigurationProvider networkConfigurationProvider, ConfigurationProvider configurationProvider2, ConverterProvider converterProvider, AccessTokenProvider accessTokenProvider2, EventBuffer eventBuffer2, DustClientConstants dustClientConstants, QOSNetworkHelper qOSNetworkHelper) {
        this.$$delegate_0 = networkConfigurationProvider;
        this.configurationProvider = configurationProvider2;
        this.converters = converterProvider;
        this.accessTokenProvider = accessTokenProvider2;
        this.eventBuffer = eventBuffer2;
        this.dustConstants = dustClientConstants;
        this.qosNetworkHelper = qOSNetworkHelper;
    }

    private final Single<Pair<Link, TelemetryServiceConfiguration>> getWidevineOfflineLicenseLink(ServiceTransaction serviceTransaction) {
        Single g = this.configurationProvider.getServiceLink(serviceTransaction, DefaultWidevineDrmProvider$getWidevineOfflineLicenseLink$1.INSTANCE).mo30233g(new DefaultWidevineDrmProvider$getWidevineOfflineLicenseLink$2(this, serviceTransaction));
        Intrinsics.checkReturnedValueIsNotNull((Object) g, "configurationProvider.ge…lemetry\n                }");
        return DustExtensionsKt.withDust$default(g, serviceTransaction, DrmServiceConfigurationKt.getWIDEVINE_GET_OFFLINE_LICENSE_URL(Dust$Events.INSTANCE), (Object) null, 4, (Object) null);
    }

    private final Single<Pair<Link, TelemetryServiceConfiguration>> getWidevineOfflineLicenseRenewLink(ServiceTransaction serviceTransaction) {
        Single g = this.configurationProvider.getServiceLink(serviceTransaction, DefaultWidevineDrmProvider$getWidevineOfflineLicenseRenewLink$1.INSTANCE).mo30233g(new DefaultWidevineDrmProvider$getWidevineOfflineLicenseRenewLink$2(this, serviceTransaction));
        Intrinsics.checkReturnedValueIsNotNull((Object) g, "configurationProvider.ge…lemetry\n                }");
        return DustExtensionsKt.withDust$default(g, serviceTransaction, DrmServiceConfigurationKt.getWIDEVINE_RENEW_OFFLINE_LICENSE_URL(Dust$Events.INSTANCE), (Object) null, 4, (Object) null);
    }

    private final Single<? extends Pair<Link, TelemetryServiceConfiguration>> getWidevineProvisioningLink(ServiceTransaction serviceTransaction, String str, byte[] bArr) {
        if (!(str == null || C12832w.m40118a(str))) {
            Single<? extends Pair<Link, TelemetryServiceConfiguration>> g = this.configurationProvider.getServiceConfiguration(serviceTransaction, DefaultWidevineDrmProvider$getWidevineProvisioningLink$1.INSTANCE).mo30233g(new DefaultWidevineDrmProvider$getWidevineProvisioningLink$2(str, bArr));
            Intrinsics.checkReturnedValueIsNotNull((Object) g, "configurationProvider.ge… config\n                }");
            return g;
        }
        Single<? extends Pair<Link, TelemetryServiceConfiguration>> g2 = this.configurationProvider.getServiceLink(serviceTransaction, DefaultWidevineDrmProvider$getWidevineProvisioningLink$3.INSTANCE).mo30233g(new DefaultWidevineDrmProvider$getWidevineProvisioningLink$4(this, serviceTransaction));
        Intrinsics.checkReturnedValueIsNotNull((Object) g2, "configurationProvider.ge…try\n                    }");
        return g2;
    }

    private final boolean isTv() {
        return this.configurationProvider.getBootstrapConfiguration().getDevice().getDeviceType() == DeviceType.TV;
    }

    public final Single<byte[]> downloadNewOfflineLicense(ServiceTransaction serviceTransaction, Single<Pair<Link, TelemetryServiceConfiguration>> single, byte[] bArr, String str) {
        if (isTv()) {
            Single<byte[]> a = Single.m38395a((Throwable) new UnsupportedOperationException("Offline licenses are not supported on Android TV"));
            Intrinsics.checkReturnedValueIsNotNull((Object) a, "Single.error(Unsupported…upported on Android TV\"))");
            return a;
        }
        Single<byte[]> a2 = single.mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new DefaultWidevineDrmProvider$downloadNewOfflineLicense$1<Object,Object>(this, serviceTransaction, bArr, str));
        Intrinsics.checkReturnedValueIsNotNull((Object) a2, "licenseLink.flatMap { (l…tion, dust)\n            }");
        return a2;
    }

    public byte[] executeKeyRequest(ServiceTransaction serviceTransaction, String str, byte[] bArr, String str2, boolean z) {
        Object c = getWidevineLicense(serviceTransaction, str, bArr, str2, z).mo30224c();
        Intrinsics.checkReturnedValueIsNotNull(c, "getWidevineLicense(trans… isOffline).blockingGet()");
        return (byte[]) c;
    }

    public byte[] executeProvisionRequest(ServiceTransaction serviceTransaction, String str, byte[] bArr, String str2, boolean z) {
        Object c = getWidevineCertificate(serviceTransaction, str, bArr, str2, z).mo30224c();
        Intrinsics.checkReturnedValueIsNotNull(c, "getWidevineCertificate(t… isOffline).blockingGet()");
        return (byte[]) c;
    }

    public final ConfigurationProvider getConfigurationProvider$extension_media_release() {
        return this.configurationProvider;
    }

    public Builder getMediaOkHttpBuilder() {
        return this.$$delegate_0.getMediaOkHttpBuilder();
    }

    public Builder getOkHttpClientBuilder() {
        return this.$$delegate_0.getOkHttpClientBuilder();
    }

    public final Function1<Services, Link> getReleasePermanently() {
        return this.releasePermanently;
    }

    public final Function1<Services, Link> getReleaseTemporary() {
        return this.releaseTemporary;
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

    public Single<byte[]> getWidevineCertificate(ServiceTransaction serviceTransaction, String str, byte[] bArr, String str2, boolean z) {
        Single widevineProvisioningLink = getWidevineProvisioningLink(serviceTransaction, str, bArr);
        DefaultWidevineDrmProvider$getWidevineCertificate$1 defaultWidevineDrmProvider$getWidevineCertificate$1 = new DefaultWidevineDrmProvider$getWidevineCertificate$1(this, str2, serviceTransaction, z, bArr);
        Single<byte[]> a = widevineProvisioningLink.mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) defaultWidevineDrmProvider$getWidevineCertificate$1);
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "getWidevineProvisioningL…      }\n                }");
        return a;
    }

    public Single<byte[]> getWidevineLicense(ServiceTransaction serviceTransaction, String str, byte[] bArr, String str2, boolean z) {
        Single widevineLicenseLink$extension_media_release = getWidevineLicenseLink$extension_media_release(serviceTransaction, str);
        DefaultWidevineDrmProvider$getWidevineLicense$1 defaultWidevineDrmProvider$getWidevineLicense$1 = new DefaultWidevineDrmProvider$getWidevineLicense$1(this, str2, serviceTransaction, z, bArr);
        Single<byte[]> a = widevineLicenseLink$extension_media_release.mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) defaultWidevineDrmProvider$getWidevineLicense$1);
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "getWidevineLicenseLink(t…ICENSE)\n                }");
        return a;
    }

    public Single<Pair<Link, TelemetryServiceConfiguration>> getWidevineLicenseLink$extension_media_release(ServiceTransaction serviceTransaction, String str) {
        Single single;
        if (!(str == null || C12832w.m40118a(str))) {
            single = this.configurationProvider.getServiceConfiguration(serviceTransaction, DefaultWidevineDrmProvider$getWidevineLicenseLink$1.INSTANCE).mo30233g(new DefaultWidevineDrmProvider$getWidevineLicenseLink$2(str));
            Intrinsics.checkReturnedValueIsNotNull((Object) single, "configurationProvider.ge… config\n                }");
        } else {
            single = this.configurationProvider.getServiceLink(serviceTransaction, DefaultWidevineDrmProvider$getWidevineLicenseLink$3.INSTANCE).mo30233g(new DefaultWidevineDrmProvider$getWidevineLicenseLink$4(this, serviceTransaction));
            Intrinsics.checkReturnedValueIsNotNull((Object) single, "configurationProvider.ge…try\n                    }");
        }
        return DustExtensionsKt.withDust$default(single, serviceTransaction, DrmServiceConfigurationKt.getWIDEVINE_GET_LICENSE_URL(Dust$Events.INSTANCE), (Object) null, 4, (Object) null);
    }

    public Single<byte[]> getWidevineOfflineLicense(ServiceTransaction serviceTransaction, byte[] bArr, String str, boolean z) {
        return downloadNewOfflineLicense(serviceTransaction, getWidevineOfflineLicenseLink(serviceTransaction), bArr, DrmServiceConfigurationKt.getWIDEVINE_GET_OFFLINE_LICENSE(Dust$Events.INSTANCE));
    }

    public Single<byte[]> releaseWidevineOfflineLicense(ServiceTransaction serviceTransaction, byte[] bArr, boolean z) {
        Single<byte[]> a = Single.m38401c((Callable<? extends T>) new DefaultWidevineDrmProvider$releaseWidevineOfflineLicense$1<Object>(this, z)).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new DefaultWidevineDrmProvider$releaseWidevineOfflineLicense$2<Object,Object>(this, serviceTransaction, bArr));
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "Single.fromCallable<Serv…ta, it)\n                }");
        return a;
    }

    public final Single<byte[]> releaseWidevineOfflineLicenseInternal(ServiceTransaction serviceTransaction, byte[] bArr, Function1<? super Services, Link> function1) {
        Single g = this.configurationProvider.getServiceLink(serviceTransaction, function1).mo30233g(new C1990xd7344eba(this, serviceTransaction));
        Intrinsics.checkReturnedValueIsNotNull((Object) g, "configurationProvider.ge…lemetry\n                }");
        Single<byte[]> a = DustExtensionsKt.withDust$default(g, serviceTransaction, DrmServiceConfigurationKt.getWIDEVINE_GET_OFFLINE_LICENSE_RELEASE_URL(Dust$Events.INSTANCE), (Object) null, 4, (Object) null).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new C1992xd7344ebb<Object,Object>(this, serviceTransaction, bArr));
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "configurationProvider.ge…ICENSE)\n                }");
        return a;
    }

    public Single<byte[]> renewWidevineOfflineLicense(ServiceTransaction serviceTransaction, byte[] bArr, String str, boolean z) {
        return downloadNewOfflineLicense(serviceTransaction, getWidevineOfflineLicenseRenewLink(serviceTransaction), bArr, DrmServiceConfigurationKt.getWIDEVINE_RENEW_OFFLINE_LICENSE(Dust$Events.INSTANCE));
    }
}
