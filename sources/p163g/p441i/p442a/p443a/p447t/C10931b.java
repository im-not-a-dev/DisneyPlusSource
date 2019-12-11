package p163g.p441i.p442a.p443a.p447t;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: g.i.a.a.t.b */
/* compiled from: CharsToNameCanonicalizer */
public final class C10931b {

    /* renamed from: g.i.a.a.t.b$a */
    /* compiled from: CharsToNameCanonicalizer */
    static final class C10932a {
    }

    /* renamed from: g.i.a.a.t.b$b */
    /* compiled from: CharsToNameCanonicalizer */
    private static final class C10933b {
        public C10933b(int i, int i2, String[] strArr, C10932a[] aVarArr) {
        }

        /* renamed from: a */
        public static C10933b m34610a(int i) {
            return new C10933b(0, 0, new String[i], new C10932a[(i >> 1)]);
        }
    }

    private C10931b(int i) {
        new AtomicReference(C10933b.m34610a(64));
    }

    /* renamed from: a */
    public static C10931b m34608a() {
        long currentTimeMillis = System.currentTimeMillis();
        return m34609a((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
    }

    /* renamed from: a */
    protected static C10931b m34609a(int i) {
        return new C10931b(i);
    }
}
