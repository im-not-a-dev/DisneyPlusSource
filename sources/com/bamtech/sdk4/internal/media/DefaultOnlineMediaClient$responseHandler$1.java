package com.bamtech.sdk4.internal.media;

import com.bamtech.core.networking.handlers.ResponseHandler;
import kotlin.Metadata;
import okhttp3.Response;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, mo31007d2 = {"com/bamtech/sdk4/internal/media/DefaultOnlineMediaClient$responseHandler$1", "Lcom/bamtech/core/networking/handlers/ResponseHandler;", "", "canHandle", "", "response", "Lokhttp3/Response;", "handle", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DefaultOnlineMediaClient.kt */
public final class DefaultOnlineMediaClient$responseHandler$1 implements ResponseHandler<byte[]> {
    final /* synthetic */ DefaultOnlineMediaClient this$0;

    DefaultOnlineMediaClient$responseHandler$1(DefaultOnlineMediaClient defaultOnlineMediaClient) {
        this.this$0 = defaultOnlineMediaClient;
    }

    public boolean canHandle(Response response) {
        return response.mo35863f();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        kotlin.p580c0.C12724b.m39863a(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] handle(okhttp3.Response r5) {
        /*
            r4 = this;
            okhttp3.y r0 = r5.mo35855a()     // Catch:{ all -> 0x0023 }
            com.bamtech.sdk4.internal.media.DefaultOnlineMediaClient r1 = r4.this$0     // Catch:{ all -> 0x0023 }
            com.bamtech.sdk4.internal.networking.ConverterProvider r1 = r1.getConverters$sdk_core_api_release()     // Catch:{ all -> 0x0023 }
            com.bamtech.core.networking.converters.Converter r1 = r1.getByte()     // Catch:{ all -> 0x0023 }
            r2 = 0
            if (r0 == 0) goto L_0x0016
            okio.BufferedSource r0 = r0.mo35703d()     // Catch:{ all -> 0x0023 }
            goto L_0x0017
        L_0x0016:
            r0 = r2
        L_0x0017:
            java.lang.Class<byte[]> r3 = byte[].class
            java.lang.Object r0 = r1.mo7496a(r0, r3)     // Catch:{ all -> 0x0023 }
            byte[] r0 = (byte[]) r0     // Catch:{ all -> 0x0023 }
            kotlin.p580c0.C12724b.m39863a(r5, r2)
            return r0
        L_0x0023:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0025 }
        L_0x0025:
            r1 = move-exception
            kotlin.p580c0.C12724b.m39863a(r5, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.media.DefaultOnlineMediaClient$responseHandler$1.handle(okhttp3.Response):byte[]");
    }
}
