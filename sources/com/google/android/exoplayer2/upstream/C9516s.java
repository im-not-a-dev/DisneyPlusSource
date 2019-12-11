package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.p393v0.C9537e;
import com.google.android.exoplayer2.p393v0.C9554k0;
import com.google.android.exoplayer2.p393v0.C9563q;
import com.google.android.exoplayer2.p393v0.C9574y;
import com.google.android.exoplayer2.upstream.HttpDataSource.C9437b;
import com.google.android.exoplayer2.upstream.HttpDataSource.C9438c;
import com.google.android.exoplayer2.upstream.HttpDataSource.C9439d;
import com.google.android.exoplayer2.upstream.HttpDataSource.C9440e;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* renamed from: com.google.android.exoplayer2.upstream.s */
/* compiled from: DefaultHttpDataSource */
public class C9516s extends C9497h implements HttpDataSource {

    /* renamed from: u */
    private static final Pattern f22196u = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: v */
    private static final AtomicReference<byte[]> f22197v = new AtomicReference<>();

    /* renamed from: e */
    private final boolean f22198e;

    /* renamed from: f */
    private final int f22199f;

    /* renamed from: g */
    private final int f22200g;

    /* renamed from: h */
    private final String f22201h;

    /* renamed from: i */
    private final C9574y<String> f22202i;

    /* renamed from: j */
    private final C9440e f22203j;

    /* renamed from: k */
    private final C9440e f22204k = new C9440e();

    /* renamed from: l */
    private DataSpec f22205l;

    /* renamed from: m */
    private HttpURLConnection f22206m;

    /* renamed from: n */
    private InputStream f22207n;

    /* renamed from: o */
    private boolean f22208o;

    /* renamed from: p */
    private int f22209p;

    /* renamed from: q */
    private long f22210q;

    /* renamed from: r */
    private long f22211r;

    /* renamed from: s */
    private long f22212s;

    /* renamed from: t */
    private long f22213t;

    public C9516s(String str, C9574y<String> yVar, int i, int i2, boolean z, C9440e eVar) {
        super(true);
        C9537e.m29298a(str);
        this.f22201h = str;
        this.f22202i = yVar;
        this.f22199f = i;
        this.f22200g = i2;
        this.f22198e = z;
        this.f22203j = eVar;
    }

    /* renamed from: d */
    private void m29260d() {
        HttpURLConnection httpURLConnection = this.f22206m;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                C9563q.m29496a("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.f22206m = null;
        }
    }

