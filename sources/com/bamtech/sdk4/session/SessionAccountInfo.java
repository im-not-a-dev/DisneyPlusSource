package com.bamtech.sdk4.session;

import com.bamtech.core.annotations.android.DontObfuscate;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, mo31007d2 = {"Lcom/bamtech/sdk4/session/SessionAccountInfo;", "", "id", "", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "extension-session"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: SessionInfo.kt */
public final class SessionAccountInfo {

    /* renamed from: id */
    private final String f6082id;

    public SessionAccountInfo(String str) {
        this.f6082id = str;
    }

    public static /* synthetic */ SessionAccountInfo copy$default(SessionAccountInfo sessionAccountInfo, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sessionAccountInfo.f6082id;
        }
        return sessionAccountInfo.copy(str);
    }

    public final String component1() {
        return this.f6082id;
    }

    public final SessionAccountInfo copy(String str) {
        return new SessionAccountInfo(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f6082id, (java.lang.Object) ((com.bamtech.sdk4.session.SessionAccountInfo) r2).f6082id) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.bamtech.sdk4.session.SessionAccountInfo
            if (r0 == 0) goto L_0x0013
            com.bamtech.sdk4.session.SessionAccountInfo r2 = (com.bamtech.sdk4.session.SessionAccountInfo) r2
            java.lang.String r0 = r1.f6082id
            java.lang.String r2 = r2.f6082id
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
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.session.SessionAccountInfo.equals(java.lang.Object):boolean");
    }

    public final String getId() {
        return this.f6082id;
    }

    public int hashCode() {
        String str = this.f6082id;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SessionAccountInfo(id=");
        sb.append(this.f6082id);
        sb.append(")");
        return sb.toString();
    }
}
