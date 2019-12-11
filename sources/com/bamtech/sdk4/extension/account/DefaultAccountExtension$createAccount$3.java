package com.bamtech.sdk4.extension.account;

import com.bamtech.core.logging.LogDispatcher.DefaultImpls;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import kotlin.Metadata;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "", "T", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: AccountExtension.kt */
final class DefaultAccountExtension$createAccount$3<T> implements Consumer<Throwable> {
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultAccountExtension this$0;

    DefaultAccountExtension$createAccount$3(DefaultAccountExtension defaultAccountExtension, ServiceTransaction serviceTransaction) {
        this.this$0 = defaultAccountExtension;
        this.$transaction = serviceTransaction;
    }

    public final void accept(Throwable th) {
        DefaultImpls.log$default(this.$transaction, this.this$0, "CreateAccountFailed", th.toString(), null, false, 24, null);
    }
}
