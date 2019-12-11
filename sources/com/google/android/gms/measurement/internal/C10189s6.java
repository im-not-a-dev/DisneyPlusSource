package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C9908u;
import java.net.URL;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.s6 */
final class C10189s6 implements Runnable {

    /* renamed from: U */
    private final C10158p6 f23917U;

    /* renamed from: V */
    private final String f23918V;

    /* renamed from: W */
    private final Map<String, String> f23919W = null;

    /* renamed from: X */
    private final /* synthetic */ C10169q6 f23920X;

    /* renamed from: c */
    private final URL f23921c;

    public C10189s6(C10169q6 q6Var, String str, URL url, byte[] bArr, Map<String, String> map, C10158p6 p6Var) {
        this.f23920X = q6Var;
        C9908u.m30863b(str);
        C9908u.m30853a(url);
        C9908u.m30853a(p6Var);
        this.f23921c = url;
        this.f23917U = p6Var;
        this.f23918V = str;
    }

    /* renamed from: b */
    private final void m31813b(int i, Exception exc, byte[] bArr, Map<String, List<String>> map) {
        C10078i4 d = this.f23920X.mo25897d();
        C10179r6 r6Var = new C10179r6(this, i, exc, bArr, map);
        d.mo25800a((Runnable) r6Var);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo26080a(int i, Exception exc, byte[] bArr, Map map) {
        this.f23917U.mo25950a(this.f23918V, i, exc, bArr, map);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x007d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            com.google.android.gms.measurement.internal.q6 r0 = r7.f23920X
            r0.mo25803i()
            r0 = 0
            r1 = 0
            com.google.android.gms.measurement.internal.q6 r2 = r7.f23920X     // Catch:{ IOException -> 0x0077, all -> 0x006a }
            java.net.URL r3 = r7.f23921c     // Catch:{ IOException -> 0x0077, all -> 0x006a }
            java.net.HttpURLConnection r2 = r2.mo26068a(r3)     // Catch:{ IOException -> 0x0077, all -> 0x006a }
            java.util.Map<java.lang.String, java.lang.String> r3 = r7.f23919W     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            if (r3 == 0) goto L_0x0039
            java.util.Map<java.lang.String, java.lang.String> r3 = r7.f23919W     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            java.util.Set r3 = r3.entrySet()     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
        L_0x001d:
            boolean r4 = r3.hasNext()     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            if (r4 == 0) goto L_0x0039
            java.lang.Object r4 = r3.next()     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            java.lang.Object r5 = r4.getKey()     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            r2.addRequestProperty(r5, r4)     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            goto L_0x001d
        L_0x0039:
            int r1 = r2.getResponseCode()     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            java.util.Map r3 = r2.getHeaderFields()     // Catch:{ IOException -> 0x0060, all -> 0x005c }
            com.google.android.gms.measurement.internal.q6 r4 = r7.f23920X     // Catch:{ IOException -> 0x0056, all -> 0x0050 }
            byte[] r4 = com.google.android.gms.measurement.internal.C10169q6.m31804a(r2)     // Catch:{ IOException -> 0x0056, all -> 0x0050 }
            if (r2 == 0) goto L_0x004c
            r2.disconnect()
        L_0x004c:
            r7.m31813b(r1, r0, r4, r3)
            return
        L_0x0050:
            r4 = move-exception
            r6 = r4
            r4 = r1
            r1 = r3
            r3 = r6
            goto L_0x006e
        L_0x0056:
            r4 = move-exception
            r6 = r4
            r4 = r1
            r1 = r3
            r3 = r6
            goto L_0x007b
        L_0x005c:
            r3 = move-exception
            r4 = r1
            r1 = r0
            goto L_0x006e
        L_0x0060:
            r3 = move-exception
            r4 = r1
            r1 = r0
            goto L_0x007b
        L_0x0064:
            r3 = move-exception
            r1 = r0
            goto L_0x006d
        L_0x0067:
            r3 = move-exception
            r1 = r0
            goto L_0x007a
        L_0x006a:
            r3 = move-exception
            r1 = r0
            r2 = r1
        L_0x006d:
            r4 = 0
        L_0x006e:
            if (r2 == 0) goto L_0x0073
            r2.disconnect()
        L_0x0073:
            r7.m31813b(r4, r0, r0, r1)
            throw r3
        L_0x0077:
            r3 = move-exception
            r1 = r0
            r2 = r1
        L_0x007a:
            r4 = 0
        L_0x007b:
            if (r2 == 0) goto L_0x0080
            r2.disconnect()
        L_0x0080:
            r7.m31813b(r4, r3, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C10189s6.run():void");
    }
}
