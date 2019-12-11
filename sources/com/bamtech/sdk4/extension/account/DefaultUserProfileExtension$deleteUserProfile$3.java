package com.bamtech.sdk4.extension.account;

import com.bamtech.sdk4.internal.account.CreateAccountGrantResponse;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import kotlin.Metadata;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Completable;", "kotlin.jvm.PlatformType", "accountGrant", "Lcom/bamtech/sdk4/internal/account/CreateAccountGrantResponse;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: UserProfileExtension.kt */
final class DefaultUserProfileExtension$deleteUserProfile$3<T, R> implements Function<CreateAccountGrantResponse, CompletableSource> {
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultUserProfileExtension this$0;

    DefaultUserProfileExtension$deleteUserProfile$3(DefaultUserProfileExtension defaultUserProfileExtension, ServiceTransaction serviceTransaction) {
        this.this$0 = defaultUserProfileExtension;
        this.$transaction = serviceTransaction;
    }

    public final Completable apply(CreateAccountGrantResponse createAccountGrantResponse) {
        return this.this$0.tokenExchangeProvider.exchangeAccountToken(this.$transaction, createAccountGrantResponse.getAssertion()).mo30228e();
    }
}
