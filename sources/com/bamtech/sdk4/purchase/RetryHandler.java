package com.bamtech.sdk4.purchase;

import java.util.Map;
import kotlin.Metadata;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001f0\u001eH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u0017X¦\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006 "}, mo31007d2 = {"Lcom/bamtech/sdk4/purchase/RetryHandler;", "", "accessContextUpdater", "Lcom/bamtech/sdk4/internal/token/AccessContextUpdater;", "getAccessContextUpdater", "()Lcom/bamtech/sdk4/internal/token/AccessContextUpdater;", "accessTokenProvider", "Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;", "getAccessTokenProvider", "()Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;", "purchaseClient", "Lcom/bamtech/sdk4/internal/purchase/PurchaseClient;", "getPurchaseClient", "()Lcom/bamtech/sdk4/internal/purchase/PurchaseClient;", "receiptClaim", "Lcom/bamtech/sdk4/purchase/ReceiptClaim;", "getReceiptClaim", "()Lcom/bamtech/sdk4/purchase/ReceiptClaim;", "serviceTransaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "getServiceTransaction", "()Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "tokenMap", "", "", "getTokenMap", "()Ljava/util/Map;", "setTokenMap", "(Ljava/util/Map;)V", "run", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/purchase/PurchaseActivationResult;", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: RetryHandler.kt */
public interface RetryHandler {
    Single<? extends PurchaseActivationResult> run();

    void setTokenMap(Map<String, String> map);
}
