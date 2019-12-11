package com.bamtech.sdk4.internal.purchase;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.purchase.AccessStatus;
import com.bamtech.sdk4.purchase.ReceiptClaim;
import kotlin.Metadata;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J(\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH&J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J(\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\u000f"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/purchase/PurchaseManager;", "", "redeem", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/purchase/AccessStatus;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "claim", "Lcom/bamtech/sdk4/purchase/ReceiptClaim;", "redeemReceipt", "Lcom/bamtech/sdk4/purchase/PurchaseActivationResult;", "retryHandler", "Lcom/bamtech/sdk4/purchase/RetryHandler;", "restore", "restoreReceipt", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PurchaseManager.kt */
public interface PurchaseManager {
    Single<AccessStatus> redeem(ServiceTransaction serviceTransaction, ReceiptClaim receiptClaim);

    Single<AccessStatus> restore(ServiceTransaction serviceTransaction, ReceiptClaim receiptClaim);
}
