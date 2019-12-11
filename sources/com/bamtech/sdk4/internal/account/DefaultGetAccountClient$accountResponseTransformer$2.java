package com.bamtech.sdk4.internal.account;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.service.NetworkException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12881k;
import okhttp3.Request;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "", "throwable", "", "<anonymous parameter 1>", "Lokhttp3/Request;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: GetAccountClient.kt */
final class DefaultGetAccountClient$accountResponseTransformer$2 extends C12881k implements Function2 {
    final /* synthetic */ ServiceTransaction $transaction;

    DefaultGetAccountClient$accountResponseTransformer$2(ServiceTransaction serviceTransaction) {
        this.$transaction = serviceTransaction;
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Throwable) obj, (Request) obj2);
        throw null;
    }

    public final Void invoke(Throwable th, Request request) {
        NetworkException networkException = new NetworkException(this.$transaction.getId(), null, th, 2, null);
        throw networkException;
    }
}
