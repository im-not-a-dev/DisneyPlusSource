package com.bamtech.sdk4.internal.telemetry;

import com.bamtech.sdk4.internal.telemetry.DustEventBuffer.TelemetryProcessingRequest;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u00012\u001e\u0010\u0005\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\b"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lkotlin/Pair;", "", "Lcom/bamtech/sdk4/internal/telemetry/DustEventBuffer$TelemetryProcessingRequest;", "<name for destructuring parameter 0>", "", "", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: TelemetryManager.kt */
final class DustEventBuffer$initialize$5<T, R> implements Function<T, SingleSource<? extends R>> {
    final /* synthetic */ DustEventBuffer this$0;

    DustEventBuffer$initialize$5(DustEventBuffer dustEventBuffer) {
        this.this$0 = dustEventBuffer;
    }

    public final Single<Pair<Long, TelemetryProcessingRequest>> apply(Pair<? extends Map<String, String>, ? extends TelemetryProcessingRequest> pair) {
        return this.this$0.dispatchRequest((Map) pair.mo31013a(), (TelemetryProcessingRequest) pair.mo31014b());
    }
}
