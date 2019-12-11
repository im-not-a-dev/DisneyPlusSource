package com.bamtech.sdk4.internal.networking;

import com.facebook.stetho.server.http.HttpHeaders;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import okhttp3.Request;
import okhttp3.Request.C14113a;
import okhttp3.Response;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "Lokhttp3/Response;", "kotlin.jvm.PlatformType", "chain", "Lokhttp3/Interceptor$Chain;", "intercept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: NetworkModule.kt */
final class NetworkModule$addLoggingInterceptor$1 implements Interceptor {
    public static final NetworkModule$addLoggingInterceptor$1 INSTANCE = new NetworkModule$addLoggingInterceptor$1();

    NetworkModule$addLoggingInterceptor$1() {
    }

    public final Response intercept(Chain chain) {
        Request m0 = chain.mo35785m0();
        if (Intrinsics.areEqual((Object) m0.mo35835e(), (Object) "GET")) {
            String str = HttpHeaders.CONTENT_TYPE;
            if (m0.mo35831b(str) != null) {
                C14113a f = m0.mo35836f();
                f.mo35839a(str);
                m0 = f.mo35846a();
            }
        }
        return chain.mo35780a(m0);
    }
}
