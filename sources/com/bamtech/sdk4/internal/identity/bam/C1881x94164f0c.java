package com.bamtech.sdk4.internal.identity.bam;

import com.bamtech.core.logging.LogDispatcher.DefaultImpls;
import kotlin.Metadata;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, mo31007d2 = {"<anonymous>", "", "T", "it", "", "kotlin.jvm.PlatformType", "accept", "com/bamtech/sdk4/internal/identity/bam/DefaultAuthenticationManager$create$1$1$2"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtech.sdk4.internal.identity.bam.DefaultAuthenticationManager$create$1$$special$$inlined$synchronized$lambda$2 */
/* compiled from: AuthenticationManager.kt */
final class C1881x94164f0c<T> implements Consumer<Throwable> {
    final /* synthetic */ DefaultAuthenticationManager$create$1 this$0;

    C1881x94164f0c(DefaultAuthenticationManager$create$1 defaultAuthenticationManager$create$1) {
        this.this$0 = defaultAuthenticationManager$create$1;
    }

    public final void accept(Throwable th) {
        DefaultAuthenticationManager$create$1 defaultAuthenticationManager$create$1 = this.this$0;
        DefaultImpls.log$default(defaultAuthenticationManager$create$1.$transaction, defaultAuthenticationManager$create$1.this$0, "AccountCreationError", th.getMessage(), null, false, 24, null);
    }
}
