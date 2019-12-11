package com.bamtech.sdk4.internal.telemetry.dust;

import com.bamtech.core.logging.LogLevel;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.service.ServiceTransaction.DefaultImpls;
import kotlin.Metadata;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "it", "Lio/reactivex/disposables/Disposable;", "kotlin.jvm.PlatformType", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DustExtensions.kt */
final class DustExtensionsKt$withDust$1<T> implements Consumer<Disposable> {
    final /* synthetic */ Object $data;
    final /* synthetic */ String $event;
    final /* synthetic */ ServiceTransaction $transaction;

    DustExtensionsKt$withDust$1(ServiceTransaction serviceTransaction, String str, Object obj) {
        this.$transaction = serviceTransaction;
        this.$event = str;
        this.$data = obj;
    }

    public final void accept(Disposable disposable) {
        DefaultImpls.logDust$default(this.$transaction, this.$event, "urn:bamtech:dust:bamsdk:event:sdk", this.$data, LogLevel.INFO, false, 16, null);
    }
}
