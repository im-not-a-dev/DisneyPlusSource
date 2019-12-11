package okhttp3.p688d0.p691i;

import com.facebook.stetho.server.http.HttpHeaders;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.C14262x;
import okhttp3.C14266z;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Request.C14113a;
import okhttp3.Response;
import okhttp3.p688d0.C14126e;
import okhttp3.p688d0.p690h.C14155k;

/* renamed from: okhttp3.d0.i.j */
/* compiled from: RetryAndFollowUpInterceptor */
public final class C14168j implements Interceptor {

    /* renamed from: a */
    private final OkHttpClient f31503a;

    public C14168j(OkHttpClient okHttpClient) {
        this.f31503a = okHttpClient;
    }

    /* renamed from: a */
    private boolean m45048a(IOException iOException, C14155k kVar, boolean z, Request request) {
        if (!this.f31503a.mo35810x()) {
            return false;
        }
        if ((!z || !m45047a(iOException, request)) && m45049a(iOException, z) && kVar.mo35993b()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b1, code lost:
        r1.mo35995d();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain r9) throws java.io.IOException {
        /*
            r8 = this;
            okhttp3.Request r0 = r9.mo35785m0()
            okhttp3.d0.i.g r9 = (okhttp3.p688d0.p691i.C14165g) r9
            okhttp3.d0.h.k r1 = r9.mo36014f()
            r2 = 0
            r3 = 0
            r4 = r3
            r5 = 0
        L_0x000e:
            r1.mo35991a(r0)
            boolean r6 = r1.mo35997f()
            if (r6 != 0) goto L_0x00bf
            okhttp3.Response r0 = r9.mo36012a(r0, r1, r3)     // Catch:{ i -> 0x00a6, IOException -> 0x0096 }
            if (r4 == 0) goto L_0x0033
            okhttp3.Response$a r0 = r0.mo35866i()
            okhttp3.Response$a r4 = r4.mo35866i()
            r4.mo35882a(r3)
            okhttp3.Response r4 = r4.mo35883a()
            r0.mo35888c(r4)
            okhttp3.Response r0 = r0.mo35883a()
        L_0x0033:
            r4 = r0
            okhttp3.d0.c r0 = okhttp3.p688d0.C14124c.f31328a
            okhttp3.d0.h.d r0 = r0.mo35822a(r4)
            if (r0 == 0) goto L_0x0045
            okhttp3.d0.h.f r6 = r0.mo35939b()
            okhttp3.z r6 = r6.mo35967f()
            goto L_0x0046
        L_0x0045:
            r6 = r3
        L_0x0046:
            okhttp3.Request r6 = r8.m45046a(r4, r6)
            if (r6 != 0) goto L_0x0058
            if (r0 == 0) goto L_0x0057
            boolean r9 = r0.mo35944f()
            if (r9 == 0) goto L_0x0057
            r1.mo35999h()
        L_0x0057:
            return r4
        L_0x0058:
            okhttp3.x r7 = r6.mo35830a()
            if (r7 == 0) goto L_0x0065
            boolean r7 = r7.mo36276d()
            if (r7 == 0) goto L_0x0065
            return r4
        L_0x0065:
            okhttp3.y r7 = r4.mo35855a()
            okhttp3.p688d0.C14126e.m44830a(r7)
            boolean r7 = r1.mo35996e()
            if (r7 == 0) goto L_0x0075
            r0.mo35941c()
        L_0x0075:
            int r5 = r5 + 1
            r0 = 20
            if (r5 > r0) goto L_0x007d
            r0 = r6
            goto L_0x000e
        L_0x007d:
            java.net.ProtocolException r9 = new java.net.ProtocolException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Too many follow-up requests: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        L_0x0094:
            r9 = move-exception
            goto L_0x00bb
        L_0x0096:
            r6 = move-exception
            boolean r7 = r6 instanceof okhttp3.p688d0.p693k.C14178a     // Catch:{ all -> 0x0094 }
            if (r7 != 0) goto L_0x009d
            r7 = 1
            goto L_0x009e
        L_0x009d:
            r7 = 0
        L_0x009e:
            boolean r7 = r8.m45048a(r6, r1, r7, r0)     // Catch:{ all -> 0x0094 }
            if (r7 == 0) goto L_0x00a5
            goto L_0x00b1
        L_0x00a5:
            throw r6     // Catch:{ all -> 0x0094 }
        L_0x00a6:
            r6 = move-exception
            java.io.IOException r7 = r6.mo35981b()     // Catch:{ all -> 0x0094 }
            boolean r7 = r8.m45048a(r7, r1, r2, r0)     // Catch:{ all -> 0x0094 }
            if (r7 == 0) goto L_0x00b6
        L_0x00b1:
            r1.mo35995d()
            goto L_0x000e
        L_0x00b6:
            java.io.IOException r9 = r6.mo35979a()     // Catch:{ all -> 0x0094 }
            throw r9     // Catch:{ all -> 0x0094 }
        L_0x00bb:
            r1.mo35995d()
            throw r9
        L_0x00bf:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r0 = "Canceled"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.p688d0.p691i.C14168j.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }

    /* renamed from: a */
    private boolean m45047a(IOException iOException, Request request) {
        C14262x a = request.mo35830a();
        return (a != null && a.mo36276d()) || (iOException instanceof FileNotFoundException);
    }

    /* renamed from: a */
    private boolean m45049a(IOException iOException, boolean z) {
        boolean z2 = false;
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if ((iOException instanceof SocketTimeoutException) && !z) {
                z2 = true;
            }
            return z2;
        } else if ((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    private Request m45046a(Response response, C14266z zVar) throws IOException {
        Proxy proxy;
        if (response != null) {
            int c = response.mo35858c();
            String e = response.mo35870m().mo35835e();
            String str = "GET";
            C14262x xVar = null;
            if (c == 307 || c == 308) {
                if (!e.equals(str) && !e.equals("HEAD")) {
                    return null;
                }
            } else if (c == 401) {
                return this.f31503a.mo35787a().mo35889a(zVar, response);
            } else {
                if (c != 503) {
                    if (c == 407) {
                        if (zVar != null) {
                            proxy = zVar.mo36281b();
                        } else {
                            proxy = this.f31503a.mo35806t();
                        }
                        if (proxy.type() == Type.HTTP) {
                            return this.f31503a.mo35807u().mo35889a(zVar, response);
                        }
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    } else if (c != 408) {
                        switch (c) {
                            case 300:
                            case 301:
                            case 302:
                            case 303:
                                break;
                            default:
                                return null;
                        }
                    } else if (!this.f31503a.mo35810x()) {
                        return null;
                    } else {
                        C14262x a = response.mo35870m().mo35830a();
                        if (a != null && a.mo36276d()) {
                            return null;
                        }
                        if ((response.mo35867j() == null || response.mo35867j().mo35858c() != 408) && m45045a(response, 0) <= 0) {
                            return response.mo35870m();
                        }
                        return null;
                    }
                } else if ((response.mo35867j() == null || response.mo35867j().mo35858c() != 503) && m45045a(response, Integer.MAX_VALUE) == 0) {
                    return response.mo35870m();
                } else {
                    return null;
                }
            }
            if (!this.f31503a.mo35797k()) {
                return null;
            }
            String e2 = response.mo35861e("Location");
            if (e2 == null) {
                return null;
            }
            HttpUrl b = response.mo35870m().mo35837g().mo35749b(e2);
            if (b == null) {
                return null;
            }
            if (!b.mo35764o().equals(response.mo35870m().mo35837g().mo35764o()) && !this.f31503a.mo35798l()) {
                return null;
            }
            C14113a f = response.mo35870m().mo35836f();
            if (C14164f.m45026b(e)) {
                boolean d = C14164f.m45028d(e);
                if (C14164f.m45027c(e)) {
                    f.mo35841a(str, (C14262x) null);
                } else {
                    if (d) {
                        xVar = response.mo35870m().mo35830a();
                    }
                    f.mo35841a(e, xVar);
                }
                if (!d) {
                    f.mo35839a("Transfer-Encoding");
                    f.mo35839a(HttpHeaders.CONTENT_LENGTH);
                    f.mo35839a(HttpHeaders.CONTENT_TYPE);
                }
            }
            if (!C14126e.m44835a(response.mo35870m().mo35837g(), b)) {
                f.mo35839a("Authorization");
            }
            f.mo35843a(b);
            return f.mo35846a();
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    private int m45045a(Response response, int i) {
        String e = response.mo35861e("Retry-After");
        if (e == null) {
            return i;
        }
        if (e.matches("\\d+")) {
            return Integer.valueOf(e).intValue();
        }
        return Integer.MAX_VALUE;
    }
}
