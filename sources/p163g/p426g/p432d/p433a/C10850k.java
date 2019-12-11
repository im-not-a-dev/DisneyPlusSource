package p163g.p426g.p432d.p433a;

import com.bamtechmedia.dominguez.legal.DefaultLegalApi;
import p163g.p426g.p427a.p429j.C10827a;

/* renamed from: g.g.d.a.k */
/* compiled from: HTTPTask */
public class C10850k implements Runnable {

    /* renamed from: U */
    private String f25638U;

    /* renamed from: V */
    private String f25639V;

    /* renamed from: W */
    private String f25640W;

    /* renamed from: X */
    private int f25641X;

    /* renamed from: Y */
    private String f25642Y;

    /* renamed from: c */
    private C10827a f25643c = null;

    /* renamed from: g.g.d.a.k$a */
    /* compiled from: HTTPTask */
    private class C10851a {

        /* renamed from: a */
        public boolean f25644a;

        /* renamed from: b */
        public String f25645b;

        public C10851a(C10850k kVar, boolean z, String str) {
            this.f25644a = z;
            this.f25645b = str;
        }
    }

    /* renamed from: a */
    public void mo27923a(String str, String str2, String str3, String str4, int i, C10827a aVar) {
        if (str == null) {
            str = "POST";
        }
        this.f25638U = str;
        this.f25639V = str2;
        this.f25640W = str3;
        if (str4 == null) {
            str4 = DefaultLegalApi.MIME_TYPE_JSON;
        }
        this.f25642Y = str4;
        this.f25641X = i;
        this.f25643c = aVar;
    }

    public void run() {
        C10851a a = m34195a();
        m34196a(a.f25644a, a.f25645b);
    }

