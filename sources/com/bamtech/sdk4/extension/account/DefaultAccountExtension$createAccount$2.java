package com.bamtech.sdk4.extension.account;

import com.bamtech.core.logging.LogDispatcher.DefaultImpls;
import com.bamtech.sdk4.identity.IdentityToken;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import kotlin.Metadata;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Completable;", "T", "it", "", "Lcom/bamtech/sdk4/core/types/JWT;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: AccountExtension.kt */
final class DefaultAccountExtension$createAccount$2<T, R> implements Function<String, CompletableSource> {
    final /* synthetic */ IdentityToken $identityToken;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultAccountExtension this$0;

    DefaultAccountExtension$createAccount$2(DefaultAccountExtension defaultAccountExtension, ServiceTransaction serviceTransaction, IdentityToken identityToken) {
        this.this$0 = defaultAccountExtension;
        this.$transaction = serviceTransaction;
        this.$identityToken = identityToken;
    }

    public final Completable apply(String str) {
        DefaultImpls.d$default(this.$transaction, this.this$0, "AccountCreated", false, 4, null);
        return this.this$0.authorize(this.$transaction, this.$identityToken);
    }
}
