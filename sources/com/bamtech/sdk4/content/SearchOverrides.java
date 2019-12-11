package com.bamtech.sdk4.content;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, mo31007d2 = {"Lcom/bamtech/sdk4/content/SearchOverrides;", "", "activeDate", "", "countryCode", "", "(Ljava/lang/Long;Ljava/lang/String;)V", "getActiveDate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCountryCode", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/lang/String;)Lcom/bamtech/sdk4/content/SearchOverrides;", "equals", "", "other", "hashCode", "", "toString", "extension-content"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: SearchOverrides.kt */
public final class SearchOverrides {
    private final Long activeDate;
    private final String countryCode;

    public SearchOverrides() {
        this(null, null, 3, null);
    }

    public SearchOverrides(Long l, String str) {
        this.activeDate = l;
        this.countryCode = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.countryCode, (java.lang.Object) r3.countryCode) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.bamtech.sdk4.content.SearchOverrides
            if (r0 == 0) goto L_0x001d
            com.bamtech.sdk4.content.SearchOverrides r3 = (com.bamtech.sdk4.content.SearchOverrides) r3
            java.lang.Long r0 = r2.activeDate
            java.lang.Long r1 = r3.activeDate
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.countryCode
            java.lang.String r3 = r3.countryCode
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
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.content.SearchOverrides.equals(java.lang.Object):boolean");
    }

    public final Long getActiveDate() {
        return this.activeDate;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public int hashCode() {
        Long l = this.activeDate;
        int i = 0;
        int hashCode = (l != null ? l.hashCode() : 0) * 31;
        String str = this.countryCode;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SearchOverrides(activeDate=");
        sb.append(this.activeDate);
        sb.append(", countryCode=");
        sb.append(this.countryCode);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ SearchOverrides(Long l, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            l = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        this(l, str);
    }
}
