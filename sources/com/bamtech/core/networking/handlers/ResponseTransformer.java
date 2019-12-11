package com.bamtech.core.networking.handlers;

import com.bamtech.core.networking.Response;
import kotlin.Metadata;
import okhttp3.Request;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, mo31007d2 = {"Lcom/bamtech/core/networking/handlers/ResponseTransformer;", "OUT", "", "handleException", "Lcom/bamtech/core/networking/Response;", "e", "", "request", "Lokhttp3/Request;", "transform", "response", "Lokhttp3/Response;", "networking"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ResponseTransformer.kt */
public interface ResponseTransformer<OUT> {
    /* renamed from: a */
    Response<OUT> mo7524a(Throwable th, Request request);

    /* renamed from: a */
    Response<OUT> mo7525a(okhttp3.Response response);
}
