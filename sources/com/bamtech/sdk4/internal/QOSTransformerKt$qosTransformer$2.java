package com.bamtech.sdk4.internal;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.service.NetworkException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.C12881k;
import okhttp3.Request;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0002\b\u0007"}, mo31007d2 = {"<anonymous>", "", "OUT", "throwable", "", "request", "Lokhttp3/Request;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: QOSTransformer.kt */
public final class QOSTransformerKt$qosTransformer$2 extends C12881k implements Function2 {
    final /* synthetic */ Function4 $qosCallback;
    final /* synthetic */ ServiceTransaction $transaction;

    public QOSTransformerKt$qosTransformer$2(ServiceTransaction serviceTransaction, Function4 function4) {
        this.$transaction = serviceTransaction;
        this.$qosCallback = function4;
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Throwable) obj, (Request) obj2);
        throw null;
    }

    public final Void invoke(Throwable th, Request request) {
        NetworkException networkException = new NetworkException(this.$transaction.getId(), null, th, 2, null);
        try {
            this.$qosCallback.invoke(null, networkException, request, null);
        } catch (Throwable unused) {
        }
        throw networkException;
    }
}
