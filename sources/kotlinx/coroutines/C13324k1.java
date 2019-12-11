package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.p573a0.C12688f;
import kotlin.p573a0.C12688f.C12691b;
import kotlin.p573a0.C12688f.C12691b.C12692a;
import kotlin.p573a0.C12688f.C12693c;
import kotlinx.coroutines.CoroutineExceptionHandler.C13209a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000 (2\u00020\u0001:\u0001(J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H'J\b\u0010\u0013\u001a\u00020\u0014H\u0017J\u0014\u0010\u0013\u001a\u00020\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016H'J\u001a\u0010\u0013\u001a\u00020\u00142\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u0018H&J\f\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018H'JE\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00072'\u0010\u001e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00140\u001fj\u0002`\"H'J1\u0010\u001a\u001a\u00020\u001b2'\u0010\u001e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00140\u001fj\u0002`\"H&J\u0011\u0010#\u001a\u00020\u0014H¦@ø\u0001\u0000¢\u0006\u0002\u0010$J\u0011\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0000H\u0002J\b\u0010'\u001a\u00020\u0007H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u0012\u0010\t\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\bR\u0012\u0010\n\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0012\u0010\u000b\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, mo31007d2 = {"Lkotlinx/coroutines/Job;", "Lkotlin/coroutines/CoroutineContext$Element;", "children", "Lkotlin/sequences/Sequence;", "getChildren", "()Lkotlin/sequences/Sequence;", "isActive", "", "()Z", "isCancelled", "isCompleted", "onJoin", "Lkotlinx/coroutines/selects/SelectClause0;", "getOnJoin", "()Lkotlinx/coroutines/selects/SelectClause0;", "attachChild", "Lkotlinx/coroutines/ChildHandle;", "child", "Lkotlinx/coroutines/ChildJob;", "cancel", "", "cause", "", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "getCancellationException", "invokeOnCompletion", "Lkotlinx/coroutines/DisposableHandle;", "onCancelling", "invokeImmediately", "handler", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "join", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "plus", "other", "start", "Key", "kotlinx-coroutines-core"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: kotlinx.coroutines.k1 */
/* compiled from: Job.kt */
public interface C13324k1 extends C12691b {

    /* renamed from: e */
    public static final C13326b f29761e = C13326b.f29762a;

    /* renamed from: kotlinx.coroutines.k1$a */
    /* compiled from: Job.kt */
    public static final class C13325a {
        /* renamed from: a */
        public static <R> R m40945a(C13324k1 k1Var, R r, Function2<? super R, ? super C12691b, ? extends R> function2) {
            return C12692a.m39809a(k1Var, r, function2);
        }

        /* renamed from: a */
        public static <E extends C12691b> E m40946a(C13324k1 k1Var, C12693c<E> cVar) {
            return C12692a.m39810a((C12691b) k1Var, cVar);
        }

        /* renamed from: a */
        public static C12688f m40947a(C13324k1 k1Var, C12688f fVar) {
            return C12692a.m39811a((C12691b) k1Var, fVar);
        }

        /* renamed from: a */
        public static /* synthetic */ void m40950a(C13324k1 k1Var, CancellationException cancellationException, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    cancellationException = null;
                }
                k1Var.mo34506a(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        /* renamed from: b */
        public static C12688f m40951b(C13324k1 k1Var, C12693c<?> cVar) {
            return C12692a.m39812b(k1Var, cVar);
        }

        /* renamed from: a */
        public static /* synthetic */ C13396s0 m40948a(C13324k1 k1Var, boolean z, boolean z2, Function1 function1, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                if ((i & 2) != 0) {
                    z2 = true;
                }
                return k1Var.mo34505a(z, z2, function1);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }
    }

    /* renamed from: kotlinx.coroutines.k1$b */
    /* compiled from: Job.kt */
    public static final class C13326b implements C12693c<C13324k1> {

        /* renamed from: a */
        static final /* synthetic */ C13326b f29762a = new C13326b();

        static {
            C13209a aVar = CoroutineExceptionHandler.f29643d;
        }

        private C13326b() {
        }
    }

    /* renamed from: a */
    C13342m mo34504a(C13368o oVar);

    /* renamed from: a */
    C13396s0 mo34505a(boolean z, boolean z2, Function1<? super Throwable, C13145v> function1);

    /* renamed from: a */
    void mo34506a(CancellationException cancellationException);

    /* renamed from: a */
    boolean mo34330a();

    /* renamed from: c */
    CancellationException mo34507c();

    /* synthetic */ void cancel();

    boolean start();
}
