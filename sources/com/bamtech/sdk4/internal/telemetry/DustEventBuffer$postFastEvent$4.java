package com.bamtech.sdk4.internal.telemetry;

import com.bamtech.sdk4.internal.telemetry.DustEventBuffer.TelemetryProcessingRequest.Iteration;
import kotlin.Metadata;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0010\b\u0000\u0010\u0002*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo31007d2 = {"<anonymous>", "", "T", "Lcom/bamtech/sdk4/internal/telemetry/TelemetryEvent;", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Long;)V"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: TelemetryManager.kt */
final class DustEventBuffer$postFastEvent$4<T> implements Consumer<Long> {
    final /* synthetic */ DustEventBuffer this$0;

    DustEventBuffer$postFastEvent$4(DustEventBuffer dustEventBuffer) {
        this.this$0 = dustEventBuffer;
    }

    public final void accept(Long l) {
        this.this$0.publisher.onNext(new Iteration());
    }
}
