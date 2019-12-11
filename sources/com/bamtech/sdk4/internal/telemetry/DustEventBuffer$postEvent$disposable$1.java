package com.bamtech.sdk4.internal.telemetry;

import com.bamtech.sdk4.internal.configuration.TelemetryBufferConfiguration;
import com.bamtech.sdk4.internal.configuration.TelemetryServiceExtras;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.telemetry.DustEventBuffer.TelemetryProcessingRequest.Initialize;
import com.bamtech.sdk4.internal.telemetry.DustEventBuffer.TelemetryProcessingRequest.PostedEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Maybe;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001\"\u0010\b\u0000\u0010\u0004*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Maybe;", "", "kotlin.jvm.PlatformType", "T", "Lcom/bamtech/sdk4/internal/telemetry/TelemetryEvent;", "serviceExtras", "Lcom/bamtech/sdk4/internal/configuration/TelemetryServiceExtras;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: TelemetryManager.kt */
final class DustEventBuffer$postEvent$disposable$1<T, R> implements Function<T, MaybeSource<? extends R>> {
    final /* synthetic */ TelemetryEvent $event;
    final /* synthetic */ RequestType $requestType;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DustEventBuffer this$0;

    DustEventBuffer$postEvent$disposable$1(DustEventBuffer dustEventBuffer, ServiceTransaction serviceTransaction, TelemetryEvent telemetryEvent, RequestType requestType) {
        this.this$0 = dustEventBuffer;
        this.$transaction = serviceTransaction;
        this.$event = telemetryEvent;
        this.$requestType = requestType;
    }

    public final Maybe<? extends Object> apply(TelemetryServiceExtras telemetryServiceExtras) {
        TelemetryBufferConfiguration telemetryBufferConfiguration = (TelemetryBufferConfiguration) this.this$0.configExtras.invoke(telemetryServiceExtras);
        if (telemetryBufferConfiguration.getDisabled()) {
            this.$transaction.log(new TelemetryProcessingDisabledEvent(this.this$0));
            return Maybe.m38259h();
        }
        this.this$0.storage.setQueueLimit(telemetryBufferConfiguration.getCacheLimit());
        this.this$0.storage.setMaxBatchLimit(telemetryBufferConfiguration.getBatchLimit());
        this.this$0.storage.setMinBatchLimit(telemetryBufferConfiguration.getMinimumBatchSize());
        this.this$0.replyAfterFallback = telemetryBufferConfiguration.getReplyAfterFallback();
        if (this.this$0.getChain$sdk_core_api_release() == null) {
            this.this$0.initialize$sdk_core_api_release(new Initialize());
        }
        if (this.this$0.isFastTrack$sdk_core_api_release(telemetryServiceExtras, this.$event)) {
            return this.this$0.postFastEvent$sdk_core_api_release(this.$event);
        }
        PostedEvent postedEvent = new PostedEvent(this.$event, this.$requestType, null, 4, null);
        TelemetryStorage access$getStorage$p = this.this$0.storage;
        ServiceTransaction serviceTransaction = this.$transaction;
        String str = "transaction";
        C12880j.m40222a((Object) serviceTransaction, str);
        access$getStorage$p.trimSavedEvents(serviceTransaction);
        TelemetryStorage access$getStorage$p2 = this.this$0.storage;
        ServiceTransaction serviceTransaction2 = this.$transaction;
        C12880j.m40222a((Object) serviceTransaction2, str);
        postedEvent.setFileName(access$getStorage$p2.storeEvent(serviceTransaction2, this.$event));
        this.$transaction.log(new EventAddedToQueueEvent(this.this$0, this.$event));
        this.this$0.publisher.onNext(postedEvent);
        return Maybe.m38259h();
    }
}
