package com.bamtech.sdk4.content;

import com.bamtech.core.annotations.android.DontObfuscate;
import java.util.List;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, mo31007d2 = {"Lcom/bamtech/sdk4/content/GraphQlError;", "", "message", "", "locations", "", "Lcom/bamtech/sdk4/content/GraphQlErrorLocation;", "(Ljava/lang/String;Ljava/util/List;)V", "getLocations", "()Ljava/util/List;", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "extension-content"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: GraphQlResponse.kt */
public final class GraphQlError {
    private final List<GraphQlErrorLocation> locations;
    private final String message;

    public GraphQlError(String str, List<GraphQlErrorLocation> list) {
        this.message = str;
        this.locations = list;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.bamtech.sdk4.content.GraphQlErrorLocation>, for r2v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.bamtech.sdk4.content.GraphQlError copy$default(com.bamtech.sdk4.content.GraphQlError r0, java.lang.String r1, java.util.List<com.bamtech.sdk4.content.GraphQlErrorLocation> r2, int r3, java.lang.Object r4) {
        /*
            r4 = r3 & 1
            if (r4 == 0) goto L_0x0006
            java.lang.String r1 = r0.message
        L_0x0006:
            r3 = r3 & 2
            if (r3 == 0) goto L_0x000c
            java.util.List<com.bamtech.sdk4.content.GraphQlErrorLocation> r2 = r0.locations
        L_0x000c:
            com.bamtech.sdk4.content.GraphQlError r0 = r0.copy(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.content.GraphQlError.copy$default(com.bamtech.sdk4.content.GraphQlError, java.lang.String, java.util.List, int, java.lang.Object):com.bamtech.sdk4.content.GraphQlError");
    }

    public final String component1() {
        return this.message;
    }

    public final List<GraphQlErrorLocation> component2() {
        return this.locations;
    }

    public final GraphQlError copy(String str, List<GraphQlErrorLocation> list) {
        return new GraphQlError(str, list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.locations, (java.lang.Object) r3.locations) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.bamtech.sdk4.content.GraphQlError
            if (r0 == 0) goto L_0x001d
            com.bamtech.sdk4.content.GraphQlError r3 = (com.bamtech.sdk4.content.GraphQlError) r3
            java.lang.String r0 = r2.message
            java.lang.String r1 = r3.message
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.util.List<com.bamtech.sdk4.content.GraphQlErrorLocation> r0 = r2.locations
            java.util.List<com.bamtech.sdk4.content.GraphQlErrorLocation> r3 = r3.locations
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
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.content.GraphQlError.equals(java.lang.Object):boolean");
    }

    public final List<GraphQlErrorLocation> getLocations() {
        return this.locations;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        String str = this.message;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<GraphQlErrorLocation> list = this.locations;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GraphQlError(message=");
        sb.append(this.message);
        sb.append(", locations=");
        sb.append(this.locations);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ GraphQlError(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            list = null;
        }
        this(str, list);
    }
}
