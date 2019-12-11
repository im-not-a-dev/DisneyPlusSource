package com.bamtech.sdk4.internal.session;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.session.SessionInfo;
import com.bamtech.sdk4.session.SessionInfoStorage;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Maybe;
import p520io.reactivex.Single;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u0006\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u000fj\u0002`\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/session/DefaultSessionInfoUpdater;", "Lcom/bamtech/sdk4/internal/session/SessionInfoUpdater;", "sessionClient", "Lcom/bamtech/sdk4/internal/session/SessionClient;", "sessionStorage", "Lcom/bamtech/sdk4/session/SessionInfoStorage;", "(Lcom/bamtech/sdk4/internal/session/SessionClient;Lcom/bamtech/sdk4/session/SessionInfoStorage;)V", "getLocalSessionInfo", "Lio/reactivex/Maybe;", "Lcom/bamtech/sdk4/session/SessionInfo;", "updateLocalSessionInfo", "Lio/reactivex/Single;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "accessToken", "", "Lcom/bamtech/sdk4/core/types/JWT;", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DefaultSessionInfoUpdater.kt */
public final class DefaultSessionInfoUpdater implements SessionInfoUpdater {
    private final SessionClient sessionClient;
    /* access modifiers changed from: private */
    public final SessionInfoStorage sessionStorage;

    public DefaultSessionInfoUpdater(SessionClient sessionClient2, SessionInfoStorage sessionInfoStorage) {
        this.sessionClient = sessionClient2;
        this.sessionStorage = sessionInfoStorage;
    }

    public Maybe<SessionInfo> getLocalSessionInfo() {
        SessionInfo load = this.sessionStorage.load();
        if (load != null) {
            Maybe<SessionInfo> c = Maybe.m38258c(load);
            C12880j.m40222a((Object) c, "Maybe.just(localInfo)");
            return c;
        }
        Maybe<SessionInfo> h = Maybe.m38259h();
        C12880j.m40222a((Object) h, "Maybe.empty()");
        return h;
    }

    public Single<SessionInfo> updateLocalSessionInfo(ServiceTransaction serviceTransaction, String str) {
        Single<SessionInfo> b = this.sessionClient.getSessionInfo(serviceTransaction, C13170i0.m40332a(C12907r.m40244a("{accessToken}", str))).mo30233g(new DefaultSessionInfoUpdater$updateLocalSessionInfo$1(this)).mo30218b((Consumer<? super Throwable>) new DefaultSessionInfoUpdater$updateLocalSessionInfo$2<Object>(this, serviceTransaction));
        C12880j.m40222a((Object) b, "sessionClient.getSession…clear()\n                }");
        return b;
    }
}
