package com.bamtech.sdk4.internal.content;

import com.bamtech.core.networking.handlers.ResponseHandler;
import com.bamtech.sdk4.content.GraphQlResponse;
import com.bamtech.sdk4.content.GraphQlResponseConverter;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import java.lang.reflect.Type;
import kotlin.Metadata;
import okhttp3.Response;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, mo31007d2 = {"com/bamtech/sdk4/internal/content/DefaultContentClient$graphQlHandler$1", "Lcom/bamtech/core/networking/handlers/ResponseHandler;", "Lcom/bamtech/sdk4/content/GraphQlResponse;", "canHandle", "", "response", "Lokhttp3/Response;", "handle", "extension-content"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ContentClient.kt */
public final class DefaultContentClient$graphQlHandler$1 implements ResponseHandler<GraphQlResponse<? extends OUT>> {
    final /* synthetic */ GraphQlResponseConverter $converter;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ Type $type;

    DefaultContentClient$graphQlHandler$1(GraphQlResponseConverter graphQlResponseConverter, Type type, ServiceTransaction serviceTransaction) {
        this.$converter = graphQlResponseConverter;
        this.$type = type;
        this.$transaction = serviceTransaction;
    }

    public boolean canHandle(Response response) {
        return response.mo35863f();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00bc, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00bd, code lost:
        kotlin.p580c0.C12724b.m39863a(r15, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00c0, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bamtech.sdk4.content.GraphQlResponse<OUT> handle(okhttp3.Response r15) {
        /*
            r14 = this;
            java.lang.String r0 = "graphql-deserialization-failed"
            java.lang.String r1 = "body.string()"
            okhttp3.y r2 = r15.mo35855a()     // Catch:{ all -> 0x00ba }
            r3 = 0
            if (r2 != 0) goto L_0x0012
            com.bamtech.sdk4.content.GraphQlResponse r0 = new com.bamtech.sdk4.content.GraphQlResponse     // Catch:{ all -> 0x00ba }
            r1 = 3
            r0.<init>(r3, r3, r1, r3)     // Catch:{ all -> 0x00ba }
            goto L_0x003b
        L_0x0012:
            com.bamtech.sdk4.content.GraphQlResponseConverter r4 = r14.$converter     // Catch:{ all -> 0x003f }
            boolean r4 = r4 instanceof com.bamtech.sdk4.content.BufferedGraphQlResponseConverter     // Catch:{ all -> 0x003f }
            if (r4 == 0) goto L_0x002c
            com.bamtech.sdk4.content.GraphQlResponseConverter r4 = r14.$converter     // Catch:{ all -> 0x003f }
            com.bamtech.sdk4.content.BufferedGraphQlResponseConverter r4 = (com.bamtech.sdk4.content.BufferedGraphQlResponseConverter) r4     // Catch:{ all -> 0x003f }
            okio.BufferedSource r5 = r2.mo35703d()     // Catch:{ all -> 0x003f }
            java.lang.String r6 = "body.source()"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r5, r6)     // Catch:{ all -> 0x003f }
            java.lang.reflect.Type r6 = r14.$type     // Catch:{ all -> 0x003f }
            com.bamtech.sdk4.content.GraphQlResponse r0 = r4.deserialize(r5, r6)     // Catch:{ all -> 0x003f }
            goto L_0x003b
        L_0x002c:
            com.bamtech.sdk4.content.GraphQlResponseConverter r4 = r14.$converter     // Catch:{ all -> 0x003f }
            java.lang.String r5 = r2.mo36279e()     // Catch:{ all -> 0x003f }
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r5, r1)     // Catch:{ all -> 0x003f }
            java.lang.reflect.Type r6 = r14.$type     // Catch:{ all -> 0x003f }
            com.bamtech.sdk4.content.GraphQlResponse r0 = r4.deserialize(r5, r6)     // Catch:{ all -> 0x003f }
        L_0x003b:
            kotlin.p580c0.C12724b.m39863a(r15, r3)
            return r0
        L_0x003f:
            r4 = move-exception
            com.bamtech.sdk4.internal.service.ServiceTransaction r12 = r14.$transaction     // Catch:{ all -> 0x00ba }
            com.bamtech.core.logging.ExceptionEvent r13 = new com.bamtech.core.logging.ExceptionEvent     // Catch:{ all -> 0x00ba }
            java.lang.String r6 = "GraphQlErrorDeserializationFailed"
            r8 = 0
            r9 = 0
            r10 = 12
            r11 = 0
            r5 = r13
            r7 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x00ba }
            r12.log(r13)     // Catch:{ all -> 0x00ba }
            com.bamtech.sdk4.content.GraphQlResponse r5 = new com.bamtech.sdk4.content.GraphQlResponse     // Catch:{ all -> 0x00ba }
            r6 = 2
            com.bamtech.sdk4.content.GraphQlError[] r7 = new com.bamtech.sdk4.content.GraphQlError[r6]     // Catch:{ all -> 0x00ba }
            com.bamtech.sdk4.content.GraphQlError r8 = new com.bamtech.sdk4.content.GraphQlError     // Catch:{ all -> 0x00ba }
            java.lang.String r9 = r4.toString()     // Catch:{ all -> 0x00ba }
            r8.<init>(r9, r3, r6, r3)     // Catch:{ all -> 0x00ba }
            r9 = 0
            r7[r9] = r8     // Catch:{ all -> 0x00ba }
            com.bamtech.sdk4.content.GraphQlError r8 = new com.bamtech.sdk4.content.GraphQlError     // Catch:{ all -> 0x00ba }
            java.lang.String r2 = r2.mo36279e()     // Catch:{ all -> 0x00ba }
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r2, r1)     // Catch:{ all -> 0x00ba }
            r8.<init>(r2, r3, r6, r3)     // Catch:{ all -> 0x00ba }
            r1 = 1
            r7[r1] = r8     // Catch:{ all -> 0x00ba }
            java.util.List r2 = kotlin.p590y.C13185o.m40520c(r7)     // Catch:{ all -> 0x00ba }
            r5.<init>(r3, r2, r1, r3)     // Catch:{ all -> 0x00ba }
            com.bamtech.sdk4.internal.service.ServiceError[] r2 = new com.bamtech.sdk4.internal.service.ServiceError[r6]     // Catch:{ all -> 0x00ba }
            com.bamtech.sdk4.internal.service.ServiceError r3 = new com.bamtech.sdk4.internal.service.ServiceError     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r6.<init>()     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = "Url: "
            r6.append(r7)     // Catch:{ all -> 0x00ba }
            okhttp3.Request r7 = r15.mo35870m()     // Catch:{ all -> 0x00ba }
            okhttp3.HttpUrl r7 = r7.mo35837g()     // Catch:{ all -> 0x00ba }
            r6.append(r7)     // Catch:{ all -> 0x00ba }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00ba }
            r3.<init>(r0, r6)     // Catch:{ all -> 0x00ba }
            r2[r9] = r3     // Catch:{ all -> 0x00ba }
            com.bamtech.sdk4.internal.service.ServiceError r3 = new com.bamtech.sdk4.internal.service.ServiceError     // Catch:{ all -> 0x00ba }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00ba }
            r3.<init>(r0, r5)     // Catch:{ all -> 0x00ba }
            r2[r1] = r3     // Catch:{ all -> 0x00ba }
            java.util.List r0 = kotlin.p590y.C13185o.m40520c(r2)     // Catch:{ all -> 0x00ba }
            com.bamtech.sdk4.service.ServiceException$Companion r1 = com.bamtech.sdk4.service.ServiceException.Companion     // Catch:{ all -> 0x00ba }
            r2 = 500(0x1f4, float:7.0E-43)
            com.bamtech.sdk4.internal.service.ServiceTransaction r3 = r14.$transaction     // Catch:{ all -> 0x00ba }
            java.util.UUID r3 = r3.getId()     // Catch:{ all -> 0x00ba }
            com.bamtech.sdk4.service.ServiceException r0 = r1.create(r2, r3, r0, r4)     // Catch:{ all -> 0x00ba }
            throw r0     // Catch:{ all -> 0x00ba }
        L_0x00ba:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00bc }
        L_0x00bc:
            r1 = move-exception
            kotlin.p580c0.C12724b.m39863a(r15, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.content.DefaultContentClient$graphQlHandler$1.handle(okhttp3.Response):com.bamtech.sdk4.content.GraphQlResponse");
    }
}
