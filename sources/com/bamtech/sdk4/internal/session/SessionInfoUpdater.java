package com.bamtech.sdk4.internal.session;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.session.SessionInfo;
import kotlin.Metadata;
import p520io.reactivex.Maybe;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\nj\u0002`\u000bH&¨\u0006\f"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/session/SessionInfoUpdater;", "", "getLocalSessionInfo", "Lio/reactivex/Maybe;", "Lcom/bamtech/sdk4/session/SessionInfo;", "updateLocalSessionInfo", "Lio/reactivex/Single;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "accessToken", "", "Lcom/bamtech/sdk4/core/types/JWT;", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DefaultSessionInfoUpdater.kt */
public interface SessionInfoUpdater {
    Maybe<SessionInfo> getLocalSessionInfo();

    Single<SessionInfo> updateLocalSessionInfo(ServiceTransaction serviceTransaction, String str);
}
