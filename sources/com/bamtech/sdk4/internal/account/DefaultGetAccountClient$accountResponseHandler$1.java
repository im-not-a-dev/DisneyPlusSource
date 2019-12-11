package com.bamtech.sdk4.internal.account;

import com.bamtech.core.networking.converters.Converter;
import com.bamtech.core.networking.handlers.ResponseHandler;
import com.bamtech.sdk4.account.Account;
import com.bamtech.sdk4.internal.service.ResponseHandlersKt;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.service.InvalidStateException;
import kotlin.Metadata;
import okhttp3.Response;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, mo31007d2 = {"com/bamtech/sdk4/internal/account/DefaultGetAccountClient$accountResponseHandler$1", "Lcom/bamtech/core/networking/handlers/ResponseHandler;", "Lcom/bamtech/sdk4/account/Account;", "canHandle", "", "response", "Lokhttp3/Response;", "handle", "extension-account"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: GetAccountClient.kt */
public final class DefaultGetAccountClient$accountResponseHandler$1 implements ResponseHandler<Account> {
    final /* synthetic */ Converter $converter;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ Class $type;

    DefaultGetAccountClient$accountResponseHandler$1(Converter converter, Class cls, ServiceTransaction serviceTransaction) {
        this.$converter = converter;
        this.$type = cls;
        this.$transaction = serviceTransaction;
    }

    public boolean canHandle(Response response) {
        return response.mo35858c() == 200;
    }

    public Account handle(Response response) {
        if (response.mo35858c() == 200) {
            return (Account) ResponseHandlersKt.responseBodyHandler(this.$converter, this.$type).invoke(response);
        }
        InvalidStateException invalidStateException = new InvalidStateException(this.$transaction.getId(), null, null, 6, null);
        throw invalidStateException;
    }
}
