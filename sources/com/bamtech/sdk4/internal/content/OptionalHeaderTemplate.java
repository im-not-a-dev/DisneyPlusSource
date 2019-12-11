package com.bamtech.sdk4.internal.content;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/content/OptionalHeaderTemplate;", "", "name", "", "template", "value", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getTemplate", "getValue", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "extension-content"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ContentClient.kt */
public final class OptionalHeaderTemplate {
    private final String name;
    private final String template;
    private final String value;

    public OptionalHeaderTemplate(String str, String str2, String str3) {
        this.name = str;
        this.template = str2;
        this.value = str3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.value, (java.lang.Object) r3.value) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.bamtech.sdk4.internal.content.OptionalHeaderTemplate
            if (r0 == 0) goto L_0x0027
            com.bamtech.sdk4.internal.content.OptionalHeaderTemplate r3 = (com.bamtech.sdk4.internal.content.OptionalHeaderTemplate) r3
            java.lang.String r0 = r2.name
            java.lang.String r1 = r3.name
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.template
            java.lang.String r1 = r3.template
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.value
            java.lang.String r3 = r3.value
            boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
            if (r3 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            return r3
        L_0x0029:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.content.OptionalHeaderTemplate.equals(java.lang.Object):boolean");
    }

    public final String getName() {
        return this.name;
    }

    public final String getTemplate() {
        return this.template;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.name;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.template;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.value;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OptionalHeaderTemplate(name=");
        sb.append(this.name);
        sb.append(", template=");
        sb.append(this.template);
        sb.append(", value=");
        sb.append(this.value);
        sb.append(")");
        return sb.toString();
    }
}
