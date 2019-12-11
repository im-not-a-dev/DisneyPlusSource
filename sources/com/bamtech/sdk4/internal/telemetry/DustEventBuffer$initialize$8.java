package com.bamtech.sdk4.internal.telemetry;

import com.bamtech.sdk4.internal.telemetry.DustEventBuffer.TelemetryProcessingRequest;
import com.bamtech.sdk4.internal.telemetry.DustEventBuffer.TelemetryProcessingRequest.Error;
import kotlin.Metadata;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "Lcom/bamtech/sdk4/internal/telemetry/DustEventBuffer$TelemetryProcessingRequest$Error;", "it", "", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: TelemetryManager.kt */
final class DustEventBuffer$initialize$8<T, R> implements Function<Throwable, TelemetryProcessingRequest> {
    public static final DustEventBuffer$initialize$8 INSTANCE = new DustEventBuffer$initialize$8();

    DustEventBuffer$initialize$8() {
    }

    public final Error apply(Throwable th) {
        return new Error();
    }
}
