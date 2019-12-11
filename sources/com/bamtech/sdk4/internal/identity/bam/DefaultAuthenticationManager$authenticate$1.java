package com.bamtech.sdk4.internal.identity.bam;

import com.bamtech.sdk4.identity.IdentityToken;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.service.InvalidStateException;
import com.bamtech.sdk4.service.InvalidStateException.Companion;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/SingleSource;", "Lcom/bamtech/sdk4/identity/IdentityToken;", "kotlin.jvm.PlatformType", "call"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: AuthenticationManager.kt */
final class DefaultAuthenticationManager$authenticate$1<V> implements Callable<SingleSource<? extends T>> {
    final /* synthetic */ String $email;
    final /* synthetic */ String $password;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultAuthenticationManager this$0;

    DefaultAuthenticationManager$authenticate$1(DefaultAuthenticationManager defaultAuthenticationManager, ServiceTransaction serviceTransaction, String str, String str2) {
        this.this$0 = defaultAuthenticationManager;
        this.$transaction = serviceTransaction;
        this.$email = str;
        this.$password = str2;
    }

    public final SingleSource<? extends IdentityToken> call() {
        Single single;
        synchronized (this.this$0) {
            if (this.this$0.authenticateProcess != null) {
                single = Single.m38395a((Throwable) Companion.create$default(InvalidStateException.Companion, this.$transaction.getId(), "concurrent.request.limit.exception", "Only one authentication request can be made at a time.  The first one must complete prior to issuing a second request.", null, 8, null));
            } else {
                this.this$0.authenticateProcess = this.this$0.releaseLockOnTerminate(this.this$0.authenticateTask(this.$transaction, new AuthenticationRequest(this.$email, this.$password)));
                single = this.this$0.authenticateProcess;
                if (single == null) {
                    C12880j.m40220a();
                    throw null;
                }
            }
        }
        return single;
    }
}
