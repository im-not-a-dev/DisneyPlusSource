package com.bamtech.sdk4.internal.telemetry;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.telemetry.DustEventBuffer.TelemetryProcessingRequest;
import com.bamtech.sdk4.service.InvalidRequestException;
import com.bamtech.sdk4.service.NetworkException;
import java.net.SocketTimeoutException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lcom/bamtech/sdk4/internal/telemetry/DustEventBuffer$TelemetryProcessingRequest;", "e", "", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: TelemetryManager.kt */
final class DustEventBuffer$dispatchRequest$5<T, R> implements Function<Throwable, Pair<? extends Long, ? extends TelemetryProcessingRequest>> {
    final /* synthetic */ Map $batch;
    final /* synthetic */ TelemetryProcessingRequest $request;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DustEventBuffer this$0;

    DustEventBuffer$dispatchRequest$5(DustEventBuffer dustEventBuffer, ServiceTransaction serviceTransaction, TelemetryProcessingRequest telemetryProcessingRequest, Map map) {
        this.this$0 = dustEventBuffer;
        this.$transaction = serviceTransaction;
        this.$request = telemetryProcessingRequest;
        this.$batch = map;
    }

    public final Pair<Long, TelemetryProcessingRequest> apply(Throwable th) {
        long j;
        DustEventBuffer dustEventBuffer = this.this$0;
        ServiceTransaction serviceTransaction = this.$transaction;
        Intrinsics.checkReturnedValueIsNotNull((Object) serviceTransaction, "transaction");
        dustEventBuffer.logError(serviceTransaction, th);
        if (!this.$request.isFastTrackRequest()) {
            boolean z = th instanceof NetworkException;
            if (z && (th.getCause() instanceof SocketTimeoutException) && this.$batch.size() == 1) {
                this.this$0.storage.deleteBatch(this.$batch);
            } else if (z && (th.getCause() instanceof SocketTimeoutException)) {
                this.this$0.storage.setBatchLimit(this.$batch.size() - 1);
            } else if ((th instanceof TelemetryClientException) && (th.getCause() instanceof InvalidRequestException)) {
                this.this$0.storage.deleteBatch(this.$batch);
            }
        }
        if (!(th instanceof TelemetryClientException)) {
            th = null;
        }
        TelemetryClientException telemetryClientException = (TelemetryClientException) th;
        if (telemetryClientException != null) {
            TelemetryResponse telemetryResponse = telemetryClientException.getTelemetryResponse();
            if (telemetryResponse != null) {
                Long replyAfter = telemetryResponse.getReplyAfter();
                if (replyAfter != null) {
                    j = replyAfter.longValue();
                    return new Pair<>(Long.valueOf(j), this.$request);
                }
            }
        }
        j = this.this$0.replyAfterFallback;
        return new Pair<>(Long.valueOf(j), this.$request);
    }
}
