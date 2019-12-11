package com.bamtech.sdk4.extension.account;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import kotlin.Metadata;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\n¢\u0006\u0002\b\u0007"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "T", "Lcom/bamtech/sdk4/account/UserProfile;", "accessToken", "", "Lcom/bamtech/sdk4/core/types/JWT;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: UserProfileExtension.kt */
final class DefaultUserProfileExtension$getActiveUserProfile$1<T, R> implements Function<T, SingleSource<? extends R>> {
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ Class $type;
    final /* synthetic */ DefaultUserProfileExtension this$0;

    DefaultUserProfileExtension$getActiveUserProfile$1(DefaultUserProfileExtension defaultUserProfileExtension, ServiceTransaction serviceTransaction, Class cls) {
        this.this$0 = defaultUserProfileExtension;
        this.$transaction = serviceTransaction;
        this.$type = cls;
    }

    public final Single<? extends T> apply(String str) {
        return this.this$0.client.getActiveUserProfile(this.$transaction, str, this.$type);
    }
}
