package com.bamtech.sdk4.account.legacy;

import com.bamtech.sdk4.internal.service.ServiceError;
import com.bamtech.sdk4.internal.service.TransactionResult;
import com.bamtech.sdk4.service.InvalidStateException;
import com.bamtech.sdk4.token.AccessContext;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¨\u0006\t"}, mo31007d2 = {"Lcom/bamtech/sdk4/account/legacy/NullLegacyAccountExtension;", "Lcom/bamtech/sdk4/account/legacy/LegacyAccountExtension;", "()V", "isAccountContext", "Lio/reactivex/Single;", "", "transactionResult", "Lcom/bamtech/sdk4/internal/service/TransactionResult;", "Lcom/bamtech/sdk4/token/AccessContext;", "extension-legacy"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: NullLegacyAccountExtension.kt */
public final class NullLegacyAccountExtension implements LegacyAccountExtension {
    public Single<Boolean> isAccountContext(TransactionResult<AccessContext> transactionResult) {
        InvalidStateException invalidStateException = new InvalidStateException(transactionResult.getTransaction().getId(), C13183n.m40498a(new ServiceError("legacy-state-not-handled", "Legacy context found but not handled. Register a legacy extension implementation such as the `LegacyAccountPlugin`")), null, 4, null);
        Single<Boolean> a = Single.m38395a((Throwable) invalidStateException);
        C12880j.m40222a((Object) a, "Single.error<Boolean>(\n …              )\n        )");
        return a;
    }
}
