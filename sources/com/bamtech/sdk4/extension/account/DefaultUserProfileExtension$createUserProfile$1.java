package com.bamtech.sdk4.extension.account;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import kotlin.Metadata;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u0004\b\u0001\u0010\u0004\"\u0004\b\u0002\u0010\u00052\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\n¢\u0006\u0002\b\t"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "T", "Lcom/bamtech/sdk4/account/UserProfile;", "U", "V", "accessToken", "", "Lcom/bamtech/sdk4/core/types/JWT;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: UserProfileExtension.kt */
final class DefaultUserProfileExtension$createUserProfile$1<T, R> implements Function<T, SingleSource<? extends R>> {
    final /* synthetic */ Object $attributes;
    final /* synthetic */ Object $metadata;
    final /* synthetic */ String $profileName;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ Class $type;
    final /* synthetic */ DefaultUserProfileExtension this$0;

    DefaultUserProfileExtension$createUserProfile$1(DefaultUserProfileExtension defaultUserProfileExtension, ServiceTransaction serviceTransaction, String str, Object obj, Object obj2, Class cls) {
        this.this$0 = defaultUserProfileExtension;
        this.$transaction = serviceTransaction;
        this.$profileName = str;
        this.$attributes = obj;
        this.$metadata = obj2;
        this.$type = cls;
    }

    public final Single<T> apply(String str) {
        return this.this$0.client.createUserProfile(this.$transaction, str, this.$profileName, this.$attributes, this.$metadata, this.$type);
    }
}
