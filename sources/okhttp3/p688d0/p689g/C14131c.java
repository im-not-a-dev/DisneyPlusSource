package okhttp3.p688d0.p689g;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import okhttp3.C14256t;
import okhttp3.C14256t.C14257a;
import okhttp3.CacheControl;
import okhttp3.Request;
import okhttp3.Request.C14113a;
import okhttp3.Response;
import okhttp3.Response.C14114a;
import okhttp3.p688d0.C14124c;
import okhttp3.p688d0.p691i.C14161d;
import okhttp3.p688d0.p691i.C14163e;

/* renamed from: okhttp3.d0.g.c */
/* compiled from: CacheStrategy */
public final class C14131c {

    /* renamed from: a */
    public final Request f31346a;

    /* renamed from: b */
    public final Response f31347b;

    /* renamed from: okhttp3.d0.g.c$a */
    /* compiled from: CacheStrategy */
    public static class C14132a {

        /* renamed from: a */
        final long f31348a;

        /* renamed from: b */
        final Request f31349b;

        /* renamed from: c */
        final Response f31350c;

        /* renamed from: d */
        private Date f31351d;

        /* renamed from: e */
        private String f31352e;

        /* renamed from: f */
        private Date f31353f;

        /* renamed from: g */
        private String f31354g;

        /* renamed from: h */
        private Date f31355h;

        /* renamed from: i */
        private long f31356i;

        /* renamed from: j */
        private long f31357j;

        /* renamed from: k */
        private String f31358k;

        /* renamed from: l */
        private int f31359l = -1;

        public C14132a(long j, Request request, Response response) {
            this.f31348a = j;
            this.f31349b = request;
            this.f31350c = response;
            if (response != null) {
                this.f31356i = response.mo35871n();
                this.f31357j = response.mo35869l();
                C14256t e = response.mo35862e();
                int b = e.mo36246b();
                for (int i = 0; i < b; i++) {
                    String a = e.mo36243a(i);
                    String b2 = e.mo36247b(i);
                    if ("Date".equalsIgnoreCase(a)) {
                        this.f31351d = C14161d.m45009a(b2);
                        this.f31352e = b2;
                    } else if ("Expires".equalsIgnoreCase(a)) {
                        this.f31355h = C14161d.m45009a(b2);
                    } else if ("Last-Modified".equalsIgnoreCase(a)) {
                        this.f31353f = C14161d.m45009a(b2);
                        this.f31354g = b2;
                    } else if ("ETag".equalsIgnoreCase(a)) {
                        this.f31358k = b2;
                    } else if ("Age".equalsIgnoreCase(a)) {
                        this.f31359l = C14163e.m45010a(b2, -1);
                    }
                }
            }
        }

        /* renamed from: b */
        private long m44859b() {
            Date date = this.f31351d;
            long j = 0;
            if (date != null) {
                j = Math.max(0, this.f31357j - date.getTime());
            }
            int i = this.f31359l;
            if (i != -1) {
                j = Math.max(j, TimeUnit.SECONDS.toMillis((long) i));
            }
            long j2 = this.f31357j;
            return j + (j2 - this.f31356i) + (this.f31348a - j2);
        }

        /* renamed from: c */
        private long m44860c() {
            long j;
            long j2;
            CacheControl b = this.f31350c.mo35857b();
            if (b.mo35710c() != -1) {
                return TimeUnit.SECONDS.toMillis((long) b.mo35710c());
            }
            long j3 = 0;
            if (this.f31355h != null) {
                Date date = this.f31351d;
                if (date != null) {
                    j2 = date.getTime();
                } else {
                    j2 = this.f31357j;
                }
                long time = this.f31355h.getTime() - j2;
                if (time > 0) {
                    j3 = time;
                }
                return j3;
            }
            if (this.f31353f != null && this.f31350c.mo35870m().mo35837g().mo35761l() == null) {
                Date date2 = this.f31351d;
                if (date2 != null) {
                    j = date2.getTime();
                } else {
                    j = this.f31356i;
                }
                long time2 = j - this.f31353f.getTime();
                if (time2 > 0) {
                    j3 = time2 / 10;
                }
            }
            return j3;
        }

