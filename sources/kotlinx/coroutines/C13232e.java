package kotlinx.coroutines;

import kotlin.C13145v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p573a0.C12683c;
import kotlin.p573a0.C12684d;
import kotlin.p573a0.C12688f;
import kotlin.p573a0.C12694g;
import kotlin.p573a0.p575i.p576a.C12708h;
import kotlinx.coroutines.internal.C13276n;
import kotlinx.coroutines.internal.C13283u;
import kotlinx.coroutines.p593k2.C13327a;
import kotlinx.coroutines.p593k2.C13328b;

/* renamed from: kotlinx.coroutines.e */
/* compiled from: Builders.common.kt */
final /* synthetic */ class C13232e {
    /* renamed from: a */
    public static /* synthetic */ C13324k1 m40677a(C13233e0 e0Var, C12688f fVar, C13246h0 h0Var, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            fVar = C12694g.f29383c;
        }
        if ((i & 2) != 0) {
            h0Var = C13246h0.DEFAULT;
        }
        return C13227d.m40668a(e0Var, fVar, h0Var, function2);
    }

    /* renamed from: a */
    public static final C13324k1 m40676a(C13233e0 e0Var, C12688f fVar, C13246h0 h0Var, Function2<? super C13233e0, ? super C12683c<? super C13145v>, ? extends Object> function2) {
        C13210a aVar;
        C12688f a = C13415y.m41267a(e0Var, fVar);
        if (h0Var.mo34388a()) {
            aVar = new C13400t1(a, function2);
        } else {
            aVar = new C13220b2(a, true);
        }
        aVar.mo34329a(h0Var, aVar, function2);
        return aVar;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static final <T> Object m40675a(C12688f fVar, Function2<? super C13233e0, ? super C12683c<? super T>, ? extends Object> function2, C12683c<? super T> cVar) {
        Object obj;
        C12688f b = cVar.mo31038b();
        C12688f plus = b.plus(fVar);
        C13252i2.m40735a(plus);
        if (plus == b) {
            C13276n nVar = new C13276n(plus, cVar);
            obj = C13328b.m40953a((C13210a<? super T>) nVar, nVar, function2);
        } else if (Intrinsics.areEqual((Object) (C12684d) plus.get(C12684d.f29380b), (Object) (C12684d) b.get(C12684d.f29380b))) {
            C13248h2 h2Var = new C13248h2(plus, cVar);
            Object b2 = C13283u.m40837b(plus, null);
            try {
                Object a = C13328b.m40953a((C13210a<? super T>) h2Var, h2Var, function2);
                C13283u.m40836a(plus, b2);
                obj = a;
            } catch (Throwable th) {
                C13283u.m40836a(plus, b2);
                throw th;
            }
        } else {
            C13369o0 o0Var = new C13369o0(plus, cVar);
            o0Var.mo34338s();
            C13327a.m40952a(function2, o0Var, o0Var);
            obj = o0Var.mo34564u();
        }
        if (obj == C12700d.m39820a()) {
            C12708h.m39847c(cVar);
        }
        return obj;
    }
}
