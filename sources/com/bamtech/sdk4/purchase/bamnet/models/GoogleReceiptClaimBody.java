package com.bamtech.sdk4.purchase.bamnet.models;

import com.bamtech.core.annotations.android.DontObfuscate;
import java.util.List;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, mo31007d2 = {"Lcom/bamtech/sdk4/purchase/bamnet/models/GoogleReceiptClaimBody;", "Lcom/bamtech/sdk4/purchase/bamnet/models/BamnetReceiptClaimBody;", "receipts", "", "Lcom/bamtech/sdk4/purchase/bamnet/models/BamnetReceiptItem;", "(Ljava/util/List;)V", "getReceipts", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "plugin-iap-bamnet_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: BamnetReceiptClaimBody.kt */
public final class GoogleReceiptClaimBody extends BamnetReceiptClaimBody {
    private final List<BamnetReceiptItem> receipts;

    public GoogleReceiptClaimBody(List<? extends BamnetReceiptItem> list) {
        super(null);
        this.receipts = list;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.bamtech.sdk4.purchase.bamnet.models.BamnetReceiptItem>, for r1v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.bamtech.sdk4.purchase.bamnet.models.GoogleReceiptClaimBody copy$default(com.bamtech.sdk4.purchase.bamnet.models.GoogleReceiptClaimBody r0, java.util.List<com.bamtech.sdk4.purchase.bamnet.models.BamnetReceiptItem> r1, int r2, java.lang.Object r3) {
        /*
            r2 = r2 & 1
            if (r2 == 0) goto L_0x0006
            java.util.List<com.bamtech.sdk4.purchase.bamnet.models.BamnetReceiptItem> r1 = r0.receipts
        L_0x0006:
            com.bamtech.sdk4.purchase.bamnet.models.GoogleReceiptClaimBody r0 = r0.copy(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.purchase.bamnet.models.GoogleReceiptClaimBody.copy$default(com.bamtech.sdk4.purchase.bamnet.models.GoogleReceiptClaimBody, java.util.List, int, java.lang.Object):com.bamtech.sdk4.purchase.bamnet.models.GoogleReceiptClaimBody");
    }

    public final List<BamnetReceiptItem> component1() {
        return this.receipts;
    }

    public final GoogleReceiptClaimBody copy(List<? extends BamnetReceiptItem> list) {
        return new GoogleReceiptClaimBody(list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r1.receipts, (java.lang.Object) ((com.bamtech.sdk4.purchase.bamnet.models.GoogleReceiptClaimBody) r2).receipts) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.bamtech.sdk4.purchase.bamnet.models.GoogleReceiptClaimBody
            if (r0 == 0) goto L_0x0013
            com.bamtech.sdk4.purchase.bamnet.models.GoogleReceiptClaimBody r2 = (com.bamtech.sdk4.purchase.bamnet.models.GoogleReceiptClaimBody) r2
            java.util.List<com.bamtech.sdk4.purchase.bamnet.models.BamnetReceiptItem> r0 = r1.receipts
            java.util.List<com.bamtech.sdk4.purchase.bamnet.models.BamnetReceiptItem> r2 = r2.receipts
            boolean r2 = kotlin.jvm.internal.C12880j.m40224a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.purchase.bamnet.models.GoogleReceiptClaimBody.equals(java.lang.Object):boolean");
    }

    public final List<BamnetReceiptItem> getReceipts() {
        return this.receipts;
    }

    public int hashCode() {
        List<BamnetReceiptItem> list = this.receipts;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GoogleReceiptClaimBody(receipts=");
        sb.append(this.receipts);
        sb.append(")");
        return sb.toString();
    }
}
