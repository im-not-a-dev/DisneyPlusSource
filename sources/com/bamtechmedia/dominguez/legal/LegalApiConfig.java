package com.bamtechmedia.dominguez.legal;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/legal/LegalApiConfig;", "", "cdnBaseUrl", "", "nrtBaseUrl", "(Ljava/lang/String;Ljava/lang/String;)V", "getCdnBaseUrl", "()Ljava/lang/String;", "getNrtBaseUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "legal_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: LegalApiConfig.kt */
public final class LegalApiConfig {
    private final String cdnBaseUrl;
    private final String nrtBaseUrl;

    public LegalApiConfig(String str, String str2) {
        this.cdnBaseUrl = str;
        this.nrtBaseUrl = str2;
    }

    public static /* synthetic */ LegalApiConfig copy$default(LegalApiConfig legalApiConfig, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = legalApiConfig.cdnBaseUrl;
        }
        if ((i & 2) != 0) {
            str2 = legalApiConfig.nrtBaseUrl;
        }
        return legalApiConfig.copy(str, str2);
    }

    public final String component1() {
        return this.cdnBaseUrl;
    }

    public final String component2() {
        return this.nrtBaseUrl;
    }

    public final LegalApiConfig copy(String str, String str2) {
        return new LegalApiConfig(str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.nrtBaseUrl, (java.lang.Object) r3.nrtBaseUrl) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.legal.LegalApiConfig
            if (r0 == 0) goto L_0x001d
            com.bamtechmedia.dominguez.legal.LegalApiConfig r3 = (com.bamtechmedia.dominguez.legal.LegalApiConfig) r3
            java.lang.String r0 = r2.cdnBaseUrl
            java.lang.String r1 = r3.cdnBaseUrl
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.nrtBaseUrl
            java.lang.String r3 = r3.nrtBaseUrl
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
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.legal.LegalApiConfig.equals(java.lang.Object):boolean");
    }

    public final String getCdnBaseUrl() {
        return this.cdnBaseUrl;
    }

    public final String getNrtBaseUrl() {
        return this.nrtBaseUrl;
    }

    public int hashCode() {
        String str = this.cdnBaseUrl;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.nrtBaseUrl;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LegalApiConfig(cdnBaseUrl=");
        sb.append(this.cdnBaseUrl);
        sb.append(", nrtBaseUrl=");
        sb.append(this.nrtBaseUrl);
        sb.append(")");
        return sb.toString();
    }
}
