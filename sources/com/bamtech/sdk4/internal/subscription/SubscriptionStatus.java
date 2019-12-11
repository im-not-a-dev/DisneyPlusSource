package com.bamtech.sdk4.internal.subscription;

import com.bamtech.core.annotations.android.DontObfuscate;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0010¢\u0006\u0002\u0010\u0002B\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/subscription/SubscriptionStatus;", "", "()V", "subType", "Lcom/bamtech/sdk4/internal/subscription/SubscriptionStatusSubType;", "type", "Lcom/bamtech/sdk4/internal/subscription/SubscriptionStatusType;", "(Lcom/bamtech/sdk4/internal/subscription/SubscriptionStatusSubType;Lcom/bamtech/sdk4/internal/subscription/SubscriptionStatusType;)V", "getSubType", "()Lcom/bamtech/sdk4/internal/subscription/SubscriptionStatusSubType;", "getType", "()Lcom/bamtech/sdk4/internal/subscription/SubscriptionStatusType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: Subscription.kt */
public final class SubscriptionStatus {
    private final SubscriptionStatusSubType subType;
    private final SubscriptionStatusType type;

    public SubscriptionStatus(SubscriptionStatusSubType subscriptionStatusSubType, SubscriptionStatusType subscriptionStatusType) {
        this.subType = subscriptionStatusSubType;
        this.type = subscriptionStatusType;
    }

    public static /* synthetic */ SubscriptionStatus copy$default(SubscriptionStatus subscriptionStatus, SubscriptionStatusSubType subscriptionStatusSubType, SubscriptionStatusType subscriptionStatusType, int i, Object obj) {
        if ((i & 1) != 0) {
            subscriptionStatusSubType = subscriptionStatus.subType;
        }
        if ((i & 2) != 0) {
            subscriptionStatusType = subscriptionStatus.type;
        }
        return subscriptionStatus.copy(subscriptionStatusSubType, subscriptionStatusType);
    }

    public final SubscriptionStatusSubType component1() {
        return this.subType;
    }

    public final SubscriptionStatusType component2() {
        return this.type;
    }

    public final SubscriptionStatus copy(SubscriptionStatusSubType subscriptionStatusSubType, SubscriptionStatusType subscriptionStatusType) {
        return new SubscriptionStatus(subscriptionStatusSubType, subscriptionStatusType);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.type, (java.lang.Object) r3.type) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.bamtech.sdk4.internal.subscription.SubscriptionStatus
            if (r0 == 0) goto L_0x001d
            com.bamtech.sdk4.internal.subscription.SubscriptionStatus r3 = (com.bamtech.sdk4.internal.subscription.SubscriptionStatus) r3
            com.bamtech.sdk4.internal.subscription.SubscriptionStatusSubType r0 = r2.subType
            com.bamtech.sdk4.internal.subscription.SubscriptionStatusSubType r1 = r3.subType
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.bamtech.sdk4.internal.subscription.SubscriptionStatusType r0 = r2.type
            com.bamtech.sdk4.internal.subscription.SubscriptionStatusType r3 = r3.type
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.subscription.SubscriptionStatus.equals(java.lang.Object):boolean");
    }

    public final SubscriptionStatusSubType getSubType() {
        return this.subType;
    }

    public final SubscriptionStatusType getType() {
        return this.type;
    }

    public int hashCode() {
        SubscriptionStatusSubType subscriptionStatusSubType = this.subType;
        int i = 0;
        int hashCode = (subscriptionStatusSubType != null ? subscriptionStatusSubType.hashCode() : 0) * 31;
        SubscriptionStatusType subscriptionStatusType = this.type;
        if (subscriptionStatusType != null) {
            i = subscriptionStatusType.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SubscriptionStatus(subType=");
        sb.append(this.subType);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(")");
        return sb.toString();
    }

    public SubscriptionStatus() {
        this(null, SubscriptionStatusType.UNSUBSCRIBED);
    }
}
