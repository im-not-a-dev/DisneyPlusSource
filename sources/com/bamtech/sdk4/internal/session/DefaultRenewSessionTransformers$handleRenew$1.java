package com.bamtech.sdk4.internal.session;

import com.bamtech.sdk4.internal.service.TransactionResult;
import com.bamtech.sdk4.session.AuthenticationExpiredCallback;
import com.bamtech.sdk4.session.ReauthorizeMode;
import com.bamtech.sdk4.token.AccessContext;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/session/ReauthorizeMode;", "it", "Lcom/bamtech/sdk4/internal/service/TransactionResult;", "Lcom/bamtech/sdk4/token/AccessContext;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DefaultRenewSessionTransformers.kt */
final class DefaultRenewSessionTransformers$handleRenew$1<T, R> implements Function<T, SingleSource<? extends R>> {
    final /* synthetic */ AuthenticationExpiredCallback $callback;
    final /* synthetic */ Throwable $throwable;

    DefaultRenewSessionTransformers$handleRenew$1(AuthenticationExpiredCallback authenticationExpiredCallback, Throwable th) {
        this.$callback = authenticationExpiredCallback;
        this.$throwable = th;
    }

    public final Single<? extends ReauthorizeMode> apply(TransactionResult<AccessContext> transactionResult) {
        AuthenticationExpiredCallback authenticationExpiredCallback = this.$callback;
        if (authenticationExpiredCallback != null) {
            return authenticationExpiredCallback.newSession(this.$throwable);
        }
        C12880j.m40220a();
        throw null;
    }
}
