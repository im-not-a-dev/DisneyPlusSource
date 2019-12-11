package com.bamtech.sdk4.internal.token;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.service.TransactionResult;
import com.bamtech.sdk4.token.AccessContext;
import kotlin.Metadata;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "Lcom/bamtech/sdk4/internal/service/TransactionResult;", "Lcom/bamtech/sdk4/token/AccessContext;", "it", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: TokenExchangeManager.kt */
final class DefaultTokenExchangeManager$exchange$3<T, R> implements Function<T, R> {
    final /* synthetic */ ServiceTransaction $transaction;

    DefaultTokenExchangeManager$exchange$3(ServiceTransaction serviceTransaction) {
        this.$transaction = serviceTransaction;
    }

    public final TransactionResult<AccessContext> apply(AccessContext accessContext) {
        return new TransactionResult<>(this.$transaction, accessContext);
    }
}
