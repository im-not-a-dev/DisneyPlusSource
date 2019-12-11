package com.bamtech.sdk4.internal.identity.bam;

import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, mo31007d2 = {"cleanUp", "", "T", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: AuthenticationManager.kt */
final class DefaultAuthenticationManager$releaseLockOnTerminate$1 extends C12881k implements Function0<C13145v> {
    final /* synthetic */ Single $this_releaseLockOnTerminate;
    final /* synthetic */ DefaultAuthenticationManager this$0;

    DefaultAuthenticationManager$releaseLockOnTerminate$1(DefaultAuthenticationManager defaultAuthenticationManager, Single single) {
        this.this$0 = defaultAuthenticationManager;
        this.$this_releaseLockOnTerminate = single;
        super(0);
    }

    public final void invoke() {
        synchronized (this.$this_releaseLockOnTerminate) {
            this.this$0.authenticateProcess = null;
            C13145v vVar = C13145v.f29587a;
        }
    }
}
