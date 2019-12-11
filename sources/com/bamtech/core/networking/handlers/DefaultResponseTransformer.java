package com.bamtech.core.networking.handlers;

import com.bamtech.core.networking.Response;
import kotlin.C12730d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.Request;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00040\u0003BI\u0012\u001c\u0010\u0005\u001a\u0018\u0012\b\u0012\u00060\u0007j\u0002`\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0006\u0012$\b\u0002\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0018\u00010\n¢\u0006\u0002\u0010\rJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0012\u001a\u00020\u0007H\u0016R*\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0018\u00010\nX\u0004¢\u0006\u0002\n\u0000R$\u0010\u0005\u001a\u0018\u0012\b\u0012\u00060\u0007j\u0002`\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, mo31007d2 = {"Lcom/bamtech/core/networking/handlers/DefaultResponseTransformer;", "OUT", "Lcom/bamtech/core/networking/handlers/ResponseTransformer;", "Lkotlin/Function;", "Lcom/bamtech/core/networking/Response;", "responseBlock", "Lkotlin/Function1;", "Lokhttp3/Response;", "Lcom/bamtech/core/networking/OkResponse;", "exceptionBlock", "Lkotlin/Function2;", "", "Lokhttp3/Request;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "handleException", "e", "request", "transform", "response", "networking"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ResponseTransformer.kt */
public final class DefaultResponseTransformer<OUT> implements ResponseTransformer<OUT>, C12730d<Response<? extends OUT>> {

    /* renamed from: U */
    private final Function2<Throwable, Request, Response<OUT>> f5889U;

    /* renamed from: c */
    private final Function1<okhttp3.Response, Response<OUT>> f5890c;

    public DefaultResponseTransformer(Function1<? super okhttp3.Response, ? extends Response<? extends OUT>> function1, Function2<? super Throwable, ? super Request, ? extends Response<? extends OUT>> function2) {
        this.f5890c = function1;
        this.f5889U = function2;
    }

    /* renamed from: a */
    public Response<OUT> mo7525a(okhttp3.Response response) {
        return (Response) this.f5890c.invoke(response);
    }

    /* renamed from: a */
    public Response<OUT> mo7524a(Throwable th, Request request) {
        Function2<Throwable, Request, Response<OUT>> function2 = this.f5889U;
        if (function2 != null) {
            Response<OUT> response = (Response) function2.invoke(th, request);
            if (response != null) {
                return response;
            }
        }
        throw th;
    }
}
