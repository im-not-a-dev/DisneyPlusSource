package p163g.p449j.p450a.p451a.p457d.p464g;

/* renamed from: g.j.a.a.d.g.v3 */
final class C11343v3 {

    /* renamed from: a */
    private static final C11314t3<?> f26577a = new C11300s3();

    /* renamed from: b */
    private static final C11314t3<?> f26578b = m36541a();

    /* renamed from: a */
    private static C11314t3<?> m36541a() {
        try {
            return (C11314t3) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    static C11314t3<?> m36542b() {
        return f26577a;
    }

    /* renamed from: c */
    static C11314t3<?> m36543c() {
        C11314t3<?> t3Var = f26578b;
        if (t3Var != null) {
            return t3Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
