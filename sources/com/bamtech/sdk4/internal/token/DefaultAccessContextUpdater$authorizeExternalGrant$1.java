package com.bamtech.sdk4.internal.token;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.service.TransactionResult;
import com.bamtech.sdk4.token.AccessContext;
import kotlin.Metadata;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Completable;", "it", "Lcom/bamtech/sdk4/internal/service/TransactionResult;", "Lcom/bamtech/sdk4/token/AccessContext;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DefaultAccessContextUpdater.kt */
final class DefaultAccessContextUpdater$authorizeExternalGrant$1<T, R> implements Function<TransactionResult<? extends AccessContext>, CompletableSource> {
    final /* synthetic */ String $grantToken;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultAccessContextUpdater this$0;

    DefaultAccessContextUpdater$authorizeExternalGrant$1(DefaultAccessContextUpdater defaultAccessContextUpdater, ServiceTransaction serviceTransaction, String str) {
        this.this$0 = defaultAccessContextUpdater;
        this.$transaction = serviceTransaction;
        this.$grantToken = str;
    }

    public final Completable apply(TransactionResult<AccessContext> transactionResult) {
        return this.this$0.authorizeExternalGrantInternal(this.$transaction, this.$grantToken);
    }
}
