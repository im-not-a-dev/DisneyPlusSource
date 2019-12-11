package com.bamtech.sdk4.extension.account;

import com.bamtech.core.logging.LogDispatcher.DefaultImpls;
import com.bamtech.sdk4.account.Account;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import kotlin.C12907r;
import kotlin.Metadata;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u0001H\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00042\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\n¢\u0006\u0002\b\b"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "T", "kotlin.jvm.PlatformType", "Lcom/bamtech/sdk4/account/Account;", "it", "", "Lcom/bamtech/sdk4/core/types/JWT;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: AccountExtension.kt */
final class DefaultAccountExtension$getAccount$1<T, R> implements Function<T, SingleSource<? extends R>> {
    final /* synthetic */ Class $accountType;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultAccountExtension this$0;

    DefaultAccountExtension$getAccount$1(DefaultAccountExtension defaultAccountExtension, ServiceTransaction serviceTransaction, Class cls) {
        this.this$0 = defaultAccountExtension;
        this.$transaction = serviceTransaction;
        this.$accountType = cls;
    }

    public final Single<T> apply(String str) {
        ServiceTransaction serviceTransaction = this.$transaction;
        DefaultAccountExtension defaultAccountExtension = this.this$0;
        StringBuilder sb = new StringBuilder();
        sb.append("TransactionId: ");
        sb.append(this.$transaction.getId());
        DefaultImpls.log$default(serviceTransaction, defaultAccountExtension, "AccountRequested", sb.toString(), null, false, 24, null);
        return this.this$0.client.getAccount(this.$transaction, C13170i0.m40332a(C12907r.m40244a("{accessToken}", str)), this.$accountType).mo30233g(new Function<T, R>(this) {
            final /* synthetic */ DefaultAccountExtension$getAccount$1 this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                Account account = (Account) obj;
                apply(account);
                return account;
            }

            public final T apply(Account account) {
                DefaultAccountExtension$getAccount$1 defaultAccountExtension$getAccount$1 = this.this$0;
                ServiceTransaction serviceTransaction = defaultAccountExtension$getAccount$1.$transaction;
                DefaultAccountExtension defaultAccountExtension = defaultAccountExtension$getAccount$1.this$0;
                StringBuilder sb = new StringBuilder();
                sb.append("TransactionId: ");
                sb.append(this.this$0.$transaction.getId());
                DefaultImpls.log$default(serviceTransaction, defaultAccountExtension, "AccountRetrieved", sb.toString(), null, false, 24, null);
                return account;
            }
        });
    }
}
