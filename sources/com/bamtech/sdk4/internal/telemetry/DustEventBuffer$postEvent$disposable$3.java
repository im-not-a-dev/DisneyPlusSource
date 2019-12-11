package com.bamtech.sdk4.internal.telemetry;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import kotlin.Metadata;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0010\b\u0000\u0010\u0002*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, mo31007d2 = {"<anonymous>", "", "T", "Lcom/bamtech/sdk4/internal/telemetry/TelemetryEvent;", "t", "", "kotlin.jvm.PlatformType", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: TelemetryManager.kt */
final class DustEventBuffer$postEvent$disposable$3<T> implements Consumer<Throwable> {
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DustEventBuffer this$0;

    DustEventBuffer$postEvent$disposable$3(DustEventBuffer dustEventBuffer, ServiceTransaction serviceTransaction) {
        this.this$0 = dustEventBuffer;
        this.$transaction = serviceTransaction;
    }

    public final void accept(Throwable th) {
        if (th != null) {
            this.$transaction.log(new TelemetryProcessingFailed(this.this$0, th));
        }
    }
}
