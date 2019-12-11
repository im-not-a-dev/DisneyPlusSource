package com.bumptech.glide.load.p332m;

import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.C8105a;
import com.bumptech.glide.load.C8109e;
import com.bumptech.glide.load.p332m.C8122d.C8123a;
import com.bumptech.glide.load.p339o.C8292g;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import java.util.Map.Entry;
import p163g.p413f.p414a.C10657j;
import p163g.p413f.p414a.p424w.C10765c;
import p163g.p413f.p414a.p424w.C10770f;

/* renamed from: com.bumptech.glide.load.m.j */
/* compiled from: HttpUrlFetcher */
public class C8132j implements C8122d<InputStream> {

    /* renamed from: Z */
    static final C8134b f17392Z = new C8133a();

    /* renamed from: U */
    private final int f17393U;

    /* renamed from: V */
    private final C8134b f17394V;

    /* renamed from: W */
    private HttpURLConnection f17395W;

    /* renamed from: X */
    private InputStream f17396X;

    /* renamed from: Y */
    private volatile boolean f17397Y;

    /* renamed from: c */
    private final C8292g f17398c;

    /* renamed from: com.bumptech.glide.load.m.j$a */
    /* compiled from: HttpUrlFetcher */
    private static class C8133a implements C8134b {
        C8133a() {
        }

        /* renamed from: a */
        public HttpURLConnection mo21195a(URL url) throws IOException {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* renamed from: com.bumptech.glide.load.m.j$b */
    /* compiled from: HttpUrlFetcher */
    interface C8134b {
        /* renamed from: a */
        HttpURLConnection mo21195a(URL url) throws IOException;
    }

    public C8132j(C8292g gVar, int i) {
        this(gVar, i, f17392Z);
    }

    /* renamed from: b */
    private static boolean m23587b(int i) {
        return i / 100 == 3;
    }

    /* renamed from: a */
    public void mo21141a(C10657j jVar, C8123a<? super InputStream> aVar) {
        StringBuilder sb;
        String str = "Finished http url fetcher fetch in ";
        String str2 = "HttpUrlFetcher";
        long a = C10770f.m33999a();
        try {
            aVar.mo21180a(m23585a(this.f17398c.mo21465d(), 0, null, this.f17398c.mo21463b()));
            if (Log.isLoggable(str2, 2)) {
                sb = new StringBuilder();
                sb.append(str);
                sb.append(C10770f.m33998a(a));
                Log.v(str2, sb.toString());
            }
        } catch (IOException e) {
            if (Log.isLoggable(str2, 3)) {
                Log.d(str2, "Failed to load data for url", e);
            }
            aVar.mo21179a((Exception) e);
            if (Log.isLoggable(str2, 2)) {
                sb = new StringBuilder();
            }
        } catch (Throwable th) {
            if (Log.isLoggable(str2, 2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(C10770f.m33998a(a));
                Log.v(str2, sb2.toString());
            }
            throw th;
        }
    }

    public void cancel() {
        this.f17397Y = true;
    }

    public void cleanup() {
        InputStream inputStream = this.f17396X;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f17395W;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f17395W = null;
    }

    C8132j(C8292g gVar, int i, C8134b bVar) {
        this.f17398c = gVar;
        this.f17393U = i;
        this.f17394V = bVar;
    }

    /* renamed from: b */
    public C8105a mo21142b() {
        return C8105a.REMOTE;
    }

    /* renamed from: a */
    private InputStream m23585a(URL url, int i, URL url2, Map<String, String> map) throws IOException {
        if (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new C8109e("In re-direct loop");
                    }
                } catch (URISyntaxException unused) {
                }
            }
            this.f17395W = this.f17394V.mo21195a(url);
            for (Entry entry : map.entrySet()) {
                this.f17395W.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            this.f17395W.setConnectTimeout(this.f17393U);
            this.f17395W.setReadTimeout(this.f17393U);
            this.f17395W.setUseCaches(false);
            this.f17395W.setDoInput(true);
            this.f17395W.setInstanceFollowRedirects(false);
            this.f17395W.connect();
            this.f17396X = this.f17395W.getInputStream();
            if (this.f17397Y) {
                return null;
            }
            int responseCode = this.f17395W.getResponseCode();
            if (m23586a(responseCode)) {
                return m23584a(this.f17395W);
            }
            if (m23587b(responseCode)) {
                String headerField = this.f17395W.getHeaderField("Location");
                if (!TextUtils.isEmpty(headerField)) {
                    URL url3 = new URL(url, headerField);
                    cleanup();
                    return m23585a(url3, i + 1, url, map);
                }
                throw new C8109e("Received empty or null redirect url");
            } else if (responseCode == -1) {
                throw new C8109e(responseCode);
            } else {
                throw new C8109e(this.f17395W.getResponseMessage(), responseCode);
            }
        } else {
            throw new C8109e("Too many (> 5) redirects!");
        }
    }

    /* renamed from: a */
    private static boolean m23586a(int i) {
        return i / 100 == 2;
    }

    /* renamed from: a */
    private InputStream m23584a(HttpURLConnection httpURLConnection) throws IOException {
        if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
            this.f17396X = C10765c.m33990a(httpURLConnection.getInputStream(), (long) httpURLConnection.getContentLength());
        } else {
            String str = "HttpUrlFetcher";
            if (Log.isLoggable(str, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Got non empty content encoding: ");
                sb.append(httpURLConnection.getContentEncoding());
                Log.d(str, sb.toString());
            }
            this.f17396X = httpURLConnection.getInputStream();
        }
        return this.f17396X;
    }

    /* renamed from: a */
    public Class<InputStream> mo21140a() {
        return InputStream.class;
    }
}
