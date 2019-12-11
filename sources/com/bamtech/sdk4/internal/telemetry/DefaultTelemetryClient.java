package com.bamtech.sdk4.internal.telemetry;

import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.networking.ConverterProvider;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J2\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J@\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000f2\u0014\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00140\u0013H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/telemetry/DefaultTelemetryClient;", "Lcom/bamtech/sdk4/internal/telemetry/TelemetryClient;", "configurationProvider", "Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;", "converters", "Lcom/bamtech/sdk4/internal/networking/ConverterProvider;", "(Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;Lcom/bamtech/sdk4/internal/networking/ConverterProvider;)V", "getConfigurationProvider", "()Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;", "postEvents", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/internal/telemetry/TelemetryResponse;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "headers", "", "", "json", "events", "", "Lcom/bamtech/sdk4/internal/telemetry/TelemetryEvent;", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: TelemetryClient.kt */
public final class DefaultTelemetryClient implements TelemetryClient {
    private final ConfigurationProvider configurationProvider;
    /* access modifiers changed from: private */
    public final ConverterProvider converters;

    public DefaultTelemetryClient(ConfigurationProvider configurationProvider2, ConverterProvider converterProvider) {
        this.configurationProvider = configurationProvider2;
        this.converters = converterProvider;
    }

    public Single<TelemetryResponse> postEvents(ServiceTransaction serviceTransaction, Map<String, String> map, List<? extends TelemetryEvent<?, ?>> list) {
        return postEvents(serviceTransaction, map, this.converters.getIdentity().serialize(list));
    }

    public Single<TelemetryResponse> postEvents(ServiceTransaction serviceTransaction, Map<String, String> map, String str) {
        Single<TelemetryResponse> a = this.configurationProvider.getServiceLink(serviceTransaction, DefaultTelemetryClient$postEvents$1.INSTANCE).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new DefaultTelemetryClient$postEvents$2<Object,Object>(this, map, serviceTransaction, str));
        C12880j.m40222a((Object) a, "configurationProvider.ge….body }\n                }");
        return a;
    }
}
