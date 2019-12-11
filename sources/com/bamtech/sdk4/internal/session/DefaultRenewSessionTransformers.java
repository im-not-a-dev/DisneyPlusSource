package com.bamtech.sdk4.internal.session;

import com.bamtech.sdk4.internal.plugin.AuthenticationExpiredCallbackExtension;
import com.bamtech.sdk4.internal.service.ServiceError;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.token.AccessContextUpdater;
import com.bamtech.sdk4.service.UnauthorizedException;
import com.bamtech.sdk4.session.AuthenticationExpiredCallback;
import com.bamtech.sdk4.session.ReauthorizationHandlerRegistry;
import com.bamtech.sdk4.session.RenewSessionTransformers;
import javax.inject.Provider;
import kotlin.C12898l;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.CompletableTransformer;
import p520io.reactivex.MaybeTransformer;
import p520io.reactivex.ObservableTransformer;
import p520io.reactivex.SingleSource;
import p520io.reactivex.SingleTransformer;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 %2\u00020\u0001:\u0001%B3\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\bH\u0016J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u001a\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u0002H\u001c\u0012\u0004\u0012\u0002H\u001c0\u001b\"\u0004\b\u0000\u0010\u001cH\u0016J\"\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u0002H\u001c\u0012\u0004\u0012\u0002H\u001c0\u001b\"\u0004\b\u0000\u0010\u001c2\u0006\u0010\u0015\u001a\u00020\bH\u0016J\u001a\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u0002H\u001c\u0012\u0004\u0012\u0002H\u001c0\u001e\"\u0004\b\u0000\u0010\u001cH\u0016J\"\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u0002H\u001c\u0012\u0004\u0012\u0002H\u001c0\u001e\"\u0004\b\u0000\u0010\u001c2\u0006\u0010\u0015\u001a\u00020\bH\u0016J\u001a\u0010\u001f\u001a\u00020 2\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u001a\u0010#\u001a\u000e\u0012\u0004\u0012\u0002H\u001c\u0012\u0004\u0012\u0002H\u001c0$\"\u0004\b\u0000\u0010\u001cH\u0016J\"\u0010#\u001a\u000e\u0012\u0004\u0012\u0002H\u001c\u0012\u0004\u0012\u0002H\u001c0$\"\u0004\b\u0000\u0010\u001c2\u0006\u0010\u0015\u001a\u00020\bH\u0016R\u0014\u0010\t\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006&"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/session/DefaultRenewSessionTransformers;", "Lcom/bamtech/sdk4/session/RenewSessionTransformers;", "session", "Lcom/bamtech/sdk4/internal/token/AccessContextUpdater;", "renewSessionExtension", "Ljavax/inject/Provider;", "Lcom/bamtech/sdk4/internal/plugin/AuthenticationExpiredCallbackExtension;", "serviceTransaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "reauthorizationHandlerRegistry", "Lcom/bamtech/sdk4/session/ReauthorizationHandlerRegistry;", "(Lcom/bamtech/sdk4/internal/token/AccessContextUpdater;Ljavax/inject/Provider;Ljavax/inject/Provider;Lcom/bamtech/sdk4/session/ReauthorizationHandlerRegistry;)V", "getReauthorizationHandlerRegistry$sdk_core_api_release", "()Lcom/bamtech/sdk4/session/ReauthorizationHandlerRegistry;", "getRenewSessionExtension$sdk_core_api_release", "()Ljavax/inject/Provider;", "getServiceTransaction$sdk_core_api_release", "getSession$sdk_core_api_release", "()Lcom/bamtech/sdk4/internal/token/AccessContextUpdater;", "completableRenewSession", "Lio/reactivex/CompletableTransformer;", "transaction", "handleRenew", "Lio/reactivex/Completable;", "throwable", "", "maybeRenewSession", "Lio/reactivex/MaybeTransformer;", "T", "observableRenewSession", "Lio/reactivex/ObservableTransformer;", "shouldRenew", "", "instance", "Lcom/bamtech/sdk4/session/AuthenticationExpiredCallback;", "singleRenewSession", "Lio/reactivex/SingleTransformer;", "Companion", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DefaultRenewSessionTransformers.kt */
public final class DefaultRenewSessionTransformers implements RenewSessionTransformers {
    private static final ServiceError expiredReason = new ServiceError("invalid_grant", "expired-token");
    private final ReauthorizationHandlerRegistry reauthorizationHandlerRegistry;
    private final Provider<AuthenticationExpiredCallbackExtension> renewSessionExtension;
    private final Provider<ServiceTransaction> serviceTransaction;
    private final AccessContextUpdater session;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/session/DefaultRenewSessionTransformers$Companion;", "", "()V", "expiredReason", "Lcom/bamtech/sdk4/internal/service/ServiceError;", "getExpiredReason", "()Lcom/bamtech/sdk4/internal/service/ServiceError;", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: DefaultRenewSessionTransformers.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new Companion(null);
    }

    public DefaultRenewSessionTransformers(AccessContextUpdater accessContextUpdater, Provider<AuthenticationExpiredCallbackExtension> provider, Provider<ServiceTransaction> provider2, ReauthorizationHandlerRegistry reauthorizationHandlerRegistry2) {
        this.session = accessContextUpdater;
        this.renewSessionExtension = provider;
        this.serviceTransaction = provider2;
        this.reauthorizationHandlerRegistry = reauthorizationHandlerRegistry2;
    }

    public CompletableTransformer completableRenewSession() {
        Object obj = this.serviceTransaction.get();
        C12880j.m40222a(obj, "serviceTransaction.get()");
        return completableRenewSession((ServiceTransaction) obj);
    }

    public final ReauthorizationHandlerRegistry getReauthorizationHandlerRegistry$sdk_core_api_release() {
        return this.reauthorizationHandlerRegistry;
    }

    public Completable handleRenew(ServiceTransaction serviceTransaction2, Throwable th) {
        AuthenticationExpiredCallback instance = ((AuthenticationExpiredCallbackExtension) this.renewSessionExtension.get()).getInstance();
        boolean shouldRenew = shouldRenew(th, instance);
        if (shouldRenew) {
            Completable b = this.session.reset(serviceTransaction2).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new DefaultRenewSessionTransformers$handleRenew$1<Object,Object>(instance, th)).mo30217b((Function<? super T, ? extends CompletableSource>) new DefaultRenewSessionTransformers$handleRenew$2<Object,Object>(this, serviceTransaction2, th));
            C12880j.m40222a((Object) b, "session.reset(transactio…le)\n                    }");
            return b;
        } else if (!shouldRenew) {
            Completable a = Completable.m38154a(th);
            C12880j.m40222a((Object) a, "Completable.error(throwable)");
            return a;
        } else {
            throw new C12898l();
        }
    }

    public <T> MaybeTransformer<T, T> maybeRenewSession() {
        Object obj = this.serviceTransaction.get();
        C12880j.m40222a(obj, "serviceTransaction.get()");
        return maybeRenewSession((ServiceTransaction) obj);
    }

    public <T> ObservableTransformer<T, T> observableRenewSession() {
        Object obj = this.serviceTransaction.get();
        C12880j.m40222a(obj, "serviceTransaction.get()");
        return observableRenewSession((ServiceTransaction) obj);
    }

    public boolean shouldRenew(Throwable th, AuthenticationExpiredCallback authenticationExpiredCallback) {
        return (th instanceof UnauthorizedException) && ((UnauthorizedException) th).getErrors().contains(expiredReason) && authenticationExpiredCallback != null;
    }

    public <T> SingleTransformer<T, T> singleRenewSession() {
        Object obj = this.serviceTransaction.get();
        C12880j.m40222a(obj, "serviceTransaction.get()");
        return singleRenewSession((ServiceTransaction) obj);
    }

    public CompletableTransformer completableRenewSession(ServiceTransaction serviceTransaction2) {
        return new DefaultRenewSessionTransformers$completableRenewSession$1(this, serviceTransaction2);
    }

    public <T> MaybeTransformer<T, T> maybeRenewSession(ServiceTransaction serviceTransaction2) {
        return new DefaultRenewSessionTransformers$maybeRenewSession$1(this, serviceTransaction2);
    }

    public <T> ObservableTransformer<T, T> observableRenewSession(ServiceTransaction serviceTransaction2) {
        return new DefaultRenewSessionTransformers$observableRenewSession$1(this, serviceTransaction2);
    }

    public <T> SingleTransformer<T, T> singleRenewSession(ServiceTransaction serviceTransaction2) {
        return new DefaultRenewSessionTransformers$singleRenewSession$1(this, serviceTransaction2);
    }
}
