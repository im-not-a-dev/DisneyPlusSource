package com.bamtechmedia.dominguez.legal;

import kotlin.Metadata;
import p163g.p500m.p501a.C11724g;
import p163g.p500m.p501a.C11733i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/legal/AgeBandData;", "", "adult", "Lcom/bamtechmedia/dominguez/legal/AgeBandEntity;", "(Lcom/bamtechmedia/dominguez/legal/AgeBandEntity;)V", "getAdult", "()Lcom/bamtechmedia/dominguez/legal/AgeBandEntity;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "legal_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: LegalResponseModels.kt */
public final class AgeBandData {
    private final AgeBandEntity adult;

    public AgeBandData(@C11724g(name = "ADULT") AgeBandEntity ageBandEntity) {
        this.adult = ageBandEntity;
    }

    public static /* synthetic */ AgeBandData copy$default(AgeBandData ageBandData, AgeBandEntity ageBandEntity, int i, Object obj) {
        if ((i & 1) != 0) {
            ageBandEntity = ageBandData.adult;
        }
        return ageBandData.copy(ageBandEntity);
    }

    public final AgeBandEntity component1() {
        return this.adult;
    }

    public final AgeBandData copy(@C11724g(name = "ADULT") AgeBandEntity ageBandEntity) {
        return new AgeBandData(ageBandEntity);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r1.adult, (java.lang.Object) ((com.bamtechmedia.dominguez.legal.AgeBandData) r2).adult) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.bamtechmedia.dominguez.legal.AgeBandData
            if (r0 == 0) goto L_0x0013
            com.bamtechmedia.dominguez.legal.AgeBandData r2 = (com.bamtechmedia.dominguez.legal.AgeBandData) r2
            com.bamtechmedia.dominguez.legal.AgeBandEntity r0 = r1.adult
            com.bamtechmedia.dominguez.legal.AgeBandEntity r2 = r2.adult
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
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.legal.AgeBandData.equals(java.lang.Object):boolean");
    }

    public final AgeBandEntity getAdult() {
        return this.adult;
    }

    public int hashCode() {
        AgeBandEntity ageBandEntity = this.adult;
        if (ageBandEntity != null) {
            return ageBandEntity.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AgeBandData(adult=");
        sb.append(this.adult);
        sb.append(")");
        return sb.toString();
    }
}
