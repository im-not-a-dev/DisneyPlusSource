package com.bamtech.sdk4.internal.session;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import com.bamtech.sdk4.session.SessionInfo;
import com.bamtech.sdk4.session.SessionInfoExtension;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p525e0.C11934b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/session/DefaultSessionInfoExtension;", "Lcom/bamtech/sdk4/session/SessionInfoExtension;", "tokenProvider", "Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;", "sessionInfoUpdater", "Lcom/bamtech/sdk4/internal/session/SessionInfoUpdater;", "(Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;Lcom/bamtech/sdk4/internal/session/SessionInfoUpdater;)V", "getRemoteSessionInfo", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/session/SessionInfo;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "getSessionInfo", "preferLocal", "", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DefaultSessionInfoExtension.kt */
public final class DefaultSessionInfoExtension implements SessionInfoExtension {
    /* access modifiers changed from: private */
    public final SessionInfoUpdater sessionInfoUpdater;
    private final AccessTokenProvider tokenProvider;

    public DefaultSessionInfoExtension(AccessTokenProvider accessTokenProvider, SessionInfoUpdater sessionInfoUpdater2) {
        this.tokenProvider = accessTokenProvider;
        this.sessionInfoUpdater = sessionInfoUpdater2;
    }

    private final Single<SessionInfo> getRemoteSessionInfo(ServiceTransaction serviceTransaction) {
        Single<SessionInfo> a = this.tokenProvider.getAccessToken(serviceTransaction).mo30220b(C11934b.m38500b()).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new DefaultSessionInfoExtension$getRemoteSessionInfo$1<Object,Object>(this, serviceTransaction));
        C12880j.m40222a((Object) a, "tokenProvider.getAccessT…sToken)\n                }");
        return a;
    }

    public Single<SessionInfo> getSessionInfo(ServiceTransaction serviceTransaction, boolean z) {
        if (!z) {
            return getRemoteSessionInfo(serviceTransaction);
        }
        Single<SessionInfo> a = this.sessionInfoUpdater.getLocalSessionInfo().mo30109a((SingleSource<? extends T>) getRemoteSessionInfo(serviceTransaction));
        C12880j.m40222a((Object) a, "sessionInfoUpdater.getLo…SessionInfo(transaction))");
        return a;
    }
}
