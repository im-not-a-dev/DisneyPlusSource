package okhttp3;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.C14256t.C14257a;
import okhttp3.p688d0.C14126e;
import okhttp3.p688d0.p691i.C14164f;

public final class Request {

    /* renamed from: a */
    final HttpUrl f31276a;

    /* renamed from: b */
    final String f31277b;

    /* renamed from: c */
    final C14256t f31278c;

    /* renamed from: d */
    final C14262x f31279d;

    /* renamed from: e */
    final Map<Class<?>, Object> f31280e;

    /* renamed from: f */
    private volatile CacheControl f31281f;

    /* renamed from: okhttp3.Request$a */
    public static class C14113a {

        /* renamed from: a */
        HttpUrl f31282a;

        /* renamed from: b */
        String f31283b;

        /* renamed from: c */
        C14257a f31284c;

        /* renamed from: d */
        C14262x f31285d;

        /* renamed from: e */
        Map<Class<?>, Object> f31286e;

        public C14113a() {
            this.f31286e = Collections.emptyMap();
            this.f31283b = "GET";
            this.f31284c = new C14257a();
        }

        /* renamed from: a */
        public C14113a mo35843a(HttpUrl httpUrl) {
            if (httpUrl != null) {
                this.f31282a = httpUrl;
                return this;
            }
            throw new NullPointerException("url == null");
        }

        /* renamed from: b */
        public C14113a mo35848b(String str) {
            if (str != null) {
                if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("http:");
                    sb.append(str.substring(3));
                    str = sb.toString();
                } else {
                    if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("https:");
                        sb2.append(str.substring(4));
                        str = sb2.toString();
                    }
                }
                mo35843a(HttpUrl.m44642d(str));
                return this;
            }
            throw new NullPointerException("url == null");
        }

        /* renamed from: c */
        public C14113a mo35851c() {
            mo35841a("HEAD", (C14262x) null);
            return this;
        }

        /* renamed from: d */
        public C14113a mo35853d(C14262x xVar) {
            mo35841a("PUT", xVar);
            return this;
        }

        /* renamed from: c */
        public C14113a mo35852c(C14262x xVar) {
            mo35841a("POST", xVar);
            return this;
        }

        /* renamed from: a */
        public C14113a mo35840a(String str, String str2) {
            this.f31284c.mo36254a(str, str2);
            return this;
        }

        /* renamed from: a */
        public C14113a mo35839a(String str) {
            this.f31284c.mo36258c(str);
            return this;
        }

        C14113a(Request request) {
            Map<Class<?>, Object> map;
            this.f31286e = Collections.emptyMap();
            this.f31282a = request.f31276a;
            this.f31283b = request.f31277b;
            this.f31285d = request.f31279d;
            if (request.f31280e.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = new LinkedHashMap<>(request.f31280e);
            }
            this.f31286e = map;
            this.f31284c = request.f31278c.mo36245a();
        }

        /* renamed from: a */
        public C14113a mo35844a(C14256t tVar) {
            this.f31284c = tVar.mo36245a();
            return this;
        }

        /* renamed from: a */
        public C14113a mo35842a(CacheControl cacheControl) {
            String cacheControl2 = cacheControl.toString();
            String str = "Cache-Control";
            if (cacheControl2.isEmpty()) {
                mo35839a(str);
                return this;
            }
            mo35849b(str, cacheControl2);
            return this;
        }

        /* renamed from: b */
        public C14113a mo35849b(String str, String str2) {
            this.f31284c.mo36259c(str, str2);
            return this;
        }

        /* renamed from: b */
        public C14113a mo35847b() {
            mo35841a("GET", (C14262x) null);
            return this;
        }

        /* renamed from: a */
        public C14113a mo35845a(C14262x xVar) {
            mo35841a("DELETE", xVar);
            return this;
        }

        /* renamed from: b */
        public C14113a mo35850b(C14262x xVar) {
            mo35841a("PATCH", xVar);
            return this;
        }

        /* renamed from: a */
        public C14113a mo35841a(String str, C14262x xVar) {
            if (str == null) {
                throw new NullPointerException("method == null");
            } else if (str.length() != 0) {
                String str2 = "method ";
                if (xVar != null && !C14164f.m45026b(str)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(str);
                    sb.append(" must not have a request body.");
                    throw new IllegalArgumentException(sb.toString());
                } else if (xVar != null || !C14164f.m45029e(str)) {
                    this.f31283b = str;
                    this.f31285d = xVar;
                    return this;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str2);
                    sb2.append(str);
                    sb2.append(" must have a request body.");
                    throw new IllegalArgumentException(sb2.toString());
                }
            } else {
                throw new IllegalArgumentException("method.length() == 0");
            }
        }

        /* renamed from: a */
        public Request mo35846a() {
            if (this.f31282a != null) {
                return new Request(this);
            }
            throw new IllegalStateException("url == null");
        }
    }

    Request(C14113a aVar) {
        this.f31276a = aVar.f31282a;
        this.f31277b = aVar.f31283b;
        this.f31278c = aVar.f31284c.mo36255a();
        this.f31279d = aVar.f31285d;
        this.f31280e = C14126e.m44826a(aVar.f31286e);
    }

    /* renamed from: a */
    public String mo35829a(String str) {
        return this.f31278c.mo36244a(str);
    }

    /* renamed from: b */
    public List<String> mo35831b(String str) {
        return this.f31278c.mo36248b(str);
    }

    /* renamed from: c */
    public C14256t mo35833c() {
        return this.f31278c;
    }

    /* renamed from: d */
    public boolean mo35834d() {
        return this.f31276a.mo35756h();
    }

    /* renamed from: e */
    public String mo35835e() {
        return this.f31277b;
    }

    /* renamed from: f */
    public C14113a mo35836f() {
        return new C14113a(this);
    }

    /* renamed from: g */
    public HttpUrl mo35837g() {
        return this.f31276a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(this.f31277b);
        sb.append(", url=");
        sb.append(this.f31276a);
        sb.append(", tags=");
        sb.append(this.f31280e);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public C14262x mo35830a() {
        return this.f31279d;
    }

    /* renamed from: b */
    public CacheControl mo35832b() {
        CacheControl cacheControl = this.f31281f;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl a = CacheControl.m44586a(this.f31278c);
        this.f31281f = a;
        return a;
    }
}
