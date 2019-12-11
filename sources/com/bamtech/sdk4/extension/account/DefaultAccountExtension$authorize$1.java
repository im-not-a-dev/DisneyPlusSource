package com.bamtech.sdk4.extension.account;

import com.bamtech.sdk4.identity.IdentityToken;
import com.bamtech.sdk4.internal.account.CreateAccountGrantRequest;
import com.bamtech.sdk4.internal.account.CreateAccountGrantResponse;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import kotlin.C12907r;
import kotlin.Metadata;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/internal/account/CreateAccountGrantResponse;", "accessToken", "", "Lcom/bamtech/sdk4/core/types/JWT;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: AccountExtension.kt */
final class DefaultAccountExtension$authorize$1<T, R> implements Function<T, SingleSource<? extends R>> {
    final /* synthetic */ IdentityToken $identityToken;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultAccountExtension this$0;

    DefaultAccountExtension$authorize$1(DefaultAccountExtension defaultAccountExtension, ServiceTransaction serviceTransaction, IdentityToken identityToken) {
        this.this$0 = defaultAccountExtension;
        this.$transaction = serviceTransaction;
        this.$identityToken = identityToken;
    }

    public final Single<CreateAccountGrantResponse> apply(String str) {
        return this.this$0.client.createAccountGrant(this.$transaction, new CreateAccountGrantRequest(this.$identityToken.getToken()), C13170i0.m40332a(C12907r.m40244a("{accessToken}", str)));
    }
}
