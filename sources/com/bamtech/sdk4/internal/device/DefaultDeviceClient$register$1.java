package com.bamtech.sdk4.internal.device;

import com.bamtech.core.networking.C1681c;
import com.bamtech.core.networking.C1691e;
import com.bamtech.core.networking.Link;
import com.bamtech.core.networking.Request;
import com.bamtech.core.networking.handlers.DefaultResponseTransformer;
import com.bamtech.core.networking.handlers.ResponseHandler;
import com.bamtech.core.networking.handlers.ResponseTransformer;
import com.bamtech.sdk4.internal.configuration.Configuration;
import com.bamtech.sdk4.internal.configuration.ConfigurationKt;
import com.bamtech.sdk4.internal.configuration.DeviceServiceConfigurationKt;
import com.bamtech.sdk4.internal.device.RegisterDeviceResponse.Success;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.sugar.MapExtensionsKt;
import com.bamtech.sdk4.internal.telemetry.dust.Dust$Events;
import com.bamtech.sdk4.location.GeoLocation;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p525e0.C11934b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/internal/device/RegisterDeviceResponse$Success;", "kotlin.jvm.PlatformType", "location", "Lcom/bamtech/sdk4/location/GeoLocation;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DeviceClient.kt */
final class DefaultDeviceClient$register$1<T, R> implements Function<T, SingleSource<? extends R>> {
    final /* synthetic */ String $body;
    final /* synthetic */ Map $tokenMap;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultDeviceClient this$0;

    DefaultDeviceClient$register$1(DefaultDeviceClient defaultDeviceClient, ServiceTransaction serviceTransaction, Map map, String str) {
        this.this$0 = defaultDeviceClient;
        this.$transaction = serviceTransaction;
        this.$tokenMap = map;
        this.$body = str;
    }

    public final Single<Success> apply(GeoLocation geoLocation) {
        Map a = C13173j0.m40350a();
        Double latitude = geoLocation.getLatitude();
        String str = null;
        Map plusIfNotNull = MapExtensionsKt.plusIfNotNull(a, "X-BAMTech-Location-Latitude", latitude != null ? String.valueOf(latitude.doubleValue()) : null);
        Double longitude = geoLocation.getLongitude();
        if (longitude != null) {
            str = String.valueOf(longitude.doubleValue());
        }
        final Map plusIfNotNull2 = MapExtensionsKt.plusIfNotNull(plusIfNotNull, "X-BAMTech-Location-Longitude", str);
        return this.this$0.configurationProvider.getServiceLink(this.$transaction, C18551.INSTANCE).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new Function<T, SingleSource<? extends R>>(this) {
            final /* synthetic */ DefaultDeviceClient$register$1 this$0;

            {
                this.this$0 = r1;
            }

            public final Single<Success> apply(Pair<Link, Configuration> pair) {
                Link link = (Link) pair.mo31013a();
                Configuration configuration = (Configuration) pair.mo31014b();
                Link updateTemplates$default = Link.updateTemplates$default(link.withHeaders(plusIfNotNull2), this.this$0.$tokenMap, null, 2, null);
                OkHttpClient client = this.this$0.$transaction.getClient();
                DefaultDeviceClient$register$1 defaultDeviceClient$register$1 = this.this$0;
                ServiceTransaction serviceTransaction = defaultDeviceClient$register$1.$transaction;
                Request a = C1691e.m7796a(updateTemplates$default, client, (ResponseTransformer<? extends OUT>) new DefaultResponseTransformer<Object>(new C1853xc0289fb3(new ResponseHandler[]{new C1851x185f1024(defaultDeviceClient$register$1.this$0.converters.getSnake())}, serviceTransaction), new C1854xc0289fb4(serviceTransaction)), this.this$0.$body, ConfigurationKt.toDustConfigSettings(configuration));
                ServiceTransaction serviceTransaction2 = this.this$0.$transaction;
                String device_create_device_grant = DeviceServiceConfigurationKt.getDEVICE_CREATE_DEVICE_GRANT(Dust$Events.INSTANCE);
                Call a2 = C1691e.m7799a(a);
                Single b = C1681c.m7780a(a, a2).mo30223c((C11945a) new DefaultDeviceClient$register$1$2$$special$$inlined$toSingle$1(a2)).mo30220b(C11934b.m38500b());
                Intrinsics.checkReturnedValueIsNotNull((Object) b, "call(this, call)\n       …scribeOn(Schedulers.io())");
                Single<Success> g = b.mo30222c((Consumer<? super Disposable>) new DefaultDeviceClient$register$1$2$$special$$inlined$toSingle$2<Object>(serviceTransaction2, device_create_device_grant)).mo30218b((Consumer<? super Throwable>) new DefaultDeviceClient$register$1$2$$special$$inlined$toSingle$3<Object>(a, serviceTransaction2, device_create_device_grant)).mo30233g(new DefaultDeviceClient$register$1$2$$special$$inlined$toSingle$4(serviceTransaction2, device_create_device_grant));
                Intrinsics.checkReturnedValueIsNotNull((Object) g, "this.asSingle()\n        …        it.body\n        }");
                return g;
            }
        });
    }
}
