package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.p573a0.C12688f;
import kotlin.p573a0.C12688f.C12691b;
import kotlin.p573a0.C12688f.C12691b.C12692a;
import kotlin.p573a0.C12688f.C12693c;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0006H&¢\u0006\u0002\u0010\n¨\u0006\u000b"}, mo31007d2 = {"Lkotlinx/coroutines/ThreadContextElement;", "S", "Lkotlin/coroutines/CoroutineContext$Element;", "restoreThreadContext", "", "context", "Lkotlin/coroutines/CoroutineContext;", "oldState", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "updateThreadContext", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: kotlinx.coroutines.c2 */
/* compiled from: ThreadContextElement.kt */
public interface C13225c2<S> extends C12691b {

    /* renamed from: kotlinx.coroutines.c2$a */
    /* compiled from: ThreadContextElement.kt */
    public static final class C13226a {
        /* renamed from: a */
        public static <S, R> R m40663a(C13225c2<S> c2Var, R r, Function2<? super R, ? super C12691b, ? extends R> function2) {
            return C12692a.m39809a(c2Var, r, function2);
        }

        /* renamed from: a */
        public static <S, E extends C12691b> E m40664a(C13225c2<S> c2Var, C12693c<E> cVar) {
            return C12692a.m39810a((C12691b) c2Var, cVar);
        }

        /* renamed from: a */
        public static <S> C12688f m40665a(C13225c2<S> c2Var, C12688f fVar) {
            return C12692a.m39811a((C12691b) c2Var, fVar);
        }

        /* renamed from: b */
        public static <S> C12688f m40666b(C13225c2<S> c2Var, C12693c<?> cVar) {
            return C12692a.m39812b(c2Var, cVar);
        }
    }

    /* renamed from: a */
    S mo34356a(C12688f fVar);

    /* renamed from: a */
    void mo34357a(C12688f fVar, S s);
}
