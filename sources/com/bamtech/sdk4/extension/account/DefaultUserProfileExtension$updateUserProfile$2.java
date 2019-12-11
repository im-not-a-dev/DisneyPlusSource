package com.bamtech.sdk4.extension.account;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.service.TransactionResult;
import com.bamtech.sdk4.token.AccessContext;
import kotlin.Metadata;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001\"\b\b\u0000\u0010\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/internal/service/TransactionResult;", "Lcom/bamtech/sdk4/token/AccessContext;", "T", "Lcom/bamtech/sdk4/account/UserProfile;", "needsRefresh", "", "apply", "(Ljava/lang/Boolean;)Lio/reactivex/Single;"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: UserProfileExtension.kt */
final class DefaultUserProfileExtension$updateUserProfile$2<T, R> implements Function<T, SingleSource<? extends R>> {
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultUserProfileExtension this$0;

    DefaultUserProfileExtension$updateUserProfile$2(DefaultUserProfileExtension defaultUserProfileExtension, ServiceTransaction serviceTransaction) {
        this.this$0 = defaultUserProfileExtension;
        this.$transaction = serviceTransaction;
    }

    public final Single<TransactionResult<AccessContext>> apply(Boolean bool) {
        return this.this$0.updater.getOrUpdate(this.$transaction, bool.booleanValue());
    }
}