    /* renamed from: e */
    private void m29261e() throws IOException {
        if (this.f22212s != this.f22210q) {
            byte[] bArr = (byte[]) f22197v.getAndSet(null);
            if (bArr == null) {
                bArr = new byte[4096];
            }
            while (true) {
                long j = this.f22212s;
                long j2 = this.f22210q;
                if (j != j2) {
                    int read = this.f22207n.read(bArr, 0, (int) Math.min(j2 - j, (long) bArr.length));
                    if (Thread.currentThread().isInterrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.f22212s += (long) read;
                        mo24566a(read);
                    } else {
                        throw new EOFException();
                    }
                } else {
                    f22197v.set(bArr);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public Map<String, List<String>> mo9243a() {
        HttpURLConnection httpURLConnection = this.f22206m;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final long mo24583c() {
        long j = this.f22211r;
        return j == -1 ? j : j - this.f22213t;
    }

    public void close() throws C9437b {
        try {
            if (this.f22207n != null) {
                m29258a(this.f22206m, mo24583c());
                this.f22207n.close();
            }
            this.f22207n = null;
            m29260d();
            if (this.f22208o) {
                this.f22208o = false;
                mo24568b();
            }
        } catch (IOException e) {
            throw new C9437b(e, this.f22205l, 3);
        } catch (Throwable th) {
            this.f22207n = null;
            m29260d();
            if (this.f22208o) {
                this.f22208o = false;
                mo24568b();
            }
            throw th;
        }
    }

    public Uri getUri() {
        HttpURLConnection httpURLConnection = this.f22206m;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public long open(DataSpec dataSpec) throws C9437b {
        String str = "Unable to connect to ";
        this.f22205l = dataSpec;
        long j = 0;
        this.f22213t = 0;
        this.f22212s = 0;
        mo24567a(dataSpec);
        try {
            this.f22206m = m29259c(dataSpec);
            try {
                this.f22209p = this.f22206m.getResponseCode();
                String responseMessage = this.f22206m.getResponseMessage();
                int i = this.f22209p;
                if (i < 200 || i > 299) {
                    Map headerFields = this.f22206m.getHeaderFields();
                    m29260d();
                    C9439d dVar = new C9439d(this.f22209p, responseMessage, headerFields, dataSpec);
                    if (this.f22209p == 416) {
                        dVar.initCause(new C9507m(0));
                    }
                    throw dVar;
                }
                String contentType = this.f22206m.getContentType();
                C9574y<String> yVar = this.f22202i;
                if (yVar == null || yVar.mo24556a(contentType)) {
                    if (this.f22209p == 200) {
                        long j2 = dataSpec.f21942e;
                        if (j2 != 0) {
                            j = j2;
                        }
                    }
                    this.f22210q = j;
                    if (!dataSpec.mo24452a(1)) {
                        long j3 = dataSpec.f21943f;
                        long j4 = -1;
                        if (j3 != -1) {
                            this.f22211r = j3;
                        } else {
                            long a = m29255a(this.f22206m);
                            if (a != -1) {
                                j4 = a - this.f22210q;
                            }
                            this.f22211r = j4;
                        }
                    } else {
                        this.f22211r = dataSpec.f21943f;
                    }
                    try {
                        this.f22207n = this.f22206m.getInputStream();
                        this.f22208o = true;
                        mo24569b(dataSpec);
                        return this.f22211r;
                    } catch (IOException e) {
                        m29260d();
                        throw new C9437b(e, dataSpec, 1);
                    }
                } else {
                    m29260d();
                    throw new C9438c(contentType, dataSpec);
                }
            } catch (IOException e2) {
                m29260d();
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(dataSpec.f21938a.toString());
                throw new C9437b(sb.toString(), e2, dataSpec, 1);
            }
        } catch (IOException e3) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(dataSpec.f21938a.toString());
            throw new C9437b(sb2.toString(), e3, dataSpec, 1);
        }
    }

    public int read(byte[] bArr, int i, int i2) throws C9437b {
        try {
            m29261e();
            return m29254a(bArr, i, i2);
        } catch (IOException e) {
            throw new C9437b(e, this.f22205l, 2);
        }
    }

    /* renamed from: a */
    private HttpURLConnection m29256a(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, boolean z3) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f22199f);
        httpURLConnection.setReadTimeout(this.f22200g);
        C9440e eVar = this.f22203j;
        if (eVar != null) {
            for (Entry entry : eVar.mo24454a().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
        }
        for (Entry entry2 : this.f22204k.mo24454a().entrySet()) {
            httpURLConnection.setRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
        }
        if (!(j == 0 && j2 == -1)) {
            StringBuilder sb = new StringBuilder();
            sb.append("bytes=");
            sb.append(j);
            sb.append("-");
            String sb2 = sb.toString();
            if (j2 != -1) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                sb3.append((j + j2) - 1);
                sb2 = sb3.toString();
            }
            httpURLConnection.setRequestProperty("Range", sb2);
        }
        httpURLConnection.setRequestProperty("User-Agent", this.f22201h);
        if (!z) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        }
        if (z2) {
            httpURLConnection.setRequestProperty("Icy-MetaData", "1");
        }
        httpURLConnection.setInstanceFollowRedirects(z3);
        httpURLConnection.setDoOutput(bArr != null);
        httpURLConnection.setRequestMethod(DataSpec.m28944b(i));
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    /* renamed from: c */
    private HttpURLConnection m29259c(DataSpec dataSpec) throws IOException {
        HttpURLConnection a;
        DataSpec dataSpec2 = dataSpec;
        URL url = new URL(dataSpec2.f21938a.toString());
        int i = dataSpec2.f21939b;
        byte[] bArr = dataSpec2.f21940c;
        long j = dataSpec2.f21942e;
        long j2 = dataSpec2.f21943f;
        boolean a2 = dataSpec2.mo24452a(1);
        boolean a3 = dataSpec2.mo24452a(2);
        if (!this.f22198e) {
            return m29256a(url, i, bArr, j, j2, a2, a3, true);
        }
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (i2 <= 20) {
                int i4 = i3;
                long j3 = j2;
                long j4 = j;
                a = m29256a(url, i, bArr, j, j2, a2, a3, false);
                int responseCode = a.getResponseCode();
                String headerField = a.getHeaderField("Location");
                if ((i == 1 || i == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                    a.disconnect();
                    url = m29257a(url, headerField);
                } else if (i != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return a;
                } else {
                    a.disconnect();
                    url = m29257a(url, headerField);
                    bArr = null;
                    i = 1;
                }
                i2 = i4;
                j2 = j3;
                j = j4;
            } else {
                int i5 = i3;
                StringBuilder sb = new StringBuilder();
                sb.append("Too many redirects: ");
                sb.append(i5);
                throw new NoRouteToHostException(sb.toString());
            }
        }
        return a;
    }

    /* renamed from: a */
    private static URL m29257a(URL url, String str) throws IOException {
        if (str != null) {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if ("https".equals(protocol) || "http".equals(protocol)) {
                return url2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported protocol redirect: ");
            sb.append(protocol);
            throw new ProtocolException(sb.toString());
        }
        throw new ProtocolException("Null location redirect");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long m29255a(java.net.HttpURLConnection r10) {
        /*
            java.lang.String r0 = "Content-Length"
            java.lang.String r0 = r10.getHeaderField(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "]"
            java.lang.String r3 = "DefaultHttpDataSource"
            if (r1 != 0) goto L_0x002c
            long r4 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0015 }
            goto L_0x002e
        L_0x0015:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "Unexpected Content-Length ["
            r1.append(r4)
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.google.android.exoplayer2.p393v0.C9563q.m29497b(r3, r1)
        L_0x002c:
            r4 = -1
        L_0x002e:
            java.lang.String r1 = "Content-Range"
            java.lang.String r10 = r10.getHeaderField(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            if (r1 != 0) goto L_0x00a4
            java.util.regex.Pattern r1 = f22196u
            java.util.regex.Matcher r1 = r1.matcher(r10)
            boolean r6 = r1.find()
            if (r6 == 0) goto L_0x00a4
            r6 = 2
            java.lang.String r6 = r1.group(r6)     // Catch:{ NumberFormatException -> 0x008d }
            long r6 = java.lang.Long.parseLong(r6)     // Catch:{ NumberFormatException -> 0x008d }
            r8 = 1
            java.lang.String r1 = r1.group(r8)     // Catch:{ NumberFormatException -> 0x008d }
            long r8 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x008d }
            long r6 = r6 - r8
            r8 = 1
            long r6 = r6 + r8
            r8 = 0
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x0064
            r4 = r6
            goto L_0x00a4
        L_0x0064:
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x00a4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x008d }
            r1.<init>()     // Catch:{ NumberFormatException -> 0x008d }
            java.lang.String r8 = "Inconsistent headers ["
            r1.append(r8)     // Catch:{ NumberFormatException -> 0x008d }
            r1.append(r0)     // Catch:{ NumberFormatException -> 0x008d }
            java.lang.String r0 = "] ["
            r1.append(r0)     // Catch:{ NumberFormatException -> 0x008d }
            r1.append(r10)     // Catch:{ NumberFormatException -> 0x008d }
            r1.append(r2)     // Catch:{ NumberFormatException -> 0x008d }
            java.lang.String r0 = r1.toString()     // Catch:{ NumberFormatException -> 0x008d }
            com.google.android.exoplayer2.p393v0.C9563q.m29500d(r3, r0)     // Catch:{ NumberFormatException -> 0x008d }
            long r0 = java.lang.Math.max(r4, r6)     // Catch:{ NumberFormatException -> 0x008d }
            r4 = r0
            goto L_0x00a4
        L_0x008d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected Content-Range ["
            r0.append(r1)
            r0.append(r10)
            r0.append(r2)
            java.lang.String r10 = r0.toString()
            com.google.android.exoplayer2.p393v0.C9563q.m29497b(r3, r10)
        L_0x00a4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.C9516s.m29255a(java.net.HttpURLConnection):long");
    }

    /* renamed from: a */
    private int m29254a(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f22211r;
        if (j != -1) {
            long j2 = j - this.f22213t;
            if (j2 == 0) {
                return -1;
            }
            i2 = (int) Math.min((long) i2, j2);
        }
        int read = this.f22207n.read(bArr, i, i2);
        if (read != -1) {
            this.f22213t += (long) read;
            mo24566a(read);
            return read;
        } else if (this.f22211r == -1) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    /* renamed from: a */
    private static void m29258a(HttpURLConnection httpURLConnection, long j) {
        int i = C9554k0.f22281a;
        if (i == 19 || i == 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }
}
