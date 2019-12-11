package com.bamtech.sdk4.session;

import com.bamtech.sdk4.plugin.Extension;
import com.bamtech.sdk4.token.Grant;
import kotlin.Metadata;
import p520io.reactivex.Completable;
import p520io.reactivex.Observable;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH&J\b\u0010\u0012\u001a\u00020\u0007H&J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0010H&J\b\u0010\u0014\u001a\u00020\u0007H&J\b\u0010\u0015\u001a\u00020\u0007H&J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017H'R\u0014\u0010\u0002\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0018"}, mo31007d2 = {"Lcom/bamtech/sdk4/session/SessionApi;", "Lcom/bamtech/sdk4/plugin/Extension;", "currentSessionState", "Lcom/bamtech/sdk4/session/SessionState;", "getCurrentSessionState", "()Lcom/bamtech/sdk4/session/SessionState;", "authorize", "Lio/reactivex/Completable;", "grant", "Lcom/bamtech/sdk4/token/Grant;", "getAccessState", "", "getSessionInfo", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/session/SessionInfo;", "preferLocal", "", "getSessionToken", "logout", "soft", "reauthorize", "reset", "watchSessionState", "Lio/reactivex/Observable;", "extension-session"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: SessionApi.kt */
public interface SessionApi extends Extension {

    @Metadata(mo31005bv = {1, 0, 3}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* compiled from: SessionApi.kt */
    public static final class DefaultImpls {
        public static Single<SessionInfo> getSessionInfo(SessionApi sessionApi) {
            return sessionApi.getSessionInfo(true);
        }
    }

    Completable authorize(Grant grant);

    String getAccessState();

    SessionState getCurrentSessionState();

    Single<SessionInfo> getSessionInfo();

    Single<SessionInfo> getSessionInfo(boolean z);

    Single<String> getSessionToken();

    Completable logout();

    Completable logout(boolean z);

    Completable reauthorize();

    Completable reset();

    Observable<SessionState> watchSessionState();
}
