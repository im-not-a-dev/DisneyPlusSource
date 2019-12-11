package com.bamtech.sdk4.internal.purchase;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.purchase.PurchaseActivationResult;
import com.bamtech.sdk4.purchase.ReceiptClaimBody;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12881k;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/purchase/PurchaseActivationResult;", "tokenMap", "", "", "purchaseClaim", "Lcom/bamtech/sdk4/purchase/ReceiptClaimBody;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: PurchaseManager.kt */
final class DefaultPurchaseManager$restoreReceipt$1 extends C12881k implements Function2<Map<String, ? extends String>, ReceiptClaimBody, Single<? extends PurchaseActivationResult>> {
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultPurchaseManager this$0;

    DefaultPurchaseManager$restoreReceipt$1(DefaultPurchaseManager defaultPurchaseManager, ServiceTransaction serviceTransaction) {
        this.this$0 = defaultPurchaseManager;
        this.$transaction = serviceTransaction;
        super(2);
    }

    public final Single<? extends PurchaseActivationResult> invoke(Map<String, String> map, ReceiptClaimBody receiptClaimBody) {
        return this.this$0.client.restore(this.$transaction, map, receiptClaimBody);
    }
}
