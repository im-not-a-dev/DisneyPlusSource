package com.bamtech.core.networking.p038f;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import okhttp3.Request.C14113a;
import okhttp3.Response;

/* renamed from: com.bamtech.core.networking.f.a */
/* compiled from: UserAgentInterceptor.kt */
public final class C1692a implements Interceptor {

    /* renamed from: a */
    private final String f5884a;

    public C1692a(String str) {
        this.f5884a = str;
    }

    public Response intercept(Chain chain) throws IOException {
        C14113a f = chain.mo35785m0().mo35836f();
        String str = "User-Agent";
        f.mo35839a(str);
        f.mo35840a(str, this.f5884a);
        Response a = chain.mo35780a(f.mo35846a());
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "chain.proceed(requestWithUserAgent)");
        return a;
    }
}
