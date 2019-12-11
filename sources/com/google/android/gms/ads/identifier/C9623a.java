package com.google.android.gms.ads.identifier;

import android.net.Uri;
import android.net.Uri.Builder;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.identifier.a */
final class C9623a extends Thread {

    /* renamed from: c */
    private final /* synthetic */ Map f22572c;

    C9623a(AdvertisingIdClient advertisingIdClient, Map map) {
        this.f22572c = map;
    }

    public final void run() {
        String message;
        StringBuilder sb;
        String str;
        HttpURLConnection httpURLConnection;
        String str2 = ". ";
        String str3 = "HttpUrlPinger";
        new C9625c();
        Map map = this.f22572c;
        Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str4 : map.keySet()) {
            buildUpon.appendQueryParameter(str4, (String) map.get(str4));
        }
        String uri = buildUpon.build().toString();
        try {
            httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < 200 || responseCode >= 300) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(uri).length() + 65);
                sb2.append("Received non-success response code ");
                sb2.append(responseCode);
                sb2.append(" from pinging URL: ");
                sb2.append(uri);
                Log.w(str3, sb2.toString());
            }
            httpURLConnection.disconnect();
        } catch (IndexOutOfBoundsException e) {
            message = e.getMessage();
            sb = new StringBuilder(String.valueOf(uri).length() + 32 + String.valueOf(message).length());
            str = "Error while parsing ping URL: ";
            r3 = e;
            sb.append(str);
            sb.append(uri);
            sb.append(str2);
            sb.append(message);
            Log.w(str3, sb.toString(), r3);
        } catch (IOException | RuntimeException e2) {
            message = e2.getMessage();
            sb = new StringBuilder(String.valueOf(uri).length() + 27 + String.valueOf(message).length());
            str = "Error while pinging URL: ";
            r3 = e2;
            sb.append(str);
            sb.append(uri);
            sb.append(str2);
            sb.append(message);
            Log.w(str3, sb.toString(), r3);
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }
}
