package com.bamtech.sdk4.purchase;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\"\u0014\u0010\u0000\u001a\u00020\u00018@X\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u00018@X\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, mo31007d2 = {"PURCHASE_API_REDEEM", "", "getPURCHASE_API_REDEEM", "()Ljava/lang/String;", "PURCHASE_API_RESTORE", "getPURCHASE_API_RESTORE", "extension-iap"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* compiled from: PurchaseExtension.kt */
public final class PurchaseExtensionKt {
    public static final String getPURCHASE_API_REDEEM() {
        return "urn:bamtech:dust:bamsdk:api:purchase:redeem";
    }

    public static final String getPURCHASE_API_RESTORE() {
        return "urn:bamtech:dust:bamsdk:api:purchase:restore";
    }
}
