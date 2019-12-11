package com.bamtech.sdk4.internal.telemetry.dust;

import com.bamtech.core.logging.LogLevel;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.service.ServiceTransaction.DefaultImpls;
import com.bamtech.sdk4.service.ServiceException;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.Pair;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DustExtensions.kt */
final class DustExtensionsKt$withDust$2<T> implements Consumer<Throwable> {
    final /* synthetic */ Object $data;
    final /* synthetic */ String $event;
    final /* synthetic */ ServiceTransaction $transaction;

    DustExtensionsKt$withDust$2(Object obj, ServiceTransaction serviceTransaction, String str) {
        this.$data = obj;
        this.$transaction = serviceTransaction;
        this.$event = str;
    }

    public final void accept(Throwable th) {
        Pair[] pairArr = new Pair[2];
        pairArr[0] = C12907r.m40244a("eventData", this.$data);
        if (!(th instanceof ServiceException)) {
            th = null;
        }
        pairArr[1] = C12907r.m40244a("error", (ServiceException) th);
        String str = "urn:bamtech:dust:bamsdk:error:sdk";
        DefaultImpls.logDust$default(this.$transaction, this.$event, str, C13173j0.m40356a(pairArr), LogLevel.ERROR, false, 16, null);
    }
}
