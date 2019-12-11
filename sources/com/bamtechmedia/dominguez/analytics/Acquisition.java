package com.bamtechmedia.dominguez.analytics;

import kotlin.Metadata;
import p163g.p500m.p501a.C11733i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/analytics/Acquisition;", "", "server", "", "appid", "(Ljava/lang/String;Ljava/lang/String;)V", "getAppid", "()Ljava/lang/String;", "getServer", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "analytics_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: AdobeConfig.kt */
public final class Acquisition {

    /* renamed from: a */
    private final String f6501a;

    /* renamed from: b */
    private final String f6502b;

    public Acquisition(String str, String str2) {
        this.f6501a = str;
        this.f6502b = str2;
    }

    /* renamed from: a */
    public final String mo11371a() {
        return this.f6502b;
    }

    /* renamed from: b */
    public final String mo11372b() {
        return this.f6501a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.f6502b, (java.lang.Object) r3.f6502b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.analytics.Acquisition
            if (r0 == 0) goto L_0x001d
            com.bamtechmedia.dominguez.analytics.Acquisition r3 = (com.bamtechmedia.dominguez.analytics.Acquisition) r3
            java.lang.String r0 = r2.f6501a
            java.lang.String r1 = r3.f6501a
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.f6502b
            java.lang.String r3 = r3.f6502b
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
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.analytics.Acquisition.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.f6501a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f6502b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Acquisition(server=");
        sb.append(this.f6501a);
        sb.append(", appid=");
        sb.append(this.f6502b);
        sb.append(")");
        return sb.toString();
    }
}
