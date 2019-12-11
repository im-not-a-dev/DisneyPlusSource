package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C9908u;
import java.net.URL;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.s3 */
final class C10186s3 implements Runnable {

    /* renamed from: U */
    private final byte[] f23901U;

    /* renamed from: V */
    private final C10166q3 f23902V;

    /* renamed from: W */
    private final String f23903W;

    /* renamed from: X */
    private final Map<String, String> f23904X;

    /* renamed from: Y */
    private final /* synthetic */ C10144o3 f23905Y;

    /* renamed from: c */
    private final URL f23906c;

    public C10186s3(C10144o3 o3Var, String str, URL url, byte[] bArr, Map<String, String> map, C10166q3 q3Var) {
        this.f23905Y = o3Var;
        C9908u.m30863b(str);
        C9908u.m30853a(url);
        C9908u.m30853a(q3Var);
        this.f23906c = url;
        this.f23901U = bArr;
        this.f23902V = q3Var;
        this.f23903W = str;
        this.f23904X = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c6 A[SYNTHETIC, Splitter:B:44:0x00c6] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0101 A[SYNTHETIC, Splitter:B:57:0x0101] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x011b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            java.lang.String r0 = "Error closing HTTP compressed POST connection output stream. appId"
            com.google.android.gms.measurement.internal.o3 r1 = r13.f23905Y
            r1.mo25803i()
            r1 = 0
            r2 = 0
            com.google.android.gms.measurement.internal.o3 r3 = r13.f23905Y     // Catch:{ IOException -> 0x00fa, all -> 0x00c0 }
            java.net.URL r4 = r13.f23906c     // Catch:{ IOException -> 0x00fa, all -> 0x00c0 }
            java.net.HttpURLConnection r3 = r3.mo26014a(r4)     // Catch:{ IOException -> 0x00fa, all -> 0x00c0 }
            java.util.Map<java.lang.String, java.lang.String> r4 = r13.f23904X     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            if (r4 == 0) goto L_0x003b
            java.util.Map<java.lang.String, java.lang.String> r4 = r13.f23904X     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            java.util.Set r4 = r4.entrySet()     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
        L_0x001f:
            boolean r5 = r4.hasNext()     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            if (r5 == 0) goto L_0x003b
            java.lang.Object r5 = r4.next()     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            java.lang.Object r6 = r5.getKey()     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            java.lang.Object r5 = r5.getValue()     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            r3.addRequestProperty(r6, r5)     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            goto L_0x001f
        L_0x003b:
            byte[] r4 = r13.f23901U     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            if (r4 == 0) goto L_0x0086
            com.google.android.gms.measurement.internal.o3 r4 = r13.f23905Y     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            com.google.android.gms.measurement.internal.u8 r4 = r4.mo25888n()     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            byte[] r5 = r13.f23901U     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            byte[] r4 = r4.mo26124c(r5)     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            com.google.android.gms.measurement.internal.o3 r5 = r13.f23905Y     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            com.google.android.gms.measurement.internal.k3 r5 = r5.mo25898e()     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            com.google.android.gms.measurement.internal.m3 r5 = r5.mo25869B()     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            java.lang.String r6 = "Uploading data. size"
            int r7 = r4.length     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            r5.mo25909a(r6, r7)     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            r5 = 1
            r3.setDoOutput(r5)     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            java.lang.String r5 = "Content-Encoding"
            java.lang.String r6 = "gzip"
            r3.addRequestProperty(r5, r6)     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            int r5 = r4.length     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            r3.setFixedLengthStreamingMode(r5)     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            r3.connect()     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            java.io.OutputStream r5 = r3.getOutputStream()     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            r5.write(r4)     // Catch:{ IOException -> 0x0080, all -> 0x007c }
            r5.close()     // Catch:{ IOException -> 0x0080, all -> 0x007c }
            goto L_0x0086
        L_0x007c:
            r4 = move-exception
            r11 = r1
            r1 = r5
            goto L_0x00c3
        L_0x0080:
            r4 = move-exception
            r11 = r1
            r9 = r4
            r1 = r5
            goto L_0x00fe
        L_0x0086:
            int r8 = r3.getResponseCode()     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            java.util.Map r11 = r3.getHeaderFields()     // Catch:{ IOException -> 0x00b6, all -> 0x00b3 }
            com.google.android.gms.measurement.internal.o3 r2 = r13.f23905Y     // Catch:{ IOException -> 0x00b1, all -> 0x00af }
            byte[] r10 = com.google.android.gms.measurement.internal.C10144o3.m31723a(r3)     // Catch:{ IOException -> 0x00b1, all -> 0x00af }
            if (r3 == 0) goto L_0x0099
            r3.disconnect()
        L_0x0099:
            com.google.android.gms.measurement.internal.o3 r0 = r13.f23905Y
            com.google.android.gms.measurement.internal.i4 r0 = r0.mo25897d()
            com.google.android.gms.measurement.internal.p3 r1 = new com.google.android.gms.measurement.internal.p3
            java.lang.String r6 = r13.f23903W
            com.google.android.gms.measurement.internal.q3 r7 = r13.f23902V
            r9 = 0
            r12 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0.mo25800a(r1)
            return
        L_0x00af:
            r4 = move-exception
            goto L_0x00c4
        L_0x00b1:
            r4 = move-exception
            goto L_0x00b8
        L_0x00b3:
            r4 = move-exception
            r11 = r1
            goto L_0x00c4
        L_0x00b6:
            r4 = move-exception
            r11 = r1
        L_0x00b8:
            r9 = r4
            goto L_0x00ff
        L_0x00ba:
            r4 = move-exception
            r11 = r1
            goto L_0x00c3
        L_0x00bd:
            r4 = move-exception
            r11 = r1
            goto L_0x00fd
        L_0x00c0:
            r4 = move-exception
            r3 = r1
            r11 = r3
        L_0x00c3:
            r8 = 0
        L_0x00c4:
            if (r1 == 0) goto L_0x00de
            r1.close()     // Catch:{ IOException -> 0x00ca }
            goto L_0x00de
        L_0x00ca:
            r1 = move-exception
            com.google.android.gms.measurement.internal.o3 r2 = r13.f23905Y
            com.google.android.gms.measurement.internal.k3 r2 = r2.mo25898e()
            com.google.android.gms.measurement.internal.m3 r2 = r2.mo25874t()
            java.lang.String r5 = r13.f23903W
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r5)
            r2.mo25910a(r0, r5, r1)
        L_0x00de:
            if (r3 == 0) goto L_0x00e3
            r3.disconnect()
        L_0x00e3:
            com.google.android.gms.measurement.internal.o3 r0 = r13.f23905Y
            com.google.android.gms.measurement.internal.i4 r0 = r0.mo25897d()
            com.google.android.gms.measurement.internal.p3 r1 = new com.google.android.gms.measurement.internal.p3
            java.lang.String r6 = r13.f23903W
            com.google.android.gms.measurement.internal.q3 r7 = r13.f23902V
            r9 = 0
            r10 = 0
            r12 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0.mo25800a(r1)
            throw r4
        L_0x00fa:
            r4 = move-exception
            r3 = r1
            r11 = r3
        L_0x00fd:
            r9 = r4
        L_0x00fe:
            r8 = 0
        L_0x00ff:
            if (r1 == 0) goto L_0x0119
            r1.close()     // Catch:{ IOException -> 0x0105 }
            goto L_0x0119
        L_0x0105:
            r1 = move-exception
            com.google.android.gms.measurement.internal.o3 r2 = r13.f23905Y
            com.google.android.gms.measurement.internal.k3 r2 = r2.mo25898e()
            com.google.android.gms.measurement.internal.m3 r2 = r2.mo25874t()
            java.lang.String r4 = r13.f23903W
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r4)
            r2.mo25910a(r0, r4, r1)
        L_0x0119:
            if (r3 == 0) goto L_0x011e
            r3.disconnect()
        L_0x011e:
            com.google.android.gms.measurement.internal.o3 r0 = r13.f23905Y
            com.google.android.gms.measurement.internal.i4 r0 = r0.mo25897d()
            com.google.android.gms.measurement.internal.p3 r1 = new com.google.android.gms.measurement.internal.p3
            java.lang.String r6 = r13.f23903W
            com.google.android.gms.measurement.internal.q3 r7 = r13.f23902V
            r10 = 0
            r12 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0.mo25800a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C10186s3.run():void");
    }
}
