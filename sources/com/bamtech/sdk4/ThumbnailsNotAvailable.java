package com.bamtech.sdk4;

import com.bamtech.sdk4.service.ErrorReason;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0003XD¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0007\"\u0004\b\t\u0010\u0004¨\u0006\u0013"}, mo31007d2 = {"Lcom/bamtech/sdk4/ThumbnailsNotAvailable;", "Lcom/bamtech/sdk4/service/ErrorReason;", "description", "", "(Ljava/lang/String;)V", "code", "getCode", "()Ljava/lang/String;", "getDescription", "setDescription", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: MediaThumbnailLinks.kt */
public final class ThumbnailsNotAvailable implements ErrorReason {
    private final String code;
    private String description;

    public ThumbnailsNotAvailable() {
        this(null, 1, null);
    }

    public ThumbnailsNotAvailable(String str) {
        this.description = str;
        this.code = "thumbnails-unavailable";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) getDescription(), (java.lang.Object) ((com.bamtech.sdk4.ThumbnailsNotAvailable) r2).getDescription()) != false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0019
            boolean r0 = r2 instanceof com.bamtech.sdk4.ThumbnailsNotAvailable
            if (r0 == 0) goto L_0x0017
            com.bamtech.sdk4.ThumbnailsNotAvailable r2 = (com.bamtech.sdk4.ThumbnailsNotAvailable) r2
            java.lang.String r0 = r1.getDescription()
            java.lang.String r2 = r2.getDescription()
            boolean r2 = kotlin.jvm.internal.C12880j.m40224a(r0, r2)
            if (r2 == 0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            r2 = 0
            return r2
        L_0x0019:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.ThumbnailsNotAvailable.equals(java.lang.Object):boolean");
    }

    public String getCode() {
        return this.code;
    }

    public String getDescription() {
        return this.description;
    }

    public int hashCode() {
        String description2 = getDescription();
        if (description2 != null) {
            return description2.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ThumbnailsNotAvailable(description=");
        sb.append(getDescription());
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ ThumbnailsNotAvailable(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            str = null;
        }
        this(str);
    }
}
