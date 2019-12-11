package com.bamtechmedia.dominguez.core.utils.p223t0;

import kotlin.jvm.internal.C12880j;
import okhttp3.C14258u;
import okhttp3.C14262x;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Request.C14113a;
import okhttp3.Response;
import p520io.reactivex.Single;
import p520io.reactivex.p525e0.C11934b;

/* renamed from: com.bamtechmedia.dominguez.core.utils.t0.c */
/* compiled from: NetworkExtensions.kt */
public final class C5879c {
    /* renamed from: a */
    public static final Single<Response> m18933a(Request request, OkHttpClient okHttpClient) {
        Single<Response> b = new C5876a(okHttpClient.mo35727a(request)).mo30220b(C11934b.m38500b());
        C12880j.m40222a((Object) b, "CallExecuteSingle(client…scribeOn(Schedulers.io())");
        return b;
    }

    /* renamed from: a */
    public static final C14113a m18934a(C14113a aVar, String str, String str2) {
        aVar.mo35852c(C14262x.m45501a(C14258u.m45482b(str2), str));
        return aVar;
    }

    /* renamed from: a */
    public static final Single<Response> m18932a(OkHttpClient okHttpClient, String str) {
        C14113a aVar = new C14113a();
        aVar.mo35847b();
        aVar.mo35848b(str);
        Request a = aVar.mo35846a();
        C12880j.m40222a((Object) a, "Request.Builder().get().url(url).build()");
        return m18933a(a, okHttpClient);
    }
}
