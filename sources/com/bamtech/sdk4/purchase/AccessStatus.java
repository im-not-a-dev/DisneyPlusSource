package com.bamtech.sdk4.purchase;

import com.bamtech.core.annotations.android.DontObfuscate;
import com.bamtech.sdk4.internal.configuration.RetryPolicy;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.purchase.PurchaseActivationResult.PurchaseFailureActivationResult;
import com.bamtech.sdk4.purchase.PurchaseActivationResult.PurchaseSuccessActivationResult;
import com.bamtech.sdk4.service.ErrorReason;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Completable;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nBE\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\u0014J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030 H\u0002R\u000e\u0010\u0013\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001bR\u000e\u0010\u0012\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, mo31007d2 = {"Lcom/bamtech/sdk4/purchase/AccessStatus;", "Ljava/io/Serializable;", "result", "Lcom/bamtech/sdk4/purchase/PurchaseActivationResult;", "retryPolicy", "Lcom/bamtech/sdk4/internal/configuration/RetryPolicy;", "retryHandler", "Lcom/bamtech/sdk4/purchase/RetryHandler;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "(Lcom/bamtech/sdk4/purchase/PurchaseActivationResult;Lcom/bamtech/sdk4/internal/configuration/RetryPolicy;Lcom/bamtech/sdk4/purchase/RetryHandler;Lcom/bamtech/sdk4/internal/service/ServiceTransaction;)V", "isTemporary", "", "invalid", "", "Lcom/bamtech/sdk4/service/ErrorReason;", "purchases", "Lcom/bamtech/sdk4/purchase/PurchaseActivation;", "policy", "handler", "(ZLjava/util/List;Ljava/util/List;Lcom/bamtech/sdk4/internal/configuration/RetryPolicy;Lcom/bamtech/sdk4/purchase/RetryHandler;Lcom/bamtech/sdk4/internal/service/ServiceTransaction;)V", "hasBecomePermanent", "Lio/reactivex/Completable;", "getHasBecomePermanent", "()Lio/reactivex/Completable;", "getInvalid", "()Ljava/util/List;", "()Z", "getPurchases", "getTransaction$extension_iap", "()Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "retry", "Lio/reactivex/Single;", "Companion", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PurchaseActivationResult.kt */
public final class AccessStatus implements Serializable {
    /* access modifiers changed from: private */
    public static final String ACTIVATION_FAILED = ACTIVATION_FAILED;
    /* access modifiers changed from: private */
    public static final String ACTIVATION_FAILED_DESCRIPTION = ACTIVATION_FAILED_DESCRIPTION;
    /* access modifiers changed from: private */
    public static final String ACTIVATION_FAILED_PERMANENTLY = ACTIVATION_FAILED_PERMANENTLY;
    /* access modifiers changed from: private */
    public static final String ACTIVATION_FAILED_PERMANENTLY_DESCRIPTION = ACTIVATION_FAILED_PERMANENTLY_DESCRIPTION;
    public static final Companion Companion = new Companion(null);
    /* access modifiers changed from: private */
    public static final String TEMPORARY_ACCESS_DESCRIPTION = TEMPORARY_ACCESS_DESCRIPTION;
    /* access modifiers changed from: private */
    public static final String TEMPORARY_ACCESS_EXCEPTION = TEMPORARY_ACCESS_EXCEPTION;
    /* access modifiers changed from: private */
    public final RetryHandler handler;
    private final Completable hasBecomePermanent;
    private final List<ErrorReason> invalid;
    private final boolean isTemporary;
    /* access modifiers changed from: private */
    public final RetryPolicy policy;
    private final List<PurchaseActivation> purchases;
    private final ServiceTransaction transaction;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006¨\u0006\u0011"}, mo31007d2 = {"Lcom/bamtech/sdk4/purchase/AccessStatus$Companion;", "", "()V", "ACTIVATION_FAILED", "", "getACTIVATION_FAILED", "()Ljava/lang/String;", "ACTIVATION_FAILED_DESCRIPTION", "getACTIVATION_FAILED_DESCRIPTION", "ACTIVATION_FAILED_PERMANENTLY", "getACTIVATION_FAILED_PERMANENTLY", "ACTIVATION_FAILED_PERMANENTLY_DESCRIPTION", "getACTIVATION_FAILED_PERMANENTLY_DESCRIPTION", "TEMPORARY_ACCESS_DESCRIPTION", "getTEMPORARY_ACCESS_DESCRIPTION", "TEMPORARY_ACCESS_EXCEPTION", "getTEMPORARY_ACCESS_EXCEPTION", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: PurchaseActivationResult.kt */
    public static final class Companion {
        private Companion() {
        }

        public final String getACTIVATION_FAILED() {
            return AccessStatus.ACTIVATION_FAILED;
        }

        public final String getACTIVATION_FAILED_DESCRIPTION() {
            return AccessStatus.ACTIVATION_FAILED_DESCRIPTION;
        }

        public final String getACTIVATION_FAILED_PERMANENTLY() {
            return AccessStatus.ACTIVATION_FAILED_PERMANENTLY;
        }

        public final String getACTIVATION_FAILED_PERMANENTLY_DESCRIPTION() {
            return AccessStatus.ACTIVATION_FAILED_PERMANENTLY_DESCRIPTION;
        }

        public final String getTEMPORARY_ACCESS_DESCRIPTION() {
            return AccessStatus.TEMPORARY_ACCESS_DESCRIPTION;
        }

        public final String getTEMPORARY_ACCESS_EXCEPTION() {
            return AccessStatus.TEMPORARY_ACCESS_EXCEPTION;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AccessStatus(boolean z, List<? extends ErrorReason> list, List<PurchaseActivation> list2, RetryPolicy retryPolicy, RetryHandler retryHandler, ServiceTransaction serviceTransaction) {
        Completable completable;
        this.isTemporary = z;
        this.invalid = list;
        this.purchases = list2;
        this.policy = retryPolicy;
        this.handler = retryHandler;
        this.transaction = serviceTransaction;
        if (this.isTemporary) {
            completable = Completable.m38160b((SingleSource<T>) retry());
            Intrinsics.checkReturnedValueIsNotNull((Object) completable, "Completable.fromSingle<P…ctivationResult>(retry())");
        } else {
            completable = Completable.m38169h();
            Intrinsics.checkReturnedValueIsNotNull((Object) completable, "Completable.complete()");
        }
        this.hasBecomePermanent = completable;
    }

    private final Single<PurchaseActivationResult> retry() {
        Single<PurchaseActivationResult> j = Single.m38396a((Callable<? extends SingleSource<? extends T>>) new AccessStatus$retry$1<Object>(this)).mo30238j(new AccessStatus$retry$2(this));
        Intrinsics.checkReturnedValueIsNotNull((Object) j, "Single.defer {\n         …      }\n                }");
        return j;
    }

    public final Completable getHasBecomePermanent() {
        return this.hasBecomePermanent;
    }

    public final List<ErrorReason> getInvalid() {
        return this.invalid;
    }

    public final List<PurchaseActivation> getPurchases() {
        return this.purchases;
    }

    public final ServiceTransaction getTransaction$extension_iap() {
        return this.transaction;
    }

    public final boolean isTemporary() {
        return this.isTemporary;
    }

    public AccessStatus(PurchaseActivationResult purchaseActivationResult, RetryPolicy retryPolicy, RetryHandler retryHandler, ServiceTransaction serviceTransaction) {
        List list;
        List list2;
        boolean z = (purchaseActivationResult instanceof PurchaseFailureActivationResult) && ((PurchaseFailureActivationResult) purchaseActivationResult).getTemporaryAccessGranted();
        boolean z2 = purchaseActivationResult instanceof PurchaseSuccessActivationResult;
        if (z2) {
            list = ((PurchaseSuccessActivationResult) purchaseActivationResult).getInvalid();
            if (list == null) {
                list = C13185o.m40513a();
            }
        } else {
            list = null;
        }
        if (z2) {
            List purchases2 = ((PurchaseSuccessActivationResult) purchaseActivationResult).getPurchases();
            if (purchases2 == null) {
                purchases2 = C13185o.m40513a();
            }
            list2 = purchases2;
        } else {
            list2 = null;
        }
        this(z, list, list2, retryPolicy, retryHandler, serviceTransaction);
    }
}
