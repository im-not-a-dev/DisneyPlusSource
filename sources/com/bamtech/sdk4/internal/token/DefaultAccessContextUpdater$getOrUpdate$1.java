package com.bamtech.sdk4.internal.token;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.service.TransactionResult;
import com.bamtech.sdk4.token.AccessContext;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002 \u0004*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/internal/service/TransactionResult;", "Lcom/bamtech/sdk4/token/AccessContext;", "kotlin.jvm.PlatformType", "call"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DefaultAccessContextUpdater.kt */
final class DefaultAccessContextUpdater$getOrUpdate$1<V> implements Callable<SingleSource<? extends T>> {
    final /* synthetic */ boolean $force;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultAccessContextUpdater this$0;

    DefaultAccessContextUpdater$getOrUpdate$1(DefaultAccessContextUpdater defaultAccessContextUpdater, boolean z, ServiceTransaction serviceTransaction) {
        this.this$0 = defaultAccessContextUpdater;
        this.$force = z;
        this.$transaction = serviceTransaction;
    }

    public final Single<TransactionResult<AccessContext>> call() {
        Single<TransactionResult<AccessContext>> updateInProgress$sdk_core_api_release;
        synchronized (this.this$0) {
            if (this.$force) {
                this.this$0.cancelPendingOperations();
            }
            updateInProgress$sdk_core_api_release = this.this$0.getUpdateInProgress$sdk_core_api_release();
            if (updateInProgress$sdk_core_api_release != null) {
                this.this$0.refreshAccessContextHelper.refreshAccessContextInProgress(this.$transaction);
                if (updateInProgress$sdk_core_api_release != null) {
                }
            }
            updateInProgress$sdk_core_api_release = this.this$0.refreshAccessContextHelper.refreshAccessContext(this.$transaction, this.$force).mo30227d((Consumer<? super T>) new C2073x80509bdc<Object>(this)).mo30219b((C11945a) new C2074x80509bdd(this)).mo30226d();
            this.this$0.setUpdateInProgress$sdk_core_api_release(updateInProgress$sdk_core_api_release);
        }
        return updateInProgress$sdk_core_api_release;
    }
}
