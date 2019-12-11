package p163g.p449j.p450a.p451a.p457d.p463f;

/* renamed from: g.j.a.a.d.f.m */
/* compiled from: com.google.firebase:firebase-iid@@19.0.1 */
public final class C11014m {

    /* renamed from: a */
    private static final C11013l f26035a;

    /* renamed from: g.j.a.a.d.f.m$a */
    /* compiled from: com.google.firebase:firebase-iid@@19.0.1 */
    static final class C11015a extends C11013l {
        C11015a() {
        }

        /* renamed from: a */
        public final void mo28244a(Throwable th, Throwable th2) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    static {
        /*
            java.lang.Integer r0 = m34727a()     // Catch:{ all -> 0x002c }
            if (r0 == 0) goto L_0x0014
            int r1 = r0.intValue()     // Catch:{ all -> 0x002a }
            r2 = 19
            if (r1 < r2) goto L_0x0014
            g.j.a.a.d.f.q r1 = new g.j.a.a.d.f.q     // Catch:{ all -> 0x002a }
            r1.<init>()     // Catch:{ all -> 0x002a }
            goto L_0x0063
        L_0x0014:
            java.lang.String r1 = "com.google.devtools.build.android.desugar.runtime.twr_disable_mimic"
            boolean r1 = java.lang.Boolean.getBoolean(r1)     // Catch:{ all -> 0x002a }
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x0024
            g.j.a.a.d.f.p r1 = new g.j.a.a.d.f.p     // Catch:{ all -> 0x002a }
            r1.<init>()     // Catch:{ all -> 0x002a }
            goto L_0x0063
        L_0x0024:
            g.j.a.a.d.f.m$a r1 = new g.j.a.a.d.f.m$a     // Catch:{ all -> 0x002a }
            r1.<init>()     // Catch:{ all -> 0x002a }
            goto L_0x0063
        L_0x002a:
            r1 = move-exception
            goto L_0x002e
        L_0x002c:
            r1 = move-exception
            r0 = 0
        L_0x002e:
            java.io.PrintStream r2 = java.lang.System.err
            java.lang.Class<g.j.a.a.d.f.m$a> r3 = p163g.p449j.p450a.p451a.p457d.p463f.C11014m.C11015a.class
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = java.lang.String.valueOf(r3)
            int r4 = r4.length()
            int r4 = r4 + 133
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy "
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = "will be used. The error is: "
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r2.println(r3)
            java.io.PrintStream r2 = java.lang.System.err
            r1.printStackTrace(r2)
            g.j.a.a.d.f.m$a r1 = new g.j.a.a.d.f.m$a
            r1.<init>()
        L_0x0063:
            f26035a = r1
            if (r0 != 0) goto L_0x0068
            goto L_0x006b
        L_0x0068:
            r0.intValue()
        L_0x006b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p449j.p450a.p451a.p457d.p463f.C11014m.<clinit>():void");
    }

    /* renamed from: a */
    public static void m34728a(Throwable th, Throwable th2) {
        f26035a.mo28244a(th, th2);
    }

    /* renamed from: a */
    private static Integer m34727a() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(System.err);
            return null;
        }
    }
}
