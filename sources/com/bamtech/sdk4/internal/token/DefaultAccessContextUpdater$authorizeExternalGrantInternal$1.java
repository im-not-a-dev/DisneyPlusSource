package com.bamtech.sdk4.internal.token;

import com.bamtech.core.logging.LogDispatcher.DefaultImpls;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.service.TransactionResult;
import com.bamtech.sdk4.token.AccessContext;
import kotlin.Metadata;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "", "it", "Lcom/bamtech/sdk4/internal/service/TransactionResult;", "Lcom/bamtech/sdk4/token/AccessContext;", "kotlin.jvm.PlatformType", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DefaultAccessContextUpdater.kt */
final class DefaultAccessContextUpdater$authorizeExternalGrantInternal$1<T> implements Consumer<TransactionResult<? extends AccessContext>> {
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultAccessContextUpdater this$0;

    DefaultAccessContextUpdater$authorizeExternalGrantInternal$1(DefaultAccessContextUpdater defaultAccessContextUpdater, ServiceTransaction serviceTransaction) {
        this.this$0 = defaultAccessContextUpdater;
        this.$transaction = serviceTransaction;
    }

    public final void accept(TransactionResult<AccessContext> transactionResult) {
        DefaultImpls.d$default(this.$transaction, this.this$0, "AuthorizeExternalGrantSucceeded", false, 4, null);
    }
}
