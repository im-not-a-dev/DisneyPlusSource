package com.bamtech.core.networking;

import com.bamtech.core.networking.handlers.C1698a;
import com.bamtech.core.networking.handlers.ResponseTransformer;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;
import kotlin.C13142s;
import kotlin.jvm.internal.C12880j;
import okhttp3.C14256t;
import okhttp3.C14258u;
import okhttp3.C14262x;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.HttpUrl.Builder;
import okhttp3.OkHttpClient;
import okhttp3.Request.C14113a;

/* renamed from: com.bamtech.core.networking.e */
/* compiled from: Request.kt */
public final class C1691e {
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0026, code lost:
        if (r5 != null) goto L_0x0031;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <OUT, EXTRA> com.bamtech.core.networking.Request<OUT, EXTRA> m7796a(com.bamtech.core.networking.Link r2, okhttp3.OkHttpClient r3, com.bamtech.core.networking.handlers.ResponseTransformer<? extends OUT> r4, java.lang.String r5, EXTRA r6) {
        /*
            java.util.Map r0 = r2.getHeaders()
            java.lang.String r1 = "Content-Type"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            java.lang.String r0 = "application/json"
        L_0x0011:
            if (r5 == 0) goto L_0x0029
            okhttp3.u r0 = okhttp3.C14258u.m45482b(r0)
            java.nio.charset.Charset r1 = kotlin.p588j0.C12801c.f29474a
            byte[] r5 = r5.getBytes(r1)
            java.lang.String r1 = "(this as java.lang.String).getBytes(charset)"
            kotlin.jvm.internal.C12880j.m40222a(r5, r1)
            okhttp3.x r5 = okhttp3.C14262x.m45502a(r0, r5)
            if (r5 == 0) goto L_0x0029
            goto L_0x0031
        L_0x0029:
            r5 = 0
            r0 = 0
            byte[] r0 = new byte[r0]
            okhttp3.x r5 = okhttp3.C14262x.m45502a(r5, r0)
        L_0x0031:
            java.lang.String r0 = "requestBody"
            kotlin.jvm.internal.C12880j.m40222a(r5, r0)
            com.bamtech.core.networking.Request r2 = m7797a(r2, r3, r4, r5, (EXTRA) r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.core.networking.C1691e.m7796a(com.bamtech.core.networking.Link, okhttp3.OkHttpClient, com.bamtech.core.networking.handlers.ResponseTransformer, java.lang.String, java.lang.Object):com.bamtech.core.networking.Request");
    }

    /* renamed from: a */
    public static /* synthetic */ Request m7798a(Link link, OkHttpClient okHttpClient, ResponseTransformer responseTransformer, C14262x xVar, Object obj, int i, Object obj2) {
        if ((i & 2) != 0) {
            responseTransformer = C1698a.m7811a();
        }
        if ((i & 4) != 0) {
            xVar = C14262x.m45502a((C14258u) null, new byte[0]);
            C12880j.m40222a((Object) xVar, "OkRequestBody.create(null, byteArrayOf())");
        }
        if ((i & 8) != 0) {
            obj = null;
        }
        return m7797a(link, okHttpClient, responseTransformer, xVar, (EXTRA) obj);
    }

    /* renamed from: a */
    public static final <OUT, EXTRA> Request<OUT, EXTRA> m7797a(Link link, OkHttpClient okHttpClient, ResponseTransformer<? extends OUT> responseTransformer, C14262x xVar, EXTRA extra) {
        C14262x xVar2 = xVar;
        Link link2 = link;
        Link.verify$default(link, null, 1, null);
        HttpUrl e = HttpUrl.m44643e(link.getHref());
        if (e != null) {
            Builder i = e.mo35758i();
            if (i != null) {
                for (Entry entry : link.getQueryParams().entrySet()) {
                    i.mo35770a((String) entry.getKey(), (String) entry.getValue());
                }
                C14113a aVar = new C14113a();
                aVar.mo35843a(i.mo35772a());
                aVar.mo35844a(C14256t.m45463a(link.getHeaders()));
                String method = link.getMethod();
                if (method != null) {
                    String upperCase = method.toUpperCase();
                    C12880j.m40222a((Object) upperCase, "(this as java.lang.String).toUpperCase()");
                    switch (upperCase.hashCode()) {
                        case 70454:
                            if (upperCase.equals("GET")) {
                                aVar.mo35847b();
                                break;
                            }
                            break;
                        case 79599:
                            if (upperCase.equals("PUT")) {
                                aVar.mo35853d(xVar2);
                                break;
                            }
                            break;
                        case 2213344:
                            if (upperCase.equals("HEAD")) {
                                aVar.mo35851c();
                                break;
                            }
                            break;
                        case 2461856:
                            if (upperCase.equals("POST")) {
                                aVar.mo35852c(xVar2);
                                break;
                            }
                            break;
                        case 75900968:
                            if (upperCase.equals("PATCH")) {
                                aVar.mo35850b(xVar2);
                                break;
                            }
                            break;
                        case 2012838315:
                            if (upperCase.equals("DELETE")) {
                                aVar.mo35845a(xVar2);
                                break;
                            }
                            break;
                    }
                    C12880j.m40222a((Object) aVar, "builder");
                    Request request = new Request(okHttpClient, aVar, responseTransformer, link.getTimeout(), TimeUnit.SECONDS, extra);
                    return request;
                }
                throw new C13142s("null cannot be cast to non-null type java.lang.String");
            }
        }
        throw new C1690d(null, new IllegalArgumentException("Unable to parse URL"), 1, null);
    }

    /* renamed from: a */
    public static final <OUT, EXTRA> Call m7799a(Request<? extends OUT, ? extends EXTRA> request) {
        if (request.mo7481d() > 0) {
            Call a = request.mo7479b().mo35803q().mo35813a(request.mo7481d(), request.mo7482e()).mo35820a().mo35727a(request.mo7478a().mo35846a());
            C12880j.m40222a((Object) a, "client.newBuilder()\n    ….newCall(builder.build())");
            return a;
        }
        Call a2 = request.mo7479b().mo35727a(request.mo7478a().mo35846a());
        C12880j.m40222a((Object) a2, "client.newCall(builder.build())");
        return a2;
    }
}
