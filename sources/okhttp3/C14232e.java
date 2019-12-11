package okhttp3;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.HttpUrl.Builder;
import okhttp3.p688d0.C14126e;

/* renamed from: okhttp3.e */
/* compiled from: Address */
public final class C14232e {

    /* renamed from: a */
    final HttpUrl f31728a;

    /* renamed from: b */
    final C14251q f31729b;

    /* renamed from: c */
    final SocketFactory f31730c;

    /* renamed from: d */
    final C14234g f31731d;

    /* renamed from: e */
    final List<C14259v> f31732e;

    /* renamed from: f */
    final List<C14245m> f31733f;

    /* renamed from: g */
    final ProxySelector f31734g;

    /* renamed from: h */
    final Proxy f31735h;

    /* renamed from: i */
    final SSLSocketFactory f31736i;

    /* renamed from: j */
    final HostnameVerifier f31737j;

    /* renamed from: k */
    final C14236i f31738k;

    public C14232e(String str, int i, C14251q qVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C14236i iVar, C14234g gVar, Proxy proxy, List<C14259v> list, List<C14245m> list2, ProxySelector proxySelector) {
        this.f31728a = new Builder().mo35777d(sSLSocketFactory != null ? "https" : "http").mo35774b(str).mo35768a(i).mo35772a();
        if (qVar != null) {
            this.f31729b = qVar;
            if (socketFactory != null) {
                this.f31730c = socketFactory;
                if (gVar != null) {
                    this.f31731d = gVar;
                    if (list != null) {
                        this.f31732e = C14126e.m44823a(list);
                        if (list2 != null) {
                            this.f31733f = C14126e.m44823a(list2);
                            if (proxySelector != null) {
                                this.f31734g = proxySelector;
                                this.f31735h = proxy;
                                this.f31736i = sSLSocketFactory;
                                this.f31737j = hostnameVerifier;
                                this.f31738k = iVar;
                                return;
                            }
                            throw new NullPointerException("proxySelector == null");
                        }
                        throw new NullPointerException("connectionSpecs == null");
                    }
                    throw new NullPointerException("protocols == null");
                }
                throw new NullPointerException("proxyAuthenticator == null");
            }
            throw new NullPointerException("socketFactory == null");
        }
        throw new NullPointerException("dns == null");
    }

    /* renamed from: a */
    public C14236i mo36163a() {
        return this.f31738k;
    }

    /* renamed from: b */
    public List<C14245m> mo36165b() {
        return this.f31733f;
    }

    /* renamed from: c */
    public C14251q mo36166c() {
        return this.f31729b;
    }

    /* renamed from: d */
    public HostnameVerifier mo36167d() {
        return this.f31737j;
    }

    /* renamed from: e */
    public List<C14259v> mo36168e() {
        return this.f31732e;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C14232e) {
            C14232e eVar = (C14232e) obj;
            if (this.f31728a.equals(eVar.f31728a) && mo36164a(eVar)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public Proxy mo36170f() {
        return this.f31735h;
    }

    /* renamed from: g */
    public C14234g mo36171g() {
        return this.f31731d;
    }

    /* renamed from: h */
    public ProxySelector mo36172h() {
        return this.f31734g;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f31728a.hashCode()) * 31) + this.f31729b.hashCode()) * 31) + this.f31731d.hashCode()) * 31) + this.f31732e.hashCode()) * 31) + this.f31733f.hashCode()) * 31) + this.f31734g.hashCode()) * 31) + Objects.hashCode(this.f31735h)) * 31) + Objects.hashCode(this.f31736i)) * 31) + Objects.hashCode(this.f31737j)) * 31) + Objects.hashCode(this.f31738k);
    }

    /* renamed from: i */
    public SocketFactory mo36174i() {
        return this.f31730c;
    }

    /* renamed from: j */
    public SSLSocketFactory mo36175j() {
        return this.f31736i;
    }

    /* renamed from: k */
    public HttpUrl mo36176k() {
        return this.f31728a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Address{");
        sb.append(this.f31728a.mo35755g());
        sb.append(":");
        sb.append(this.f31728a.mo35760k());
        if (this.f31735h != null) {
            sb.append(", proxy=");
            sb.append(this.f31735h);
        } else {
            sb.append(", proxySelector=");
            sb.append(this.f31734g);
        }
        sb.append("}");
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo36164a(C14232e eVar) {
        return this.f31729b.equals(eVar.f31729b) && this.f31731d.equals(eVar.f31731d) && this.f31732e.equals(eVar.f31732e) && this.f31733f.equals(eVar.f31733f) && this.f31734g.equals(eVar.f31734g) && Objects.equals(this.f31735h, eVar.f31735h) && Objects.equals(this.f31736i, eVar.f31736i) && Objects.equals(this.f31737j, eVar.f31737j) && Objects.equals(this.f31738k, eVar.f31738k) && mo36176k().mo35760k() == eVar.mo36176k().mo35760k();
    }
}
