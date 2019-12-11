package com.bamtech.sdk4.account.legacy;

import com.bamtech.sdk4.internal.service.TransactionResult;
import com.bamtech.sdk4.plugin.Extension;
import com.bamtech.sdk4.token.AccessContext;
import kotlin.Metadata;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&¨\u0006\b"}, mo31007d2 = {"Lcom/bamtech/sdk4/account/legacy/LegacyAccountExtension;", "Lcom/bamtech/sdk4/plugin/Extension;", "isAccountContext", "Lio/reactivex/Single;", "", "transactionResult", "Lcom/bamtech/sdk4/internal/service/TransactionResult;", "Lcom/bamtech/sdk4/token/AccessContext;", "extension-legacy"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: LegacyAccountExtension.kt */
public interface LegacyAccountExtension extends Extension {
    Single<Boolean> isAccountContext(TransactionResult<AccessContext> transactionResult);
}
