package p520io.sentry.event.p550f;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import p520io.sentry.event.p549e.C12572e;

/* renamed from: io.sentry.event.f.e */
/* compiled from: HttpInterface */
public class C12579e implements C12582h {

    /* renamed from: U */
    private final String f29143U;

    /* renamed from: V */
    private final Map<String, Collection<String>> f29144V;

    /* renamed from: W */
    private final String f29145W;

    /* renamed from: X */
    private final Map<String, String> f29146X;

    /* renamed from: Y */
    private final String f29147Y;

    /* renamed from: Z */
    private final String f29148Z;

    /* renamed from: a0 */
    private final int f29149a0;

    /* renamed from: b0 */
    private final String f29150b0;

    /* renamed from: c */
    private final String f29151c;

    /* renamed from: c0 */
    private final String f29152c0;

    /* renamed from: d0 */
    private final int f29153d0;

    /* renamed from: e0 */
    private final String f29154e0;

    /* renamed from: f0 */
    private final boolean f29155f0;

    /* renamed from: g0 */
    private final boolean f29156g0;

    /* renamed from: h0 */
    private final String f29157h0;

    /* renamed from: i0 */
    private final String f29158i0;

    /* renamed from: j0 */
    private final Map<String, Collection<String>> f29159j0;

    /* renamed from: k0 */
    private final String f29160k0;

    public C12579e(HttpServletRequest httpServletRequest, C12572e eVar) {
        this(httpServletRequest, eVar, null);
    }

    /* renamed from: Z */
    public String mo30763Z() {
        return "sentry.interfaces.Http";
    }

    /* renamed from: a */
    public String mo30782a() {
        return this.f29157h0;
    }

    /* renamed from: b */
    public String mo30783b() {
        return this.f29160k0;
    }

    /* renamed from: c */
    public Map<String, String> mo30784c() {
        return this.f29146X;
    }

    /* renamed from: d */
    public Map<String, Collection<String>> mo30785d() {
        return Collections.unmodifiableMap(this.f29159j0);
    }

