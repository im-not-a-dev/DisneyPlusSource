package com.bamtech.sdk4.internal.account;

import com.bamtech.core.networking.handlers.ResponseHandler;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.service.InvalidStateException;
import kotlin.Metadata;
import okhttp3.Response;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0015\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¢\u0006\u0002\u0010\u0007¨\u0006\b"}, mo31007d2 = {"com/bamtech/sdk4/internal/account/DefaultUserProfileClient$refreshHeaderHandler$1", "Lcom/bamtech/core/networking/handlers/ResponseHandler;", "", "canHandle", "response", "Lokhttp3/Response;", "handle", "(Lokhttp3/Response;)Ljava/lang/Boolean;", "extension-account"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: UserProfileClient.kt */
public final class DefaultUserProfileClient$refreshHeaderHandler$1 implements ResponseHandler<Boolean> {
    final /* synthetic */ ServiceTransaction $transaction;

    DefaultUserProfileClient$refreshHeaderHandler$1(ServiceTransaction serviceTransaction) {
        this.$transaction = serviceTransaction;
    }

    public boolean canHandle(Response response) {
        return response.mo35863f();
    }

    public Boolean handle(Response response) {
        if (response.mo35863f()) {
            String e = response.mo35861e("X-BAMTech-Refresh-Access-Token");
            return Boolean.valueOf(e != null ? Boolean.parseBoolean(e) : false);
        }
        InvalidStateException invalidStateException = new InvalidStateException(this.$transaction.getId(), null, null, 6, null);
        throw invalidStateException;
    }
}
