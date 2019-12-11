package p163g.p164a.p165a;

import com.facebook.stetho.common.Utf8Charset;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: g.a.a.v0 */
/* compiled from: RemoteDownload */
class C4772v0 {

    /* renamed from: g.a.a.v0$b */
    /* compiled from: RemoteDownload */
    private static class C4774b implements Runnable {

        /* renamed from: U */
        private final String f11867U;

        /* renamed from: V */
        private final int f11868V;

        /* renamed from: W */
        private final int f11869W;

        /* renamed from: X */
        private final String f11870X;

        /* renamed from: c */
        private final C4775c f11871c;

        /* renamed from: a */
        protected static HttpURLConnection m16589a(String str) {
            try {
                return (HttpURLConnection) new URL(str).openConnection();
            } catch (Exception e) {
                C4783y0.m16636b("Cached Files - Exception opening URL(%s)", e.getLocalizedMessage());
                return null;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:114:0x01df A[Catch:{ all -> 0x02a4 }] */
        /* JADX WARNING: Removed duplicated region for block: B:116:0x01e6 A[SYNTHETIC, Splitter:B:116:0x01e6] */
        /* JADX WARNING: Removed duplicated region for block: B:121:0x01ee A[Catch:{ IOException -> 0x01ea }] */
        /* JADX WARNING: Removed duplicated region for block: B:130:0x0217 A[Catch:{ all -> 0x02a4 }] */
        /* JADX WARNING: Removed duplicated region for block: B:132:0x021e A[SYNTHETIC, Splitter:B:132:0x021e] */
        /* JADX WARNING: Removed duplicated region for block: B:137:0x0226 A[Catch:{ IOException -> 0x0222 }] */
        /* JADX WARNING: Removed duplicated region for block: B:146:0x024f A[Catch:{ all -> 0x02a4 }] */
        /* JADX WARNING: Removed duplicated region for block: B:148:0x0256 A[SYNTHETIC, Splitter:B:148:0x0256] */
        /* JADX WARNING: Removed duplicated region for block: B:153:0x025e A[Catch:{ IOException -> 0x025a }] */
        /* JADX WARNING: Removed duplicated region for block: B:163:0x0282 A[Catch:{ all -> 0x02a4 }] */
        /* JADX WARNING: Removed duplicated region for block: B:165:0x0289 A[SYNTHETIC, Splitter:B:165:0x0289] */
        /* JADX WARNING: Removed duplicated region for block: B:170:0x0291 A[Catch:{ IOException -> 0x028d }] */
        /* JADX WARNING: Removed duplicated region for block: B:177:0x02a8 A[SYNTHETIC, Splitter:B:177:0x02a8] */
        /* JADX WARNING: Removed duplicated region for block: B:182:0x02b0 A[Catch:{ IOException -> 0x02ac }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r14 = this;
                java.lang.String r0 = "Cached Files - Exception while attempting to close streams (%s)"
                java.lang.String r1 = r14.f11867U
                r2 = 0
                r3 = 0
                if (r1 != 0) goto L_0x0017
                java.lang.Object[] r0 = new java.lang.Object[r3]
                java.lang.String r1 = "Cached Files - url is null and cannot be cached"
                p163g.p164a.p165a.C4783y0.m16630a(r1, r0)
                g.a.a.v0$c r0 = r14.f11871c
                if (r0 == 0) goto L_0x0016
                r0.mo16108a(r3, r2)
            L_0x0016:
                return
            L_0x0017:
                boolean r1 = p163g.p164a.p165a.C4772v0.m16588k(r1)
                r4 = 1
                if (r1 != 0) goto L_0x0031
                java.lang.Object[] r0 = new java.lang.Object[r4]
                java.lang.String r1 = r14.f11867U
                r0[r3] = r1
                java.lang.String r1 = "Cached Files - given url is not valid and cannot be cached (\"%s\")"
                p163g.p164a.p165a.C4783y0.m16630a(r1, r0)
                g.a.a.v0$c r0 = r14.f11871c
                if (r0 == 0) goto L_0x0030
                r0.mo16108a(r3, r2)
            L_0x0030:
                return
            L_0x0031:
                java.lang.String r1 = r14.f11867U
                java.lang.String r5 = r14.f11870X
                java.io.File r1 = p163g.p164a.p165a.C4772v0.m16575b(r1, r5)
                java.text.SimpleDateFormat r5 = p163g.p164a.p165a.C4772v0.m16577b()
                java.lang.String r6 = r14.f11867U
                java.net.HttpURLConnection r6 = m16589a(r6)
                if (r6 != 0) goto L_0x004d
                g.a.a.v0$c r0 = r14.f11871c
                if (r0 == 0) goto L_0x004c
                r0.mo16108a(r3, r2)
            L_0x004c:
                return
            L_0x004d:
                int r7 = r14.f11868V
                r6.setConnectTimeout(r7)
                int r7 = r14.f11869W
                r6.setReadTimeout(r7)
                if (r1 == 0) goto L_0x008b
                java.lang.String r7 = r1.getPath()
                java.lang.String r7 = p163g.p164a.p165a.C4772v0.m16582e(r7)
                java.lang.String r7 = p163g.p164a.p165a.C4783y0.m16641d(r7)
                java.lang.String r8 = r1.getPath()
                long r8 = p163g.p164a.p165a.C4772v0.m16584g(r8)
                java.lang.Long r8 = java.lang.Long.valueOf(r8)
                long r9 = r8.longValue()
                r11 = 0
                int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r13 == 0) goto L_0x0084
                java.lang.String r5 = r5.format(r8)
                java.lang.String r8 = "If-Modified-Since"
                r6.setRequestProperty(r8, r5)
            L_0x0084:
                if (r7 == 0) goto L_0x008b
                java.lang.String r5 = "If-None-Match"
                r6.setRequestProperty(r5, r7)
            L_0x008b:
                r6.connect()     // Catch:{ SocketTimeoutException -> 0x0271, IOException -> 0x023b, Exception -> 0x0203, Error -> 0x01cb, all -> 0x01c7 }
                int r5 = r6.getResponseCode()     // Catch:{ SocketTimeoutException -> 0x0271, IOException -> 0x023b, Exception -> 0x0203, Error -> 0x01cb, all -> 0x01c7 }
                r7 = 304(0x130, float:4.26E-43)
                if (r5 != r7) goto L_0x00bb
                java.lang.String r5 = "Cached Files - File has not been modified since last download. (%s)"
                java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ SocketTimeoutException -> 0x0271, IOException -> 0x023b, Exception -> 0x0203, Error -> 0x01cb, all -> 0x01c7 }
                java.lang.String r8 = r14.f11867U     // Catch:{ SocketTimeoutException -> 0x0271, IOException -> 0x023b, Exception -> 0x0203, Error -> 0x01cb, all -> 0x01c7 }
                r7[r3] = r8     // Catch:{ SocketTimeoutException -> 0x0271, IOException -> 0x023b, Exception -> 0x0203, Error -> 0x01cb, all -> 0x01c7 }
                p163g.p164a.p165a.C4783y0.m16630a(r5, r7)     // Catch:{ SocketTimeoutException -> 0x0271, IOException -> 0x023b, Exception -> 0x0203, Error -> 0x01cb, all -> 0x01c7 }
                g.a.a.v0$c r5 = r14.f11871c     // Catch:{ SocketTimeoutException -> 0x0271, IOException -> 0x023b, Exception -> 0x0203, Error -> 0x01cb, all -> 0x01c7 }
                if (r5 == 0) goto L_0x00aa
                g.a.a.v0$c r5 = r14.f11871c     // Catch:{ SocketTimeoutException -> 0x0271, IOException -> 0x023b, Exception -> 0x0203, Error -> 0x01cb, all -> 0x01c7 }
                r5.mo16108a(r3, r1)     // Catch:{ SocketTimeoutException -> 0x0271, IOException -> 0x023b, Exception -> 0x0203, Error -> 0x01cb, all -> 0x01c7 }
            L_0x00aa:
                r6.disconnect()     // Catch:{ IOException -> 0x00ae }
                goto L_0x00ba
            L_0x00ae:
                r1 = move-exception
                java.lang.Object[] r2 = new java.lang.Object[r4]
                java.lang.String r1 = r1.getLocalizedMessage()
                r2[r3] = r1
                p163g.p164a.p165a.C4783y0.m16640c(r0, r2)
            L_0x00ba:
                return
            L_0x00bb:
                int r5 = r6.getResponseCode()     // Catch:{ SocketTimeoutException -> 0x0271, IOException -> 0x023b, Exception -> 0x0203, Error -> 0x01cb, all -> 0x01c7 }
                r7 = 404(0x194, float:5.66E-43)
                if (r5 != r7) goto L_0x00e8
                java.lang.String r5 = "Cached Files - File not found. (%s)"
                java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ SocketTimeoutException -> 0x0271, IOException -> 0x023b, Exception -> 0x0203, Error -> 0x01cb, all -> 0x01c7 }
                java.lang.String r8 = r14.f11867U     // Catch:{ SocketTimeoutException -> 0x0271, IOException -> 0x023b, Exception -> 0x0203, Error -> 0x01cb, all -> 0x01c7 }
                r7[r3] = r8     // Catch:{ SocketTimeoutException -> 0x0271, IOException -> 0x023b, Exception -> 0x0203, Error -> 0x01cb, all -> 0x01c7 }
                p163g.p164a.p165a.C4783y0.m16630a(r5, r7)     // Catch:{ SocketTimeoutException -> 0x0271, IOException -> 0x023b, Exception -> 0x0203, Error -> 0x01cb, all -> 0x01c7 }
                g.a.a.v0$c r5 = r14.f11871c     // Catch:{ SocketTimeoutException -> 0x0271, IOException -> 0x023b, Exception -> 0x0203, Error -> 0x01cb, all -> 0x01c7 }
                if (r5 == 0) goto L_0x00d7
                g.a.a.v0$c r5 = r14.f11871c     // Catch:{ SocketTimeoutException -> 0x0271, IOException -> 0x023b, Exception -> 0x0203, Error -> 0x01cb, all -> 0x01c7 }
                r5.mo16108a(r3, r1)     // Catch:{ SocketTimeoutException -> 0x0271, IOException -> 0x023b, Exception -> 0x0203, Error -> 0x01cb, all -> 0x01c7 }
            L_0x00d7:
                r6.disconnect()     // Catch:{ IOException -> 0x00db }
                goto L_0x00e7
            L_0x00db:
                r1 = move-exception
                java.lang.Object[] r2 = new java.lang.Object[r4]
                java.lang.String r1 = r1.getLocalizedMessage()
                r2[r3] = r1
                p163g.p164a.p165a.C4783y0.m16640c(r0, r2)
            L_0x00e7:
                return
            L_0x00e8:
                int r5 = r6.getResponseCode()     // Catch:{ SocketTimeoutException -> 0x0271, IOException -> 0x023b, Exception -> 0x0203, Error -> 0x01cb, all -> 0x01c7 }
                r7 = 200(0xc8, float:2.8E-43)
                if (r5 == r7) goto L_0x0127
                java.lang.String r5 = "Cached Files - File could not be downloaded from URL (%s) Response: (%d) Message: (%s)"
                r7 = 3
                java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ SocketTimeoutException -> 0x0271, IOException -> 0x023b, Exception -> 0x0203, Error -> 0x01cb, all -> 0x01c7 }
                java.lang.String r8 = r14.f11867U     // Catch:{ SocketTimeoutException -> 0x0271, IOException -> 0x023b, Exception -> 0x0203, Error -> 0x01cb, all -> 0x01c7 }
                r7[r3] = r8     // Catch:{ SocketTimeoutException -> 0x0271, IOException -> 0x023b, Exception -> 0x0203, Error -> 0x01cb, all -> 0x01c7 }
                int r8 = r6.getResponseCode()     // Catch:{ SocketTimeoutException -> 0x0271, IOException -> 0x023b, Exception -> 0x0203, Error -> 0x01cb, all -> 0x01c7 }
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ SocketTimeoutException -> 0x0271, IOException -> 0x023b, Exception -> 0x0203, Error -> 0x01cb, all -> 0x01c7 }
                r7[r4] = r8     // Catch:{ SocketTimeoutException -> 0x0271, IOException -> 0x023b, Exception -> 0x0203, Error -> 0x01cb, all -> 0x01c7 }
                r8 = 2
                java.lang.String r9 = r6.getResponseMessage()     // Catch:{ SocketTimeoutException -> 0x0271, IOException -> 0x023b, Exception -> 0x0203, Error -> 0x01cb, all -> 0x01c7 }
                r7[r8] = r9     // Catch:{ SocketTimeoutException -> 0x0271, IOException -> 0x023b, Exception -> 0x0203, Error -> 0x01cb, all -> 0x01c7 }
                p163g.p164a.p165a.C4783y0.m16640c(r5, r7)     // Catch:{ SocketTimeoutException -> 0x0271, IOException -> 0x023b, Exception -> 0x0203, Error -> 0x01cb, all -> 0x01c7 }
                g.a.a.v0$c r5 = r14.f11871c     // Catch:{ SocketTimeoutException -> 0x0271, IOException -> 0x023b, Exception -> 0x0203, Error -> 0x01cb, all -> 0x01c7 }
                if (r5 == 0) goto L_0x0116
                g.a.a.v0$c r5 = r14.f11871c     // Catch:{ SocketTimeoutException -> 0x0271, IOException -> 0x023b, Exception -> 0x0203, Error -> 0x01cb, all -> 0x01c7 }
                r5.mo16108a(r3, r1)     // Catch:{ SocketTimeoutException -> 0x0271, IOException -> 0x023b, Exception -> 0x0203, Error -> 0x01cb, all -> 0x01c7 }
            L_0x0116:
                r6.disconnect()     // Catch:{ IOException -> 0x011a }
                goto L_0x0126
            L_0x011a:
                r1 = move-exception
                java.lang.Object[] r2 = new java.lang.Object[r4]
                java.lang.String r1 = r1.getLocalizedMessage()
                r2[r3] = r1
                p163g.p164a.p165a.C4783y0.m16640c(r0, r2)
            L_0x0126:
                return
            L_0x0127:
                if (r1 == 0) goto L_0x0130
                java.lang.String r1 = r14.f11867U     // Catch:{ SocketTimeoutException -> 0x0271, IOException -> 0x023b, Exception -> 0x0203, Error -> 0x01cb, all -> 0x01c7 }
                java.lang.String r5 = r14.f11870X     // Catch:{ SocketTimeoutException -> 0x0271, IOException -> 0x023b, Exception -> 0x0203, Error -> 0x01cb, all -> 0x01c7 }
                p163g.p164a.p165a.C4772v0.m16573a(r1, r5)     // Catch:{ SocketTimeoutException -> 0x0271, IOException -> 0x023b, Exception -> 0x0203, Error -> 0x01cb, all -> 0x01c7 }
            L_0x0130:
                java.util.Date r1 = new java.util.Date     // Catch:{ SocketTimeoutException -> 0x0271, IOException -> 0x023b, Exception -> 0x0203, Error -> 0x01cb, all -> 0x01c7 }
                long r7 = r6.getLastModified()     // Catch:{ SocketTimeoutException -> 0x0271, IOException -> 0x023b, Exception -> 0x0203, Error -> 0x01cb, all -> 0x01c7 }
                r1.<init>(r7)     // Catch:{ SocketTimeoutException -> 0x0271, IOException -> 0x023b, Exception -> 0x0203, Error -> 0x01cb, all -> 0x01c7 }
                java.lang.String r5 = "ETag"
                java.lang.String r5 = r6.getHeaderField(r5)     // Catch:{ SocketTimeoutException -> 0x0271, IOException -> 0x023b, Exception -> 0x0203, Error -> 0x01cb, all -> 0x01c7 }
                if (r5 == 0) goto L_0x0145
                java.lang.String r5 = p163g.p164a.p165a.C4783y0.m16639c(r5)     // Catch:{ SocketTimeoutException -> 0x0271, IOException -> 0x023b, Exception -> 0x0203, Error -> 0x01cb, all -> 0x01c7 }
            L_0x0145:
                java.lang.String r7 = r14.f11867U     // Catch:{ SocketTimeoutException -> 0x0271, IOException -> 0x023b, Exception -> 0x0203, Error -> 0x01cb, all -> 0x01c7 }
                java.lang.String r8 = r14.f11870X     // Catch:{ SocketTimeoutException -> 0x0271, IOException -> 0x023b, Exception -> 0x0203, Error -> 0x01cb, all -> 0x01c7 }
                java.io.File r1 = p163g.p164a.p165a.C4772v0.m16576b(r7, r1, r5, r8)     // Catch:{ SocketTimeoutException -> 0x0271, IOException -> 0x023b, Exception -> 0x0203, Error -> 0x01cb, all -> 0x01c7 }
                if (r1 != 0) goto L_0x0169
                g.a.a.v0$c r1 = r14.f11871c     // Catch:{ SocketTimeoutException -> 0x0271, IOException -> 0x023b, Exception -> 0x0203, Error -> 0x01cb, all -> 0x01c7 }
                if (r1 == 0) goto L_0x0158
                g.a.a.v0$c r1 = r14.f11871c     // Catch:{ SocketTimeoutException -> 0x0271, IOException -> 0x023b, Exception -> 0x0203, Error -> 0x01cb, all -> 0x01c7 }
                r1.mo16108a(r3, r2)     // Catch:{ SocketTimeoutException -> 0x0271, IOException -> 0x023b, Exception -> 0x0203, Error -> 0x01cb, all -> 0x01c7 }
            L_0x0158:
                r6.disconnect()     // Catch:{ IOException -> 0x015c }
                goto L_0x0168
            L_0x015c:
                r1 = move-exception
                java.lang.Object[] r2 = new java.lang.Object[r4]
                java.lang.String r1 = r1.getLocalizedMessage()
                r2[r3] = r1
                p163g.p164a.p165a.C4783y0.m16640c(r0, r2)
            L_0x0168:
                return
            L_0x0169:
                java.io.InputStream r5 = r6.getInputStream()     // Catch:{ SocketTimeoutException -> 0x0271, IOException -> 0x023b, Exception -> 0x0203, Error -> 0x01cb, all -> 0x01c7 }
                java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ SocketTimeoutException -> 0x01c4, IOException -> 0x01c0, Exception -> 0x01bd, Error -> 0x01ba, all -> 0x01b7 }
                r7.<init>(r1)     // Catch:{ SocketTimeoutException -> 0x01c4, IOException -> 0x01c0, Exception -> 0x01bd, Error -> 0x01ba, all -> 0x01b7 }
                r8 = 4096(0x1000, float:5.74E-42)
                byte[] r8 = new byte[r8]     // Catch:{ SocketTimeoutException -> 0x0273, IOException -> 0x01b4, Exception -> 0x01b2, Error -> 0x01b0 }
            L_0x0176:
                int r9 = r5.read(r8)     // Catch:{ SocketTimeoutException -> 0x0273, IOException -> 0x01b4, Exception -> 0x01b2, Error -> 0x01b0 }
                r10 = -1
                if (r9 == r10) goto L_0x0181
                r7.write(r8, r3, r9)     // Catch:{ SocketTimeoutException -> 0x0273, IOException -> 0x01b4, Exception -> 0x01b2, Error -> 0x01b0 }
                goto L_0x0176
            L_0x0181:
                java.lang.String r8 = "Cached Files - Caching successful (%s)"
                java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch:{ SocketTimeoutException -> 0x0273, IOException -> 0x01b4, Exception -> 0x01b2, Error -> 0x01b0 }
                java.lang.String r10 = r14.f11867U     // Catch:{ SocketTimeoutException -> 0x0273, IOException -> 0x01b4, Exception -> 0x01b2, Error -> 0x01b0 }
                r9[r3] = r10     // Catch:{ SocketTimeoutException -> 0x0273, IOException -> 0x01b4, Exception -> 0x01b2, Error -> 0x01b0 }
                p163g.p164a.p165a.C4783y0.m16630a(r8, r9)     // Catch:{ SocketTimeoutException -> 0x0273, IOException -> 0x01b4, Exception -> 0x01b2, Error -> 0x01b0 }
                g.a.a.v0$c r8 = r14.f11871c     // Catch:{ SocketTimeoutException -> 0x0273, IOException -> 0x01b4, Exception -> 0x01b2, Error -> 0x01b0 }
                if (r8 == 0) goto L_0x0195
                g.a.a.v0$c r8 = r14.f11871c     // Catch:{ SocketTimeoutException -> 0x0273, IOException -> 0x01b4, Exception -> 0x01b2, Error -> 0x01b0 }
                r8.mo16108a(r4, r1)     // Catch:{ SocketTimeoutException -> 0x0273, IOException -> 0x01b4, Exception -> 0x01b2, Error -> 0x01b0 }
            L_0x0195:
                r7.close()     // Catch:{ IOException -> 0x01a2 }
                if (r5 == 0) goto L_0x019d
                r5.close()     // Catch:{ IOException -> 0x01a2 }
            L_0x019d:
                r6.disconnect()     // Catch:{ IOException -> 0x01a2 }
                goto L_0x02a3
            L_0x01a2:
                r1 = move-exception
                java.lang.Object[] r2 = new java.lang.Object[r4]
                java.lang.String r1 = r1.getLocalizedMessage()
                r2[r3] = r1
                p163g.p164a.p165a.C4783y0.m16640c(r0, r2)
                goto L_0x02a3
            L_0x01b0:
                r1 = move-exception
                goto L_0x01ce
            L_0x01b2:
                r1 = move-exception
                goto L_0x0206
            L_0x01b4:
                r1 = move-exception
                goto L_0x023e
            L_0x01b7:
                r1 = move-exception
                goto L_0x02a6
            L_0x01ba:
                r1 = move-exception
                r7 = r2
                goto L_0x01ce
            L_0x01bd:
                r1 = move-exception
                r7 = r2
                goto L_0x0206
            L_0x01c0:
                r1 = move-exception
                r7 = r2
                goto L_0x023e
            L_0x01c4:
                r7 = r2
                goto L_0x0273
            L_0x01c7:
                r1 = move-exception
                r5 = r2
                goto L_0x02a6
            L_0x01cb:
                r1 = move-exception
                r5 = r2
                r7 = r5
            L_0x01ce:
                java.lang.String r8 = "Cached Files - Unexpected error while attempting to get remote file (%s)"
                java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch:{ all -> 0x02a4 }
                java.lang.String r1 = r1.getLocalizedMessage()     // Catch:{ all -> 0x02a4 }
                r9[r3] = r1     // Catch:{ all -> 0x02a4 }
                p163g.p164a.p165a.C4783y0.m16640c(r8, r9)     // Catch:{ all -> 0x02a4 }
                g.a.a.v0$c r1 = r14.f11871c     // Catch:{ all -> 0x02a4 }
                if (r1 == 0) goto L_0x01e4
                g.a.a.v0$c r1 = r14.f11871c     // Catch:{ all -> 0x02a4 }
                r1.mo16108a(r3, r2)     // Catch:{ all -> 0x02a4 }
            L_0x01e4:
                if (r7 == 0) goto L_0x01ec
                r7.close()     // Catch:{ IOException -> 0x01ea }
                goto L_0x01ec
            L_0x01ea:
                r1 = move-exception
                goto L_0x01f6
            L_0x01ec:
                if (r5 == 0) goto L_0x01f1
                r5.close()     // Catch:{ IOException -> 0x01ea }
            L_0x01f1:
                r6.disconnect()     // Catch:{ IOException -> 0x01ea }
                goto L_0x02a3
            L_0x01f6:
                java.lang.Object[] r2 = new java.lang.Object[r4]
                java.lang.String r1 = r1.getLocalizedMessage()
                r2[r3] = r1
                p163g.p164a.p165a.C4783y0.m16640c(r0, r2)
                goto L_0x02a3
            L_0x0203:
                r1 = move-exception
                r5 = r2
                r7 = r5
            L_0x0206:
                java.lang.String r8 = "Cached Files - Unexpected exception while attempting to get remote file (%s)"
                java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch:{ all -> 0x02a4 }
                java.lang.String r1 = r1.getLocalizedMessage()     // Catch:{ all -> 0x02a4 }
                r9[r3] = r1     // Catch:{ all -> 0x02a4 }
                p163g.p164a.p165a.C4783y0.m16640c(r8, r9)     // Catch:{ all -> 0x02a4 }
                g.a.a.v0$c r1 = r14.f11871c     // Catch:{ all -> 0x02a4 }
                if (r1 == 0) goto L_0x021c
                g.a.a.v0$c r1 = r14.f11871c     // Catch:{ all -> 0x02a4 }
                r1.mo16108a(r3, r2)     // Catch:{ all -> 0x02a4 }
            L_0x021c:
                if (r7 == 0) goto L_0x0224
                r7.close()     // Catch:{ IOException -> 0x0222 }
                goto L_0x0224
            L_0x0222:
                r1 = move-exception
                goto L_0x022e
            L_0x0224:
                if (r5 == 0) goto L_0x0229
                r5.close()     // Catch:{ IOException -> 0x0222 }
            L_0x0229:
                r6.disconnect()     // Catch:{ IOException -> 0x0222 }
                goto L_0x02a3
            L_0x022e:
                java.lang.Object[] r2 = new java.lang.Object[r4]
                java.lang.String r1 = r1.getLocalizedMessage()
                r2[r3] = r1
                p163g.p164a.p165a.C4783y0.m16640c(r0, r2)
                goto L_0x02a3
            L_0x023b:
                r1 = move-exception
                r5 = r2
                r7 = r5
            L_0x023e:
                java.lang.String r8 = "Cached Files - IOException while making request (%s)"
                java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch:{ all -> 0x02a4 }
                java.lang.String r1 = r1.getLocalizedMessage()     // Catch:{ all -> 0x02a4 }
                r9[r3] = r1     // Catch:{ all -> 0x02a4 }
                p163g.p164a.p165a.C4783y0.m16640c(r8, r9)     // Catch:{ all -> 0x02a4 }
                g.a.a.v0$c r1 = r14.f11871c     // Catch:{ all -> 0x02a4 }
                if (r1 == 0) goto L_0x0254
                g.a.a.v0$c r1 = r14.f11871c     // Catch:{ all -> 0x02a4 }
                r1.mo16108a(r3, r2)     // Catch:{ all -> 0x02a4 }
            L_0x0254:
                if (r7 == 0) goto L_0x025c
                r7.close()     // Catch:{ IOException -> 0x025a }
                goto L_0x025c
            L_0x025a:
                r1 = move-exception
                goto L_0x0265
            L_0x025c:
                if (r5 == 0) goto L_0x0261
                r5.close()     // Catch:{ IOException -> 0x025a }
            L_0x0261:
                r6.disconnect()     // Catch:{ IOException -> 0x025a }
                goto L_0x02a3
            L_0x0265:
                java.lang.Object[] r2 = new java.lang.Object[r4]
                java.lang.String r1 = r1.getLocalizedMessage()
                r2[r3] = r1
                p163g.p164a.p165a.C4783y0.m16640c(r0, r2)
                goto L_0x02a3
            L_0x0271:
                r5 = r2
                r7 = r5
            L_0x0273:
                java.lang.String r1 = "Cached Files - Timed out making request (%s)"
                java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ all -> 0x02a4 }
                java.lang.String r9 = r14.f11867U     // Catch:{ all -> 0x02a4 }
                r8[r3] = r9     // Catch:{ all -> 0x02a4 }
                p163g.p164a.p165a.C4783y0.m16640c(r1, r8)     // Catch:{ all -> 0x02a4 }
                g.a.a.v0$c r1 = r14.f11871c     // Catch:{ all -> 0x02a4 }
                if (r1 == 0) goto L_0x0287
                g.a.a.v0$c r1 = r14.f11871c     // Catch:{ all -> 0x02a4 }
                r1.mo16108a(r3, r2)     // Catch:{ all -> 0x02a4 }
            L_0x0287:
                if (r7 == 0) goto L_0x028f
                r7.close()     // Catch:{ IOException -> 0x028d }
                goto L_0x028f
            L_0x028d:
                r1 = move-exception
                goto L_0x0298
            L_0x028f:
                if (r5 == 0) goto L_0x0294
                r5.close()     // Catch:{ IOException -> 0x028d }
            L_0x0294:
                r6.disconnect()     // Catch:{ IOException -> 0x028d }
                goto L_0x02a3
            L_0x0298:
                java.lang.Object[] r2 = new java.lang.Object[r4]
                java.lang.String r1 = r1.getLocalizedMessage()
                r2[r3] = r1
                p163g.p164a.p165a.C4783y0.m16640c(r0, r2)
            L_0x02a3:
                return
            L_0x02a4:
                r1 = move-exception
                r2 = r7
            L_0x02a6:
                if (r2 == 0) goto L_0x02ae
                r2.close()     // Catch:{ IOException -> 0x02ac }
                goto L_0x02ae
            L_0x02ac:
                r2 = move-exception
                goto L_0x02b7
            L_0x02ae:
                if (r5 == 0) goto L_0x02b3
                r5.close()     // Catch:{ IOException -> 0x02ac }
            L_0x02b3:
                r6.disconnect()     // Catch:{ IOException -> 0x02ac }
                goto L_0x02c2
            L_0x02b7:
                java.lang.Object[] r4 = new java.lang.Object[r4]
                java.lang.String r2 = r2.getLocalizedMessage()
                r4[r3] = r2
                p163g.p164a.p165a.C4783y0.m16640c(r0, r4)
            L_0x02c2:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p163g.p164a.p165a.C4772v0.C4774b.run():void");
        }

        private C4774b(String str, C4775c cVar, int i, int i2, String str2) {
            this.f11867U = str;
            this.f11871c = cVar;
            this.f11868V = i;
            this.f11869W = i2;
            this.f11870X = str2;
        }
    }

    /* renamed from: g.a.a.v0$c */
    /* compiled from: RemoteDownload */
    protected interface C4775c {
        /* renamed from: a */
        void mo16108a(boolean z, File file);
    }

    /* renamed from: c */
    protected static void m16580c(String str) {
        File d = m16581d(str);
        if (d != null) {
            File[] listFiles = d.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (File delete : listFiles) {
                    if (delete.delete()) {
                        C4783y0.m16630a("Cached File - Removed unused cache file", new Object[0]);
                    } else {
                        C4783y0.m16640c("Cached File - Failed to remove unused cache file", new Object[0]);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    protected static File m16581d(String str) {
        File file = new File(C4783y0.m16651k(), str);
        if (file.exists() || file.mkdir()) {
            return file;
        }
        C4783y0.m16640c("Cached File - unable to open/make download cache directory", new Object[0]);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static String m16582e(String str) {
        if (str == null || str.length() < 1) {
            C4783y0.m16640c("Cached File - Path was null or empty for Cache File", new Object[0]);
            return null;
        }
        String[] j = m16587j(m16585h(str));
        if (j != null && j.length >= 2) {
            return j[1];
        }
        C4783y0.m16640c("Cached File - No etag for file. Extension had no second value after split.", new Object[0]);
        return null;
    }

    /* renamed from: f */
    protected static File m16583f(String str) {
        return m16575b(str, "adbdownloadcache");
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static long m16584g(String str) {
        if (str == null || str.length() < 1) {
            C4783y0.m16640c("Cached File - Path was null or empty for Cache File. Could not get Last Modified Date.", new Object[0]);
            return 0;
        }
        String[] j = m16587j(m16585h(str));
        if (j != null && j.length >= 1) {
            return Long.parseLong(j[0]);
        }
        C4783y0.m16640c("Cached File - No last modified date for file. Extension had no values after split.", new Object[0]);
        return 0;
    }

    /* renamed from: h */
    private static String m16585h(String str) {
        if (str != null && str.length() >= 1) {
            return str.substring(str.lastIndexOf(".") + 1);
        }
        C4783y0.m16640c("Cached File - Path was null or empty for Cache File", new Object[0]);
        return null;
    }

    /* renamed from: i */
    private static String m16586i(String str) {
        if (str != null && str.length() >= 1) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(str.getBytes(Utf8Charset.NAME));
                byte[] digest = instance.digest();
                StringBuilder sb = new StringBuilder();
                for (byte b : digest) {
                    String hexString = Integer.toHexString(b & 255);
                    while (hexString.length() < 2) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("0");
                        sb2.append(hexString);
                        hexString = sb2.toString();
                    }
                    sb.append(hexString);
                }
                return sb.toString();
            } catch (NoSuchAlgorithmException e) {
                C4783y0.m16636b("Cached Files - unable to get md5 hash (%s)", e.getMessage());
            } catch (UnsupportedEncodingException e2) {
                C4783y0.m16636b("Cached Files - Unsupported Encoding: UTF-8 (%s)", e2.getMessage());
            }
        }
        return null;
    }

    /* renamed from: j */
    private static String[] m16587j(String str) {
        if (str == null || str.length() < 1) {
            C4783y0.m16640c("Cached File - Extension was null or empty on Cache File", new Object[0]);
            return null;
        }
        String[] split = str.split("_");
        if (split.length == 2) {
            return split;
        }
        C4783y0.m16640c("Cached File - Invalid Extension on Cache File (%s)", str);
        return null;
    }

    /* renamed from: k */
    protected static boolean m16588k(String str) {
        if (str != null && str.length() > 0) {
            try {
                new URL(str);
                return true;
            } catch (MalformedURLException unused) {
            }
        }
        return false;
    }

    /* renamed from: b */
    protected static void m16578b(String str, int i, int i2, C4775c cVar, String str2) {
        C4774b bVar = new C4774b(str, cVar, i, i2, str2);
        bVar.run();
    }

    /* renamed from: a */
    protected static void m16570a(String str, int i, int i2, C4775c cVar, String str2) {
        C4774b bVar = new C4774b(str, cVar, i, i2, str2);
        new Thread(bVar).start();
    }

    /* renamed from: b */
    protected static void m16579b(String str, C4775c cVar) {
        m16578b(str, 10000, 10000, cVar, "adbdownloadcache");
    }

    /* renamed from: b */
    protected static File m16575b(String str, String str2) {
        if (str != null && str.length() >= 1) {
            File d = m16581d(str2);
            if (d == null) {
                return null;
            }
            String[] list = d.list();
            if (list == null || list.length < 1) {
                C4783y0.m16630a("Cached Files - Directory is empty (%s).", d.getAbsolutePath());
            } else {
                String i = m16586i(str);
                for (String str3 : list) {
                    if (str3.substring(0, str3.lastIndexOf(46)).equals(i)) {
                        return new File(d, str3);
                    }
                }
                C4783y0.m16630a("Cached Files - This file has not previously been cached (%s).", str);
                return null;
            }
        }
        return null;
    }

    /* renamed from: a */
    protected static void m16571a(String str, C4775c cVar) {
        m16570a(str, 10000, 10000, cVar, "adbdownloadcache");
    }

    /* renamed from: a */
    protected static void m16572a(String str, List<String> list) {
        if (list == null || list.size() <= 0) {
            m16580c(str);
            return;
        }
        File d = m16581d(str);
        if (d != null) {
            File[] listFiles = d.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                ArrayList arrayList = new ArrayList();
                for (String i : list) {
                    arrayList.add(m16586i(i));
                }
                for (File file : listFiles) {
                    String name = file.getName();
                    if (!arrayList.contains(name.substring(0, name.indexOf(".")))) {
                        if (file.delete()) {
                            C4783y0.m16630a("Cached File - Removed unused cache file", new Object[0]);
                        } else {
                            C4783y0.m16640c("Cached File - Failed to remove unused cache file", new Object[0]);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static File m16576b(String str, Date date, String str2, String str3) {
        if (str == null || str.length() < 1) {
            C4783y0.m16640c("Cached File - Invalid url parameter while attempting to create cache file. Could not save data.", new Object[0]);
            return null;
        } else if (date == null) {
            C4783y0.m16640c("Cached File - Invalid lastModified parameter while attempting to create cache file. Could not save data.", new Object[0]);
            return null;
        } else if (str2 == null || str2.length() < 1) {
            C4783y0.m16640c("Cached File - Invalid etag parameter while attempting to create cache file. Could not save data.", new Object[0]);
            return null;
        } else {
            File d = m16581d(str3);
            if (d == null) {
                return null;
            }
            String i = m16586i(str);
            if (i == null || i.length() < 1) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(d.getPath());
            sb.append(File.separator);
            sb.append(m16586i(str));
            sb.append(".");
            sb.append(date.getTime());
            sb.append("_");
            sb.append(str2);
            return new File(sb.toString());
        }
    }

    /* renamed from: a */
    protected static boolean m16573a(String str, String str2) {
        boolean z = false;
        if (str == null || str.length() < 1) {
            C4783y0.m16640c("Cached File - tried to delete cached file, but file path was empty", new Object[0]);
            return false;
        }
        File b = m16575b(str, str2);
        if (b != null && b.delete()) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static SimpleDateFormat m16577b() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss Z", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
