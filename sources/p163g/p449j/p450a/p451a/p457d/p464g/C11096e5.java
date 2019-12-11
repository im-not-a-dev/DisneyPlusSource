package p163g.p449j.p450a.p451a.p457d.p464g;

/* renamed from: g.j.a.a.d.g.e5 */
final class C11096e5 implements C11217m5 {

    /* renamed from: a */
    private C11217m5[] f26174a;

    C11096e5(C11217m5... m5VarArr) {
        this.f26174a = m5VarArr;
    }

    /* renamed from: a */
    public final boolean mo28342a(Class<?> cls) {
        for (C11217m5 a : this.f26174a) {
            if (a.mo28342a(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final C11231n5 mo28343b(Class<?> cls) {
        C11217m5[] m5VarArr;
        for (C11217m5 m5Var : this.f26174a) {
            if (m5Var.mo28342a(cls)) {
                return m5Var.mo28343b(cls);
            }
        }
        String str = "No factory is available for message type: ";
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }
}
