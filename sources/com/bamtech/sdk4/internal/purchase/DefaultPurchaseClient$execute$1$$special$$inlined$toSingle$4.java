package com.bamtech.sdk4.internal.purchase;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import kotlin.Metadata;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo31007d2 = {"<anonymous>", "OUT", "it", "Lcom/bamtech/core/networking/Response;", "apply", "(Lcom/bamtech/core/networking/Response;)Ljava/lang/Object;", "ServiceRequestExtensionsKt$toSingle$3"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: ServiceRequestExtensions.kt */
public final class DefaultPurchaseClient$execute$1$$special$$inlined$toSingle$4<T, R> implements Function<T, R> {
    final /* synthetic */ String $dustEvent;
    final /* synthetic */ ServiceTransaction $transaction;

    public DefaultPurchaseClient$execute$1$$special$$inlined$toSingle$4(ServiceTransaction serviceTransaction, String str) {
        this.$transaction = serviceTransaction;
        this.$dustEvent = str;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Object, com.bamtech.sdk4.purchase.PurchaseActivationResult] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r4v1, types: [java.lang.Object, com.bamtech.sdk4.purchase.PurchaseActivationResult]
      assigns: [java.lang.Object]
      uses: [com.bamtech.sdk4.purchase.PurchaseActivationResult]
      mth insns count: 6
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bamtech.sdk4.purchase.PurchaseActivationResult apply(com.bamtech.core.networking.Response<? extends com.bamtech.sdk4.purchase.PurchaseActivationResult> r4) {
        /*
            r3 = this;
            com.bamtech.sdk4.internal.service.ServiceTransaction r0 = r3.$transaction
            java.lang.String r1 = r3.$dustEvent
            okhttp3.Response r2 = r4.mo7485b()
            p000.C1169c.m6005a(r0, r1, r2)
            java.lang.Object r4 = r4.mo7484a()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.purchase.DefaultPurchaseClient$execute$1$$special$$inlined$toSingle$4.apply(com.bamtech.core.networking.Response):java.lang.Object");
    }
}
