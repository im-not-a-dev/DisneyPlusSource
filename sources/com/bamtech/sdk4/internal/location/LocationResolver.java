package com.bamtech.sdk4.internal.location;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.location.GeoLocation;
import kotlin.Metadata;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/location/LocationResolver;", "", "getLocation", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/location/GeoLocation;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "extension-session"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: LocationResolver.kt */
public interface LocationResolver {
    Single<? extends GeoLocation> getLocation(ServiceTransaction serviceTransaction);
}
