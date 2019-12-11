package com.bamtech.sdk4.internal.telemetry;

import com.bamtech.sdk4.internal.telemetry.DustEventBuffer.TelemetryProcessingRequest;
import com.bamtech.sdk4.internal.telemetry.DustEventBuffer.TelemetryProcessingRequest.PostedEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "Lcom/bamtech/sdk4/internal/telemetry/DustEventBuffer$TelemetryProcessingRequest;", "request", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: TelemetryManager.kt */
final class DustEventBuffer$initialize$4<T, R> implements Function<T, R> {
    final /* synthetic */ DustEventBuffer this$0;

    DustEventBuffer$initialize$4(DustEventBuffer dustEventBuffer) {
        this.this$0 = dustEventBuffer;
    }

    public final Pair<Map<String, String>, TelemetryProcessingRequest> apply(TelemetryProcessingRequest telemetryProcessingRequest) {
        if (!telemetryProcessingRequest.isFastTrackRequest()) {
            return new Pair<>(this.this$0.storage.createBatch(), telemetryProcessingRequest);
        }
        TelemetryStorage access$getStorage$p = this.this$0.storage;
        String fileName = ((PostedEvent) telemetryProcessingRequest).getFileName();
        if (fileName != null) {
            return new Pair<>(access$getStorage$p.createSingleBatch(fileName), telemetryProcessingRequest);
        }
        C12880j.m40220a();
        throw null;
    }
}
