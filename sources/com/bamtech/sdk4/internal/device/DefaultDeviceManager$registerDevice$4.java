package com.bamtech.sdk4.internal.device;

import com.bamtech.core.logging.LogLevel;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.service.ServiceTransaction.DefaultImpls;
import kotlin.Metadata;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DeviceManager.kt */
final class DefaultDeviceManager$registerDevice$4<T> implements Consumer<Throwable> {
    final /* synthetic */ ServiceTransaction $transaction;

    DefaultDeviceManager$registerDevice$4(ServiceTransaction serviceTransaction) {
        this.$transaction = serviceTransaction;
    }

    public final void accept(Throwable th) {
        DefaultImpls.logDust$default(this.$transaction, DeviceManagerKt.getDEVICE_REGISTER(), "urn:bamtech:dust:bamsdk:error:sdk", th, LogLevel.ERROR, false, 16, null);
    }
}
