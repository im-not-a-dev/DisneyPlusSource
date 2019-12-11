package kotlinx.coroutines;

import kotlinx.coroutines.internal.C13279q;

/* renamed from: kotlinx.coroutines.s1 */
/* compiled from: JobSupport.kt */
public final class C13397s1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C13279q f29891a = new C13279q("SEALED");
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C13399t0 f29892b = new C13399t0(false);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C13399t0 f29893c = new C13399t0(true);

    /* renamed from: a */
    public static final Object m41219a(Object obj) {
        return obj instanceof C13238f1 ? new C13242g1((C13238f1) obj) : obj;
    }

    /* renamed from: b */
    public static final Object m41221b(Object obj) {
        C13242g1 g1Var = (C13242g1) (!(obj instanceof C13242g1) ? null : obj);
        if (g1Var == null) {
            return obj;
        }
        C13238f1 f1Var = g1Var.f29663a;
        return f1Var != null ? f1Var : obj;
    }
}
