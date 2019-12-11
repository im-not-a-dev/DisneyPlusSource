package com.bamtech.sdk4.extension.account;

import com.bamtech.sdk4.account.Account;
import com.bamtech.sdk4.account.DefaultAccount;
import com.bamtech.sdk4.identity.IdentityToken;
import com.bamtech.sdk4.identity.IdentityTokenRenewal;
import com.bamtech.sdk4.internal.account.AccountClient;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import com.bamtech.sdk4.internal.token.AccountTokenExchangeProvider;
import com.bamtech.sdk4.session.ReauthorizationHandler;
import com.bamtech.sdk4.session.ReauthorizationHandlerRegistry;
import com.bamtech.sdk4.session.ReauthorizeMode;
import com.bamtech.sdk4.session.RenewSessionTransformers;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12895y;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0001#B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J5\u0010\u0012\u001a\u00020\r\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u0001H\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016¢\u0006\u0002\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J.\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0019\"\b\b\u0000\u0010\u0013*\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u00130\u001dH\u0016J\u0018\u0010\u001e\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020 H\u0016J#\u0010!\u001a\u00020\r\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u0002H\u0013H\u0016¢\u0006\u0002\u0010\"R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, mo31007d2 = {"Lcom/bamtech/sdk4/extension/account/DefaultAccountExtension;", "Lcom/bamtech/sdk4/extension/account/AccountExtension;", "Lcom/bamtech/sdk4/session/ReauthorizationHandler;", "client", "Lcom/bamtech/sdk4/internal/account/AccountClient;", "tokenProvider", "Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;", "tokenExchangeProvider", "Lcom/bamtech/sdk4/internal/token/AccountTokenExchangeProvider;", "renewSessionTransformers", "Lcom/bamtech/sdk4/session/RenewSessionTransformers;", "(Lcom/bamtech/sdk4/internal/account/AccountClient;Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;Lcom/bamtech/sdk4/internal/token/AccountTokenExchangeProvider;Lcom/bamtech/sdk4/session/RenewSessionTransformers;)V", "authorize", "Lio/reactivex/Completable;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "identityToken", "Lcom/bamtech/sdk4/identity/IdentityToken;", "createAccount", "T", "attributes", "isTest", "", "(Lcom/bamtech/sdk4/internal/service/ServiceTransaction;Lcom/bamtech/sdk4/identity/IdentityToken;Ljava/lang/Object;Z)Lio/reactivex/Completable;", "getAccount", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/account/DefaultAccount;", "Lcom/bamtech/sdk4/account/Account;", "accountType", "Ljava/lang/Class;", "handle", "mode", "Lcom/bamtech/sdk4/session/ReauthorizeMode;", "updateAttributes", "(Lcom/bamtech/sdk4/internal/service/ServiceTransaction;Ljava/lang/Object;)Lio/reactivex/Completable;", "Companion", "extension-account"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: AccountExtension.kt */
public final class DefaultAccountExtension implements AccountExtension, ReauthorizationHandler {
    public static final Companion Companion = new Companion(null);
    /* access modifiers changed from: private */
    public final AccountClient client;
    private final RenewSessionTransformers renewSessionTransformers;
    /* access modifiers changed from: private */
    public final AccountTokenExchangeProvider tokenExchangeProvider;
    private final AccessTokenProvider tokenProvider;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e¨\u0006\u000f"}, mo31007d2 = {"Lcom/bamtech/sdk4/extension/account/DefaultAccountExtension$Companion;", "", "()V", "createAndRegister", "Lcom/bamtech/sdk4/extension/account/AccountExtension;", "client", "Lcom/bamtech/sdk4/internal/account/AccountClient;", "tokenProvider", "Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;", "tokenExchangeProvider", "Lcom/bamtech/sdk4/internal/token/AccountTokenExchangeProvider;", "renewSessionTransformers", "Lcom/bamtech/sdk4/session/RenewSessionTransformers;", "reauthorizationHandlerRegistry", "Lcom/bamtech/sdk4/session/ReauthorizationHandlerRegistry;", "extension-account"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: AccountExtension.kt */
    public static final class Companion {
        private Companion() {
        }

