package com.bamtech.sdk4.extension.account;

import com.bamtech.core.logging.LogDispatcher.DefaultImpls;
import com.bamtech.sdk4.identity.IdentityToken;
import com.bamtech.sdk4.internal.account.CreateAccountRequest;
import com.bamtech.sdk4.internal.account.CreateAccountResult;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import kotlin.C12907r;
import kotlin.Metadata;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u001a\u0012\u0016\u0012\u0014 \u0004*\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00030\u0002j\u0002`\u00030\u0001\"\u0004\b\u0000\u0010\u00052\n\u0010\u0006\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0002\b\u0007"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "", "Lcom/bamtech/sdk4/core/types/JWT;", "kotlin.jvm.PlatformType", "T", "accessToken", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: AccountExtension.kt */
final class DefaultAccountExtension$createAccount$1<T, R> implements Function<T, SingleSource<? extends R>> {
    final /* synthetic */ Object $attributes;
    final /* synthetic */ IdentityToken $identityToken;
    final /* synthetic */ boolean $isTest;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultAccountExtension this$0;

    DefaultAccountExtension$createAccount$1(DefaultAccountExtension defaultAccountExtension, ServiceTransaction serviceTransaction, IdentityToken identityToken, Object obj, boolean z) {
        this.this$0 = defaultAccountExtension;
        this.$transaction = serviceTransaction;
        this.$identityToken = identityToken;
        this.$attributes = obj;
        this.$isTest = z;
    }

    public final Single<String> apply(final String str) {
        DefaultImpls.d$default(this.$transaction, this.this$0, "AccessToken retrieved", str, false, 8, null);
        return this.this$0.client.createAccount(this.$transaction, C13170i0.m40332a(C12907r.m40244a("{accessToken}", str)), new CreateAccountRequest(this.$identityToken.getToken(), this.$attributes, C13170i0.m40332a(C12907r.m40244a("isTest", Boolean.valueOf(this.$isTest))))).mo30233g(new Function<T, R>() {
            public final String apply(CreateAccountResult createAccountResult) {
                return str;
            }
        });
    }
}
