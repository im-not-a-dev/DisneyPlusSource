package com.bamtech.sdk4.purchase;

import kotlin.Metadata;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\b"}, mo31007d2 = {"Lcom/bamtech/sdk4/purchase/PurchaseExtension;", "", "redeem", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/purchase/AccessStatus;", "claim", "Lcom/bamtech/sdk4/purchase/ReceiptClaim;", "restore", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PurchaseExtension.kt */
public interface PurchaseExtension {
    Single<AccessStatus> redeem(ReceiptClaim receiptClaim);

    Single<AccessStatus> restore(ReceiptClaim receiptClaim);
}
