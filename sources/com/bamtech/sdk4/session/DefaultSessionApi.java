package com.bamtech.sdk4.session;

import com.bamtech.core.logging.LogLevel;
import com.bamtech.sdk4.internal.core.Storage;
import com.bamtech.sdk4.internal.event.LogoutMode;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.service.ServiceTransaction.DefaultImpls;
import com.bamtech.sdk4.internal.session.InternalSessionState;
import com.bamtech.sdk4.internal.session.InternalSessionState.AuthenticationExpired;
import com.bamtech.sdk4.internal.session.InternalSessionState.Failed;
import com.bamtech.sdk4.internal.session.InternalSessionState.Legacy;
import com.bamtech.sdk4.internal.session.InternalSessionState.LoggedIn;
import com.bamtech.sdk4.internal.session.InternalSessionState.LoggedOut;
import com.bamtech.sdk4.internal.session.InternalSessionStateProvider;
import com.bamtech.sdk4.internal.telemetry.dust.DustExtensionsKt;
import com.bamtech.sdk4.internal.token.AccessContextUpdater;
import com.bamtech.sdk4.session.SessionState.Initializing;
import com.bamtech.sdk4.token.AccessContext;
import com.bamtech.sdk4.token.Grant;
import com.bamtech.shadow.gson.Gson;
import javax.inject.Provider;
import kotlin.C12898l;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Completable;
import p520io.reactivex.Observable;
import p520io.reactivex.Single;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.subjects.PublishSubject;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001BU\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u000e\b\u0001\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\n\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\"\u001a\u00020#H\u0016J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001e0 H\u0016J\b\u0010%\u001a\u00020\u001aH\u0016J\u0010\u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020#H\u0016J\b\u0010'\u001a\u00020\u001aH\u0016J\b\u0010(\u001a\u00020\u001aH\u0016J\u000e\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00160*H\u0016J\f\u0010+\u001a\u00020\u0016*\u00020,H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, mo31007d2 = {"Lcom/bamtech/sdk4/session/DefaultSessionApi;", "Lcom/bamtech/sdk4/session/SessionApi;", "transactionProvider", "Ljavax/inject/Provider;", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "storage", "Lcom/bamtech/sdk4/internal/core/Storage;", "sessionStorage", "Lcom/bamtech/sdk4/session/SessionInfoStorage;", "contextUpdater", "Lcom/bamtech/sdk4/internal/token/AccessContextUpdater;", "manager", "Lcom/bamtech/sdk4/session/SessionInfoExtension;", "internalSessionStateProvider", "Lcom/bamtech/sdk4/internal/session/InternalSessionStateProvider;", "extension", "Lcom/bamtech/sdk4/session/SessionExtension;", "notifier", "Lio/reactivex/subjects/PublishSubject;", "Lcom/bamtech/sdk4/internal/event/LogoutMode;", "(Ljavax/inject/Provider;Lcom/bamtech/sdk4/internal/core/Storage;Lcom/bamtech/sdk4/session/SessionInfoStorage;Lcom/bamtech/sdk4/internal/token/AccessContextUpdater;Lcom/bamtech/sdk4/session/SessionInfoExtension;Lcom/bamtech/sdk4/internal/session/InternalSessionStateProvider;Lcom/bamtech/sdk4/session/SessionExtension;Lio/reactivex/subjects/PublishSubject;)V", "currentSessionState", "Lcom/bamtech/sdk4/session/SessionState;", "getCurrentSessionState", "()Lcom/bamtech/sdk4/session/SessionState;", "authorize", "Lio/reactivex/Completable;", "grant", "Lcom/bamtech/sdk4/token/Grant;", "getAccessState", "", "getSessionInfo", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/session/SessionInfo;", "preferLocal", "", "getSessionToken", "logout", "soft", "reauthorize", "reset", "watchSessionState", "Lio/reactivex/Observable;", "toSessionState", "Lcom/bamtech/sdk4/internal/session/InternalSessionState;", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DefaultSessionApi.kt */
public final class DefaultSessionApi implements SessionApi {
    private final AccessContextUpdater contextUpdater;
    private final SessionExtension extension;
    private final InternalSessionStateProvider internalSessionStateProvider;
    private final SessionInfoExtension manager;
    /* access modifiers changed from: private */
    public final PublishSubject<LogoutMode> notifier;
    /* access modifiers changed from: private */
    public final SessionInfoStorage sessionStorage;
    private final Storage storage;
    private final Provider<ServiceTransaction> transactionProvider;

