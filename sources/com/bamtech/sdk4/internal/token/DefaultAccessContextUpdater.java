package com.bamtech.sdk4.internal.token;

import com.bamtech.core.logging.LogDispatcher.DefaultImpls;
import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.service.TransactionResult;
import com.bamtech.sdk4.internal.session.InternalSessionState;
import com.bamtech.sdk4.internal.session.InternalSessionState.AuthenticationExpired;
import com.bamtech.sdk4.internal.session.InternalSessionStateProvider;
import com.bamtech.sdk4.token.AccessContext;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.Maybe;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p525e0.C11934b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B/\b\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\u001a\u0010 \u001a\f\u0012\b\u0012\u00060\u001cj\u0002`!0\u00102\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u001a\u0010\"\u001a\f\u0012\b\u0012\u00060\u001cj\u0002`!0\u00102\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J$\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00102\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020%H\u0016J\u001a\u0010&\u001a\f\u0012\b\u0012\u00060\u001cj\u0002`!0'2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u001c\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00102\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R(\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006)"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/token/DefaultAccessContextUpdater;", "Lcom/bamtech/sdk4/internal/token/AccessContextUpdater;", "Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;", "Lcom/bamtech/sdk4/internal/token/ExternalGrantExchange;", "configurationProvider", "Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;", "tokenExchangeManager", "Lcom/bamtech/sdk4/internal/token/TokenExchangeManager;", "internalSessionStateProvider", "Lcom/bamtech/sdk4/internal/session/InternalSessionStateProvider;", "refreshAccessContextHelper", "Lcom/bamtech/sdk4/internal/token/RefreshAccessContextHelper;", "deviceAccessContextHelper", "Lcom/bamtech/sdk4/internal/token/DeviceAccessContextHelper;", "(Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;Lcom/bamtech/sdk4/internal/token/TokenExchangeManager;Lcom/bamtech/sdk4/internal/session/InternalSessionStateProvider;Lcom/bamtech/sdk4/internal/token/RefreshAccessContextHelper;Lcom/bamtech/sdk4/internal/token/DeviceAccessContextHelper;)V", "updateInProgress", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/internal/service/TransactionResult;", "Lcom/bamtech/sdk4/token/AccessContext;", "getUpdateInProgress$sdk_core_api_release", "()Lio/reactivex/Single;", "setUpdateInProgress$sdk_core_api_release", "(Lio/reactivex/Single;)V", "authorizeExternalGrant", "Lio/reactivex/Completable;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "grantToken", "", "authorizeExternalGrantInternal", "cancelPendingOperations", "", "ensureValidToken", "Lcom/bamtech/sdk4/core/types/JWT;", "getAccessToken", "getOrUpdate", "force", "", "getStoredAccessToken", "Lio/reactivex/Maybe;", "reset", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DefaultAccessContextUpdater.kt */
public final class DefaultAccessContextUpdater implements AccessContextUpdater, AccessTokenProvider, ExternalGrantExchange {
    private final ConfigurationProvider configurationProvider;
    /* access modifiers changed from: private */
    public final DeviceAccessContextHelper deviceAccessContextHelper;
    /* access modifiers changed from: private */
    public final InternalSessionStateProvider internalSessionStateProvider;
    /* access modifiers changed from: private */
    public final RefreshAccessContextHelper refreshAccessContextHelper;
    private final TokenExchangeManager tokenExchangeManager;
    private Single<TransactionResult<AccessContext>> updateInProgress;

    public DefaultAccessContextUpdater(ConfigurationProvider configurationProvider2, TokenExchangeManager tokenExchangeManager2, InternalSessionStateProvider internalSessionStateProvider2, RefreshAccessContextHelper refreshAccessContextHelper2, DeviceAccessContextHelper deviceAccessContextHelper2) {
        this.configurationProvider = configurationProvider2;
        this.tokenExchangeManager = tokenExchangeManager2;
        this.internalSessionStateProvider = internalSessionStateProvider2;
        this.refreshAccessContextHelper = refreshAccessContextHelper2;
        this.deviceAccessContextHelper = deviceAccessContextHelper2;
    }

    /* access modifiers changed from: private */
    public final Completable authorizeExternalGrantInternal(ServiceTransaction serviceTransaction, String str) {
        Single b = this.tokenExchangeManager.exchangeExternalAccountToken(serviceTransaction, str).mo30227d((Consumer<? super T>) new DefaultAccessContextUpdater$authorizeExternalGrantInternal$1<Object>(this, serviceTransaction)).mo30218b((Consumer<? super Throwable>) new DefaultAccessContextUpdater$authorizeExternalGrantInternal$2<Object>(this, serviceTransaction)).mo30219b((C11945a) new DefaultAccessContextUpdater$authorizeExternalGrantInternal$3(this));
        this.deviceAccessContextHelper.setContextRetrievalInProgress(b);
        Completable e = b.mo30228e();
        Intrinsics.checkReturnedValueIsNotNull((Object) e, "it.ignoreElement()");
        Intrinsics.checkReturnedValueIsNotNull((Object) e, "tokenExchangeManager.exc…ement()\n                }");
        return e;
    }

    /* access modifiers changed from: private */
    public final void cancelPendingOperations() {
        this.updateInProgress = null;
    }

    public Completable authorizeExternalGrant(ServiceTransaction serviceTransaction, String str) {
        Single contextRetrievalInProgress = this.deviceAccessContextHelper.getContextRetrievalInProgress();
        if (contextRetrievalInProgress != null) {
            Completable b = contextRetrievalInProgress.mo30217b((Function<? super T, ? extends CompletableSource>) new DefaultAccessContextUpdater$authorizeExternalGrant$1<Object,Object>(this, serviceTransaction, str));
            if (b != null) {
                return b;
            }
        }
        return authorizeExternalGrantInternal(serviceTransaction, str);
    }

    public Single<String> ensureValidToken(ServiceTransaction serviceTransaction) {
        Single single;
        InternalSessionState currentInternalSessionState = this.internalSessionStateProvider.getCurrentInternalSessionState();
        AccessContext accessContext = currentInternalSessionState.getAccessContext();
        if (accessContext != null && accessContext.isValid()) {
            AccessContext accessContext2 = currentInternalSessionState.getAccessContext();
            if (accessContext2 != null) {
                single = Single.m38399b(accessContext2.getAccessToken());
            } else {
                Intrinsics.throwNpe();
                throw null;
            }
        } else {
            single = getOrUpdate(serviceTransaction, true).mo30235h(new DefaultAccessContextUpdater$ensureValidToken$1(this, serviceTransaction)).mo30233g(DefaultAccessContextUpdater$ensureValidToken$2.INSTANCE);
        }
        Single<String> b = single.mo30220b(C11934b.m38500b());
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "when {\n            isVal…scribeOn(Schedulers.io())");
        return b;
    }

    public Single<String> getAccessToken(ServiceTransaction serviceTransaction) {
        Single single;
        InternalSessionState currentInternalSessionState = this.internalSessionStateProvider.getCurrentInternalSessionState();
        if (currentInternalSessionState instanceof AuthenticationExpired) {
            StringBuilder sb = new StringBuilder();
            sb.append("TransactionId: ");
            sb.append(serviceTransaction.getId());
            ServiceTransaction serviceTransaction2 = serviceTransaction;
            DefaultImpls.log$default(serviceTransaction2, this, "AccessContextExpired", sb.toString(), null, false, 24, null);
            single = Single.m38395a((Throwable) ((AuthenticationExpired) currentInternalSessionState).getException());
        } else {
            single = this.configurationProvider.getServiceConfiguration(serviceTransaction, DefaultAccessContextUpdater$getAccessToken$1.INSTANCE).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new DefaultAccessContextUpdater$getAccessToken$2<Object,Object>(this, currentInternalSessionState, serviceTransaction));
        }
        Single<String> b = single.mo30220b(C11934b.m38500b());
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "when (sessionState) {\n  …scribeOn(Schedulers.io())");
        return b;
    }

    public synchronized Single<TransactionResult<AccessContext>> getOrUpdate(ServiceTransaction serviceTransaction, boolean z) {
        Single<TransactionResult<AccessContext>> b;
        b = Single.m38396a((Callable<? extends SingleSource<? extends T>>) new DefaultAccessContextUpdater$getOrUpdate$1<Object>(this, z, serviceTransaction)).mo30220b(C11934b.m38500b());
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "Single.defer {\n\n        …scribeOn(Schedulers.io())");
        return b;
    }

    public Maybe<String> getStoredAccessToken(ServiceTransaction serviceTransaction) {
        AccessContext accessContext = this.internalSessionStateProvider.getCurrentInternalSessionState().getAccessContext();
        boolean isValid = accessContext != null ? accessContext.isValid() : false;
        AccessContext accessContext2 = this.internalSessionStateProvider.getCurrentInternalSessionState().getAccessContext();
        String accessToken = accessContext2 != null ? accessContext2.getAccessToken() : null;
        if (accessToken == null || !isValid) {
            Maybe<String> h = Maybe.m38259h();
            Intrinsics.checkReturnedValueIsNotNull((Object) h, "Maybe.empty<JWT>()");
            return h;
        }
        Maybe<String> c = Maybe.m38258c(accessToken);
        Intrinsics.checkReturnedValueIsNotNull((Object) c, "Maybe.just(token)");
        return c;
    }

    public final Single<TransactionResult<AccessContext>> getUpdateInProgress$sdk_core_api_release() {
        return this.updateInProgress;
    }

    public Single<TransactionResult<AccessContext>> reset(ServiceTransaction serviceTransaction) {
        Single<TransactionResult<AccessContext>> b = Single.m38396a((Callable<? extends SingleSource<? extends T>>) new DefaultAccessContextUpdater$reset$1<Object>(this, serviceTransaction)).mo30220b(C11934b.m38500b());
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "Single.defer {\n         …scribeOn(Schedulers.io())");
        return b;
    }

    public final void setUpdateInProgress$sdk_core_api_release(Single<TransactionResult<AccessContext>> single) {
        this.updateInProgress = single;
    }
}
