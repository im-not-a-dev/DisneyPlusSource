package com.bamtech.sdk4.internal.telemetry;

import com.bamtech.sdk4.internal.telemetry.DustEventBuffer.TelemetryProcessingRequest;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import p520io.reactivex.Observable;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005H\n¢\u0006\u0002\b\u0007"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "it", "Lkotlin/Pair;", "Lcom/bamtech/sdk4/internal/telemetry/DustEventBuffer$TelemetryProcessingRequest;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: TelemetryManager.kt */
final class DustEventBuffer$initialize$6<T, R> implements Function<T, ObservableSource<? extends R>> {
    final /* synthetic */ DustEventBuffer this$0;

    DustEventBuffer$initialize$6(DustEventBuffer dustEventBuffer) {
        this.this$0 = dustEventBuffer;
    }

    public final Observable<Long> apply(Pair<Long, ? extends TelemetryProcessingRequest> pair) {
        if (((TelemetryProcessingRequest) pair.mo31016d()).isFastTrackRequest() && this.this$0.isProcessing.get()) {
            return Observable.m38314m();
        }
        if (((TelemetryProcessingRequest) pair.mo31016d()).isOneOffRequest()) {
            return Observable.m38314m();
        }
        return Observable.m38310c(((Number) pair.mo31015c()).longValue(), TimeUnit.SECONDS);
    }
}