    public DefaultSessionApi(Provider<ServiceTransaction> provider, Storage storage2, SessionInfoStorage sessionInfoStorage, AccessContextUpdater accessContextUpdater, SessionInfoExtension sessionInfoExtension, InternalSessionStateProvider internalSessionStateProvider2, SessionExtension sessionExtension, PublishSubject<LogoutMode> publishSubject) {
        this.transactionProvider = provider;
        this.storage = storage2;
        this.sessionStorage = sessionInfoStorage;
        this.contextUpdater = accessContextUpdater;
        this.manager = sessionInfoExtension;
        this.internalSessionStateProvider = internalSessionStateProvider2;
        this.extension = sessionExtension;
        this.notifier = publishSubject;
        DefaultImpls.logDust$default((ServiceTransaction) this.transactionProvider.get(), DefaultSessionApiKt.getSESSION_API_CREATE(), "urn:bamtech:dust:bamsdk:event:sdk", LogLevel.INFO, false, 8, null);
    }

    /* access modifiers changed from: private */
    public final SessionState toSessionState(InternalSessionState internalSessionState) {
        SessionState failed;
        if (internalSessionState instanceof Legacy) {
            return new Initializing();
        }
        if (internalSessionState instanceof InternalSessionState.Initializing) {
            return new Initializing();
        }
        if (internalSessionState instanceof LoggedOut) {
            return new SessionState.LoggedOut();
        }
        if (internalSessionState instanceof LoggedIn) {
            return new SessionState.LoggedIn();
        }
        if (internalSessionState instanceof AuthenticationExpired) {
            failed = new SessionState.AuthenticationExpired(((AuthenticationExpired) internalSessionState).getException());
        } else if (internalSessionState instanceof Failed) {
            failed = new SessionState.Failed(((Failed) internalSessionState).getException());
        } else {
            throw new C12898l();
        }
        return failed;
    }

    public Completable authorize(Grant grant) {
        ServiceTransaction serviceTransaction = (ServiceTransaction) this.transactionProvider.get();
        SessionExtension sessionExtension = this.extension;
        C12880j.m40222a((Object) serviceTransaction, "transaction");
        return DustExtensionsKt.withDust$default(sessionExtension.authorizeExternalGrant(serviceTransaction, grant.getAssertion()), serviceTransaction, DefaultSessionApiKt.getSESSION_API_GRANT_AUTHORIZATION(), (Object) null, 4, (Object) null);
    }

    public String getAccessState() {
        DefaultImpls.logDust$default((ServiceTransaction) this.transactionProvider.get(), DefaultSessionApiKt.getSESSION_API_GET_ACCESS_STATE(), "urn:bamtech:dust:bamsdk:event:sdk", LogLevel.INFO, false, 8, null);
        AccessContext accessContext = this.internalSessionStateProvider.getCurrentInternalSessionState().getAccessContext();
        if (accessContext == null) {
            return null;
        }
        Gson gson = new Gson();
        Pair[] pairArr = new Pair[2];
        pairArr[0] = C12907r.m40244a("version", "3.0");
        Pair[] pairArr2 = new Pair[3];
        pairArr2[0] = C12907r.m40244a("token", accessContext.getAccessToken());
        String refreshToken = accessContext.getRefreshToken();
        if (refreshToken == null) {
            refreshToken = "";
        }
        pairArr2[1] = C12907r.m40244a("refreshToken", refreshToken);
        String str = "contextState";
        pairArr2[2] = C12907r.m40244a(str, C13170i0.m40332a(C12907r.m40244a("modes", C13185o.m40513a())));
        pairArr[1] = C12907r.m40244a("data", C13173j0.m40356a(pairArr2));
        return gson.mo11046a((Object) C13173j0.m40356a(pairArr));
    }

