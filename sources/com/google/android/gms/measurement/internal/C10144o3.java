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

/* renamed from: com.google.android.gms.measurement.internal.o3 */
public final class C10144o3 extends C10138n8 {

    /* renamed from: d */
    private final SSLSocketFactory f23792d;

    public C10144o3(C10126m8 m8Var) {
        super(m8Var);
        this.f23792d = VERSION.SDK_INT < 19 ? new C10241x8() : null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static byte[] m31723a(HttpURLConnection httpURLConnection) throws IOException {
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
    /* renamed from: u */
    public final boolean mo25760u() {
        return false;
    }

    /* renamed from: v */
    public final boolean mo26015v() {
        NetworkInfo networkInfo;
        mo25969t();
        try {
            networkInfo = ((ConnectivityManager) mo25895b().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException unused) {
            networkInfo = null;
        }
        return networkInfo != null && networkInfo.isConnected();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final HttpURLConnection mo26014a(URL url) throws IOException {
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpURLConnection) {
            SSLSocketFactory sSLSocketFactory = this.f23792d;
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
