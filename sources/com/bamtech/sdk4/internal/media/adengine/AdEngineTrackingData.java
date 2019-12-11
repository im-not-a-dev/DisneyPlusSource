package com.bamtech.sdk4.internal.media.adengine;

import com.bamtech.core.annotations.android.DontObfuscate;
import java.util.Map;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B9\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\bJ\u0017\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003JE\u0010\u0013\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/adengine/AdEngineTrackingData;", "", "adTargeting", "", "", "cdn", "corigin", "ssess", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdTargeting", "()Ljava/util/Map;", "getCdn", "()Ljava/lang/String;", "getCorigin", "getSsess", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: AdEngineTrackingData.kt */
public final class AdEngineTrackingData {
    private final Map<String, String> adTargeting;
    private final String cdn;
    private final String corigin;
    private final String ssess;

    public AdEngineTrackingData(Map<String, String> map, String str, String str2, String str3) {
        this.adTargeting = map;
        this.cdn = str;
        this.corigin = str2;
        this.ssess = str3;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.Map, code=java.util.Map<java.lang.String, java.lang.String>, for r1v0, types: [java.util.Map] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.bamtech.sdk4.internal.media.adengine.AdEngineTrackingData copy$default(com.bamtech.sdk4.internal.media.adengine.AdEngineTrackingData r0, java.util.Map<java.lang.String, java.lang.String> r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, int r5, java.lang.Object r6) {
        /*
            r6 = r5 & 1
            if (r6 == 0) goto L_0x0006
            java.util.Map<java.lang.String, java.lang.String> r1 = r0.adTargeting
        L_0x0006:
            r6 = r5 & 2
            if (r6 == 0) goto L_0x000c
            java.lang.String r2 = r0.cdn
        L_0x000c:
            r6 = r5 & 4
            if (r6 == 0) goto L_0x0012
            java.lang.String r3 = r0.corigin
        L_0x0012:
            r5 = r5 & 8
            if (r5 == 0) goto L_0x0018
            java.lang.String r4 = r0.ssess
        L_0x0018:
            com.bamtech.sdk4.internal.media.adengine.AdEngineTrackingData r0 = r0.copy(r1, r2, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.media.adengine.AdEngineTrackingData.copy$default(com.bamtech.sdk4.internal.media.adengine.AdEngineTrackingData, java.util.Map, java.lang.String, java.lang.String, java.lang.String, int, java.lang.Object):com.bamtech.sdk4.internal.media.adengine.AdEngineTrackingData");
    }

    public final Map<String, String> component1() {
        return this.adTargeting;
    }

    public final String component2() {
        return this.cdn;
    }

    public final String component3() {
        return this.corigin;
    }

    public final String component4() {
        return this.ssess;
    }

    public final AdEngineTrackingData copy(Map<String, String> map, String str, String str2, String str3) {
        return new AdEngineTrackingData(map, str, str2, str3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.ssess, (java.lang.Object) r3.ssess) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof com.bamtech.sdk4.internal.media.adengine.AdEngineTrackingData
            if (r0 == 0) goto L_0x0031
            com.bamtech.sdk4.internal.media.adengine.AdEngineTrackingData r3 = (com.bamtech.sdk4.internal.media.adengine.AdEngineTrackingData) r3
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.adTargeting
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.adTargeting
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.cdn
            java.lang.String r1 = r3.cdn
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.corigin
            java.lang.String r1 = r3.corigin
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.ssess
            java.lang.String r3 = r3.ssess
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
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.media.adengine.AdEngineTrackingData.equals(java.lang.Object):boolean");
    }

    public final Map<String, String> getAdTargeting() {
        return this.adTargeting;
    }

    public final String getCdn() {
        return this.cdn;
    }

    public final String getCorigin() {
        return this.corigin;
    }

    public final String getSsess() {
        return this.ssess;
    }

    public int hashCode() {
        Map<String, String> map = this.adTargeting;
        int i = 0;
        int hashCode = (map != null ? map.hashCode() : 0) * 31;
        String str = this.cdn;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.corigin;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.ssess;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdEngineTrackingData(adTargeting=");
        sb.append(this.adTargeting);
        sb.append(", cdn=");
        sb.append(this.cdn);
        sb.append(", corigin=");
        sb.append(this.corigin);
        sb.append(", ssess=");
        sb.append(this.ssess);
        sb.append(")");
        return sb.toString();
    }
}