        public final AccountExtension createAndRegister(AccountClient accountClient, AccessTokenProvider accessTokenProvider, AccountTokenExchangeProvider accountTokenExchangeProvider, RenewSessionTransformers renewSessionTransformers, ReauthorizationHandlerRegistry reauthorizationHandlerRegistry) {
            DefaultAccountExtension defaultAccountExtension = new DefaultAccountExtension(accountClient, accessTokenProvider, accountTokenExchangeProvider, renewSessionTransformers);
            reauthorizationHandlerRegistry.register(C12895y.m40230a(IdentityTokenRenewal.class), defaultAccountExtension);
            return defaultAccountExtension;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public DefaultAccountExtension(AccountClient accountClient, AccessTokenProvider accessTokenProvider, AccountTokenExchangeProvider accountTokenExchangeProvider, RenewSessionTransformers renewSessionTransformers2) {
        this.client = accountClient;
        this.tokenProvider = accessTokenProvider;
        this.tokenExchangeProvider = accountTokenExchangeProvider;
        this.renewSessionTransformers = renewSessionTransformers2;
    }

    public Completable authorize(ServiceTransaction serviceTransaction, IdentityToken identityToken) {
        Completable e = this.tokenProvider.ensureValidToken(serviceTransaction).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new DefaultAccountExtension$authorize$1<Object,Object>(this, serviceTransaction, identityToken)).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new DefaultAccountExtension$authorize$2<Object,Object>(this, serviceTransaction)).mo30218b((Consumer<? super Throwable>) new DefaultAccountExtension$authorize$3<Object>(this, serviceTransaction)).mo30227d((Consumer<? super T>) DefaultAccountExtension$authorize$4.INSTANCE).mo30228e();
        C12880j.m40222a((Object) e, "tokenProvider.ensureVali…         .ignoreElement()");
        return e;
    }

    public <T> Completable createAccount(ServiceTransaction serviceTransaction, IdentityToken identityToken, T t, boolean z) {
        Single accessToken = this.tokenProvider.getAccessToken(serviceTransaction);
        DefaultAccountExtension$createAccount$1 defaultAccountExtension$createAccount$1 = new DefaultAccountExtension$createAccount$1(this, serviceTransaction, identityToken, t, z);
        Completable a = accessToken.mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) defaultAccountExtension$createAccount$1).mo30217b((Function<? super T, ? extends CompletableSource>) new DefaultAccountExtension$createAccount$2<Object,Object>(this, serviceTransaction, identityToken)).mo30036a((Consumer<? super Throwable>) new DefaultAccountExtension$createAccount$3<Object>(this, serviceTransaction));
        C12880j.m40222a((Object) a, "tokenProvider.getAccessT…ring())\n                }");
        return a;
    }

    public Single<DefaultAccount> getAccount(ServiceTransaction serviceTransaction) {
        return getAccount(serviceTransaction, DefaultAccount.class);
    }

    public Completable handle(ServiceTransaction serviceTransaction, ReauthorizeMode reauthorizeMode) {
        return authorize(serviceTransaction, ((IdentityTokenRenewal) reauthorizeMode).getIdentityToken());
    }

    public <T extends Account> Single<T> getAccount(ServiceTransaction serviceTransaction, Class<T> cls) {
        Single<T> a = this.tokenProvider.getAccessToken(serviceTransaction).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new DefaultAccountExtension$getAccount$1<Object,Object>(this, serviceTransaction, cls)).mo30206a(this.renewSessionTransformers.singleRenewSession(serviceTransaction));
        C12880j.m40222a((Object) a, "tokenProvider.getAccessT…enewSession(transaction))");
        return a;
    }
}
