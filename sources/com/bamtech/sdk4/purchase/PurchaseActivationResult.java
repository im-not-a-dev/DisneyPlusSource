package com.bamtech.sdk4.purchase;

import com.bamtech.core.annotations.android.DontObfuscate;
import com.bamtech.sdk4.internal.service.ServiceError;
import java.util.List;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\t\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0003H&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0001\u0002\u000b\f¨\u0006\r"}, mo31007d2 = {"Lcom/bamtech/sdk4/purchase/PurchaseActivationResult;", "", "needsRefresh", "", "(Z)V", "getNeedsRefresh", "()Z", "copy", "refresh", "PurchaseFailureActivationResult", "PurchaseSuccessActivationResult", "Lcom/bamtech/sdk4/purchase/PurchaseActivationResult$PurchaseSuccessActivationResult;", "Lcom/bamtech/sdk4/purchase/PurchaseActivationResult$PurchaseFailureActivationResult;", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PurchaseActivationResult.kt */
public abstract class PurchaseActivationResult {
    private final boolean needsRefresh;

    @DontObfuscate
    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u0010\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0003H\u0016J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, mo31007d2 = {"Lcom/bamtech/sdk4/purchase/PurchaseActivationResult$PurchaseFailureActivationResult;", "Lcom/bamtech/sdk4/purchase/PurchaseActivationResult;", "needsRefresh", "", "temporaryAccessGranted", "errors", "", "Lcom/bamtech/sdk4/internal/service/ServiceError;", "(ZZLjava/util/List;)V", "getErrors", "()Ljava/util/List;", "getTemporaryAccessGranted", "()Z", "copy", "refresh", "equals", "other", "", "hashCode", "", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: PurchaseActivationResult.kt */
    public static final class PurchaseFailureActivationResult extends PurchaseActivationResult {
        private final List<ServiceError> errors;
        private final boolean temporaryAccessGranted;

        public PurchaseFailureActivationResult(boolean z, boolean z2, List<ServiceError> list) {
            super(z, null);
            this.temporaryAccessGranted = z2;
            this.errors = list;
        }

        public PurchaseActivationResult copy(boolean z) {
            return new PurchaseFailureActivationResult(z, this.temporaryAccessGranted, this.errors);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!C12880j.m40224a((Object) PurchaseFailureActivationResult.class, (Object) obj != null ? obj.getClass() : null)) {
                return false;
            }
            if (obj != null) {
                PurchaseFailureActivationResult purchaseFailureActivationResult = (PurchaseFailureActivationResult) obj;
                return getNeedsRefresh() == purchaseFailureActivationResult.getNeedsRefresh() && this.temporaryAccessGranted == purchaseFailureActivationResult.temporaryAccessGranted && !(C12880j.m40224a((Object) this.errors, (Object) purchaseFailureActivationResult.errors) ^ true);
            }
            throw new C13142s("null cannot be cast to non-null type com.bamtech.sdk4.purchase.PurchaseActivationResult.PurchaseFailureActivationResult");
        }

        public final List<ServiceError> getErrors() {
            return this.errors;
        }

        public final boolean getTemporaryAccessGranted() {
            return this.temporaryAccessGranted;
        }

        public int hashCode() {
            return Boolean.valueOf(this.temporaryAccessGranted).hashCode();
        }

        public /* synthetic */ PurchaseFailureActivationResult(boolean z, boolean z2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 4) != 0) {
                list = null;
            }
            this(z, z2, list);
        }
    }

    @DontObfuscate
    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\u0010\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0003H\u0016J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0014"}, mo31007d2 = {"Lcom/bamtech/sdk4/purchase/PurchaseActivationResult$PurchaseSuccessActivationResult;", "Lcom/bamtech/sdk4/purchase/PurchaseActivationResult;", "needsRefresh", "", "invalid", "", "Lcom/bamtech/sdk4/internal/service/ServiceError;", "purchases", "Lcom/bamtech/sdk4/purchase/PurchaseActivation;", "(ZLjava/util/List;Ljava/util/List;)V", "getInvalid", "()Ljava/util/List;", "getPurchases", "copy", "refresh", "equals", "other", "", "hashCode", "", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: PurchaseActivationResult.kt */
    public static final class PurchaseSuccessActivationResult extends PurchaseActivationResult {
        private final List<ServiceError> invalid;
        private final List<PurchaseActivation> purchases;

        public /* synthetic */ PurchaseSuccessActivationResult(boolean z, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 2) != 0) {
                list = C13185o.m40513a();
            }
            if ((i & 4) != 0) {
                list2 = C13185o.m40513a();
            }
            this(z, list, list2);
        }

        public PurchaseActivationResult copy(boolean z) {
            return new PurchaseSuccessActivationResult(z, this.invalid, this.purchases);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!C12880j.m40224a((Object) PurchaseSuccessActivationResult.class, (Object) obj != null ? obj.getClass() : null)) {
                return false;
            }
            if (obj != null) {
                PurchaseSuccessActivationResult purchaseSuccessActivationResult = (PurchaseSuccessActivationResult) obj;
                return getNeedsRefresh() == purchaseSuccessActivationResult.getNeedsRefresh() && !(C12880j.m40224a((Object) this.invalid, (Object) purchaseSuccessActivationResult.invalid) ^ true) && !(C12880j.m40224a((Object) this.purchases, (Object) purchaseSuccessActivationResult.purchases) ^ true);
            }
            throw new C13142s("null cannot be cast to non-null type com.bamtech.sdk4.purchase.PurchaseActivationResult.PurchaseSuccessActivationResult");
        }

        public final List<ServiceError> getInvalid() {
            return this.invalid;
        }

        public final List<PurchaseActivation> getPurchases() {
            return this.purchases;
        }

        public int hashCode() {
            List<ServiceError> list = this.invalid;
            int i = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            List<PurchaseActivation> list2 = this.purchases;
            if (list2 != null) {
                i = list2.hashCode();
            }
            return hashCode + i;
        }

        public PurchaseSuccessActivationResult(boolean z, List<ServiceError> list, List<PurchaseActivation> list2) {
            super(z, null);
            this.invalid = list;
            this.purchases = list2;
        }
    }

    private PurchaseActivationResult(boolean z) {
        this.needsRefresh = z;
    }

    public abstract PurchaseActivationResult copy(boolean z);

    public final boolean getNeedsRefresh() {
        return this.needsRefresh;
    }

    public /* synthetic */ PurchaseActivationResult(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(z);
    }
}
