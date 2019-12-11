package com.bamtech.core.networking.p039g;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.bamtech.core.networking.g.d */
/* compiled from: TLSSocketFactory.kt */
public final class C1697d extends SSLSocketFactory {

    /* renamed from: a */
    private final SSLSocketFactory f5888a;

    public C1697d(X509TrustManager x509TrustManager) {
        SSLContext instance = SSLContext.getInstance("TLSv1.2");
        instance.init(null, new X509TrustManager[]{x509TrustManager}, null);
        Intrinsics.checkReturnedValueIsNotNull((Object) instance, "context");
        SSLSocketFactory socketFactory = instance.getSocketFactory();
        Intrinsics.checkReturnedValueIsNotNull((Object) socketFactory, "context.socketFactory");
        this.f5888a = socketFactory;
    }

    /* renamed from: a */
    private final Socket m7806a(Socket socket) {
        if (socket instanceof SSLSocket) {
            ((SSLSocket) socket).setEnabledProtocols(new String[]{"TLSv1.1", "TLSv1.2"});
        }
        return socket;
    }

    public Socket createSocket() {
        Socket createSocket = this.f5888a.createSocket();
        m7806a(createSocket);
        return createSocket;
    }

    public String[] getDefaultCipherSuites() {
        String[] defaultCipherSuites = this.f5888a.getDefaultCipherSuites();
        Intrinsics.checkReturnedValueIsNotNull((Object) defaultCipherSuites, "internalSSLSocketFactory.getDefaultCipherSuites()");
        return defaultCipherSuites;
    }

    public String[] getSupportedCipherSuites() {
        String[] supportedCipherSuites = this.f5888a.getSupportedCipherSuites();
        Intrinsics.checkReturnedValueIsNotNull((Object) supportedCipherSuites, "internalSSLSocketFactory…etSupportedCipherSuites()");
        return supportedCipherSuites;
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        Socket createSocket = this.f5888a.createSocket(socket, str, i, z);
        m7806a(createSocket);
        return createSocket;
    }

    public Socket createSocket(String str, int i) {
        Socket createSocket = this.f5888a.createSocket(str, i);
        m7806a(createSocket);
        return createSocket;
    }

    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        Socket createSocket = this.f5888a.createSocket(str, i, inetAddress, i2);
        m7806a(createSocket);
        return createSocket;
    }

    public Socket createSocket(InetAddress inetAddress, int i) {
        Socket createSocket = this.f5888a.createSocket(inetAddress, i);
        m7806a(createSocket);
        return createSocket;
    }

    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        Socket createSocket = this.f5888a.createSocket(inetAddress, i, inetAddress2, i2);
        m7806a(createSocket);
        return createSocket;
    }
}
