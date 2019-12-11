package com.bamtech.sdk4.internal.telemetry;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.telemetry.DustEventBuffer.TelemetryProcessingRequest;
import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Maybe;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Maybe;", "Lcom/bamtech/sdk4/internal/telemetry/DustEventBuffer$TelemetryProcessingRequest;", "kotlin.jvm.PlatformType", "reason", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: TelemetryManager.kt */
final class DustEventBuffer$initialize$1<T, R> implements Function<T, MaybeSource<? extends R>> {
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DustEventBuffer this$0;

    DustEventBuffer$initialize$1(DustEventBuffer dustEventBuffer, ServiceTransaction serviceTransaction) {
        this.this$0 = dustEventBuffer;
        this.$transaction = serviceTransaction;
    }

    public final Maybe<TelemetryProcessingRequest> apply(final TelemetryProcessingRequest telemetryProcessingRequest) {
        AccessTokenProvider access$getTokenProvider$p = this.this$0.tokenProvider;
        ServiceTransaction serviceTransaction = this.$transaction;
        C12880j.m40222a((Object) serviceTransaction, "transaction");
        return access$getTokenProvider$p.getStoredAccessToken(serviceTransaction).mo30131f(new Function<T, R>() {
            public final TelemetryProcessingRequest apply(String str) {
                return telemetryProcessingRequest;
            }
        });
    }
}
