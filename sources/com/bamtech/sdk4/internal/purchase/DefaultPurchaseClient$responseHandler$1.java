package com.bamtech.sdk4.internal.purchase;

import com.bamtech.core.networking.handlers.ResponseHandler;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.purchase.PurchaseActivationResult;
import com.facebook.stetho.server.http.HttpStatus;
import kotlin.Metadata;
import okhttp3.Response;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, mo31007d2 = {"com/bamtech/sdk4/internal/purchase/DefaultPurchaseClient$responseHandler$1", "Lcom/bamtech/core/networking/handlers/ResponseHandler;", "Lcom/bamtech/sdk4/purchase/PurchaseActivationResult;", "canHandle", "", "response", "Lokhttp3/Response;", "handle", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PurchaseClient.kt */
public final class DefaultPurchaseClient$responseHandler$1 implements ResponseHandler<PurchaseActivationResult> {
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultPurchaseClient this$0;

    DefaultPurchaseClient$responseHandler$1(DefaultPurchaseClient defaultPurchaseClient, ServiceTransaction serviceTransaction) {
        this.this$0 = defaultPurchaseClient;
        this.$transaction = serviceTransaction;
    }

    public boolean canHandle(Response response) {
        return C13174k.m40393b((Object[]) new Integer[]{Integer.valueOf(HttpStatus.HTTP_OK), Integer.valueOf(202)}, (Object) Integer.valueOf(response.mo35858c()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0073, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0074, code lost:
        kotlin.p580c0.C12724b.m39863a(r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0077, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bamtech.sdk4.purchase.PurchaseActivationResult handle(okhttp3.Response r8) {
        /*
            r7 = this;
            java.lang.String r0 = "X-BAMTech-Refresh-Access-Token"
            java.lang.String r0 = r8.mo35861e(r0)
            if (r0 == 0) goto L_0x000d
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            okhttp3.y r1 = r8.mo35855a()     // Catch:{ all -> 0x0071 }
            int r2 = r8.mo35858c()     // Catch:{ all -> 0x0071 }
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 0
            if (r2 == r3) goto L_0x004f
            r3 = 202(0xca, float:2.83E-43)
            if (r2 != r3) goto L_0x003e
            com.bamtech.sdk4.internal.purchase.DefaultPurchaseClient r2 = r7.this$0     // Catch:{ all -> 0x0071 }
            com.bamtech.sdk4.internal.networking.ConverterProvider r2 = r2.converters     // Catch:{ all -> 0x0071 }
            com.bamtech.core.networking.converters.Converter r2 = r2.getIdentity()     // Catch:{ all -> 0x0071 }
            if (r1 == 0) goto L_0x0030
            okio.BufferedSource r1 = r1.mo35703d()     // Catch:{ all -> 0x0071 }
            goto L_0x0031
        L_0x0030:
            r1 = r4
        L_0x0031:
            java.lang.Class<com.bamtech.sdk4.purchase.PurchaseActivationResult$PurchaseFailureActivationResult> r3 = com.bamtech.sdk4.purchase.PurchaseActivationResult.PurchaseFailureActivationResult.class
            java.lang.Object r1 = r2.mo7496a(r1, r3)     // Catch:{ all -> 0x0071 }
            com.bamtech.sdk4.purchase.PurchaseActivationResult$PurchaseFailureActivationResult r1 = (com.bamtech.sdk4.purchase.PurchaseActivationResult.PurchaseFailureActivationResult) r1     // Catch:{ all -> 0x0071 }
            com.bamtech.sdk4.purchase.PurchaseActivationResult r0 = r1.copy(r0)     // Catch:{ all -> 0x0071 }
            goto L_0x006d
        L_0x003e:
            com.bamtech.sdk4.service.InvalidStateException r0 = new com.bamtech.sdk4.service.InvalidStateException     // Catch:{ all -> 0x0071 }
            com.bamtech.sdk4.internal.service.ServiceTransaction r1 = r7.$transaction     // Catch:{ all -> 0x0071 }
            java.util.UUID r2 = r1.getId()     // Catch:{ all -> 0x0071 }
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0071 }
            throw r0     // Catch:{ all -> 0x0071 }
        L_0x004f:
            com.bamtech.sdk4.internal.purchase.DefaultPurchaseClient r2 = r7.this$0     // Catch:{ all -> 0x0071 }
            com.bamtech.sdk4.internal.networking.ConverterProvider r2 = r2.converters     // Catch:{ all -> 0x0071 }
            com.bamtech.core.networking.converters.Converter r2 = r2.getIdentity()     // Catch:{ all -> 0x0071 }
            if (r1 == 0) goto L_0x0060
            okio.BufferedSource r1 = r1.mo35703d()     // Catch:{ all -> 0x0071 }
            goto L_0x0061
        L_0x0060:
            r1 = r4
        L_0x0061:
            java.lang.Class<com.bamtech.sdk4.purchase.PurchaseActivationResult$PurchaseSuccessActivationResult> r3 = com.bamtech.sdk4.purchase.PurchaseActivationResult.PurchaseSuccessActivationResult.class
            java.lang.Object r1 = r2.mo7496a(r1, r3)     // Catch:{ all -> 0x0071 }
            com.bamtech.sdk4.purchase.PurchaseActivationResult$PurchaseSuccessActivationResult r1 = (com.bamtech.sdk4.purchase.PurchaseActivationResult.PurchaseSuccessActivationResult) r1     // Catch:{ all -> 0x0071 }
            com.bamtech.sdk4.purchase.PurchaseActivationResult r0 = r1.copy(r0)     // Catch:{ all -> 0x0071 }
        L_0x006d:
            kotlin.p580c0.C12724b.m39863a(r8, r4)
            return r0
        L_0x0071:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0073 }
        L_0x0073:
            r1 = move-exception
            kotlin.p580c0.C12724b.m39863a(r8, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.purchase.DefaultPurchaseClient$responseHandler$1.handle(okhttp3.Response):com.bamtech.sdk4.purchase.PurchaseActivationResult");
    }
}
