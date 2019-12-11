package com.bamtech.sdk4.location;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006¨\u0006\u000e"}, mo31007d2 = {"Lcom/bamtech/sdk4/location/UnavailableLocation;", "Lcom/bamtech/sdk4/location/GeoLocation;", "()V", "latitude", "", "getLatitude", "()Ljava/lang/Double;", "Ljava/lang/Double;", "longitude", "getLongitude", "equals", "", "other", "", "extension-session"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: GeoLocation.kt */
public final class UnavailableLocation implements GeoLocation {
    private final Double latitude;
    private final Double longitude;

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof UnavailableLocation);
    }

    public Double getLatitude() {
        return this.latitude;
    }

    public Double getLongitude() {
        return this.longitude;
    }
}
