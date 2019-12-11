package com.bamtech.sdk4.internal.token;

import com.bamtech.core.logging.LogLevel;
import com.bamtech.sdk4.account.legacy.LegacyAccountExtension;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.service.ServiceTransaction.DefaultImpls;
import com.bamtech.sdk4.internal.service.TransactionResult;
import com.bamtech.sdk4.internal.session.InternalSessionState.LoggedIn;
import com.bamtech.sdk4.internal.session.InternalSessionState.LoggedOut;
import com.bamtech.sdk4.internal.session.InternalSessionStateProvider;
import com.bamtech.sdk4.token.AccessContext;
import kotlin.Metadata;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/internal/service/TransactionResult;", "Lcom/bamtech/sdk4/token/AccessContext;", "kotlin.jvm.PlatformType", "transactionResult", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: RefreshAccessContextHelper.kt */
final class DefaultRefreshAccessContextHelper$performRefreshAction$1<T, R> implements Function<T, SingleSource<? extends R>> {
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultRefreshAccessContextHelper this$0;

    DefaultRefreshAccessContextHelper$performRefreshAction$1(DefaultRefreshAccessContextHelper defaultRefreshAccessContextHelper, ServiceTransaction serviceTransaction) {
        this.this$0 = defaultRefreshAccessContextHelper;
        this.$transaction = serviceTransaction;
    }

    public final Single<TransactionResult<AccessContext>> apply(final TransactionResult<AccessContext> transactionResult) {
        return ((LegacyAccountExtension) this.this$0.legacyExtension.get()).isAccountContext(transactionResult).mo30233g(new Function<T, R>(this) {
            final /* synthetic */ DefaultRefreshAccessContextHelper$performRefreshAction$1 this$0;

            {
                this.this$0 = r1;
            }

            public final TransactionResult<AccessContext> apply(Boolean bool) {
                if (bool.booleanValue()) {
                    DefaultImpls.logDust$default(this.this$0.$transaction, "urn:bamtech:dust:bamsdk:api:session:legacyTokenConvertedToAccountContext", "urn:bamtech:dust:bamsdk:event:sdk", LogLevel.INFO, false, 8, null);
                    InternalSessionStateProvider access$getInternalSessionStateProvider$p = this.this$0.this$0.internalSessionStateProvider;
                    LoggedIn loggedIn = new LoggedIn((AccessContext) transactionResult.getResult(), 0, null, 6, null);
                    access$getInternalSessionStateProvider$p.setInternalSessionState(loggedIn);
                } else {
                    DefaultImpls.logDust$default(this.this$0.$transaction, "urn:bamtech:dust:bamsdk:api:session:legacyTokenConvertedToDeviceContext", "urn:bamtech:dust:bamsdk:event:sdk", LogLevel.INFO, false, 8, null);
                    InternalSessionStateProvider access$getInternalSessionStateProvider$p2 = this.this$0.this$0.internalSessionStateProvider;
                    LoggedOut loggedOut = new LoggedOut((AccessContext) transactionResult.getResult(), 0, null, 6, null);
                    access$getInternalSessionStateProvider$p2.setInternalSessionState(loggedOut);
                }
                this.this$0.this$0.internalSessionStateProvider.removeLegacyAccountContext();
                return transactionResult;
            }
        }).mo30218b((Consumer<? super Throwable>) new Consumer<Throwable>(this) {
            final /* synthetic */ DefaultRefreshAccessContextHelper$performRefreshAction$1 this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(Throwable th) {
                DefaultImpls.logDust$default(this.this$0.$transaction, "urn:bamtech:dust:bamsdk:api:session:legacyTokenConversionFailed", "urn:bamtech:dust:bamsdk:error:sdk", th, LogLevel.ERROR, false, 16, null);
            }
        });
    }
}
