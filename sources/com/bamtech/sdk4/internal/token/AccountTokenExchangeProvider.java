package com.bamtech.sdk4.internal.token;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.service.TransactionResult;
import com.bamtech.sdk4.plugin.Extension;
import com.bamtech.sdk4.token.AccessContext;
import kotlin.Metadata;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u00060\tj\u0002`\nH&¨\u0006\u000b"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/token/AccountTokenExchangeProvider;", "Lcom/bamtech/sdk4/plugin/Extension;", "exchangeAccountToken", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/internal/service/TransactionResult;", "Lcom/bamtech/sdk4/token/AccessContext;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "assertion", "", "Lcom/bamtech/sdk4/core/types/JWT;", "extension-session"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: AccessTokenProvider.kt */
public interface AccountTokenExchangeProvider extends Extension {
    Single<TransactionResult<AccessContext>> exchangeAccountToken(ServiceTransaction serviceTransaction, String str);
}
