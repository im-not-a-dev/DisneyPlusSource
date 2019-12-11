package com.bamtech.sdk4.internal.token;

import com.bamtech.sdk4.internal.configuration.BootstrapConfiguration;
import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.service.TransactionResult;
import com.bamtech.sdk4.internal.session.InternalSessionState;
import com.bamtech.sdk4.internal.session.InternalSessionStateProvider;
import com.bamtech.sdk4.internal.session.SessionInfoUpdater;
import com.bamtech.sdk4.internal.token.TokenExchangeRequest.Refresh;
import com.bamtech.sdk4.token.AccessContext;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B/\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ$\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J(\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00102\u0006\u0010\u0013\u001a\u00020\u00142\n\u0010\u0018\u001a\u00060\u000ej\u0002`\u0019H\u0016J(\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00102\u0006\u0010\u0013\u001a\u00020\u00142\n\u0010\u0018\u001a\u00060\u000ej\u0002`\u0019H\u0016J(\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00102\u0006\u0010\u0013\u001a\u00020\u00142\n\u0010\u0018\u001a\u00060\u000ej\u0002`\u0019H\u0016J(\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00102\u0006\u0010\u0013\u001a\u00020\u00142\n\u0010\u0018\u001a\u00060\u000ej\u0002`\u0019H\u0016J \u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002J$\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\"H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/token/DefaultTokenExchangeManager;", "Lcom/bamtech/sdk4/internal/token/TokenExchangeManager;", "bootstrapConfiguration", "Lcom/bamtech/sdk4/internal/configuration/BootstrapConfiguration;", "internalSessionStateProvider", "Lcom/bamtech/sdk4/internal/session/InternalSessionStateProvider;", "client", "Lcom/bamtech/sdk4/internal/token/TokenClient;", "sessionInfoUpdater", "Lcom/bamtech/sdk4/internal/session/SessionInfoUpdater;", "configurationProvider", "Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;", "(Lcom/bamtech/sdk4/internal/configuration/BootstrapConfiguration;Lcom/bamtech/sdk4/internal/session/InternalSessionStateProvider;Lcom/bamtech/sdk4/internal/token/TokenClient;Lcom/bamtech/sdk4/internal/session/SessionInfoUpdater;Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;)V", "platform", "", "exchange", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/internal/service/TransactionResult;", "Lcom/bamtech/sdk4/token/AccessContext;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "request", "Lcom/bamtech/sdk4/internal/token/TokenExchangeRequest;", "exchangeAccountToken", "assertion", "Lcom/bamtech/sdk4/core/types/JWT;", "exchangeDeviceToken", "exchangeExternalAccountToken", "exchangeTemporaryToken", "handleTokenError", "", "cause", "", "sessionState", "Lcom/bamtech/sdk4/internal/session/InternalSessionState;", "refreshToken", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: TokenExchangeManager.kt */
public final class DefaultTokenExchangeManager implements TokenExchangeManager {
    private final BootstrapConfiguration bootstrapConfiguration;
    private final TokenClient client;
    private final ConfigurationProvider configurationProvider;
    /* access modifiers changed from: private */
    public final InternalSessionStateProvider internalSessionStateProvider;
    /* access modifiers changed from: private */
    public final String platform = this.bootstrapConfiguration.getDevice().getTokenExchangePlatform();
    /* access modifiers changed from: private */
    public final SessionInfoUpdater sessionInfoUpdater;

    public DefaultTokenExchangeManager(BootstrapConfiguration bootstrapConfiguration2, InternalSessionStateProvider internalSessionStateProvider2, TokenClient tokenClient, SessionInfoUpdater sessionInfoUpdater2, ConfigurationProvider configurationProvider2) {
        this.bootstrapConfiguration = bootstrapConfiguration2;
        this.internalSessionStateProvider = internalSessionStateProvider2;
        this.client = tokenClient;
        this.sessionInfoUpdater = sessionInfoUpdater2;
        this.configurationProvider = configurationProvider2;
    }

    /* access modifiers changed from: private */
    public final Single<TransactionResult<AccessContext>> exchange(ServiceTransaction serviceTransaction, TokenExchangeRequest tokenExchangeRequest) {
        Single<TransactionResult<AccessContext>> g = this.client.exchange(serviceTransaction, tokenExchangeRequest, C13170i0.m40332a(C12907r.m40244a("{apiKey}", this.bootstrapConfiguration.getApiKey()))).mo30233g(DefaultTokenExchangeManager$exchange$1.INSTANCE).mo30227d((Consumer<? super T>) new DefaultTokenExchangeManager$exchange$2<Object>(this, serviceTransaction)).mo30233g(new DefaultTokenExchangeManager$exchange$3(serviceTransaction));
        Intrinsics.checkReturnedValueIsNotNull((Object) g, "client.exchange(transact…on, it)\n                }");
        return g;
    }

    /* JADX WARNING: type inference failed for: r7v8, types: [com.bamtech.sdk4.internal.session.InternalSessionState$AuthenticationExpired] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleTokenError(com.bamtech.sdk4.internal.service.ServiceTransaction r7, java.lang.Throwable r8, com.bamtech.sdk4.internal.session.InternalSessionState r9) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.bamtech.sdk4.service.ServiceException
            if (r0 == 0) goto L_0x0007
            com.bamtech.sdk4.service.ServiceException r8 = (com.bamtech.sdk4.service.ServiceException) r8
            goto L_0x0022
        L_0x0007:
            com.bamtech.sdk4.service.ServiceException$Companion r0 = com.bamtech.sdk4.service.ServiceException.Companion
            r1 = 500(0x1f4, float:7.0E-43)
            java.util.UUID r7 = r7.getId()
            com.bamtech.sdk4.internal.service.ServiceError r2 = new com.bamtech.sdk4.internal.service.ServiceError
            java.lang.String r3 = r8.getMessage()
            java.lang.String r4 = "unexpected-error"
            r2.<init>(r4, r3)
            java.util.List r2 = kotlin.p590y.C13183n.m40498a(r2)
            com.bamtech.sdk4.service.ServiceException r8 = r0.create(r1, r7, r2, r8)
        L_0x0022:
            r1 = r8
            boolean r7 = r1 instanceof com.bamtech.sdk4.service.BadRequestException
            if (r7 != 0) goto L_0x002b
            boolean r8 = r1 instanceof com.bamtech.sdk4.service.UnauthorizedException
            if (r8 == 0) goto L_0x0046
        L_0x002b:
            com.bamtech.sdk4.token.AccessContext r8 = r9.getAccessContext()
            if (r8 == 0) goto L_0x0046
            boolean r8 = r9 instanceof com.bamtech.sdk4.internal.session.InternalSessionState.LoggedIn
            if (r8 == 0) goto L_0x0046
            com.bamtech.sdk4.internal.session.InternalSessionState$AuthenticationExpired r7 = new com.bamtech.sdk4.internal.session.InternalSessionState$AuthenticationExpired
            com.bamtech.sdk4.token.AccessContext r8 = r9.getAccessContext()
            if (r8 == 0) goto L_0x0041
            r7.<init>(r8, r1)
            goto L_0x006a
        L_0x0041:
            kotlin.jvm.internal.Intrinsics.throwNpe()
            r7 = 0
            throw r7
        L_0x0046:
            if (r7 == 0) goto L_0x0057
            boolean r7 = r9 instanceof com.bamtech.sdk4.internal.session.InternalSessionState.LoggedOut
            if (r7 == 0) goto L_0x0057
            com.bamtech.sdk4.internal.session.InternalSessionState$Failed r7 = new com.bamtech.sdk4.internal.session.InternalSessionState$Failed
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x006a
        L_0x0057:
            boolean r7 = r9 instanceof com.bamtech.sdk4.internal.session.InternalSessionState.Initializing
            if (r7 == 0) goto L_0x0066
            com.bamtech.sdk4.internal.session.InternalSessionState$Failed r7 = new com.bamtech.sdk4.internal.session.InternalSessionState$Failed
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x006a
        L_0x0066:
            r9.recordAttempt()
            r7 = r9
        L_0x006a:
            com.bamtech.sdk4.internal.session.InternalSessionStateProvider r8 = r6.internalSessionStateProvider
            r8.setInternalSessionState(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.token.DefaultTokenExchangeManager.handleTokenError(com.bamtech.sdk4.internal.service.ServiceTransaction, java.lang.Throwable, com.bamtech.sdk4.internal.session.InternalSessionState):void");
    }

    public Single<TransactionResult<AccessContext>> exchangeAccountToken(ServiceTransaction serviceTransaction, String str) {
        Single<TransactionResult<AccessContext>> a = this.configurationProvider.getServiceConfiguration(serviceTransaction, DefaultTokenExchangeManager$exchangeAccountToken$1.INSTANCE).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new DefaultTokenExchangeManager$exchangeAccountToken$2<Object,Object>(this, serviceTransaction, str));
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "configurationProvider.ge…      }\n                }");
        return a;
    }

    public Single<TransactionResult<AccessContext>> exchangeDeviceToken(ServiceTransaction serviceTransaction, String str) {
        Single<TransactionResult<AccessContext>> a = this.configurationProvider.getServiceConfiguration(serviceTransaction, DefaultTokenExchangeManager$exchangeDeviceToken$1.INSTANCE).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new DefaultTokenExchangeManager$exchangeDeviceToken$2<Object,Object>(this, serviceTransaction, str));
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "configurationProvider.ge…      }\n                }");
        return a;
    }

    public Single<TransactionResult<AccessContext>> exchangeExternalAccountToken(ServiceTransaction serviceTransaction, String str) {
        Single<TransactionResult<AccessContext>> a = this.configurationProvider.getServiceConfiguration(serviceTransaction, DefaultTokenExchangeManager$exchangeExternalAccountToken$1.INSTANCE).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new DefaultTokenExchangeManager$exchangeExternalAccountToken$2<Object,Object>(this, serviceTransaction, str));
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "configurationProvider.ge…      }\n                }");
        return a;
    }

    public Single<TransactionResult<AccessContext>> refreshToken(ServiceTransaction serviceTransaction, InternalSessionState internalSessionState) {
        AccessContext accessContext = internalSessionState.getAccessContext();
        if (accessContext != null) {
            String refreshToken = accessContext.getRefreshToken();
            if (refreshToken != null) {
                Refresh refresh = new Refresh(refreshToken, null, this.platform, 2, null);
                Single<TransactionResult<AccessContext>> b = exchange(serviceTransaction, refresh).mo30227d((Consumer<? super T>) new DefaultTokenExchangeManager$refreshToken$1<Object>(this, serviceTransaction)).mo30218b((Consumer<? super Throwable>) new DefaultTokenExchangeManager$refreshToken$2<Object>(this, serviceTransaction, internalSessionState));
                Intrinsics.checkReturnedValueIsNotNull((Object) b, "exchange(transaction, To…nState)\n                }");
                return b;
            }
            Intrinsics.throwNpe();
            throw null;
        }
        Intrinsics.throwNpe();
        throw null;
    }
}
