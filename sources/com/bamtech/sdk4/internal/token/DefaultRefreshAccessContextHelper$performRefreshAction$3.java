package com.bamtech.sdk4.internal.token;

import com.bamtech.core.logging.LogDispatcher.DefaultImpls;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import kotlin.Metadata;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: RefreshAccessContextHelper.kt */
final class DefaultRefreshAccessContextHelper$performRefreshAction$3<T> implements Consumer<Throwable> {
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultRefreshAccessContextHelper this$0;

    DefaultRefreshAccessContextHelper$performRefreshAction$3(DefaultRefreshAccessContextHelper defaultRefreshAccessContextHelper, ServiceTransaction serviceTransaction) {
        this.this$0 = defaultRefreshAccessContextHelper;
        this.$transaction = serviceTransaction;
    }

    public final void accept(Throwable th) {
        ServiceTransaction serviceTransaction = this.$transaction;
        DefaultRefreshAccessContextHelper defaultRefreshAccessContextHelper = this.this$0;
        StringBuilder sb = new StringBuilder();
        sb.append("TransactionId: ");
        sb.append(this.$transaction.getId());
        DefaultImpls.log$default(serviceTransaction, defaultRefreshAccessContextHelper, "AccessContextRefreshFailed", sb.toString(), null, false, 24, null);
    }
}
