package com.bamtech.sdk4.subscription;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\"\u0014\u0010\u0000\u001a\u00020\u00018BX\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u00018@X\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, mo31007d2 = {"ACCOUNT_API_LINK_SUBSCRIPTIONS", "", "getACCOUNT_API_LINK_SUBSCRIPTIONS", "()Ljava/lang/String;", "SUBSCRIPTION_API_GET_SUBSCRIPTIONS", "getSUBSCRIPTION_API_GET_SUBSCRIPTIONS", "extension-iap"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* compiled from: SubscriptionExtension.kt */
public final class SubscriptionExtensionKt {
    /* access modifiers changed from: private */
    public static final String getACCOUNT_API_LINK_SUBSCRIPTIONS() {
        return "urn:bamtech:dust:bamsdk:api:account:linkSubscriptionsFromDevice";
    }

    public static final String getSUBSCRIPTION_API_GET_SUBSCRIPTIONS() {
        return "urn:bamtech:dust:bamsdk:api:subscription:getSubscriptions";
    }
}
