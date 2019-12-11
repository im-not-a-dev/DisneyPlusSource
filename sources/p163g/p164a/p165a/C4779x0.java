package p163g.p164a.p165a;

import com.facebook.stetho.common.Utf8Charset;
import com.facebook.stetho.server.http.HttpHeaders;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;

/* renamed from: g.a.a.x0 */
/* compiled from: RequestHandler */
final class C4779x0 {

    /* renamed from: g.a.a.x0$a */
    /* compiled from: RequestHandler */
    static class C4780a implements Callable<Map<String, String>> {

        /* renamed from: c */
        final /* synthetic */ Map f11872c;

        C4780a(Map map) {
            this.f11872c = map;
        }

        public Map<String, String> call() throws Exception {
            return this.f11872c;
        }
    }

    /* renamed from: g.a.a.x0$b */
    /* compiled from: RequestHandler */
    protected interface C4781b {
        /* renamed from: a */
        void mo16156a(Map<String, List<String>> map);
    }

    /* renamed from: a */
    protected static byte[] m16599a(String str, Map<String, String> map, int i, String str2) {
        if (C4783y0.m16611I()) {
            return C4684g1.m16310a(str, i);
        }
        C4780a aVar = new C4780a(map);
        if (map == null) {
            aVar = null;
        }
        return m16597a(str, i, str2, (Callable<Map<String, String>>) aVar, (C4781b) null);
    }

