package com.bamtech.sdk4.purchase;

import com.bamtech.core.annotations.android.DontObfuscate;
import com.bamtech.sdk4.internal.service.ServiceError;
import java.util.List;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, mo31007d2 = {"Lcom/bamtech/sdk4/purchase/PurchaseActivation;", "", "reason", "Lcom/bamtech/sdk4/internal/service/ServiceError;", "sku", "", "products", "", "status", "Lcom/bamtech/sdk4/purchase/ActivationStatus;", "(Lcom/bamtech/sdk4/internal/service/ServiceError;Ljava/lang/String;Ljava/util/List;Lcom/bamtech/sdk4/purchase/ActivationStatus;)V", "getProducts", "()Ljava/util/List;", "getReason", "()Lcom/bamtech/sdk4/internal/service/ServiceError;", "getSku", "()Ljava/lang/String;", "getStatus", "()Lcom/bamtech/sdk4/purchase/ActivationStatus;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PurchaseActivationResult.kt */
public final class PurchaseActivation {
    private final List<String> products;
    private final ServiceError reason;
    private final String sku;
    private final ActivationStatus status;

    public PurchaseActivation(ServiceError serviceError, String str, List<String> list, ActivationStatus activationStatus) {
        this.reason = serviceError;
        this.sku = str;
        this.products = list;
        this.status = activationStatus;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<java.lang.String>, for r3v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.bamtech.sdk4.purchase.PurchaseActivation copy$default(com.bamtech.sdk4.purchase.PurchaseActivation r0, com.bamtech.sdk4.internal.service.ServiceError r1, java.lang.String r2, java.util.List<java.lang.String> r3, com.bamtech.sdk4.purchase.ActivationStatus r4, int r5, java.lang.Object r6) {
        /*
            r6 = r5 & 1
            if (r6 == 0) goto L_0x0006
            com.bamtech.sdk4.internal.service.ServiceError r1 = r0.reason
        L_0x0006:
            r6 = r5 & 2
            if (r6 == 0) goto L_0x000c
            java.lang.String r2 = r0.sku
        L_0x000c:
            r6 = r5 & 4
            if (r6 == 0) goto L_0x0012
            java.util.List<java.lang.String> r3 = r0.products
        L_0x0012:
            r5 = r5 & 8
            if (r5 == 0) goto L_0x0018
            com.bamtech.sdk4.purchase.ActivationStatus r4 = r0.status
        L_0x0018:
            com.bamtech.sdk4.purchase.PurchaseActivation r0 = r0.copy(r1, r2, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.purchase.PurchaseActivation.copy$default(com.bamtech.sdk4.purchase.PurchaseActivation, com.bamtech.sdk4.internal.service.ServiceError, java.lang.String, java.util.List, com.bamtech.sdk4.purchase.ActivationStatus, int, java.lang.Object):com.bamtech.sdk4.purchase.PurchaseActivation");
    }

    public final ServiceError component1() {
        return this.reason;
    }

    public final String component2() {
        return this.sku;
    }

    public final List<String> component3() {
        return this.products;
    }

    public final ActivationStatus component4() {
        return this.status;
    }

    public final PurchaseActivation copy(ServiceError serviceError, String str, List<String> list, ActivationStatus activationStatus) {
        return new PurchaseActivation(serviceError, str, list, activationStatus);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.status, (java.lang.Object) r3.status) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof com.bamtech.sdk4.purchase.PurchaseActivation
            if (r0 == 0) goto L_0x0031
            com.bamtech.sdk4.purchase.PurchaseActivation r3 = (com.bamtech.sdk4.purchase.PurchaseActivation) r3
            com.bamtech.sdk4.internal.service.ServiceError r0 = r2.reason
            com.bamtech.sdk4.internal.service.ServiceError r1 = r3.reason
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.sku
            java.lang.String r1 = r3.sku
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.util.List<java.lang.String> r0 = r2.products
            java.util.List<java.lang.String> r1 = r3.products
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0031
            com.bamtech.sdk4.purchase.ActivationStatus r0 = r2.status
            com.bamtech.sdk4.purchase.ActivationStatus r3 = r3.status
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            return r3
        L_0x0033:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.purchase.PurchaseActivation.equals(java.lang.Object):boolean");
    }

    public final List<String> getProducts() {
        return this.products;
    }

    public final ServiceError getReason() {
        return this.reason;
    }

    public final String getSku() {
        return this.sku;
    }

    public final ActivationStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        ServiceError serviceError = this.reason;
        int i = 0;
        int hashCode = (serviceError != null ? serviceError.hashCode() : 0) * 31;
        String str = this.sku;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List<String> list = this.products;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        ActivationStatus activationStatus = this.status;
        if (activationStatus != null) {
            i = activationStatus.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PurchaseActivation(reason=");
        sb.append(this.reason);
        sb.append(", sku=");
        sb.append(this.sku);
        sb.append(", products=");
        sb.append(this.products);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(")");
        return sb.toString();
    }
}
