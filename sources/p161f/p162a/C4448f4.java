package p161f.p162a;

import android.net.TrafficStats;
import com.appboy.p033s.C1557c;
import com.facebook.stetho.common.Utf8Charset;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPInputStream;
import org.json.JSONObject;

/* renamed from: f.a.f4 */
public final class C4448f4 implements C4457g5 {

    /* renamed from: b */
    private static final String f11054b = C1557c.m7461a(C4448f4.class);

    /* renamed from: c */
    private static final int f11055c = ((int) TimeUnit.SECONDS.toMillis(15));

    /* renamed from: a */
    private final int f11056a;

    public C4448f4(int i) {
        this.f11056a = i;
    }

    /* renamed from: b */
    private HttpURLConnection m15381b(URL url, JSONObject jSONObject, Map<String, String> map, C4601u6 u6Var) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) C4467h6.m15466a(url);
            httpURLConnection.setConnectTimeout(f11055c);
            httpURLConnection.setReadTimeout(this.f11056a);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setRequestMethod(u6Var.toString());
            mo15552a(httpURLConnection, map);
            if (u6Var == C4601u6.POST) {
                m15380a(httpURLConnection, jSONObject);
            }
            return httpURLConnection;
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Could not set up connection [");
            sb.append(url.toString());
            sb.append("] [");
            sb.append(e.getMessage());
            sb.append("].  Appboy will try to reconnect periodically.");
            throw new C4610w(sb.toString(), e);
        }
    }

    /* renamed from: a */
    public JSONObject mo15529a(URI uri, Map<String, String> map) {
        return m15378a(uri, (JSONObject) null, map, C4601u6.GET);
    }

    /* renamed from: a */
    public JSONObject mo15530a(URI uri, Map<String, String> map, JSONObject jSONObject) {
        return m15378a(uri, jSONObject, map, C4601u6.POST);
    }

    /* renamed from: a */
    private JSONObject m15378a(URI uri, JSONObject jSONObject, Map<String, String> map, C4601u6 u6Var) {
        URL a = C4550p3.m15816a(uri);
        if (a == null) {
            return null;
        }
        try {
            return m15379a(a, jSONObject, map, u6Var);
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Experienced IOException during request to [");
            sb.append(a.toString());
            sb.append("], failing: [");
            sb.append(e.getMessage());
            sb.append("]");
            throw new C4610w(sb.toString(), e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0083 A[SYNTHETIC, Splitter:B:33:0x0083] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.json.JSONObject m15379a(java.net.URL r7, org.json.JSONObject r8, java.util.Map<java.lang.String, java.lang.String> r9, p161f.p162a.C4601u6 r10) {
        /*
            r6 = this;
            java.lang.String r0 = "]"
            java.lang.String r1 = "Caught an error trying to close the inputStream in getJsonResultFromUrl"
            r2 = 0
            if (r7 == 0) goto L_0x0010
            java.net.HttpURLConnection r8 = r6.m15381b(r7, r8, r9, r10)     // Catch:{ all -> 0x000c }
            goto L_0x0011
        L_0x000c:
            r7 = move-exception
            r8 = r2
            r9 = r8
            goto L_0x007c
        L_0x0010:
            r8 = r2
        L_0x0011:
            if (r8 == 0) goto L_0x008e
            java.io.InputStream r9 = r6.m15376a(r8)     // Catch:{ all -> 0x007a }
            java.io.BufferedReader r10 = new java.io.BufferedReader     // Catch:{ all -> 0x0078 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x0078 }
            java.lang.String r4 = "UTF-8"
            r3.<init>(r9, r4)     // Catch:{ all -> 0x0078 }
            r10.<init>(r3)     // Catch:{ all -> 0x0078 }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ IOException -> 0x0059, JSONException -> 0x003e }
            java.lang.String r10 = r6.m15377a(r10)     // Catch:{ IOException -> 0x0059, JSONException -> 0x003e }
            r3.<init>(r10)     // Catch:{ IOException -> 0x0059, JSONException -> 0x003e }
            if (r8 == 0) goto L_0x0031
            r8.disconnect()
        L_0x0031:
            if (r9 == 0) goto L_0x003d
            r9.close()     // Catch:{ Exception -> 0x0037 }
            goto L_0x003d
        L_0x0037:
            r7 = move-exception
            java.lang.String r8 = f11054b
            com.appboy.p033s.C1557c.m7470c(r8, r1, r7)
        L_0x003d:
            return r3
        L_0x003e:
            r10 = move-exception
            java.lang.String r3 = f11054b     // Catch:{ all -> 0x0078 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0078 }
            r4.<init>()     // Catch:{ all -> 0x0078 }
            java.lang.String r5 = "Unable to parse response ["
            r4.append(r5)     // Catch:{ all -> 0x0078 }
            r4.append(r10)     // Catch:{ all -> 0x0078 }
            r4.append(r0)     // Catch:{ all -> 0x0078 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0078 }
            com.appboy.p033s.C1557c.m7470c(r3, r0, r10)     // Catch:{ all -> 0x0078 }
            goto L_0x008f
        L_0x0059:
            r10 = move-exception
            java.lang.String r3 = f11054b     // Catch:{ all -> 0x0078 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0078 }
            r4.<init>()     // Catch:{ all -> 0x0078 }
            java.lang.String r5 = "Could not read from response stream ["
            r4.append(r5)     // Catch:{ all -> 0x0078 }
            java.lang.String r5 = r10.getMessage()     // Catch:{ all -> 0x0078 }
            r4.append(r5)     // Catch:{ all -> 0x0078 }
            r4.append(r0)     // Catch:{ all -> 0x0078 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0078 }
            com.appboy.p033s.C1557c.m7470c(r3, r0, r10)     // Catch:{ all -> 0x0078 }
            goto L_0x008f
        L_0x0078:
            r7 = move-exception
            goto L_0x007c
        L_0x007a:
            r7 = move-exception
            r9 = r2
        L_0x007c:
            if (r8 == 0) goto L_0x0081
            r8.disconnect()
        L_0x0081:
            if (r9 == 0) goto L_0x008d
            r9.close()     // Catch:{ Exception -> 0x0087 }
            goto L_0x008d
        L_0x0087:
            r8 = move-exception
            java.lang.String r9 = f11054b
            com.appboy.p033s.C1557c.m7470c(r9, r1, r8)
        L_0x008d:
            throw r7
        L_0x008e:
            r9 = r2
        L_0x008f:
            if (r8 == 0) goto L_0x0094
            r8.disconnect()
        L_0x0094:
            if (r9 == 0) goto L_0x00a0
            r9.close()     // Catch:{ Exception -> 0x009a }
            goto L_0x00a0
        L_0x009a:
            r8 = move-exception
            java.lang.String r9 = f11054b
            com.appboy.p033s.C1557c.m7470c(r9, r1, r8)
        L_0x00a0:
            java.lang.String r8 = f11054b
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Failed to get result from ["
            r9.append(r10)
            r9.append(r7)
            java.lang.String r7 = "]. Returning null."
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            com.appboy.p033s.C1557c.m7473e(r8, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p161f.p162a.C4448f4.m15379a(java.net.URL, org.json.JSONObject, java.util.Map, f.a.u6):org.json.JSONObject");
    }

    /* renamed from: a */
    private InputStream m15376a(HttpURLConnection httpURLConnection) {
        httpURLConnection.connect();
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode / 100 == 2) {
            if ("gzip".equalsIgnoreCase(httpURLConnection.getContentEncoding())) {
                return new GZIPInputStream(httpURLConnection.getInputStream());
            }
            return new BufferedInputStream(httpURLConnection.getInputStream());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bad Http response code from Appboy: [");
        sb.append(responseCode);
        sb.append("]");
        throw new C4610w(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo15552a(HttpURLConnection httpURLConnection, Map<String, String> map) {
        for (Entry entry : map.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
    }

    /* renamed from: a */
    private void m15380a(HttpURLConnection httpURLConnection, JSONObject jSONObject) {
        TrafficStats.setThreadStatsTag(1337);
        httpURLConnection.setDoOutput(true);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(jSONObject.toString().getBytes(Utf8Charset.NAME));
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    /* renamed from: a */
    private String m15377a(BufferedReader bufferedReader) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return sb.toString();
            }
            sb.append(readLine);
        }
    }
}
