package com.bamtech.sdk4.internal.token;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.plugin.Extension;
import kotlin.Metadata;
import p520io.reactivex.Maybe;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001a\u0010\b\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001a\u0010\t\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\n2\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\u000b"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;", "Lcom/bamtech/sdk4/plugin/Extension;", "ensureValidToken", "Lio/reactivex/Single;", "", "Lcom/bamtech/sdk4/core/types/JWT;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "getAccessToken", "getStoredAccessToken", "Lio/reactivex/Maybe;", "extension-session"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: AccessTokenProvider.kt */
public interface AccessTokenProvider extends Extension {
    Single<String> ensureValidToken(ServiceTransaction serviceTransaction);

    Single<String> getAccessToken(ServiceTransaction serviceTransaction);

    Maybe<String> getStoredAccessToken(ServiceTransaction serviceTransaction);
}
