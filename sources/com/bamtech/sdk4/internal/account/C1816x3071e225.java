package com.bamtech.sdk4.internal.account;

import com.bamtech.core.networking.converters.Converter;
import com.bamtech.sdk4.internal.account.CreateAccountGrantResponse.Success;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import okhttp3.Response;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo31007d2 = {"<anonymous>", "OUT", "response", "Lokhttp3/Response;", "invoke", "(Lokhttp3/Response;)Ljava/lang/Object;", "com/bamtech/sdk4/internal/service/ResponseHandlersKt$responseBodyHandler$1"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtech.sdk4.internal.account.DefaultUserProfileClient$grantResponseHandler$1$handle$$inlined$responseBodyHandler$1 */
/* compiled from: ResponseHandlers.kt */
public final class C1816x3071e225 extends C12881k implements Function1<Response, Success> {
    final /* synthetic */ Converter $converter;

    public C1816x3071e225(Converter converter) {
        this.$converter = converter;
        super(1);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [com.bamtech.sdk4.internal.account.CreateAccountGrantResponse$Success, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        kotlin.p580c0.C12724b.m39863a(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        throw r1;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v2, types: [com.bamtech.sdk4.internal.account.CreateAccountGrantResponse$Success, java.lang.Object]
      assigns: [java.lang.Object]
      uses: [com.bamtech.sdk4.internal.account.CreateAccountGrantResponse$Success]
      mth insns count: 16
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
    public final com.bamtech.sdk4.internal.account.CreateAccountGrantResponse.Success invoke(okhttp3.Response r5) {
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
            java.lang.Class<com.bamtech.sdk4.internal.account.CreateAccountGrantResponse$Success> r3 = com.bamtech.sdk4.internal.account.CreateAccountGrantResponse.Success.class
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
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.account.C1816x3071e225.invoke(okhttp3.Response):java.lang.Object");
    }
}
