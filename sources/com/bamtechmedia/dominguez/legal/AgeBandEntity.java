package com.bamtechmedia.dominguez.legal;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/legal/AgeBandEntity;", "", "country", "", "(Ljava/lang/String;)V", "getCountry", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "legal_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: LegalResponseModels.kt */
public final class AgeBandEntity {
    private final String country;

    public AgeBandEntity(String str) {
        this.country = str;
    }

    public static /* synthetic */ AgeBandEntity copy$default(AgeBandEntity ageBandEntity, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ageBandEntity.country;
        }
        return ageBandEntity.copy(str);
    }

    public final String component1() {
        return this.country;
    }

    public final AgeBandEntity copy(String str) {
        return new AgeBandEntity(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.country, (java.lang.Object) ((com.bamtechmedia.dominguez.legal.AgeBandEntity) r2).country) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.bamtechmedia.dominguez.legal.AgeBandEntity
            if (r0 == 0) goto L_0x0013
            com.bamtechmedia.dominguez.legal.AgeBandEntity r2 = (com.bamtechmedia.dominguez.legal.AgeBandEntity) r2
            java.lang.String r0 = r1.country
            java.lang.String r2 = r2.country
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
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.legal.AgeBandEntity.equals(java.lang.Object):boolean");
    }

    public final String getCountry() {
        return this.country;
    }

    public int hashCode() {
        String str = this.country;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AgeBandEntity(country=");
        sb.append(this.country);
        sb.append(")");
        return sb.toString();
    }
}
