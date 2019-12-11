package com.bamtech.sdk4.internal.token;

import com.bamtech.core.annotations.android.DontObfuscate;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0010¢\u0006\u0002\u0010\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\tR\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0004\n\u0002\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006\u0018"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/token/TokenExchangeResponse;", "", "()V", "accessToken", "", "tokenType", "expiresIn", "", "refreshToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "setAccessToken", "(Ljava/lang/String;)V", "expiration", "Lorg/joda/time/DateTime;", "getExpiration", "()Lorg/joda/time/DateTime;", "Ljava/lang/Long;", "generatedOn", "getGeneratedOn", "getRefreshToken", "getTokenType", "setTokenType", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: TokenExchangeResponse.kt */
public final class TokenExchangeResponse {
    private String accessToken;
    private final Long expiresIn;
    private final DateTime generatedOn;
    private final String refreshToken;
    private String tokenType;

    public TokenExchangeResponse(String str, String str2, Long l, String str3) {
        this.accessToken = str;
        this.tokenType = str2;
        this.expiresIn = l;
        this.refreshToken = str3;
        DateTime now = DateTime.now(DateTimeZone.UTC);
        C12880j.m40222a((Object) now, "DateTime.now(DateTimeZone.UTC)");
        this.generatedOn = now;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final DateTime getExpiration() {
        Long l = this.expiresIn;
        if (l == null) {
            return null;
        }
        return this.generatedOn.plusSeconds((int) l.longValue());
    }

    public final DateTime getGeneratedOn() {
        return this.generatedOn;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final String getTokenType() {
        return this.tokenType;
    }

    public final void setAccessToken(String str) {
        this.accessToken = str;
    }

    public final void setTokenType(String str) {
        this.tokenType = str;
    }

    public /* synthetic */ TokenExchangeResponse(String str, String str2, Long l, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            l = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        this(str, str2, l, str3);
    }

    public TokenExchangeResponse() {
        this("", "", null, null, 12, null);
    }
}
