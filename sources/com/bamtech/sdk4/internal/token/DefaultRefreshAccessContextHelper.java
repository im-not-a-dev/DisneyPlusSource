package com.bamtech.sdk4.internal.token;

import com.bamtech.core.logging.LogDispatcher;
import com.bamtech.core.logging.LogLevel;
import com.bamtech.sdk4.account.legacy.LegacyAccountExtension;
import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.service.ServiceError;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.service.ServiceTransaction.DefaultImpls;
import com.bamtech.sdk4.internal.service.TransactionResult;
import com.bamtech.sdk4.internal.session.InternalSessionState;
import com.bamtech.sdk4.internal.session.InternalSessionState.AuthenticationExpired;
import com.bamtech.sdk4.internal.session.InternalSessionStateProvider;
import com.bamtech.sdk4.service.BadRequestException;
import com.bamtech.sdk4.service.NotFoundException;
import com.bamtech.sdk4.service.ServiceException;
import com.bamtech.sdk4.service.UnauthorizedException;
import com.bamtech.sdk4.token.AccessContext;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import javax.inject.Provider;
import kotlin.C12898l;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B?\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J;\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00192\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u001bH\u0000¢\u0006\u0002\b!J$\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00192\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020&2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010'\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010(\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J*\u0010)\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+H\u0002J\u0011\u0010-\u001a\u00020$*\u00020.H\u0000¢\u0006\u0002\b/R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u00060"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/token/DefaultRefreshAccessContextHelper;", "Lcom/bamtech/sdk4/internal/token/RefreshAccessContextHelper;", "configurationProvider", "Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;", "internalSessionStateProvider", "Lcom/bamtech/sdk4/internal/session/InternalSessionStateProvider;", "tokenExchangeManager", "Lcom/bamtech/sdk4/internal/token/TokenExchangeManager;", "deviceContextHelper", "Lcom/bamtech/sdk4/internal/token/DeviceAccessContextHelper;", "refreshActionPlanner", "Lcom/bamtech/sdk4/internal/token/RefreshActionPlanner;", "legacyExtension", "Ljavax/inject/Provider;", "Lcom/bamtech/sdk4/account/legacy/LegacyAccountExtension;", "(Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;Lcom/bamtech/sdk4/internal/session/InternalSessionStateProvider;Lcom/bamtech/sdk4/internal/token/TokenExchangeManager;Lcom/bamtech/sdk4/internal/token/DeviceAccessContextHelper;Lcom/bamtech/sdk4/internal/token/RefreshActionPlanner;Ljavax/inject/Provider;)V", "invalidForceRefresh", "Lcom/bamtech/sdk4/service/UnauthorizedException;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "invalidTokenRefresh", "cause", "", "missingTokenException", "performRefreshAction", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/internal/service/TransactionResult;", "Lcom/bamtech/sdk4/token/AccessContext;", "action", "Lcom/bamtech/sdk4/internal/token/RefreshAction;", "sessionState", "Lcom/bamtech/sdk4/internal/session/InternalSessionState;", "context", "performRefreshAction$sdk_core_api_release", "refreshAccessContext", "force", "", "refreshAccessContextInProgress", "", "refreshError", "refreshFailed", "unauthorizedException", "code", "", "description", "isTokenInvalid", "Lcom/bamtech/sdk4/service/BadRequestException;", "isTokenInvalid$sdk_core_api_release", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: RefreshAccessContextHelper.kt */
public final class DefaultRefreshAccessContextHelper implements RefreshAccessContextHelper {
    /* access modifiers changed from: private */
    public final ConfigurationProvider configurationProvider;
    /* access modifiers changed from: private */
    public final DeviceAccessContextHelper deviceContextHelper;
    /* access modifiers changed from: private */
    public final InternalSessionStateProvider internalSessionStateProvider;
    /* access modifiers changed from: private */
    public final Provider<LegacyAccountExtension> legacyExtension;
    /* access modifiers changed from: private */
    public final RefreshActionPlanner refreshActionPlanner;
    private final TokenExchangeManager tokenExchangeManager;

    @Metadata(mo31005bv = {1, 0, 3}, mo31008k = 3, mo31009mv = {1, 1, 15})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[RefreshAction.values().length];

