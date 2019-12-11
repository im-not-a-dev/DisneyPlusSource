package okhttp3.p688d0.p695m;

import android.os.Build.VERSION;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import okhttp3.C14259v;
import okhttp3.p688d0.C14126e;
import okhttp3.p688d0.p697o.C14229c;
import okhttp3.p688d0.p697o.C14231e;

/* renamed from: okhttp3.d0.m.a */
/* compiled from: AndroidPlatform */
class C14217a extends C14225e {

    /* renamed from: c */
    private final Class<?> f31700c;

    /* renamed from: d */
    private final Method f31701d;

    /* renamed from: e */
    private final Method f31702e;

    /* renamed from: f */
    private final Method f31703f;

    /* renamed from: g */
    private final Method f31704g;

    /* renamed from: h */
    private final C14219b f31705h = C14219b.m45315a();

    /* renamed from: okhttp3.d0.m.a$a */
    /* compiled from: AndroidPlatform */
    static final class C14218a extends C14229c {

        /* renamed from: a */
        private final Object f31706a;

        /* renamed from: b */
        private final Method f31707b;

        C14218a(Object obj, Method method) {
            this.f31706a = obj;
            this.f31707b = method;
        }

        /* renamed from: a */
        public List<Certificate> mo36141a(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
            try {
                X509Certificate[] x509CertificateArr = (X509Certificate[]) list.toArray(new X509Certificate[list.size()]);
                return (List) this.f31707b.invoke(this.f31706a, new Object[]{x509CertificateArr, "RSA", str});
            } catch (InvocationTargetException e) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
                sSLPeerUnverifiedException.initCause(e);
                throw sSLPeerUnverifiedException;
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        public boolean equals(Object obj) {
            return obj instanceof C14218a;
        }

        public int hashCode() {
            return 0;
        }
    }

    /* renamed from: okhttp3.d0.m.a$b */
    /* compiled from: AndroidPlatform */
    static final class C14219b {

        /* renamed from: a */
        private final Method f31708a;

        /* renamed from: b */
        private final Method f31709b;

        /* renamed from: c */
        private final Method f31710c;

