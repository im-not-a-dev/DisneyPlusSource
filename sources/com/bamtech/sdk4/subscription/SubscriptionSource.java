package com.bamtech.sdk4.subscription;

import com.bamtech.core.annotations.android.DontObfuscate;
import com.bamtech.sdk4.internal.subscription.SubscriptionSourceSubType;
import com.bamtech.sdk4.subscription.SubscriptionProvider.OTHER;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0010¢\u0006\u0002\u0010\u0002B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÂ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bHÂ\u0003J\u000e\u0010\u0013\u001a\u00020\nHÀ\u0003¢\u0006\u0002\b\u0014J3\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, mo31007d2 = {"Lcom/bamtech/sdk4/subscription/SubscriptionSource;", "", "()V", "provider", "Lcom/bamtech/sdk4/subscription/SubscriptionProvider;", "ref", "", "subType", "Lcom/bamtech/sdk4/internal/subscription/SubscriptionSourceSubType;", "type", "Lcom/bamtech/sdk4/subscription/SubscriptionSourceType;", "(Lcom/bamtech/sdk4/subscription/SubscriptionProvider;Ljava/lang/String;Lcom/bamtech/sdk4/internal/subscription/SubscriptionSourceSubType;Lcom/bamtech/sdk4/subscription/SubscriptionSourceType;)V", "getProvider", "()Lcom/bamtech/sdk4/subscription/SubscriptionProvider;", "getType$extension_iap", "()Lcom/bamtech/sdk4/subscription/SubscriptionSourceType;", "component1", "component2", "component3", "component4", "component4$extension_iap", "copy", "equals", "", "other", "hashCode", "", "toString", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: Subscription.kt */
public final class SubscriptionSource {
    private final SubscriptionProvider provider;
    private final String ref;
    private final SubscriptionSourceSubType subType;
    private final SubscriptionSourceType type;

    public SubscriptionSource(SubscriptionProvider subscriptionProvider, String str, SubscriptionSourceSubType subscriptionSourceSubType, SubscriptionSourceType subscriptionSourceType) {
        this.provider = subscriptionProvider;
        this.ref = str;
        this.subType = subscriptionSourceSubType;
        this.type = subscriptionSourceType;
    }

    private final String component2() {
        return this.ref;
    }

    private final SubscriptionSourceSubType component3() {
        return this.subType;
    }

    public static /* synthetic */ SubscriptionSource copy$default(SubscriptionSource subscriptionSource, SubscriptionProvider subscriptionProvider, String str, SubscriptionSourceSubType subscriptionSourceSubType, SubscriptionSourceType subscriptionSourceType, int i, Object obj) {
        if ((i & 1) != 0) {
            subscriptionProvider = subscriptionSource.provider;
        }
        if ((i & 2) != 0) {
            str = subscriptionSource.ref;
        }
        if ((i & 4) != 0) {
            subscriptionSourceSubType = subscriptionSource.subType;
        }
        if ((i & 8) != 0) {
            subscriptionSourceType = subscriptionSource.type;
        }
        return subscriptionSource.copy(subscriptionProvider, str, subscriptionSourceSubType, subscriptionSourceType);
    }

    public final SubscriptionProvider component1() {
        return this.provider;
    }

    public final SubscriptionSourceType component4$extension_iap() {
        return this.type;
    }

    public final SubscriptionSource copy(SubscriptionProvider subscriptionProvider, String str, SubscriptionSourceSubType subscriptionSourceSubType, SubscriptionSourceType subscriptionSourceType) {
        return new SubscriptionSource(subscriptionProvider, str, subscriptionSourceSubType, subscriptionSourceType);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.type, (java.lang.Object) r3.type) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof com.bamtech.sdk4.subscription.SubscriptionSource
            if (r0 == 0) goto L_0x0031
            com.bamtech.sdk4.subscription.SubscriptionSource r3 = (com.bamtech.sdk4.subscription.SubscriptionSource) r3
            com.bamtech.sdk4.subscription.SubscriptionProvider r0 = r2.provider
            com.bamtech.sdk4.subscription.SubscriptionProvider r1 = r3.provider
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.ref
            java.lang.String r1 = r3.ref
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0031
            com.bamtech.sdk4.internal.subscription.SubscriptionSourceSubType r0 = r2.subType
            com.bamtech.sdk4.internal.subscription.SubscriptionSourceSubType r1 = r3.subType
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0031
            com.bamtech.sdk4.subscription.SubscriptionSourceType r0 = r2.type
            com.bamtech.sdk4.subscription.SubscriptionSourceType r3 = r3.type
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
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.subscription.SubscriptionSource.equals(java.lang.Object):boolean");
    }

    public final SubscriptionProvider getProvider() {
        return this.provider;
    }

    public final SubscriptionSourceType getType$extension_iap() {
        return this.type;
    }

    public int hashCode() {
        SubscriptionProvider subscriptionProvider = this.provider;
        int i = 0;
        int hashCode = (subscriptionProvider != null ? subscriptionProvider.hashCode() : 0) * 31;
        String str = this.ref;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        SubscriptionSourceSubType subscriptionSourceSubType = this.subType;
        int hashCode3 = (hashCode2 + (subscriptionSourceSubType != null ? subscriptionSourceSubType.hashCode() : 0)) * 31;
        SubscriptionSourceType subscriptionSourceType = this.type;
        if (subscriptionSourceType != null) {
            i = subscriptionSourceType.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SubscriptionSource(provider=");
        sb.append(this.provider);
        sb.append(", ref=");
        sb.append(this.ref);
        sb.append(", subType=");
        sb.append(this.subType);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(")");
        return sb.toString();
    }

    public SubscriptionSource() {
        String str = "MISSING";
        this(new OTHER(str), str, null, new SubscriptionSourceType.OTHER(str));
    }
}
