package kotlin.p573a0.p574h;

import kotlin.C12903o;
import kotlin.TypeCastException;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12865c0;
import kotlin.p573a0.C12683c;
import kotlin.p573a0.C12688f;
import kotlin.p573a0.C12694g;
import kotlin.p573a0.p575i.p576a.C12701a;
import kotlin.p573a0.p575i.p576a.C12704d;
import kotlin.p573a0.p575i.p576a.C12708h;
import kotlin.p573a0.p575i.p576a.C12711j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aF\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u00012\u001c\b\u0004\u0010\u0005\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\b¢\u0006\u0002\b\b\u001aD\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u0003*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\n\u001a]\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u0003*#\b\u0001\u0012\u0004\u0012\u0002H\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\f¢\u0006\u0002\b\r2\u0006\u0010\u000e\u001a\u0002H\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0007\u001aA\u0010\u0011\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0003*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\bø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001aZ\u0010\u0011\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u0003*#\b\u0001\u0012\u0004\u0012\u0002H\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\f¢\u0006\u0002\b\r2\u0006\u0010\u000e\u001a\u0002H\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\bø\u0001\u0000¢\u0006\u0002\u0010\u0013\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, mo31007d2 = {"createCoroutineFromSuspendFunction", "Lkotlin/coroutines/Continuation;", "", "T", "completion", "block", "Lkotlin/Function1;", "", "createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt", "createCoroutineUnintercepted", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "R", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "receiver", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "intercepted", "startCoroutineUninterceptedOrReturn", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlin-stdlib"}, mo31008k = 5, mo31009mv = {1, 1, 15}, mo31011xi = 1, mo31012xs = "kotlin/coroutines/intrinsics/IntrinsicsKt")
/* renamed from: kotlin.a0.h.c */
/* compiled from: IntrinsicsJvm.kt */
class C12697c {

    /* renamed from: kotlin.a0.h.c$a */
    /* compiled from: IntrinsicsJvm.kt */
    public static final class C12698a extends C12711j {

        /* renamed from: U */
        private int f29386U;

        /* renamed from: V */
        final /* synthetic */ Function2 f29387V;

        /* renamed from: W */
        final /* synthetic */ Object f29388W;

        public C12698a(C12683c cVar, C12683c cVar2, Function2 function2, Object obj) {
            this.f29387V = function2;
            this.f29388W = obj;
            super(cVar2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Object mo5580a(Object obj) {
            int i = this.f29386U;
            if (i == 0) {
                this.f29386U = 1;
                C12903o.m40241a(obj);
                Function2 function2 = this.f29387V;
                if (function2 != null) {
                    C12865c0.m40197a((Object) function2, 2);
                    return function2.invoke(this.f29388W, this);
                }
                throw new TypeCastException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
            } else if (i == 1) {
                this.f29386U = 2;
                C12903o.m40241a(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* renamed from: kotlin.a0.h.c$b */
    /* compiled from: IntrinsicsJvm.kt */
    public static final class C12699b extends C12704d {

        /* renamed from: W */
        private int f29389W;

        /* renamed from: X */
        final /* synthetic */ Function2 f29390X;

        /* renamed from: Y */
        final /* synthetic */ Object f29391Y;

        public C12699b(C12683c cVar, C12688f fVar, C12683c cVar2, C12688f fVar2, Function2 function2, Object obj) {
            this.f29390X = function2;
            this.f29391Y = obj;
            super(cVar2, fVar2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Object mo5580a(Object obj) {
            int i = this.f29389W;
            if (i == 0) {
                this.f29389W = 1;
                C12903o.m40241a(obj);
                Function2 function2 = this.f29390X;
                if (function2 != null) {
                    C12865c0.m40197a((Object) function2, 2);
                    return function2.invoke(this.f29391Y, this);
                }
                throw new TypeCastException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
            } else if (i == 1) {
                this.f29389W = 2;
                C12903o.m40241a(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* renamed from: a */
    public static <R, T> C12683c<C13145v> m39817a(Function2<? super R, ? super C12683c<? super T>, ? extends Object> function2, R r, C12683c<? super T> cVar) {
        C12708h.m39845a(cVar);
        if (function2 instanceof C12701a) {
            return ((C12701a) function2).mo5581a(r, cVar);
        }
        C12688f b = cVar.mo31038b();
        String str = "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>";
        if (b == C12694g.f29383c) {
            if (cVar != null) {
                return new C12698a(cVar, cVar, function2, r);
            }
            throw new TypeCastException(str);
        } else if (cVar != null) {
            C12699b bVar = new C12699b(cVar, b, cVar, b, function2, r);
            return bVar;
        } else {
            throw new TypeCastException(str);
        }
    }

    /* renamed from: a */
    public static <T> C12683c<T> m39816a(C12683c<? super T> cVar) {
        C12704d dVar = (C12704d) (!(cVar instanceof C12704d) ? null : cVar);
        if (dVar == null) {
            return cVar;
        }
        C12683c d = dVar.mo31051d();
        return d != null ? d : cVar;
    }
}
