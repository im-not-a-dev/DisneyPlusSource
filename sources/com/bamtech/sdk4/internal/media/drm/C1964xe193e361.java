package com.bamtech.sdk4.internal.media.drm;

import com.bamtech.core.networking.Request;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.telemetry.dust.DustConfigSettings;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, mo31007d2 = {"<anonymous>", "", "OUT", "it", "", "kotlin.jvm.PlatformType", "accept", "ServiceRequestExtensionsKt$toSingle$2"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtech.sdk4.internal.media.drm.DefaultWidevineDrmProvider$getWidevineCertificate$1$$special$$inlined$toSingle$3 */
/* compiled from: ServiceRequestExtensions.kt */
public final class C1964xe193e361<T> implements Consumer<Throwable> {
    final /* synthetic */ String $dustEvent;
    final /* synthetic */ Request $this_toSingle;
    final /* synthetic */ ServiceTransaction $transaction;

    public C1964xe193e361(Request request, ServiceTransaction serviceTransaction, String str) {
        this.$this_toSingle = request;
        this.$transaction = serviceTransaction;
        this.$dustEvent = str;
    }

    public final void accept(Throwable th) {
        ServiceTransaction serviceTransaction = this.$transaction;
        String str = this.$dustEvent;
        Intrinsics.checkReturnedValueIsNotNull((Object) th, "it");
        C1169c.m6004a(serviceTransaction, str, th, (DustConfigSettings) this.$this_toSingle.mo7480c());
    }
}
