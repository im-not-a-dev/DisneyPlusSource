package com.bamtechmedia.dominguez.collections.p080o0;

import com.bamtechmedia.dominguez.core.utils.C5859p;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB)\u0012\u0010\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u00030\u0003\u0012\u0010\u0010\u0005\u001a\f\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0006J\u0013\u0010\n\u001a\f\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u00030\u0003HÂ\u0003J\u0013\u0010\u000b\u001a\f\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u00030\u0003HÂ\u0003J1\u0010\f\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u00030\u00032\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u00030\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u001d\u0010\u0010\u001a\u0002H\u0011\"\b\b\u0000\u0010\u0011*\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0002\u0010\u0013J%\u0010\u0014\u001a\u0002H\u0011\"\b\b\u0000\u0010\u0011*\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0002\u0010\u0016J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001R\u0018\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u00030\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0005\u001a\f\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u00030\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/collections/config/CollectionConfig;", "", "defaultCollectionConfig", "", "", "setOverrides", "(Ljava/util/Map;Ljava/util/Map;)V", "displayType", "getDisplayType", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "getCollectionValue", "T", "key", "(Ljava/lang/String;)Ljava/lang/Object;", "getCollectionValueByType", "type", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "hashCode", "", "toString", "Companion", "collectionsApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.collections.o0.a */
/* compiled from: CollectionConfig.kt */
public final class C3433a {

    /* renamed from: a */
    private final Map<String, ?> f8661a;

    /* renamed from: b */
    private final Map<String, ?> f8662b;

    /* renamed from: com.bamtechmedia.dominguez.collections.o0.a$a */
    /* compiled from: CollectionConfig.kt */
    public static final class C3434a {
        private C3434a() {
        }

        public /* synthetic */ C3434a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C3434a(null);
    }

    public C3433a(Map<String, ?> map, Map<String, ?> map2) {
        this.f8661a = map;
        this.f8662b = map2;
    }

    /* renamed from: a */
    public final String mo12608a() {
        return (String) mo12606a("displayType");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.f8662b, (java.lang.Object) r3.f8662b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.collections.p080o0.C3433a
            if (r0 == 0) goto L_0x001d
            com.bamtechmedia.dominguez.collections.o0.a r3 = (com.bamtechmedia.dominguez.collections.p080o0.C3433a) r3
            java.util.Map<java.lang.String, ?> r0 = r2.f8661a
            java.util.Map<java.lang.String, ?> r1 = r3.f8661a
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.util.Map<java.lang.String, ?> r0 = r2.f8662b
            java.util.Map<java.lang.String, ?> r3 = r3.f8662b
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
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.collections.p080o0.C3433a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Map<String, ?> map = this.f8661a;
        int i = 0;
        int hashCode = (map != null ? map.hashCode() : 0) * 31;
        Map<String, ?> map2 = this.f8662b;
        if (map2 != null) {
            i = map2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CollectionConfig(defaultCollectionConfig=");
        sb.append(this.f8661a);
        sb.append(", setOverrides=");
        sb.append(this.f8662b);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public final <T> T mo12606a(String str) {
        T a = C5859p.m18897a(this.f8662b, str, new String[0]);
        if (a == null) {
            a = C5859p.m18897a(this.f8661a, str, new String[0]);
        }
        if (a != null) {
            return a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('\'');
        sb.append(str);
        sb.append("' not available in overrides ");
        sb.append(this.f8662b);
        sb.append(" or defaults ");
        sb.append(this.f8661a);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public final <T> T mo12607a(String str, String str2) {
        T a = C5859p.m18898a(this.f8662b, C13185o.m40520c(str, str2));
        if (a == null) {
            a = C5859p.m18898a(this.f8662b, C13183n.m40498a(str));
        }
        if (a == null) {
            a = C5859p.m18898a(this.f8661a, C13185o.m40520c(str, str2));
        }
        if (a != null) {
            return a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('\'');
        sb.append(str);
        sb.append("' not available in overrides ");
        sb.append(this.f8662b);
        sb.append(" or defaults ");
        sb.append(this.f8661a);
        throw new IllegalStateException(sb.toString());
    }
}