    /* renamed from: a */
    private void m34196a(boolean z, String str) {
        C10827a aVar = this.f25643c;
        if (aVar != null) {
            aVar.mo27892a(z, str);
        }
        this.f25643c = null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|(13:11|12|13|14|15|16|17|18|19|(2:20|(1:22)(1:82))|23|24|25)(1:59)|60|(2:62|63)(2:64|65)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0020 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p163g.p426g.p432d.p433a.C10850k.C10851a m34195a() {
        /*
            r9 = this;
            java.lang.String r0 = "POST"
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch:{ MalformedURLException -> 0x011e, ArrayIndexOutOfBoundsException -> 0x0113 }
            java.lang.String r3 = r9.f25639V     // Catch:{ MalformedURLException -> 0x011e, ArrayIndexOutOfBoundsException -> 0x0113 }
            r2.<init>(r3)     // Catch:{ MalformedURLException -> 0x011e, ArrayIndexOutOfBoundsException -> 0x0113 }
            java.net.URLConnection r2 = r2.openConnection()     // Catch:{ IOException -> 0x0105 }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ IOException -> 0x0105 }
            int r3 = r9.f25641X     // Catch:{ IOException -> 0x0105 }
            r2.setReadTimeout(r3)     // Catch:{ IOException -> 0x0105 }
            int r3 = r9.f25641X     // Catch:{ IOException -> 0x0105 }
            r2.setConnectTimeout(r3)     // Catch:{ IOException -> 0x0105 }
            java.lang.String r3 = r9.f25638U     // Catch:{ ProtocolException -> 0x0020 }
            r2.setRequestMethod(r3)     // Catch:{ ProtocolException -> 0x0020 }
            goto L_0x0027
        L_0x0020:
            r9.f25638U = r0     // Catch:{ IOException -> 0x0105 }
            java.lang.String r3 = r9.f25638U     // Catch:{ IOException -> 0x0105 }
            r2.setRequestMethod(r3)     // Catch:{ IOException -> 0x0105 }
        L_0x0027:
            java.lang.String r3 = "Content-Type"
            java.lang.String r4 = r9.f25642Y     // Catch:{ IOException -> 0x0105 }
            r2.setRequestProperty(r3, r4)     // Catch:{ IOException -> 0x0105 }
            java.lang.String r3 = "User-Agent"
            java.lang.String r4 = p163g.p426g.p432d.p433a.C10847h.m34192b()     // Catch:{ IOException -> 0x0105 }
            r2.setRequestProperty(r3, r4)     // Catch:{ IOException -> 0x0105 }
            java.lang.String r3 = r9.f25638U     // Catch:{ IOException -> 0x0105 }
            boolean r0 = r3.equals(r0)     // Catch:{ IOException -> 0x0105 }
            r3 = 1
            r4 = -1
            if (r0 == 0) goto L_0x00de
            r2.setDoOutput(r3)     // Catch:{ IOException -> 0x0105 }
            r2.setUseCaches(r1)     // Catch:{ IOException -> 0x0105 }
            java.lang.String r0 = r9.f25640W     // Catch:{ IOException -> 0x0105 }
            java.lang.String r5 = "UTF-8"
            byte[] r0 = r0.getBytes(r5)     // Catch:{ IOException -> 0x0105 }
            int r5 = r0.length     // Catch:{ IOException -> 0x0105 }
            r2.setFixedLengthStreamingMode(r5)     // Catch:{ IOException -> 0x0105 }
            java.io.BufferedOutputStream r5 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x00d2, IllegalStateException -> 0x00c7 }
            java.io.OutputStream r6 = r2.getOutputStream()     // Catch:{ IOException -> 0x00d2, IllegalStateException -> 0x00c7 }
            r5.<init>(r6)     // Catch:{ IOException -> 0x00d2, IllegalStateException -> 0x00c7 }
            r5.write(r0)     // Catch:{ IOException -> 0x00d2, IllegalStateException -> 0x00c7 }
            r5.close()     // Catch:{ IOException -> 0x00d2, IllegalStateException -> 0x00c7 }
            r2.connect()     // Catch:{ IOException -> 0x00b3 }
            int r0 = r2.getResponseCode()     // Catch:{ IOException -> 0x00a3 }
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0094 }
            java.io.InputStream r6 = r2.getInputStream()     // Catch:{ IOException -> 0x0094 }
            r5.<init>(r6)     // Catch:{ IOException -> 0x0094 }
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r6]     // Catch:{ IOException -> 0x0094 }
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0094 }
            r7.<init>()     // Catch:{ IOException -> 0x0094 }
        L_0x007b:
            int r8 = r5.read(r6)     // Catch:{ IOException -> 0x0094 }
            if (r8 == r4) goto L_0x0085
            r7.write(r6, r1, r8)     // Catch:{ IOException -> 0x0094 }
            goto L_0x007b
        L_0x0085:
            java.lang.String r4 = new java.lang.String     // Catch:{ IOException -> 0x0094 }
            byte[] r5 = r7.toByteArray()     // Catch:{ IOException -> 0x0094 }
            r4.<init>(r5)     // Catch:{ IOException -> 0x0094 }
            r2.disconnect()     // Catch:{ IOException -> 0x00d2, IllegalStateException -> 0x00c7 }
            goto L_0x00e2
        L_0x0092:
            r0 = move-exception
            goto L_0x00a2
        L_0x0094:
            r0 = move-exception
            g.g.d.a.k$a r3 = new g.g.d.a.k$a     // Catch:{ all -> 0x0092 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0092 }
            r3.<init>(r9, r1, r0)     // Catch:{ all -> 0x0092 }
            r2.disconnect()     // Catch:{ IOException -> 0x00d2, IllegalStateException -> 0x00c7 }
            return r3
        L_0x00a2:
            throw r0     // Catch:{ IOException -> 0x00b3 }
        L_0x00a3:
            r0 = move-exception
            g.g.d.a.k$a r3 = new g.g.d.a.k$a     // Catch:{ IOException -> 0x00b3 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x00b3 }
            r3.<init>(r9, r1, r0)     // Catch:{ IOException -> 0x00b3 }
            r2.disconnect()     // Catch:{ IOException -> 0x00d2, IllegalStateException -> 0x00c7 }
            return r3
        L_0x00b1:
            r0 = move-exception
            goto L_0x00c1
        L_0x00b3:
            r0 = move-exception
            g.g.d.a.k$a r3 = new g.g.d.a.k$a     // Catch:{ all -> 0x00b1 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00b1 }
            r3.<init>(r9, r1, r0)     // Catch:{ all -> 0x00b1 }
            r2.disconnect()     // Catch:{ IOException -> 0x00d2, IllegalStateException -> 0x00c7 }
            return r3
        L_0x00c1:
            r2.disconnect()     // Catch:{ IOException -> 0x00d2, IllegalStateException -> 0x00c7 }
            throw r0     // Catch:{ IOException -> 0x00d2, IllegalStateException -> 0x00c7 }
        L_0x00c5:
            r0 = move-exception
            goto L_0x00dd
        L_0x00c7:
            r0 = move-exception
            g.g.d.a.k$a r2 = new g.g.d.a.k$a     // Catch:{ all -> 0x00c5 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00c5 }
            r2.<init>(r9, r1, r0)     // Catch:{ all -> 0x00c5 }
            return r2
        L_0x00d2:
            r0 = move-exception
            g.g.d.a.k$a r2 = new g.g.d.a.k$a     // Catch:{ all -> 0x00c5 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00c5 }
            r2.<init>(r9, r1, r0)     // Catch:{ all -> 0x00c5 }
            return r2
        L_0x00dd:
            throw r0     // Catch:{ IOException -> 0x0105 }
        L_0x00de:
            java.lang.String r0 = ""
            r4 = r0
            r0 = -1
        L_0x00e2:
            r2 = 200(0xc8, float:2.8E-43)
            if (r0 != r2) goto L_0x00ec
            g.g.d.a.k$a r0 = new g.g.d.a.k$a
            r0.<init>(r9, r3, r4)
            return r0
        L_0x00ec:
            g.g.d.a.k$a r2 = new g.g.d.a.k$a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Status code in HTTP response is not OK: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r9, r1, r0)
            return r2
        L_0x0103:
            r0 = move-exception
            goto L_0x0110
        L_0x0105:
            r0 = move-exception
            g.g.d.a.k$a r2 = new g.g.d.a.k$a     // Catch:{ all -> 0x0103 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0103 }
            r2.<init>(r9, r1, r0)     // Catch:{ all -> 0x0103 }
            return r2
        L_0x0110:
            throw r0     // Catch:{ MalformedURLException -> 0x011e, ArrayIndexOutOfBoundsException -> 0x0113 }
        L_0x0111:
            r0 = move-exception
            goto L_0x0129
        L_0x0113:
            r0 = move-exception
            g.g.d.a.k$a r2 = new g.g.d.a.k$a     // Catch:{ all -> 0x0111 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0111 }
            r2.<init>(r9, r1, r0)     // Catch:{ all -> 0x0111 }
            return r2
        L_0x011e:
            r0 = move-exception
            g.g.d.a.k$a r2 = new g.g.d.a.k$a     // Catch:{ all -> 0x0111 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0111 }
            r2.<init>(r9, r1, r0)     // Catch:{ all -> 0x0111 }
            return r2
        L_0x0129:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p426g.p432d.p433a.C10850k.m34195a():g.g.d.a.k$a");
    }
}
