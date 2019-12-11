package com.bamtechmedia.dominguez.search;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p163g.p500m.p501a.C11733i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0010J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0010R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/search/RecentSearchList;", "", "recentSearches", "", "Lcom/bamtechmedia/dominguez/search/RecentSearch;", "(Ljava/util/List;)V", "getRecentSearches", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "withRecentSearchAdded", "searchTerm", "withRecentSearchRemoved", "search_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: RecentSearchModels.kt */
public final class RecentSearchList {

    /* renamed from: a */
    private final List<RecentSearch> f17095a;

    public RecentSearchList(List<RecentSearch> list) {
        this.f17095a = list;
    }

    /* renamed from: a */
    public final List<RecentSearch> mo20854a() {
        return this.f17095a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r1.f17095a, (java.lang.Object) ((com.bamtechmedia.dominguez.search.RecentSearchList) r2).f17095a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.bamtechmedia.dominguez.search.RecentSearchList
            if (r0 == 0) goto L_0x0013
            com.bamtechmedia.dominguez.search.RecentSearchList r2 = (com.bamtechmedia.dominguez.search.RecentSearchList) r2
            java.util.List<com.bamtechmedia.dominguez.search.RecentSearch> r0 = r1.f17095a
            java.util.List<com.bamtechmedia.dominguez.search.RecentSearch> r2 = r2.f17095a
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
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.search.RecentSearchList.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        List<RecentSearch> list = this.f17095a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RecentSearchList(recentSearches=");
        sb.append(this.f17095a);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public final RecentSearchList mo20853a(String str) {
        RecentSearch recentSearch = new RecentSearch(str);
        List<RecentSearch> list = this.f17095a;
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (!C12880j.m40224a((Object) ((RecentSearch) next).mo20847a(), (Object) str)) {
                arrayList.add(next);
            }
        }
        return new RecentSearchList(C13199w.m40580d((Iterable) C13199w.m40583d((Collection) C13183n.m40498a(recentSearch), (Iterable) arrayList), 10));
    }
}
