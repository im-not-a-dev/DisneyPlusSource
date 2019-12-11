package com.bamtech.sdk4.internal.account;

import com.bamtech.core.networking.converters.Converter;
import com.bamtech.core.networking.handlers.ResponseHandler;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.facebook.stetho.server.http.HttpStatus;
import kotlin.Metadata;
import okhttp3.Response;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, mo31007d2 = {"com/bamtech/sdk4/internal/account/DefaultUserProfileClient$profileUpdateResponseHandler$1", "Lcom/bamtech/core/networking/handlers/ResponseHandler;", "Lcom/bamtech/sdk4/internal/account/CreateAccountGrantResponse;", "canHandle", "", "response", "Lokhttp3/Response;", "handle", "extension-account"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: UserProfileClient.kt */
public final class DefaultUserProfileClient$profileUpdateResponseHandler$1 implements ResponseHandler<CreateAccountGrantResponse> {
    final /* synthetic */ Converter $converter;
    final /* synthetic */ ServiceTransaction $transaction;

    DefaultUserProfileClient$profileUpdateResponseHandler$1(Converter converter, ServiceTransaction serviceTransaction) {
        this.$converter = converter;
        this.$transaction = serviceTransaction;
    }

    public boolean canHandle(Response response) {
        return C13185o.m40520c(Integer.valueOf(HttpStatus.HTTP_OK), Integer.valueOf(204)).contains(Integer.valueOf(response.mo35858c()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        kotlin.p580c0.C12724b.m39863a(r10, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0040, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bamtech.sdk4.internal.account.CreateAccountGrantResponse handle(okhttp3.Response r10) {
        /*
            r9 = this;
            int r0 = r10.mo35858c()
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r0 == r1) goto L_0x0020
            r10 = 204(0xcc, float:2.86E-43)
            if (r0 != r10) goto L_0x000f
            r0 = r2
            goto L_0x0039
        L_0x000f:
            com.bamtech.sdk4.service.InvalidStateException r10 = new com.bamtech.sdk4.service.InvalidStateException
            com.bamtech.sdk4.internal.service.ServiceTransaction r0 = r9.$transaction
            java.util.UUID r4 = r0.getId()
            r5 = 0
            r6 = 0
            r7 = 6
            r8 = 0
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            throw r10
        L_0x0020:
            okhttp3.y r10 = r10.mo35855a()
            com.bamtech.core.networking.converters.Converter r0 = r9.$converter     // Catch:{ all -> 0x003a }
            if (r10 == 0) goto L_0x002d
            okio.BufferedSource r1 = r10.mo35703d()     // Catch:{ all -> 0x003a }
            goto L_0x002e
        L_0x002d:
            r1 = r2
        L_0x002e:
            java.lang.Class<com.bamtech.sdk4.internal.account.CreateAccountGrantResponse$Success> r3 = com.bamtech.sdk4.internal.account.CreateAccountGrantResponse.Success.class
            java.lang.Object r0 = r0.mo7496a(r1, r3)     // Catch:{ all -> 0x003a }
            com.bamtech.sdk4.internal.account.CreateAccountGrantResponse$Success r0 = (com.bamtech.sdk4.internal.account.CreateAccountGrantResponse.Success) r0     // Catch:{ all -> 0x003a }
            kotlin.p580c0.C12724b.m39863a(r10, r2)
        L_0x0039:
            return r0
        L_0x003a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003c }
        L_0x003c:
            r1 = move-exception
            kotlin.p580c0.C12724b.m39863a(r10, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.account.DefaultUserProfileClient$profileUpdateResponseHandler$1.handle(okhttp3.Response):com.bamtech.sdk4.internal.account.CreateAccountGrantResponse");
    }
}
