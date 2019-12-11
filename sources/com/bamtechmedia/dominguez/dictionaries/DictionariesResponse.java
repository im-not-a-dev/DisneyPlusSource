package com.bamtechmedia.dominguez.dictionaries;

import java.util.List;
import kotlin.Metadata;
import p163g.p500m.p501a.C11724g;
import p163g.p500m.p501a.C11733i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/dictionaries/DictionariesResponse;", "", "dictionaries", "", "Lcom/bamtechmedia/dominguez/dictionaries/Dictionary;", "(Ljava/util/List;)V", "getDictionaries", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "config_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: DictionariesModels.kt */
public final class DictionariesResponse {

    /* renamed from: a */
    private final List<Dictionary> f13958a;

    public DictionariesResponse(@C11724g(name = "Dictionaries") List<Dictionary> list) {
        this.f13958a = list;
    }

    /* renamed from: a */
    public final List<Dictionary> mo18319a() {
        return this.f13958a;
    }

    public final DictionariesResponse copy(@C11724g(name = "Dictionaries") List<Dictionary> list) {
        return new DictionariesResponse(list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r1.f13958a, (java.lang.Object) ((com.bamtechmedia.dominguez.dictionaries.DictionariesResponse) r2).f13958a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.bamtechmedia.dominguez.dictionaries.DictionariesResponse
            if (r0 == 0) goto L_0x0013
            com.bamtechmedia.dominguez.dictionaries.DictionariesResponse r2 = (com.bamtechmedia.dominguez.dictionaries.DictionariesResponse) r2
            java.util.List<com.bamtechmedia.dominguez.dictionaries.Dictionary> r0 = r1.f13958a
            java.util.List<com.bamtechmedia.dominguez.dictionaries.Dictionary> r2 = r2.f13958a
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
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.dictionaries.DictionariesResponse.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        List<Dictionary> list = this.f13958a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DictionariesResponse(dictionaries=");
        sb.append(this.f13958a);
        sb.append(")");
        return sb.toString();
    }
}
