package com.appboy.p033s;

import android.net.Uri;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.appboy.s.a */
public class C1554a {

    /* renamed from: a */
    private static final String f5699a = C1557c.m7461a(C1554a.class);

    /* renamed from: b */
    public static final List<String> f5700b = Collections.unmodifiableList(Arrays.asList(new String[]{"http", "https", "ftp", "ftps", "about", "javascript"}));

    /* renamed from: a */
    public static void m7443a(File file) {
        if (file != null) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        for (String file2 : file.list()) {
                            m7443a(new File(file, file2));
                        }
                    }
                    file.delete();
                }
            } catch (Exception e) {
                String str = f5699a;
                StringBuilder sb = new StringBuilder();
                sb.append("Caught exception while trying to delete file or directory ");
                sb.append(file.getName());
                C1557c.m7470c(str, sb.toString(), e);
            }
        }
    }

    /* renamed from: b */
    public static boolean m7445b(Uri uri) {
        if (uri == null) {
            C1557c.m7469c(f5699a, "Null Uri received.");
            return false;
        }
        String scheme = uri.getScheme();
        if (!C1563i.m7490d(scheme)) {
            return f5700b.contains(scheme);
        }
        C1557c.m7469c(f5699a, "Null or blank Uri scheme.");
        return false;
    }

    /* renamed from: a */
    public static boolean m7444a(Uri uri) {
        boolean z = false;
        if (uri == null) {
            C1557c.m7469c(f5699a, "Null Uri received.");
            return false;
        }
        String scheme = uri.getScheme();
        if (C1563i.m7490d(scheme) || scheme.equals("file")) {
            z = true;
        }
        return z;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.io.BufferedOutputStream] */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.io.BufferedOutputStream] */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.io.BufferedOutputStream] */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0119 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x011e A[SYNTHETIC, Splitter:B:63:0x011e] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0126 A[Catch:{ Exception -> 0x0122 }, DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0152 A[SYNTHETIC, Splitter:B:79:0x0152] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x015a A[Catch:{ Exception -> 0x0156 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:58:0x0101=Splitter:B:58:0x0101, B:74:0x0135=Splitter:B:74:0x0135} */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File m7441a(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            java.lang.String r0 = "Exception during closing of file download streams."
            r1 = 1337(0x539, float:1.874E-42)
            android.net.TrafficStats.setThreadStatsTag(r1)
            boolean r1 = com.appboy.C1440a.m6946q()
            r2 = 0
            if (r1 == 0) goto L_0x0025
            java.lang.String r6 = f5699a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "SDK is offline. File not downloaded for url: "
            r8.append(r9)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            com.appboy.p033s.C1557c.m7469c(r6, r7)
            return r2
        L_0x0025:
            boolean r1 = com.appboy.p033s.C1563i.m7490d(r6)
            if (r1 == 0) goto L_0x0033
            java.lang.String r6 = f5699a
            java.lang.String r7 = "Download directory null or blank. File not downloaded."
            com.appboy.p033s.C1557c.m7469c(r6, r7)
            return r2
        L_0x0033:
            boolean r1 = com.appboy.p033s.C1563i.m7490d(r7)
            if (r1 == 0) goto L_0x0041
            java.lang.String r6 = f5699a
            java.lang.String r7 = "Zip file url null or blank. File not downloaded."
            com.appboy.p033s.C1557c.m7469c(r6, r7)
            return r2
        L_0x0041:
            boolean r1 = com.appboy.p033s.C1563i.m7490d(r8)
            if (r1 == 0) goto L_0x004f
            java.lang.String r6 = f5699a
            java.lang.String r7 = "Output filename null or blank. File not downloaded."
            com.appboy.p033s.C1557c.m7469c(r6, r7)
            return r2
        L_0x004f:
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x0130, all -> 0x00fc }
            r1.<init>(r6)     // Catch:{ Exception -> 0x0130, all -> 0x00fc }
            r1.mkdirs()     // Catch:{ Exception -> 0x0130, all -> 0x00fc }
            boolean r1 = com.appboy.p033s.C1563i.m7490d(r9)     // Catch:{ Exception -> 0x0130, all -> 0x00fc }
            if (r1 != 0) goto L_0x006c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0130, all -> 0x00fc }
            r1.<init>()     // Catch:{ Exception -> 0x0130, all -> 0x00fc }
            r1.append(r8)     // Catch:{ Exception -> 0x0130, all -> 0x00fc }
            r1.append(r9)     // Catch:{ Exception -> 0x0130, all -> 0x00fc }
            java.lang.String r8 = r1.toString()     // Catch:{ Exception -> 0x0130, all -> 0x00fc }
        L_0x006c:
            java.io.File r9 = new java.io.File     // Catch:{ Exception -> 0x0130, all -> 0x00fc }
            r9.<init>(r6, r8)     // Catch:{ Exception -> 0x0130, all -> 0x00fc }
            java.net.URL r6 = new java.net.URL     // Catch:{ Exception -> 0x0130, all -> 0x00fc }
            r6.<init>(r7)     // Catch:{ Exception -> 0x0130, all -> 0x00fc }
            java.net.URLConnection r6 = p161f.p162a.C4467h6.m15466a(r6)     // Catch:{ Exception -> 0x0130, all -> 0x00fc }
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ Exception -> 0x0130, all -> 0x00fc }
            int r8 = r6.getResponseCode()     // Catch:{ Exception -> 0x00f9, all -> 0x00f6 }
            r1 = 200(0xc8, float:2.8E-43)
            if (r8 == r1) goto L_0x00ad
            java.lang.String r9 = f5699a     // Catch:{ Exception -> 0x00f9, all -> 0x00f6 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00f9, all -> 0x00f6 }
            r1.<init>()     // Catch:{ Exception -> 0x00f9, all -> 0x00f6 }
            java.lang.String r3 = "HTTP response code was "
            r1.append(r3)     // Catch:{ Exception -> 0x00f9, all -> 0x00f6 }
            r1.append(r8)     // Catch:{ Exception -> 0x00f9, all -> 0x00f6 }
            java.lang.String r8 = ". File with url "
            r1.append(r8)     // Catch:{ Exception -> 0x00f9, all -> 0x00f6 }
            r1.append(r7)     // Catch:{ Exception -> 0x00f9, all -> 0x00f6 }
            java.lang.String r8 = " could not be downloaded."
            r1.append(r8)     // Catch:{ Exception -> 0x00f9, all -> 0x00f6 }
            java.lang.String r8 = r1.toString()     // Catch:{ Exception -> 0x00f9, all -> 0x00f6 }
            com.appboy.p033s.C1557c.m7458a(r9, r8)     // Catch:{ Exception -> 0x00f9, all -> 0x00f6 }
            if (r6 == 0) goto L_0x00ac
            r6.disconnect()
        L_0x00ac:
            return r2
        L_0x00ad:
            r8 = 8192(0x2000, float:1.14794E-41)
            byte[] r8 = new byte[r8]     // Catch:{ Exception -> 0x00f9, all -> 0x00f6 }
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch:{ Exception -> 0x00f9, all -> 0x00f6 }
            java.io.InputStream r3 = r6.getInputStream()     // Catch:{ Exception -> 0x00f9, all -> 0x00f6 }
            r1.<init>(r3)     // Catch:{ Exception -> 0x00f9, all -> 0x00f6 }
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x00f3, all -> 0x00f0 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00f3, all -> 0x00f0 }
            r4.<init>(r9)     // Catch:{ Exception -> 0x00f3, all -> 0x00f0 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x00f3, all -> 0x00f0 }
        L_0x00c4:
            int r4 = r1.read(r8)     // Catch:{ Exception -> 0x00ee, all -> 0x00ec }
            r5 = -1
            if (r4 == r5) goto L_0x00d0
            r5 = 0
            r3.write(r8, r5, r4)     // Catch:{ Exception -> 0x00ee, all -> 0x00ec }
            goto L_0x00c4
        L_0x00d0:
            r1.close()     // Catch:{ Exception -> 0x00ee, all -> 0x00ec }
            r6.disconnect()     // Catch:{ Exception -> 0x00ee, all -> 0x00ec }
            r3.close()     // Catch:{ Exception -> 0x00ee, all -> 0x00ec }
            if (r6 == 0) goto L_0x00de
            r6.disconnect()
        L_0x00de:
            r1.close()     // Catch:{ Exception -> 0x00e5 }
            r3.close()     // Catch:{ Exception -> 0x00e5 }
            goto L_0x00eb
        L_0x00e5:
            r6 = move-exception
            java.lang.String r7 = f5699a
            com.appboy.p033s.C1557c.m7470c(r7, r0, r6)
        L_0x00eb:
            return r9
        L_0x00ec:
            r8 = move-exception
            goto L_0x0101
        L_0x00ee:
            r8 = move-exception
            goto L_0x0135
        L_0x00f0:
            r8 = move-exception
            r3 = r2
            goto L_0x0101
        L_0x00f3:
            r8 = move-exception
            r3 = r2
            goto L_0x0135
        L_0x00f6:
            r8 = move-exception
            r1 = r2
            goto L_0x0100
        L_0x00f9:
            r8 = move-exception
            r1 = r2
            goto L_0x0134
        L_0x00fc:
            r6 = move-exception
            r8 = r6
            r6 = r2
            r1 = r6
        L_0x0100:
            r3 = r1
        L_0x0101:
            java.lang.String r9 = f5699a     // Catch:{ all -> 0x0164 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0164 }
            r4.<init>()     // Catch:{ all -> 0x0164 }
            java.lang.String r5 = "Throwable during download of file from url : "
            r4.append(r5)     // Catch:{ all -> 0x0164 }
            r4.append(r7)     // Catch:{ all -> 0x0164 }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x0164 }
            com.appboy.p033s.C1557c.m7470c(r9, r7, r8)     // Catch:{ all -> 0x0164 }
            if (r6 == 0) goto L_0x011c
            r6.disconnect()
        L_0x011c:
            if (r1 == 0) goto L_0x0124
            r1.close()     // Catch:{ Exception -> 0x0122 }
            goto L_0x0124
        L_0x0122:
            r6 = move-exception
            goto L_0x012a
        L_0x0124:
            if (r3 == 0) goto L_0x012f
            r3.close()     // Catch:{ Exception -> 0x0122 }
            goto L_0x012f
        L_0x012a:
            java.lang.String r7 = f5699a
            com.appboy.p033s.C1557c.m7470c(r7, r0, r6)
        L_0x012f:
            return r2
        L_0x0130:
            r6 = move-exception
            r8 = r6
            r6 = r2
            r1 = r6
        L_0x0134:
            r3 = r1
        L_0x0135:
            java.lang.String r9 = f5699a     // Catch:{ all -> 0x0164 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0164 }
            r4.<init>()     // Catch:{ all -> 0x0164 }
            java.lang.String r5 = "Exception during download of file from url : "
            r4.append(r5)     // Catch:{ all -> 0x0164 }
            r4.append(r7)     // Catch:{ all -> 0x0164 }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x0164 }
            com.appboy.p033s.C1557c.m7470c(r9, r7, r8)     // Catch:{ all -> 0x0164 }
            if (r6 == 0) goto L_0x0150
            r6.disconnect()
        L_0x0150:
            if (r1 == 0) goto L_0x0158
            r1.close()     // Catch:{ Exception -> 0x0156 }
            goto L_0x0158
        L_0x0156:
            r6 = move-exception
            goto L_0x015e
        L_0x0158:
            if (r3 == 0) goto L_0x0163
            r3.close()     // Catch:{ Exception -> 0x0156 }
            goto L_0x0163
        L_0x015e:
            java.lang.String r7 = f5699a
            com.appboy.p033s.C1557c.m7470c(r7, r0, r6)
        L_0x0163:
            return r2
        L_0x0164:
            r7 = move-exception
            if (r6 == 0) goto L_0x016a
            r6.disconnect()
        L_0x016a:
            if (r1 == 0) goto L_0x0172
            r1.close()     // Catch:{ Exception -> 0x0170 }
            goto L_0x0172
        L_0x0170:
            r6 = move-exception
            goto L_0x0178
        L_0x0172:
            if (r3 == 0) goto L_0x017d
            r3.close()     // Catch:{ Exception -> 0x0170 }
            goto L_0x017d
        L_0x0178:
            java.lang.String r8 = f5699a
            com.appboy.p033s.C1557c.m7470c(r8, r0, r6)
        L_0x017d:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appboy.p033s.C1554a.m7441a(java.lang.String, java.lang.String, java.lang.String, java.lang.String):java.io.File");
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0076 A[SYNTHETIC, Splitter:B:31:0x0076] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007e A[Catch:{ Exception -> 0x007a }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009a A[SYNTHETIC, Splitter:B:41:0x009a] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a2 A[Catch:{ Exception -> 0x009e }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m7442a(android.content.res.AssetManager r8, java.lang.String r9) {
        /*
            java.lang.String r0 = "Exception attempting to close file download streams for path:"
            r1 = 0
            java.io.InputStream r8 = r8.open(r9)     // Catch:{ Exception -> 0x005b, all -> 0x0056 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0053, all -> 0x004e }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0053, all -> 0x004e }
            java.lang.String r4 = "UTF-8"
            r3.<init>(r8, r4)     // Catch:{ Exception -> 0x0053, all -> 0x004e }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0053, all -> 0x004e }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004c }
            r3.<init>()     // Catch:{ Exception -> 0x004c }
        L_0x0018:
            java.lang.String r4 = r2.readLine()     // Catch:{ Exception -> 0x004c }
            if (r4 == 0) goto L_0x0027
            r3.append(r4)     // Catch:{ Exception -> 0x004c }
            r4 = 10
            r3.append(r4)     // Catch:{ Exception -> 0x004c }
            goto L_0x0018
        L_0x0027:
            java.lang.String r1 = r3.toString()     // Catch:{ Exception -> 0x004c }
            if (r8 == 0) goto L_0x0033
            r8.close()     // Catch:{ Exception -> 0x0031 }
            goto L_0x0033
        L_0x0031:
            r8 = move-exception
            goto L_0x0037
        L_0x0033:
            r2.close()     // Catch:{ Exception -> 0x0031 }
            goto L_0x004b
        L_0x0037:
            java.lang.String r2 = f5699a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r9)
            java.lang.String r9 = r3.toString()
            com.appboy.p033s.C1557c.m7470c(r2, r9, r8)
        L_0x004b:
            return r1
        L_0x004c:
            r3 = move-exception
            goto L_0x005e
        L_0x004e:
            r2 = move-exception
            r7 = r2
            r2 = r1
            r1 = r7
            goto L_0x0098
        L_0x0053:
            r3 = move-exception
            r2 = r1
            goto L_0x005e
        L_0x0056:
            r8 = move-exception
            r2 = r1
            r1 = r8
            r8 = r2
            goto L_0x0098
        L_0x005b:
            r3 = move-exception
            r8 = r1
            r2 = r8
        L_0x005e:
            java.lang.String r4 = f5699a     // Catch:{ all -> 0x0097 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0097 }
            r5.<init>()     // Catch:{ all -> 0x0097 }
            java.lang.String r6 = "Exception attempting to get asset content for "
            r5.append(r6)     // Catch:{ all -> 0x0097 }
            r5.append(r9)     // Catch:{ all -> 0x0097 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0097 }
            com.appboy.p033s.C1557c.m7470c(r4, r5, r3)     // Catch:{ all -> 0x0097 }
            if (r8 == 0) goto L_0x007c
            r8.close()     // Catch:{ Exception -> 0x007a }
            goto L_0x007c
        L_0x007a:
            r8 = move-exception
            goto L_0x0082
        L_0x007c:
            if (r2 == 0) goto L_0x0096
            r2.close()     // Catch:{ Exception -> 0x007a }
            goto L_0x0096
        L_0x0082:
            java.lang.String r2 = f5699a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r9)
            java.lang.String r9 = r3.toString()
            com.appboy.p033s.C1557c.m7470c(r2, r9, r8)
        L_0x0096:
            return r1
        L_0x0097:
            r1 = move-exception
        L_0x0098:
            if (r8 == 0) goto L_0x00a0
            r8.close()     // Catch:{ Exception -> 0x009e }
            goto L_0x00a0
        L_0x009e:
            r8 = move-exception
            goto L_0x00a6
        L_0x00a0:
            if (r2 == 0) goto L_0x00ba
            r2.close()     // Catch:{ Exception -> 0x009e }
            goto L_0x00ba
        L_0x00a6:
            java.lang.String r2 = f5699a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r9)
            java.lang.String r9 = r3.toString()
            com.appboy.p033s.C1557c.m7470c(r2, r9, r8)
        L_0x00ba:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appboy.p033s.C1554a.m7442a(android.content.res.AssetManager, java.lang.String):java.lang.String");
    }
}
