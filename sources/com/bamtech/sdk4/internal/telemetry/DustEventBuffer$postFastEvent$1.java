package com.bamtech.sdk4.internal.telemetry;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0010\b\u0000\u0010\u0003*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\n¢\u0006\u0002\b\b"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/internal/telemetry/TelemetryResponse;", "T", "Lcom/bamtech/sdk4/internal/telemetry/TelemetryEvent;", "accessToken", "", "Lcom/bamtech/sdk4/core/types/JWT;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: TelemetryManager.kt */
final class DustEventBuffer$postFastEvent$1<T, R> implements Function<T, SingleSource<? extends R>> {
    final /* synthetic */ TelemetryEvent $event;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DustEventBuffer this$0;

    DustEventBuffer$postFastEvent$1(DustEventBuffer dustEventBuffer, ServiceTransaction serviceTransaction, TelemetryEvent telemetryEvent) {
        this.this$0 = dustEventBuffer;
        this.$transaction = serviceTransaction;
        this.$event = telemetryEvent;
    }

    public final Single<TelemetryResponse> apply(String str) {
        TelemetryClient access$getClient$p = this.this$0.client;
        ServiceTransaction serviceTransaction = this.$transaction;
        C12880j.m40222a((Object) serviceTransaction, "transaction");
        return access$getClient$p.postEvents(serviceTransaction, C13170i0.m40332a(C12907r.m40244a("{accessToken}", str)), C13183n.m40498a(this.$event));
    }
}
