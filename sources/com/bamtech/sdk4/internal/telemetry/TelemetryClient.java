package com.bamtech.sdk4.internal.telemetry;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH&J@\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b2\u0014\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\r0\fH&¨\u0006\u000e"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/telemetry/TelemetryClient;", "", "postEvents", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/internal/telemetry/TelemetryResponse;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "headers", "", "", "json", "events", "", "Lcom/bamtech/sdk4/internal/telemetry/TelemetryEvent;", "extension-telemetry"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: TelemetryClient.kt */
public interface TelemetryClient {
    Single<TelemetryResponse> postEvents(ServiceTransaction serviceTransaction, Map<String, String> map, String str);

    Single<TelemetryResponse> postEvents(ServiceTransaction serviceTransaction, Map<String, String> map, List<? extends TelemetryEvent<?, ?>> list);
}
