package com.bamtech.sdk4.internal.token;

import com.bamtech.core.logging.LogDispatcher.DefaultImpls;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.service.TransactionResult;
import com.bamtech.sdk4.token.AccessContext;
import kotlin.Metadata;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, mo31007d2 = {"<anonymous>", "", "it", "Lcom/bamtech/sdk4/internal/service/TransactionResult;", "Lcom/bamtech/sdk4/token/AccessContext;", "kotlin.jvm.PlatformType", "accept", "com/bamtech/sdk4/internal/token/DefaultAccessContextUpdater$getOrUpdate$1$1$2$1", "com/bamtech/sdk4/internal/token/DefaultAccessContextUpdater$getOrUpdate$1$$special$$inlined$run$lambda$1"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtech.sdk4.internal.token.DefaultAccessContextUpdater$getOrUpdate$1$$special$$inlined$synchronized$lambda$1 */
/* compiled from: DefaultAccessContextUpdater.kt */
final class C2073x80509bdc<T> implements Consumer<TransactionResult<? extends AccessContext>> {
    final /* synthetic */ DefaultAccessContextUpdater$getOrUpdate$1 this$0;

    C2073x80509bdc(DefaultAccessContextUpdater$getOrUpdate$1 defaultAccessContextUpdater$getOrUpdate$1) {
        this.this$0 = defaultAccessContextUpdater$getOrUpdate$1;
    }

    public final void accept(TransactionResult<AccessContext> transactionResult) {
        DefaultAccessContextUpdater$getOrUpdate$1 defaultAccessContextUpdater$getOrUpdate$1 = this.this$0;
        ServiceTransaction serviceTransaction = defaultAccessContextUpdater$getOrUpdate$1.$transaction;
        DefaultAccessContextUpdater defaultAccessContextUpdater = defaultAccessContextUpdater$getOrUpdate$1.this$0;
        StringBuilder sb = new StringBuilder();
        sb.append("TransactionId: ");
        sb.append(this.this$0.$transaction.getId());
        DefaultImpls.log$default(serviceTransaction, defaultAccessContextUpdater, "AccessContextRetrieved", sb.toString(), null, false, 24, null);
    }
}
