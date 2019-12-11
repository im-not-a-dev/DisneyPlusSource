package kotlinx.coroutines;

import kotlin.C12898l;
import kotlin.jvm.functions.Function2;
import kotlin.p573a0.C12683c;
import kotlin.p573a0.C12687e;
import kotlinx.coroutines.p593k2.C13327a;
import kotlinx.coroutines.p593k2.C13328b;

/* renamed from: kotlinx.coroutines.h0 */
/* compiled from: CoroutineStart.kt */
public enum C13246h0 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* renamed from: a */
    public final <R, T> void mo34387a(Function2<? super R, ? super C12683c<? super T>, ? extends Object> function2, R r, C12683c<? super T> cVar) {
        int i = C13241g0.$EnumSwitchMapping$1[ordinal()];
        if (i == 1) {
            C13327a.m40952a(function2, r, cVar);
        } else if (i == 2) {
            C12687e.m39806a(function2, r, cVar);
        } else if (i == 3) {
            C13328b.m40954a(function2, r, cVar);
        } else if (i != 4) {
            throw new C12898l();
        }
    }

    /* renamed from: a */
    public final boolean mo34388a() {
        return this == LAZY;
    }
}
