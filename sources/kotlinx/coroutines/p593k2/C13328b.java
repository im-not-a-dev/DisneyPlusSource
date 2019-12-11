package kotlinx.coroutines.p593k2;

import kotlin.C12900n;
import kotlin.C12900n.C12901a;
import kotlin.C12903o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12865c0;
import kotlin.p573a0.C12683c;
import kotlin.p573a0.C12688f;
import kotlin.p573a0.p575i.p576a.C12708h;
import kotlinx.coroutines.C13210a;
import kotlinx.coroutines.C13389r;
import kotlinx.coroutines.C13397s1;
import kotlinx.coroutines.internal.C13277o;
import kotlinx.coroutines.internal.C13283u;

/* renamed from: kotlinx.coroutines.k2.b */
/* compiled from: Undispatched.kt */
public final class C13328b {
    /* renamed from: a */
    public static final <T, R> Object m40953a(C13210a<? super T> aVar, R r, Function2<? super R, ? super C12683c<? super T>, ? extends Object> function2) {
        Object obj;
        aVar.mo34338s();
        try {
            C12865c0.m40197a((Object) function2, 2);
            obj = function2.invoke(r, aVar);
        } catch (Throwable th) {
            obj = new C13389r(th, false, 2, null);
        }
        if (obj == C12700d.m39820a()) {
            return C12700d.m39820a();
        }
        if (!aVar.mo34588b(obj, 4)) {
            return C12700d.m39820a();
        }
        Object l = aVar.mo34596l();
        if (!(l instanceof C13389r)) {
            return C13397s1.m41221b(l);
        }
        throw C13277o.m40807a(aVar, ((C13389r) l).f29880a);
    }

    /* renamed from: a */
    public static final <R, T> void m40954a(Function2<? super R, ? super C12683c<? super T>, ? extends Object> function2, R r, C12683c<? super T> cVar) {
        C12688f b;
        Object b2;
        C12708h.m39845a(cVar);
        try {
            b = cVar.mo31038b();
            b2 = C13283u.m40837b(b, null);
            C12865c0.m40197a((Object) function2, 2);
            Object invoke = function2.invoke(r, cVar);
            C13283u.m40836a(b, b2);
            if (invoke != C12700d.m39820a()) {
                C12901a aVar = C12900n.f29540c;
                C12900n.m40236a(invoke);
                cVar.mo31039b(invoke);
            }
        } catch (Throwable th) {
            C12901a aVar2 = C12900n.f29540c;
            Object a = C12903o.m40240a(th);
            C12900n.m40236a(a);
            cVar.mo31039b(a);
        }
    }
}
