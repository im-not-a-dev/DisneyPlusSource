package com.bamtech.sdk4.internal.token;

import com.bamtech.core.logging.LogDispatcher.DefaultImpls;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.session.InternalSessionState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: TokenExchangeManager.kt */
final class DefaultTokenExchangeManager$refreshToken$2<T> implements Consumer<Throwable> {
    final /* synthetic */ InternalSessionState $sessionState;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultTokenExchangeManager this$0;

    DefaultTokenExchangeManager$refreshToken$2(DefaultTokenExchangeManager defaultTokenExchangeManager, ServiceTransaction serviceTransaction, InternalSessionState internalSessionState) {
        this.this$0 = defaultTokenExchangeManager;
        this.$transaction = serviceTransaction;
        this.$sessionState = internalSessionState;
    }

    public final void accept(Throwable th) {
        DefaultImpls.d$default(this.$transaction, this.this$0, "RefreshTokenExchangeFailure", th.getMessage(), false, 8, null);
        DefaultTokenExchangeManager defaultTokenExchangeManager = this.this$0;
        ServiceTransaction serviceTransaction = this.$transaction;
        Intrinsics.checkReturnedValueIsNotNull((Object) th, "it");
        defaultTokenExchangeManager.handleTokenError(serviceTransaction, th, this.$sessionState);
    }
}
