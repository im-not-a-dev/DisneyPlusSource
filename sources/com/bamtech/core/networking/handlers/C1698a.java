package com.bamtech.core.networking.handlers;

import com.bamtech.core.networking.C1690d;
import com.bamtech.core.networking.Response;
import kotlin.Metadata;
import okhttp3.Request;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u001a<\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u001e\u0010\u0003\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004\"\b\u0012\u0004\u0012\u0002H\u00020\u0005H\b¢\u0006\u0002\u0010\u0006\u001a\u0012\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\"\u0004\b\u0000\u0010\n¨\u0006\u000b"}, mo31007d2 = {"defaultResponseTransformer", "Lcom/bamtech/core/networking/handlers/DefaultResponseTransformer;", "OUT", "responseHandlers", "", "Lcom/bamtech/core/networking/handlers/ResponseHandler;", "([Lcom/bamtech/core/networking/handlers/ResponseHandler;)Lcom/bamtech/core/networking/handlers/DefaultResponseTransformer;", "noOpResponseTransformer", "Lcom/bamtech/core/networking/handlers/ResponseTransformer;", "", "Unit", "networking"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtech.core.networking.handlers.a */
/* compiled from: ResponseTransformer.kt */
public final class C1698a {

    /* renamed from: com.bamtech.core.networking.handlers.a$a */
    /* compiled from: ResponseTransformer.kt */
    public static final class C1699a implements ResponseTransformer {
        C1699a() {
        }

        /* renamed from: a */
        public Response mo7525a(okhttp3.Response response) {
            return new Response(response, null, 2, null);
        }

        /* renamed from: a */
        public Response mo7524a(Throwable th, Request request) {
            throw new C1690d(null, th, 1, null);
        }
    }

    /* renamed from: a */
    public static final <Unit> ResponseTransformer m7811a() {
        return new C1699a();
    }
}
