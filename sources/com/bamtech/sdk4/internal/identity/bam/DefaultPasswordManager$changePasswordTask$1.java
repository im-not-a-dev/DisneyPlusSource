package com.bamtech.sdk4.internal.identity.bam;

import com.bamtech.core.logging.LogDispatcher.DefaultImpls;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import kotlin.Metadata;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: PasswordManager.kt */
final class DefaultPasswordManager$changePasswordTask$1<T> implements Consumer<Throwable> {
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultPasswordManager this$0;

    DefaultPasswordManager$changePasswordTask$1(DefaultPasswordManager defaultPasswordManager, ServiceTransaction serviceTransaction) {
        this.this$0 = defaultPasswordManager;
        this.$transaction = serviceTransaction;
    }

    public final void accept(Throwable th) {
        DefaultImpls.log$default(this.$transaction, this.this$0, "LoginError", th.getMessage(), null, false, 24, null);
        this.this$0.tokenTask = null;
    }
}
