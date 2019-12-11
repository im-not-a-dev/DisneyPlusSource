package com.bamtechmedia.dominguez.detail.common;

import com.bamtech.sdk4.content.SearchOverrides;
import com.bamtechmedia.dominguez.config.C3524e;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C12907r;
import org.joda.time.DateTime;

/* renamed from: com.bamtechmedia.dominguez.detail.common.p */
/* compiled from: PromoConfig.kt */
public final class C5996p {

    /* renamed from: a */
    private final C3524e f13836a;

    /* renamed from: b */
    private final SearchOverrides f13837b;

    public C5996p(C3524e eVar, SearchOverrides searchOverrides) {
        this.f13836a = eVar;
        this.f13837b = searchOverrides;
    }

    /* renamed from: a */
    public final List<String> mo18039a() {
        List<String> list = (List) this.f13836a.mo12720d("promoLabels", "allSubTypes");
        return list != null ? list : C13185o.m40520c("series", "movie", "season", "episode", "short-form", "video");
    }

    /* renamed from: b */
    public final DateTime mo18040b() {
        Long activeDate = this.f13837b.getActiveDate();
        if (activeDate != null) {
            return new DateTime(activeDate.longValue());
        }
        return null;
    }

    /* renamed from: c */
    public final Set<String> mo18041c() {
        Set<String> set = (Set) this.f13836a.mo12720d("sunrisePromoLabels", new String[0]);
        return set != null ? set : C13186o0.m40524a("NewlyAdded");
    }

    /* renamed from: d */
    public final Map<String, List<String>> mo18042d() {
        Map<String, List<String>> map = (Map) this.f13836a.mo12720d("promoLabels", "supportedTypes");
        if (map != null) {
            return map;
        }
        return C13173j0.m40356a(C12907r.m40244a("NewlyAdded", mo18039a()), C12907r.m40244a("ComingSoon", mo18039a()), C12907r.m40244a("LeavingSoon", mo18039a()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.f13837b, (java.lang.Object) r3.f13837b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.detail.common.C5996p
            if (r0 == 0) goto L_0x001d
            com.bamtechmedia.dominguez.detail.common.p r3 = (com.bamtechmedia.dominguez.detail.common.C5996p) r3
            com.bamtechmedia.dominguez.config.e r0 = r2.f13836a
            com.bamtechmedia.dominguez.config.e r1 = r3.f13836a
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.bamtech.sdk4.content.SearchOverrides r0 = r2.f13837b
            com.bamtech.sdk4.content.SearchOverrides r3 = r3.f13837b
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
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.detail.common.C5996p.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        C3524e eVar = this.f13836a;
        int i = 0;
        int hashCode = (eVar != null ? eVar.hashCode() : 0) * 31;
        SearchOverrides searchOverrides = this.f13837b;
        if (searchOverrides != null) {
            i = searchOverrides.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PromoConfig(map=");
        sb.append(this.f13836a);
        sb.append(", searchOverrides=");
        sb.append(this.f13837b);
        sb.append(")");
        return sb.toString();
    }
}
