package okhttp3.p688d0.p695m;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import okhttp3.C14259v;

/* renamed from: okhttp3.d0.m.d */
/* compiled from: Jdk9Platform */
final class C14224d extends C14225e {

    /* renamed from: c */
    final Method f31721c;

    /* renamed from: d */
    final Method f31722d;

    C14224d(Method method, Method method2) {
        this.f31721c = method;
        this.f31722d = method2;
    }

    /* renamed from: c */
    public static C14224d m45329c() {
        try {
            return new C14224d(SSLParameters.class.getMethod("setApplicationProtocols", new Class[]{String[].class}), SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public void mo36136a(SSLSocket sSLSocket, String str, List<C14259v> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List a = C14225e.m45332a(list);
            this.f31721c.invoke(sSLParameters, new Object[]{a.toArray(new String[a.size()])});
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError("failed to set SSL parameters", e);
        }
    }

    /* renamed from: b */
    public String mo36137b(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f31722d.invoke(sSLSocket, new Object[0]);
            if (str == null || str.equals("")) {
                return null;
            }
            return str;
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        }
    }
}
