package com.bamtech.sdk4.internal.paywall;

import kotlin.Metadata;
import okhttp3.Call;
import p520io.reactivex.functions.C11945a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0006"}, mo31007d2 = {"<anonymous>", "", "OUT", "EXTRA", "run", "com/bamtech/core/networking/ReactiveExtensionsKt$asSingle$1", "ServiceRequestExtensionsKt$toSingle$$inlined$asSingle$1"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: ReactiveExtensions.kt */
public final class DefaultPaywallClient$getPaywall$2$$special$$inlined$toSingle$1 implements C11945a {
    final /* synthetic */ Call $call;

    public DefaultPaywallClient$getPaywall$2$$special$$inlined$toSingle$1(Call call) {
        this.$call = call;
    }

    public final void run() {
        this.$call.cancel();
    }
}
