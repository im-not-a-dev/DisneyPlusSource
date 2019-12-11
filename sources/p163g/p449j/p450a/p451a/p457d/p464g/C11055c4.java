package p163g.p449j.p450a.p451a.p457d.p464g;

import p163g.p449j.p450a.p451a.p457d.p464g.C11090e4.C11094d;

/* renamed from: g.j.a.a.d.g.c4 */
final class C11055c4 implements C11217m5 {

    /* renamed from: a */
    private static final C11055c4 f26098a = new C11055c4();

    private C11055c4() {
    }

    /* renamed from: a */
    public static C11055c4 m34835a() {
        return f26098a;
    }

    /* renamed from: b */
    public final C11231n5 mo28343b(Class<?> cls) {
        Class<C11090e4> cls2 = C11090e4.class;
        if (!cls2.isAssignableFrom(cls)) {
            String str = "Unsupported message type: ";
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        try {
            return (C11231n5) C11090e4.m35019a(cls.asSubclass(cls2)).mo28293a(C11094d.f26164c, (Object) null, (Object) null);
        } catch (Exception e) {
            String str2 = "Unable to get message info for ";
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2), e);
        }
    }

    /* renamed from: a */
    public final boolean mo28342a(Class<?> cls) {
        return C11090e4.class.isAssignableFrom(cls);
    }
}
