package com.bamtechmedia.dominguez.core.content.search;

import java.util.List;
import kotlin.Metadata;
import p163g.p500m.p501a.C11733i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/search/Data;", "", "suggestions", "", "Lcom/bamtechmedia/dominguez/core/content/search/Suggestion;", "(Ljava/util/List;)V", "getSuggestions", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "coreContentApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: SearchSuggestionModels.kt */
public final class Data {

    /* renamed from: a */
    private final List<Suggestion> f9305a;

    public Data(List<Suggestion> list) {
        this.f9305a = list;
    }

    /* renamed from: a */
    public final List<Suggestion> mo13556a() {
        return this.f9305a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f9305a, (java.lang.Object) ((com.bamtechmedia.dominguez.core.content.search.Data) r2).f9305a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.bamtechmedia.dominguez.core.content.search.Data
            if (r0 == 0) goto L_0x0013
            com.bamtechmedia.dominguez.core.content.search.Data r2 = (com.bamtechmedia.dominguez.core.content.search.Data) r2
            java.util.List<com.bamtechmedia.dominguez.core.content.search.Suggestion> r0 = r1.f9305a
            java.util.List<com.bamtechmedia.dominguez.core.content.search.Suggestion> r2 = r2.f9305a
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
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.content.search.Data.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        List<Suggestion> list = this.f9305a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Data(suggestions=");
        sb.append(this.f9305a);
        sb.append(")");
        return sb.toString();
    }
}
