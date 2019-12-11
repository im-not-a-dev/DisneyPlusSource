package com.bamtechmedia.dominguez.legal;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/legal/ComplianceData;", "", "ageBands", "Lcom/bamtechmedia/dominguez/legal/AgeBandData;", "(Lcom/bamtechmedia/dominguez/legal/AgeBandData;)V", "getAgeBands", "()Lcom/bamtechmedia/dominguez/legal/AgeBandData;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "legal_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: LegalResponseModels.kt */
public final class ComplianceData {
    private final AgeBandData ageBands;

    public ComplianceData(AgeBandData ageBandData) {
        this.ageBands = ageBandData;
    }

    public static /* synthetic */ ComplianceData copy$default(ComplianceData complianceData, AgeBandData ageBandData, int i, Object obj) {
        if ((i & 1) != 0) {
            ageBandData = complianceData.ageBands;
        }
        return complianceData.copy(ageBandData);
    }

    public final AgeBandData component1() {
        return this.ageBands;
    }

    public final ComplianceData copy(AgeBandData ageBandData) {
        return new ComplianceData(ageBandData);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.ageBands, (java.lang.Object) ((com.bamtechmedia.dominguez.legal.ComplianceData) r2).ageBands) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.bamtechmedia.dominguez.legal.ComplianceData
            if (r0 == 0) goto L_0x0013
            com.bamtechmedia.dominguez.legal.ComplianceData r2 = (com.bamtechmedia.dominguez.legal.ComplianceData) r2
            com.bamtechmedia.dominguez.legal.AgeBandData r0 = r1.ageBands
            com.bamtechmedia.dominguez.legal.AgeBandData r2 = r2.ageBands
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
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.legal.ComplianceData.equals(java.lang.Object):boolean");
    }

    public final AgeBandData getAgeBands() {
        return this.ageBands;
    }

    public int hashCode() {
        AgeBandData ageBandData = this.ageBands;
        if (ageBandData != null) {
            return ageBandData.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ComplianceData(ageBands=");
        sb.append(this.ageBands);
        sb.append(")");
        return sb.toString();
    }
}
