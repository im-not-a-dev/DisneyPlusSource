package p163g.p449j.p450a.p451a.p457d.p464g;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p163g.p449j.p450a.p451a.p457d.p464g.C11090e4.C11095e;

/* renamed from: g.j.a.a.d.g.r3 */
public class C11285r3 {

    /* renamed from: b */
    private static volatile C11285r3 f26460b;

    /* renamed from: c */
    private static volatile C11285r3 f26461c;

    /* renamed from: d */
    static final C11285r3 f26462d = new C11285r3(true);

    /* renamed from: a */
    private final Map<C11286a, C11095e<?, ?>> f26463a;

    /* renamed from: g.j.a.a.d.g.r3$a */
    static final class C11286a {

        /* renamed from: a */
        private final Object f26464a;

        /* renamed from: b */
        private final int f26465b;

        C11286a(Object obj, int i) {
            this.f26464a = obj;
            this.f26465b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C11286a)) {
                return false;
            }
            C11286a aVar = (C11286a) obj;
            if (this.f26464a == aVar.f26464a && this.f26465b == aVar.f26465b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f26464a) * 65535) + this.f26465b;
        }
    }

    static {
        m36042b();
    }

    C11285r3() {
        this.f26463a = new HashMap();
    }

    /* renamed from: a */
    static C11285r3 m36041a() {
        return C11075d4.m34962a(C11285r3.class);
    }

    /* renamed from: b */
    private static Class<?> m36042b() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static C11285r3 m36043c() {
        C11285r3 r3Var = f26460b;
        if (r3Var == null) {
            synchronized (C11285r3.class) {
                r3Var = f26460b;
                if (r3Var == null) {
                    r3Var = C11257p3.m35928b();
                    f26460b = r3Var;
                }
            }
        }
        return r3Var;
    }

    /* renamed from: d */
    public static C11285r3 m36044d() {
        C11285r3 r3Var = f26461c;
        if (r3Var == null) {
            synchronized (C11285r3.class) {
                r3Var = f26461c;
                if (r3Var == null) {
                    r3Var = C11257p3.m35929c();
                    f26461c = r3Var;
                }
            }
        }
        return r3Var;
    }

    /* renamed from: a */
    public final <ContainingType extends C11259p5> C11095e<ContainingType, ?> mo28866a(ContainingType containingtype, int i) {
        return (C11095e) this.f26463a.get(new C11286a(containingtype, i));
    }

    private C11285r3(boolean z) {
        this.f26463a = Collections.emptyMap();
    }
}
