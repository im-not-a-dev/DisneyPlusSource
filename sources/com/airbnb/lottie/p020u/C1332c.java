package com.airbnb.lottie.p020u;

import android.content.Context;
import com.airbnb.lottie.C1181c;
import com.airbnb.lottie.C1182d;
import com.airbnb.lottie.C1183e;
import com.airbnb.lottie.C1211k;
import com.bamtechmedia.dominguez.legal.DefaultLegalApi;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.ZipInputStream;
import p096e.p121h.p134r.C4112d;

/* renamed from: com.airbnb.lottie.u.c */
/* compiled from: NetworkFetcher */
public class C1332c {

    /* renamed from: a */
    private final Context f5017a;

    /* renamed from: b */
    private final String f5018b;

    /* renamed from: c */
    private final C1331b f5019c;

    private C1332c(Context context, String str) {
        this.f5017a = context.getApplicationContext();
        this.f5018b = str;
        this.f5019c = new C1331b(this.f5017a, str);
    }

    /* renamed from: a */
    public static C1211k<C1182d> m6600a(Context context, String str) {
        return new C1332c(context, str).mo6374a();
    }

    /* renamed from: b */
    private C1182d m6601b() {
        C1211k kVar;
        C4112d a = this.f5019c.mo6371a();
        if (a == null) {
            return null;
        }
        C1330a aVar = (C1330a) a.f10379a;
        InputStream inputStream = (InputStream) a.f10380b;
        if (aVar == C1330a.ZIP) {
            kVar = C1183e.m6061a(new ZipInputStream(inputStream), this.f5018b);
        } else {
            kVar = C1183e.m6059a(inputStream, this.f5018b);
        }
        if (kVar.mo6125b() != null) {
            return (C1182d) kVar.mo6125b();
        }
        return null;
    }

    /* renamed from: c */
    private C1211k<C1182d> m6602c() {
        try {
            return m6603d();
        } catch (IOException e) {
            return new C1211k<>((Throwable) e);
        }
    }

    /* renamed from: d */
    private C1211k m6603d() throws IOException {
        C1330a aVar;
        C1211k kVar;
        StringBuilder sb = new StringBuilder();
        sb.append("Fetching ");
        sb.append(this.f5018b);
        C1181c.m6033b(sb.toString());
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f5018b).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        if (httpURLConnection.getErrorStream() == null && httpURLConnection.getResponseCode() == 200) {
            String contentType = httpURLConnection.getContentType();
            char c = 65535;
            int hashCode = contentType.hashCode();
            boolean z = true;
            if (hashCode != -1248325150) {
                if (hashCode == -43840953 && contentType.equals(DefaultLegalApi.MIME_TYPE_JSON)) {
                    c = 1;
                }
            } else if (contentType.equals("application/zip")) {
                c = 0;
            }
            if (c != 0) {
                C1181c.m6033b("Received json response.");
                aVar = C1330a.JSON;
                kVar = C1183e.m6059a((InputStream) new FileInputStream(new File(this.f5019c.mo6372a(httpURLConnection.getInputStream(), aVar).getAbsolutePath())), this.f5018b);
            } else {
                C1181c.m6033b("Handling zip response.");
                aVar = C1330a.ZIP;
                kVar = C1183e.m6061a(new ZipInputStream(new FileInputStream(this.f5019c.mo6372a(httpURLConnection.getInputStream(), aVar))), this.f5018b);
            }
            if (kVar.mo6125b() != null) {
                this.f5019c.mo6373a(aVar);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Completed fetch from network. Success: ");
            if (kVar.mo6125b() == null) {
                z = false;
            }
            sb2.append(z);
            C1181c.m6033b(sb2.toString());
            return kVar;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb3 = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb3.append(readLine);
                sb3.append(10);
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Unable to fetch ");
                sb4.append(this.f5018b);
                sb4.append(". Failed with ");
                sb4.append(httpURLConnection.getResponseCode());
                sb4.append("\n");
                sb4.append(sb3);
                return new C1211k((Throwable) new IllegalArgumentException(sb4.toString()));
            }
        }
    }

    /* renamed from: a */
    public C1211k<C1182d> mo6374a() {
        C1182d b = m6601b();
        if (b != null) {
            return new C1211k<>(b);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Animation for ");
        sb.append(this.f5018b);
        sb.append(" not found in cache. Fetching from network.");
        C1181c.m6033b(sb.toString());
        return m6602c();
    }
}
