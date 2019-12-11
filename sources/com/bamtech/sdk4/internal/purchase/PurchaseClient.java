package com.bamtech.sdk4.internal.purchase;

import com.bamtech.sdk4.internal.configuration.RetryPolicy;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.purchase.PurchaseActivationResult;
import com.bamtech.sdk4.purchase.ReceiptClaimBody;
import java.util.Map;
import kotlin.Metadata;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J4\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH&J4\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000f"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/purchase/PurchaseClient;", "", "getRetryPolicy", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/internal/configuration/RetryPolicy;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "redeem", "Lcom/bamtech/sdk4/purchase/PurchaseActivationResult;", "tokenMap", "", "", "payload", "Lcom/bamtech/sdk4/purchase/ReceiptClaimBody;", "restore", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PurchaseClient.kt */
public interface PurchaseClient {
    Single<RetryPolicy> getRetryPolicy(ServiceTransaction serviceTransaction);

    Single<? extends PurchaseActivationResult> redeem(ServiceTransaction serviceTransaction, Map<String, String> map, ReceiptClaimBody receiptClaimBody);

    Single<? extends PurchaseActivationResult> restore(ServiceTransaction serviceTransaction, Map<String, String> map, ReceiptClaimBody receiptClaimBody);
}
