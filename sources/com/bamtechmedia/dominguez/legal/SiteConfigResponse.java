package com.bamtechmedia.dominguez.legal;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/legal/SiteConfigResponse;", "Lcom/bamtechmedia/dominguez/legal/OneIdApiResponse;", "data", "Lcom/bamtechmedia/dominguez/legal/SiteConfigData;", "error", "Lcom/bamtechmedia/dominguez/legal/OneIdErrorWrapper;", "(Lcom/bamtechmedia/dominguez/legal/SiteConfigData;Lcom/bamtechmedia/dominguez/legal/OneIdErrorWrapper;)V", "getData", "()Lcom/bamtechmedia/dominguez/legal/SiteConfigData;", "getError", "()Lcom/bamtechmedia/dominguez/legal/OneIdErrorWrapper;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "legal_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: LegalResponseModels.kt */
public final class SiteConfigResponse implements OneIdApiResponse {
    private final SiteConfigData data;
    private final OneIdErrorWrapper error;

    public SiteConfigResponse(SiteConfigData siteConfigData, OneIdErrorWrapper oneIdErrorWrapper) {
        this.data = siteConfigData;
        this.error = oneIdErrorWrapper;
    }

    public static /* synthetic */ SiteConfigResponse copy$default(SiteConfigResponse siteConfigResponse, SiteConfigData siteConfigData, OneIdErrorWrapper oneIdErrorWrapper, int i, Object obj) {
        if ((i & 1) != 0) {
            siteConfigData = siteConfigResponse.data;
        }
        if ((i & 2) != 0) {
            oneIdErrorWrapper = siteConfigResponse.getError();
        }
        return siteConfigResponse.copy(siteConfigData, oneIdErrorWrapper);
    }

    public final SiteConfigData component1() {
        return this.data;
    }

    public final OneIdErrorWrapper component2() {
        return getError();
    }

    public final SiteConfigResponse copy(SiteConfigData siteConfigData, OneIdErrorWrapper oneIdErrorWrapper) {
        return new SiteConfigResponse(siteConfigData, oneIdErrorWrapper);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) getError(), (java.lang.Object) r3.getError()) != false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0023
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.legal.SiteConfigResponse
            if (r0 == 0) goto L_0x0021
            com.bamtechmedia.dominguez.legal.SiteConfigResponse r3 = (com.bamtechmedia.dominguez.legal.SiteConfigResponse) r3
            com.bamtechmedia.dominguez.legal.SiteConfigData r0 = r2.data
            com.bamtechmedia.dominguez.legal.SiteConfigData r1 = r3.data
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0021
            com.bamtechmedia.dominguez.legal.OneIdErrorWrapper r0 = r2.getError()
            com.bamtechmedia.dominguez.legal.OneIdErrorWrapper r3 = r3.getError()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r3 = 0
            return r3
        L_0x0023:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.legal.SiteConfigResponse.equals(java.lang.Object):boolean");
    }

    public final SiteConfigData getData() {
        return this.data;
    }

    public OneIdErrorWrapper getError() {
        return this.error;
    }

    public int hashCode() {
        SiteConfigData siteConfigData = this.data;
        int i = 0;
        int hashCode = (siteConfigData != null ? siteConfigData.hashCode() : 0) * 31;
        OneIdErrorWrapper error2 = getError();
        if (error2 != null) {
            i = error2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SiteConfigResponse(data=");
        sb.append(this.data);
        sb.append(", error=");
        sb.append(getError());
        sb.append(")");
        return sb.toString();
    }
}
