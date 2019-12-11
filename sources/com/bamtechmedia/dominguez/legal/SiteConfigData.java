package com.bamtechmedia.dominguez.legal;

import com.bamtechmedia.dominguez.legal.api.MarketingData;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/legal/SiteConfigData;", "", "marketing", "Lcom/bamtechmedia/dominguez/legal/api/MarketingData;", "legal", "Lcom/bamtechmedia/dominguez/legal/LegalData;", "compliance", "Lcom/bamtechmedia/dominguez/legal/ComplianceData;", "(Lcom/bamtechmedia/dominguez/legal/api/MarketingData;Lcom/bamtechmedia/dominguez/legal/LegalData;Lcom/bamtechmedia/dominguez/legal/ComplianceData;)V", "getCompliance", "()Lcom/bamtechmedia/dominguez/legal/ComplianceData;", "getLegal", "()Lcom/bamtechmedia/dominguez/legal/LegalData;", "getMarketing", "()Lcom/bamtechmedia/dominguez/legal/api/MarketingData;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "legal_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: LegalResponseModels.kt */
public final class SiteConfigData {
    private final ComplianceData compliance;
    private final LegalData legal;
    private final MarketingData marketing;

    public SiteConfigData(MarketingData marketingData, LegalData legalData, ComplianceData complianceData) {
        this.marketing = marketingData;
        this.legal = legalData;
        this.compliance = complianceData;
    }

    public static /* synthetic */ SiteConfigData copy$default(SiteConfigData siteConfigData, MarketingData marketingData, LegalData legalData, ComplianceData complianceData, int i, Object obj) {
        if ((i & 1) != 0) {
            marketingData = siteConfigData.marketing;
        }
        if ((i & 2) != 0) {
            legalData = siteConfigData.legal;
        }
        if ((i & 4) != 0) {
            complianceData = siteConfigData.compliance;
        }
        return siteConfigData.copy(marketingData, legalData, complianceData);
    }

    public final MarketingData component1() {
        return this.marketing;
    }

    public final LegalData component2() {
        return this.legal;
    }

    public final ComplianceData component3() {
        return this.compliance;
    }

    public final SiteConfigData copy(MarketingData marketingData, LegalData legalData, ComplianceData complianceData) {
        return new SiteConfigData(marketingData, legalData, complianceData);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.compliance, (java.lang.Object) r3.compliance) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.legal.SiteConfigData
            if (r0 == 0) goto L_0x0027
            com.bamtechmedia.dominguez.legal.SiteConfigData r3 = (com.bamtechmedia.dominguez.legal.SiteConfigData) r3
            com.bamtechmedia.dominguez.legal.api.MarketingData r0 = r2.marketing
            com.bamtechmedia.dominguez.legal.api.MarketingData r1 = r3.marketing
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0027
            com.bamtechmedia.dominguez.legal.LegalData r0 = r2.legal
            com.bamtechmedia.dominguez.legal.LegalData r1 = r3.legal
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0027
            com.bamtechmedia.dominguez.legal.ComplianceData r0 = r2.compliance
            com.bamtechmedia.dominguez.legal.ComplianceData r3 = r3.compliance
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
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.legal.SiteConfigData.equals(java.lang.Object):boolean");
    }

    public final ComplianceData getCompliance() {
        return this.compliance;
    }

    public final LegalData getLegal() {
        return this.legal;
    }

    public final MarketingData getMarketing() {
        return this.marketing;
    }

    public int hashCode() {
        MarketingData marketingData = this.marketing;
        int i = 0;
        int hashCode = (marketingData != null ? marketingData.hashCode() : 0) * 31;
        LegalData legalData = this.legal;
        int hashCode2 = (hashCode + (legalData != null ? legalData.hashCode() : 0)) * 31;
        ComplianceData complianceData = this.compliance;
        if (complianceData != null) {
            i = complianceData.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SiteConfigData(marketing=");
        sb.append(this.marketing);
        sb.append(", legal=");
        sb.append(this.legal);
        sb.append(", compliance=");
        sb.append(this.compliance);
        sb.append(")");
        return sb.toString();
    }
}