    /* renamed from: e */
    public String mo30786e() {
        return this.f29150b0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12579e.class != obj.getClass()) {
            return false;
        }
        C12579e eVar = (C12579e) obj;
        if (this.f29156g0 != eVar.f29156g0 || this.f29153d0 != eVar.f29153d0 || this.f29155f0 != eVar.f29155f0 || this.f29149a0 != eVar.f29149a0) {
            return false;
        }
        String str = this.f29157h0;
        if (str == null ? eVar.f29157h0 != null : !str.equals(eVar.f29157h0)) {
            return false;
        }
        if (!this.f29146X.equals(eVar.f29146X) || !this.f29159j0.equals(eVar.f29159j0)) {
            return false;
        }
        String str2 = this.f29150b0;
        if (str2 == null ? eVar.f29150b0 != null : !str2.equals(eVar.f29150b0)) {
            return false;
        }
        String str3 = this.f29152c0;
        if (str3 == null ? eVar.f29152c0 != null : !str3.equals(eVar.f29152c0)) {
            return false;
        }
        String str4 = this.f29143U;
        if (str4 == null ? eVar.f29143U != null : !str4.equals(eVar.f29143U)) {
            return false;
        }
        if (!this.f29144V.equals(eVar.f29144V)) {
            return false;
        }
        String str5 = this.f29154e0;
        if (str5 == null ? eVar.f29154e0 != null : !str5.equals(eVar.f29154e0)) {
            return false;
        }
        String str6 = this.f29145W;
        if (str6 == null ? eVar.f29145W != null : !str6.equals(eVar.f29145W)) {
            return false;
        }
        String str7 = this.f29147Y;
        if (str7 == null ? eVar.f29147Y != null : !str7.equals(eVar.f29147Y)) {
            return false;
        }
        String str8 = this.f29158i0;
        if (str8 == null ? eVar.f29158i0 != null : !str8.equals(eVar.f29158i0)) {
            return false;
        }
        if (!this.f29151c.equals(eVar.f29151c)) {
            return false;
        }
        String str9 = this.f29148Z;
        if (str9 == null ? eVar.f29148Z != null : !str9.equals(eVar.f29148Z)) {
            return false;
        }
        String str10 = this.f29160k0;
        String str11 = eVar.f29160k0;
        return str10 == null ? str11 == null : str10.equals(str11);
    }

    /* renamed from: f */
    public String mo30788f() {
        return this.f29152c0;
    }

    /* renamed from: g */
    public int mo30789g() {
        return this.f29153d0;
    }

    /* renamed from: h */
    public String mo30790h() {
        return this.f29143U;
    }

    public int hashCode() {
        int hashCode = this.f29151c.hashCode() * 31;
        String str = this.f29143U;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f29144V.hashCode();
    }

    /* renamed from: i */
    public Map<String, Collection<String>> mo30792i() {
        return Collections.unmodifiableMap(this.f29144V);
    }

    /* renamed from: j */
    public String mo30793j() {
        return this.f29154e0;
    }

    /* renamed from: k */
    public String mo30794k() {
        return this.f29145W;
    }

    /* renamed from: l */
    public String mo30795l() {
        return this.f29147Y;
    }

    /* renamed from: m */
    public String mo30796m() {
        return this.f29158i0;
    }

    /* renamed from: n */
    public String mo30797n() {
        return this.f29151c;
    }

    /* renamed from: o */
    public String mo30798o() {
        return this.f29148Z;
    }

    /* renamed from: p */
    public int mo30799p() {
        return this.f29149a0;
    }

    /* renamed from: q */
    public boolean mo30800q() {
        return this.f29156g0;
    }

    /* renamed from: r */
    public boolean mo30801r() {
        return this.f29155f0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HttpInterface{requestUrl='");
        sb.append(this.f29151c);
        sb.append('\'');
        sb.append(", method='");
        sb.append(this.f29143U);
        sb.append('\'');
        sb.append(", queryString='");
        sb.append(this.f29145W);
        sb.append('\'');
        sb.append(", parameters=");
        sb.append(this.f29144V);
        sb.append('}');
        return sb.toString();
    }

    public C12579e(HttpServletRequest httpServletRequest, C12572e eVar, String str) {
        Cookie[] cookies;
        this.f29151c = httpServletRequest.getRequestURL().toString();
        this.f29143U = httpServletRequest.getMethod();
        this.f29144V = new HashMap();
        for (Entry entry : httpServletRequest.getParameterMap().entrySet()) {
            this.f29144V.put(entry.getKey(), Arrays.asList((Object[]) entry.getValue()));
        }
        this.f29145W = httpServletRequest.getQueryString();
        if (httpServletRequest.getCookies() != null) {
            this.f29146X = new HashMap();
            for (Cookie cookie : httpServletRequest.getCookies()) {
                this.f29146X.put(cookie.getName(), cookie.getValue());
            }
        } else {
            this.f29146X = Collections.emptyMap();
        }
        this.f29147Y = eVar.mo30760a(httpServletRequest);
        this.f29148Z = httpServletRequest.getServerName();
        this.f29149a0 = httpServletRequest.getServerPort();
        this.f29150b0 = httpServletRequest.getLocalAddr();
        this.f29152c0 = httpServletRequest.getLocalName();
        this.f29153d0 = httpServletRequest.getLocalPort();
        this.f29154e0 = httpServletRequest.getProtocol();
        this.f29155f0 = httpServletRequest.isSecure();
        this.f29156g0 = httpServletRequest.isAsyncStarted();
        this.f29157h0 = httpServletRequest.getAuthType();
        this.f29158i0 = httpServletRequest.getRemoteUser();
        this.f29159j0 = new HashMap();
        Iterator it = Collections.list(httpServletRequest.getHeaderNames()).iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            this.f29159j0.put(str2, Collections.list(httpServletRequest.getHeaders(str2)));
        }
        this.f29160k0 = str;
    }
}
