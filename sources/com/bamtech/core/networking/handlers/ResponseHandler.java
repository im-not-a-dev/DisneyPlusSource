package com.bamtech.core.networking.handlers;

import kotlin.Metadata;
import okhttp3.Response;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H&J\u0019\u0010\b\u001a\u00028\u00002\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H&¢\u0006\u0002\u0010\t¨\u0006\n"}, mo31007d2 = {"Lcom/bamtech/core/networking/handlers/ResponseHandler;", "OUT", "", "canHandle", "", "response", "Lokhttp3/Response;", "Lcom/bamtech/core/networking/OkResponse;", "handle", "(Lokhttp3/Response;)Ljava/lang/Object;", "networking"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ResponseHandler.kt */
public interface ResponseHandler<OUT> {
    boolean canHandle(Response response);

    OUT handle(Response response);
}
