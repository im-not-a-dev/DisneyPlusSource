package okhttp3.p688d0.p695m;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.C14259v;
import okhttp3.p688d0.C14126e;

/* renamed from: okhttp3.d0.m.c */
/* compiled from: Jdk8WithJettyBootPlatform */
class C14222c extends C14225e {

    /* renamed from: c */
    private final Method f31713c;

    /* renamed from: d */
    private final Method f31714d;

    /* renamed from: e */
    private final Method f31715e;

    /* renamed from: f */
    private final Class<?> f31716f;

    /* renamed from: g */
    private final Class<?> f31717g;

    /* renamed from: okhttp3.d0.m.c$a */
    /* compiled from: Jdk8WithJettyBootPlatform */
    private static class C14223a implements InvocationHandler {

        /* renamed from: a */
        private final List<String> f31718a;

        /* renamed from: b */
        boolean f31719b;

        /* renamed from: c */
        String f31720c;

        C14223a(List<String> list) {
            this.f31718a = list;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Class<String> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = C14126e.f31331b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.valueOf(true);
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f31719b = true;
                return null;
            } else if (name.equals("protocols") && objArr.length == 0) {
                return this.f31718a;
            } else {
                if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1 && (objArr[0] instanceof List)) {
                    List list = (List) objArr[0];
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        String str = (String) list.get(i);
                        if (this.f31718a.contains(str)) {
                            this.f31720c = str;
                            return str;
                        }
                    }
                    String str2 = (String) this.f31718a.get(0);
                    this.f31720c = str2;
                    return str2;
                } else if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                } else {
                    this.f31720c = (String) objArr[0];
                    return null;
                }
            }
        }
    }

    C14222c(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f31713c = method;
        this.f31714d = method2;
        this.f31715e = method3;
        this.f31716f = cls;
        this.f31717g = cls2;
    }

    /* renamed from: c */
    public static C14225e m45325c() {
        String str = "org.eclipse.jetty.alpn.ALPN";
        try {
            Class cls = Class.forName(str, true, null);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("$Provider");
            Class cls2 = Class.forName(sb.toString(), true, null);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("$ClientProvider");
            Class cls3 = Class.forName(sb2.toString(), true, null);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append("$ServerProvider");
            Class cls4 = Class.forName(sb3.toString(), true, null);
            Method method = cls.getMethod("put", new Class[]{SSLSocket.class, cls2});
            Method method2 = method;
            C14222c cVar = new C14222c(method2, cls.getMethod("get", new Class[]{SSLSocket.class}), cls.getMethod("remove", new Class[]{SSLSocket.class}), cls3, cls4);
            return cVar;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public void mo36136a(SSLSocket sSLSocket, String str, List<C14259v> list) {
        List a = C14225e.m45332a(list);
        try {
            Object newProxyInstance = Proxy.newProxyInstance(C14225e.class.getClassLoader(), new Class[]{this.f31716f, this.f31717g}, new C14223a(a));
            this.f31713c.invoke(null, new Object[]{sSLSocket, newProxyInstance});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError("failed to set ALPN", e);
        }
    }

    /* renamed from: b */
    public String mo36137b(SSLSocket sSLSocket) {
        try {
            Object[] objArr = {sSLSocket};
            String str = null;
            C14223a aVar = (C14223a) Proxy.getInvocationHandler(this.f31714d.invoke(null, objArr));
            if (aVar.f31719b || aVar.f31720c != null) {
                if (!aVar.f31719b) {
                    str = aVar.f31720c;
                }
                return str;
            }
            C14225e.m45335d().mo36133a(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
            return null;
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        }
    }

    /* renamed from: a */
    public void mo36150a(SSLSocket sSLSocket) {
        try {
            this.f31715e.invoke(null, new Object[]{sSLSocket});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError("failed to remove ALPN", e);
        }
    }
}
