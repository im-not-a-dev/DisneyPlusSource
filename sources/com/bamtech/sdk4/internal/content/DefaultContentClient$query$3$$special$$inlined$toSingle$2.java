package com.bamtech.sdk4.internal.content;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import kotlin.Metadata;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, mo31007d2 = {"<anonymous>", "", "OUT", "it", "Lio/reactivex/disposables/Disposable;", "kotlin.jvm.PlatformType", "accept", "ServiceRequestExtensionsKt$toSingle$1"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: ServiceRequestExtensions.kt */
public final class DefaultContentClient$query$3$$special$$inlined$toSingle$2<T> implements Consumer<Disposable> {
    final /* synthetic */ String $dustEvent;
    final /* synthetic */ ServiceTransaction $transaction;

    public DefaultContentClient$query$3$$special$$inlined$toSingle$2(ServiceTransaction serviceTransaction, String str) {
        this.$transaction = serviceTransaction;
        this.$dustEvent = str;
    }

    public final void accept(Disposable disposable) {
        C1169c.m6003a(this.$transaction, this.$dustEvent);
    }
}
