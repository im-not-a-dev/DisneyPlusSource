package com.bamtech.sdk4.internal.token;

import com.bamtech.core.networking.handlers.ResponseHandler;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import kotlin.Metadata;
import okhttp3.Response;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, mo31007d2 = {"com/bamtech/sdk4/internal/token/DefaultTokenClient$errorResponseHandler$1", "Lcom/bamtech/core/networking/handlers/ResponseHandler;", "", "canHandle", "", "response", "Lokhttp3/Response;", "handle", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: TokenClient.kt */
public final class DefaultTokenClient$errorResponseHandler$1 implements ResponseHandler {
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultTokenClient this$0;

    DefaultTokenClient$errorResponseHandler$1(DefaultTokenClient defaultTokenClient, ServiceTransaction serviceTransaction) {
        this.this$0 = defaultTokenClient;
        this.$transaction = serviceTransaction;
    }

    public boolean canHandle(Response response) {
        return response.mo35858c() == 400;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00bf, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00c0, code lost:
        kotlin.p580c0.C12724b.m39863a(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c3, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Void handle(okhttp3.Response r6) {
        /*
            r5 = this;
            okhttp3.y r0 = r6.mo35855a()     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r0.mo36279e()     // Catch:{ all -> 0x00bd }
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            com.bamtech.sdk4.internal.token.DefaultTokenClient r1 = r5.this$0     // Catch:{ all -> 0x00bd }
            com.bamtech.sdk4.internal.networking.ConverterProvider r1 = r1.converters     // Catch:{ all -> 0x00bd }
            com.bamtech.core.networking.converters.Converter r1 = r1.getSnake()     // Catch:{ all -> 0x00bd }
            java.lang.Class<com.bamtech.sdk4.internal.token.TokenExchangeErrorResponse> r2 = com.bamtech.sdk4.internal.token.TokenExchangeErrorResponse.class
            java.lang.Object r1 = r1.mo7495a(r0, r2)     // Catch:{ all -> 0x00bd }
            com.bamtech.sdk4.internal.token.TokenExchangeErrorResponse r1 = (com.bamtech.sdk4.internal.token.TokenExchangeErrorResponse) r1     // Catch:{ all -> 0x00bd }
            if (r1 == 0) goto L_0x004c
            com.bamtech.sdk4.internal.token.DefaultTokenClient r2 = r5.this$0     // Catch:{ all -> 0x00bd }
            boolean r2 = r2.isTokenExpired$sdk_core_api_release(r1)     // Catch:{ all -> 0x00bd }
            if (r2 != 0) goto L_0x0029
            goto L_0x004c
        L_0x0029:
            com.bamtech.sdk4.service.UnauthorizedException r0 = new com.bamtech.sdk4.service.UnauthorizedException     // Catch:{ all -> 0x00bd }
            com.bamtech.sdk4.internal.service.ServiceTransaction r2 = r5.$transaction     // Catch:{ all -> 0x00bd }
            java.util.UUID r2 = r2.getId()     // Catch:{ all -> 0x00bd }
            com.bamtech.sdk4.internal.service.ServiceError r3 = new com.bamtech.sdk4.internal.service.ServiceError     // Catch:{ all -> 0x00bd }
            java.lang.String r4 = r1.getError()     // Catch:{ all -> 0x00bd }
            java.lang.String r1 = r1.getError_description()     // Catch:{ all -> 0x00bd }
            r3.<init>(r4, r1)     // Catch:{ all -> 0x00bd }
            java.util.List r1 = kotlin.p590y.C13183n.m40498a(r3)     // Catch:{ all -> 0x00bd }
            com.bamtech.sdk4.internal.service.ServiceTransaction r3 = r5.$transaction     // Catch:{ all -> 0x00bd }
            java.lang.Throwable r3 = r3.getSource()     // Catch:{ all -> 0x00bd }
            r0.<init>(r2, r1, r3)     // Catch:{ all -> 0x00bd }
            goto L_0x00bc
        L_0x004c:
            if (r1 == 0) goto L_0x007a
            com.bamtech.sdk4.internal.token.DefaultTokenClient r2 = r5.this$0     // Catch:{ all -> 0x00bd }
            boolean r2 = r2.isInvalid$sdk_core_api_release(r1)     // Catch:{ all -> 0x00bd }
            if (r2 != 0) goto L_0x0057
            goto L_0x007a
        L_0x0057:
            com.bamtech.sdk4.service.BadRequestException r0 = new com.bamtech.sdk4.service.BadRequestException     // Catch:{ all -> 0x00bd }
            com.bamtech.sdk4.internal.service.ServiceTransaction r2 = r5.$transaction     // Catch:{ all -> 0x00bd }
            java.util.UUID r2 = r2.getId()     // Catch:{ all -> 0x00bd }
            com.bamtech.sdk4.internal.service.ServiceError r3 = new com.bamtech.sdk4.internal.service.ServiceError     // Catch:{ all -> 0x00bd }
            java.lang.String r4 = r1.getError()     // Catch:{ all -> 0x00bd }
            java.lang.String r1 = r1.getError_description()     // Catch:{ all -> 0x00bd }
            r3.<init>(r4, r1)     // Catch:{ all -> 0x00bd }
            java.util.List r1 = kotlin.p590y.C13183n.m40498a(r3)     // Catch:{ all -> 0x00bd }
            com.bamtech.sdk4.internal.service.ServiceTransaction r3 = r5.$transaction     // Catch:{ all -> 0x00bd }
            java.lang.Throwable r3 = r3.getSource()     // Catch:{ all -> 0x00bd }
            r0.<init>(r2, r1, r3)     // Catch:{ all -> 0x00bd }
            goto L_0x00bc
        L_0x007a:
            if (r1 == 0) goto L_0x009f
            com.bamtech.sdk4.service.BadRequestException r0 = new com.bamtech.sdk4.service.BadRequestException     // Catch:{ all -> 0x00bd }
            com.bamtech.sdk4.internal.service.ServiceTransaction r2 = r5.$transaction     // Catch:{ all -> 0x00bd }
            java.util.UUID r2 = r2.getId()     // Catch:{ all -> 0x00bd }
            com.bamtech.sdk4.internal.service.ServiceError r3 = new com.bamtech.sdk4.internal.service.ServiceError     // Catch:{ all -> 0x00bd }
            java.lang.String r4 = r1.getError()     // Catch:{ all -> 0x00bd }
            java.lang.String r1 = r1.getError_description()     // Catch:{ all -> 0x00bd }
            r3.<init>(r4, r1)     // Catch:{ all -> 0x00bd }
            java.util.List r1 = kotlin.p590y.C13183n.m40498a(r3)     // Catch:{ all -> 0x00bd }
            com.bamtech.sdk4.internal.service.ServiceTransaction r3 = r5.$transaction     // Catch:{ all -> 0x00bd }
            java.lang.Throwable r3 = r3.getSource()     // Catch:{ all -> 0x00bd }
            r0.<init>(r2, r1, r3)     // Catch:{ all -> 0x00bd }
            goto L_0x00bc
        L_0x009f:
            com.bamtech.sdk4.service.BadRequestException r1 = new com.bamtech.sdk4.service.BadRequestException     // Catch:{ all -> 0x00bd }
            com.bamtech.sdk4.internal.service.ServiceTransaction r2 = r5.$transaction     // Catch:{ all -> 0x00bd }
            java.util.UUID r2 = r2.getId()     // Catch:{ all -> 0x00bd }
            com.bamtech.sdk4.internal.service.ServiceError r3 = new com.bamtech.sdk4.internal.service.ServiceError     // Catch:{ all -> 0x00bd }
            java.lang.String r4 = "error"
            r3.<init>(r4, r0)     // Catch:{ all -> 0x00bd }
            java.util.List r0 = kotlin.p590y.C13183n.m40498a(r3)     // Catch:{ all -> 0x00bd }
            com.bamtech.sdk4.internal.service.ServiceTransaction r3 = r5.$transaction     // Catch:{ all -> 0x00bd }
            java.lang.Throwable r3 = r3.getSource()     // Catch:{ all -> 0x00bd }
            r1.<init>(r2, r0, r3)     // Catch:{ all -> 0x00bd }
            r0 = r1
        L_0x00bc:
            throw r0     // Catch:{ all -> 0x00bd }
        L_0x00bd:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00bf }
        L_0x00bf:
            r1 = move-exception
            kotlin.p580c0.C12724b.m39863a(r6, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.token.DefaultTokenClient$errorResponseHandler$1.handle(okhttp3.Response):java.lang.Void");
    }
}
