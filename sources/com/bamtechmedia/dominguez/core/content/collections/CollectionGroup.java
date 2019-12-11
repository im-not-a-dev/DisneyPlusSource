package com.bamtechmedia.dominguez.core.content.collections;

import java.util.List;
import kotlin.Metadata;
import p163g.p500m.p501a.C11733i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/collections/CollectionGroup;", "", "key", "", "collectionGroupId", "contentClass", "slugs", "", "Lcom/bamtechmedia/dominguez/core/content/collections/CollectionSlug;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getCollectionGroupId", "()Ljava/lang/String;", "getContentClass", "getKey", "getSlugs", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "coreContentApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: Collection.kt */
public final class CollectionGroup {

    /* renamed from: a */
    private final String f9176a;

    /* renamed from: b */
    private final String f9177b;

    /* renamed from: c */
    private final String f9178c;

    /* renamed from: d */
    private final List<CollectionSlug> f9179d;

    public CollectionGroup(String str, String str2, String str3, List<CollectionSlug> list) {
        this.f9176a = str;
        this.f9177b = str2;
        this.f9178c = str3;
        this.f9179d = list;
    }

    /* renamed from: a */
    public final String mo13295a() {
        return this.f9177b;
    }

    /* renamed from: b */
    public final String mo13296b() {
        return this.f9178c;
    }

    /* renamed from: c */
    public final String mo13297c() {
        return this.f9176a;
    }

    /* renamed from: d */
    public final List<CollectionSlug> mo13298d() {
        return this.f9179d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.f9179d, (java.lang.Object) r3.f9179d) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.core.content.collections.CollectionGroup
            if (r0 == 0) goto L_0x0031
            com.bamtechmedia.dominguez.core.content.collections.CollectionGroup r3 = (com.bamtechmedia.dominguez.core.content.collections.CollectionGroup) r3
            java.lang.String r0 = r2.f9176a
            java.lang.String r1 = r3.f9176a
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.f9177b
            java.lang.String r1 = r3.f9177b
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.f9178c
            java.lang.String r1 = r3.f9178c
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.util.List<com.bamtechmedia.dominguez.core.content.collections.CollectionSlug> r0 = r2.f9179d
            java.util.List<com.bamtechmedia.dominguez.core.content.collections.CollectionSlug> r3 = r3.f9179d
            boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            return r3
        L_0x0033:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.content.collections.CollectionGroup.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.f9176a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f9177b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f9178c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<CollectionSlug> list = this.f9179d;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CollectionGroup(key=");
        sb.append(this.f9176a);
        sb.append(", collectionGroupId=");
        sb.append(this.f9177b);
        sb.append(", contentClass=");
        sb.append(this.f9178c);
        sb.append(", slugs=");
        sb.append(this.f9179d);
        sb.append(")");
        return sb.toString();
    }
}
