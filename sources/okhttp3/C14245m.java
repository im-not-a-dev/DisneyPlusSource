package okhttp3;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import okhttp3.p688d0.C14126e;

/* renamed from: okhttp3.m */
/* compiled from: ConnectionSpec */
public final class C14245m {

    /* renamed from: e */
    private static final C14239j[] f31787e = {C14239j.f31771q, C14239j.f31772r, C14239j.f31773s, C14239j.f31765k, C14239j.f31767m, C14239j.f31766l, C14239j.f31768n, C14239j.f31770p, C14239j.f31769o};

    /* renamed from: f */
    private static final C14239j[] f31788f = {C14239j.f31771q, C14239j.f31772r, C14239j.f31773s, C14239j.f31765k, C14239j.f31767m, C14239j.f31766l, C14239j.f31768n, C14239j.f31770p, C14239j.f31769o, C14239j.f31763i, C14239j.f31764j, C14239j.f31761g, C14239j.f31762h, C14239j.f31759e, C14239j.f31760f, C14239j.f31758d};

    /* renamed from: g */
    public static final C14245m f31789g;

    /* renamed from: h */
    public static final C14245m f31790h;

    /* renamed from: i */
    public static final C14245m f31791i = new C14246a(false).mo36206a();

    /* renamed from: a */
    final boolean f31792a;

    /* renamed from: b */
    final boolean f31793b;

    /* renamed from: c */
    final String[] f31794c;

    /* renamed from: d */
    final String[] f31795d;

    /* renamed from: okhttp3.m$a */
    /* compiled from: ConnectionSpec */
    public static final class C14246a {

        /* renamed from: a */
        boolean f31796a;

        /* renamed from: b */
        String[] f31797b;

        /* renamed from: c */
        String[] f31798c;

        /* renamed from: d */
        boolean f31799d;

        C14246a(boolean z) {
            this.f31796a = z;
        }

        /* renamed from: a */
        public C14246a mo36205a(C14239j... jVarArr) {
            if (this.f31796a) {
                String[] strArr = new String[jVarArr.length];
                for (int i = 0; i < jVarArr.length; i++) {
                    strArr[i] = jVarArr[i].f31774a;
                }
                mo36203a(strArr);
                return this;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        /* renamed from: b */
        public C14246a mo36207b(String... strArr) {
            if (!this.f31796a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            } else if (strArr.length != 0) {
                this.f31798c = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
        }

        public C14246a(C14245m mVar) {
            this.f31796a = mVar.f31792a;
            this.f31797b = mVar.f31794c;
            this.f31798c = mVar.f31795d;
            this.f31799d = mVar.f31793b;
        }

        /* renamed from: a */
        public C14246a mo36203a(String... strArr) {
            if (!this.f31796a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            } else if (strArr.length != 0) {
                this.f31797b = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
        }

        /* renamed from: a */
        public C14246a mo36204a(C14116a0... a0VarArr) {
            if (this.f31796a) {
                String[] strArr = new String[a0VarArr.length];
                for (int i = 0; i < a0VarArr.length; i++) {
                    strArr[i] = a0VarArr[i].f31321c;
                }
                mo36207b(strArr);
                return this;
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        /* renamed from: a */
        public C14246a mo36202a(boolean z) {
            if (this.f31796a) {
                this.f31799d = z;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        /* renamed from: a */
        public C14245m mo36206a() {
            return new C14245m(this);
        }
    }

    static {
        C14246a aVar = new C14246a(true);
        aVar.mo36205a(f31787e);
        aVar.mo36204a(C14116a0.TLS_1_3, C14116a0.TLS_1_2);
        aVar.mo36202a(true);
        aVar.mo36206a();
        C14246a aVar2 = new C14246a(true);
        aVar2.mo36205a(f31788f);
        aVar2.mo36204a(C14116a0.TLS_1_3, C14116a0.TLS_1_2);
        aVar2.mo36202a(true);
        f31789g = aVar2.mo36206a();
        C14246a aVar3 = new C14246a(true);
        aVar3.mo36205a(f31788f);
        aVar3.mo36204a(C14116a0.TLS_1_3, C14116a0.TLS_1_2, C14116a0.TLS_1_1, C14116a0.TLS_1_0);
        aVar3.mo36202a(true);
        f31790h = aVar3.mo36206a();
    }

    C14245m(C14246a aVar) {
        this.f31792a = aVar.f31796a;
        this.f31794c = aVar.f31797b;
        this.f31795d = aVar.f31798c;
        this.f31793b = aVar.f31799d;
    }

    /* renamed from: a */
    public List<C14239j> mo36193a() {
        String[] strArr = this.f31794c;
        if (strArr != null) {
            return C14239j.m45393a(strArr);
        }
        return null;
    }

    /* renamed from: b */
    public boolean mo36196b() {
        return this.f31792a;
    }

    /* renamed from: c */
    public boolean mo36197c() {
        return this.f31793b;
    }

    /* renamed from: d */
    public List<C14116a0> mo36198d() {
        String[] strArr = this.f31795d;
        if (strArr != null) {
            return C14116a0.m44796a(strArr);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C14245m)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C14245m mVar = (C14245m) obj;
        boolean z = this.f31792a;
        if (z != mVar.f31792a) {
            return false;
        }
        return !z || (Arrays.equals(this.f31794c, mVar.f31794c) && Arrays.equals(this.f31795d, mVar.f31795d) && this.f31793b == mVar.f31793b);
    }

    public int hashCode() {
        if (this.f31792a) {
            return ((((527 + Arrays.hashCode(this.f31794c)) * 31) + Arrays.hashCode(this.f31795d)) * 31) + (this.f31793b ^ true ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (!this.f31792a) {
            return "ConnectionSpec()";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ConnectionSpec(cipherSuites=");
        String str = "[all enabled]";
        sb.append(Objects.toString(mo36193a(), str));
        sb.append(", tlsVersions=");
        sb.append(Objects.toString(mo36198d(), str));
        sb.append(", supportsTlsExtensions=");
        sb.append(this.f31793b);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: b */
    private C14245m m45406b(SSLSocket sSLSocket, boolean z) {
        String[] strArr;
        String[] strArr2;
        if (this.f31794c != null) {
            strArr = C14126e.m44837a(C14239j.f31756b, sSLSocket.getEnabledCipherSuites(), this.f31794c);
        } else {
            strArr = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f31795d != null) {
            strArr2 = C14126e.m44837a(C14126e.f31338i, sSLSocket.getEnabledProtocols(), this.f31795d);
        } else {
            strArr2 = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int a = C14126e.m44814a(C14239j.f31756b, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z && a != -1) {
            strArr = C14126e.m44838a(strArr, supportedCipherSuites[a]);
        }
        C14246a aVar = new C14246a(this);
        aVar.mo36203a(strArr);
        aVar.mo36207b(strArr2);
        return aVar.mo36206a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo36194a(SSLSocket sSLSocket, boolean z) {
        C14245m b = m45406b(sSLSocket, z);
        String[] strArr = b.f31795d;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = b.f31794c;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    /* renamed from: a */
    public boolean mo36195a(SSLSocket sSLSocket) {
        if (!this.f31792a) {
            return false;
        }
        String[] strArr = this.f31795d;
        if (strArr != null && !C14126e.m44842b(C14126e.f31338i, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f31794c;
        if (strArr2 == null || C14126e.m44842b(C14239j.f31756b, strArr2, sSLSocket.getEnabledCipherSuites())) {
            return true;
        }
        return false;
    }
}
