package com.bamtech.sdk4.internal.token;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0006\u0007¨\u0006\b"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/token/TokenExchangeRequest;", "", "()V", "Companion", "Refresh", "TokenExchange", "Lcom/bamtech/sdk4/internal/token/TokenExchangeRequest$TokenExchange;", "Lcom/bamtech/sdk4/internal/token/TokenExchangeRequest$Refresh;", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: TokenExchangeRequest.kt */
public abstract class TokenExchangeRequest {

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/token/TokenExchangeRequest$Companion;", "", "()V", "REFRESH_TOKEN", "", "TOKEN_EXCHANGE", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: TokenExchangeRequest.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/token/TokenExchangeRequest$Refresh;", "Lcom/bamtech/sdk4/internal/token/TokenExchangeRequest;", "refreshToken", "", "grantType", "platform", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getGrantType", "()Ljava/lang/String;", "getPlatform", "getRefreshToken", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: TokenExchangeRequest.kt */
    public static final class Refresh extends TokenExchangeRequest {
        private final String grantType;
        private final String platform;
        private final String refreshToken;

        public /* synthetic */ Refresh(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 2) != 0) {
                str2 = "refresh_token";
            }
            if ((i & 4) != 0) {
                str3 = "android";
            }
            this(str, str2, str3);
        }

        public final String getGrantType() {
            return this.grantType;
        }

        public final String getPlatform() {
            return this.platform;
        }

        public final String getRefreshToken() {
            return this.refreshToken;
        }

        public Refresh(String str, String str2, String str3) {
            super(null);
            this.refreshToken = str;
            this.grantType = str2;
            this.platform = str3;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/token/TokenExchangeRequest$TokenExchange;", "Lcom/bamtech/sdk4/internal/token/TokenExchangeRequest;", "subjectToken", "", "subjectTokenType", "grantType", "platform", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getGrantType", "()Ljava/lang/String;", "getPlatform", "getSubjectToken", "getSubjectTokenType", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: TokenExchangeRequest.kt */
    public static final class TokenExchange extends TokenExchangeRequest {
        private final String grantType;
        private final String platform;
        private final String subjectToken;
        private final String subjectTokenType;

        public /* synthetic */ TokenExchange(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 4) != 0) {
                str3 = "urn:ietf:params:oauth:grant-type:token-exchange";
            }
            if ((i & 8) != 0) {
                str4 = "android";
            }
            this(str, str2, str3, str4);
        }

        public final String getGrantType() {
            return this.grantType;
        }

        public final String getPlatform() {
            return this.platform;
        }

        public final String getSubjectToken() {
            return this.subjectToken;
        }

        public final String getSubjectTokenType() {
            return this.subjectTokenType;
        }

        public TokenExchange(String str, String str2, String str3, String str4) {
            super(null);
            this.subjectToken = str;
            this.subjectTokenType = str2;
            this.grantType = str3;
            this.platform = str4;
        }
    }

    static {
        new Companion(null);
    }

    private TokenExchangeRequest() {
    }

    public /* synthetic */ TokenExchangeRequest(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