        static {
            $EnumSwitchMapping$0[RefreshAction.LEGACY_CONTEXT.ordinal()] = 1;
            $EnumSwitchMapping$0[RefreshAction.MISSING_CONTEXT.ordinal()] = 2;
            $EnumSwitchMapping$0[RefreshAction.FORCED_MISSING_REFRESH_TOKEN.ordinal()] = 3;
            $EnumSwitchMapping$0[RefreshAction.FORCED.ordinal()] = 4;
            $EnumSwitchMapping$0[RefreshAction.REFRESH_ELIGIBLE.ordinal()] = 5;
            $EnumSwitchMapping$0[RefreshAction.USE_EXISTING_CONTEXT.ordinal()] = 6;
            $EnumSwitchMapping$0[RefreshAction.MISSING_REFRESH_TOKEN.ordinal()] = 7;
            $EnumSwitchMapping$0[RefreshAction.NO_REFRESH.ordinal()] = 8;
        }
    }

    public DefaultRefreshAccessContextHelper(ConfigurationProvider configurationProvider2, InternalSessionStateProvider internalSessionStateProvider2, TokenExchangeManager tokenExchangeManager2, DeviceAccessContextHelper deviceAccessContextHelper, RefreshActionPlanner refreshActionPlanner2, Provider<LegacyAccountExtension> provider) {
        this.configurationProvider = configurationProvider2;
        this.internalSessionStateProvider = internalSessionStateProvider2;
        this.tokenExchangeManager = tokenExchangeManager2;
        this.deviceContextHelper = deviceAccessContextHelper;
        this.refreshActionPlanner = refreshActionPlanner2;
        this.legacyExtension = provider;
    }

    private final UnauthorizedException invalidForceRefresh(ServiceTransaction serviceTransaction) {
        return unauthorizedException(serviceTransaction, null, "invalid-forced-refresh", "A force refresh was attempted but no refresh token exists");
    }

    /* access modifiers changed from: private */
    public final UnauthorizedException invalidTokenRefresh(ServiceTransaction serviceTransaction, Throwable th) {
        return unauthorizedException(serviceTransaction, th, "invalid-refresh", "The service indicated that the token was invalid");
    }

    private final UnauthorizedException missingTokenException(ServiceTransaction serviceTransaction) {
        return unauthorizedException(serviceTransaction, null, "missing-refresh-token", "No refresh token available. Must reauthenticate.");
    }

    private final UnauthorizedException refreshError(ServiceTransaction serviceTransaction) {
        return unauthorizedException(serviceTransaction, null, "invalid-refresh", "The access context could not be refreshed and is no longer valid");
    }

    /* access modifiers changed from: private */
    public final UnauthorizedException refreshFailed(ServiceTransaction serviceTransaction, Throwable th) {
        return unauthorizedException(serviceTransaction, th, "refresh-failed", "A refresh was attempted but failed due to an exception");
    }

    private final UnauthorizedException unauthorizedException(ServiceTransaction serviceTransaction, Throwable th, String str, String str2) {
        List list;
        if (th instanceof ServiceException) {
            list = ((ServiceException) th).getErrors();
        } else {
            list = C13185o.m40513a();
        }
        return new UnauthorizedException(serviceTransaction.getId(), C13199w.m40563a((Collection) list, (Object) new ServiceError(str, str2)), th);
    }

    public final boolean isTokenInvalid$sdk_core_api_release(BadRequestException badRequestException) {
        return badRequestException.getErrors().contains(new ServiceError("invalid_grant", "invalid-token"));
    }

    public final Single<TransactionResult<AccessContext>> performRefreshAction$sdk_core_api_release(ServiceTransaction serviceTransaction, RefreshAction refreshAction, InternalSessionState internalSessionState, AccessContext accessContext) {
        String str = "tokenExchangeManager.ref…                        }";
        String str2 = "TransactionId: ";
        switch (WhenMappings.$EnumSwitchMapping$0[refreshAction.ordinal()]) {
            case 1:
                ServiceTransaction serviceTransaction2 = serviceTransaction;
                DefaultImpls.logDust$default(serviceTransaction2, "urn:bamtech:dust:bamsdk:api:session:legacyTokenFound", "urn:bamtech:dust:bamsdk:event:sdk", LogLevel.INFO, false, 8, null);
                Single<TransactionResult<AccessContext>> a = this.tokenExchangeManager.refreshToken(serviceTransaction, internalSessionState).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new DefaultRefreshAccessContextHelper$performRefreshAction$1<Object,Object>(this, serviceTransaction));
                C12880j.m40222a((Object) a, str);
                return a;
            case 2:
                NotFoundException notFoundException = new NotFoundException(serviceTransaction.getId(), C13183n.m40498a(new ServiceError("missing-context", null, 2, null)), null, 4, null);
                Single<TransactionResult<AccessContext>> a2 = Single.m38395a((Throwable) notFoundException);
                C12880j.m40222a((Object) a2, "Single.error<Transaction…ror(\"missing-context\"))))");
                return a2;
            case 3:
                UnauthorizedException invalidForceRefresh = invalidForceRefresh(serviceTransaction);
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(serviceTransaction.getId());
                ServiceTransaction serviceTransaction3 = serviceTransaction;
                UnauthorizedException unauthorizedException = invalidForceRefresh;
                LogDispatcher.DefaultImpls.log$default(serviceTransaction3, unauthorizedException, "AccessContextForceRefreshUnavailable", sb.toString(), null, false, 24, null);
                InternalSessionStateProvider internalSessionStateProvider2 = this.internalSessionStateProvider;
                if (accessContext != null) {
                    internalSessionStateProvider2.setInternalSessionState(new AuthenticationExpired(accessContext, invalidForceRefresh));
                    Single<TransactionResult<AccessContext>> a3 = Single.m38395a((Throwable) invalidForceRefresh);
                    C12880j.m40222a((Object) a3, "with(invalidForceRefresh…ext>>(this)\n            }");
                    return a3;
                }
                C12880j.m40220a();
                throw null;
            case 4:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(serviceTransaction.getId());
                ServiceTransaction serviceTransaction4 = serviceTransaction;
                LogDispatcher.DefaultImpls.log$default(serviceTransaction4, this, "AccessContextRefreshStarted", sb2.toString(), null, false, 24, null);
                Single<TransactionResult<AccessContext>> b = this.tokenExchangeManager.refreshToken(serviceTransaction, internalSessionState).mo30218b((Consumer<? super Throwable>) new DefaultRefreshAccessContextHelper$performRefreshAction$3<Object>(this, serviceTransaction));
                C12880j.m40222a((Object) b, str);
                return b;
            case 5:
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str2);
                sb3.append(serviceTransaction.getId());
                ServiceTransaction serviceTransaction5 = serviceTransaction;
                LogDispatcher.DefaultImpls.log$default(serviceTransaction5, this, "AccessContextRefreshStarted", sb3.toString(), null, false, 24, null);
                Single<TransactionResult<AccessContext>> h = this.tokenExchangeManager.refreshToken(serviceTransaction, internalSessionState).mo30235h(new DefaultRefreshAccessContextHelper$performRefreshAction$4(this, serviceTransaction, accessContext));
                C12880j.m40222a((Object) h, str);
                return h;
            case 6:
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str2);
                sb4.append(serviceTransaction.getId());
                ServiceTransaction serviceTransaction6 = serviceTransaction;
                LogDispatcher.DefaultImpls.log$default(serviceTransaction6, this, "HasValidAccessContext", sb4.toString(), null, false, 24, null);
                if (accessContext != null) {
                    Single<TransactionResult<AccessContext>> b2 = Single.m38399b(new TransactionResult(serviceTransaction, accessContext));
                    C12880j.m40222a((Object) b2, "Single.just(TransactionR…(transaction, context!!))");
                    return b2;
                }
                C12880j.m40220a();
                throw null;
            case 7:
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str2);
                sb5.append(serviceTransaction.getId());
                ServiceTransaction serviceTransaction7 = serviceTransaction;
                LogDispatcher.DefaultImpls.log$default(serviceTransaction7, this, "AccessContextRefreshUnavailable", sb5.toString(), null, false, 24, null);
                UnauthorizedException missingTokenException = missingTokenException(serviceTransaction);
                InternalSessionStateProvider internalSessionStateProvider3 = this.internalSessionStateProvider;
                if (accessContext != null) {
                    internalSessionStateProvider3.setInternalSessionState(new AuthenticationExpired(accessContext, missingTokenException));
                    Single<TransactionResult<AccessContext>> a4 = Single.m38395a((Throwable) missingTokenException);
                    C12880j.m40222a((Object) a4, "with(missingTokenExcepti…>(this)\n                }");
                    return a4;
                }
                C12880j.m40220a();
                throw null;
            case 8:
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str2);
                sb6.append(serviceTransaction.getId());
                ServiceTransaction serviceTransaction8 = serviceTransaction;
                LogDispatcher.DefaultImpls.log$default(serviceTransaction8, this, "AccessContextInvalid", sb6.toString(), null, false, 24, null);
                UnauthorizedException refreshError = refreshError(serviceTransaction);
                InternalSessionStateProvider internalSessionStateProvider4 = this.internalSessionStateProvider;
                if (accessContext != null) {
                    internalSessionStateProvider4.setInternalSessionState(new AuthenticationExpired(accessContext, refreshError));
                    Single<TransactionResult<AccessContext>> a5 = Single.m38395a((Throwable) refreshError);
                    C12880j.m40222a((Object) a5, "with(refreshError(transa…>(this)\n                }");
                    return a5;
                }
                C12880j.m40220a();
                throw null;
            default:
                throw new C12898l();
        }
    }

    public Single<TransactionResult<AccessContext>> refreshAccessContext(ServiceTransaction serviceTransaction, boolean z) {
        Single<TransactionResult<AccessContext>> a = Single.m38396a((Callable<? extends SingleSource<? extends T>>) new DefaultRefreshAccessContextHelper$refreshAccessContext$1<Object>(this, serviceTransaction, z));
        C12880j.m40222a((Object) a, "Single.defer {\n         …             }\n\n        }");
        return a;
    }

    public void refreshAccessContextInProgress(ServiceTransaction serviceTransaction) {
        StringBuilder sb = new StringBuilder();
        sb.append("TransactionId: ");
        sb.append(serviceTransaction.getId());
        ServiceTransaction serviceTransaction2 = serviceTransaction;
        LogDispatcher.DefaultImpls.log$default(serviceTransaction2, this, "AccessContextUpdateInProgress", sb.toString(), null, false, 24, null);
    }
}
