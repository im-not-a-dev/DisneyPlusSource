package com.bamtech.sdk4.internal.account;

import com.bamtech.core.networking.handlers.ResponseHandler;
import com.bamtech.sdk4.account.Account;
import com.bamtech.sdk4.internal.service.ResponseHandlersKt;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import okhttp3.Response;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "Lcom/bamtech/core/networking/Response;", "Lcom/bamtech/sdk4/account/Account;", "response", "Lokhttp3/Response;", "Lcom/bamtech/core/networking/OkResponse;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: GetAccountClient.kt */
final class DefaultGetAccountClient$accountResponseTransformer$1 extends C12881k implements Function1<Response, com.bamtech.core.networking.Response<? extends Account>> {
    final /* synthetic */ ResponseHandler[] $responseHandlers;
    final /* synthetic */ ServiceTransaction $transaction;

    DefaultGetAccountClient$accountResponseTransformer$1(ResponseHandler[] responseHandlerArr, ServiceTransaction serviceTransaction) {
        this.$responseHandlers = responseHandlerArr;
        this.$transaction = serviceTransaction;
        super(1);
    }

    public final com.bamtech.core.networking.Response<Account> invoke(Response response) {
        ResponseHandler responseHandler;
        ResponseHandler[] responseHandlerArr = this.$responseHandlers;
        int length = responseHandlerArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                responseHandler = null;
                break;
            }
            responseHandler = responseHandlerArr[i];
            if (responseHandler.canHandle(response)) {
                break;
            }
            i++;
        }
        if (responseHandler != null) {
            return new com.bamtech.core.networking.Response<>(response, responseHandler.handle(response));
        }
        throw ((Throwable) ResponseHandlersKt.exceptionHandler(this.$transaction).handle(response));
    }
}
