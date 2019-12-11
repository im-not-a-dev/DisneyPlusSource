package com.bamtech.sdk4.internal.telemetry;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import java.util.Map;
import kotlin.Metadata;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "it", "Lio/reactivex/disposables/Disposable;", "kotlin.jvm.PlatformType", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: TelemetryManager.kt */
final class DustEventBuffer$dispatchRequest$1<T> implements Consumer<Disposable> {
    final /* synthetic */ Map $batch;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DustEventBuffer this$0;

    DustEventBuffer$dispatchRequest$1(DustEventBuffer dustEventBuffer, ServiceTransaction serviceTransaction, Map map) {
        this.this$0 = dustEventBuffer;
        this.$transaction = serviceTransaction;
        this.$batch = map;
    }

    public final void accept(Disposable disposable) {
        ServiceTransaction serviceTransaction = this.$transaction;
        DustEventBuffer dustEventBuffer = this.this$0;
        serviceTransaction.log(new BatchProcessingStartedEvent(dustEventBuffer, dustEventBuffer.storage.getSize(), this.$batch.size()));
    }
}
