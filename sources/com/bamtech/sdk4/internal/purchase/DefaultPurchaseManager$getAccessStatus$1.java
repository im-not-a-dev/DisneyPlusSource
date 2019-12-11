package com.bamtech.sdk4.internal.purchase;

import com.bamtech.sdk4.internal.configuration.RetryPolicy;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.purchase.AccessStatus;
import com.bamtech.sdk4.purchase.PurchaseActivationResult;
import com.bamtech.sdk4.purchase.RetryHandler;
import kotlin.Metadata;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/purchase/AccessStatus;", "kotlin.jvm.PlatformType", "result", "Lcom/bamtech/sdk4/purchase/PurchaseActivationResult;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: PurchaseManager.kt */
final class DefaultPurchaseManager$getAccessStatus$1<T, R> implements Function<T, SingleSource<? extends R>> {
    final /* synthetic */ RetryHandler $retryHandler;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultPurchaseManager this$0;

    DefaultPurchaseManager$getAccessStatus$1(DefaultPurchaseManager defaultPurchaseManager, ServiceTransaction serviceTransaction, RetryHandler retryHandler) {
        this.this$0 = defaultPurchaseManager;
        this.$transaction = serviceTransaction;
        this.$retryHandler = retryHandler;
    }

    public final Single<AccessStatus> apply(final PurchaseActivationResult purchaseActivationResult) {
        return this.this$0.client.getRetryPolicy(this.$transaction).mo30233g(new Function<T, R>(this) {
            final /* synthetic */ DefaultPurchaseManager$getAccessStatus$1 this$0;

            {
                this.this$0 = r1;
            }

            public final AccessStatus apply(RetryPolicy retryPolicy) {
                PurchaseActivationResult purchaseActivationResult = purchaseActivationResult;
                DefaultPurchaseManager$getAccessStatus$1 defaultPurchaseManager$getAccessStatus$1 = this.this$0;
                return new AccessStatus(purchaseActivationResult, retryPolicy, defaultPurchaseManager$getAccessStatus$1.$retryHandler, defaultPurchaseManager$getAccessStatus$1.$transaction);
            }
        });
    }
}
