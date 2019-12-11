package com.bamtech.sdk4.internal.telemetry;

import com.bamtech.sdk4.internal.telemetry.DustEventBuffer.TelemetryProcessingRequest;
import kotlin.Metadata;
import kotlin.Pair;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lcom/bamtech/sdk4/internal/telemetry/DustEventBuffer$TelemetryProcessingRequest;", "response", "Lcom/bamtech/sdk4/internal/telemetry/TelemetryResponse;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: TelemetryManager.kt */
final class DustEventBuffer$dispatchRequest$4<T, R> implements Function<T, R> {
    final /* synthetic */ TelemetryProcessingRequest $request;

    DustEventBuffer$dispatchRequest$4(TelemetryProcessingRequest telemetryProcessingRequest) {
        this.$request = telemetryProcessingRequest;
    }

    public final Pair<Long, TelemetryProcessingRequest> apply(TelemetryResponse telemetryResponse) {
        Long replyAfter = telemetryResponse.getReplyAfter();
        return new Pair<>(Long.valueOf(replyAfter != null ? replyAfter.longValue() : 0), this.$request);
    }
}
