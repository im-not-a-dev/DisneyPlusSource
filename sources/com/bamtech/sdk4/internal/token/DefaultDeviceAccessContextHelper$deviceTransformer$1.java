package com.bamtech.sdk4.internal.token;

import com.bamtech.core.logging.LogDispatcher.DefaultImpls;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.service.TransactionResult;
import com.bamtech.sdk4.internal.session.InternalSessionState;
import com.bamtech.sdk4.internal.session.InternalSessionState.Failed;
import com.bamtech.sdk4.service.ServiceException;
import com.bamtech.sdk4.service.ServiceException.Companion;
import com.bamtech.sdk4.service.UnauthorizedException;
import com.bamtech.sdk4.token.AccessContext;
import com.bamtech.sdk4.token.Grant;
import com.facebook.stetho.server.http.HttpStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import org.joda.time.DateTime;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.SingleTransformer;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0014\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00060\u00060\u0001H\n¢\u0006\u0002\b\u0007"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/internal/service/TransactionResult;", "Lcom/bamtech/sdk4/token/AccessContext;", "kotlin.jvm.PlatformType", "it", "Lcom/bamtech/sdk4/token/Grant;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DeviceAccessContextHelper.kt */
final class DefaultDeviceAccessContextHelper$deviceTransformer$1<Upstream, Downstream> implements SingleTransformer<Grant, TransactionResult<? extends AccessContext>> {
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultDeviceAccessContextHelper this$0;

    DefaultDeviceAccessContextHelper$deviceTransformer$1(DefaultDeviceAccessContextHelper defaultDeviceAccessContextHelper, ServiceTransaction serviceTransaction) {
        this.this$0 = defaultDeviceAccessContextHelper;
        this.$transaction = serviceTransaction;
    }

    public final Single<TransactionResult<AccessContext>> apply(Single<Grant> single) {
        return single.mo30218b((Consumer<? super Throwable>) new Consumer<Throwable>(this) {
            final /* synthetic */ DefaultDeviceAccessContextHelper$deviceTransformer$1 this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(Throwable th) {
                ServiceException serviceException;
                Failed failed;
                DefaultDeviceAccessContextHelper$deviceTransformer$1 defaultDeviceAccessContextHelper$deviceTransformer$1 = this.this$0;
                DefaultImpls.d$default(defaultDeviceAccessContextHelper$deviceTransformer$1.$transaction, defaultDeviceAccessContextHelper$deviceTransformer$1.this$0, "DeviceRegistrationFailure", th.getMessage(), false, 8, null);
                if (th instanceof ServiceException) {
                    serviceException = (ServiceException) th;
                } else {
                    serviceException = Companion.create$default(ServiceException.Companion, HttpStatus.HTTP_INTERNAL_SERVER_ERROR, this.this$0.$transaction.getId(), null, th, 4, null);
                }
                ServiceException serviceException2 = serviceException;
                InternalSessionState currentInternalSessionState = this.this$0.this$0.internalSessionStateProvider.getCurrentInternalSessionState();
                if (!(currentInternalSessionState instanceof Failed)) {
                    failed = new Failed(serviceException2, 0, null, 6, null);
                } else {
                    int attempts = currentInternalSessionState.getAttempts() + 1;
                    DateTime now = DateTime.now();
                    C12880j.m40222a((Object) now, "DateTime.now()");
                    failed = new Failed(serviceException2, attempts, now);
                }
                this.this$0.this$0.internalSessionStateProvider.setInternalSessionState(failed);
            }
        }).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new Function<T, SingleSource<? extends R>>(this) {
            final /* synthetic */ DefaultDeviceAccessContextHelper$deviceTransformer$1 this$0;

            {
                this.this$0 = r1;
            }

            public final Single<TransactionResult<AccessContext>> apply(Grant grant) {
                return this.this$0.this$0.tokenExchangeManager.exchangeDeviceToken(this.this$0.$transaction, grant.getAssertion());
            }
        }).mo30235h(new Function<Throwable, SingleSource<? extends TransactionResult<? extends AccessContext>>>(this) {
            final /* synthetic */ DefaultDeviceAccessContextHelper$deviceTransformer$1 this$0;

            {
                this.this$0 = r1;
            }

            public final Single<TransactionResult<AccessContext>> apply(Throwable th) {
                UnauthorizedException unauthorizedException = new UnauthorizedException(this.this$0.$transaction.getId(), null, th, 2, null);
                return Single.m38395a((Throwable) unauthorizedException);
            }
        }).mo30219b((C11945a) new C11945a(this) {
            final /* synthetic */ DefaultDeviceAccessContextHelper$deviceTransformer$1 this$0;

            {
                this.this$0 = r1;
            }

            public final void run() {
                this.this$0.this$0.setContextRetrievalInProgress(null);
            }
        }).mo30226d();
    }
}
