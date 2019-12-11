package com.bamtech.sdk4.internal.purchase;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.token.AccessContextUpdater;
import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import com.bamtech.sdk4.purchase.AccessStatus;
import com.bamtech.sdk4.purchase.PurchaseActivationResult;
import com.bamtech.sdk4.purchase.ReceiptClaim;
import com.bamtech.sdk4.purchase.ReceiptClaimBody;
import com.bamtech.sdk4.purchase.RedeemRetryHandler;
import com.bamtech.sdk4.purchase.RestoreRetryHandler;
import com.bamtech.sdk4.purchase.RetryHandler;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJt\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112J\u0010\u0012\u001aF\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001a\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n0\u0013H\u0002J.\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u000e\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\nH\u0002J\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u000fH\u0016J(\u0010\u001f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u000fH\u0016J(\u0010!\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/purchase/DefaultPurchaseManager;", "Lcom/bamtech/sdk4/internal/purchase/PurchaseManager;", "tokenProvider", "Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;", "client", "Lcom/bamtech/sdk4/internal/purchase/PurchaseClient;", "updater", "Lcom/bamtech/sdk4/internal/token/AccessContextUpdater;", "(Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;Lcom/bamtech/sdk4/internal/purchase/PurchaseClient;Lcom/bamtech/sdk4/internal/token/AccessContextUpdater;)V", "executeReceipt", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/purchase/PurchaseActivationResult;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "receiptClaim", "Lcom/bamtech/sdk4/purchase/ReceiptClaim;", "retryHandler", "Lcom/bamtech/sdk4/purchase/RetryHandler;", "operation", "Lkotlin/Function2;", "", "", "Lkotlin/ParameterName;", "name", "tokenMap", "Lcom/bamtech/sdk4/purchase/ReceiptClaimBody;", "claim", "getAccessStatus", "Lcom/bamtech/sdk4/purchase/AccessStatus;", "activationResult", "redeem", "redeemReceipt", "restore", "restoreReceipt", "Companion", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PurchaseManager.kt */
public final class DefaultPurchaseManager implements PurchaseManager {
    /* access modifiers changed from: private */
    public final PurchaseClient client;
    private final AccessTokenProvider tokenProvider;
    /* access modifiers changed from: private */
    public final AccessContextUpdater updater;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/purchase/DefaultPurchaseManager$Companion;", "", "()V", "KEY_STORE", "", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: PurchaseManager.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new Companion(null);
    }

    public DefaultPurchaseManager(AccessTokenProvider accessTokenProvider, PurchaseClient purchaseClient, AccessContextUpdater accessContextUpdater) {
        this.tokenProvider = accessTokenProvider;
        this.client = purchaseClient;
        this.updater = accessContextUpdater;
    }

    private final Single<? extends PurchaseActivationResult> executeReceipt(ServiceTransaction serviceTransaction, ReceiptClaim receiptClaim, RetryHandler retryHandler, Function2<? super Map<String, String>, ? super ReceiptClaimBody, ? extends Single<? extends PurchaseActivationResult>> function2) {
        Single<? extends PurchaseActivationResult> a = this.tokenProvider.getAccessToken(serviceTransaction).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new DefaultPurchaseManager$executeReceipt$1<Object,Object>(receiptClaim, retryHandler, function2, receiptClaim.getClaimBody())).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new DefaultPurchaseManager$executeReceipt$2<Object,Object>(this, serviceTransaction));
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "tokenProvider.getAccessT…ponse }\n                }");
        return a;
    }

    private final Single<AccessStatus> getAccessStatus(ServiceTransaction serviceTransaction, RetryHandler retryHandler, Single<? extends PurchaseActivationResult> single) {
        Single<AccessStatus> a = single.mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new DefaultPurchaseManager$getAccessStatus$1<Object,Object>(this, serviceTransaction, retryHandler));
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "activationResult\n       …tion) }\n                }");
        return a;
    }

    public Single<AccessStatus> redeem(ServiceTransaction serviceTransaction, ReceiptClaim receiptClaim) {
        RedeemRetryHandler redeemRetryHandler = new RedeemRetryHandler(this.client, serviceTransaction, receiptClaim, this.tokenProvider, this.updater);
        return getAccessStatus(serviceTransaction, redeemRetryHandler, redeemReceipt(serviceTransaction, receiptClaim, redeemRetryHandler));
    }

    public Single<? extends PurchaseActivationResult> redeemReceipt(ServiceTransaction serviceTransaction, ReceiptClaim receiptClaim, RetryHandler retryHandler) {
        return executeReceipt(serviceTransaction, receiptClaim, retryHandler, new DefaultPurchaseManager$redeemReceipt$1(this, serviceTransaction));
    }

    public Single<AccessStatus> restore(ServiceTransaction serviceTransaction, ReceiptClaim receiptClaim) {
        RestoreRetryHandler restoreRetryHandler = new RestoreRetryHandler(this.client, serviceTransaction, receiptClaim, this.tokenProvider, this.updater);
        return getAccessStatus(serviceTransaction, restoreRetryHandler, restoreReceipt(serviceTransaction, receiptClaim, restoreRetryHandler));
    }

    public Single<? extends PurchaseActivationResult> restoreReceipt(ServiceTransaction serviceTransaction, ReceiptClaim receiptClaim, RetryHandler retryHandler) {
        return executeReceipt(serviceTransaction, receiptClaim, retryHandler, new DefaultPurchaseManager$restoreReceipt$1(this, serviceTransaction));
    }
}
