package com.bamtech.sdk4.internal.location;

import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.service.ServiceError;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.location.GeoLocation;
import com.bamtech.sdk4.location.GeoProvider;
import com.bamtech.sdk4.service.BadRequestException;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/location/DefaultLocationResolver;", "Lcom/bamtech/sdk4/internal/location/LocationResolver;", "configurationProvider", "Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;", "geoProvider", "Lcom/bamtech/sdk4/location/GeoProvider;", "(Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;Lcom/bamtech/sdk4/location/GeoProvider;)V", "getLocation", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/location/GeoLocation;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "Companion", "extension-session"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: LocationResolver.kt */
public final class DefaultLocationResolver implements LocationResolver {
    public static final Companion Companion = new Companion(null);
    private final ConfigurationProvider configurationProvider;
    /* access modifiers changed from: private */
    public final GeoProvider geoProvider;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/location/DefaultLocationResolver$Companion;", "", "()V", "generateBadRequestException", "Lcom/bamtech/sdk4/service/BadRequestException;", "uuid", "Ljava/util/UUID;", "error", "", "extension-session"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: LocationResolver.kt */
    public static final class Companion {
        private Companion() {
        }

        public final BadRequestException generateBadRequestException(UUID uuid, Throwable th) {
            return new BadRequestException(uuid, C13183n.m40498a(new ServiceError("faulty-geoprovider", "The GeoProvider supplied to the SDK has generated an exception.  Check the cause for details.")), th);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public DefaultLocationResolver(ConfigurationProvider configurationProvider2, GeoProvider geoProvider2) {
        this.configurationProvider = configurationProvider2;
        this.geoProvider = geoProvider2;
    }

    public Single<? extends GeoLocation> getLocation(ServiceTransaction serviceTransaction) {
        Single<? extends GeoLocation> a = this.configurationProvider.getLocationConfiguration(serviceTransaction).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new DefaultLocationResolver$getLocation$1<Object,Object>(this, serviceTransaction));
        C12880j.m40222a((Object) a, "configurationProvider.ge…      }\n                }");
        return a;
    }
}
