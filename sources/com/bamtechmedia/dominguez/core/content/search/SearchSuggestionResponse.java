package com.bamtechmedia.dominguez.core.content.search;

import kotlin.Metadata;
import p163g.p500m.p501a.C11733i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/search/SearchSuggestionResponse;", "", "data", "Lcom/bamtechmedia/dominguez/core/content/search/Data;", "(Lcom/bamtechmedia/dominguez/core/content/search/Data;)V", "getData", "()Lcom/bamtechmedia/dominguez/core/content/search/Data;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "coreContentApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: SearchSuggestionModels.kt */
public final class SearchSuggestionResponse {

    /* renamed from: a */
    private final Data f9306a;

    public SearchSuggestionResponse(Data data) {
        this.f9306a = data;
    }

    /* renamed from: a */
    public final Data mo13562a() {
        return this.f9306a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r1.f9306a, (java.lang.Object) ((com.bamtechmedia.dominguez.core.content.search.SearchSuggestionResponse) r2).f9306a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.bamtechmedia.dominguez.core.content.search.SearchSuggestionResponse
            if (r0 == 0) goto L_0x0013
            com.bamtechmedia.dominguez.core.content.search.SearchSuggestionResponse r2 = (com.bamtechmedia.dominguez.core.content.search.SearchSuggestionResponse) r2
            com.bamtechmedia.dominguez.core.content.search.Data r0 = r1.f9306a
            com.bamtechmedia.dominguez.core.content.search.Data r2 = r2.f9306a
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
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.content.search.SearchSuggestionResponse.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Data data = this.f9306a;
        if (data != null) {
            return data.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SearchSuggestionResponse(data=");
        sb.append(this.f9306a);
        sb.append(")");
        return sb.toString();
    }
}