        C14219b(Method method, Method method2, Method method3) {
            this.f31708a = method;
            this.f31709b = method2;
            this.f31710c = method3;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Object mo36144a(String str) {
            Method method = this.f31708a;
            if (method != null) {
                try {
                    Object invoke = method.invoke(null, new Object[0]);
                    this.f31709b.invoke(invoke, new Object[]{str});
                    return invoke;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo36145a(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                this.f31710c.invoke(obj, new Object[0]);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }

        /* renamed from: a */
        static C14219b m45315a() {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", new Class[0]);
                method = cls.getMethod("open", new Class[]{String.class});
                method2 = cls.getMethod("warnIfOpen", new Class[0]);
                method3 = method4;
            } catch (Exception unused) {
                method2 = null;
                method = null;
            }
            return new C14219b(method3, method, method2);
        }
    }

    /* renamed from: okhttp3.d0.m.a$c */
    /* compiled from: AndroidPlatform */
    static final class C14220c implements C14231e {

        /* renamed from: a */
        private final X509TrustManager f31711a;

        /* renamed from: b */
        private final Method f31712b;

        C14220c(X509TrustManager x509TrustManager, Method method) {
            this.f31712b = method;
            this.f31711a = x509TrustManager;
        }

        /* renamed from: a */
        public X509Certificate mo36146a(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.f31712b.invoke(this.f31711a, new Object[]{x509Certificate});
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
                return null;
            } catch (IllegalAccessException e) {
                throw new AssertionError("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C14220c)) {
                return false;
            }
            C14220c cVar = (C14220c) obj;
            if (!this.f31711a.equals(cVar.f31711a) || !this.f31712b.equals(cVar.f31712b)) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return this.f31711a.hashCode() + (this.f31712b.hashCode() * 31);
        }
    }

    C14217a(Class<?> cls, Class<?> cls2, Method method, Method method2, Method method3, Method method4) {
        this.f31700c = cls2;
        this.f31701d = method;
        this.f31702e = method2;
        this.f31703f = method3;
        this.f31704g = method4;
    }

    /* renamed from: c */
    public static C14225e m45303c() {
        try {
            Class cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            Class cls2 = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            if (VERSION.SDK_INT >= 21) {
                try {
                    Method declaredMethod = cls2.getDeclaredMethod("setUseSessionTickets", new Class[]{Boolean.TYPE});
                    Method method = cls2.getMethod("setHostname", new Class[]{String.class});
                    Method method2 = cls2.getMethod("getAlpnSelectedProtocol", new Class[0]);
                    C14217a aVar = new C14217a(cls, cls2, declaredMethod, method, method2, cls2.getMethod("setAlpnProtocols", new Class[]{byte[].class}));
                    return aVar;
                } catch (NoSuchMethodException unused) {
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Expected Android API level 21+ but was ");
            sb.append(VERSION.SDK_INT);
            throw new IllegalStateException(sb.toString());
        } catch (ClassNotFoundException unused2) {
            return null;
        }
    }

    /* renamed from: a */
    public void mo36135a(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e) {
            if (C14126e.m44833a(e)) {
                throw new IOException(e);
            }
            throw e;
        } catch (ClassCastException e2) {
            if (VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e2);
            }
            throw e2;
        }
    }

    /* renamed from: b */
    public String mo36137b(SSLSocket sSLSocket) {
        String str = null;
        if (!this.f31700c.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f31703f.invoke(sSLSocket, new Object[0]);
            if (bArr != null) {
                str = new String(bArr, StandardCharsets.UTF_8);
            }
            return str;
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: b */
    public boolean mo36140b(String str) {
        try {
            Class cls = Class.forName("android.security.NetworkSecurityPolicy");
            return m45302b(str, cls, cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return super.mo36140b(str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw new AssertionError("unable to determine cleartext support", e);
        }
    }

    /* renamed from: a */
    public void mo36136a(SSLSocket sSLSocket, String str, List<C14259v> list) {
        if (this.f31700c.isInstance(sSLSocket)) {
            if (str != null) {
                try {
                    this.f31701d.invoke(sSLSocket, new Object[]{Boolean.valueOf(true)});
                    this.f31702e.invoke(sSLSocket, new Object[]{str});
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new AssertionError(e);
                }
            }
            this.f31704g.invoke(sSLSocket, new Object[]{C14225e.m45333b(list)});
        }
    }

    /* renamed from: b */
    private boolean m45302b(String str, Class<?> cls, Object obj) throws InvocationTargetException, IllegalAccessException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[]{String.class}).invoke(obj, new Object[]{str})).booleanValue();
        } catch (NoSuchMethodException unused) {
            return m45301a(str, cls, obj);
        }
    }

    /* renamed from: a */
    public void mo36133a(int i, String str, Throwable th) {
        int min;
        int i2 = 5;
        if (i != 5) {
            i2 = 3;
        }
        if (th != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(10);
            sb.append(Log.getStackTraceString(th));
            str = sb.toString();
        }
        int i3 = 0;
        int length = str.length();
        while (i3 < length) {
            int indexOf = str.indexOf(10, i3);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i3 + 4000);
                Log.println(i2, "OkHttp", str.substring(i3, min));
                if (min >= indexOf) {
                    break;
                }
                i3 = min;
            }
            i3 = min + 1;
        }
    }

    /* renamed from: b */
    public C14231e mo36139b(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            declaredMethod.setAccessible(true);
            return new C14220c(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.mo36139b(x509TrustManager);
        }
    }

    /* renamed from: a */
    public Object mo36131a(String str) {
        return this.f31705h.mo36144a(str);
    }

    /* renamed from: a */
    public void mo36134a(String str, Object obj) {
        if (!this.f31705h.mo36145a(obj)) {
            mo36133a(5, str, (Throwable) null);
        }
    }

    /* renamed from: b */
    public SSLContext mo36138b() {
        boolean z = true;
        try {
            if (VERSION.SDK_INT < 16 || VERSION.SDK_INT >= 22) {
                z = false;
            }
        } catch (NoClassDefFoundError unused) {
        }
        if (z) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    /* renamed from: a */
    private boolean m45301a(String str, Class<?> cls, Object obj) throws InvocationTargetException, IllegalAccessException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        } catch (NoSuchMethodException unused) {
            return super.mo36140b(str);
        }
    }

    /* renamed from: a */
    public C14229c mo36132a(X509TrustManager x509TrustManager) {
        try {
            Class cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new C14218a(cls.getConstructor(new Class[]{X509TrustManager.class}).newInstance(new Object[]{x509TrustManager}), cls.getMethod("checkServerTrusted", new Class[]{X509Certificate[].class, String.class, String.class}));
        } catch (Exception unused) {
            return super.mo36132a(x509TrustManager);
        }
    }
}
