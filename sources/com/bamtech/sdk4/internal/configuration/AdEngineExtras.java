package com.bamtech.sdk4.internal.configuration;

import java.util.Map;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0010¢\u0006\u0002\u0010\u0002B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u0015\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\u001f\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/configuration/AdEngineExtras;", "Lcom/bamtech/sdk4/internal/configuration/ServiceExtras;", "()V", "adTargeting", "", "", "(Ljava/util/Map;)V", "getAdTargeting", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "sdk-configuration"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: AdEngineServiceConfiguration.kt */
public final class AdEngineExtras implements ServiceExtras {
    private final Map<String, String> adTargeting;

    public AdEngineExtras(Map<String, String> map) {
        this.adTargeting = map;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r1.adTargeting, (java.lang.Object) ((com.bamtech.sdk4.internal.configuration.AdEngineExtras) r2).adTargeting) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.bamtech.sdk4.internal.configuration.AdEngineExtras
            if (r0 == 0) goto L_0x0013
            com.bamtech.sdk4.internal.configuration.AdEngineExtras r2 = (com.bamtech.sdk4.internal.configuration.AdEngineExtras) r2
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.adTargeting
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.adTargeting
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
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.configuration.AdEngineExtras.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Map<String, String> map = this.adTargeting;
        if (map != null) {
            return map.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdEngineExtras(adTargeting=");
        sb.append(this.adTargeting);
        sb.append(")");
        return sb.toString();
    }

    public AdEngineExtras() {
        this(C13173j0.m40350a());
    }
}
