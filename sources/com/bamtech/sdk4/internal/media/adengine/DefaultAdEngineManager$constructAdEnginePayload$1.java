package com.bamtech.sdk4.internal.media.adengine;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.location.GeoLocation;
import java.util.Map;
import kotlin.Metadata;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "Lcom/bamtech/sdk4/internal/media/adengine/AdEnginePayload;", "location", "Lcom/bamtech/sdk4/location/GeoLocation;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: AdEngineManager.kt */
final class DefaultAdEngineManager$constructAdEnginePayload$1<T, R> implements Function<T, R> {
    final /* synthetic */ AdEngineTrackingData $adEngineTrackingData;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultAdEngineManager this$0;

    DefaultAdEngineManager$constructAdEnginePayload$1(DefaultAdEngineManager defaultAdEngineManager, ServiceTransaction serviceTransaction, AdEngineTrackingData adEngineTrackingData) {
        this.this$0 = defaultAdEngineManager;
        this.$transaction = serviceTransaction;
        this.$adEngineTrackingData = adEngineTrackingData;
    }

    public final AdEnginePayload apply(GeoLocation geoLocation) {
        String access$formatLocation = this.this$0.formatLocation(this.$transaction, geoLocation);
        boolean limitTracking = this.this$0.advertisingIdProvider.limitTracking();
        String id = this.this$0.advertisingIdProvider.getId();
        String cdn = this.$adEngineTrackingData.getCdn();
        String corigin = this.$adEngineTrackingData.getCorigin();
        String ssess = this.$adEngineTrackingData.getSsess();
        Map adTargeting = this.$adEngineTrackingData.getAdTargeting();
        AdEnginePayload adEnginePayload = new AdEnginePayload(access$formatLocation, limitTracking ? 1 : 0, id, cdn, corigin, ssess, null, "v4.7.4", adTargeting, 64, null);
        return adEnginePayload;
    }
}
