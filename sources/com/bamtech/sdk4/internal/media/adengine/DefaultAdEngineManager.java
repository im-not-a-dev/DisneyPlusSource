package com.bamtech.sdk4.internal.media.adengine;

import com.bamtech.core.logging.LogDispatcher.DefaultImpls;
import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.location.LocationResolver;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import com.bamtech.sdk4.location.GeoLocation;
import com.bamtech.sdk4.media.adengine.AdvertisingIdProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.Single;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B/\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/adengine/DefaultAdEngineManager;", "Lcom/bamtech/sdk4/internal/media/adengine/AdEngineManager;", "configurationProvider", "Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;", "adEngineClient", "Lcom/bamtech/sdk4/internal/media/adengine/AdEngineClient;", "locationResolver", "Lcom/bamtech/sdk4/internal/location/LocationResolver;", "tokenProvider", "Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;", "advertisingIdProvider", "Lcom/bamtech/sdk4/media/adengine/AdvertisingIdProvider;", "(Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;Lcom/bamtech/sdk4/internal/media/adengine/AdEngineClient;Lcom/bamtech/sdk4/internal/location/LocationResolver;Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;Lcom/bamtech/sdk4/media/adengine/AdvertisingIdProvider;)V", "getConfigurationProvider$sdk_core_api_release", "()Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;", "constructAdEnginePayload", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/internal/media/adengine/AdEnginePayload;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "adEngineTrackingData", "Lcom/bamtech/sdk4/internal/media/adengine/AdEngineTrackingData;", "formatLocation", "", "location", "Lcom/bamtech/sdk4/location/GeoLocation;", "updateCookies", "Lio/reactivex/Completable;", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: AdEngineManager.kt */
public final class DefaultAdEngineManager implements AdEngineManager {
    /* access modifiers changed from: private */
    public final AdEngineClient adEngineClient;
    /* access modifiers changed from: private */
    public final AdvertisingIdProvider advertisingIdProvider;
    private final ConfigurationProvider configurationProvider;
    private final LocationResolver locationResolver;
    /* access modifiers changed from: private */
    public final AccessTokenProvider tokenProvider;

    public DefaultAdEngineManager(ConfigurationProvider configurationProvider2, AdEngineClient adEngineClient2, LocationResolver locationResolver2, AccessTokenProvider accessTokenProvider, AdvertisingIdProvider advertisingIdProvider2) {
        this.configurationProvider = configurationProvider2;
        this.adEngineClient = adEngineClient2;
        this.locationResolver = locationResolver2;
        this.tokenProvider = accessTokenProvider;
        this.advertisingIdProvider = advertisingIdProvider2;
    }

    /* access modifiers changed from: private */
    public final String formatLocation(ServiceTransaction serviceTransaction, GeoLocation geoLocation) {
        String str;
        Double latitude = geoLocation.getLatitude();
        if (latitude != null) {
            double doubleValue = latitude.doubleValue();
            Double longitude = geoLocation.getLongitude();
            if (longitude != null) {
                double doubleValue2 = longitude.doubleValue();
                StringBuilder sb = new StringBuilder();
                sb.append(doubleValue);
                sb.append(':');
                sb.append(doubleValue2);
                str = sb.toString();
            } else {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        DefaultImpls.log$default(serviceTransaction, this, "UpdateCookieLocationFailed", "Latitude and longitude are not set.", null, false, 24, null);
        return null;
    }

    public Single<AdEnginePayload> constructAdEnginePayload(ServiceTransaction serviceTransaction, AdEngineTrackingData adEngineTrackingData) {
        Single<AdEnginePayload> g = this.locationResolver.getLocation(serviceTransaction).mo30233g(new DefaultAdEngineManager$constructAdEnginePayload$1(this, serviceTransaction, adEngineTrackingData));
        C12880j.m40222a((Object) g, "locationResolver.getLoca…      )\n                }");
        return g;
    }

    public Completable updateCookies(ServiceTransaction serviceTransaction, AdEngineTrackingData adEngineTrackingData) {
        Completable b = this.configurationProvider.getServiceConfiguration(serviceTransaction, DefaultAdEngineManager$updateCookies$1.INSTANCE).mo30217b((Function<? super T, ? extends CompletableSource>) new DefaultAdEngineManager$updateCookies$2<Object,Object>(this, serviceTransaction, adEngineTrackingData));
        C12880j.m40222a((Object) b, "configurationProvider.ge…     }\n\n                }");
        return b;
    }
}
