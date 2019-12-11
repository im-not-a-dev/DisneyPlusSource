package com.bamtech.sdk4;

import com.bamtech.core.annotations.android.DontObfuscate;
import java.util.Map;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003JA\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, mo31007d2 = {"Lcom/bamtech/sdk4/MediaThumbnailLink;", "", "href", "", "rel", "method", "headers", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getHeaders", "()Ljava/util/Map;", "getHref", "()Ljava/lang/String;", "getMethod", "getRel", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: MediaThumbnailLinks.kt */
public final class MediaThumbnailLink {
    private final Map<String, String> headers;
    private final String href;
    private final String method;
    private final String rel;

    public MediaThumbnailLink() {
        this(null, null, null, null, 15, null);
    }

    public MediaThumbnailLink(String str, String str2, String str3, Map<String, String> map) {
        this.href = str;
        this.rel = str2;
        this.method = str3;
        this.headers = map;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.Map, code=java.util.Map<java.lang.String, java.lang.String>, for r4v0, types: [java.util.Map] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.bamtech.sdk4.MediaThumbnailLink copy$default(com.bamtech.sdk4.MediaThumbnailLink r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, java.util.Map<java.lang.String, java.lang.String> r4, int r5, java.lang.Object r6) {
        /*
            r6 = r5 & 1
            if (r6 == 0) goto L_0x0006
            java.lang.String r1 = r0.href
        L_0x0006:
            r6 = r5 & 2
            if (r6 == 0) goto L_0x000c
            java.lang.String r2 = r0.rel
        L_0x000c:
            r6 = r5 & 4
            if (r6 == 0) goto L_0x0012
            java.lang.String r3 = r0.method
        L_0x0012:
            r5 = r5 & 8
            if (r5 == 0) goto L_0x0018
            java.util.Map<java.lang.String, java.lang.String> r4 = r0.headers
        L_0x0018:
            com.bamtech.sdk4.MediaThumbnailLink r0 = r0.copy(r1, r2, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.MediaThumbnailLink.copy$default(com.bamtech.sdk4.MediaThumbnailLink, java.lang.String, java.lang.String, java.lang.String, java.util.Map, int, java.lang.Object):com.bamtech.sdk4.MediaThumbnailLink");
    }

    public final String component1() {
        return this.href;
    }

    public final String component2() {
        return this.rel;
    }

    public final String component3() {
        return this.method;
    }

    public final Map<String, String> component4() {
        return this.headers;
    }

    public final MediaThumbnailLink copy(String str, String str2, String str3, Map<String, String> map) {
        return new MediaThumbnailLink(str, str2, str3, map);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.headers, (java.lang.Object) r3.headers) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof com.bamtech.sdk4.MediaThumbnailLink
            if (r0 == 0) goto L_0x0031
            com.bamtech.sdk4.MediaThumbnailLink r3 = (com.bamtech.sdk4.MediaThumbnailLink) r3
            java.lang.String r0 = r2.href
            java.lang.String r1 = r3.href
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.rel
            java.lang.String r1 = r3.rel
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.method
            java.lang.String r1 = r3.method
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.headers
            java.util.Map<java.lang.String, java.lang.String> r3 = r3.headers
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
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.MediaThumbnailLink.equals(java.lang.Object):boolean");
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final String getHref() {
        return this.href;
    }

    public final String getMethod() {
        return this.method;
    }

    public final String getRel() {
        return this.rel;
    }

    public int hashCode() {
        String str = this.href;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.rel;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.method;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Map<String, String> map = this.headers;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MediaThumbnailLink(href=");
        sb.append(this.href);
        sb.append(", rel=");
        sb.append(this.rel);
        sb.append(", method=");
        sb.append(this.method);
        sb.append(", headers=");
        sb.append(this.headers);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ MediaThumbnailLink(String str, String str2, String str3, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "GET";
        }
        if ((i & 8) != 0) {
            map = null;
        }
        this(str, str2, str3, map);
    }
}
