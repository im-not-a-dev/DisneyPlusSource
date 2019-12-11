package com.bamtech.sdk4.internal.token;

import com.bamtech.core.logging.LogDispatcher.DefaultImpls;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.service.TransactionResult;
import com.bamtech.sdk4.token.AccessContext;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/internal/service/TransactionResult;", "Lcom/bamtech/sdk4/token/AccessContext;", "call"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DeviceAccessContextHelper.kt */
final class DefaultDeviceAccessContextHelper$getDeviceContext$1<V> implements Callable<SingleSource<? extends T>> {
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultDeviceAccessContextHelper this$0;

    DefaultDeviceAccessContextHelper$getDeviceContext$1(DefaultDeviceAccessContextHelper defaultDeviceAccessContextHelper, ServiceTransaction serviceTransaction) {
        this.this$0 = defaultDeviceAccessContextHelper;
        this.$transaction = serviceTransaction;
    }

    public final Single<TransactionResult<AccessContext>> call() {
        if (this.this$0.getContextRetrievalInProgress() == null) {
            ServiceTransaction serviceTransaction = this.$transaction;
            DefaultDeviceAccessContextHelper defaultDeviceAccessContextHelper = this.this$0;
            StringBuilder sb = new StringBuilder();
            sb.append("TransactionId: ");
            sb.append(this.$transaction.getId());
            DefaultImpls.log$default(serviceTransaction, defaultDeviceAccessContextHelper, "DeviceContextRequested", sb.toString(), null, false, 24, null);
            DefaultDeviceAccessContextHelper defaultDeviceAccessContextHelper2 = this.this$0;
            defaultDeviceAccessContextHelper2.setContextRetrievalInProgress(defaultDeviceAccessContextHelper2.deviceManager.getDeviceGrant(this.$transaction).mo30206a(this.this$0.deviceTransformer(this.$transaction)).mo30218b((Consumer<? super Throwable>) new Consumer<Throwable>(this) {
                final /* synthetic */ DefaultDeviceAccessContextHelper$getDeviceContext$1 this$0;

                {
                    this.this$0 = r1;
                }

                public final void accept(Throwable th) {
                    DefaultDeviceAccessContextHelper$getDeviceContext$1 defaultDeviceAccessContextHelper$getDeviceContext$1 = this.this$0;
                    ServiceTransaction serviceTransaction = defaultDeviceAccessContextHelper$getDeviceContext$1.$transaction;
                    DefaultDeviceAccessContextHelper defaultDeviceAccessContextHelper = defaultDeviceAccessContextHelper$getDeviceContext$1.this$0;
                    StringBuilder sb = new StringBuilder();
                    sb.append(th);
                    sb.append("\nTransactionId: ");
                    sb.append(this.this$0.$transaction.getId());
                    DefaultImpls.log$default(serviceTransaction, defaultDeviceAccessContextHelper, "DeviceContextRetrievalFailed", sb.toString(), null, false, 24, null);
                }
            }));
        }
        Single<TransactionResult<AccessContext>> contextRetrievalInProgress = this.this$0.getContextRetrievalInProgress();
        if (contextRetrievalInProgress != null) {
            return contextRetrievalInProgress;
        }
        C12880j.m40220a();
        throw null;
    }
}