    /* renamed from: b */
    protected static void m16600b(String str, Map<String, String> map, int i, String str2) {
        String str3 = "%s - Exception while attempting to send hit, will not retry(%s)";
        if (str != null) {
            if (C4783y0.m16611I()) {
                C4684g1.m16306a(str, i, str2);
                return;
            }
            try {
                HttpURLConnection a = m16595a(str);
                if (a != null) {
                    a.setConnectTimeout(i);
                    a.setReadTimeout(i);
                    if (map != null) {
                        for (Entry entry : map.entrySet()) {
                            String str4 = (String) entry.getValue();
                            if (str4.trim().length() > 0) {
                                a.setRequestProperty((String) entry.getKey(), str4);
                            }
                        }
                    }
                    C4783y0.m16630a("%s - Request Sent(%s)", str2, str);
                    a.getResponseCode();
                    a.getInputStream().close();
                    a.disconnect();
                }
            } catch (SocketTimeoutException unused) {
                C4783y0.m16640c("%s - Timed out sending request(%s)", str2, str);
            } catch (IOException e) {
                C4783y0.m16640c("%s - IOException while sending request, may retry(%s)", str2, e.getLocalizedMessage());
            } catch (Exception e2) {
                C4783y0.m16640c(str3, str2, e2.getLocalizedMessage());
            } catch (Error e3) {
                C4783y0.m16640c(str3, str2, e3.getLocalizedMessage());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
        p163g.p164a.p165a.C4783y0.m16636b("%s - Too many redirects for (%s) - %d", r15, r13, java.lang.Integer.valueOf(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0107, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0108, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x010c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x010d, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0138, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0139, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0164, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0165, code lost:
        r3 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x017c A[SYNTHETIC, Splitter:B:100:0x017c] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x019a A[SYNTHETIC, Splitter:B:109:0x019a] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0124 A[SYNTHETIC, Splitter:B:74:0x0124] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0150 A[SYNTHETIC, Splitter:B:87:0x0150] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0177  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static byte[] m16597a(java.lang.String r13, int r14, java.lang.String r15, java.util.concurrent.Callable<java.util.Map<java.lang.String, java.lang.String>> r16, p163g.p164a.p165a.C4779x0.C4781b r17) {
        /*
            r0 = r17
            r1 = 0
            r2 = 0
            r4 = r13
            r5 = r1
            r3 = 0
            r6 = 0
        L_0x0008:
            r7 = 21
            java.lang.String r8 = "%s - Unable to close stream (%s)"
            r9 = 2
            r10 = 1
            if (r3 <= r7) goto L_0x0023
            java.lang.String r0 = "%s - Too many redirects for (%s) - %d"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x0164, Exception -> 0x0138, Error -> 0x010c, all -> 0x0107 }
            r4[r2] = r15     // Catch:{ IOException -> 0x0164, Exception -> 0x0138, Error -> 0x010c, all -> 0x0107 }
            r4[r10] = r13     // Catch:{ IOException -> 0x0164, Exception -> 0x0138, Error -> 0x010c, all -> 0x0107 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ IOException -> 0x0164, Exception -> 0x0138, Error -> 0x010c, all -> 0x0107 }
            r4[r9] = r3     // Catch:{ IOException -> 0x0164, Exception -> 0x0138, Error -> 0x010c, all -> 0x0107 }
            p163g.p164a.p165a.C4783y0.m16636b(r0, r4)     // Catch:{ IOException -> 0x0164, Exception -> 0x0138, Error -> 0x010c, all -> 0x0107 }
            goto L_0x0091
        L_0x0023:
            java.net.URL r6 = new java.net.URL     // Catch:{ IOException -> 0x0164, Exception -> 0x0138, Error -> 0x010c, all -> 0x0107 }
            r6.<init>(r4)     // Catch:{ IOException -> 0x0164, Exception -> 0x0138, Error -> 0x010c, all -> 0x0107 }
            java.net.URLConnection r6 = r6.openConnection()     // Catch:{ IOException -> 0x0164, Exception -> 0x0138, Error -> 0x010c, all -> 0x0107 }
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ IOException -> 0x0164, Exception -> 0x0138, Error -> 0x010c, all -> 0x0107 }
            r5 = 2000(0x7d0, float:2.803E-42)
            r6.setConnectTimeout(r5)     // Catch:{ IOException -> 0x0103, Exception -> 0x00ff, Error -> 0x00fb, all -> 0x00f7 }
            r5 = r14
            r6.setReadTimeout(r14)     // Catch:{ IOException -> 0x0103, Exception -> 0x00ff, Error -> 0x00fb, all -> 0x00f7 }
            r6.setInstanceFollowRedirects(r2)     // Catch:{ IOException -> 0x0103, Exception -> 0x00ff, Error -> 0x00fb, all -> 0x00f7 }
            java.lang.String r7 = "Accept-Language"
            java.lang.String r11 = p163g.p164a.p165a.C4783y0.m16656p()     // Catch:{ IOException -> 0x0103, Exception -> 0x00ff, Error -> 0x00fb, all -> 0x00f7 }
            r6.setRequestProperty(r7, r11)     // Catch:{ IOException -> 0x0103, Exception -> 0x00ff, Error -> 0x00fb, all -> 0x00f7 }
            java.lang.String r7 = "User-Agent"
            java.lang.String r11 = p163g.p164a.p165a.C4783y0.m16658r()     // Catch:{ IOException -> 0x0103, Exception -> 0x00ff, Error -> 0x00fb, all -> 0x00f7 }
            r6.setRequestProperty(r7, r11)     // Catch:{ IOException -> 0x0103, Exception -> 0x00ff, Error -> 0x00fb, all -> 0x00f7 }
            if (r16 == 0) goto L_0x007a
            java.lang.Object r7 = r16.call()     // Catch:{ IOException -> 0x0103, Exception -> 0x00ff, Error -> 0x00fb, all -> 0x00f7 }
            java.util.Map r7 = (java.util.Map) r7     // Catch:{ IOException -> 0x0103, Exception -> 0x00ff, Error -> 0x00fb, all -> 0x00f7 }
            if (r7 == 0) goto L_0x007a
            java.util.Set r7 = r7.entrySet()     // Catch:{ IOException -> 0x0103, Exception -> 0x00ff, Error -> 0x00fb, all -> 0x00f7 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ IOException -> 0x0103, Exception -> 0x00ff, Error -> 0x00fb, all -> 0x00f7 }
        L_0x005e:
            boolean r11 = r7.hasNext()     // Catch:{ IOException -> 0x0103, Exception -> 0x00ff, Error -> 0x00fb, all -> 0x00f7 }
            if (r11 == 0) goto L_0x007a
            java.lang.Object r11 = r7.next()     // Catch:{ IOException -> 0x0103, Exception -> 0x00ff, Error -> 0x00fb, all -> 0x00f7 }
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11     // Catch:{ IOException -> 0x0103, Exception -> 0x00ff, Error -> 0x00fb, all -> 0x00f7 }
            java.lang.Object r12 = r11.getKey()     // Catch:{ IOException -> 0x0103, Exception -> 0x00ff, Error -> 0x00fb, all -> 0x00f7 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ IOException -> 0x0103, Exception -> 0x00ff, Error -> 0x00fb, all -> 0x00f7 }
            java.lang.Object r11 = r11.getValue()     // Catch:{ IOException -> 0x0103, Exception -> 0x00ff, Error -> 0x00fb, all -> 0x00f7 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ IOException -> 0x0103, Exception -> 0x00ff, Error -> 0x00fb, all -> 0x00f7 }
            r6.setRequestProperty(r12, r11)     // Catch:{ IOException -> 0x0103, Exception -> 0x00ff, Error -> 0x00fb, all -> 0x00f7 }
            goto L_0x005e
        L_0x007a:
            int r7 = r6.getResponseCode()     // Catch:{ IOException -> 0x0103, Exception -> 0x00ff, Error -> 0x00fb, all -> 0x00f7 }
            if (r0 == 0) goto L_0x0087
            java.util.Map r11 = r6.getHeaderFields()     // Catch:{ IOException -> 0x0103, Exception -> 0x00ff, Error -> 0x00fb, all -> 0x00f7 }
            r0.mo16156a(r11)     // Catch:{ IOException -> 0x0103, Exception -> 0x00ff, Error -> 0x00fb, all -> 0x00f7 }
        L_0x0087:
            r11 = 301(0x12d, float:4.22E-43)
            if (r7 == r11) goto L_0x00dd
            r11 = 302(0x12e, float:4.23E-43)
            if (r7 == r11) goto L_0x00dd
            r5 = r6
            r6 = r7
        L_0x0091:
            r0 = 200(0xc8, float:2.8E-43)
            if (r6 != r0) goto L_0x00d7
            java.io.InputStream r3 = r5.getInputStream()     // Catch:{ IOException -> 0x0164, Exception -> 0x0138, Error -> 0x010c, all -> 0x0107 }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]     // Catch:{ IOException -> 0x00d4, Exception -> 0x00d1, Error -> 0x00cf }
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x00d4, Exception -> 0x00d1, Error -> 0x00cf }
            r4.<init>()     // Catch:{ IOException -> 0x00d4, Exception -> 0x00d1, Error -> 0x00cf }
        L_0x00a2:
            int r6 = r3.read(r0)     // Catch:{ IOException -> 0x00d4, Exception -> 0x00d1, Error -> 0x00cf }
            r7 = -1
            if (r6 != r7) goto L_0x00cb
            r3.close()     // Catch:{ IOException -> 0x00d4, Exception -> 0x00d1, Error -> 0x00cf }
            byte[] r1 = r4.toByteArray()     // Catch:{ IOException -> 0x00d4, Exception -> 0x00d1, Error -> 0x00cf }
            if (r5 == 0) goto L_0x00b5
            r5.disconnect()
        L_0x00b5:
            if (r3 == 0) goto L_0x00ca
            r3.close()     // Catch:{ IOException -> 0x00bb }
            goto L_0x00ca
        L_0x00bb:
            r0 = move-exception
            r3 = r0
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r2] = r15
            java.lang.String r2 = r3.getLocalizedMessage()
            r0[r10] = r2
            p163g.p164a.p165a.C4783y0.m16640c(r8, r0)
        L_0x00ca:
            return r1
        L_0x00cb:
            r4.write(r0, r2, r6)     // Catch:{ IOException -> 0x00d4, Exception -> 0x00d1, Error -> 0x00cf }
            goto L_0x00a2
        L_0x00cf:
            r0 = move-exception
            goto L_0x010e
        L_0x00d1:
            r0 = move-exception
            goto L_0x013a
        L_0x00d4:
            r0 = move-exception
            goto L_0x0166
        L_0x00d7:
            if (r5 == 0) goto L_0x00dc
            r5.disconnect()
        L_0x00dc:
            return r1
        L_0x00dd:
            int r3 = r3 + 1
            java.lang.String r11 = "Location"
            java.lang.String r11 = r6.getHeaderField(r11)     // Catch:{ IOException -> 0x0103, Exception -> 0x00ff, Error -> 0x00fb, all -> 0x00f7 }
            java.net.URL r12 = new java.net.URL     // Catch:{ IOException -> 0x0103, Exception -> 0x00ff, Error -> 0x00fb, all -> 0x00f7 }
            r12.<init>(r4)     // Catch:{ IOException -> 0x0103, Exception -> 0x00ff, Error -> 0x00fb, all -> 0x00f7 }
            java.net.URL r4 = new java.net.URL     // Catch:{ IOException -> 0x0103, Exception -> 0x00ff, Error -> 0x00fb, all -> 0x00f7 }
            r4.<init>(r12, r11)     // Catch:{ IOException -> 0x0103, Exception -> 0x00ff, Error -> 0x00fb, all -> 0x00f7 }
            java.lang.String r4 = r4.toExternalForm()     // Catch:{ IOException -> 0x0103, Exception -> 0x00ff, Error -> 0x00fb, all -> 0x00f7 }
            r5 = r6
            r6 = r7
            goto L_0x0008
        L_0x00f7:
            r0 = move-exception
            r3 = r1
            r5 = r6
            goto L_0x0109
        L_0x00fb:
            r0 = move-exception
            r3 = r1
            r5 = r6
            goto L_0x010e
        L_0x00ff:
            r0 = move-exception
            r3 = r1
            r5 = r6
            goto L_0x013a
        L_0x0103:
            r0 = move-exception
            r3 = r1
            r5 = r6
            goto L_0x0166
        L_0x0107:
            r0 = move-exception
            r3 = r1
        L_0x0109:
            r1 = r0
            goto L_0x0193
        L_0x010c:
            r0 = move-exception
            r3 = r1
        L_0x010e:
            java.lang.String r4 = "%s - Unexpected error while sending request (%s)"
            java.lang.Object[] r6 = new java.lang.Object[r9]     // Catch:{ all -> 0x0190 }
            r6[r2] = r15     // Catch:{ all -> 0x0190 }
            java.lang.String r0 = r0.getLocalizedMessage()     // Catch:{ all -> 0x0190 }
            r6[r10] = r0     // Catch:{ all -> 0x0190 }
            p163g.p164a.p165a.C4783y0.m16640c(r4, r6)     // Catch:{ all -> 0x0190 }
            if (r5 == 0) goto L_0x0122
            r5.disconnect()
        L_0x0122:
            if (r3 == 0) goto L_0x0137
            r3.close()     // Catch:{ IOException -> 0x0128 }
            goto L_0x0137
        L_0x0128:
            r0 = move-exception
            r3 = r0
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r2] = r15
            java.lang.String r2 = r3.getLocalizedMessage()
            r0[r10] = r2
            p163g.p164a.p165a.C4783y0.m16640c(r8, r0)
        L_0x0137:
            return r1
        L_0x0138:
            r0 = move-exception
            r3 = r1
        L_0x013a:
            java.lang.String r4 = "%s - Exception while sending request (%s)"
            java.lang.Object[] r6 = new java.lang.Object[r9]     // Catch:{ all -> 0x0190 }
            r6[r2] = r15     // Catch:{ all -> 0x0190 }
            java.lang.String r0 = r0.getLocalizedMessage()     // Catch:{ all -> 0x0190 }
            r6[r10] = r0     // Catch:{ all -> 0x0190 }
            p163g.p164a.p165a.C4783y0.m16640c(r4, r6)     // Catch:{ all -> 0x0190 }
            if (r5 == 0) goto L_0x014e
            r5.disconnect()
        L_0x014e:
            if (r3 == 0) goto L_0x0163
            r3.close()     // Catch:{ IOException -> 0x0154 }
            goto L_0x0163
        L_0x0154:
            r0 = move-exception
            r3 = r0
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r2] = r15
            java.lang.String r2 = r3.getLocalizedMessage()
            r0[r10] = r2
            p163g.p164a.p165a.C4783y0.m16640c(r8, r0)
        L_0x0163:
            return r1
        L_0x0164:
            r0 = move-exception
            r3 = r1
        L_0x0166:
            java.lang.String r4 = "%s - IOException while sending request (%s)"
            java.lang.Object[] r6 = new java.lang.Object[r9]     // Catch:{ all -> 0x0190 }
            r6[r2] = r15     // Catch:{ all -> 0x0190 }
            java.lang.String r0 = r0.getLocalizedMessage()     // Catch:{ all -> 0x0190 }
            r6[r10] = r0     // Catch:{ all -> 0x0190 }
            p163g.p164a.p165a.C4783y0.m16640c(r4, r6)     // Catch:{ all -> 0x0190 }
            if (r5 == 0) goto L_0x017a
            r5.disconnect()
        L_0x017a:
            if (r3 == 0) goto L_0x018f
            r3.close()     // Catch:{ IOException -> 0x0180 }
            goto L_0x018f
        L_0x0180:
            r0 = move-exception
            r3 = r0
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r2] = r15
            java.lang.String r2 = r3.getLocalizedMessage()
            r0[r10] = r2
            p163g.p164a.p165a.C4783y0.m16640c(r8, r0)
        L_0x018f:
            return r1
        L_0x0190:
            r0 = move-exception
            goto L_0x0109
        L_0x0193:
            if (r5 == 0) goto L_0x0198
            r5.disconnect()
        L_0x0198:
            if (r3 == 0) goto L_0x01ad
            r3.close()     // Catch:{ IOException -> 0x019e }
            goto L_0x01ad
        L_0x019e:
            r0 = move-exception
            r3 = r0
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r2] = r15
            java.lang.String r2 = r3.getLocalizedMessage()
            r0[r10] = r2
            p163g.p164a.p165a.C4783y0.m16640c(r8, r0)
        L_0x01ad:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p164a.p165a.C4779x0.m16597a(java.lang.String, int, java.lang.String, java.util.concurrent.Callable, g.a.a.x0$b):byte[]");
    }

    /* renamed from: a */
    protected static byte[] m16598a(String str, String str2, Map<String, String> map, int i, String str3) {
        String str4 = "%s - Exception while attempting to send hit, will not retry(%s)";
        if (str == null) {
            return null;
        }
        if (C4783y0.m16611I()) {
            return C4684g1.m16311a(str, str2, i, str3);
        }
        HttpURLConnection a = m16595a(str);
        if (a == null) {
            return null;
        }
        try {
            a.setConnectTimeout(i);
            a.setReadTimeout(i);
            a.setRequestMethod("POST");
            if (!C4728p0.m16448H().mo16104w()) {
                a.setRequestProperty("connection", "close");
            }
            byte[] bytes = str2.getBytes(Utf8Charset.NAME);
            a.setFixedLengthStreamingMode(bytes.length);
            a.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded");
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    a.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(a.getOutputStream());
            bufferedOutputStream.write(bytes);
            bufferedOutputStream.close();
            InputStream inputStream = a.getInputStream();
            byte[] bArr = new byte[1024];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            if (C4728p0.m16448H().mo16104w() || a.getResponseCode() == 200) {
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            }
            inputStream.close();
            C4783y0.m16630a("%s - Request Sent(%s)", str3, str2);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (!C4728p0.m16448H().mo16104w()) {
                a.disconnect();
            }
            return byteArray;
        } catch (SocketTimeoutException unused) {
            C4783y0.m16630a("%s - Timed out sending request(%s)", str3, str2);
            if (!C4728p0.m16448H().mo16104w()) {
                a.disconnect();
            }
            return null;
        } catch (IOException e) {
            C4783y0.m16630a("%s - IOException while sending request, may retry(%s)", str3, e.getLocalizedMessage());
            if (!C4728p0.m16448H().mo16104w()) {
                a.disconnect();
            }
            return null;
        } catch (Exception e2) {
            C4783y0.m16636b(str4, str3, e2.getLocalizedMessage());
            byte[] bArr2 = new byte[0];
            if (!C4728p0.m16448H().mo16104w()) {
                a.disconnect();
            }
            return bArr2;
        } catch (Error e3) {
            C4783y0.m16636b(str4, str3, e3.getLocalizedMessage());
            byte[] bArr3 = new byte[0];
            if (!C4728p0.m16448H().mo16104w()) {
                a.disconnect();
            }
            return bArr3;
        } catch (Throwable th) {
            if (!C4728p0.m16448H().mo16104w()) {
                a.disconnect();
            }
            throw th;
        }
    }

    /* renamed from: a */
    protected static boolean m16596a(String str, String str2, Map<String, String> map, int i, String str3, String str4) {
        String str5 = "%s - Exception while attempting to send hit, will not retry (%s)";
        if (str == null) {
            return false;
        }
        if (C4783y0.m16611I()) {
            return C4684g1.m16309a(str, str2, i, str3, str4);
        }
        HttpURLConnection a = m16595a(str);
        if (a == null) {
            return false;
        }
        try {
            a.setConnectTimeout(i);
            a.setReadTimeout(i);
            a.setRequestMethod("GET");
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    a.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            if (str2 != null && str2.length() > 0) {
                a.setRequestMethod("POST");
                String str6 = (str3 == null || str3.length() <= 0) ? "application/x-www-form-urlencoded" : str3;
                byte[] bytes = str2.getBytes(Utf8Charset.NAME);
                a.setFixedLengthStreamingMode(bytes.length);
                a.setRequestProperty(HttpHeaders.CONTENT_TYPE, str6);
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(a.getOutputStream());
                bufferedOutputStream.write(bytes);
                bufferedOutputStream.close();
            }
            InputStream inputStream = a.getInputStream();
            while (inputStream.read(new byte[10]) > 0) {
            }
            inputStream.close();
            C4783y0.m16630a("%s - Successfully forwarded hit (%s body: %s type: %s)", str4, str, str2, str3);
        } catch (SocketTimeoutException unused) {
            C4783y0.m16630a("%s - Timed out sending request (%s)", str4, str2);
            return false;
        } catch (IOException e) {
            C4783y0.m16630a("%s - IOException while sending request, will not retry (%s)", str4, e.getLocalizedMessage());
        } catch (Exception e2) {
            C4783y0.m16636b(str5, str4, e2.getLocalizedMessage());
        } catch (Error e3) {
            C4783y0.m16636b(str5, str4, e3.getLocalizedMessage());
        }
        return true;
    }

    /* renamed from: a */
    protected static HttpURLConnection m16595a(String str) {
        try {
            return (HttpURLConnection) new URL(str).openConnection();
        } catch (Exception e) {
            C4783y0.m16636b("Adobe Mobile - Exception opening URL(%s)", e.getLocalizedMessage());
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [g.a.a.s0, java.io.InputStream] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v0, types: [g.a.a.s0, java.io.InputStream]
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY]]
      uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], java.io.InputStream, g.a.a.s0]
      mth insns count: 162
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static p163g.p164a.p165a.C4763s0 m16594a(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, int r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) {
        /*
            java.lang.String r0 = "%s - Exception while trying to get content (%s)"
            java.lang.String r1 = "%s - Unable to close stream (%s)"
            java.net.HttpURLConnection r7 = m16595a(r7)
            r2 = 0
            if (r7 != 0) goto L_0x000c
            return r2
        L_0x000c:
            g.a.a.s0 r3 = new g.a.a.s0
            r3.<init>()
            r4 = 0
            r5 = 2
            r6 = 1
            r7.setRequestMethod(r8)     // Catch:{ ProtocolException -> 0x0171, NullPointerException -> 0x014d, IOException -> 0x0129, Error -> 0x0106, Exception -> 0x00de }
            int r11 = r11 * 1000
            r7.setReadTimeout(r11)     // Catch:{ ProtocolException -> 0x0171, NullPointerException -> 0x014d, IOException -> 0x0129, Error -> 0x0106, Exception -> 0x00de }
            r7.setConnectTimeout(r11)     // Catch:{ ProtocolException -> 0x0171, NullPointerException -> 0x014d, IOException -> 0x0129, Error -> 0x0106, Exception -> 0x00de }
            if (r12 == 0) goto L_0x002c
            boolean r11 = r12.isEmpty()     // Catch:{ ProtocolException -> 0x0171, NullPointerException -> 0x014d, IOException -> 0x0129, Error -> 0x0106, Exception -> 0x00de }
            if (r11 != 0) goto L_0x002c
            java.lang.String r11 = "Content-Type"
            r7.setRequestProperty(r11, r12)     // Catch:{ ProtocolException -> 0x0171, NullPointerException -> 0x014d, IOException -> 0x0129, Error -> 0x0106, Exception -> 0x00de }
        L_0x002c:
            if (r9 == 0) goto L_0x0039
            boolean r11 = r9.isEmpty()     // Catch:{ ProtocolException -> 0x0171, NullPointerException -> 0x014d, IOException -> 0x0129, Error -> 0x0106, Exception -> 0x00de }
            if (r11 != 0) goto L_0x0039
            java.lang.String r11 = "Accept"
            r7.setRequestProperty(r11, r9)     // Catch:{ ProtocolException -> 0x0171, NullPointerException -> 0x014d, IOException -> 0x0129, Error -> 0x0106, Exception -> 0x00de }
        L_0x0039:
            java.lang.String r9 = "Accept-Encoding"
            java.lang.String r11 = "identity"
            r7.setRequestProperty(r9, r11)     // Catch:{ ProtocolException -> 0x0171, NullPointerException -> 0x014d, IOException -> 0x0129, Error -> 0x0106, Exception -> 0x00de }
            java.lang.String r9 = "Accept-Language"
            java.lang.String r11 = p163g.p164a.p165a.C4783y0.m16656p()     // Catch:{ ProtocolException -> 0x0171, NullPointerException -> 0x014d, IOException -> 0x0129, Error -> 0x0106, Exception -> 0x00de }
            r7.setRequestProperty(r9, r11)     // Catch:{ ProtocolException -> 0x0171, NullPointerException -> 0x014d, IOException -> 0x0129, Error -> 0x0106, Exception -> 0x00de }
            java.lang.String r9 = "User-Agent"
            java.lang.String r11 = p163g.p164a.p165a.C4783y0.m16658r()     // Catch:{ ProtocolException -> 0x0171, NullPointerException -> 0x014d, IOException -> 0x0129, Error -> 0x0106, Exception -> 0x00de }
            r7.setRequestProperty(r9, r11)     // Catch:{ ProtocolException -> 0x0171, NullPointerException -> 0x014d, IOException -> 0x0129, Error -> 0x0106, Exception -> 0x00de }
            if (r14 == 0) goto L_0x005f
            boolean r9 = r14.isEmpty()     // Catch:{ ProtocolException -> 0x0171, NullPointerException -> 0x014d, IOException -> 0x0129, Error -> 0x0106, Exception -> 0x00de }
            if (r9 != 0) goto L_0x005f
            java.lang.String r9 = "session-id"
            r7.setRequestProperty(r9, r14)     // Catch:{ ProtocolException -> 0x0171, NullPointerException -> 0x014d, IOException -> 0x0129, Error -> 0x0106, Exception -> 0x00de }
        L_0x005f:
            if (r8 == 0) goto L_0x0074
            java.lang.String r9 = "POST"
            boolean r9 = r8.equalsIgnoreCase(r9)     // Catch:{ ProtocolException -> 0x0171, NullPointerException -> 0x014d, IOException -> 0x0129, Error -> 0x0106, Exception -> 0x00de }
            if (r9 != 0) goto L_0x0071
            java.lang.String r9 = "PUT"
            boolean r8 = r8.equalsIgnoreCase(r9)     // Catch:{ ProtocolException -> 0x0171, NullPointerException -> 0x014d, IOException -> 0x0129, Error -> 0x0106, Exception -> 0x00de }
            if (r8 == 0) goto L_0x0074
        L_0x0071:
            r7.setDoOutput(r6)     // Catch:{ ProtocolException -> 0x0171, NullPointerException -> 0x014d, IOException -> 0x0129, Error -> 0x0106, Exception -> 0x00de }
        L_0x0074:
            java.lang.String r8 = "UTF-8"
            if (r10 == 0) goto L_0x0095
            boolean r9 = r10.isEmpty()     // Catch:{ ProtocolException -> 0x0171, NullPointerException -> 0x014d, IOException -> 0x0129, Error -> 0x0106, Exception -> 0x00de }
            if (r9 != 0) goto L_0x0095
            byte[] r9 = r10.getBytes(r8)     // Catch:{ ProtocolException -> 0x0171, NullPointerException -> 0x014d, IOException -> 0x0129, Error -> 0x0106, Exception -> 0x00de }
            int r10 = r9.length     // Catch:{ ProtocolException -> 0x0171, NullPointerException -> 0x014d, IOException -> 0x0129, Error -> 0x0106, Exception -> 0x00de }
            r7.setFixedLengthStreamingMode(r10)     // Catch:{ ProtocolException -> 0x0171, NullPointerException -> 0x014d, IOException -> 0x0129, Error -> 0x0106, Exception -> 0x00de }
            java.io.OutputStream r10 = r7.getOutputStream()     // Catch:{ ProtocolException -> 0x0171, NullPointerException -> 0x014d, IOException -> 0x0129, Error -> 0x0106, Exception -> 0x00de }
            java.io.BufferedOutputStream r11 = new java.io.BufferedOutputStream     // Catch:{ ProtocolException -> 0x0171, NullPointerException -> 0x014d, IOException -> 0x0129, Error -> 0x0106, Exception -> 0x00de }
            r11.<init>(r10)     // Catch:{ ProtocolException -> 0x0171, NullPointerException -> 0x014d, IOException -> 0x0129, Error -> 0x0106, Exception -> 0x00de }
            r11.write(r9)     // Catch:{ ProtocolException -> 0x0171, NullPointerException -> 0x014d, IOException -> 0x0129, Error -> 0x0106, Exception -> 0x00de }
            r11.close()     // Catch:{ ProtocolException -> 0x0171, NullPointerException -> 0x014d, IOException -> 0x0129, Error -> 0x0106, Exception -> 0x00de }
        L_0x0095:
            int r9 = r7.getResponseCode()     // Catch:{ ProtocolException -> 0x0171, NullPointerException -> 0x014d, IOException -> 0x0129, Error -> 0x0106, Exception -> 0x00de }
            r3.f11851a = r9     // Catch:{ ProtocolException -> 0x0171, NullPointerException -> 0x014d, IOException -> 0x0129, Error -> 0x0106, Exception -> 0x00de }
            java.io.InputStream r2 = r7.getInputStream()     // Catch:{ ProtocolException -> 0x0171, NullPointerException -> 0x014d, IOException -> 0x0129, Error -> 0x0106, Exception -> 0x00de }
            java.io.BufferedReader r9 = new java.io.BufferedReader     // Catch:{ ProtocolException -> 0x0171, NullPointerException -> 0x014d, IOException -> 0x0129, Error -> 0x0106, Exception -> 0x00de }
            java.io.InputStreamReader r10 = new java.io.InputStreamReader     // Catch:{ ProtocolException -> 0x0171, NullPointerException -> 0x014d, IOException -> 0x0129, Error -> 0x0106, Exception -> 0x00de }
            r10.<init>(r2, r8)     // Catch:{ ProtocolException -> 0x0171, NullPointerException -> 0x014d, IOException -> 0x0129, Error -> 0x0106, Exception -> 0x00de }
            r9.<init>(r10)     // Catch:{ ProtocolException -> 0x0171, NullPointerException -> 0x014d, IOException -> 0x0129, Error -> 0x0106, Exception -> 0x00de }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ ProtocolException -> 0x0171, NullPointerException -> 0x014d, IOException -> 0x0129, Error -> 0x0106, Exception -> 0x00de }
            r8.<init>()     // Catch:{ ProtocolException -> 0x0171, NullPointerException -> 0x014d, IOException -> 0x0129, Error -> 0x0106, Exception -> 0x00de }
        L_0x00ae:
            java.lang.String r10 = r9.readLine()     // Catch:{ ProtocolException -> 0x0171, NullPointerException -> 0x014d, IOException -> 0x0129, Error -> 0x0106, Exception -> 0x00de }
            if (r10 == 0) goto L_0x00b8
            r8.append(r10)     // Catch:{ ProtocolException -> 0x0171, NullPointerException -> 0x014d, IOException -> 0x0129, Error -> 0x0106, Exception -> 0x00de }
            goto L_0x00ae
        L_0x00b8:
            java.lang.String r8 = r8.toString()     // Catch:{ ProtocolException -> 0x0171, NullPointerException -> 0x014d, IOException -> 0x0129, Error -> 0x0106, Exception -> 0x00de }
            r3.f11852b = r8     // Catch:{ ProtocolException -> 0x0171, NullPointerException -> 0x014d, IOException -> 0x0129, Error -> 0x0106, Exception -> 0x00de }
            r7.getHeaderFields()     // Catch:{ ProtocolException -> 0x0171, NullPointerException -> 0x014d, IOException -> 0x0129, Error -> 0x0106, Exception -> 0x00de }
            r7.disconnect()
            if (r2 == 0) goto L_0x0194
            r2.close()     // Catch:{ IOException -> 0x00cb }
            goto L_0x0194
        L_0x00cb:
            r7 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r5]
            r8[r4] = r13
            java.lang.String r7 = r7.getLocalizedMessage()
            r8[r6] = r7
            p163g.p164a.p165a.C4783y0.m16640c(r1, r8)
            goto L_0x0194
        L_0x00db:
            r8 = move-exception
            goto L_0x0195
        L_0x00de:
            r8 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ all -> 0x00db }
            r9[r4] = r13     // Catch:{ all -> 0x00db }
            java.lang.String r8 = r8.getLocalizedMessage()     // Catch:{ all -> 0x00db }
            r9[r6] = r8     // Catch:{ all -> 0x00db }
            p163g.p164a.p165a.C4783y0.m16636b(r0, r9)     // Catch:{ all -> 0x00db }
            r7.disconnect()
            if (r2 == 0) goto L_0x0194
            r2.close()     // Catch:{ IOException -> 0x00f6 }
            goto L_0x0194
        L_0x00f6:
            r7 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r5]
            r8[r4] = r13
            java.lang.String r7 = r7.getLocalizedMessage()
            r8[r6] = r7
            p163g.p164a.p165a.C4783y0.m16640c(r1, r8)
            goto L_0x0194
        L_0x0106:
            r8 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ all -> 0x00db }
            r9[r4] = r13     // Catch:{ all -> 0x00db }
            r9[r6] = r8     // Catch:{ all -> 0x00db }
            p163g.p164a.p165a.C4783y0.m16636b(r0, r9)     // Catch:{ all -> 0x00db }
            r7.disconnect()
            if (r2 == 0) goto L_0x0194
            r2.close()     // Catch:{ IOException -> 0x011a }
            goto L_0x0194
        L_0x011a:
            r7 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r5]
            r8[r4] = r13
            java.lang.String r7 = r7.getLocalizedMessage()
            r8[r6] = r7
            p163g.p164a.p165a.C4783y0.m16640c(r1, r8)
            goto L_0x0194
        L_0x0129:
            r8 = move-exception
            java.lang.String r9 = "%s - IOException while trying to get content (%s)"
            java.lang.Object[] r10 = new java.lang.Object[r5]     // Catch:{ all -> 0x00db }
            r10[r4] = r13     // Catch:{ all -> 0x00db }
            r10[r6] = r8     // Catch:{ all -> 0x00db }
            p163g.p164a.p165a.C4783y0.m16636b(r9, r10)     // Catch:{ all -> 0x00db }
            r7.disconnect()
            if (r2 == 0) goto L_0x0194
            r2.close()     // Catch:{ IOException -> 0x013e }
            goto L_0x0194
        L_0x013e:
            r7 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r5]
            r8[r4] = r13
            java.lang.String r7 = r7.getLocalizedMessage()
            r8[r6] = r7
            p163g.p164a.p165a.C4783y0.m16640c(r1, r8)
            goto L_0x0194
        L_0x014d:
            r8 = move-exception
            java.lang.String r9 = "%s - NullPointerException while trying to get content (%s)"
            java.lang.Object[] r10 = new java.lang.Object[r5]     // Catch:{ all -> 0x00db }
            r10[r4] = r13     // Catch:{ all -> 0x00db }
            r10[r6] = r8     // Catch:{ all -> 0x00db }
            p163g.p164a.p165a.C4783y0.m16636b(r9, r10)     // Catch:{ all -> 0x00db }
            r7.disconnect()
            if (r2 == 0) goto L_0x0194
            r2.close()     // Catch:{ IOException -> 0x0162 }
            goto L_0x0194
        L_0x0162:
            r7 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r5]
            r8[r4] = r13
            java.lang.String r7 = r7.getLocalizedMessage()
            r8[r6] = r7
            p163g.p164a.p165a.C4783y0.m16640c(r1, r8)
            goto L_0x0194
        L_0x0171:
            r8 = move-exception
            java.lang.String r9 = "%s - ProtocolException while trying to get content (%s)"
            java.lang.Object[] r10 = new java.lang.Object[r5]     // Catch:{ all -> 0x00db }
            r10[r4] = r13     // Catch:{ all -> 0x00db }
            r10[r6] = r8     // Catch:{ all -> 0x00db }
            p163g.p164a.p165a.C4783y0.m16636b(r9, r10)     // Catch:{ all -> 0x00db }
            r7.disconnect()
            if (r2 == 0) goto L_0x0194
            r2.close()     // Catch:{ IOException -> 0x0186 }
            goto L_0x0194
        L_0x0186:
            r7 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r5]
            r8[r4] = r13
            java.lang.String r7 = r7.getLocalizedMessage()
            r8[r6] = r7
            p163g.p164a.p165a.C4783y0.m16640c(r1, r8)
        L_0x0194:
            return r3
        L_0x0195:
            r7.disconnect()
            if (r2 == 0) goto L_0x01ac
            r2.close()     // Catch:{ IOException -> 0x019e }
            goto L_0x01ac
        L_0x019e:
            r7 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r5]
            r9[r4] = r13
            java.lang.String r7 = r7.getLocalizedMessage()
            r9[r6] = r7
            p163g.p164a.p165a.C4783y0.m16640c(r1, r9)
        L_0x01ac:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p164a.p165a.C4779x0.m16594a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String):g.a.a.s0");
    }
}