        /* renamed from: d */
        private C14131c m44861d() {
            if (this.f31350c == null) {
                return new C14131c(this.f31349b, null);
            }
            if (this.f31349b.mo35834d() && this.f31350c.mo35860d() == null) {
                return new C14131c(this.f31349b, null);
            }
            if (!C14131c.m44857a(this.f31350c, this.f31349b)) {
                return new C14131c(this.f31349b, null);
            }
            CacheControl b = this.f31349b.mo35832b();
            if (b.mo35714g() || m44858a(this.f31349b)) {
                return new C14131c(this.f31349b, null);
            }
            CacheControl b2 = this.f31350c.mo35857b();
            long b3 = m44859b();
            long c = m44860c();
            if (b.mo35710c() != -1) {
                c = Math.min(c, TimeUnit.SECONDS.toMillis((long) b.mo35710c()));
            }
            long j = 0;
            long millis = b.mo35712e() != -1 ? TimeUnit.SECONDS.toMillis((long) b.mo35712e()) : 0;
            if (!b2.mo35713f() && b.mo35711d() != -1) {
                j = TimeUnit.SECONDS.toMillis((long) b.mo35711d());
            }
            if (!b2.mo35714g()) {
                long j2 = millis + b3;
                if (j2 < j + c) {
                    C14114a i = this.f31350c.mo35866i();
                    String str = "Warning";
                    if (j2 >= c) {
                        i.mo35876a(str, "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (b3 > 86400000 && m44862e()) {
                        i.mo35876a(str, "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new C14131c(null, i.mo35883a());
                }
            }
            String str2 = this.f31358k;
            String str3 = "If-Modified-Since";
            if (str2 != null) {
                str3 = "If-None-Match";
            } else if (this.f31353f != null) {
                str2 = this.f31354g;
            } else if (this.f31351d == null) {
                return new C14131c(this.f31349b, null);
            } else {
                str2 = this.f31352e;
            }
            C14257a a = this.f31349b.mo35833c().mo36245a();
            C14124c.f31328a.mo35827a(a, str3, str2);
            C14113a f = this.f31349b.mo35836f();
            f.mo35844a(a.mo36255a());
            return new C14131c(f.mo35846a(), this.f31350c);
        }

        /* renamed from: e */
        private boolean m44862e() {
            return this.f31350c.mo35857b().mo35710c() == -1 && this.f31355h == null;
        }

        /* renamed from: a */
        public C14131c mo35900a() {
            C14131c d = m44861d();
            return (d.f31346a == null || !this.f31349b.mo35832b().mo35716i()) ? d : new C14131c(null, null);
        }

        /* renamed from: a */
        private static boolean m44858a(Request request) {
            return (request.mo35829a("If-Modified-Since") == null && request.mo35829a("If-None-Match") == null) ? false : true;
        }
    }

    C14131c(Request request, Response response) {
        this.f31346a = request;
        this.f31347b = response;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        if (r3.mo35857b().mo35708a() == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0059, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m44857a(okhttp3.Response r3, okhttp3.Request r4) {
        /*
            int r0 = r3.mo35858c()
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r0 == r1) goto L_0x005a
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 414(0x19e, float:5.8E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L_0x0031
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L_0x005a
            switch(r0) {
                case 300: goto L_0x005a;
                case 301: goto L_0x005a;
                case 302: goto L_0x0031;
                default: goto L_0x0030;
            }
        L_0x0030:
            goto L_0x0059
        L_0x0031:
            java.lang.String r0 = "Expires"
            java.lang.String r0 = r3.mo35861e(r0)
            if (r0 != 0) goto L_0x005a
            okhttp3.CacheControl r0 = r3.mo35857b()
            int r0 = r0.mo35710c()
            r1 = -1
            if (r0 != r1) goto L_0x005a
            okhttp3.CacheControl r0 = r3.mo35857b()
            boolean r0 = r0.mo35709b()
            if (r0 != 0) goto L_0x005a
            okhttp3.CacheControl r0 = r3.mo35857b()
            boolean r0 = r0.mo35708a()
            if (r0 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            return r2
        L_0x005a:
            okhttp3.CacheControl r3 = r3.mo35857b()
            boolean r3 = r3.mo35715h()
            if (r3 != 0) goto L_0x006f
            okhttp3.CacheControl r3 = r4.mo35832b()
            boolean r3 = r3.mo35715h()
            if (r3 != 0) goto L_0x006f
            r2 = 1
        L_0x006f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.p688d0.p689g.C14131c.m44857a(okhttp3.Response, okhttp3.Request):boolean");
    }
}
