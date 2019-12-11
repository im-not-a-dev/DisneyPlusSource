package com.bamtech.sdk4.internal.token;

import com.bamtech.core.logging.LogDispatcher.DefaultImpls;
import com.bamtech.sdk4.internal.configuration.SubjectTokenTypes;
import com.bamtech.sdk4.internal.configuration.TokenServiceConfiguration;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.service.TransactionResult;
import com.bamtech.sdk4.internal.session.InternalSessionState.LoggedOut;
import com.bamtech.sdk4.internal.session.InternalSessionStateProvider;
import com.bamtech.sdk4.internal.token.TokenExchangeRequest.TokenExchange;
import com.bamtech.sdk4.token.AccessContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/internal/service/TransactionResult;", "Lcom/bamtech/sdk4/token/AccessContext;", "kotlin.jvm.PlatformType", "configuration", "Lcom/bamtech/sdk4/internal/configuration/TokenServiceConfiguration;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: TokenExchangeManager.kt */
final class DefaultTokenExchangeManager$exchangeDeviceToken$2<T, R> implements Function<T, SingleSource<? extends R>> {
    final /* synthetic */ String $assertion;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultTokenExchangeManager this$0;

    DefaultTokenExchangeManager$exchangeDeviceToken$2(DefaultTokenExchangeManager defaultTokenExchangeManager, ServiceTransaction serviceTransaction, String str) {
        this.this$0 = defaultTokenExchangeManager;
        this.$transaction = serviceTransaction;
        this.$assertion = str;
    }

    public final Single<TransactionResult<AccessContext>> apply(TokenServiceConfiguration tokenServiceConfiguration) {
        SubjectTokenTypes subjectTokenTypes = tokenServiceConfiguration.getSubjectTokenTypes();
        DefaultTokenExchangeManager defaultTokenExchangeManager = this.this$0;
        ServiceTransaction serviceTransaction = this.$transaction;
        TokenExchange tokenExchange = new TokenExchange(this.$assertion, subjectTokenTypes.get(SubjectTokenTypes.DEVICE), null, this.this$0.platform, 4, null);
        return defaultTokenExchangeManager.exchange(serviceTransaction, tokenExchange).mo30227d((Consumer<? super T>) new Consumer<TransactionResult<? extends AccessContext>>(this) {
            final /* synthetic */ DefaultTokenExchangeManager$exchangeDeviceToken$2 this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(TransactionResult<AccessContext> transactionResult) {
                InternalSessionStateProvider access$getInternalSessionStateProvider$p = this.this$0.this$0.internalSessionStateProvider;
                LoggedOut loggedOut = new LoggedOut((AccessContext) transactionResult.getResult(), 0, null, 6, null);
                access$getInternalSessionStateProvider$p.setInternalSessionState(loggedOut);
                DefaultTokenExchangeManager$exchangeDeviceToken$2 defaultTokenExchangeManager$exchangeDeviceToken$2 = this.this$0;
                DefaultImpls.d$default(defaultTokenExchangeManager$exchangeDeviceToken$2.$transaction, defaultTokenExchangeManager$exchangeDeviceToken$2.this$0, "DeviceTokenExchangeSuccess", false, 4, null);
            }
        }).mo30218b((Consumer<? super Throwable>) new Consumer<Throwable>(this) {
            final /* synthetic */ DefaultTokenExchangeManager$exchangeDeviceToken$2 this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(Throwable th) {
                DefaultTokenExchangeManager$exchangeDeviceToken$2 defaultTokenExchangeManager$exchangeDeviceToken$2 = this.this$0;
                DefaultImpls.d$default(defaultTokenExchangeManager$exchangeDeviceToken$2.$transaction, defaultTokenExchangeManager$exchangeDeviceToken$2.this$0, "DeviceTokenExchangeFailure", th.getMessage(), false, 8, null);
                DefaultTokenExchangeManager$exchangeDeviceToken$2 defaultTokenExchangeManager$exchangeDeviceToken$22 = this.this$0;
                DefaultTokenExchangeManager defaultTokenExchangeManager = defaultTokenExchangeManager$exchangeDeviceToken$22.this$0;
                ServiceTransaction serviceTransaction = defaultTokenExchangeManager$exchangeDeviceToken$22.$transaction;
                Intrinsics.checkReturnedValueIsNotNull((Object) th, "it");
                defaultTokenExchangeManager.handleTokenError(serviceTransaction, th, this.this$0.this$0.internalSessionStateProvider.getCurrentInternalSessionState());
            }
        });
    }
}
