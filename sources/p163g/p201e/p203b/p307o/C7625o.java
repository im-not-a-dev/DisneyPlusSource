package p163g.p201e.p203b.p307o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.p530x.C11998a;

/* renamed from: g.e.b.o.o */
/* compiled from: ThrowableExt.kt */
public final class C7625o {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final <T extends Throwable> List<T> m22611b(Throwable th, Class<T> cls) {
        if (cls.isAssignableFrom(th.getClass())) {
            if (th != null) {
                return C13183n.m40498a(th);
            }
            throw new TypeCastException("null cannot be cast to non-null type T");
        } else if (th instanceof C11998a) {
            List<Throwable> a = ((C11998a) th).mo30334a();
            Intrinsics.checkReturnedValueIsNotNull((Object) a, "this.exceptions");
            ArrayList arrayList = new ArrayList();
            for (Throwable th2 : a) {
                Intrinsics.checkReturnedValueIsNotNull((Object) th2, "it");
                C13196t.m40545a((Collection) arrayList, (Iterable) m22611b(th2, cls));
            }
            return arrayList;
        } else {
            Throwable cause = th.getCause();
            if (cause != null) {
                List<T> b = m22611b(cause, cls);
                if (b != null) {
                    return b;
                }
            }
            return C13185o.m40513a();
        }
    }
}
