package com.bamtechmedia.dominguez.legal.api;

import kotlin.Metadata;
import p163g.p500m.p501a.C11724g;
import p163g.p500m.p501a.C11733i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/legal/api/MarketingData;", "", "adult", "Lcom/bamtechmedia/dominguez/legal/api/MarketingEntries;", "(Lcom/bamtechmedia/dominguez/legal/api/MarketingEntries;)V", "getAdult", "()Lcom/bamtechmedia/dominguez/legal/api/MarketingEntries;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "legalApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: LegalDataModels.kt */
public final class MarketingData {
    private final MarketingEntries adult;

    public MarketingData(@C11724g(name = "ADULT") MarketingEntries marketingEntries) {
        this.adult = marketingEntries;
    }

    public static /* synthetic */ MarketingData copy$default(MarketingData marketingData, MarketingEntries marketingEntries, int i, Object obj) {
        if ((i & 1) != 0) {
            marketingEntries = marketingData.adult;
        }
        return marketingData.copy(marketingEntries);
    }

    public final MarketingEntries component1() {
        return this.adult;
    }

    public final MarketingData copy(@C11724g(name = "ADULT") MarketingEntries marketingEntries) {
        return new MarketingData(marketingEntries);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r1.adult, (java.lang.Object) ((com.bamtechmedia.dominguez.legal.api.MarketingData) r2).adult) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.bamtechmedia.dominguez.legal.api.MarketingData
            if (r0 == 0) goto L_0x0013
            com.bamtechmedia.dominguez.legal.api.MarketingData r2 = (com.bamtechmedia.dominguez.legal.api.MarketingData) r2
            com.bamtechmedia.dominguez.legal.api.MarketingEntries r0 = r1.adult
            com.bamtechmedia.dominguez.legal.api.MarketingEntries r2 = r2.adult
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
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.legal.api.MarketingData.equals(java.lang.Object):boolean");
    }

    public final MarketingEntries getAdult() {
        return this.adult;
    }

    public int hashCode() {
        MarketingEntries marketingEntries = this.adult;
        if (marketingEntries != null) {
            return marketingEntries.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MarketingData(adult=");
        sb.append(this.adult);
        sb.append(")");
        return sb.toString();
    }
}
