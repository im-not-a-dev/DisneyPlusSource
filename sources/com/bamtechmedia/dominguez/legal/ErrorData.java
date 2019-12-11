package com.bamtechmedia.dominguez.legal;

import com.bamtechmedia.dominguez.legal.api.LegalDisclosure;
import com.bamtechmedia.dominguez.legal.api.MarketingEntity;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/legal/ErrorData;", "", "type", "", "disclosures", "", "Lcom/bamtechmedia/dominguez/legal/api/LegalDisclosure;", "entities", "Lcom/bamtechmedia/dominguez/legal/api/MarketingEntity;", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getDisclosures", "()Ljava/util/List;", "getEntities", "getType", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "legal_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: LegalResponseModels.kt */
public final class ErrorData {
    private final List<LegalDisclosure> disclosures;
    private final List<MarketingEntity> entities;
    private final String type;

    public ErrorData(String str, List<LegalDisclosure> list, List<MarketingEntity> list2) {
        this.type = str;
        this.disclosures = list;
        this.entities = list2;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.bamtechmedia.dominguez.legal.api.LegalDisclosure>, for r2v0, types: [java.util.List] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.bamtechmedia.dominguez.legal.api.MarketingEntity>, for r3v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.bamtechmedia.dominguez.legal.ErrorData copy$default(com.bamtechmedia.dominguez.legal.ErrorData r0, java.lang.String r1, java.util.List<com.bamtechmedia.dominguez.legal.api.LegalDisclosure> r2, java.util.List<com.bamtechmedia.dominguez.legal.api.MarketingEntity> r3, int r4, java.lang.Object r5) {
        /*
            r5 = r4 & 1
            if (r5 == 0) goto L_0x0006
            java.lang.String r1 = r0.type
        L_0x0006:
            r5 = r4 & 2
            if (r5 == 0) goto L_0x000c
            java.util.List<com.bamtechmedia.dominguez.legal.api.LegalDisclosure> r2 = r0.disclosures
        L_0x000c:
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0012
            java.util.List<com.bamtechmedia.dominguez.legal.api.MarketingEntity> r3 = r0.entities
        L_0x0012:
            com.bamtechmedia.dominguez.legal.ErrorData r0 = r0.copy(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.legal.ErrorData.copy$default(com.bamtechmedia.dominguez.legal.ErrorData, java.lang.String, java.util.List, java.util.List, int, java.lang.Object):com.bamtechmedia.dominguez.legal.ErrorData");
    }

    public final String component1() {
        return this.type;
    }

    public final List<LegalDisclosure> component2() {
        return this.disclosures;
    }

    public final List<MarketingEntity> component3() {
        return this.entities;
    }

    public final ErrorData copy(String str, List<LegalDisclosure> list, List<MarketingEntity> list2) {
        return new ErrorData(str, list, list2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.entities, (java.lang.Object) r3.entities) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.legal.ErrorData
            if (r0 == 0) goto L_0x0027
            com.bamtechmedia.dominguez.legal.ErrorData r3 = (com.bamtechmedia.dominguez.legal.ErrorData) r3
            java.lang.String r0 = r2.type
            java.lang.String r1 = r3.type
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.util.List<com.bamtechmedia.dominguez.legal.api.LegalDisclosure> r0 = r2.disclosures
            java.util.List<com.bamtechmedia.dominguez.legal.api.LegalDisclosure> r1 = r3.disclosures
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.util.List<com.bamtechmedia.dominguez.legal.api.MarketingEntity> r0 = r2.entities
            java.util.List<com.bamtechmedia.dominguez.legal.api.MarketingEntity> r3 = r3.entities
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            return r3
        L_0x0029:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.legal.ErrorData.equals(java.lang.Object):boolean");
    }

    public final List<LegalDisclosure> getDisclosures() {
        return this.disclosures;
    }

    public final List<MarketingEntity> getEntities() {
        return this.entities;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<LegalDisclosure> list = this.disclosures;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<MarketingEntity> list2 = this.entities;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ErrorData(type=");
        sb.append(this.type);
        sb.append(", disclosures=");
        sb.append(this.disclosures);
        sb.append(", entities=");
        sb.append(this.entities);
        sb.append(")");
        return sb.toString();
    }
}
