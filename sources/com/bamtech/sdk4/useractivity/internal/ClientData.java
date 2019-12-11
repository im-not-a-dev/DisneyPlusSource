package com.bamtech.sdk4.useractivity.internal;

import com.bamtech.core.annotations.android.DontObfuscate;
import java.util.List;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J7\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, mo31007d2 = {"Lcom/bamtech/sdk4/useractivity/internal/ClientData;", "", "rewardToken", "", "rewardedContentId", "action", "recommendedContentIds", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getAction", "()Ljava/lang/String;", "getRecommendedContentIds", "()Ljava/util/List;", "getRewardToken", "getRewardedContentId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "plugin-user-activity_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: UserActivityDustEvent.kt */
public final class ClientData {
    private final String action;
    private final List<String> recommendedContentIds;
    private final String rewardToken;
    private final String rewardedContentId;

    public ClientData(String str, String str2, String str3, List<String> list) {
        this.rewardToken = str;
        this.rewardedContentId = str2;
        this.action = str3;
        this.recommendedContentIds = list;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<java.lang.String>, for r4v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.bamtech.sdk4.useractivity.internal.ClientData copy$default(com.bamtech.sdk4.useractivity.internal.ClientData r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, java.util.List<java.lang.String> r4, int r5, java.lang.Object r6) {
        /*
            r6 = r5 & 1
            if (r6 == 0) goto L_0x0006
            java.lang.String r1 = r0.rewardToken
        L_0x0006:
            r6 = r5 & 2
            if (r6 == 0) goto L_0x000c
            java.lang.String r2 = r0.rewardedContentId
        L_0x000c:
            r6 = r5 & 4
            if (r6 == 0) goto L_0x0012
            java.lang.String r3 = r0.action
        L_0x0012:
            r5 = r5 & 8
            if (r5 == 0) goto L_0x0018
            java.util.List<java.lang.String> r4 = r0.recommendedContentIds
        L_0x0018:
            com.bamtech.sdk4.useractivity.internal.ClientData r0 = r0.copy(r1, r2, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.useractivity.internal.ClientData.copy$default(com.bamtech.sdk4.useractivity.internal.ClientData, java.lang.String, java.lang.String, java.lang.String, java.util.List, int, java.lang.Object):com.bamtech.sdk4.useractivity.internal.ClientData");
    }

    public final String component1() {
        return this.rewardToken;
    }

    public final String component2() {
        return this.rewardedContentId;
    }

    public final String component3() {
        return this.action;
    }

    public final List<String> component4() {
        return this.recommendedContentIds;
    }

    public final ClientData copy(String str, String str2, String str3, List<String> list) {
        return new ClientData(str, str2, str3, list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.recommendedContentIds, (java.lang.Object) r3.recommendedContentIds) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof com.bamtech.sdk4.useractivity.internal.ClientData
            if (r0 == 0) goto L_0x0031
            com.bamtech.sdk4.useractivity.internal.ClientData r3 = (com.bamtech.sdk4.useractivity.internal.ClientData) r3
            java.lang.String r0 = r2.rewardToken
            java.lang.String r1 = r3.rewardToken
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.rewardedContentId
            java.lang.String r1 = r3.rewardedContentId
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.action
            java.lang.String r1 = r3.action
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.util.List<java.lang.String> r0 = r2.recommendedContentIds
            java.util.List<java.lang.String> r3 = r3.recommendedContentIds
            boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            return r3
        L_0x0033:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.useractivity.internal.ClientData.equals(java.lang.Object):boolean");
    }

    public final String getAction() {
        return this.action;
    }

    public final List<String> getRecommendedContentIds() {
        return this.recommendedContentIds;
    }

    public final String getRewardToken() {
        return this.rewardToken;
    }

    public final String getRewardedContentId() {
        return this.rewardedContentId;
    }

    public int hashCode() {
        String str = this.rewardToken;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.rewardedContentId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.action;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<String> list = this.recommendedContentIds;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ClientData(rewardToken=");
        sb.append(this.rewardToken);
        sb.append(", rewardedContentId=");
        sb.append(this.rewardedContentId);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", recommendedContentIds=");
        sb.append(this.recommendedContentIds);
        sb.append(")");
        return sb.toString();
    }
}
