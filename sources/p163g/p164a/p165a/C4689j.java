package p163g.p164a.p165a;

import android.database.SQLException;
import android.database.sqlite.SQLiteStatement;
import android.os.Process;
import com.facebook.stetho.common.Utf8Charset;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: g.a.a.j */
/* compiled from: AnalyticsWorker */
final class C4689j extends C4653b {
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static final SecureRandom f11691p = new SecureRandom();

    /* renamed from: q */
    private static C4689j f11692q = null;

    /* renamed from: r */
    private static final Object f11693r = new Object();

    /* renamed from: s */
    private static String f11694s;

    /* renamed from: t */
    private static volatile boolean f11695t = true;

    /* renamed from: o */
    protected SQLiteStatement f11696o = null;

    /* renamed from: g.a.a.j$a */
    /* compiled from: AnalyticsWorker */
    class C4690a implements Runnable {

        /* renamed from: g.a.a.j$a$a */
        /* compiled from: AnalyticsWorker */
        class C4691a implements Runnable {

            /* renamed from: c */
            final /* synthetic */ JSONObject f11698c;

            C4691a(C4690a aVar, JSONObject jSONObject) {
                this.f11698c = jSONObject;
            }

            public void run() {
                C4696l.m16356c(this.f11698c);
            }
        }

        C4690a() {
        }

        public void run() {
            String str;
            C4689j o = C4689j.m16331o();
            Process.setThreadPriority(10);
            HashMap hashMap = new HashMap();
            hashMap.put("Accept-Language", C4783y0.m16656p());
            hashMap.put("User-Agent", C4783y0.m16658r());
            while (C4728p0.m16448H().mo16101t() == C4758r0.MOBILE_PRIVACY_STATUS_OPT_IN && C4728p0.m16448H().mo16075F() && o.f11595c == C4646b.OK) {
                C4654a k = o.mo16028k();
                if (k == null) {
                    break;
                }
                if (C4728p0.m16448H().mo16100s()) {
                    long j = k.f11626c;
                    long j2 = o.f11617h;
                    if (j - j2 < 0) {
                        long j3 = j2 + 1;
                        StringBuilder sb = new StringBuilder();
                        String str2 = "&ts=";
                        sb.append(str2);
                        sb.append(Long.toString(k.f11626c));
                        String sb2 = sb.toString();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(str2);
                        sb3.append(Long.toString(j3));
                        k.f11624a = k.f11624a.replaceFirst(sb2, sb3.toString());
                        C4783y0.m16630a("Analytics - Adjusting out of order hit timestamp(%d->%d)", Long.valueOf(k.f11626c), Long.valueOf(j3));
                        k.f11626c = j3;
                    }
                } else if (k.f11626c < C4783y0.m16607E() - 60) {
                    try {
                        o.mo15984a(k.f11625b);
                    } catch (C4645a e) {
                        C4689j.m16331o().mo15957a((Exception) e);
                    }
                }
                if (k.f11624a.startsWith("ndh")) {
                    str = k.f11624a;
                } else {
                    String str3 = k.f11624a;
                    str = str3.substring(str3.indexOf(63) + 1);
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append(C4689j.m16330n());
                sb4.append(C4689j.f11691p.nextInt(100000000));
                byte[] a = C4779x0.m16598a(sb4.toString(), str, (Map<String, String>) hashMap, 5000, C4689j.this.f11598f);
                if (a == null) {
                    int i = 0;
                    while (((long) i) < 30) {
                        try {
                            if (!C4728p0.m16448H().mo16075F()) {
                                break;
                            }
                            Thread.sleep(1000);
                            i++;
                        } catch (Exception e2) {
                            C4783y0.m16640c("Analytics - Background Thread Interrupted(%s)", e2.getMessage());
                        }
                    }
                } else if (a.length > 1) {
                    try {
                        o.mo15984a(k.f11625b);
                        o.f11617h = k.f11626c;
                        C4783y0.m16650j().execute(new C4691a(this, new JSONObject(new String(a, Utf8Charset.NAME))));
                    } catch (C4645a e3) {
                        C4689j.m16331o().mo15957a((Exception) e3);
                    } catch (UnsupportedEncodingException e4) {
                        C4783y0.m16640c("Audience Manager - Unable to decode server response (%s)", e4.getLocalizedMessage());
                    } catch (JSONException e5) {
                        C4783y0.m16640c("Audience Manager - Unable to parse JSON data (%s)", e5.getLocalizedMessage());
                    }
                } else {
                    try {
                        o.mo15984a(k.f11625b);
                        o.f11617h = k.f11626c;
                    } catch (C4645a e6) {
                        C4689j.m16331o().mo15957a((Exception) e6);
                    }
                }
            }
            o.f11619j = false;
        }
    }

