package com.bamtechmedia.dominguez.dictionaries;

import java.util.Map;
import kotlin.Metadata;
import p163g.p500m.p501a.C11724g;
import p163g.p500m.p501a.C11733i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J3\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0003\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/dictionaries/Dictionary;", "", "version", "", "resourceKey", "entries", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getEntries", "()Ljava/util/Map;", "getResourceKey", "()Ljava/lang/String;", "getVersion", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "config_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: DictionariesModels.kt */
public final class Dictionary {

    /* renamed from: a */
    private final String f13959a;

    /* renamed from: b */
    private final String f13960b;

    /* renamed from: c */
    private final Map<String, String> f13961c;

    public Dictionary(String str, String str2, @C11724g(name = "entries_json") Map<String, String> map) {
        this.f13959a = str;
        this.f13960b = str2;
        this.f13961c = map;
    }

    /* renamed from: a */
    public final Map<String, String> mo18326a() {
        return this.f13961c;
    }

    /* renamed from: b */
    public final String mo18327b() {
        return this.f13960b;
    }

    /* renamed from: c */
    public final String mo18328c() {
        return this.f13959a;
    }

    public final Dictionary copy(String str, String str2, @C11724g(name = "entries_json") Map<String, String> map) {
        return new Dictionary(str, str2, map);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f13961c, (java.lang.Object) r3.f13961c) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.dictionaries.Dictionary
            if (r0 == 0) goto L_0x0027
            com.bamtechmedia.dominguez.dictionaries.Dictionary r3 = (com.bamtechmedia.dominguez.dictionaries.Dictionary) r3
            java.lang.String r0 = r2.f13959a
            java.lang.String r1 = r3.f13959a
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f13960b
            java.lang.String r1 = r3.f13960b
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.f13961c
            java.util.Map<java.lang.String, java.lang.String> r3 = r3.f13961c
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
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.dictionaries.Dictionary.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.f13959a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f13960b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Map<String, String> map = this.f13961c;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dictionary(version=");
        sb.append(this.f13959a);
        sb.append(", resourceKey=");
        sb.append(this.f13960b);
        sb.append(", entries=");
        sb.append(this.f13961c);
        sb.append(")");
        return sb.toString();
    }
}
