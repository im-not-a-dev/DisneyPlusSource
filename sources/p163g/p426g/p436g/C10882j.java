package p163g.p426g.p436g;

import com.facebook.stetho.common.Utf8Charset;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import p163g.p426g.p427a.C10811c;
import p163g.p426g.p434e.C10852a;

/* renamed from: g.g.g.j */
/* compiled from: Ping */
public class C10882j {

    /* renamed from: g */
    public static String f25785g = "https://pings.conviva.com/ping.ping";

    /* renamed from: a */
    private C10878g f25786a;

    /* renamed from: b */
    private C10877f f25787b;

    /* renamed from: c */
    private boolean f25788c = false;

    /* renamed from: d */
    private boolean f25789d = false;

    /* renamed from: e */
    private String f25790e = null;

    /* renamed from: f */
    private C10811c f25791f;

    public C10882j(C10878g gVar, C10877f fVar, C10811c cVar) {
        this.f25786a = gVar;
        this.f25786a.mo27989b("Ping");
        this.f25787b = fVar;
        this.f25791f = cVar;
    }

    /* renamed from: b */
    private String m34334b(String str) throws UnsupportedEncodingException {
        return URLEncoder.encode(str, Utf8Charset.NAME);
    }

    /* renamed from: a */
    public void mo27997a(String str) {
        if (!this.f25788c) {
            try {
                this.f25788c = true;
                mo27996a();
                StringBuilder sb = new StringBuilder();
                sb.append(this.f25790e);
                sb.append("&d=");
                sb.append(m34334b(str));
                String sb2 = sb.toString();
                C10878g gVar = this.f25786a;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("send(): ");
                sb3.append(sb2);
                gVar.mo27988a(sb3.toString());
                this.f25787b.mo27987a("GET", sb2, null, null, null);
                this.f25788c = false;
            } catch (Exception unused) {
                this.f25788c = false;
                this.f25786a.mo27988a("failed to send ping");
            }
        }
    }

    /* renamed from: a */
    public void mo27996a() {
        if (!this.f25789d) {
            StringBuilder sb = new StringBuilder();
            sb.append(f25785g);
            sb.append("?comp=");
            sb.append("sdkjava");
            sb.append("&clv=");
            sb.append("2.145.3");
            this.f25790e = sb.toString();
            if (this.f25791f != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f25790e);
                sb2.append("&cid=");
                sb2.append(this.f25791f.f25550a);
                this.f25790e = sb2.toString();
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f25790e);
            sb3.append("&sch=");
            sb3.append(C10852a.f25650e);
            this.f25790e = sb3.toString();
            if (this.f25791f != null) {
                this.f25789d = true;
            }
        }
    }
}
