package com.bamtech.sdk4.internal.service;

import com.bamtech.core.networking.handlers.ResponseHandler;
import java.io.File;
import kotlin.C13145v;
import kotlin.Metadata;
import okhttp3.Response;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, mo31007d2 = {"com/bamtech/sdk4/internal/service/ResponseHandlersKt$fileResponseHandler$1", "Lcom/bamtech/core/networking/handlers/ResponseHandler;", "", "canHandle", "", "response", "Lokhttp3/Response;", "handle", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ResponseHandlers.kt */
public final class ResponseHandlersKt$fileResponseHandler$1 implements ResponseHandler<C13145v> {
    final /* synthetic */ File $filePath;
    final /* synthetic */ ServiceTransaction $transaction;

    ResponseHandlersKt$fileResponseHandler$1(ServiceTransaction serviceTransaction, File file) {
        this.$transaction = serviceTransaction;
        this.$filePath = file;
    }

    public boolean canHandle(Response response) {
        return response.mo35863f();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        kotlin.p580c0.C12724b.m39863a(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0034, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0035, code lost:
        kotlin.p580c0.C12724b.m39863a(r0, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0038, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handle(okhttp3.Response r9) {
        /*
            r8 = this;
            boolean r0 = r9.mo35863f()
            if (r0 == 0) goto L_0x0039
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            okhttp3.y r9 = r9.mo35855a()
            r1 = 0
            if (r9 == 0) goto L_0x0014
            java.io.InputStream r9 = r9.mo36277a()
            goto L_0x0015
        L_0x0014:
            r9 = r1
        L_0x0015:
            r0.<init>(r9)
            java.io.FileOutputStream r9 = new java.io.FileOutputStream
            java.io.File r2 = r8.$filePath
            r9.<init>(r2)
            r2 = 0
            r3 = 2
            kotlin.p580c0.C12723a.m39862a(r0, r9, r2, r3, r1)     // Catch:{ all -> 0x002b }
            kotlin.p580c0.C12724b.m39863a(r9, r1)     // Catch:{ all -> 0x0032 }
            kotlin.p580c0.C12724b.m39863a(r0, r1)
            return
        L_0x002b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002d }
        L_0x002d:
            r2 = move-exception
            kotlin.p580c0.C12724b.m39863a(r9, r1)     // Catch:{ all -> 0x0032 }
            throw r2     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x0034 }
        L_0x0034:
            r1 = move-exception
            kotlin.p580c0.C12724b.m39863a(r0, r9)
            throw r1
        L_0x0039:
            com.bamtech.sdk4.service.InvalidStateException r9 = new com.bamtech.sdk4.service.InvalidStateException
            com.bamtech.sdk4.internal.service.ServiceTransaction r0 = r8.$transaction
            java.util.UUID r3 = r0.getId()
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.service.ResponseHandlersKt$fileResponseHandler$1.handle(okhttp3.Response):void");
    }
}
