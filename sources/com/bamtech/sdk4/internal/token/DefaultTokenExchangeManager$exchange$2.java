package com.bamtech.sdk4.internal.token;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.token.AccessContext;
import kotlin.Metadata;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "it", "Lcom/bamtech/sdk4/token/AccessContext;", "kotlin.jvm.PlatformType", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: TokenExchangeManager.kt */
final class DefaultTokenExchangeManager$exchange$2<T> implements Consumer<AccessContext> {
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultTokenExchangeManager this$0;

    DefaultTokenExchangeManager$exchange$2(DefaultTokenExchangeManager defaultTokenExchangeManager, ServiceTransaction serviceTransaction) {
        this.this$0 = defaultTokenExchangeManager;
        this.$transaction = serviceTransaction;
    }

    public final void accept(AccessContext accessContext) {
        this.this$0.sessionInfoUpdater.updateLocalSessionInfo(this.$transaction, accessContext.getAccessToken()).mo30224c();
    }
}
