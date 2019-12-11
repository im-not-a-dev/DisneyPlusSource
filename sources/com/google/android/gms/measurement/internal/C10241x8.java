package com.google.android.gms.measurement.internal;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.google.android.gms.measurement.internal.x8 */
final class C10241x8 extends SSLSocketFactory {

    /* renamed from: a */
    private final SSLSocketFactory f24052a;

    C10241x8() {
        this(HttpsURLConnection.getDefaultSSLSocketFactory());
    }

    /* renamed from: a */
    private final SSLSocket m31949a(SSLSocket sSLSocket) {
        return new C10261z8(this, sSLSocket);
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        return m31949a((SSLSocket) this.f24052a.createSocket(socket, str, i, z));
    }

    public final String[] getDefaultCipherSuites() {
        return this.f24052a.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.f24052a.getSupportedCipherSuites();
    }

    private C10241x8(SSLSocketFactory sSLSocketFactory) {
        this.f24052a = sSLSocketFactory;
    }

    public final Socket createSocket(String str, int i) throws IOException {
        return m31949a((SSLSocket) this.f24052a.createSocket(str, i));
    }

    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return m31949a((SSLSocket) this.f24052a.createSocket(inetAddress, i));
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        return m31949a((SSLSocket) this.f24052a.createSocket(str, i, inetAddress, i2));
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return m31949a((SSLSocket) this.f24052a.createSocket(inetAddress, i, inetAddress2, i2));
    }

    public final Socket createSocket() throws IOException {
        return m31949a((SSLSocket) this.f24052a.createSocket());
    }
}
