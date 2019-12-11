package com.bamtech.sdk4.internal.subscription;

import com.bamtech.core.annotations.android.DontObfuscate;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/subscription/SubscriberRequest;", "", "accountId", "", "deviceId", "(Ljava/lang/String;Ljava/lang/String;)V", "getAccountId", "()Ljava/lang/String;", "getDeviceId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: Subscription.kt */
public final class SubscriberRequest {
    private final String accountId;
    private final String deviceId;

    public SubscriberRequest(String str, String str2) {
        this.accountId = str;
        this.deviceId = str2;
    }

    public static /* synthetic */ SubscriberRequest copy$default(SubscriberRequest subscriberRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subscriberRequest.accountId;
        }
        if ((i & 2) != 0) {
            str2 = subscriberRequest.deviceId;
        }
        return subscriberRequest.copy(str, str2);
    }

    public final String component1() {
        return this.accountId;
    }

    public final String component2() {
        return this.deviceId;
    }

    public final SubscriberRequest copy(String str, String str2) {
        return new SubscriberRequest(str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.deviceId, (java.lang.Object) r3.deviceId) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.bamtech.sdk4.internal.subscription.SubscriberRequest
            if (r0 == 0) goto L_0x001d
            com.bamtech.sdk4.internal.subscription.SubscriberRequest r3 = (com.bamtech.sdk4.internal.subscription.SubscriberRequest) r3
            java.lang.String r0 = r2.accountId
            java.lang.String r1 = r3.accountId
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.deviceId
            java.lang.String r3 = r3.deviceId
            boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.subscription.SubscriberRequest.equals(java.lang.Object):boolean");
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public int hashCode() {
        String str = this.accountId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.deviceId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SubscriberRequest(accountId=");
        sb.append(this.accountId);
        sb.append(", deviceId=");
        sb.append(this.deviceId);
        sb.append(")");
        return sb.toString();
    }
}
