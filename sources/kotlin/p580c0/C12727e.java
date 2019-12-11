package kotlin.p580c0;

/* renamed from: kotlin.c0.e */
/* compiled from: FileReadWrite.kt */
class C12727e extends C12726d {
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0058, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0059, code lost:
        kotlin.p580c0.C12724b.m39863a(r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005c, code lost:
        throw r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m39865a(java.io.File r7) {
        /*
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r7)
            r1 = 0
            long r2 = r7.length()     // Catch:{ all -> 0x0056 }
            r4 = 2147483647(0x7fffffff, float:NaN)
            long r4 = (long) r4     // Catch:{ all -> 0x0056 }
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0032
            int r7 = (int) r2     // Catch:{ all -> 0x0056 }
            byte[] r2 = new byte[r7]     // Catch:{ all -> 0x0056 }
        L_0x0015:
            if (r7 <= 0) goto L_0x0021
            int r3 = r0.read(r2, r1, r7)     // Catch:{ all -> 0x0056 }
            if (r3 >= 0) goto L_0x001e
            goto L_0x0021
        L_0x001e:
            int r7 = r7 - r3
            int r1 = r1 + r3
            goto L_0x0015
        L_0x0021:
            if (r7 != 0) goto L_0x0024
            goto L_0x002d
        L_0x0024:
            byte[] r2 = java.util.Arrays.copyOf(r2, r1)     // Catch:{ all -> 0x0056 }
            java.lang.String r7 = "java.util.Arrays.copyOf(this, newSize)"
            kotlin.jvm.internal.C12880j.m40222a(r2, r7)     // Catch:{ all -> 0x0056 }
        L_0x002d:
            r7 = 0
            kotlin.p580c0.C12724b.m39863a(r0, r7)
            return r2
        L_0x0032:
            java.lang.OutOfMemoryError r1 = new java.lang.OutOfMemoryError     // Catch:{ all -> 0x0056 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0056 }
            r4.<init>()     // Catch:{ all -> 0x0056 }
            java.lang.String r5 = "File "
            r4.append(r5)     // Catch:{ all -> 0x0056 }
            r4.append(r7)     // Catch:{ all -> 0x0056 }
            java.lang.String r7 = " is too big ("
            r4.append(r7)     // Catch:{ all -> 0x0056 }
            r4.append(r2)     // Catch:{ all -> 0x0056 }
            java.lang.String r7 = " bytes) to fit in memory."
            r4.append(r7)     // Catch:{ all -> 0x0056 }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x0056 }
            r1.<init>(r7)     // Catch:{ all -> 0x0056 }
            throw r1     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x0058 }
        L_0x0058:
            r1 = move-exception
            kotlin.p580c0.C12724b.m39863a(r0, r7)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p580c0.C12727e.m39865a(java.io.File):byte[]");
    }
}
