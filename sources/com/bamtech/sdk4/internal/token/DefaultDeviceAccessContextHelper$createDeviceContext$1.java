package com.bamtech.sdk4.internal.token;

import com.bamtech.core.logging.LogDispatcher.DefaultImpls;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.service.TransactionResult;
import com.bamtech.sdk4.token.AccessContext;
import kotlin.Metadata;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/SingleSource;", "Lcom/bamtech/sdk4/internal/service/TransactionResult;", "Lcom/bamtech/sdk4/token/AccessContext;", "kotlin.jvm.PlatformType", "throwable", "", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DeviceAccessContextHelper.kt */
final class DefaultDeviceAccessContextHelper$createDeviceContext$1<T, R> implements Function<Throwable, SingleSource<? extends TransactionResult<? extends AccessContext>>> {
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultDeviceAccessContextHelper this$0;

    DefaultDeviceAccessContextHelper$createDeviceContext$1(DefaultDeviceAccessContextHelper defaultDeviceAccessContextHelper, ServiceTransaction serviceTransaction) {
        this.this$0 = defaultDeviceAccessContextHelper;
        this.$transaction = serviceTransaction;
    }

    public final SingleSource<? extends TransactionResult<AccessContext>> apply(Throwable th) {
        if (this.this$0.isInvalidGrantException(th)) {
            return this.this$0.deviceManager.resetDeviceGrant(this.$transaction).mo30206a(this.this$0.deviceTransformer(this.$transaction)).mo30218b((Consumer<? super Throwable>) new Consumer<Throwable>(this) {
                final /* synthetic */ DefaultDeviceAccessContextHelper$createDeviceContext$1 this$0;

                {
                    this.this$0 = r1;
                }

                public final void accept(Throwable th) {
                    DefaultDeviceAccessContextHelper$createDeviceContext$1 defaultDeviceAccessContextHelper$createDeviceContext$1 = this.this$0;
                    ServiceTransaction serviceTransaction = defaultDeviceAccessContextHelper$createDeviceContext$1.$transaction;
                    DefaultDeviceAccessContextHelper defaultDeviceAccessContextHelper = defaultDeviceAccessContextHelper$createDeviceContext$1.this$0;
                    StringBuilder sb = new StringBuilder();
                    sb.append(th);
                    sb.append("\nTransactionId: ");
                    sb.append(this.this$0.$transaction.getId());
                    DefaultImpls.log$default(serviceTransaction, defaultDeviceAccessContextHelper, "DeviceContextResetFailed", sb.toString(), null, false, 24, null);
                }
            });
        }
        return Single.m38395a(th);
    }
}
