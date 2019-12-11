package com.bamtech.sdk4.internal.telemetry;

import com.bamtech.sdk4.internal.telemetry.DustEventBuffer.TelemetryProcessingRequest;
import com.bamtech.sdk4.internal.telemetry.DustEventBuffer.TelemetryProcessingRequest.Iteration;
import kotlin.Metadata;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo31007d2 = {"<anonymous>", "Lcom/bamtech/sdk4/internal/telemetry/DustEventBuffer$TelemetryProcessingRequest;", "it", "", "apply", "(Ljava/lang/Long;)Lcom/bamtech/sdk4/internal/telemetry/DustEventBuffer$TelemetryProcessingRequest;"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: TelemetryManager.kt */
final class DustEventBuffer$initialize$7<T, R> implements Function<T, R> {
    public static final DustEventBuffer$initialize$7 INSTANCE = new DustEventBuffer$initialize$7();

    DustEventBuffer$initialize$7() {
    }

    public final TelemetryProcessingRequest apply(Long l) {
        return new Iteration();
    }
}
