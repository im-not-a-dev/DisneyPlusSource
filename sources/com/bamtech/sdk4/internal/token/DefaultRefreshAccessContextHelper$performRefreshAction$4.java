package com.bamtech.sdk4.internal.token;

import com.bamtech.core.logging.LogDispatcher.DefaultImpls;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.service.TransactionResult;
import com.bamtech.sdk4.token.AccessContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/SingleSource;", "Lcom/bamtech/sdk4/internal/service/TransactionResult;", "Lcom/bamtech/sdk4/token/AccessContext;", "kotlin.jvm.PlatformType", "it", "", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: RefreshAccessContextHelper.kt */
final class DefaultRefreshAccessContextHelper$performRefreshAction$4<T, R> implements Function<Throwable, SingleSource<? extends TransactionResult<? extends AccessContext>>> {
    final /* synthetic */ AccessContext $context;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultRefreshAccessContextHelper this$0;

    DefaultRefreshAccessContextHelper$performRefreshAction$4(DefaultRefreshAccessContextHelper defaultRefreshAccessContextHelper, ServiceTransaction serviceTransaction, AccessContext accessContext) {
        this.this$0 = defaultRefreshAccessContextHelper;
        this.$transaction = serviceTransaction;
        this.$context = accessContext;
    }

    public final SingleSource<? extends TransactionResult<AccessContext>> apply(Throwable th) {
        ServiceTransaction serviceTransaction = this.$transaction;
        DefaultRefreshAccessContextHelper defaultRefreshAccessContextHelper = this.this$0;
        StringBuilder sb = new StringBuilder();
        String str = "TransactionId: ";
        sb.append(str);
        sb.append(this.$transaction.getId());
        DefaultImpls.log$default(serviceTransaction, defaultRefreshAccessContextHelper, "AccessContextRefreshFailed", sb.toString(), null, false, 24, null);
        AccessContext accessContext = this.$context;
        if (!(accessContext != null ? accessContext.isValid() : false)) {
            return Single.m38395a(th);
        }
        ServiceTransaction serviceTransaction2 = this.$transaction;
        DefaultRefreshAccessContextHelper defaultRefreshAccessContextHelper2 = this.this$0;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(this.$transaction.getId());
        DefaultImpls.log$default(serviceTransaction2, defaultRefreshAccessContextHelper2, "HasValidAccessContext", sb2.toString(), null, false, 24, null);
        ServiceTransaction serviceTransaction3 = this.$transaction;
        AccessContext accessContext2 = this.$context;
        if (accessContext2 != null) {
            return Single.m38399b(new TransactionResult(serviceTransaction3, accessContext2));
        }
        Intrinsics.throwNpe();
        throw null;
    }
}
