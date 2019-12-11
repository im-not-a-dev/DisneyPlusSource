package com.bamtech.sdk4.internal.account;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.service.NetworkException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12881k;
import okhttp3.Request;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, mo31007d2 = {"<anonymous>", "", "OUT", "throwable", "", "request", "Lokhttp3/Request;", "invoke", "com/bamtech/sdk4/internal/service/ResponseHandlersKt$responseTransformer$2"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtech.sdk4.internal.account.DefaultUserProfileClient$updateUserProfile$2$$special$$inlined$responseTransformer$2 */
/* compiled from: ResponseHandlers.kt */
public final class C1824x5de75afb extends C12881k implements Function2 {
    final /* synthetic */ ServiceTransaction $transaction;

    public C1824x5de75afb(ServiceTransaction serviceTransaction) {
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
