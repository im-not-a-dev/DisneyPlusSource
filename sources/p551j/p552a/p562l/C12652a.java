package p551j.p552a.p562l;

import com.facebook.stetho.common.Utf8Charset;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import p551j.p552a.p557i.C12607d;
import p551j.p552a.p569r.C12677b;
import p602m.p609c.C13459b;
import p602m.p609c.C13460c;

/* renamed from: j.a.l.a */
/* compiled from: Dsn */
public class C12652a {

    /* renamed from: k */
    private static final C13459b f29331k = C13460c.m41415a(C12652a.class);

    /* renamed from: a */
    private String f29332a;

    /* renamed from: b */
    private String f29333b;

    /* renamed from: c */
    private String f29334c;

    /* renamed from: d */
    private String f29335d;

    /* renamed from: e */
    private String f29336e;

    /* renamed from: f */
    private int f29337f;

    /* renamed from: g */
    private String f29338g;

    /* renamed from: h */
    private Set<String> f29339h;

    /* renamed from: i */
    private Map<String, String> f29340i;

    /* renamed from: j */
    private URI f29341j;

    public C12652a(String str) throws C12653b {
        this(URI.create(str));
    }

    /* renamed from: a */
    private void m39674a(URI uri) {
        this.f29336e = uri.getHost();
        this.f29337f = uri.getPort();
    }

    /* renamed from: b */
    private void m39675b(URI uri) {
        String str = Utf8Charset.NAME;
        String query = uri.getQuery();
        if (query != null && !query.isEmpty()) {
            String[] split = query.split("&");
            int length = split.length;
            int i = 0;
            while (i < length) {
                String str2 = split[i];
                try {
                    String[] split2 = str2.split("=");
                    this.f29340i.put(URLDecoder.decode(split2[0], str), split2.length > 1 ? URLDecoder.decode(split2[1], str) : null);
                    i++;
                } catch (UnsupportedEncodingException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Impossible to decode the query parameter '");
                    sb.append(str2);
                    sb.append("'");
                    throw new IllegalArgumentException(sb.toString(), e);
                }
            }
        }
    }

    /* renamed from: c */
    private void m39676c(URI uri) {
        String path = uri.getPath();
        if (path != null) {
            int lastIndexOf = path.lastIndexOf("/") + 1;
            this.f29338g = path.substring(0, lastIndexOf);
            this.f29334c = path.substring(lastIndexOf);
        }
    }

    /* renamed from: d */
    private void m39677d(URI uri) {
        String scheme = uri.getScheme();
        if (scheme != null) {
            String[] split = scheme.split("\\+");
            this.f29339h.addAll(Arrays.asList(split).subList(0, split.length - 1));
            this.f29335d = split[split.length - 1];
        }
    }

    /* renamed from: e */
    private void m39678e(URI uri) {
        String userInfo = uri.getUserInfo();
        if (userInfo != null) {
            String[] split = userInfo.split(":");
            this.f29333b = split[0];
            if (split.length > 1) {
                this.f29332a = split[1];
            }
        }
    }

    /* renamed from: h */
    public static String m39679h() {
        String a = C12607d.m39603a("dsn");
        if (C12677b.m39771a(a)) {
            a = C12607d.m39603a("dns");
        }
        if (!C12677b.m39771a(a)) {
            return a;
        }
        f29331k.mo34724b("*** Couldn't find a suitable DSN, Sentry operations will do nothing! See documentation: https://docs.sentry.io/clients/java/ ***");
        return "noop://localhost?async=false";
    }

    /* renamed from: i */
    private void m39680i() {
        this.f29340i = Collections.unmodifiableMap(this.f29340i);
        this.f29339h = Collections.unmodifiableSet(this.f29339h);
    }

    /* renamed from: j */
    private void m39681j() {
        LinkedList linkedList = new LinkedList();
        if (this.f29336e == null) {
            linkedList.add("host");
        }
        String str = this.f29335d;
        if (str != null && !str.equalsIgnoreCase("noop") && !this.f29335d.equalsIgnoreCase("out")) {
            if (this.f29333b == null) {
                linkedList.add("public key");
            }
            String str2 = this.f29334c;
            if (str2 == null || str2.isEmpty()) {
                linkedList.add("project ID");
            }
        }
        if (!linkedList.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid DSN, the following properties aren't set '");
            sb.append(linkedList);
            sb.append("'");
            throw new C12653b(sb.toString());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12652a.class != obj.getClass()) {
            return false;
        }
        C12652a aVar = (C12652a) obj;
        if (this.f29337f != aVar.f29337f || !this.f29336e.equals(aVar.f29336e) || !this.f29340i.equals(aVar.f29340i) || !this.f29338g.equals(aVar.f29338g) || !this.f29334c.equals(aVar.f29334c)) {
            return false;
        }
        String str = this.f29335d;
        if (str == null ? aVar.f29335d == null : str.equals(aVar.f29335d)) {
            return this.f29339h.equals(aVar.f29339h) && this.f29333b.equals(aVar.f29333b) && C12677b.m39770a((Object) this.f29332a, (Object) aVar.f29332a);
        }
        return false;
    }

    /* renamed from: f */
    public String mo30969f() {
        return this.f29332a;
    }

    /* renamed from: g */
    public URI mo30970g() {
        return this.f29341j;
    }

    public int hashCode() {
        return (((((((this.f29333b.hashCode() * 31) + this.f29334c.hashCode()) * 31) + this.f29336e.hashCode()) * 31) + this.f29337f) * 31) + this.f29338g.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dsn{uri=");
        sb.append(this.f29341j);
        sb.append('}');
        return sb.toString();
    }

    public C12652a(URI uri) throws C12653b {
        if (uri != null) {
            this.f29340i = new HashMap();
            this.f29339h = new HashSet();
            m39677d(uri);
            m39678e(uri);
            m39674a(uri);
            m39676c(uri);
            m39675b(uri);
            m39680i();
            m39681j();
            try {
                URI uri2 = new URI(this.f29335d, null, this.f29336e, this.f29337f, this.f29338g, null, null);
                this.f29341j = uri2;
            } catch (URISyntaxException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Impossible to determine Sentry's URI from the DSN '");
                sb.append(uri);
                sb.append("'");
                throw new C12653b(sb.toString(), e);
            }
        } else {
            throw new C12653b("DSN constructed with null value!");
        }
    }

    /* renamed from: a */
    public Map<String, String> mo30963a() {
        return this.f29340i;
    }

    /* renamed from: c */
    public String mo30965c() {
        return this.f29335d;
    }

    /* renamed from: d */
    public Set<String> mo30966d() {
        return this.f29339h;
    }

    /* renamed from: e */
    public String mo30967e() {
        return this.f29333b;
    }

    /* renamed from: b */
    public String mo30964b() {
        return this.f29334c;
    }
}
