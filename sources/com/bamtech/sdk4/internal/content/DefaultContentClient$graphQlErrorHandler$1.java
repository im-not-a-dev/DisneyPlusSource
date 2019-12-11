package com.bamtech.sdk4.internal.content;

import com.bamtech.core.networking.handlers.ResponseHandler;
import com.bamtech.sdk4.content.GraphQlResponseConverter;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import kotlin.Metadata;
import okhttp3.Response;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, mo31007d2 = {"com/bamtech/sdk4/internal/content/DefaultContentClient$graphQlErrorHandler$1", "Lcom/bamtech/core/networking/handlers/ResponseHandler;", "", "canHandle", "", "response", "Lokhttp3/Response;", "handle", "extension-content"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ContentClient.kt */
public final class DefaultContentClient$graphQlErrorHandler$1 implements ResponseHandler {
    final /* synthetic */ GraphQlResponseConverter $converter;
    final /* synthetic */ ServiceTransaction $transaction;

    DefaultContentClient$graphQlErrorHandler$1(GraphQlResponseConverter graphQlResponseConverter, ServiceTransaction serviceTransaction) {
        this.$converter = graphQlResponseConverter;
        this.$transaction = serviceTransaction;
    }

    public boolean canHandle(Response response) {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bc, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00bd, code lost:
        kotlin.p580c0.C12724b.m39863a(r13, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c0, code lost:
        throw r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0087 A[Catch:{ all -> 0x0035 }, LOOP:0: B:25:0x0081->B:27:0x0087, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Void handle(okhttp3.Response r13) {
        /*
            r12 = this;
            okhttp3.y r0 = r13.mo35855a()     // Catch:{ all -> 0x00ba }
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0022
            com.bamtech.sdk4.content.GraphQlResponseConverter r2 = r12.$converter     // Catch:{ all -> 0x0035 }
            boolean r2 = r2 instanceof com.bamtech.sdk4.content.BufferedGraphQlResponseConverter     // Catch:{ all -> 0x0035 }
            if (r2 == 0) goto L_0x0022
            com.bamtech.sdk4.content.GraphQlResponseConverter r2 = r12.$converter     // Catch:{ all -> 0x0035 }
            com.bamtech.sdk4.content.BufferedGraphQlResponseConverter r2 = (com.bamtech.sdk4.content.BufferedGraphQlResponseConverter) r2     // Catch:{ all -> 0x0035 }
            okio.BufferedSource r3 = r0.mo35703d()     // Catch:{ all -> 0x0035 }
            java.lang.String r4 = "body.source()"
            kotlin.jvm.internal.C12880j.m40222a(r3, r4)     // Catch:{ all -> 0x0035 }
            java.lang.Class<java.lang.Void> r4 = java.lang.Void.class
            com.bamtech.sdk4.content.GraphQlResponse r0 = r2.deserialize(r3, r4)     // Catch:{ all -> 0x0035 }
            goto L_0x0062
        L_0x0022:
            com.bamtech.sdk4.content.GraphQlResponseConverter r2 = r12.$converter     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x002d
            java.lang.String r3 = r0.mo36279e()     // Catch:{ all -> 0x0035 }
            if (r3 == 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r3 = r1
        L_0x002e:
            java.lang.Class<java.lang.Void> r4 = java.lang.Void.class
            com.bamtech.sdk4.content.GraphQlResponse r0 = r2.deserialize(r3, r4)     // Catch:{ all -> 0x0035 }
            goto L_0x0062
        L_0x0035:
            r2 = move-exception
            com.bamtech.sdk4.content.GraphQlResponse r3 = new com.bamtech.sdk4.content.GraphQlResponse     // Catch:{ all -> 0x00ba }
            r4 = 2
            com.bamtech.sdk4.content.GraphQlError[] r5 = new com.bamtech.sdk4.content.GraphQlError[r4]     // Catch:{ all -> 0x00ba }
            r6 = 0
            com.bamtech.sdk4.content.GraphQlError r7 = new com.bamtech.sdk4.content.GraphQlError     // Catch:{ all -> 0x00ba }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00ba }
            r8 = 0
            r7.<init>(r2, r8, r4, r8)     // Catch:{ all -> 0x00ba }
            r5[r6] = r7     // Catch:{ all -> 0x00ba }
            com.bamtech.sdk4.content.GraphQlError r2 = new com.bamtech.sdk4.content.GraphQlError     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x0053
            java.lang.String r0 = r0.mo36279e()     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r0 = r1
        L_0x0054:
            r2.<init>(r0, r8, r4, r8)     // Catch:{ all -> 0x00ba }
            r0 = 1
            r5[r0] = r2     // Catch:{ all -> 0x00ba }
            java.util.List r1 = kotlin.p590y.C13185o.m40520c(r5)     // Catch:{ all -> 0x00ba }
            r3.<init>(r8, r1, r0, r8)     // Catch:{ all -> 0x00ba }
            r0 = r3
        L_0x0062:
            com.bamtech.sdk4.service.ServiceException$Companion r1 = com.bamtech.sdk4.service.ServiceException.Companion     // Catch:{ all -> 0x00ba }
            int r2 = r13.mo35858c()     // Catch:{ all -> 0x00ba }
            com.bamtech.sdk4.internal.service.ServiceTransaction r3 = r12.$transaction     // Catch:{ all -> 0x00ba }
            java.util.UUID r3 = r3.getId()     // Catch:{ all -> 0x00ba }
            java.util.List r0 = r0.getErrors()     // Catch:{ all -> 0x00ba }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x00ba }
            r5 = 10
            int r5 = kotlin.p590y.C13187p.m40525a(r0, r5)     // Catch:{ all -> 0x00ba }
            r4.<init>(r5)     // Catch:{ all -> 0x00ba }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00ba }
        L_0x0081:
            boolean r5 = r0.hasNext()     // Catch:{ all -> 0x00ba }
            if (r5 == 0) goto L_0x009c
            java.lang.Object r5 = r0.next()     // Catch:{ all -> 0x00ba }
            com.bamtech.sdk4.content.GraphQlError r5 = (com.bamtech.sdk4.content.GraphQlError) r5     // Catch:{ all -> 0x00ba }
            com.bamtech.sdk4.internal.service.ServiceError r6 = new com.bamtech.sdk4.internal.service.ServiceError     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = "graphql-error"
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00ba }
            r6.<init>(r7, r5)     // Catch:{ all -> 0x00ba }
            r4.add(r6)     // Catch:{ all -> 0x00ba }
            goto L_0x0081
        L_0x009c:
            com.bamtech.sdk4.internal.service.ServiceTransaction r0 = r12.$transaction     // Catch:{ all -> 0x00ba }
            java.lang.Throwable r0 = r0.getSource()     // Catch:{ all -> 0x00ba }
            com.bamtech.sdk4.service.ServiceException r0 = r1.create(r2, r3, r4, r0)     // Catch:{ all -> 0x00ba }
            com.bamtech.sdk4.internal.service.ServiceTransaction r1 = r12.$transaction     // Catch:{ all -> 0x00ba }
            com.bamtech.core.logging.ExceptionEvent r2 = new com.bamtech.core.logging.ExceptionEvent     // Catch:{ all -> 0x00ba }
            java.lang.String r6 = "GraphQlErrorDeserializationFailed"
            r8 = 0
            r9 = 0
            r10 = 12
            r11 = 0
            r5 = r2
            r7 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x00ba }
            r1.log(r2)     // Catch:{ all -> 0x00ba }
            throw r0     // Catch:{ all -> 0x00ba }
        L_0x00ba:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00bc }
        L_0x00bc:
            r1 = move-exception
            kotlin.p580c0.C12724b.m39863a(r13, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.content.DefaultContentClient$graphQlErrorHandler$1.handle(okhttp3.Response):java.lang.Void");
    }
}
