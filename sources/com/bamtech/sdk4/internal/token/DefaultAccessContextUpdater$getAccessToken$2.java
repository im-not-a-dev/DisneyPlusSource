package com.bamtech.sdk4.internal.token;

import com.bamtech.core.logging.LogDispatcher.DefaultImpls;
import com.bamtech.sdk4.internal.configuration.TokenServiceConfiguration;
import com.bamtech.sdk4.internal.service.ServiceError;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.session.InternalSessionState;
import com.bamtech.sdk4.internal.session.InternalSessionState.Failed;
import com.bamtech.sdk4.service.InvalidStateException;
import com.bamtech.sdk4.service.UnauthorizedException;
import com.bamtech.sdk4.token.AccessContext;
import kotlin.C12898l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u001a\u0012\u0016\u0012\u0014 \u0004*\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00030\u0002j\u0002`\u00030\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "", "Lcom/bamtech/sdk4/core/types/JWT;", "kotlin.jvm.PlatformType", "configuration", "Lcom/bamtech/sdk4/internal/configuration/TokenServiceConfiguration;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DefaultAccessContextUpdater.kt */
final class DefaultAccessContextUpdater$getAccessToken$2<T, R> implements Function<T, SingleSource<? extends R>> {
    final /* synthetic */ InternalSessionState $sessionState;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultAccessContextUpdater this$0;

    DefaultAccessContextUpdater$getAccessToken$2(DefaultAccessContextUpdater defaultAccessContextUpdater, InternalSessionState internalSessionState, ServiceTransaction serviceTransaction) {
        this.this$0 = defaultAccessContextUpdater;
        this.$sessionState = internalSessionState;
        this.$transaction = serviceTransaction;
    }

    public final Single<String> apply(TokenServiceConfiguration tokenServiceConfiguration) {
        boolean updateDelayed = this.$sessionState.updateDelayed(this.$transaction, tokenServiceConfiguration.getRetryPolicy());
        String str = "TransactionId: ";
        if (updateDelayed) {
            if (this.$sessionState.getAccessContext() != null) {
                ServiceTransaction serviceTransaction = this.$transaction;
                DefaultAccessContextUpdater defaultAccessContextUpdater = this.this$0;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(this.$transaction.getId());
                DefaultImpls.log$default(serviceTransaction, defaultAccessContextUpdater, "AccessContextRetryDelayed", sb.toString(), null, false, 24, null);
                AccessContext accessContext = this.$sessionState.getAccessContext();
                if (accessContext != null) {
                    return Single.m38399b(accessContext.getAccessToken());
                }
                Intrinsics.throwNpe();
                throw null;
            } else if (this.$sessionState instanceof Failed) {
                ServiceTransaction serviceTransaction2 = this.$transaction;
                DefaultAccessContextUpdater defaultAccessContextUpdater2 = this.this$0;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(this.$transaction.getId());
                DefaultImpls.log$default(serviceTransaction2, defaultAccessContextUpdater2, "AccessContextFailureRetryDelayed", sb2.toString(), null, false, 24, null);
                UnauthorizedException unauthorizedException = new UnauthorizedException(this.$transaction.getId(), null, ((Failed) this.$sessionState).getException(), 2, null);
                return Single.m38395a((Throwable) unauthorizedException);
            } else {
                ServiceTransaction serviceTransaction3 = this.$transaction;
                DefaultAccessContextUpdater defaultAccessContextUpdater3 = this.this$0;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(this.$transaction.getId());
                ServiceTransaction serviceTransaction4 = serviceTransaction3;
                DefaultImpls.log$default(serviceTransaction4, defaultAccessContextUpdater3, "AccessContextInvalidState", sb3.toString(), null, false, 24, null);
                InvalidStateException invalidStateException = new InvalidStateException(this.$transaction.getId(), C13183n.m40498a(new ServiceError("invalid-session-state", null, 2, null)), null, 4, null);
                return Single.m38395a((Throwable) invalidStateException);
            }
        } else if (!updateDelayed) {
            if (this.$sessionState.getAttempts() > 0) {
                ServiceTransaction serviceTransaction5 = this.$transaction;
                DefaultAccessContextUpdater defaultAccessContextUpdater4 = this.this$0;
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(this.$transaction.getId());
                DefaultImpls.log$default(serviceTransaction5, defaultAccessContextUpdater4, "AccessContextRetry", sb4.toString(), null, false, 24, null);
            } else {
                ServiceTransaction serviceTransaction6 = this.$transaction;
                DefaultAccessContextUpdater defaultAccessContextUpdater5 = this.this$0;
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(this.$transaction.getId());
                DefaultImpls.log$default(serviceTransaction6, defaultAccessContextUpdater5, "AccessContextRequested", sb5.toString(), null, false, 24, null);
            }
            return AccessContextUpdater.DefaultImpls.getOrUpdate$default(this.this$0, this.$transaction, false, 2, null).mo30233g(C20751.INSTANCE);
        } else {
            throw new C12898l();
        }
    }
}
