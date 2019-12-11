package com.bamtech.sdk4.internal.device;

import com.bamtech.core.logging.LogDispatcher.DefaultImpls;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import kotlin.Metadata;
import p520io.reactivex.functions.C11945a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo31007d2 = {"<anonymous>", "", "run"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DeviceManager.kt */
final class DefaultDeviceManager$registerDevice$2 implements C11945a {
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultDeviceManager this$0;

    DefaultDeviceManager$registerDevice$2(DefaultDeviceManager defaultDeviceManager, ServiceTransaction serviceTransaction) {
        this.this$0 = defaultDeviceManager;
        this.$transaction = serviceTransaction;
    }

    public final void run() {
        DefaultImpls.d$default(this.$transaction, this.this$0, "DeviceRegistrationCancelled", false, 4, null);
    }
}
