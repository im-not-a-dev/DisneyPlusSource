package com.bamtech.sdk4.internal.account;

import com.bamtech.core.annotations.android.DontObfuscate;
import com.bamtech.shadow.gson.JsonObject;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/account/DefaultActiveUserProfileWrapper;", "", "activeProfile", "Lcom/bamtech/shadow/gson/JsonObject;", "(Lcom/bamtech/shadow/gson/JsonObject;)V", "getActiveProfile", "()Lcom/bamtech/shadow/gson/JsonObject;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "extension-account"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: UserProfiles.kt */
public final class DefaultActiveUserProfileWrapper {
    private final JsonObject activeProfile;

    public DefaultActiveUserProfileWrapper(JsonObject jsonObject) {
        this.activeProfile = jsonObject;
    }

    public static /* synthetic */ DefaultActiveUserProfileWrapper copy$default(DefaultActiveUserProfileWrapper defaultActiveUserProfileWrapper, JsonObject jsonObject, int i, Object obj) {
        if ((i & 1) != 0) {
            jsonObject = defaultActiveUserProfileWrapper.activeProfile;
        }
        return defaultActiveUserProfileWrapper.copy(jsonObject);
    }

    public final JsonObject component1() {
        return this.activeProfile;
    }

    public final DefaultActiveUserProfileWrapper copy(JsonObject jsonObject) {
        return new DefaultActiveUserProfileWrapper(jsonObject);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.activeProfile, (java.lang.Object) ((com.bamtech.sdk4.internal.account.DefaultActiveUserProfileWrapper) r2).activeProfile) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.bamtech.sdk4.internal.account.DefaultActiveUserProfileWrapper
            if (r0 == 0) goto L_0x0013
            com.bamtech.sdk4.internal.account.DefaultActiveUserProfileWrapper r2 = (com.bamtech.sdk4.internal.account.DefaultActiveUserProfileWrapper) r2
            com.bamtech.shadow.gson.JsonObject r0 = r1.activeProfile
            com.bamtech.shadow.gson.JsonObject r2 = r2.activeProfile
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.account.DefaultActiveUserProfileWrapper.equals(java.lang.Object):boolean");
    }

    public final JsonObject getActiveProfile() {
        return this.activeProfile;
    }

    public int hashCode() {
        JsonObject jsonObject = this.activeProfile;
        if (jsonObject != null) {
            return jsonObject.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DefaultActiveUserProfileWrapper(activeProfile=");
        sb.append(this.activeProfile);
        sb.append(")");
        return sb.toString();
    }
}
