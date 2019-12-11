package com.bamtechmedia.dominguez.analytics;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p500m.p501a.C11733i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/analytics/Target;", "", "clientCode", "", "timeout", "", "(Ljava/lang/String;I)V", "getClientCode", "()Ljava/lang/String;", "getTimeout", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "analytics_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: AdobeConfig.kt */
public final class Target {

    /* renamed from: a */
    private final String f6532a;

    /* renamed from: b */
    private final int f6533b;

    public Target(String str, int i) {
        this.f6532a = str;
        this.f6533b = i;
    }

    /* renamed from: a */
    public final String mo11435a() {
        return this.f6532a;
    }

    /* renamed from: b */
    public final int mo11436b() {
        return this.f6533b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Target) {
                Target target = (Target) obj;
                if (Intrinsics.areEqual((Object) this.f6532a, (Object) target.f6532a)) {
                    if (this.f6533b == target.f6533b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f6532a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f6533b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Target(clientCode=");
        sb.append(this.f6532a);
        sb.append(", timeout=");
        sb.append(this.f6533b);
        sb.append(")");
        return sb.toString();
    }
}
