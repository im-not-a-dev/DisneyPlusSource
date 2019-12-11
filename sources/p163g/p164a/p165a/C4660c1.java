package p163g.p164a.p165a;

import android.database.SQLException;
import android.database.sqlite.SQLiteStatement;
import android.os.Process;
import java.io.File;
import java.util.HashMap;

/* renamed from: g.a.a.c1 */
/* compiled from: ThirdPartyQueue */
class C4660c1 extends C4653b {

    /* renamed from: p */
    private static final String[] f11638p = {"ID", "URL", "POSTBODY", "POSTTYPE", "TIMESTAMP", "TIMEOUT"};

    /* renamed from: q */
    private static C4660c1 f11639q = null;

    /* renamed from: r */
    private static final Object f11640r = new Object();

    /* renamed from: o */
    private SQLiteStatement f11641o = null;

    /* renamed from: g.a.a.c1$a */
    /* compiled from: ThirdPartyQueue */
    class C4661a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ C4660c1 f11643c;

        C4661a(C4660c1 c1Var) {
            this.f11643c = c1Var;
        }

        public void run() {
            Process.setThreadPriority(10);
            boolean s = C4728p0.m16448H().mo16100s();
            HashMap hashMap = new HashMap();
            hashMap.put("Accept-Language", C4783y0.m16656p());
            hashMap.put("User-Agent", C4783y0.m16658r());
            while (C4728p0.m16448H().mo16101t() == C4758r0.MOBILE_PRIVACY_STATUS_OPT_IN && C4728p0.m16448H().mo16075F()) {
                C4654a n = this.f11643c.mo15998n();
                if (n == null || n.f11624a == null) {
                    break;
                } else if (s || n.f11626c >= C4783y0.m16607E() - 60) {
                    String str = n.f11627d;
                    String str2 = "";
                    if (str == null) {
                        str = str2;
                    }
                    n.f11627d = str;
                    String str3 = n.f11628e;
                    if (str3 == null) {
                        str3 = str2;
                    }
                    n.f11628e = str3;
                    int i = n.f11629f;
                    n.f11629f = i < 2 ? 2000 : i * 1000;
                    if (C4779x0.m16596a(n.f11624a, n.f11627d, hashMap, n.f11629f, n.f11628e, C4660c1.this.f11598f)) {
                        try {
                            this.f11643c.mo15984a(n.f11625b);
                            this.f11643c.f11617h = n.f11626c;
                        } catch (C4645a e) {
                            this.f11643c.mo15957a((Exception) e);
                        }
                    } else {
                        C4783y0.m16640c("%s - Unable to forward hit (%s)", C4660c1.this.f11598f, n.f11624a);
                        if (C4728p0.m16448H().mo16100s()) {
                            C4783y0.m16630a("%s - Network error, imposing internal cooldown (%d seconds)", C4660c1.this.f11598f, Long.valueOf(30));
                            int i2 = 0;
                            while (((long) i2) < 30) {
                                try {
                                    if (!C4728p0.m16448H().mo16075F()) {
                                        break;
                                    }
                                    Thread.sleep(1000);
                                    i2++;
                                } catch (Exception e2) {
                                    C4783y0.m16640c("%s - Background Thread Interrupted (%s)", C4660c1.this.f11598f, e2.getMessage());
                                }
                            }
                        } else {
                            try {
                                this.f11643c.mo15984a(n.f11625b);
                            } catch (C4645a e3) {
                                this.f11643c.mo15957a((Exception) e3);
                            }
                        }
                    }
                } else {
                    try {
                        this.f11643c.mo15984a(n.f11625b);
                    } catch (C4645a e4) {
                        this.f11643c.mo15957a((Exception) e4);
                    }
                }
            }
            this.f11643c.f11619j = false;
        }
    }

    protected C4660c1() {
        mo15956a(new File(C4783y0.m16651k(), this.f11597e));
        this.f11616g = mo15988i();
    }

    /* renamed from: o */
    protected static C4660c1 m16235o() {
        C4660c1 c1Var;
        synchronized (f11640r) {
            if (f11639q == null) {
                f11639q = new C4660c1();
            }
            c1Var = f11639q;
        }
        return c1Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15994a(String str, String str2, String str3, long j, long j2) {
        C4728p0 H = C4728p0.m16448H();
        if (H == null) {
            C4783y0.m16636b("%s - Cannot send hit, MobileConfig is null (this really shouldn't happen)", this.f11598f);
        } else if (H.mo16101t() == C4758r0.MOBILE_PRIVACY_STATUS_OPT_OUT) {
            C4783y0.m16630a("%s - Ignoring hit due to privacy status being opted out", this.f11598f);
        } else {
            synchronized (this.f11596d) {
                try {
                    this.f11641o.bindString(1, str);
                    if (str2 == null || str2.length() <= 0) {
                        this.f11641o.bindNull(2);
                    } else {
                        this.f11641o.bindString(2, str2);
                    }
                    if (str3 == null || str3.length() <= 0) {
                        this.f11641o.bindNull(3);
                    } else {
                        this.f11641o.bindString(3, str3);
                    }
                    this.f11641o.bindLong(4, j);
                    this.f11641o.bindLong(5, j2);
                    this.f11641o.execute();
                    this.f11616g++;
                    this.f11641o.clearBindings();
                } catch (SQLException e) {
                    C4783y0.m16636b("%s - Unable to insert url (%s)", this.f11598f, str);
                    mo15957a((Exception) e);
                } catch (Exception e2) {
                    C4783y0.m16636b("%s - Unknown error while inserting url (%s)", this.f11598f, str);
                    mo15957a(e2);
                }
            }
            mo15985a(false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo15962f() {
        try {
            this.f11641o = this.f11593a.compileStatement("INSERT INTO HITS (URL, POSTBODY, POSTTYPE, TIMESTAMP, TIMEOUT) VALUES (?, ?, ?, ?, ?)");
        } catch (NullPointerException e) {
            C4783y0.m16636b("%s - Unable to create database due to an invalid path (%s)", this.f11598f, e.getLocalizedMessage());
        } catch (SQLException e2) {
            C4783y0.m16636b("%s - Unable to create database due to a sql error (%s)", this.f11598f, e2.getLocalizedMessage());
        } catch (Exception e3) {
            C4783y0.m16636b("%s - Unable to create database due to an unexpected error (%s)", this.f11598f, e3.getLocalizedMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public Runnable mo15989j() {
        return new C4661a(mo15996l());
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public String mo15995k() {
        return "ADBMobile3rdPartyDataCache.sqlite";
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C4660c1 mo15996l() {
        return m16235o();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public String mo15997m() {
        return "External Callback";
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007b, code lost:
        if (r5 == null) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0096, code lost:
        if (r5 == null) goto L_0x0099;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x009e A[Catch:{ all -> 0x009b }] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p163g.p164a.p165a.C4653b.C4654a mo15998n() {
        /*
            r15 = this;
            java.lang.Object r0 = r15.f11596d
            monitor-enter(r0)
            r1 = 0
            r2 = 1
            r3 = 0
            r4 = 2
            android.database.sqlite.SQLiteDatabase r5 = r15.f11593a     // Catch:{ SQLException -> 0x0081, Exception -> 0x0066, all -> 0x0062 }
            java.lang.String r6 = "HITS"
            java.lang.String[] r7 = f11638p     // Catch:{ SQLException -> 0x0081, Exception -> 0x0066, all -> 0x0062 }
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            java.lang.String r12 = "ID ASC"
            java.lang.String r13 = "1"
            android.database.Cursor r5 = r5.query(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ SQLException -> 0x0081, Exception -> 0x0066, all -> 0x0062 }
            boolean r6 = r5.moveToFirst()     // Catch:{ SQLException -> 0x005d, Exception -> 0x0058 }
            if (r6 == 0) goto L_0x0051
            g.a.a.b$a r6 = new g.a.a.b$a     // Catch:{ SQLException -> 0x005d, Exception -> 0x0058 }
            r6.<init>()     // Catch:{ SQLException -> 0x005d, Exception -> 0x0058 }
            java.lang.String r1 = r5.getString(r3)     // Catch:{ SQLException -> 0x004f, Exception -> 0x004d }
            r6.f11625b = r1     // Catch:{ SQLException -> 0x004f, Exception -> 0x004d }
            java.lang.String r1 = r5.getString(r2)     // Catch:{ SQLException -> 0x004f, Exception -> 0x004d }
            r6.f11624a = r1     // Catch:{ SQLException -> 0x004f, Exception -> 0x004d }
            java.lang.String r1 = r5.getString(r4)     // Catch:{ SQLException -> 0x004f, Exception -> 0x004d }
            r6.f11627d = r1     // Catch:{ SQLException -> 0x004f, Exception -> 0x004d }
            r1 = 3
            java.lang.String r1 = r5.getString(r1)     // Catch:{ SQLException -> 0x004f, Exception -> 0x004d }
            r6.f11628e = r1     // Catch:{ SQLException -> 0x004f, Exception -> 0x004d }
            r1 = 4
            long r7 = r5.getLong(r1)     // Catch:{ SQLException -> 0x004f, Exception -> 0x004d }
            r6.f11626c = r7     // Catch:{ SQLException -> 0x004f, Exception -> 0x004d }
            r1 = 5
            int r1 = r5.getInt(r1)     // Catch:{ SQLException -> 0x004f, Exception -> 0x004d }
            r6.f11629f = r1     // Catch:{ SQLException -> 0x004f, Exception -> 0x004d }
            r1 = r6
            goto L_0x0051
        L_0x004d:
            r1 = move-exception
            goto L_0x006a
        L_0x004f:
            r1 = move-exception
            goto L_0x0085
        L_0x0051:
            if (r5 == 0) goto L_0x0056
            r5.close()     // Catch:{ all -> 0x00a2 }
        L_0x0056:
            r6 = r1
            goto L_0x0099
        L_0x0058:
            r6 = move-exception
            r14 = r6
            r6 = r1
            r1 = r14
            goto L_0x006a
        L_0x005d:
            r6 = move-exception
            r14 = r6
            r6 = r1
            r1 = r14
            goto L_0x0085
        L_0x0062:
            r2 = move-exception
            r5 = r1
            r1 = r2
            goto L_0x009c
        L_0x0066:
            r5 = move-exception
            r6 = r1
            r1 = r5
            r5 = r6
        L_0x006a:
            java.lang.String r7 = "%s - Unknown error reading from database (%s)"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x009b }
            java.lang.String r8 = r15.f11598f     // Catch:{ all -> 0x009b }
            r4[r3] = r8     // Catch:{ all -> 0x009b }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x009b }
            r4[r2] = r1     // Catch:{ all -> 0x009b }
            p163g.p164a.p165a.C4783y0.m16636b(r7, r4)     // Catch:{ all -> 0x009b }
            if (r5 == 0) goto L_0x0099
        L_0x007d:
            r5.close()     // Catch:{ all -> 0x00a2 }
            goto L_0x0099
        L_0x0081:
            r5 = move-exception
            r6 = r1
            r1 = r5
            r5 = r6
        L_0x0085:
            java.lang.String r7 = "%s - Unable to read from database (%s)"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x009b }
            java.lang.String r8 = r15.f11598f     // Catch:{ all -> 0x009b }
            r4[r3] = r8     // Catch:{ all -> 0x009b }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x009b }
            r4[r2] = r1     // Catch:{ all -> 0x009b }
            p163g.p164a.p165a.C4783y0.m16636b(r7, r4)     // Catch:{ all -> 0x009b }
            if (r5 == 0) goto L_0x0099
            goto L_0x007d
        L_0x0099:
            monitor-exit(r0)     // Catch:{ all -> 0x00a2 }
            return r6
        L_0x009b:
            r1 = move-exception
        L_0x009c:
            if (r5 == 0) goto L_0x00a1
            r5.close()     // Catch:{ all -> 0x00a2 }
        L_0x00a1:
            throw r1     // Catch:{ all -> 0x00a2 }
        L_0x00a2:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a2 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p164a.p165a.C4660c1.mo15998n():g.a.a.b$a");
    }
}
