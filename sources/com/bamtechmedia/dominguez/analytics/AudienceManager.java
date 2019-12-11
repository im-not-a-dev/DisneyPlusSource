package com.bamtechmedia.dominguez.analytics;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p500m.p501a.C11733i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0017"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/analytics/AudienceManager;", "", "server", "", "analyticsForwardingEnabled", "", "timeout", "", "(Ljava/lang/String;ZI)V", "getAnalyticsForwardingEnabled", "()Z", "getServer", "()Ljava/lang/String;", "getTimeout", "()I", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "analytics_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: AdobeConfig.kt */
public final class AudienceManager {

    /* renamed from: a */
    private final String f6526a;

    /* renamed from: b */
    private final boolean f6527b;

    /* renamed from: c */
    private final int f6528c;

    public AudienceManager(String str, boolean z, int i) {
        this.f6526a = str;
        this.f6527b = z;
        this.f6528c = i;
    }

    /* renamed from: a */
    public final boolean mo11413a() {
        return this.f6527b;
    }

    /* renamed from: b */
    public final String mo11414b() {
        return this.f6526a;
    }

    /* renamed from: c */
    public final int mo11415c() {
        return this.f6528c;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AudienceManager) {
                AudienceManager audienceManager = (AudienceManager) obj;
                if (Intrinsics.areEqual((Object) this.f6526a, (Object) audienceManager.f6526a)) {
                    if (this.f6527b == audienceManager.f6527b) {
                        if (this.f6528c == audienceManager.f6528c) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f6526a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f6527b;
        if (z) {
            z = true;
        }
        return ((hashCode + (z ? 1 : 0)) * 31) + this.f6528c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AudienceManager(server=");
        sb.append(this.f6526a);
        sb.append(", analyticsForwardingEnabled=");
        sb.append(this.f6527b);
        sb.append(", timeout=");
        sb.append(this.f6528c);
        sb.append(")");
        return sb.toString();
    }
}
