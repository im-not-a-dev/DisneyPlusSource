package com.bamtech.sdk4.internal.media.drm;

import com.bamtech.core.networking.Link;
import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.configuration.NetworkConfigurationProvider;
import com.bamtech.sdk4.internal.configuration.TelemetryServiceConfiguration;
import com.bamtech.sdk4.internal.networking.ConverterProvider;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.telemetry.EventBuffer;
import com.bamtech.sdk4.internal.telemetry.dust.DustClientConstants;
import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import com.bamtech.sdk4.media.QOSNetworkHelper;
import java.util.Properties;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J1\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00190\u00182\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0010¢\u0006\u0002\b R\u001a\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006!"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/drm/TestWidevineDrmProvider;", "Lcom/bamtech/sdk4/internal/media/drm/DefaultWidevineDrmProvider;", "provider", "Lcom/bamtech/sdk4/internal/configuration/NetworkConfigurationProvider;", "configurationProvider", "Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;", "converters", "Lcom/bamtech/sdk4/internal/networking/ConverterProvider;", "accessTokenProvider", "Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;", "eventBuffer", "Lcom/bamtech/sdk4/internal/telemetry/EventBuffer;", "dustConstants", "Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants;", "qosNetworkHelper", "Lcom/bamtech/sdk4/media/QOSNetworkHelper;", "(Lcom/bamtech/sdk4/internal/configuration/NetworkConfigurationProvider;Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;Lcom/bamtech/sdk4/internal/networking/ConverterProvider;Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;Lcom/bamtech/sdk4/internal/telemetry/EventBuffer;Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants;Lcom/bamtech/sdk4/media/QOSNetworkHelper;)V", "properties", "Ljava/util/Properties;", "getProperties", "()Ljava/util/Properties;", "setProperties", "(Ljava/util/Properties;)V", "getWidevineLicenseLink", "Lio/reactivex/Single;", "Lkotlin/Pair;", "Lcom/bamtech/core/networking/Link;", "Lcom/bamtech/sdk4/internal/configuration/TelemetryServiceConfiguration;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "url", "", "getWidevineLicenseLink$extension_media_release", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DefaultWidevineDrmProvider.kt */
public final class TestWidevineDrmProvider extends DefaultWidevineDrmProvider {
    public Properties properties;

    public TestWidevineDrmProvider(NetworkConfigurationProvider networkConfigurationProvider, ConfigurationProvider configurationProvider, ConverterProvider converterProvider, AccessTokenProvider accessTokenProvider, EventBuffer eventBuffer, DustClientConstants dustClientConstants, QOSNetworkHelper qOSNetworkHelper) {
        super(networkConfigurationProvider, configurationProvider, converterProvider, accessTokenProvider, eventBuffer, dustClientConstants, qOSNetworkHelper);
    }

    public Single<Pair<Link, TelemetryServiceConfiguration>> getWidevineLicenseLink$extension_media_release(ServiceTransaction serviceTransaction, String str) {
        Properties properties2 = this.properties;
        if (properties2 != null) {
            String property = properties2.getProperty("mediaTestDrmAuth");
            if (property == null || C12832w.m40118a(property)) {
                return super.getWidevineLicenseLink$extension_media_release(serviceTransaction, str);
            }
            Single<Pair<Link, TelemetryServiceConfiguration>> a = getConfigurationProvider$extension_media_release().getServiceLink(serviceTransaction, TestWidevineDrmProvider$getWidevineLicenseLink$1.INSTANCE).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new TestWidevineDrmProvider$getWidevineLicenseLink$2<Object,Object>(property));
            C12880j.m40222a((Object) a, "configurationProvider.ge…ry)\n                    }");
            return a;
        }
        C12880j.m40227c("properties");
        throw null;
    }
}
