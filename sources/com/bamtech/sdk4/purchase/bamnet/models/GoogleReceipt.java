package com.bamtech.sdk4.purchase.bamnet.models;

import com.bamtech.core.annotations.android.DontObfuscate;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001c"}, mo31007d2 = {"Lcom/bamtech/sdk4/purchase/bamnet/models/GoogleReceipt;", "Lcom/bamtech/sdk4/purchase/bamnet/models/BamnetReceiptItem;", "productId", "", "packageName", "signature", "purchaseToken", "originalJson", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOriginalJson", "()Ljava/lang/String;", "getPackageName", "getProductId", "getPurchaseToken", "getSignature", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "plugin-iap-bamnet_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: BamnetReceiptItem.kt */
public final class GoogleReceipt extends BamnetReceiptItem {
    private final String originalJson;
    private final String packageName;
    private final String productId;
    private final String purchaseToken;
    private final String signature;

    public GoogleReceipt(String str, String str2, String str3, String str4, String str5) {
        super(null);
        this.productId = str;
        this.packageName = str2;
        this.signature = str3;
        this.purchaseToken = str4;
        this.originalJson = str5;
    }

    public static /* synthetic */ GoogleReceipt copy$default(GoogleReceipt googleReceipt, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = googleReceipt.productId;
        }
        if ((i & 2) != 0) {
            str2 = googleReceipt.packageName;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = googleReceipt.signature;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = googleReceipt.purchaseToken;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = googleReceipt.originalJson;
        }
        return googleReceipt.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.productId;
    }

    public final String component2() {
        return this.packageName;
    }

    public final String component3() {
        return this.signature;
    }

    public final String component4() {
        return this.purchaseToken;
    }

    public final String component5() {
        return this.originalJson;
    }

    public final GoogleReceipt copy(String str, String str2, String str3, String str4, String str5) {
        GoogleReceipt googleReceipt = new GoogleReceipt(str, str2, str3, str4, str5);
        return googleReceipt;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.originalJson, (java.lang.Object) r3.originalJson) != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x003d
            boolean r0 = r3 instanceof com.bamtech.sdk4.purchase.bamnet.models.GoogleReceipt
            if (r0 == 0) goto L_0x003b
            com.bamtech.sdk4.purchase.bamnet.models.GoogleReceipt r3 = (com.bamtech.sdk4.purchase.bamnet.models.GoogleReceipt) r3
            java.lang.String r0 = r2.productId
            java.lang.String r1 = r3.productId
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.packageName
            java.lang.String r1 = r3.packageName
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.signature
            java.lang.String r1 = r3.signature
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.purchaseToken
            java.lang.String r1 = r3.purchaseToken
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.originalJson
            java.lang.String r3 = r3.originalJson
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r3 = 0
            return r3
        L_0x003d:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.purchase.bamnet.models.GoogleReceipt.equals(java.lang.Object):boolean");
    }

    public final String getOriginalJson() {
        return this.originalJson;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final String getSignature() {
        return this.signature;
    }

    public int hashCode() {
        String str = this.productId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.packageName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.signature;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.purchaseToken;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.originalJson;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GoogleReceipt(productId=");
        sb.append(this.productId);
        sb.append(", packageName=");
        sb.append(this.packageName);
        sb.append(", signature=");
        sb.append(this.signature);
        sb.append(", purchaseToken=");
        sb.append(this.purchaseToken);
        sb.append(", originalJson=");
        sb.append(this.originalJson);
        sb.append(")");
        return sb.toString();
    }
}
