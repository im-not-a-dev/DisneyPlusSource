package com.bamtech.sdk4.internal.device;

import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.location.LocationResolver;
import com.bamtech.sdk4.internal.networking.ConverterProvider;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.token.Grant;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ8\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\u0002`\u0013H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/device/DefaultDeviceClient;", "Lcom/bamtech/sdk4/internal/device/DeviceClient;", "configurationProvider", "Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;", "locationResolver", "Lcom/bamtech/sdk4/internal/location/LocationResolver;", "converters", "Lcom/bamtech/sdk4/internal/networking/ConverterProvider;", "(Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;Lcom/bamtech/sdk4/internal/location/LocationResolver;Lcom/bamtech/sdk4/internal/networking/ConverterProvider;)V", "register", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/token/Grant;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "request", "Lcom/bamtech/sdk4/internal/device/Device;", "tokenMap", "", "", "Lcom/bamtech/sdk4/internal/service/TokenMap;", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DeviceClient.kt */
public final class DefaultDeviceClient implements DeviceClient {
    /* access modifiers changed from: private */
    public final ConfigurationProvider configurationProvider;
    /* access modifiers changed from: private */
    public final ConverterProvider converters;
    private final LocationResolver locationResolver;

    public DefaultDeviceClient(ConfigurationProvider configurationProvider2, LocationResolver locationResolver2, ConverterProvider converterProvider) {
        this.configurationProvider = configurationProvider2;
        this.locationResolver = locationResolver2;
        this.converters = converterProvider;
    }

    public Single<? extends Grant> register(ServiceTransaction serviceTransaction, Device device, Map<String, String> map) {
        Single<? extends Grant> a = this.locationResolver.getLocation(serviceTransaction).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new DefaultDeviceClient$register$1<Object,Object>(this, serviceTransaction, map, this.converters.getIdentity().serialize(device)));
        C12880j.m40222a((Object) a, "locationResolver.getLoca…      }\n                }");
        return a;
    }
}
