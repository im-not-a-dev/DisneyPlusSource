package com.bamtech.sdk4.session;

import com.bamtech.sdk4.internal.service.TransactionResult;
import com.bamtech.sdk4.token.AccessContext;
import kotlin.Metadata;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00060\u0001j\u0002`\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "", "Lcom/bamtech/sdk4/core/types/JWT;", "it", "Lcom/bamtech/sdk4/internal/service/TransactionResult;", "Lcom/bamtech/sdk4/token/AccessContext;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DefaultSessionApi.kt */
final class DefaultSessionApi$getSessionToken$1<T, R> implements Function<T, R> {
    public static final DefaultSessionApi$getSessionToken$1 INSTANCE = new DefaultSessionApi$getSessionToken$1();

    DefaultSessionApi$getSessionToken$1() {
    }

    public final String apply(TransactionResult<AccessContext> transactionResult) {
        return ((AccessContext) transactionResult.getResult()).getAccessToken();
    }
}
