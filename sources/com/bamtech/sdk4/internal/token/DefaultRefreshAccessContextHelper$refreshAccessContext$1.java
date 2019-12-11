package com.bamtech.sdk4.internal.token;

import com.bamtech.core.logging.LogDispatcher.DefaultImpls;
import com.bamtech.sdk4.internal.configuration.TokenServiceConfiguration;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.service.TransactionResult;
import com.bamtech.sdk4.internal.session.InternalSessionState;
import com.bamtech.sdk4.internal.session.InternalSessionState.Failed;
import com.bamtech.sdk4.internal.session.InternalSessionStateProvider;
import com.bamtech.sdk4.service.BadRequestException;
import com.bamtech.sdk4.service.InvalidStateException;
import com.bamtech.sdk4.service.NotFoundException;
import com.bamtech.sdk4.service.ServiceException;
import com.bamtech.sdk4.service.UnauthorizedException;
import com.bamtech.sdk4.token.AccessContext;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/internal/service/TransactionResult;", "Lcom/bamtech/sdk4/token/AccessContext;", "kotlin.jvm.PlatformType", "call"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: RefreshAccessContextHelper.kt */
final class DefaultRefreshAccessContextHelper$refreshAccessContext$1<V> implements Callable<SingleSource<? extends T>> {
    final /* synthetic */ boolean $force;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultRefreshAccessContextHelper this$0;

    DefaultRefreshAccessContextHelper$refreshAccessContext$1(DefaultRefreshAccessContextHelper defaultRefreshAccessContextHelper, ServiceTransaction serviceTransaction, boolean z) {
        this.this$0 = defaultRefreshAccessContextHelper;
        this.$transaction = serviceTransaction;
        this.$force = z;
    }

    public final Single<TransactionResult<AccessContext>> call() {
        return this.this$0.configurationProvider.getServiceConfiguration(this.$transaction, C20841.INSTANCE).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new Function<T, SingleSource<? extends R>>(this) {
            final /* synthetic */ DefaultRefreshAccessContextHelper$refreshAccessContext$1 this$0;

            {
                this.this$0 = r1;
            }

            public final Single<TransactionResult<AccessContext>> apply(TokenServiceConfiguration tokenServiceConfiguration) {
                InternalSessionState currentInternalSessionState = this.this$0.this$0.internalSessionStateProvider.getCurrentInternalSessionState();
                AccessContext accessContext = currentInternalSessionState.getAccessContext();
                final RefreshAction refreshAction = this.this$0.this$0.refreshActionPlanner.getRefreshAction(this.this$0.$force, tokenServiceConfiguration);
                DefaultRefreshAccessContextHelper$refreshAccessContext$1 defaultRefreshAccessContextHelper$refreshAccessContext$1 = this.this$0;
                return defaultRefreshAccessContextHelper$refreshAccessContext$1.this$0.performRefreshAction$sdk_core_api_release(defaultRefreshAccessContextHelper$refreshAccessContext$1.$transaction, refreshAction, currentInternalSessionState, accessContext).mo30235h(new Function<Throwable, SingleSource<? extends TransactionResult<? extends AccessContext>>>(this) {
                    final /* synthetic */ C20852 this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final SingleSource<? extends TransactionResult<AccessContext>> apply(Throwable th) {
                        DefaultRefreshAccessContextHelper$refreshAccessContext$1 defaultRefreshAccessContextHelper$refreshAccessContext$1 = this.this$0.this$0;
                        ServiceTransaction serviceTransaction = defaultRefreshAccessContextHelper$refreshAccessContext$1.$transaction;
                        DefaultRefreshAccessContextHelper defaultRefreshAccessContextHelper = defaultRefreshAccessContextHelper$refreshAccessContext$1.this$0;
                        StringBuilder sb = new StringBuilder();
                        sb.append(th);
                        sb.append("\nTransactionId: ");
                        sb.append(this.this$0.this$0.$transaction.getId());
                        sb.append(' ');
                        sb.append(refreshAction);
                        DefaultImpls.log$default(serviceTransaction, defaultRefreshAccessContextHelper, "AccessContextRetrievalFailed", sb.toString(), null, false, 24, null);
                        if (th instanceof NotFoundException) {
                            return this.this$0.this$0.this$0.deviceContextHelper.getDeviceContext(this.this$0.this$0.$transaction);
                        }
                        boolean z = th instanceof BadRequestException;
                        if (z && this.this$0.this$0.this$0.isTokenInvalid$sdk_core_api_release((BadRequestException) th)) {
                            InternalSessionStateProvider access$getInternalSessionStateProvider$p = this.this$0.this$0.this$0.internalSessionStateProvider;
                            Failed failed = new Failed((ServiceException) th, 0, null, 6, null);
                            access$getInternalSessionStateProvider$p.setInternalSessionState(failed);
                            DefaultRefreshAccessContextHelper$refreshAccessContext$1 defaultRefreshAccessContextHelper$refreshAccessContext$12 = this.this$0.this$0;
                            return Single.m38395a((Throwable) defaultRefreshAccessContextHelper$refreshAccessContext$12.this$0.invalidTokenRefresh(defaultRefreshAccessContextHelper$refreshAccessContext$12.$transaction, th));
                        } else if (z && (this.this$0.this$0.this$0.internalSessionStateProvider.getCurrentInternalSessionState() instanceof Failed)) {
                            return this.this$0.this$0.this$0.deviceContextHelper.createDeviceContext(this.this$0.this$0.$transaction);
                        } else {
                            if (th instanceof UnauthorizedException) {
                                return Single.m38395a(th);
                            }
                            if (th instanceof InvalidStateException) {
                                return Single.m38395a(th);
                            }
                            DefaultRefreshAccessContextHelper$refreshAccessContext$1 defaultRefreshAccessContextHelper$refreshAccessContext$13 = this.this$0.this$0;
                            return Single.m38395a((Throwable) defaultRefreshAccessContextHelper$refreshAccessContext$13.this$0.refreshFailed(defaultRefreshAccessContextHelper$refreshAccessContext$13.$transaction, th));
                        }
                    }
                });
            }
        });
    }
}
