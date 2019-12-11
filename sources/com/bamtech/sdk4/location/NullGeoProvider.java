package com.bamtech.sdk4.location;

import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, mo31007d2 = {"Lcom/bamtech/sdk4/location/NullGeoProvider;", "Lcom/bamtech/sdk4/location/GeoProvider;", "()V", "getLocation", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/location/GeoLocation;", "timeout", "", "extension-session"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: GeoProvider.kt */
public final class NullGeoProvider implements GeoProvider {
    public static final NullGeoProvider INSTANCE = new NullGeoProvider();

    private NullGeoProvider() {
    }

    public Single<? extends GeoLocation> getLocation(long j) {
        Single<? extends GeoLocation> b = Single.m38399b(new UnavailableLocation());
        C12880j.m40222a((Object) b, "Single.just(UnavailableLocation())");
        return b;
    }
}
