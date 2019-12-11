package com.bamtech.sdk4.internal.device;

import com.bamtech.sdk4.internal.core.Storage;
import com.bamtech.sdk4.token.Grant;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "it", "Lcom/bamtech/sdk4/token/Grant;", "kotlin.jvm.PlatformType", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DeviceManager.kt */
final class DefaultDeviceManager$registerDevice$3<T> implements Consumer<Grant> {
    final /* synthetic */ DefaultDeviceManager this$0;

    DefaultDeviceManager$registerDevice$3(DefaultDeviceManager defaultDeviceManager) {
        this.this$0 = defaultDeviceManager;
    }

    public final void accept(Grant grant) {
        Storage access$getStorage$p = this.this$0.storage;
        C12880j.m40222a((Object) grant, "it");
        DeviceGrantKt.saveDeviceGrant(access$getStorage$p, grant);
    }
}
