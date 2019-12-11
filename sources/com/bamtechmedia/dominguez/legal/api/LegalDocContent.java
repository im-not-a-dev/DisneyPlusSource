package com.bamtechmedia.dominguez.legal.api;

import java.util.List;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/legal/api/LegalDocContent;", "", "text", "", "links", "", "Lcom/bamtechmedia/dominguez/legal/api/LegalLink;", "(Ljava/lang/String;Ljava/util/List;)V", "getLinks", "()Ljava/util/List;", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "legalApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: LegalDataModels.kt */
public final class LegalDocContent {
    private final List<LegalLink> links;
    private final String text;

    public LegalDocContent(String str, List<LegalLink> list) {
        this.text = str;
        this.links = list;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.bamtechmedia.dominguez.legal.api.LegalLink>, for r2v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.bamtechmedia.dominguez.legal.api.LegalDocContent copy$default(com.bamtechmedia.dominguez.legal.api.LegalDocContent r0, java.lang.String r1, java.util.List<com.bamtechmedia.dominguez.legal.api.LegalLink> r2, int r3, java.lang.Object r4) {
        /*
            r4 = r3 & 1
            if (r4 == 0) goto L_0x0006
            java.lang.String r1 = r0.text
        L_0x0006:
            r3 = r3 & 2
            if (r3 == 0) goto L_0x000c
            java.util.List<com.bamtechmedia.dominguez.legal.api.LegalLink> r2 = r0.links
        L_0x000c:
            com.bamtechmedia.dominguez.legal.api.LegalDocContent r0 = r0.copy(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.legal.api.LegalDocContent.copy$default(com.bamtechmedia.dominguez.legal.api.LegalDocContent, java.lang.String, java.util.List, int, java.lang.Object):com.bamtechmedia.dominguez.legal.api.LegalDocContent");
    }

    public final String component1() {
        return this.text;
    }

    public final List<LegalLink> component2() {
        return this.links;
    }

    public final LegalDocContent copy(String str, List<LegalLink> list) {
        return new LegalDocContent(str, list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.links, (java.lang.Object) r3.links) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.legal.api.LegalDocContent
            if (r0 == 0) goto L_0x001d
            com.bamtechmedia.dominguez.legal.api.LegalDocContent r3 = (com.bamtechmedia.dominguez.legal.api.LegalDocContent) r3
            java.lang.String r0 = r2.text
            java.lang.String r1 = r3.text
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.util.List<com.bamtechmedia.dominguez.legal.api.LegalLink> r0 = r2.links
            java.util.List<com.bamtechmedia.dominguez.legal.api.LegalLink> r3 = r3.links
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
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.legal.api.LegalDocContent.equals(java.lang.Object):boolean");
    }

    public final List<LegalLink> getLinks() {
        return this.links;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.text;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<LegalLink> list = this.links;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LegalDocContent(text=");
        sb.append(this.text);
        sb.append(", links=");
        sb.append(this.links);
        sb.append(")");
        return sb.toString();
    }
}
