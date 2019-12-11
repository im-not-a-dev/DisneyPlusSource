package p551j.p552a.p560j;

import com.facebook.stetho.common.Utf8Charset;
import com.facebook.stetho.server.http.HttpHeaders;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import p551j.p552a.p563m.C12654a;
import p551j.p552a.p565o.C12660a;
import p602m.p609c.C13459b;
import p602m.p609c.C13460c;

/* renamed from: j.a.j.h */
/* compiled from: HttpConnection */
public class C12638h extends C12624a {

    /* renamed from: f0 */
    private static final Charset f29298f0 = Charset.forName(Utf8Charset.NAME);

    /* renamed from: g0 */
    private static final C13459b f29299g0 = C13460c.m41415a(C12638h.class);

    /* renamed from: h0 */
    private static final int f29300h0 = ((int) TimeUnit.SECONDS.toMillis(1));

    /* renamed from: i0 */
    private static final int f29301i0 = ((int) TimeUnit.SECONDS.toMillis(5));

    /* renamed from: j0 */
    private static final HostnameVerifier f29302j0 = new C12639a();

    /* renamed from: Y */
    private final URL f29303Y;

    /* renamed from: Z */
    private final Proxy f29304Z;

    /* renamed from: a0 */
    private C12636f f29305a0;

    /* renamed from: b0 */
    private C12660a f29306b0;

    /* renamed from: c0 */
    private int f29307c0 = f29300h0;

    /* renamed from: d0 */
    private int f29308d0 = f29301i0;

    /* renamed from: e0 */
    private boolean f29309e0 = false;

    /* renamed from: j.a.j.h$a */
    /* compiled from: HttpConnection */
    static class C12639a implements HostnameVerifier {
        C12639a() {
        }

        public boolean verify(String str, SSLSession sSLSession) {
            return true;
        }
    }

    public C12638h(URL url, String str, String str2, Proxy proxy, C12636f fVar) {
        super(str, str2);
        this.f29303Y = url;
        this.f29304Z = proxy;
        this.f29305a0 = fVar;
    }

