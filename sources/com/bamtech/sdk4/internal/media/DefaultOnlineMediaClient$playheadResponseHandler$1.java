package com.bamtech.sdk4.internal.media;

import com.bamtech.core.networking.handlers.ResponseHandler;
import com.bamtech.sdk4.media.PlayheadBookmarkBuilder;
import kotlin.Metadata;
import okhttp3.Response;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, mo31007d2 = {"com/bamtech/sdk4/internal/media/DefaultOnlineMediaClient$playheadResponseHandler$1", "Lcom/bamtech/core/networking/handlers/ResponseHandler;", "Lcom/bamtech/sdk4/media/PlayheadBookmarkBuilder;", "canHandle", "", "response", "Lokhttp3/Response;", "handle", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DefaultOnlineMediaClient.kt */
public final class DefaultOnlineMediaClient$playheadResponseHandler$1 implements ResponseHandler<PlayheadBookmarkBuilder> {
    final /* synthetic */ DefaultOnlineMediaClient this$0;

    DefaultOnlineMediaClient$playheadResponseHandler$1(DefaultOnlineMediaClient defaultOnlineMediaClient) {
        this.this$0 = defaultOnlineMediaClient;
    }

    public boolean canHandle(Response response) {
        return response.mo35863f();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        kotlin.p580c0.C12724b.m39863a(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004b, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bamtech.sdk4.media.PlayheadBookmarkBuilder handle(okhttp3.Response r6) {
        /*
            r5 = this;
            java.lang.String r0 = "last-modified"
            java.lang.String r0 = r6.mo35861e(r0)     // Catch:{ all -> 0x0045 }
            r1 = 0
            if (r0 == 0) goto L_0x001a
            java.lang.String r2 = "EEE, dd MMM YYYY HH:mm:ss z"
            org.joda.time.format.DateTimeFormatter r2 = org.joda.time.format.DateTimeFormat.forPattern(r2)     // Catch:{ all -> 0x0045 }
            java.util.Locale r3 = java.util.Locale.US     // Catch:{ all -> 0x0045 }
            org.joda.time.format.DateTimeFormatter r2 = r2.withLocale(r3)     // Catch:{ all -> 0x0045 }
            org.joda.time.DateTime r0 = org.joda.time.DateTime.parse(r0, r2)     // Catch:{ all -> 0x0045 }
            goto L_0x001b
        L_0x001a:
            r0 = r1
        L_0x001b:
            okhttp3.y r2 = r6.mo35855a()     // Catch:{ all -> 0x0045 }
            com.bamtech.sdk4.internal.media.DefaultOnlineMediaClient r3 = r5.this$0     // Catch:{ all -> 0x0045 }
            com.bamtech.sdk4.internal.networking.ConverterProvider r3 = r3.getConverters$sdk_core_api_release()     // Catch:{ all -> 0x0045 }
            com.bamtech.core.networking.converters.Converter r3 = r3.getIdentity()     // Catch:{ all -> 0x0045 }
            if (r2 == 0) goto L_0x0030
            okio.BufferedSource r2 = r2.mo35703d()     // Catch:{ all -> 0x0045 }
            goto L_0x0031
        L_0x0030:
            r2 = r1
        L_0x0031:
            java.lang.Class<com.bamtech.sdk4.media.PlayheadBookmarkBuilder> r4 = com.bamtech.sdk4.media.PlayheadBookmarkBuilder.class
            java.lang.Object r2 = r3.mo7496a(r2, r4)     // Catch:{ all -> 0x0045 }
            r3 = r2
            com.bamtech.sdk4.media.PlayheadBookmarkBuilder r3 = (com.bamtech.sdk4.media.PlayheadBookmarkBuilder) r3     // Catch:{ all -> 0x0045 }
            if (r0 == 0) goto L_0x003f
            r3.setLastUpdated(r0)     // Catch:{ all -> 0x0045 }
        L_0x003f:
            com.bamtech.sdk4.media.PlayheadBookmarkBuilder r2 = (com.bamtech.sdk4.media.PlayheadBookmarkBuilder) r2     // Catch:{ all -> 0x0045 }
            kotlin.p580c0.C12724b.m39863a(r6, r1)
            return r2
        L_0x0045:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r1 = move-exception
            kotlin.p580c0.C12724b.m39863a(r6, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.media.DefaultOnlineMediaClient$playheadResponseHandler$1.handle(okhttp3.Response):com.bamtech.sdk4.media.PlayheadBookmarkBuilder");
    }
}
