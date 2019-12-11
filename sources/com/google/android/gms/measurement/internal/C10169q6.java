package com.google.android.gms.measurement.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.joda.time.DateTimeConstants;

/* renamed from: com.google.android.gms.measurement.internal.q6 */
public final class C10169q6 extends C10101k5 {

    /* renamed from: c */
    private final SSLSocketFactory f23867c;

    C10169q6(C10145o4 o4Var) {
        super(o4Var);
        this.f23867c = VERSION.SDK_INT < 19 ? new C10241x8() : null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static byte[] m31804a(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            inputStream = httpURLConnection.getInputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            return byteArrayOutputStream.toByteArray();
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final boolean mo25655r() {
        return false;
    }

    /* renamed from: t */
    public final boolean mo26069t() {
        NetworkInfo networkInfo;
        mo25884p();
        try {
            networkInfo = ((ConnectivityManager) mo25895b().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException unused) {
            networkInfo = null;
        }
        return networkInfo != null && networkInfo.isConnected();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final HttpURLConnection mo26068a(URL url) throws IOException {
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpURLConnection) {
            SSLSocketFactory sSLSocketFactory = this.f23867c;
            if (sSLSocketFactory != null && (openConnection instanceof HttpsURLConnection)) {
                ((HttpsURLConnection) openConnection).setSSLSocketFactory(sSLSocketFactory);
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setConnectTimeout(DateTimeConstants.MILLIS_PER_MINUTE);
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        }
        throw new IOException("Failed to obtain HTTP connection");
    }
}