    /* renamed from: a */
    public static URL m39651a(URI uri, String str) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(uri.toString());
            sb.append("api/");
            sb.append(str);
            sb.append("/store/");
            return new URL(sb.toString());
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Couldn't build a valid URL from the Sentry API.", e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public HttpURLConnection mo30944b() {
        HttpURLConnection httpURLConnection;
        try {
            if (this.f29304Z != null) {
                httpURLConnection = (HttpURLConnection) this.f29303Y.openConnection(this.f29304Z);
            } else {
                httpURLConnection = (HttpURLConnection) this.f29303Y.openConnection();
            }
            if (this.f29309e0 && (httpURLConnection instanceof HttpsURLConnection)) {
                ((HttpsURLConnection) httpURLConnection).setHostnameVerifier(f29302j0);
            }
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setConnectTimeout(this.f29307c0);
            httpURLConnection.setReadTimeout(this.f29308d0);
            httpURLConnection.setRequestProperty("User-Agent", C12654a.m39689a());
            httpURLConnection.setRequestProperty("X-Sentry-Auth", mo30924a());
            if (this.f29306b0.getContentType() != null) {
                httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, this.f29306b0.getContentType());
            }
            if (this.f29306b0.mo30979a() != null) {
                httpURLConnection.setRequestProperty("Content-Encoding", this.f29306b0.mo30979a());
            }
            return httpURLConnection;
        } catch (IOException e) {
            throw new IllegalStateException("Couldn't set up a connection to the Sentry server.", e);
        }
    }

    public void close() throws IOException {
    }

    /* renamed from: a */
    private String m39650a(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, f29298f0));
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                if (!z) {
                    sb.append("\n");
                }
                sb.append(readLine);
                z = false;
            } catch (Exception e) {
                f29299g0.mo34723a("Exception while reading the error message from the connection.", (Throwable) e);
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public void mo30941a(int i) {
        this.f29307c0 = i;
    }

    /* renamed from: a */
    public void mo30942a(C12660a aVar) {
        this.f29306b0 = aVar;
    }

    /* renamed from: a */
    public void mo30943a(boolean z) {
        this.f29309e0 = z;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x008d */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0058 A[Catch:{ IOException -> 0x002c, all -> 0x0029, IOException -> 0x008d }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007b A[SYNTHETIC, Splitter:B:29:0x007b] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0093 A[Catch:{ IOException -> 0x002c, all -> 0x0029, IOException -> 0x008d }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo30926b(p520io.sentry.event.Event r9) throws p551j.p552a.p560j.C12635e {
        /*
            r8 = this;
            j.a.j.f r0 = r8.f29305a0
            if (r0 == 0) goto L_0x000b
            boolean r0 = r0.mo30938a(r9)
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            java.net.HttpURLConnection r0 = r8.mo30944b()
            r0.connect()     // Catch:{ IOException -> 0x002c }
            java.io.OutputStream r1 = r0.getOutputStream()     // Catch:{ IOException -> 0x002c }
            j.a.o.a r2 = r8.f29306b0     // Catch:{ IOException -> 0x002c }
            r2.mo30980a(r9, r1)     // Catch:{ IOException -> 0x002c }
            r1.close()     // Catch:{ IOException -> 0x002c }
            java.io.InputStream r1 = r0.getInputStream()     // Catch:{ IOException -> 0x002c }
            r1.close()     // Catch:{ IOException -> 0x002c }
            r0.disconnect()
            return
        L_0x0029:
            r9 = move-exception
            goto L_0x00a7
        L_0x002c:
            r1 = move-exception
            java.lang.String r2 = "Retry-After"
            java.lang.String r2 = r0.getHeaderField(r2)     // Catch:{ all -> 0x0029 }
            r3 = 0
            if (r2 == 0) goto L_0x0047
            double r4 = java.lang.Double.parseDouble(r2)     // Catch:{ NumberFormatException -> 0x0047 }
            r6 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r4 = r4 * r6
            long r4 = (long) r4     // Catch:{ NumberFormatException -> 0x0047 }
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch:{ NumberFormatException -> 0x0047 }
            goto L_0x0048
        L_0x0047:
            r2 = r3
        L_0x0048:
            int r4 = r0.getResponseCode()     // Catch:{ IOException -> 0x008c }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ IOException -> 0x008c }
            int r5 = r4.intValue()     // Catch:{ IOException -> 0x008d }
            r6 = 403(0x193, float:5.65E-43)
            if (r5 != r6) goto L_0x007b
            m.c.b r5 = f29299g0     // Catch:{ IOException -> 0x008d }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x008d }
            r6.<init>()     // Catch:{ IOException -> 0x008d }
            java.lang.String r7 = "Event '"
            r6.append(r7)     // Catch:{ IOException -> 0x008d }
            java.util.UUID r9 = r9.getId()     // Catch:{ IOException -> 0x008d }
            r6.append(r9)     // Catch:{ IOException -> 0x008d }
            java.lang.String r9 = "' was rejected by the Sentry server due to a filter."
            r6.append(r9)     // Catch:{ IOException -> 0x008d }
            java.lang.String r9 = r6.toString()     // Catch:{ IOException -> 0x008d }
            r5.mo34720a(r9)     // Catch:{ IOException -> 0x008d }
            r0.disconnect()
            return
        L_0x007b:
            int r9 = r4.intValue()     // Catch:{ IOException -> 0x008d }
            r5 = 429(0x1ad, float:6.01E-43)
            if (r9 == r5) goto L_0x0084
            goto L_0x008d
        L_0x0084:
            j.a.j.o r9 = new j.a.j.o     // Catch:{ IOException -> 0x008d }
            java.lang.String r5 = "Too many requests to Sentry: https://docs.sentry.io/learn/quotas/"
            r9.<init>(r5, r1, r2, r4)     // Catch:{ IOException -> 0x008d }
            throw r9     // Catch:{ IOException -> 0x008d }
        L_0x008c:
            r4 = r3
        L_0x008d:
            java.io.InputStream r9 = r0.getErrorStream()     // Catch:{ all -> 0x0029 }
            if (r9 == 0) goto L_0x0097
            java.lang.String r3 = r8.m39650a(r9)     // Catch:{ all -> 0x0029 }
        L_0x0097:
            if (r3 == 0) goto L_0x009f
            boolean r9 = r3.isEmpty()     // Catch:{ all -> 0x0029 }
            if (r9 == 0) goto L_0x00a1
        L_0x009f:
            java.lang.String r3 = "An exception occurred while submitting the event to the Sentry server."
        L_0x00a1:
            j.a.j.e r9 = new j.a.j.e     // Catch:{ all -> 0x0029 }
            r9.<init>(r3, r1, r2, r4)     // Catch:{ all -> 0x0029 }
            throw r9     // Catch:{ all -> 0x0029 }
        L_0x00a7:
            r0.disconnect()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p551j.p552a.p560j.C12638h.mo30926b(io.sentry.event.Event):void");
    }

    /* renamed from: b */
    public void mo30945b(int i) {
        this.f29308d0 = i;
    }
}
