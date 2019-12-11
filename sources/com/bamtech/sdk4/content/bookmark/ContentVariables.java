package com.bamtech.sdk4.content.bookmark;

import com.bamtech.core.annotations.android.DontObfuscate;
import java.util.List;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtech/sdk4/content/bookmark/ContentVariables;", "", "contentIds", "", "", "(Ljava/util/List;)V", "getContentIds", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "plugin-content"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: BookmarkContext.kt */
public final class ContentVariables {
    private final List<String> contentIds;

    public ContentVariables(List<String> list) {
        this.contentIds = list;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<java.lang.String>, for r1v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.bamtech.sdk4.content.bookmark.ContentVariables copy$default(com.bamtech.sdk4.content.bookmark.ContentVariables r0, java.util.List<java.lang.String> r1, int r2, java.lang.Object r3) {
        /*
            r2 = r2 & 1
            if (r2 == 0) goto L_0x0006
            java.util.List<java.lang.String> r1 = r0.contentIds
        L_0x0006:
            com.bamtech.sdk4.content.bookmark.ContentVariables r0 = r0.copy(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.content.bookmark.ContentVariables.copy$default(com.bamtech.sdk4.content.bookmark.ContentVariables, java.util.List, int, java.lang.Object):com.bamtech.sdk4.content.bookmark.ContentVariables");
    }

    public final List<String> component1() {
        return this.contentIds;
    }

    public final ContentVariables copy(List<String> list) {
        return new ContentVariables(list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r1.contentIds, (java.lang.Object) ((com.bamtech.sdk4.content.bookmark.ContentVariables) r2).contentIds) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.bamtech.sdk4.content.bookmark.ContentVariables
            if (r0 == 0) goto L_0x0013
            com.bamtech.sdk4.content.bookmark.ContentVariables r2 = (com.bamtech.sdk4.content.bookmark.ContentVariables) r2
            java.util.List<java.lang.String> r0 = r1.contentIds
            java.util.List<java.lang.String> r2 = r2.contentIds
            boolean r2 = kotlin.jvm.internal.C12880j.m40224a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.content.bookmark.ContentVariables.equals(java.lang.Object):boolean");
    }

    public final List<String> getContentIds() {
        return this.contentIds;
    }

    public int hashCode() {
        List<String> list = this.contentIds;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ContentVariables(contentIds=");
        sb.append(this.contentIds);
        sb.append(")");
        return sb.toString();
    }
}