    protected C4689j() {
        mo15956a(new File(C4783y0.m16651k(), this.f11597e));
        this.f11616g = mo15988i();
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static String m16330n() {
        if (f11695t) {
            f11695t = false;
            StringBuilder sb = new StringBuilder();
            sb.append(C4728p0.m16448H().mo16104w() ? "https://" : "http://");
            sb.append(C4728p0.m16448H().mo16105x());
            sb.append("/b/ss/");
            sb.append(C4783y0.m16619a(C4728p0.m16448H().mo16103v()));
            sb.append("/");
            sb.append(C4728p0.m16448H().mo16088g());
            sb.append("/JAVA-");
            sb.append("4.17.1-AN");
            sb.append("/s");
            f11694s = sb.toString();
            C4783y0.m16630a("Analytics - Setting base request URL(%s)", f11694s);
        }
        return f11694s;
    }

    /* renamed from: o */
    public static C4689j m16331o() {
        C4689j jVar;
        synchronized (f11693r) {
            if (f11692q == null) {
                f11692q = new C4689j();
            }
            jVar = f11692q;
        }
        return jVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16027a(String str, long j) {
        C4728p0 H = C4728p0.m16448H();
        if (H == null) {
            C4783y0.m16636b("Analytics - Cannot send hit, MobileConfig is null (this really shouldn't happen)", new Object[0]);
        } else if (C4728p0.m16448H().mo16071B()) {
            if (H.mo16101t() == C4758r0.MOBILE_PRIVACY_STATUS_OPT_OUT) {
                C4783y0.m16630a("Analytics - Ignoring hit due to privacy status being opted out", new Object[0]);
            } else if (this.f11595c == C4646b.FATALERROR) {
                C4783y0.m16636b("Analytics - Ignoring hit due to database error", new Object[0]);
            } else {
                synchronized (this.f11596d) {
                    try {
                        this.f11696o.bindString(1, str);
                        this.f11696o.bindLong(2, j);
                        this.f11696o.execute();
                        C4783y0.m16627a(Long.valueOf(j));
                        this.f11616g++;
                        this.f11696o.clearBindings();
                    } catch (SQLException e) {
                        C4783y0.m16636b("Analytics - Unable to insert url (%s)", str);
                        mo15957a((Exception) e);
                    } catch (Exception e2) {
                        C4783y0.m16636b("Analytics - Unknown error while inserting url (%s)", str);
                        mo15957a(e2);
                    }
                }
                mo15985a(false);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo15961e() {
        StringBuilder sb = new StringBuilder();
        sb.append(C4783y0.m16651k());
        sb.append(this.f11597e);
        File file = new File(sb.toString());
        File file2 = new File(C4783y0.m16651k(), this.f11597e);
        if (file.exists() && !file2.exists()) {
            try {
                if (!file.renameTo(file2)) {
                    C4783y0.m16640c("Analytics - Unable to migrate old hits db, creating new hits db (move file returned false)", new Object[0]);
                }
            } catch (Exception e) {
                C4783y0.m16640c("Analytics - Unable to migrate old hits db, creating new hits db (%s)", e.getLocalizedMessage());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo15962f() {
        try {
            this.f11696o = this.f11593a.compileStatement("INSERT INTO HITS (URL, TIMESTAMP) VALUES (?, ?)");
        } catch (NullPointerException e) {
            C4783y0.m16636b("Analytics - Unable to create database due to an invalid path (%s)", e.getLocalizedMessage());
        } catch (SQLException e2) {
            C4783y0.m16636b("Analytics - Unable to create database due to a sql error (%s)", e2.getLocalizedMessage());
        } catch (Exception e3) {
            C4783y0.m16636b("Analytics - Unable to create database due to an unexpected error (%s)", e3.getLocalizedMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final Runnable mo15989j() {
        return new C4690a();
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r5v0, types: [g.a.a.b$a] */
    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: type inference failed for: r1v4, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r4v7, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r5v10 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: type inference failed for: r5v12 */
    /* JADX WARNING: type inference failed for: r5v13, types: [g.a.a.b$a] */
    /* JADX WARNING: type inference failed for: r13v2 */
    /* JADX WARNING: type inference failed for: r1v13 */
    /* JADX WARNING: type inference failed for: r13v3 */
    /* JADX WARNING: type inference failed for: r1v15 */
    /* JADX WARNING: type inference failed for: r1v19 */
    /* JADX WARNING: type inference failed for: r1v20 */
    /* JADX WARNING: type inference failed for: r1v21 */
    /* JADX WARNING: type inference failed for: r1v22 */
    /* JADX WARNING: type inference failed for: r1v23 */
    /* JADX WARNING: type inference failed for: r5v14 */
    /* JADX WARNING: type inference failed for: r1v24 */
    /* JADX WARNING: type inference failed for: r1v25 */
    /* JADX WARNING: type inference failed for: r1v26 */
    /* JADX WARNING: type inference failed for: r5v15 */
    /* JADX WARNING: type inference failed for: r5v16 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0040, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        r13 = r4;
        r4 = r1;
        r1 = r13;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0046, code lost:
        r13 = r4;
        r4 = r1;
        r1 = r13;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0051, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
        r2 = r1;
        r1 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0072, code lost:
        if (r1 == 0) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r1.close();
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0087, code lost:
        if (r1 == 0) goto L_0x008a;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r5v3
      assigns: []
      uses: []
      mth insns count: 82
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
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0051 A[ExcHandler: all (r1v9 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:5:0x0020] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008e  */
    /* JADX WARNING: Unknown variable types count: 12 */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p163g.p164a.p165a.C4653b.C4654a mo16028k() {
        /*
            r14 = this;
            java.lang.Object r0 = r14.f11596d
            monitor-enter(r0)
            r1 = 0
            r2 = 0
            r3 = 1
            android.database.sqlite.SQLiteDatabase r4 = r14.f11593a     // Catch:{ SQLException -> 0x0078, Exception -> 0x0063 }
            java.lang.String r5 = "HITS"
            java.lang.String r6 = "ID"
            java.lang.String r7 = "URL"
            java.lang.String r8 = "TIMESTAMP"
            java.lang.String[] r6 = new java.lang.String[]{r6, r7, r8}     // Catch:{ SQLException -> 0x0078, Exception -> 0x0063 }
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            java.lang.String r11 = "ID ASC"
            java.lang.String r12 = "1"
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ SQLException -> 0x0078, Exception -> 0x0063 }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLException -> 0x005b, Exception -> 0x0055, all -> 0x0051 }
            if (r5 == 0) goto L_0x004a
            g.a.a.b$a r5 = new g.a.a.b$a     // Catch:{ SQLException -> 0x005b, Exception -> 0x0055, all -> 0x0051 }
            r5.<init>()     // Catch:{ SQLException -> 0x005b, Exception -> 0x0055, all -> 0x0051 }
            java.lang.String r1 = r4.getString(r2)     // Catch:{ SQLException -> 0x0045, Exception -> 0x0040, all -> 0x0051 }
            r5.f11625b = r1     // Catch:{ SQLException -> 0x0045, Exception -> 0x0040, all -> 0x0051 }
            java.lang.String r1 = r4.getString(r3)     // Catch:{ SQLException -> 0x0045, Exception -> 0x0040, all -> 0x0051 }
            r5.f11624a = r1     // Catch:{ SQLException -> 0x0045, Exception -> 0x0040, all -> 0x0051 }
            r1 = 2
            long r6 = r4.getLong(r1)     // Catch:{ SQLException -> 0x0045, Exception -> 0x0040, all -> 0x0051 }
            r5.f11626c = r6     // Catch:{ SQLException -> 0x0045, Exception -> 0x0040, all -> 0x0051 }
            r1 = r5
            goto L_0x004a
        L_0x0040:
            r1 = move-exception
            r13 = r4
            r4 = r1
            r1 = r13
            goto L_0x0065
        L_0x0045:
            r1 = move-exception
            r13 = r4
            r4 = r1
            r1 = r13
            goto L_0x007a
        L_0x004a:
            if (r4 == 0) goto L_0x004f
            r4.close()     // Catch:{ all -> 0x0092 }
        L_0x004f:
            r5 = r1
            goto L_0x008a
        L_0x0051:
            r1 = move-exception
            r2 = r1
            r1 = r4
            goto L_0x008c
        L_0x0055:
            r5 = move-exception
            r13 = r5
            r5 = r1
            r1 = r4
            r4 = r13
            goto L_0x0065
        L_0x005b:
            r5 = move-exception
            r13 = r5
            r5 = r1
            r1 = r4
            r4 = r13
            goto L_0x007a
        L_0x0061:
            r2 = move-exception
            goto L_0x008c
        L_0x0063:
            r4 = move-exception
            r5 = r1
        L_0x0065:
            java.lang.String r6 = "Analytics - Unknown error reading from database (%s)"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0061 }
            java.lang.String r4 = r4.getMessage()     // Catch:{ all -> 0x0061 }
            r3[r2] = r4     // Catch:{ all -> 0x0061 }
            p163g.p164a.p165a.C4783y0.m16636b(r6, r3)     // Catch:{ all -> 0x0061 }
            if (r1 == 0) goto L_0x008a
        L_0x0074:
            r1.close()     // Catch:{ all -> 0x0092 }
            goto L_0x008a
        L_0x0078:
            r4 = move-exception
            r5 = r1
        L_0x007a:
            java.lang.String r6 = "Analytics - Unable to read from database (%s)"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0061 }
            java.lang.String r4 = r4.getMessage()     // Catch:{ all -> 0x0061 }
            r3[r2] = r4     // Catch:{ all -> 0x0061 }
            p163g.p164a.p165a.C4783y0.m16636b(r6, r3)     // Catch:{ all -> 0x0061 }
            if (r1 == 0) goto L_0x008a
            goto L_0x0074
        L_0x008a:
            monitor-exit(r0)     // Catch:{ all -> 0x0092 }
            return r5
        L_0x008c:
            if (r1 == 0) goto L_0x0091
            r1.close()     // Catch:{ all -> 0x0092 }
        L_0x0091:
            throw r2     // Catch:{ all -> 0x0092 }
        L_0x0092:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0092 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p164a.p165a.C4689j.mo16028k():g.a.a.b$a");
    }
}
