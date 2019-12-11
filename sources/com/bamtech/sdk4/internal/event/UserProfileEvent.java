package com.bamtech.sdk4.internal.event;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/event/UserProfileEvent;", "", "profileId", "", "type", "Lcom/bamtech/sdk4/internal/event/UserProfileEventType;", "(Ljava/lang/String;Lcom/bamtech/sdk4/internal/event/UserProfileEventType;)V", "getProfileId", "()Ljava/lang/String;", "getType", "()Lcom/bamtech/sdk4/internal/event/UserProfileEventType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk-base"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: UserProfileEvent.kt */
public final class UserProfileEvent {
    private final String profileId;
    private final UserProfileEventType type;

    public UserProfileEvent(String str, UserProfileEventType userProfileEventType) {
        this.profileId = str;
        this.type = userProfileEventType;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.type, (java.lang.Object) r3.type) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.bamtech.sdk4.internal.event.UserProfileEvent
            if (r0 == 0) goto L_0x001d
            com.bamtech.sdk4.internal.event.UserProfileEvent r3 = (com.bamtech.sdk4.internal.event.UserProfileEvent) r3
            java.lang.String r0 = r2.profileId
            java.lang.String r1 = r3.profileId
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.bamtech.sdk4.internal.event.UserProfileEventType r0 = r2.type
            com.bamtech.sdk4.internal.event.UserProfileEventType r3 = r3.type
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
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.event.UserProfileEvent.equals(java.lang.Object):boolean");
    }

    public final String getProfileId() {
        return this.profileId;
    }

    public final UserProfileEventType getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.profileId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        UserProfileEventType userProfileEventType = this.type;
        if (userProfileEventType != null) {
            i = userProfileEventType.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UserProfileEvent(profileId=");
        sb.append(this.profileId);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(")");
        return sb.toString();
    }
}
