package kotlin;

import kotlin.jvm.functions.Function0;

/* renamed from: kotlin.i */
/* compiled from: LazyJVM.kt */
class C12763i {
    /* renamed from: a */
    public static <T> Lazy<T> m39921a(Function0<? extends T> function0) {
        return new C12906q(function0, null, 2, null);
    }

    /* renamed from: a */
    public static <T> Lazy<T> m39922a(C12897k kVar, Function0<? extends T> function0) {
        int i = C12743g.$EnumSwitchMapping$0[kVar.ordinal()];
        if (i == 1) {
            return new C12906q(function0, null, 2, null);
        }
        if (i == 2) {
            return new C12904p(function0);
        }
        if (i == 3) {
            return new C13146w(function0);
        }
        throw new C12898l();
    }
}
