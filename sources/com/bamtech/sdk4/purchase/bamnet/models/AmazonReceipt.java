package com.bamtech.sdk4.purchase.bamnet.models;

import com.bamtech.core.annotations.android.DontObfuscate;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtech/sdk4/purchase/bamnet/models/AmazonReceipt;", "Lcom/bamtech/sdk4/purchase/bamnet/models/BamnetReceiptItem;", "receiptId", "", "(Ljava/lang/String;)V", "getReceiptId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "plugin-iap-bamnet_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: BamnetReceiptItem.kt */
public final class AmazonReceipt extends BamnetReceiptItem {
    private final String receiptId;

    public AmazonReceipt(String str) {
        super(null);
        this.receiptId = str;
    }

    public static /* synthetic */ AmazonReceipt copy$default(AmazonReceipt amazonReceipt, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = amazonReceipt.receiptId;
        }
        return amazonReceipt.copy(str);
    }

    public final String component1() {
        return this.receiptId;
    }

    public final AmazonReceipt copy(String str) {
        return new AmazonReceipt(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r1.receiptId, (java.lang.Object) ((com.bamtech.sdk4.purchase.bamnet.models.AmazonReceipt) r2).receiptId) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.bamtech.sdk4.purchase.bamnet.models.AmazonReceipt
            if (r0 == 0) goto L_0x0013
            com.bamtech.sdk4.purchase.bamnet.models.AmazonReceipt r2 = (com.bamtech.sdk4.purchase.bamnet.models.AmazonReceipt) r2
            java.lang.String r0 = r1.receiptId
            java.lang.String r2 = r2.receiptId
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
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.purchase.bamnet.models.AmazonReceipt.equals(java.lang.Object):boolean");
    }

    public final String getReceiptId() {
        return this.receiptId;
    }

    public int hashCode() {
        String str = this.receiptId;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AmazonReceipt(receiptId=");
        sb.append(this.receiptId);
        sb.append(")");
        return sb.toString();
    }
}
