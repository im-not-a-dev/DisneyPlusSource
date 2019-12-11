package com.bamtech.sdk4.internal.service;

import com.bamtech.core.networking.converters.Converter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import okhttp3.Response;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo31007d2 = {"<anonymous>", "OUT", "response", "Lokhttp3/Response;", "invoke", "(Lokhttp3/Response;)Ljava/lang/Object;"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: ResponseHandlers.kt */
final class ResponseHandlersKt$responseBodyHandler$2 extends C12881k implements Function1<Response, OUT> {
    final /* synthetic */ Converter $converter;
    final /* synthetic */ Class $type;

    ResponseHandlersKt$responseBodyHandler$2(Converter converter, Class cls) {
        this.$converter = converter;
        this.$type = cls;
        super(1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        kotlin.p580c0.C12724b.m39863a(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final OUT invoke(okhttp3.Response r5) {
        /*
            r4 = this;
            okhttp3.y r5 = r5.mo35855a()
            com.bamtech.core.networking.converters.Converter r0 = r4.$converter     // Catch:{ all -> 0x0019 }
            r1 = 0
            if (r5 == 0) goto L_0x000e
            okio.BufferedSource r2 = r5.mo35703d()     // Catch:{ all -> 0x0019 }
            goto L_0x000f
        L_0x000e:
            r2 = r1
        L_0x000f:
            java.lang.Class r3 = r4.$type     // Catch:{ all -> 0x0019 }
            java.lang.Object r0 = r0.mo7496a(r2, r3)     // Catch:{ all -> 0x0019 }
            kotlin.p580c0.C12724b.m39863a(r5, r1)
            return r0
        L_0x0019:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x001b }
        L_0x001b:
            r1 = move-exception
            kotlin.p580c0.C12724b.m39863a(r5, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.service.ResponseHandlersKt$responseBodyHandler$2.invoke(okhttp3.Response):java.lang.Object");
    }
}
