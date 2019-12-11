package com.bamtech.sdk4.extension.account;

import com.bamtech.sdk4.account.UserProfile;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.service.TransactionResult;
import com.bamtech.sdk4.token.AccessContext;
import kotlin.Metadata;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n¢\u0006\u0002\b\u0007"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "T", "Lcom/bamtech/sdk4/account/UserProfile;", "it", "Lcom/bamtech/sdk4/internal/service/TransactionResult;", "Lcom/bamtech/sdk4/token/AccessContext;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: UserProfileExtension.kt */
final class DefaultUserProfileExtension$updateUserProfile$3<T, R> implements Function<T, SingleSource<? extends R>> {
    final /* synthetic */ UserProfile $profile;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ Class $type;
    final /* synthetic */ DefaultUserProfileExtension this$0;

    DefaultUserProfileExtension$updateUserProfile$3(DefaultUserProfileExtension defaultUserProfileExtension, ServiceTransaction serviceTransaction, UserProfile userProfile, Class cls) {
        this.this$0 = defaultUserProfileExtension;
        this.$transaction = serviceTransaction;
        this.$profile = userProfile;
        this.$type = cls;
    }

    public final Single<T> apply(TransactionResult<AccessContext> transactionResult) {
        ((AccessContext) transactionResult.getResult()).getAccessToken();
        return this.this$0.client.getUserProfile(this.$transaction, ((AccessContext) transactionResult.getResult()).getAccessToken(), this.$profile.getProfileId(), this.$type);
    }
}
