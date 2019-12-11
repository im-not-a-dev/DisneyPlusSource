package com.bamtech.sdk4.internal.identity.bam;

import com.bamtech.sdk4.identity.bam.OneTimePasscodeRequestReason;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import kotlin.C12907r;
import kotlin.Metadata;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Completable;", "it", "", "Lcom/bamtech/sdk4/core/types/JWT;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: AuthenticationManager.kt */
final class DefaultAuthenticationManager$requestOneTimePasscode$1<T, R> implements Function<String, CompletableSource> {
    final /* synthetic */ String $email;
    final /* synthetic */ OneTimePasscodeRequestReason $reason;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultAuthenticationManager this$0;

    DefaultAuthenticationManager$requestOneTimePasscode$1(DefaultAuthenticationManager defaultAuthenticationManager, ServiceTransaction serviceTransaction, String str, OneTimePasscodeRequestReason oneTimePasscodeRequestReason) {
        this.this$0 = defaultAuthenticationManager;
        this.$transaction = serviceTransaction;
        this.$email = str;
        this.$reason = oneTimePasscodeRequestReason;
    }

    public final Completable apply(String str) {
        return this.this$0.client.requestOneTimePasscode(this.$transaction, new OneTimePasscodeRequest(this.$email, this.$reason), C13170i0.m40332a(C12907r.m40244a("{accessToken}", str)));
    }
}
