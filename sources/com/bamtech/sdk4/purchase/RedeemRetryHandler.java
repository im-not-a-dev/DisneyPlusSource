package com.bamtech.sdk4.purchase;

import com.bamtech.sdk4.internal.purchase.PurchaseClient;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.token.AccessContextUpdater;
import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import java.util.Map;
import kotlin.Metadata;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00020 0\u001fH\u0016R\u0014\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R&\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006!"}, mo31007d2 = {"Lcom/bamtech/sdk4/purchase/RedeemRetryHandler;", "Lcom/bamtech/sdk4/purchase/RetryHandler;", "purchaseClient", "Lcom/bamtech/sdk4/internal/purchase/PurchaseClient;", "serviceTransaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "receiptClaim", "Lcom/bamtech/sdk4/purchase/ReceiptClaim;", "accessTokenProvider", "Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;", "accessContextUpdater", "Lcom/bamtech/sdk4/internal/token/AccessContextUpdater;", "(Lcom/bamtech/sdk4/internal/purchase/PurchaseClient;Lcom/bamtech/sdk4/internal/service/ServiceTransaction;Lcom/bamtech/sdk4/purchase/ReceiptClaim;Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;Lcom/bamtech/sdk4/internal/token/AccessContextUpdater;)V", "getAccessContextUpdater", "()Lcom/bamtech/sdk4/internal/token/AccessContextUpdater;", "getAccessTokenProvider", "()Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;", "getPurchaseClient", "()Lcom/bamtech/sdk4/internal/purchase/PurchaseClient;", "getReceiptClaim", "()Lcom/bamtech/sdk4/purchase/ReceiptClaim;", "getServiceTransaction", "()Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "tokenMap", "", "", "getTokenMap", "()Ljava/util/Map;", "setTokenMap", "(Ljava/util/Map;)V", "run", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/purchase/PurchaseActivationResult;", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: RetryHandler.kt */
public final class RedeemRetryHandler implements RetryHandler {
    private final AccessContextUpdater accessContextUpdater;
    private final AccessTokenProvider accessTokenProvider;
    private final PurchaseClient purchaseClient;
    private final ReceiptClaim receiptClaim;
    private final ServiceTransaction serviceTransaction;

    public RedeemRetryHandler(PurchaseClient purchaseClient2, ServiceTransaction serviceTransaction2, ReceiptClaim receiptClaim2, AccessTokenProvider accessTokenProvider2, AccessContextUpdater accessContextUpdater2) {
        this.purchaseClient = purchaseClient2;
        this.serviceTransaction = serviceTransaction2;
        this.receiptClaim = receiptClaim2;
        this.accessTokenProvider = accessTokenProvider2;
        this.accessContextUpdater = accessContextUpdater2;
        C13173j0.m40350a();
    }

    public AccessContextUpdater getAccessContextUpdater() {
        return this.accessContextUpdater;
    }

    public AccessTokenProvider getAccessTokenProvider() {
        return this.accessTokenProvider;
    }

    public PurchaseClient getPurchaseClient() {
        return this.purchaseClient;
    }

    public ReceiptClaim getReceiptClaim() {
        return this.receiptClaim;
    }

    public ServiceTransaction getServiceTransaction() {
        return this.serviceTransaction;
    }

    public Single<? extends PurchaseActivationResult> run() {
        return RetryHandlerKt.executeRetry(getServiceTransaction(), getAccessTokenProvider(), getAccessContextUpdater(), getReceiptClaim(), new RedeemRetryHandler$run$1(this));
    }

    public void setTokenMap(Map<String, String> map) {
    }
}
