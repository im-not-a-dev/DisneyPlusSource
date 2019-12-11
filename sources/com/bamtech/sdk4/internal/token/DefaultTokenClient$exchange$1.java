package com.bamtech.sdk4.internal.token;

import com.bamtech.core.logging.LogDispatcher.DefaultImpls;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.location.GeoLocation;
import kotlin.Metadata;
import okhttp3.FormBody;
import okhttp3.FormBody.Builder;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "Lokhttp3/FormBody;", "kotlin.jvm.PlatformType", "location", "Lcom/bamtech/sdk4/location/GeoLocation;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: TokenClient.kt */
final class DefaultTokenClient$exchange$1<T, R> implements Function<T, R> {
    final /* synthetic */ Builder $bodyBuilder;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultTokenClient this$0;

    DefaultTokenClient$exchange$1(DefaultTokenClient defaultTokenClient, ServiceTransaction serviceTransaction, Builder builder) {
        this.this$0 = defaultTokenClient;
        this.$transaction = serviceTransaction;
        this.$bodyBuilder = builder;
    }

    public final FormBody apply(GeoLocation geoLocation) {
        DefaultImpls.d$default(this.$transaction, this.this$0, "LocationAcquired", false, 4, null);
        Double latitude = geoLocation.getLatitude();
        if (latitude != null) {
            String str = "latitude";
            this.$bodyBuilder.mo35744a(str, String.valueOf(latitude.doubleValue()));
        }
        Double longitude = geoLocation.getLongitude();
        if (longitude != null) {
            String str2 = "longitude";
            this.$bodyBuilder.mo35744a(str2, String.valueOf(longitude.doubleValue()));
        }
        return this.$bodyBuilder.mo35745a();
    }
}
