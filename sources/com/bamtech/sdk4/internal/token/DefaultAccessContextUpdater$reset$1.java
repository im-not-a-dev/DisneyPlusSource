package com.bamtech.sdk4.internal.token;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.service.TransactionResult;
import com.bamtech.sdk4.internal.session.InternalSessionState.Initializing;
import com.bamtech.sdk4.token.AccessContext;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/internal/service/TransactionResult;", "Lcom/bamtech/sdk4/token/AccessContext;", "call"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DefaultAccessContextUpdater.kt */
final class DefaultAccessContextUpdater$reset$1<V> implements Callable<SingleSource<? extends T>> {
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultAccessContextUpdater this$0;

    DefaultAccessContextUpdater$reset$1(DefaultAccessContextUpdater defaultAccessContextUpdater, ServiceTransaction serviceTransaction) {
        this.this$0 = defaultAccessContextUpdater;
        this.$transaction = serviceTransaction;
    }

    public final Single<TransactionResult<AccessContext>> call() {
        this.this$0.internalSessionStateProvider.setInternalSessionState(new Initializing());
        return this.this$0.getOrUpdate(this.$transaction, true);
    }
}
