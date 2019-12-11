package com.bamtech.sdk4.internal.purchase;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.service.TransactionResult;
import com.bamtech.sdk4.purchase.PurchaseActivationResult;
import com.bamtech.sdk4.token.AccessContext;
import kotlin.Metadata;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/purchase/PurchaseActivationResult;", "kotlin.jvm.PlatformType", "response", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: PurchaseManager.kt */
final class DefaultPurchaseManager$executeReceipt$2<T, R> implements Function<T, SingleSource<? extends R>> {
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultPurchaseManager this$0;

    DefaultPurchaseManager$executeReceipt$2(DefaultPurchaseManager defaultPurchaseManager, ServiceTransaction serviceTransaction) {
        this.this$0 = defaultPurchaseManager;
        this.$transaction = serviceTransaction;
    }

    public final Single<PurchaseActivationResult> apply(final PurchaseActivationResult purchaseActivationResult) {
        return this.this$0.updater.getOrUpdate(this.$transaction, purchaseActivationResult.getNeedsRefresh()).mo30233g(new Function<T, R>() {
            public final PurchaseActivationResult apply(TransactionResult<AccessContext> transactionResult) {
                return purchaseActivationResult;
            }
        });
    }
}
