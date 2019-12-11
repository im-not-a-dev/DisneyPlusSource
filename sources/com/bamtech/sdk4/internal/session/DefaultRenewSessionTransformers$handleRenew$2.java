package com.bamtech.sdk4.internal.session;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.session.ReauthorizeMode;
import kotlin.Metadata;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Completable;", "mode", "Lcom/bamtech/sdk4/session/ReauthorizeMode;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DefaultRenewSessionTransformers.kt */
final class DefaultRenewSessionTransformers$handleRenew$2<T, R> implements Function<ReauthorizeMode, CompletableSource> {
    final /* synthetic */ Throwable $throwable;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultRenewSessionTransformers this$0;

    DefaultRenewSessionTransformers$handleRenew$2(DefaultRenewSessionTransformers defaultRenewSessionTransformers, ServiceTransaction serviceTransaction, Throwable th) {
        this.this$0 = defaultRenewSessionTransformers;
        this.$transaction = serviceTransaction;
        this.$throwable = th;
    }

    public final Completable apply(ReauthorizeMode reauthorizeMode) {
        return this.this$0.getReauthorizationHandlerRegistry$sdk_core_api_release().exchange(this.$transaction, reauthorizeMode, this.$throwable);
    }
}
