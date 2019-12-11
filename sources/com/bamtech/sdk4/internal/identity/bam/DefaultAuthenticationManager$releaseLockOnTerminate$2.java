package com.bamtech.sdk4.internal.identity.bam;

import kotlin.Metadata;
import p520io.reactivex.functions.C11945a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, mo31007d2 = {"<anonymous>", "", "T", "run"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: AuthenticationManager.kt */
final class DefaultAuthenticationManager$releaseLockOnTerminate$2 implements C11945a {
    final /* synthetic */ DefaultAuthenticationManager$releaseLockOnTerminate$1 $cleanUp$1;

    DefaultAuthenticationManager$releaseLockOnTerminate$2(DefaultAuthenticationManager$releaseLockOnTerminate$1 defaultAuthenticationManager$releaseLockOnTerminate$1) {
        this.$cleanUp$1 = defaultAuthenticationManager$releaseLockOnTerminate$1;
    }

    public final void run() {
        this.$cleanUp$1.invoke();
    }
}
