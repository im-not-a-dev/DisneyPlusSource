package com.bamtech.sdk4.internal.subscription;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import kotlin.C12907r;
import kotlin.Metadata;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Completable;", "it", "", "Lcom/bamtech/sdk4/core/types/JWT;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: SubscriptionManager.kt */
final class DefaultSubscriptionManager$linkSubscriptionsFromDevice$1<T, R> implements Function<String, CompletableSource> {
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultSubscriptionManager this$0;

    DefaultSubscriptionManager$linkSubscriptionsFromDevice$1(DefaultSubscriptionManager defaultSubscriptionManager, ServiceTransaction serviceTransaction) {
        this.this$0 = defaultSubscriptionManager;
        this.$transaction = serviceTransaction;
    }

    public final Completable apply(String str) {
        return this.this$0.client.linkSubscriptionsFromDevice(this.$transaction, C13170i0.m40332a(C12907r.m40244a("{accessToken}", str)));
    }
}
