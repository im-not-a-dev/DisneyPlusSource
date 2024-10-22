package com.bamtech.sdk4.purchase.bamnet.models;

import com.bamtech.core.annotations.android.DontObfuscate;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, mo31007d2 = {"Lcom/bamtech/sdk4/purchase/bamnet/models/MockReceipt;", "Lcom/bamtech/sdk4/purchase/bamnet/models/BamnetReceiptItem;", "sku", "", "userId", "receiptId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getReceiptId", "()Ljava/lang/String;", "getSku", "getUserId", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "plugin-iap-bamnet_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: BamnetReceiptItem.kt */
public final class MockReceipt extends BamnetReceiptItem {
    private final String receiptId;
    private final String sku;
    private final String userId;

    public MockReceipt(String str, String str2, String str3) {
        super(null);
        this.sku = str;
        this.userId = str2;
        this.receiptId = str3;
    }

    public static /* synthetic */ MockReceipt copy$default(MockReceipt mockReceipt, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mockReceipt.sku;
        }
        if ((i & 2) != 0) {
            str2 = mockReceipt.userId;
        }
        if ((i & 4) != 0) {
            str3 = mockReceipt.receiptId;
        }
        return mockReceipt.copy(str, str2, str3);
    }

    public final String component1() {
        return this.sku;
    }

    public final String component2() {
        return this.userId;
    }

    public final String component3() {
        return this.receiptId;
    }

    public final MockReceipt copy(String str, String str2, String str3) {
        return new MockReceipt(str, str2, str3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.receiptId, (java.lang.Object) r3.receiptId) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.bamtech.sdk4.purchase.bamnet.models.MockReceipt
            if (r0 == 0) goto L_0x0027
            com.bamtech.sdk4.purchase.bamnet.models.MockReceipt r3 = (com.bamtech.sdk4.purchase.bamnet.models.MockReceipt) r3
            java.lang.String r0 = r2.sku
            java.lang.String r1 = r3.sku
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.userId
            java.lang.String r1 = r3.userId
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.receiptId
            java.lang.String r3 = r3.receiptId
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            return r3
        L_0x0029:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.purchase.bamnet.models.MockReceipt.equals(java.lang.Object):boolean");
    }

    public final String getReceiptId() {
        return this.receiptId;
    }

    public final String getSku() {
        return this.sku;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.sku;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.userId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.receiptId;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MockReceipt(sku=");
        sb.append(this.sku);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(", receiptId=");
        sb.append(this.receiptId);
        sb.append(")");
        return sb.toString();
    }
}
