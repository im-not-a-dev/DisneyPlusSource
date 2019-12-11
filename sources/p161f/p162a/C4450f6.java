package p161f.p162a;

import com.appboy.p033s.C1557c;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: f.a.f6 */
class C4450f6 extends SSLSocketFactory {

    /* renamed from: b */
    private static final String f11057b = C1557c.m7461a(C4450f6.class);

    /* renamed from: a */
    private SSLSocketFactory f11058a;

    public C4450f6() {
        SSLContext instance = SSLContext.getInstance("TLS");
        instance.init(null, null, null);
        this.f11058a = instance.getSocketFactory();
    }

    /* renamed from: a */
    private Socket m15386a(Socket socket) {
        String[] supportedProtocols;
        if (socket != null && (socket instanceof SSLSocket)) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            ArrayList arrayList = new ArrayList();
            for (String str : sSLSocket.getSupportedProtocols()) {
                if (!str.equals("SSLv3")) {
                    arrayList.add(str);
                }
            }
            String str2 = f11057b;
            StringBuilder sb = new StringBuilder();
            sb.append("Enabling SSL protocols: ");
            sb.append(arrayList);
            C1557c.m7471d(str2, sb.toString());
            sSLSocket.setEnabledProtocols((String[]) arrayList.toArray(new String[arrayList.size()]));
        }
        return socket;
    }

    public Socket createSocket() {
        Socket createSocket = this.f11058a.createSocket();
        m15386a(createSocket);
        return createSocket;
    }

    public String[] getDefaultCipherSuites() {
        return this.f11058a.getDefaultCipherSuites();
    }

    public String[] getSupportedCipherSuites() {
        return this.f11058a.getSupportedCipherSuites();
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        Socket createSocket = this.f11058a.createSocket(socket, str, i, z);
        m15386a(createSocket);
        return createSocket;
    }

    public Socket createSocket(String str, int i) {
        Socket createSocket = this.f11058a.createSocket(str, i);
        m15386a(createSocket);
        return createSocket;
    }

    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        Socket createSocket = this.f11058a.createSocket(str, i, inetAddress, i2);
        m15386a(createSocket);
        return createSocket;
    }

    public Socket createSocket(InetAddress inetAddress, int i) {
        Socket createSocket = this.f11058a.createSocket(inetAddress, i);
        m15386a(createSocket);
        return createSocket;
    }

    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        Socket createSocket = this.f11058a.createSocket(inetAddress, i, inetAddress2, i2);
        m15386a(createSocket);
        return createSocket;
    }
}
