package com.bamtech.sdk4.internal.telemetry;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.telemetry.BatchProcessingDelayed.DelayReason;
import java.util.Map;
import kotlin.Metadata;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "", "response", "Lcom/bamtech/sdk4/internal/telemetry/TelemetryResponse;", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: TelemetryManager.kt */
final class DustEventBuffer$dispatchRequest$3<T> implements Consumer<TelemetryResponse> {
    final /* synthetic */ Map $batch;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DustEventBuffer this$0;

    DustEventBuffer$dispatchRequest$3(DustEventBuffer dustEventBuffer, ServiceTransaction serviceTransaction, Map map) {
        this.this$0 = dustEventBuffer;
        this.$transaction = serviceTransaction;
        this.$batch = map;
    }

    public final void accept(TelemetryResponse telemetryResponse) {
        this.this$0.storage.setBatchLimit(this.this$0.storage.getBatchLimit() + 1);
        this.$transaction.log(new BatchPostedToClientEvent(this.this$0, this.$batch.size()));
        this.this$0.storage.deleteBatch(this.$batch);
        Long replyAfter = telemetryResponse.getReplyAfter();
        if (replyAfter != null) {
            long longValue = replyAfter.longValue();
            ServiceTransaction serviceTransaction = this.$transaction;
            DustEventBuffer dustEventBuffer = this.this$0;
            BatchProcessingDelayed batchProcessingDelayed = new BatchProcessingDelayed(dustEventBuffer, dustEventBuffer.storage.getSize(), longValue, DelayReason.HEADER_DIRECTIVE);
            serviceTransaction.log(batchProcessingDelayed);
        }
    }
}
