package p163g.p449j.p450a.p451a.p457d.p464g;

import p163g.p449j.p450a.p451a.p457d.p464g.C11090e4.C11094d;

/* renamed from: g.j.a.a.d.g.c5 */
final class C11056c5 implements C11141h6 {

    /* renamed from: b */
    private static final C11217m5 f26099b = new C11112f5();

    /* renamed from: a */
    private final C11217m5 f26100a;

    public C11056c5() {
        this(new C11096e5(C11055c4.m34835a(), m34838a()));
    }

    /* renamed from: a */
    public final <T> C11077d6<T> mo28344a(Class<T> cls) {
        Class<C11090e4> cls2 = C11090e4.class;
        C11113f6.m35174a(cls);
        C11231n5 b = this.f26100a.mo28343b(cls);
        if (b.mo28317b()) {
            if (cls2.isAssignableFrom(cls)) {
                return C11331u5.m36427a(C11113f6.m35186c(), C11343v3.m36542b(), b.mo28316a());
            }
            return C11331u5.m36427a(C11113f6.m35164a(), C11343v3.m36543c(), b.mo28316a());
        } else if (cls2.isAssignableFrom(cls)) {
            if (m34839a(b)) {
                return C11302s5.m36084a(cls, b, C11386y5.m36763b(), C11398z4.m36834b(), C11113f6.m35186c(), C11343v3.m36542b(), C11182k5.m35471b());
            }
            return C11302s5.m36084a(cls, b, C11386y5.m36763b(), C11398z4.m36834b(), C11113f6.m35186c(), null, C11182k5.m35471b());
        } else if (m34839a(b)) {
            return C11302s5.m36084a(cls, b, C11386y5.m36762a(), C11398z4.m36833a(), C11113f6.m35164a(), C11343v3.m36543c(), C11182k5.m35470a());
        } else {
            return C11302s5.m36084a(cls, b, C11386y5.m36762a(), C11398z4.m36833a(), C11113f6.m35180b(), null, C11182k5.m35470a());
        }
    }

    private C11056c5(C11217m5 m5Var) {
        C11111f4.m35153a(m5Var, "messageInfoFactory");
        this.f26100a = m5Var;
    }

    /* renamed from: a */
    private static boolean m34839a(C11231n5 n5Var) {
        return n5Var.mo28318c() == C11094d.f26170i;
    }

    /* renamed from: a */
    private static C11217m5 m34838a() {
        try {
            return (C11217m5) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f26099b;
        }
    }
}
