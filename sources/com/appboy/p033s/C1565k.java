package com.appboy.p033s;

import android.content.Context;
import java.io.File;

/* renamed from: com.appboy.s.k */
public class C1565k {

    /* renamed from: a */
    private static final String f5716a = C1557c.m7461a(C1565k.class);

    /* renamed from: a */
    public static String m7500a(File file, String str) {
        if (file == null) {
            C1557c.m7473e(f5716a, "Internal cache directory is null. No local URL will be created.");
            return null;
        } else if (C1563i.m7490d(str)) {
            C1557c.m7473e(f5716a, "Remote zip url is null or empty. No local URL will be created.");
            return null;
        } else {
            String absolutePath = file.getAbsolutePath();
            String valueOf = String.valueOf(C1560f.m7479a());
            StringBuilder sb = new StringBuilder();
            sb.append(absolutePath);
            sb.append("/");
            sb.append(valueOf);
            String sb2 = sb.toString();
            String str2 = f5716a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Starting download of url: ");
            sb3.append(str);
            C1557c.m7458a(str2, sb3.toString());
            File a = C1554a.m7441a(sb2, str, valueOf, ".zip");
            if (a == null) {
                C1557c.m7458a(f5716a, "Could not download zip file to local storage.");
                C1554a.m7443a(new File(sb2));
                return null;
            }
            C1557c.m7458a(f5716a, "Html content zip downloaded.");
            if (!m7502a(sb2, a)) {
                C1557c.m7473e(f5716a, "Error during the zip unpack.");
                C1554a.m7443a(new File(sb2));
                return null;
            }
            C1557c.m7458a(f5716a, "Html content zip unpacked.");
            return sb2;
        }
    }

    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.zip.ZipInputStream] */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.io.BufferedOutputStream] */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.zip.ZipInputStream] */
    /* JADX WARNING: type inference failed for: r1v5, types: [java.io.BufferedOutputStream] */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.util.zip.ZipInputStream] */
    /* JADX WARNING: type inference failed for: r1v6, types: [java.io.BufferedOutputStream] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5, types: [java.util.zip.ZipInputStream] */
    /* JADX WARNING: type inference failed for: r1v7, types: [java.io.BufferedOutputStream] */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v8, types: [java.util.zip.ZipInputStream] */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v11, types: [java.io.BufferedOutputStream] */
    /* JADX WARNING: type inference failed for: r1v13 */
    /* JADX WARNING: type inference failed for: r4v5, types: [java.io.BufferedOutputStream] */
    /* JADX WARNING: type inference failed for: r1v14 */
    /* JADX WARNING: type inference failed for: r1v15 */
    /* JADX WARNING: type inference failed for: r1v16 */
    /* JADX WARNING: type inference failed for: r1v18 */
    /* JADX WARNING: type inference failed for: r1v19 */
    /* JADX WARNING: type inference failed for: r1v20 */
    /* JADX WARNING: type inference failed for: r1v21 */
    /* JADX WARNING: type inference failed for: r1v22 */
    /* JADX WARNING: type inference failed for: r1v23 */
    /* JADX WARNING: type inference failed for: r1v24 */
    /* JADX WARNING: type inference failed for: r1v25 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r1v26 */
    /* JADX WARNING: type inference failed for: r1v27 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r1v28 */
    /* JADX WARNING: type inference failed for: r1v29 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r1v30 */
    /* JADX WARNING: type inference failed for: r1v31 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: type inference failed for: r3v20 */
    /* JADX WARNING: type inference failed for: r1v32 */
    /* JADX WARNING: type inference failed for: r1v33 */
    /* JADX WARNING: type inference failed for: r1v34 */
    /* JADX WARNING: type inference failed for: r1v35 */
    /* JADX WARNING: type inference failed for: r1v36 */
    /* JADX WARNING: type inference failed for: r1v37 */
    /* JADX WARNING: type inference failed for: r1v38 */
    /* JADX WARNING: type inference failed for: r1v39 */
    /* JADX WARNING: type inference failed for: r1v40 */
    /* JADX WARNING: type inference failed for: r1v41 */
    /* JADX WARNING: type inference failed for: r1v42 */
    /* JADX WARNING: type inference failed for: r1v43 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v8
      assigns: []
      uses: []
      mth insns count: 159
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
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c2 A[SYNTHETIC, Splitter:B:52:0x00c2] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ca A[Catch:{ IOException -> 0x00c6 }, DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00df A[SYNTHETIC, Splitter:B:65:0x00df] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00e7 A[Catch:{ IOException -> 0x00e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00fc A[SYNTHETIC, Splitter:B:78:0x00fc] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0104 A[Catch:{ IOException -> 0x0100 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:75:0x00f3=Splitter:B:75:0x00f3, B:62:0x00d6=Splitter:B:62:0x00d6, B:49:0x00b9=Splitter:B:49:0x00b9} */
    /* JADX WARNING: Unknown variable types count: 16 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m7502a(java.lang.String r8, java.io.File r9) {
        /*
            java.lang.String r0 = "IOException during closing of zip file unpacking streams."
            boolean r1 = com.appboy.p033s.C1563i.m7490d(r8)
            r2 = 0
            if (r1 == 0) goto L_0x0011
            java.lang.String r8 = f5716a
            java.lang.String r9 = "Unpack directory null or blank. Zip file not unpacked."
            com.appboy.p033s.C1557c.m7469c(r8, r9)
            return r2
        L_0x0011:
            if (r9 != 0) goto L_0x001b
            java.lang.String r8 = f5716a
            java.lang.String r9 = "Zip file is null. Zip file not unpacked."
            com.appboy.p033s.C1557c.m7469c(r8, r9)
            return r2
        L_0x001b:
            java.io.File r1 = new java.io.File
            r1.<init>(r8)
            r1.mkdirs()
            r1 = 0
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x00f1, IOException -> 0x00d4, all -> 0x00b7 }
            r3.<init>(r9)     // Catch:{ FileNotFoundException -> 0x00f1, IOException -> 0x00d4, all -> 0x00b7 }
            java.io.BufferedInputStream r9 = new java.io.BufferedInputStream     // Catch:{ FileNotFoundException -> 0x00f1, IOException -> 0x00d4, all -> 0x00b7 }
            r9.<init>(r3)     // Catch:{ FileNotFoundException -> 0x00f1, IOException -> 0x00d4, all -> 0x00b7 }
            java.util.zip.ZipInputStream r3 = new java.util.zip.ZipInputStream     // Catch:{ FileNotFoundException -> 0x00f1, IOException -> 0x00d4, all -> 0x00b7 }
            r3.<init>(r9)     // Catch:{ FileNotFoundException -> 0x00f1, IOException -> 0x00d4, all -> 0x00b7 }
            r9 = 8192(0x2000, float:1.14794E-41)
            byte[] r9 = new byte[r9]     // Catch:{ FileNotFoundException -> 0x00b5, IOException -> 0x00b3, all -> 0x00b1 }
        L_0x0037:
            java.util.zip.ZipEntry r4 = r3.getNextEntry()     // Catch:{ FileNotFoundException -> 0x00b5, IOException -> 0x00b3, all -> 0x00b1 }
            if (r4 == 0) goto L_0x009d
            java.lang.String r5 = r4.getName()     // Catch:{ FileNotFoundException -> 0x00b5, IOException -> 0x00b3, all -> 0x00b1 }
            java.util.Locale r6 = java.util.Locale.US     // Catch:{ FileNotFoundException -> 0x00b5, IOException -> 0x00b3, all -> 0x00b1 }
            java.lang.String r6 = r5.toLowerCase(r6)     // Catch:{ FileNotFoundException -> 0x00b5, IOException -> 0x00b3, all -> 0x00b1 }
            java.lang.String r7 = "__macosx"
            boolean r6 = r6.startsWith(r7)     // Catch:{ FileNotFoundException -> 0x00b5, IOException -> 0x00b3, all -> 0x00b1 }
            if (r6 == 0) goto L_0x0050
            goto L_0x0037
        L_0x0050:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x00b5, IOException -> 0x00b3, all -> 0x00b1 }
            r6.<init>()     // Catch:{ FileNotFoundException -> 0x00b5, IOException -> 0x00b3, all -> 0x00b1 }
            r6.append(r8)     // Catch:{ FileNotFoundException -> 0x00b5, IOException -> 0x00b3, all -> 0x00b1 }
            java.lang.String r7 = "/"
            r6.append(r7)     // Catch:{ FileNotFoundException -> 0x00b5, IOException -> 0x00b3, all -> 0x00b1 }
            r6.append(r5)     // Catch:{ FileNotFoundException -> 0x00b5, IOException -> 0x00b3, all -> 0x00b1 }
            java.lang.String r5 = r6.toString()     // Catch:{ FileNotFoundException -> 0x00b5, IOException -> 0x00b3, all -> 0x00b1 }
            java.lang.String r5 = m7501a(r8, r5)     // Catch:{ FileNotFoundException -> 0x00b5, IOException -> 0x00b3, all -> 0x00b1 }
            boolean r4 = r4.isDirectory()     // Catch:{ FileNotFoundException -> 0x00b5, IOException -> 0x00b3, all -> 0x00b1 }
            if (r4 == 0) goto L_0x0077
            java.io.File r4 = new java.io.File     // Catch:{ FileNotFoundException -> 0x00b5, IOException -> 0x00b3, all -> 0x00b1 }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x00b5, IOException -> 0x00b3, all -> 0x00b1 }
            r4.mkdirs()     // Catch:{ FileNotFoundException -> 0x00b5, IOException -> 0x00b3, all -> 0x00b1 }
            goto L_0x0037
        L_0x0077:
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch:{ FileNotFoundException -> 0x00b5, IOException -> 0x00b3, all -> 0x00b1 }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x00b5, IOException -> 0x00b3, all -> 0x00b1 }
            r6.<init>(r5)     // Catch:{ FileNotFoundException -> 0x00b5, IOException -> 0x00b3, all -> 0x00b1 }
            r4.<init>(r6)     // Catch:{ FileNotFoundException -> 0x00b5, IOException -> 0x00b3, all -> 0x00b1 }
        L_0x0081:
            int r1 = r3.read(r9)     // Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x0097, all -> 0x0094 }
            r5 = -1
            if (r1 == r5) goto L_0x008c
            r4.write(r9, r2, r1)     // Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x0097, all -> 0x0094 }
            goto L_0x0081
        L_0x008c:
            r4.close()     // Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x0097, all -> 0x0094 }
            r3.closeEntry()     // Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x0097, all -> 0x0094 }
            r1 = r4
            goto L_0x0037
        L_0x0094:
            r8 = move-exception
            r1 = r4
            goto L_0x00b9
        L_0x0097:
            r8 = move-exception
            r1 = r4
            goto L_0x00d6
        L_0x009a:
            r8 = move-exception
            r1 = r4
            goto L_0x00f3
        L_0x009d:
            r3.close()     // Catch:{ FileNotFoundException -> 0x00b5, IOException -> 0x00b3, all -> 0x00b1 }
            r8 = 1
            r3.close()     // Catch:{ IOException -> 0x00aa }
            if (r1 == 0) goto L_0x00b0
            r1.close()     // Catch:{ IOException -> 0x00aa }
            goto L_0x00b0
        L_0x00aa:
            r9 = move-exception
            java.lang.String r1 = f5716a
            com.appboy.p033s.C1557c.m7470c(r1, r0, r9)
        L_0x00b0:
            return r8
        L_0x00b1:
            r8 = move-exception
            goto L_0x00b9
        L_0x00b3:
            r8 = move-exception
            goto L_0x00d6
        L_0x00b5:
            r8 = move-exception
            goto L_0x00f3
        L_0x00b7:
            r8 = move-exception
            r3 = r1
        L_0x00b9:
            java.lang.String r9 = f5716a     // Catch:{ all -> 0x010e }
            java.lang.String r4 = "Error during unpack of zip file."
            com.appboy.p033s.C1557c.m7470c(r9, r4, r8)     // Catch:{ all -> 0x010e }
            if (r3 == 0) goto L_0x00c8
            r3.close()     // Catch:{ IOException -> 0x00c6 }
            goto L_0x00c8
        L_0x00c6:
            r8 = move-exception
            goto L_0x00ce
        L_0x00c8:
            if (r1 == 0) goto L_0x00d3
            r1.close()     // Catch:{ IOException -> 0x00c6 }
            goto L_0x00d3
        L_0x00ce:
            java.lang.String r9 = f5716a
            com.appboy.p033s.C1557c.m7470c(r9, r0, r8)
        L_0x00d3:
            return r2
        L_0x00d4:
            r8 = move-exception
            r3 = r1
        L_0x00d6:
            java.lang.String r9 = f5716a     // Catch:{ all -> 0x010e }
            java.lang.String r4 = "IOException during unpack of zip file."
            com.appboy.p033s.C1557c.m7470c(r9, r4, r8)     // Catch:{ all -> 0x010e }
            if (r3 == 0) goto L_0x00e5
            r3.close()     // Catch:{ IOException -> 0x00e3 }
            goto L_0x00e5
        L_0x00e3:
            r8 = move-exception
            goto L_0x00eb
        L_0x00e5:
            if (r1 == 0) goto L_0x00f0
            r1.close()     // Catch:{ IOException -> 0x00e3 }
            goto L_0x00f0
        L_0x00eb:
            java.lang.String r9 = f5716a
            com.appboy.p033s.C1557c.m7470c(r9, r0, r8)
        L_0x00f0:
            return r2
        L_0x00f1:
            r8 = move-exception
            r3 = r1
        L_0x00f3:
            java.lang.String r9 = f5716a     // Catch:{ all -> 0x010e }
            java.lang.String r4 = "FileNotFoundException during unpack of zip file."
            com.appboy.p033s.C1557c.m7470c(r9, r4, r8)     // Catch:{ all -> 0x010e }
            if (r3 == 0) goto L_0x0102
            r3.close()     // Catch:{ IOException -> 0x0100 }
            goto L_0x0102
        L_0x0100:
            r8 = move-exception
            goto L_0x0108
        L_0x0102:
            if (r1 == 0) goto L_0x010d
            r1.close()     // Catch:{ IOException -> 0x0100 }
            goto L_0x010d
        L_0x0108:
            java.lang.String r9 = f5716a
            com.appboy.p033s.C1557c.m7470c(r9, r0, r8)
        L_0x010d:
            return r2
        L_0x010e:
            r8 = move-exception
            if (r3 == 0) goto L_0x0117
            r3.close()     // Catch:{ IOException -> 0x0115 }
            goto L_0x0117
        L_0x0115:
            r9 = move-exception
            goto L_0x011d
        L_0x0117:
            if (r1 == 0) goto L_0x0122
            r1.close()     // Catch:{ IOException -> 0x0115 }
            goto L_0x0122
        L_0x011d:
            java.lang.String r1 = f5716a
            com.appboy.p033s.C1557c.m7470c(r1, r0, r9)
        L_0x0122:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appboy.p033s.C1565k.m7502a(java.lang.String, java.io.File):boolean");
    }

    /* renamed from: a */
    public static File m7499a(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getCacheDir().getPath());
        sb.append("/");
        sb.append("appboy-html-inapp-messages");
        return new File(sb.toString());
    }

    /* renamed from: a */
    static String m7501a(String str, String str2) {
        String canonicalPath = new File(str).getCanonicalPath();
        String canonicalPath2 = new File(str2).getCanonicalPath();
        if (canonicalPath2.startsWith(canonicalPath)) {
            return canonicalPath2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid file with original path: ");
        sb.append(str2);
        sb.append(" with canonical path: ");
        sb.append(canonicalPath2);
        sb.append(" does not exist under intended parent with  path: ");
        sb.append(str);
        sb.append(" and canonical path: ");
        sb.append(canonicalPath);
        throw new IllegalStateException(sb.toString());
    }
}
