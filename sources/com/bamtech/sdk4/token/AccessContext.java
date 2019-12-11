package com.bamtech.sdk4.token;

import com.bamtech.core.annotations.android.DontObfuscate;
import kotlin.C12898l;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import org.joda.time.DateTime;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B?\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004¢\u0006\u0002\u0010\nJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0006\u0010\u0014\u001a\u00020\u000fJ\u000e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u00020\u0003H\u0016R\u0018\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\t\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u000e\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, mo31007d2 = {"Lcom/bamtech/sdk4/token/AccessContext;", "Lcom/bamtech/sdk4/token/AccessToken;", "accessToken", "", "Lcom/bamtech/sdk4/core/types/JWT;", "tokenType", "generatedOn", "Lorg/joda/time/DateTime;", "expiration", "refreshToken", "(Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "getRefreshToken", "equals", "", "other", "", "hashCode", "", "isValid", "shouldRefresh", "refreshThreshold", "", "toString", "sdk-base"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: AccessContext.kt */
public final class AccessContext implements AccessToken {
    private final String accessToken;
    private final DateTime expiration;
    private final DateTime generatedOn;
    private final String refreshToken;
    private final String tokenType;

    public AccessContext(String str, String str2, DateTime dateTime, DateTime dateTime2, String str3) {
        this.accessToken = str;
        this.tokenType = str2;
        this.generatedOn = dateTime;
        this.expiration = dateTime2;
        this.refreshToken = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessContext)) {
            return false;
        }
        AccessContext accessContext = (AccessContext) obj;
        return !(C12880j.m40224a((Object) getAccessToken(), (Object) accessContext.getAccessToken()) ^ true) && !(C12880j.m40224a((Object) this.tokenType, (Object) accessContext.tokenType) ^ true) && !(C12880j.m40224a((Object) this.refreshToken, (Object) accessContext.refreshToken) ^ true) && !(C12880j.m40224a((Object) this.generatedOn, (Object) accessContext.generatedOn) ^ true) && !(C12880j.m40224a((Object) this.expiration, (Object) accessContext.expiration) ^ true);
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public int hashCode() {
        int hashCode = ((getAccessToken().hashCode() * 31) + this.tokenType.hashCode()) * 31;
        String str = this.refreshToken;
        int i = 0;
        int hashCode2 = (((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.generatedOn.hashCode()) * 31;
        DateTime dateTime = this.expiration;
        if (dateTime != null) {
            i = dateTime.hashCode();
        }
        return hashCode2 + i;
    }

    public final boolean isValid() {
        if (!C12832w.m40118a(getAccessToken())) {
            DateTime dateTime = this.expiration;
            if (dateTime == null || dateTime.isAfterNow()) {
                return true;
            }
        }
        return false;
    }

    public final boolean shouldRefresh(double d) {
        String str = this.refreshToken;
        boolean z = !(str != null ? C12832w.m40118a(str) : true);
        boolean z2 = false;
        if (z) {
            DateTime dateTime = this.expiration;
            if (dateTime != null) {
                if (dateTime.isBeforeNow()) {
                    z2 = true;
                } else {
                    DateTime plusMillis = this.generatedOn.plusMillis((int) (((double) (this.expiration.getMillis() - this.generatedOn.getMillis())) * d));
                    C12880j.m40222a((Object) plusMillis, "firstRefreshTime");
                    return plusMillis.isBeforeNow();
                }
            }
        } else if (z) {
            throw new C12898l();
        }
        return z2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AccessContext(accessToken='");
        sb.append(getAccessToken());
        sb.append("', tokenType='");
        sb.append(this.tokenType);
        sb.append("', refreshToken=");
        sb.append(this.refreshToken);
        sb.append(", generatedOn=");
        sb.append(this.generatedOn);
        sb.append(", expiration=");
        sb.append(this.expiration);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ AccessContext(String str, String str2, DateTime dateTime, DateTime dateTime2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, dateTime, (i & 8) != 0 ? null : dateTime2, (i & 16) != 0 ? null : str3);
    }
}
