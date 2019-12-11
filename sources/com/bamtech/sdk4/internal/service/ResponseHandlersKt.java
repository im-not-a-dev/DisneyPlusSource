package com.bamtech.sdk4.internal.service;

import com.bamtech.core.networking.converters.Converter;
import com.bamtech.core.networking.handlers.ResponseHandler;
import java.io.File;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import okhttp3.Response;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u001a\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n\u001a\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e\u001a\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0006\u0010\t\u001a\u00020\n\u001a%\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u00120\u0011\"\u0006\b\u0000\u0010\u0012\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\b\u001a.\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u00120\u0011\"\u0004\b\u0000\u0010\u00122\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0014\u001a\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0007\"\u0006\b\u0000\u0010\u0012\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\b\u001aD\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0017\"\u0006\b\u0000\u0010\u0012\u0018\u00012\u0006\u0010\t\u001a\u00020\n2\u001e\u0010\u0018\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u00120\u00070\u0019\"\b\u0012\u0004\u0012\u0002H\u00120\u0007H\b¢\u0006\u0002\u0010\u001a¨\u0006\u001b"}, mo31007d2 = {"deserializeError", "Lcom/bamtech/sdk4/internal/service/ServiceErrorsResponse;", "converter", "Lcom/bamtech/core/networking/converters/Converter;", "response", "Lokhttp3/Response;", "exceptionHandler", "Lcom/bamtech/core/networking/handlers/ResponseHandler;", "", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "fileResponseHandler", "", "filePath", "Ljava/io/File;", "noOpResponseHandler", "responseBodyHandler", "Lkotlin/Function1;", "OUT", "type", "Ljava/lang/Class;", "responseHandler", "responseTransformer", "Lcom/bamtech/core/networking/handlers/DefaultResponseTransformer;", "responseHandlers", "", "(Lcom/bamtech/sdk4/internal/service/ServiceTransaction;[Lcom/bamtech/core/networking/handlers/ResponseHandler;)Lcom/bamtech/core/networking/handlers/DefaultResponseTransformer;", "sdk-service"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* compiled from: ResponseHandlers.kt */
public final class ResponseHandlersKt {
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0027 A[Catch:{ all -> 0x003b }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0028 A[Catch:{ all -> 0x003b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.bamtech.sdk4.internal.service.ServiceErrorsResponse deserializeError(com.bamtech.core.networking.converters.Converter r5, okhttp3.Response r6) {
        /*
            if (r6 == 0) goto L_0x004e
            r0 = 0
            r1 = 1
            okhttp3.y r2 = r6.mo35855a()     // Catch:{ all -> 0x003b }
            if (r2 == 0) goto L_0x004e
            r3 = 524288(0x80000, double:2.590327E-318)
            okhttp3.y r6 = r6.mo35856a(r3)     // Catch:{ all -> 0x003b }
            if (r6 == 0) goto L_0x002e
            java.lang.String r6 = r6.mo36279e()     // Catch:{ all -> 0x003b }
            if (r6 == 0) goto L_0x002e
            if (r6 == 0) goto L_0x0024
            boolean r6 = kotlin.p588j0.C12832w.m40118a(r6)     // Catch:{ all -> 0x003b }
            if (r6 == 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r6 = 0
            goto L_0x0025
        L_0x0024:
            r6 = 1
        L_0x0025:
            if (r6 == r1) goto L_0x0028
            goto L_0x002e
        L_0x0028:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException     // Catch:{ all -> 0x003b }
            r5.<init>()     // Catch:{ all -> 0x003b }
            throw r5     // Catch:{ all -> 0x003b }
        L_0x002e:
            okio.BufferedSource r6 = r2.mo35703d()     // Catch:{ all -> 0x003b }
            java.lang.Class<com.bamtech.sdk4.internal.service.ServiceErrorsResponse> r2 = com.bamtech.sdk4.internal.service.ServiceErrorsResponse.class
            java.lang.Object r5 = r5.mo7496a(r6, r2)     // Catch:{ all -> 0x003b }
            com.bamtech.sdk4.internal.service.ServiceErrorsResponse r5 = (com.bamtech.sdk4.internal.service.ServiceErrorsResponse) r5     // Catch:{ all -> 0x003b }
            goto L_0x004f
        L_0x003b:
            com.bamtech.sdk4.internal.service.ServiceErrorsResponse r5 = new com.bamtech.sdk4.internal.service.ServiceErrorsResponse
            com.bamtech.sdk4.service.ErrorReason[] r6 = new com.bamtech.sdk4.service.ErrorReason[r1]
            com.bamtech.sdk4.internal.service.ServiceError r1 = new com.bamtech.sdk4.internal.service.ServiceError
            java.lang.String r2 = "unknown-error"
            java.lang.String r3 = "The service returned an unexpected error response."
            r1.<init>(r2, r3)
            r6[r0] = r1
            r5.<init>(r6)
            goto L_0x004f
        L_0x004e:
            r5 = 0
        L_0x004f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.service.ResponseHandlersKt.deserializeError(com.bamtech.core.networking.converters.Converter, okhttp3.Response):com.bamtech.sdk4.internal.service.ServiceErrorsResponse");
    }

    public static final ResponseHandler<Throwable> exceptionHandler(ServiceTransaction serviceTransaction) {
        return new ResponseHandlersKt$exceptionHandler$1(serviceTransaction);
    }

    public static final ResponseHandler<C13145v> fileResponseHandler(ServiceTransaction serviceTransaction, File file) {
        return new ResponseHandlersKt$fileResponseHandler$1(serviceTransaction, file);
    }

    public static final ResponseHandler<C13145v> noOpResponseHandler(ServiceTransaction serviceTransaction) {
        return new ResponseHandlersKt$noOpResponseHandler$1(serviceTransaction);
    }

    public static final <OUT> Function1<Response, OUT> responseBodyHandler(Converter converter, Class<OUT> cls) {
        return new ResponseHandlersKt$responseBodyHandler$2(converter, cls);
    }
}
