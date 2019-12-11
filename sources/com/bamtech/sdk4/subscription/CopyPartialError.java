package com.bamtech.sdk4.subscription;

import com.bamtech.core.annotations.android.DontObfuscate;
import com.bamtech.sdk4.service.ErrorReason;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ:\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\n\"\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\n¨\u0006\u001e"}, mo31007d2 = {"Lcom/bamtech/sdk4/subscription/CopyPartialError;", "Lcom/bamtech/sdk4/service/ErrorReason;", "code", "", "description", "subscriptionId", "limit", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getCode", "()Ljava/lang/String;", "getDescription", "setDescription", "(Ljava/lang/String;)V", "getLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSubscriptionId", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/bamtech/sdk4/subscription/CopyPartialError;", "equals", "", "other", "", "hashCode", "toString", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: Subscription.kt */
public final class CopyPartialError implements ErrorReason {
    private final String code;
    private String description;
    private final Integer limit;
    private final String subscriptionId;

    public CopyPartialError(String str, String str2, String str3, Integer num) {
        this.code = str;
        this.description = str2;
        this.subscriptionId = str3;
        this.limit = num;
    }

    public static /* synthetic */ CopyPartialError copy$default(CopyPartialError copyPartialError, String str, String str2, String str3, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = copyPartialError.getCode();
        }
        if ((i & 2) != 0) {
            str2 = copyPartialError.getDescription();
        }
        if ((i & 4) != 0) {
            str3 = copyPartialError.subscriptionId;
        }
        if ((i & 8) != 0) {
            num = copyPartialError.limit;
        }
        return copyPartialError.copy(str, str2, str3, num);
    }

    public final String component1() {
        return getCode();
    }

    public final String component2() {
        return getDescription();
    }

    public final String component3() {
        return this.subscriptionId;
    }

    public final Integer component4() {
        return this.limit;
    }

    public final CopyPartialError copy(String str, String str2, String str3, Integer num) {
        return new CopyPartialError(str, str2, str3, num);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0036, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.limit, (java.lang.Object) r3.limit) != false) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x003b
            boolean r0 = r3 instanceof com.bamtech.sdk4.subscription.CopyPartialError
            if (r0 == 0) goto L_0x0039
            com.bamtech.sdk4.subscription.CopyPartialError r3 = (com.bamtech.sdk4.subscription.CopyPartialError) r3
            java.lang.String r0 = r2.getCode()
            java.lang.String r1 = r3.getCode()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = r2.getDescription()
            java.lang.String r1 = r3.getDescription()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = r2.subscriptionId
            java.lang.String r1 = r3.subscriptionId
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0039
            java.lang.Integer r0 = r2.limit
            java.lang.Integer r3 = r3.limit
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x0039
            goto L_0x003b
        L_0x0039:
            r3 = 0
            return r3
        L_0x003b:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.subscription.CopyPartialError.equals(java.lang.Object):boolean");
    }

    public String getCode() {
        return this.code;
    }

    public String getDescription() {
        return this.description;
    }

    public final Integer getLimit() {
        return this.limit;
    }

    public final String getSubscriptionId() {
        return this.subscriptionId;
    }

    public int hashCode() {
        String code2 = getCode();
        int i = 0;
        int hashCode = (code2 != null ? code2.hashCode() : 0) * 31;
        String description2 = getDescription();
        int hashCode2 = (hashCode + (description2 != null ? description2.hashCode() : 0)) * 31;
        String str = this.subscriptionId;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        Integer num = this.limit;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode3 + i;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CopyPartialError(code=");
        sb.append(getCode());
        sb.append(", description=");
        sb.append(getDescription());
        sb.append(", subscriptionId=");
        sb.append(this.subscriptionId);
        sb.append(", limit=");
        sb.append(this.limit);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ CopyPartialError(String str, String str2, String str3, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 8) != 0) {
            num = null;
        }
        this(str, str2, str3, num);
    }
}
