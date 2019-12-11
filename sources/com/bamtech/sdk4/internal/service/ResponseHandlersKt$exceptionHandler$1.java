package com.bamtech.sdk4.internal.service;

import com.bamtech.core.networking.handlers.ResponseHandler;
import kotlin.Metadata;
import okhttp3.Response;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, mo31007d2 = {"com/bamtech/sdk4/internal/service/ResponseHandlersKt$exceptionHandler$1", "Lcom/bamtech/core/networking/handlers/ResponseHandler;", "", "canHandle", "", "response", "Lokhttp3/Response;", "handle", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ResponseHandlers.kt */
public final class ResponseHandlersKt$exceptionHandler$1 implements ResponseHandler<Throwable> {
    final /* synthetic */ ServiceTransaction $transaction;

    ResponseHandlersKt$exceptionHandler$1(ServiceTransaction serviceTransaction) {
        this.$transaction = serviceTransaction;
    }

    public boolean canHandle(Response response) {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0039, code lost:
        if (r0 != null) goto L_0x003e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Throwable handle(okhttp3.Response r6) {
        /*
            r5 = this;
            r0 = 524288(0x80000, double:2.590327E-318)
            okhttp3.y r0 = r6.mo35856a(r0)
            com.bamtech.sdk4.internal.service.ServiceTransaction r1 = r5.$transaction
            com.bamtech.core.networking.converters.Converter r1 = r1.getIdentityConverter()
            com.bamtech.sdk4.internal.service.ServiceErrorsResponse r1 = com.bamtech.sdk4.internal.service.ResponseHandlersKt.deserializeError(r1, r6)
            if (r1 == 0) goto L_0x0022
            java.util.List r2 = r1.getErrors()
            if (r2 == 0) goto L_0x0022
            boolean r2 = r2.isEmpty()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            goto L_0x0023
        L_0x0022:
            r2 = 0
        L_0x0023:
            if (r2 != 0) goto L_0x0052
            com.bamtech.sdk4.service.ServiceException$Companion r1 = com.bamtech.sdk4.service.ServiceException.Companion
            int r6 = r6.mo35858c()
            com.bamtech.sdk4.internal.service.ServiceTransaction r2 = r5.$transaction
            java.util.UUID r2 = r2.getId()
            com.bamtech.sdk4.internal.service.ServiceError r3 = new com.bamtech.sdk4.internal.service.ServiceError
            if (r0 == 0) goto L_0x003c
            java.lang.String r0 = r0.mo36279e()
            if (r0 == 0) goto L_0x003c
            goto L_0x003e
        L_0x003c:
            java.lang.String r0 = "Response body is missing."
        L_0x003e:
            java.lang.String r4 = "unknown-error"
            r3.<init>(r4, r0)
            java.util.List r0 = kotlin.p590y.C13183n.m40498a(r3)
            com.bamtech.sdk4.internal.service.ServiceTransaction r3 = r5.$transaction
            java.lang.Throwable r3 = r3.getSource()
            com.bamtech.sdk4.service.ServiceException r6 = r1.create(r6, r2, r0, r3)
            goto L_0x009d
        L_0x0052:
            r3 = 1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 == 0) goto L_0x0083
            com.bamtech.sdk4.service.ServiceException$Companion r1 = com.bamtech.sdk4.service.ServiceException.Companion
            int r6 = r6.mo35858c()
            com.bamtech.sdk4.internal.service.ServiceTransaction r2 = r5.$transaction
            java.util.UUID r2 = r2.getId()
            com.bamtech.sdk4.internal.service.ServiceError r3 = new com.bamtech.sdk4.internal.service.ServiceError
            java.lang.String r0 = r0.mo36279e()
            java.lang.String r4 = "error"
            r3.<init>(r4, r0)
            java.util.List r0 = kotlin.p590y.C13183n.m40498a(r3)
            com.bamtech.sdk4.internal.service.ServiceTransaction r3 = r5.$transaction
            java.lang.Throwable r3 = r3.getSource()
            com.bamtech.sdk4.service.ServiceException r6 = r1.create(r6, r2, r0, r3)
            goto L_0x009d
        L_0x0083:
            com.bamtech.sdk4.service.ServiceException$Companion r0 = com.bamtech.sdk4.service.ServiceException.Companion
            int r6 = r6.mo35858c()
            com.bamtech.sdk4.internal.service.ServiceTransaction r2 = r5.$transaction
            java.util.UUID r2 = r2.getId()
            java.util.List r1 = r1.getErrors()
            com.bamtech.sdk4.internal.service.ServiceTransaction r3 = r5.$transaction
            java.lang.Throwable r3 = r3.getSource()
            com.bamtech.sdk4.service.ServiceException r6 = r0.create(r6, r2, r1, r3)
        L_0x009d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.service.ResponseHandlersKt$exceptionHandler$1.handle(okhttp3.Response):java.lang.Throwable");
    }
}
