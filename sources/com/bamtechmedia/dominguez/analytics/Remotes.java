package com.bamtechmedia.dominguez.analytics;

import kotlin.Metadata;
import p163g.p500m.p501a.C11724g;
import p163g.p500m.p501a.C11733i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/analytics/Remotes;", "", "analyticsPoi", "", "messages", "(Ljava/lang/String;Ljava/lang/String;)V", "getAnalyticsPoi", "()Ljava/lang/String;", "getMessages", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "analytics_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: AdobeConfig.kt */
public final class Remotes {

    /* renamed from: a */
    private final String f6530a;

    /* renamed from: b */
    private final String f6531b;

    public Remotes(@C11724g(name = "analytics.poi") String str, String str2) {
        this.f6530a = str;
        this.f6531b = str2;
    }

    /* renamed from: a */
    public final String mo11427a() {
        return this.f6530a;
    }

    /* renamed from: b */
    public final String mo11428b() {
        return this.f6531b;
    }

    public final Remotes copy(@C11724g(name = "analytics.poi") String str, String str2) {
        return new Remotes(str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.f6531b, (java.lang.Object) r3.f6531b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.analytics.Remotes
            if (r0 == 0) goto L_0x001d
            com.bamtechmedia.dominguez.analytics.Remotes r3 = (com.bamtechmedia.dominguez.analytics.Remotes) r3
            java.lang.String r0 = r2.f6530a
            java.lang.String r1 = r3.f6530a
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.f6531b
            java.lang.String r3 = r3.f6531b
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
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.analytics.Remotes.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.f6530a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f6531b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Remotes(analyticsPoi=");
        sb.append(this.f6530a);
        sb.append(", messages=");
        sb.append(this.f6531b);
        sb.append(")");
        return sb.toString();
    }
}
