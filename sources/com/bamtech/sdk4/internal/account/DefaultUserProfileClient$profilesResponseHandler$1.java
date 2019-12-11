package com.bamtech.sdk4.internal.account;

import com.bamtech.core.networking.converters.Converter;
import com.bamtech.core.networking.handlers.ResponseHandler;
import com.bamtech.sdk4.internal.service.ResponseHandlersKt;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.service.InvalidStateException;
import com.facebook.stetho.server.http.HttpStatus;
import kotlin.Metadata;
import okhttp3.Response;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0015\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¢\u0006\u0002\u0010\u0007¨\u0006\b"}, mo31007d2 = {"com/bamtech/sdk4/internal/account/DefaultUserProfileClient$profilesResponseHandler$1", "Lcom/bamtech/core/networking/handlers/ResponseHandler;", "canHandle", "", "response", "Lokhttp3/Response;", "handle", "(Lokhttp3/Response;)Ljava/lang/Object;", "extension-account"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: UserProfileClient.kt */
public final class DefaultUserProfileClient$profilesResponseHandler$1 implements ResponseHandler<T> {
    final /* synthetic */ Converter $converter;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ Class $type;

    DefaultUserProfileClient$profilesResponseHandler$1(Converter converter, Class cls, ServiceTransaction serviceTransaction) {
        this.$converter = converter;
        this.$type = cls;
        this.$transaction = serviceTransaction;
    }

    public boolean canHandle(Response response) {
        return C13185o.m40520c(Integer.valueOf(HttpStatus.HTTP_OK), Integer.valueOf(201)).contains(Integer.valueOf(response.mo35858c()));
    }

    public T handle(Response response) {
        int c = response.mo35858c();
        if (c == 200 || c == 201) {
            return ResponseHandlersKt.responseBodyHandler(this.$converter, this.$type).invoke(response);
        }
        InvalidStateException invalidStateException = new InvalidStateException(this.$transaction.getId(), null, null, 6, null);
        throw invalidStateException;
    }
}
