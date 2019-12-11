package com.bamtech.sdk4.internal.subscription;

import com.bamtech.core.networking.handlers.ResponseHandler;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.subscription.LinkSubscriptionSuccess;
import kotlin.Metadata;
import okhttp3.Response;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, mo31007d2 = {"com/bamtech/sdk4/internal/subscription/DefaultSubscriptionClient$linkSubscriptionsResponseHandler$1", "Lcom/bamtech/core/networking/handlers/ResponseHandler;", "Lcom/bamtech/sdk4/subscription/LinkSubscriptionSuccess;", "canHandle", "", "response", "Lokhttp3/Response;", "handle", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: SubscriptionClient.kt */
public final class DefaultSubscriptionClient$linkSubscriptionsResponseHandler$1 implements ResponseHandler<LinkSubscriptionSuccess> {
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultSubscriptionClient this$0;

    DefaultSubscriptionClient$linkSubscriptionsResponseHandler$1(DefaultSubscriptionClient defaultSubscriptionClient, ServiceTransaction serviceTransaction) {
        this.this$0 = defaultSubscriptionClient;
        this.$transaction = serviceTransaction;
    }

    public boolean canHandle(Response response) {
        return response.mo35863f();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0062, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0063, code lost:
        kotlin.p580c0.C12724b.m39863a(r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bamtech.sdk4.subscription.LinkSubscriptionSuccess handle(okhttp3.Response r8) {
        /*
            r7 = this;
            okhttp3.y r0 = r8.mo35855a()     // Catch:{ all -> 0x0060 }
            int r1 = r8.mo35858c()     // Catch:{ all -> 0x0060 }
            r2 = 200(0xc8, float:2.8E-43)
            r3 = 0
            if (r1 == r2) goto L_0x0046
            r2 = 202(0xca, float:2.83E-43)
            if (r1 != r2) goto L_0x0035
            com.bamtech.sdk4.internal.subscription.DefaultSubscriptionClient r1 = r7.this$0     // Catch:{ all -> 0x0060 }
            com.bamtech.core.networking.converters.Converter r1 = r1.getConverter()     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x001d
            okio.BufferedSource r3 = r0.mo35703d()     // Catch:{ all -> 0x0060 }
        L_0x001d:
            java.lang.Class<com.bamtech.sdk4.subscription.LinkSubscriptionPartialException$LinkSubscriptionPartialErrorResult> r0 = com.bamtech.sdk4.subscription.LinkSubscriptionPartialException.LinkSubscriptionPartialErrorResult.class
            java.lang.Object r0 = r1.mo7496a(r3, r0)     // Catch:{ all -> 0x0060 }
            com.bamtech.sdk4.subscription.LinkSubscriptionPartialException$LinkSubscriptionPartialErrorResult r0 = (com.bamtech.sdk4.subscription.LinkSubscriptionPartialException.LinkSubscriptionPartialErrorResult) r0     // Catch:{ all -> 0x0060 }
            com.bamtech.sdk4.subscription.LinkSubscriptionPartialException r1 = new com.bamtech.sdk4.subscription.LinkSubscriptionPartialException     // Catch:{ all -> 0x0060 }
            com.bamtech.sdk4.internal.service.ServiceTransaction r2 = r7.$transaction     // Catch:{ all -> 0x0060 }
            java.util.UUID r2 = r2.getId()     // Catch:{ all -> 0x0060 }
            java.util.List r0 = r0.getErrors()     // Catch:{ all -> 0x0060 }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x0060 }
            throw r1     // Catch:{ all -> 0x0060 }
        L_0x0035:
            com.bamtech.sdk4.service.InvalidStateException r0 = new com.bamtech.sdk4.service.InvalidStateException     // Catch:{ all -> 0x0060 }
            com.bamtech.sdk4.internal.service.ServiceTransaction r1 = r7.$transaction     // Catch:{ all -> 0x0060 }
            java.util.UUID r2 = r1.getId()     // Catch:{ all -> 0x0060 }
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0060 }
            throw r0     // Catch:{ all -> 0x0060 }
        L_0x0046:
            com.bamtech.sdk4.internal.subscription.DefaultSubscriptionClient r1 = r7.this$0     // Catch:{ all -> 0x0060 }
            com.bamtech.core.networking.converters.Converter r1 = r1.getConverter()     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x0053
            okio.BufferedSource r0 = r0.mo35703d()     // Catch:{ all -> 0x0060 }
            goto L_0x0054
        L_0x0053:
            r0 = r3
        L_0x0054:
            java.lang.Class<com.bamtech.sdk4.subscription.LinkSubscriptionSuccess> r2 = com.bamtech.sdk4.subscription.LinkSubscriptionSuccess.class
            java.lang.Object r0 = r1.mo7496a(r0, r2)     // Catch:{ all -> 0x0060 }
            com.bamtech.sdk4.subscription.LinkSubscriptionSuccess r0 = (com.bamtech.sdk4.subscription.LinkSubscriptionSuccess) r0     // Catch:{ all -> 0x0060 }
            kotlin.p580c0.C12724b.m39863a(r8, r3)
            return r0
        L_0x0060:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0062 }
        L_0x0062:
            r1 = move-exception
            kotlin.p580c0.C12724b.m39863a(r8, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.subscription.DefaultSubscriptionClient$linkSubscriptionsResponseHandler$1.handle(okhttp3.Response):com.bamtech.sdk4.subscription.LinkSubscriptionSuccess");
    }
}
