package com.bamtech.sdk4.internal.purchase;

import com.bamtech.sdk4.purchase.PurchaseActivationResult;
import com.bamtech.sdk4.purchase.ReceiptClaim;
import com.bamtech.sdk4.purchase.ReceiptClaimBody;
import com.bamtech.sdk4.purchase.RetryHandler;
import java.util.Map;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/purchase/PurchaseActivationResult;", "key", "", "Lcom/bamtech/sdk4/core/types/JWT;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: PurchaseManager.kt */
final class DefaultPurchaseManager$executeReceipt$1<T, R> implements Function<T, SingleSource<? extends R>> {
    final /* synthetic */ ReceiptClaimBody $claim;
    final /* synthetic */ Function2 $operation;
    final /* synthetic */ ReceiptClaim $receiptClaim;
    final /* synthetic */ RetryHandler $retryHandler;

    DefaultPurchaseManager$executeReceipt$1(ReceiptClaim receiptClaim, RetryHandler retryHandler, Function2 function2, ReceiptClaimBody receiptClaimBody) {
        this.$receiptClaim = receiptClaim;
        this.$retryHandler = retryHandler;
        this.$operation = function2;
        this.$claim = receiptClaimBody;
    }

    public final Single<? extends PurchaseActivationResult> apply(String str) {
        Map a = C13173j0.m40356a(C12907r.m40244a("{store}", this.$receiptClaim.getStore()), C12907r.m40244a("{accessToken}", str));
        this.$retryHandler.setTokenMap(a);
        return (Single) this.$operation.invoke(a, this.$claim);
    }
}
