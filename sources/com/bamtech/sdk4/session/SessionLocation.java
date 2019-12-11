package com.bamtech.sdk4.session;

import com.bamtech.core.annotations.android.DontObfuscate;
import com.bamtech.shadow.gson.p050r.C2246c;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\rJ<\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u001d"}, mo31007d2 = {"Lcom/bamtech/sdk4/session/SessionLocation;", "", "type", "Lcom/bamtech/sdk4/session/SessionLocationType;", "zipCode", "", "countryCode", "dma", "", "(Lcom/bamtech/sdk4/session/SessionLocationType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getCountryCode", "()Ljava/lang/String;", "getDma", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getType", "()Lcom/bamtech/sdk4/session/SessionLocationType;", "getZipCode", "component1", "component2", "component3", "component4", "copy", "(Lcom/bamtech/sdk4/session/SessionLocationType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/bamtech/sdk4/session/SessionLocation;", "equals", "", "other", "hashCode", "toString", "extension-session"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: SessionLocation.kt */
public final class SessionLocation {
    @C2246c("country_code")
    private final String countryCode;
    @C2246c("dma")
    private final Integer dma;
    @C2246c("type")
    private final SessionLocationType type;
    @C2246c("zip_code")
    private final String zipCode;

    public SessionLocation(SessionLocationType sessionLocationType, String str, String str2, Integer num) {
        this.type = sessionLocationType;
        this.zipCode = str;
        this.countryCode = str2;
        this.dma = num;
    }

    public static /* synthetic */ SessionLocation copy$default(SessionLocation sessionLocation, SessionLocationType sessionLocationType, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            sessionLocationType = sessionLocation.type;
        }
        if ((i & 2) != 0) {
            str = sessionLocation.zipCode;
        }
        if ((i & 4) != 0) {
            str2 = sessionLocation.countryCode;
        }
        if ((i & 8) != 0) {
            num = sessionLocation.dma;
        }
        return sessionLocation.copy(sessionLocationType, str, str2, num);
    }

    public final SessionLocationType component1() {
        return this.type;
    }

    public final String component2() {
        return this.zipCode;
    }

    public final String component3() {
        return this.countryCode;
    }

    public final Integer component4() {
        return this.dma;
    }

    public final SessionLocation copy(SessionLocationType sessionLocationType, String str, String str2, Integer num) {
        return new SessionLocation(sessionLocationType, str, str2, num);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.dma, (java.lang.Object) r3.dma) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof com.bamtech.sdk4.session.SessionLocation
            if (r0 == 0) goto L_0x0031
            com.bamtech.sdk4.session.SessionLocation r3 = (com.bamtech.sdk4.session.SessionLocation) r3
            com.bamtech.sdk4.session.SessionLocationType r0 = r2.type
            com.bamtech.sdk4.session.SessionLocationType r1 = r3.type
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.zipCode
            java.lang.String r1 = r3.zipCode
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.countryCode
            java.lang.String r1 = r3.countryCode
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.Integer r0 = r2.dma
            java.lang.Integer r3 = r3.dma
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            return r3
        L_0x0033:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.session.SessionLocation.equals(java.lang.Object):boolean");
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final Integer getDma() {
        return this.dma;
    }

    public final SessionLocationType getType() {
        return this.type;
    }

    public final String getZipCode() {
        return this.zipCode;
    }

    public int hashCode() {
        SessionLocationType sessionLocationType = this.type;
        int i = 0;
        int hashCode = (sessionLocationType != null ? sessionLocationType.hashCode() : 0) * 31;
        String str = this.zipCode;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.countryCode;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.dma;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SessionLocation(type=");
        sb.append(this.type);
        sb.append(", zipCode=");
        sb.append(this.zipCode);
        sb.append(", countryCode=");
        sb.append(this.countryCode);
        sb.append(", dma=");
        sb.append(this.dma);
        sb.append(")");
        return sb.toString();
    }
}
