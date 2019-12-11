package p163g.p449j.p450a.p451a.p457d.p464g;

/* renamed from: g.j.a.a.d.g.p3 */
final class C11257p3 {

    /* renamed from: a */
    private static final Class<?> f26432a = m35927a();

    /* renamed from: a */
    private static Class<?> m35927a() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static C11285r3 m35928b() {
        if (f26432a != null) {
            try {
                return m35926a("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return C11285r3.f26462d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0014  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x000e  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static p163g.p449j.p450a.p451a.p457d.p464g.C11285r3 m35929c() {
        /*
            java.lang.Class<?> r0 = f26432a
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = "loadGeneratedRegistry"
            g.j.a.a.d.g.r3 r0 = m35926a(r0)     // Catch:{ Exception -> 0x000b }
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            if (r0 != 0) goto L_0x0012
            g.j.a.a.d.g.r3 r0 = p163g.p449j.p450a.p451a.p457d.p464g.C11285r3.m36041a()
        L_0x0012:
            if (r0 != 0) goto L_0x0018
            g.j.a.a.d.g.r3 r0 = m35928b()
        L_0x0018:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p449j.p450a.p451a.p457d.p464g.C11257p3.m35929c():g.j.a.a.d.g.r3");
    }

    /* renamed from: a */
    private static final C11285r3 m35926a(String str) throws Exception {
        return (C11285r3) f26432a.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
    }
}
