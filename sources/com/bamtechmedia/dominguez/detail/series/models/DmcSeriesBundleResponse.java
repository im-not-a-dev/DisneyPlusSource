package com.bamtechmedia.dominguez.detail.series.models;

import kotlin.Metadata;
import p163g.p500m.p501a.C11724g;
import p163g.p500m.p501a.C11733i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/series/models/DmcSeriesBundleResponse;", "", "seriesBundle", "Lcom/bamtechmedia/dominguez/detail/series/models/DmcSeriesBundle;", "(Lcom/bamtechmedia/dominguez/detail/series/models/DmcSeriesBundle;)V", "getSeriesBundle", "()Lcom/bamtechmedia/dominguez/detail/series/models/DmcSeriesBundle;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: SeriesDetailModels.kt */
public final class DmcSeriesBundleResponse {

    /* renamed from: a */
    private final DmcSeriesBundle f13920a;

    public DmcSeriesBundleResponse(@C11724g(name = "DmcSeriesBundle") DmcSeriesBundle dmcSeriesBundle) {
        this.f13920a = dmcSeriesBundle;
    }

    /* renamed from: a */
    public final DmcSeriesBundle mo18193a() {
        return this.f13920a;
    }

    public final DmcSeriesBundleResponse copy(@C11724g(name = "DmcSeriesBundle") DmcSeriesBundle dmcSeriesBundle) {
        return new DmcSeriesBundleResponse(dmcSeriesBundle);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r1.f13920a, (java.lang.Object) ((com.bamtechmedia.dominguez.detail.series.models.DmcSeriesBundleResponse) r2).f13920a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.bamtechmedia.dominguez.detail.series.models.DmcSeriesBundleResponse
            if (r0 == 0) goto L_0x0013
            com.bamtechmedia.dominguez.detail.series.models.DmcSeriesBundleResponse r2 = (com.bamtechmedia.dominguez.detail.series.models.DmcSeriesBundleResponse) r2
            com.bamtechmedia.dominguez.detail.series.models.DmcSeriesBundle r0 = r1.f13920a
            com.bamtechmedia.dominguez.detail.series.models.DmcSeriesBundle r2 = r2.f13920a
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
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.detail.series.models.DmcSeriesBundleResponse.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        DmcSeriesBundle dmcSeriesBundle = this.f13920a;
        if (dmcSeriesBundle != null) {
            return dmcSeriesBundle.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DmcSeriesBundleResponse(seriesBundle=");
        sb.append(this.f13920a);
        sb.append(")");
        return sb.toString();
    }
}
