package com.bamtech.sdk4.internal.telemetry;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import p520io.reactivex.Maybe;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001\"\u0010\b\u0000\u0010\u0004*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Maybe;", "", "kotlin.jvm.PlatformType", "T", "Lcom/bamtech/sdk4/internal/telemetry/TelemetryEvent;", "it", "Lcom/bamtech/sdk4/internal/telemetry/TelemetryResponse;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: TelemetryManager.kt */
final class DustEventBuffer$postFastEvent$2<T, R> implements Function<T, MaybeSource<? extends R>> {
    final /* synthetic */ DustEventBuffer this$0;

    DustEventBuffer$postFastEvent$2(DustEventBuffer dustEventBuffer) {
        this.this$0 = dustEventBuffer;
    }

    public final Maybe<Long> apply(TelemetryResponse telemetryResponse) {
        Long replyAfter = telemetryResponse.getReplyAfter();
        if (replyAfter == null) {
            replyAfter = Long.valueOf(this.this$0.replyAfterFallback);
        }
        return Maybe.m38253a(replyAfter != null ? replyAfter.longValue() : 0, TimeUnit.SECONDS);
    }
}
