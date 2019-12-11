package com.bamtechmedia.dominguez.detail.movie.models;

import kotlin.Metadata;
import p163g.p500m.p501a.C11724g;
import p163g.p500m.p501a.C11733i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/movie/models/DmcVideoBundleResponse;", "", "videoDetailBundle", "Lcom/bamtechmedia/dominguez/detail/movie/models/DmcVideoBundle;", "(Lcom/bamtechmedia/dominguez/detail/movie/models/DmcVideoBundle;)V", "getVideoDetailBundle", "()Lcom/bamtechmedia/dominguez/detail/movie/models/DmcVideoBundle;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: MovieDetailsModels.kt */
public final class DmcVideoBundleResponse {

    /* renamed from: a */
    private final DmcVideoBundle f13879a;

    public DmcVideoBundleResponse(@C11724g(name = "DmcVideoBundle") DmcVideoBundle dmcVideoBundle) {
        this.f13879a = dmcVideoBundle;
    }

    /* renamed from: a */
    public final DmcVideoBundle mo18098a() {
        return this.f13879a;
    }

    public final DmcVideoBundleResponse copy(@C11724g(name = "DmcVideoBundle") DmcVideoBundle dmcVideoBundle) {
        return new DmcVideoBundleResponse(dmcVideoBundle);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r1.f13879a, (java.lang.Object) ((com.bamtechmedia.dominguez.detail.movie.models.DmcVideoBundleResponse) r2).f13879a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.bamtechmedia.dominguez.detail.movie.models.DmcVideoBundleResponse
            if (r0 == 0) goto L_0x0013
            com.bamtechmedia.dominguez.detail.movie.models.DmcVideoBundleResponse r2 = (com.bamtechmedia.dominguez.detail.movie.models.DmcVideoBundleResponse) r2
            com.bamtechmedia.dominguez.detail.movie.models.DmcVideoBundle r0 = r1.f13879a
            com.bamtechmedia.dominguez.detail.movie.models.DmcVideoBundle r2 = r2.f13879a
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
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.detail.movie.models.DmcVideoBundleResponse.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        DmcVideoBundle dmcVideoBundle = this.f13879a;
        if (dmcVideoBundle != null) {
            return dmcVideoBundle.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DmcVideoBundleResponse(videoDetailBundle=");
        sb.append(this.f13879a);
        sb.append(")");
        return sb.toString();
    }
}