    public SessionState getCurrentSessionState() {
        DefaultImpls.logDust$default((ServiceTransaction) this.transactionProvider.get(), DefaultSessionApiKt.getSESSION_API_GET_SESSION_STATE(), "urn:bamtech:dust:bamsdk:event:sdk", LogLevel.INFO, false, 8, null);
        return toSessionState(this.internalSessionStateProvider.getCurrentInternalSessionState());
    }

    public Single<SessionInfo> getSessionInfo() {
        return SessionApi.DefaultImpls.getSessionInfo(this);
    }

    public Single<String> getSessionToken() {
        ServiceTransaction serviceTransaction = (ServiceTransaction) this.transactionProvider.get();
        AccessContextUpdater accessContextUpdater = this.contextUpdater;
        C12880j.m40222a((Object) serviceTransaction, "transaction");
        Single g = AccessContextUpdater.DefaultImpls.getOrUpdate$default(accessContextUpdater, serviceTransaction, false, 2, null).mo30233g(DefaultSessionApi$getSessionToken$1.INSTANCE);
        C12880j.m40222a((Object) g, "contextUpdater.getOrUpda…ssToken\n                }");
        return DustExtensionsKt.withDust$default(g, serviceTransaction, DefaultSessionApiKt.getSESSION_API_GET_SESSION_TOKEN(), (Object) null, 4, (Object) null);
    }

    public Completable logout() {
        return logout(false);
    }

    public Completable reauthorize() {
        ServiceTransaction serviceTransaction = (ServiceTransaction) this.transactionProvider.get();
        AccessContextUpdater accessContextUpdater = this.contextUpdater;
        C12880j.m40222a((Object) serviceTransaction, "transaction");
        Completable e = accessContextUpdater.getOrUpdate(serviceTransaction, true).mo30228e();
        C12880j.m40222a((Object) e, "contextUpdater.getOrUpda…         .ignoreElement()");
        return DustExtensionsKt.withDust$default(e, serviceTransaction, DefaultSessionApiKt.getSESSION_API_REAUTHORIZE(), (Object) null, 4, (Object) null);
    }

    public Completable reset() {
        DefaultImpls.logDust$default((ServiceTransaction) this.transactionProvider.get(), DefaultSessionApiKt.getSESSION_API_RESET(), "urn:bamtech:dust:bamsdk:event:sdk", LogLevel.INFO, false, 8, null);
        return logout();
    }

    public Observable<SessionState> watchSessionState() {
        ServiceTransaction serviceTransaction = (ServiceTransaction) this.transactionProvider.get();
        Observable g = this.internalSessionStateProvider.watchInternalSessionState().mo30193g(new DefaultSessionApi$watchSessionState$1(this));
        C12880j.m40222a((Object) g, "internalSessionStateProv…p { it.toSessionState() }");
        C12880j.m40222a((Object) serviceTransaction, "transaction");
        return DustExtensionsKt.withDust$default(g, serviceTransaction, DefaultSessionApiKt.getSESSION_API_WATCH_SESSION_STATE(), (Object) null, 4, (Object) null);
    }

    public Single<SessionInfo> getSessionInfo(boolean z) {
        ServiceTransaction serviceTransaction = (ServiceTransaction) this.transactionProvider.get();
        SessionInfoExtension sessionInfoExtension = this.manager;
        C12880j.m40222a((Object) serviceTransaction, "transaction");
        return DustExtensionsKt.withDust$default(sessionInfoExtension.getSessionInfo(serviceTransaction, z), serviceTransaction, DefaultSessionApiKt.getSESSION_API_GET_SESSION_INFO(), (Object) null, 4, (Object) null);
    }

    public Completable logout(boolean z) {
        ServiceTransaction serviceTransaction = (ServiceTransaction) this.transactionProvider.get();
        AccessContextUpdater accessContextUpdater = this.contextUpdater;
        C12880j.m40222a((Object) serviceTransaction, "transaction");
        Completable e = DustExtensionsKt.withDust$default(accessContextUpdater.reset(serviceTransaction), serviceTransaction, DefaultSessionApiKt.getSESSION_API_LOGOUT(), (Object) null, 4, (Object) null).mo30219b((C11945a) new DefaultSessionApi$logout$1(this, z)).mo30228e();
        C12880j.m40222a((Object) e, "contextUpdater.reset(tra…         .ignoreElement()");
        return e;
    }
}
