package com.bamtech.sdk4.internal.token;

import com.bamtech.sdk4.token.AccessContext;
import kotlin.Metadata;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "Lcom/bamtech/sdk4/token/AccessContext;", "it", "Lcom/bamtech/sdk4/internal/token/TokenExchangeResponse;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: TokenExchangeManager.kt */
final class DefaultTokenExchangeManager$exchange$1<T, R> implements Function<T, R> {
    public static final DefaultTokenExchangeManager$exchange$1 INSTANCE = new DefaultTokenExchangeManager$exchange$1();

    DefaultTokenExchangeManager$exchange$1() {
    }

    public final AccessContext apply(TokenExchangeResponse tokenExchangeResponse) {
        AccessContext accessContext = new AccessContext(tokenExchangeResponse.getAccessToken(), tokenExchangeResponse.getTokenType(), tokenExchangeResponse.getGeneratedOn(), tokenExchangeResponse.getExpiration(), tokenExchangeResponse.getRefreshToken());
        return accessContext;
    }
}
