package okhttp3;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;

/* renamed from: okhttp3.z */
/* compiled from: Route */
public final class C14266z {

    /* renamed from: a */
    final C14232e f31843a;

    /* renamed from: b */
    final Proxy f31844b;

    /* renamed from: c */
    final InetSocketAddress f31845c;

    public C14266z(C14232e eVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (eVar == null) {
            throw new NullPointerException("address == null");
        } else if (proxy == null) {
            throw new NullPointerException("proxy == null");
        } else if (inetSocketAddress != null) {
            this.f31843a = eVar;
            this.f31844b = proxy;
            this.f31845c = inetSocketAddress;
        } else {
            throw new NullPointerException("inetSocketAddress == null");
        }
    }

    /* renamed from: a */
    public C14232e mo36280a() {
        return this.f31843a;
    }

    /* renamed from: b */
    public Proxy mo36281b() {
        return this.f31844b;
    }

    /* renamed from: c */
    public boolean mo36282c() {
        return this.f31843a.f31736i != null && this.f31844b.type() == Type.HTTP;
    }

    /* renamed from: d */
    public InetSocketAddress mo36283d() {
        return this.f31845c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C14266z) {
            C14266z zVar = (C14266z) obj;
            if (zVar.f31843a.equals(this.f31843a) && zVar.f31844b.equals(this.f31844b) && zVar.f31845c.equals(this.f31845c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f31843a.hashCode()) * 31) + this.f31844b.hashCode()) * 31) + this.f31845c.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Route{");
        sb.append(this.f31845c);
        sb.append("}");
        return sb.toString();
    }
}
