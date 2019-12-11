package p161f.p162a;

import com.appboy.p033s.C1557c;

/* renamed from: f.a.v3 */
public class C4606v3 {

    /* renamed from: a */
    private static final String f11475a = C1557c.m7461a(C4606v3.class);

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004a A[SYNTHETIC, Splitter:B:18:0x004a] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0050 A[SYNTHETIC, Splitter:B:22:0x0050] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m16007a(java.lang.String r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "Caught exception while trying to close system properties reader."
            r1 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch:{ Exception -> 0x0040 }
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ Exception -> 0x0040 }
            r4 = 0
            java.lang.String r5 = "/system/bin/getprop"
            r3[r4] = r5     // Catch:{ Exception -> 0x0040 }
            r4 = 1
            r3[r4] = r6     // Catch:{ Exception -> 0x0040 }
            java.lang.Process r6 = r2.exec(r3)     // Catch:{ Exception -> 0x0040 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0040 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0040 }
            java.io.InputStream r4 = r6.getInputStream()     // Catch:{ Exception -> 0x0040 }
            java.lang.String r5 = "UTF-8"
            r3.<init>(r4, r5)     // Catch:{ Exception -> 0x0040 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0040 }
            java.lang.String r7 = r2.readLine()     // Catch:{ Exception -> 0x003b, all -> 0x0038 }
            r6.destroy()     // Catch:{ Exception -> 0x003b, all -> 0x0038 }
            r2.close()     // Catch:{ Exception -> 0x0031 }
            goto L_0x004d
        L_0x0031:
            r6 = move-exception
            java.lang.String r1 = f11475a
            com.appboy.p033s.C1557c.m7470c(r1, r0, r6)
            goto L_0x004d
        L_0x0038:
            r6 = move-exception
            r1 = r2
            goto L_0x004e
        L_0x003b:
            r6 = move-exception
            r1 = r2
            goto L_0x0041
        L_0x003e:
            r6 = move-exception
            goto L_0x004e
        L_0x0040:
            r6 = move-exception
        L_0x0041:
            java.lang.String r2 = f11475a     // Catch:{ all -> 0x003e }
            java.lang.String r3 = "Caught exception while trying to read Braze logger tag from system properties."
            com.appboy.p033s.C1557c.m7470c(r2, r3, r6)     // Catch:{ all -> 0x003e }
            if (r1 == 0) goto L_0x004d
            r1.close()     // Catch:{ Exception -> 0x0031 }
        L_0x004d:
            return r7
        L_0x004e:
            if (r1 == 0) goto L_0x005a
            r1.close()     // Catch:{ Exception -> 0x0054 }
            goto L_0x005a
        L_0x0054:
            r7 = move-exception
            java.lang.String r1 = f11475a
            com.appboy.p033s.C1557c.m7470c(r1, r0, r7)
        L_0x005a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p161f.p162a.C4606v3.m16007a(java.lang.String, java.lang.String):java.lang.String");
    }
}
