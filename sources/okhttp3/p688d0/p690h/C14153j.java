package okhttp3.p688d0.p690h;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import okhttp3.C14232e;
import okhttp3.C14252r;
import okhttp3.C14266z;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.p688d0.C14126e;

/* renamed from: okhttp3.d0.h.j */
/* compiled from: RouteSelector */
final class C14153j {

    /* renamed from: a */
    private final C14232e f31458a;

    /* renamed from: b */
    private final C14151h f31459b;

    /* renamed from: c */
    private final Call f31460c;

    /* renamed from: d */
    private final C14252r f31461d;

    /* renamed from: e */
    private List<Proxy> f31462e = Collections.emptyList();

    /* renamed from: f */
    private int f31463f;

    /* renamed from: g */
    private List<InetSocketAddress> f31464g = Collections.emptyList();

    /* renamed from: h */
    private final List<C14266z> f31465h = new ArrayList();

    /* renamed from: okhttp3.d0.h.j$a */
    /* compiled from: RouteSelector */
    public static final class C14154a {

        /* renamed from: a */
        private final List<C14266z> f31466a;

        /* renamed from: b */
        private int f31467b = 0;

        C14154a(List<C14266z> list) {
            this.f31466a = list;
        }

        /* renamed from: a */
        public List<C14266z> mo35984a() {
            return new ArrayList(this.f31466a);
        }

        /* renamed from: b */
        public boolean mo35985b() {
            return this.f31467b < this.f31466a.size();
        }

        /* renamed from: c */
        public C14266z mo35986c() {
            if (mo35985b()) {
                List<C14266z> list = this.f31466a;
                int i = this.f31467b;
                this.f31467b = i + 1;
                return (C14266z) list.get(i);
            }
            throw new NoSuchElementException();
        }
    }

    C14153j(C14232e eVar, C14151h hVar, Call call, C14252r rVar) {
        this.f31458a = eVar;
        this.f31459b = hVar;
        this.f31460c = call;
        this.f31461d = rVar;
        m44973a(eVar.mo36176k(), eVar.mo36170f());
    }

    /* renamed from: c */
    private boolean m44974c() {
        return this.f31463f < this.f31462e.size();
    }

    /* renamed from: d */
    private Proxy m44975d() throws IOException {
        if (m44974c()) {
            List<Proxy> list = this.f31462e;
            int i = this.f31463f;
            this.f31463f = i + 1;
            Proxy proxy = (Proxy) list.get(i);
            m44972a(proxy);
            return proxy;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No route to ");
        sb.append(this.f31458a.mo36176k().mo35755g());
        sb.append("; exhausted proxy configurations: ");
        sb.append(this.f31462e);
        throw new SocketException(sb.toString());
    }

    /* renamed from: a */
    public boolean mo35982a() {
        return m44974c() || !this.f31465h.isEmpty();
    }

    /* renamed from: b */
    public C14154a mo35983b() throws IOException {
        if (mo35982a()) {
            ArrayList arrayList = new ArrayList();
            while (m44974c()) {
                Proxy d = m44975d();
                int size = this.f31464g.size();
                for (int i = 0; i < size; i++) {
                    C14266z zVar = new C14266z(this.f31458a, d, (InetSocketAddress) this.f31464g.get(i));
                    if (this.f31459b.mo35978c(zVar)) {
                        this.f31465h.add(zVar);
                    } else {
                        arrayList.add(zVar);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.addAll(this.f31465h);
                this.f31465h.clear();
            }
            return new C14154a(arrayList);
        }
        throw new NoSuchElementException();
    }

    /* renamed from: a */
    private void m44973a(HttpUrl httpUrl, Proxy proxy) {
        List<Proxy> list;
        if (proxy != null) {
            this.f31462e = Collections.singletonList(proxy);
        } else {
            List select = this.f31458a.mo36172h().select(httpUrl.mo35765p());
            if (select == null || select.isEmpty()) {
                list = C14126e.m44825a((T[]) new Proxy[]{Proxy.NO_PROXY});
            } else {
                list = C14126e.m44823a(select);
            }
            this.f31462e = list;
        }
        this.f31463f = 0;
    }

    /* renamed from: a */
    private void m44972a(Proxy proxy) throws IOException {
        String str;
        int i;
        this.f31464g = new ArrayList();
        if (proxy.type() == Type.DIRECT || proxy.type() == Type.SOCKS) {
            str = this.f31458a.mo36176k().mo35755g();
            i = this.f31458a.mo36176k().mo35760k();
        } else {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                str = m44971a(inetSocketAddress);
                i = inetSocketAddress.getPort();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Proxy.address() is not an InetSocketAddress: ");
                sb.append(address.getClass());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (i < 1 || i > 65535) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("No route to ");
            sb2.append(str);
            sb2.append(":");
            sb2.append(i);
            sb2.append("; port is out of range");
            throw new SocketException(sb2.toString());
        } else if (proxy.type() == Type.SOCKS) {
            this.f31464g.add(InetSocketAddress.createUnresolved(str, i));
        } else {
            this.f31461d.mo36217a(this.f31460c, str);
            List a = this.f31458a.mo36166c().mo35892a(str);
            if (!a.isEmpty()) {
                this.f31461d.mo36218a(this.f31460c, str, a);
                int size = a.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.f31464g.add(new InetSocketAddress((InetAddress) a.get(i2), i));
                }
                return;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f31458a.mo36166c());
            sb3.append(" returned no addresses for ");
            sb3.append(str);
            throw new UnknownHostException(sb3.toString());
        }
    }

    /* renamed from: a */
    static String m44971a(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        if (address == null) {
            return inetSocketAddress.getHostName();
        }
        return address.getHostAddress();
    }
}
