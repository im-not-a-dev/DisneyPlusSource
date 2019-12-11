package com.bamtech.core.networking;

import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u001d\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0007J\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001d\u001a\u00020\u00172\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0017J\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00170\u001f2\u0006\u0010\u001d\u001a\u00020\u0017J\b\u0010 \u001a\u00020\u0017H\u0016R\u0015\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006!"}, mo31007d2 = {"Lcom/bamtech/core/networking/Response;", "OUT", "", "rawResponse", "Lokhttp3/Response;", "Lcom/bamtech/core/networking/OkResponse;", "body", "(Lokhttp3/Response;Ljava/lang/Object;)V", "getBody", "()Ljava/lang/Object;", "Ljava/lang/Object;", "code", "", "getCode", "()I", "headers", "Lokhttp3/Headers;", "getHeaders", "()Lokhttp3/Headers;", "isSuccessful", "", "()Z", "message", "", "getMessage", "()Ljava/lang/String;", "getRawResponse", "()Lokhttp3/Response;", "header", "name", "defaultValue", "", "toString", "networking"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: Response.kt */
public final class Response<OUT> {

    /* renamed from: a */
    private final okhttp3.Response f5869a;

    /* renamed from: b */
    private final OUT f5870b;

    public Response(okhttp3.Response response, OUT out) {
        this.f5869a = response;
        this.f5870b = out;
        this.f5869a.mo35863f();
        this.f5869a.mo35858c();
        C12880j.m40222a((Object) this.f5869a.mo35864g(), "rawResponse.message()");
        C12880j.m40222a((Object) this.f5869a.mo35862e(), "rawResponse.headers()");
    }

    /* renamed from: a */
    public final OUT mo7484a() {
        return this.f5870b;
    }

    /* renamed from: b */
    public final okhttp3.Response mo7485b() {
        return this.f5869a;
    }

    public String toString() {
        String response = this.f5869a.toString();
        C12880j.m40222a((Object) response, "rawResponse.toString()");
        return response;
    }

    public /* synthetic */ Response(okhttp3.Response response, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            obj = null;
        }
        this(response, obj);
    }
}
