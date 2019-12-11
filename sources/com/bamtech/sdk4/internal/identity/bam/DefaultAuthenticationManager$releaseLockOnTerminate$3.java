package com.bamtech.sdk4.internal.identity.bam;

import kotlin.Metadata;
import p520io.reactivex.functions.C11946b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo31007d2 = {"<anonymous>", "", "T", "<anonymous parameter 0>", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "accept", "(Ljava/lang/Object;Ljava/lang/Throwable;)V"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: AuthenticationManager.kt */
final class DefaultAuthenticationManager$releaseLockOnTerminate$3<T1, T2> implements C11946b<T, Throwable> {
    final /* synthetic */ DefaultAuthenticationManager$releaseLockOnTerminate$1 $cleanUp$1;

    DefaultAuthenticationManager$releaseLockOnTerminate$3(DefaultAuthenticationManager$releaseLockOnTerminate$1 defaultAuthenticationManager$releaseLockOnTerminate$1) {
        this.$cleanUp$1 = defaultAuthenticationManager$releaseLockOnTerminate$1;
    }

    public final void accept(T t, Throwable th) {
        this.$cleanUp$1.invoke();
    }
}
