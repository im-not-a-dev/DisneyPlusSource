package kotlin.p573a0;

import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001:\u0002\u0011\u0012J5\u0010\u0002\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u00032\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H\u00030\u0006H&¢\u0006\u0002\u0010\bJ(\u0010\t\u001a\u0004\u0018\u0001H\n\"\b\b\u0000\u0010\n*\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\fH¦\u0002¢\u0006\u0002\u0010\rJ\u0014\u0010\u000e\u001a\u00020\u00002\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH&J\u0011\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0002¨\u0006\u0013"}, mo31007d2 = {"Lkotlin/coroutines/CoroutineContext;", "", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext$Element;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", "E", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "minusKey", "plus", "context", "Element", "Key", "kotlin-stdlib"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: kotlin.a0.f */
/* compiled from: CoroutineContext.kt */
public interface C12688f {

    /* renamed from: kotlin.a0.f$a */
    /* compiled from: CoroutineContext.kt */
    public static final class C12689a {

        /* renamed from: kotlin.a0.f$a$a */
        /* compiled from: CoroutineContext.kt */
        static final class C12690a extends C12881k implements Function2<C12688f, C12691b, C12688f> {

            /* renamed from: c */
            public static final C12690a f29382c = new C12690a();

            C12690a() {
                super(2);
            }

            /* renamed from: a */
            public final C12688f invoke(C12688f fVar, C12691b bVar) {
                C12688f minusKey = fVar.minusKey(bVar.getKey());
                if (minusKey == C12694g.f29383c) {
                    return bVar;
                }
                C12684d dVar = (C12684d) minusKey.get(C12684d.f29380b);
                if (dVar == null) {
                    return new C12681b(minusKey, bVar);
                }
                C12688f minusKey2 = minusKey.minusKey(C12684d.f29380b);
                if (minusKey2 == C12694g.f29383c) {
                    return new C12681b(bVar, dVar);
                }
                return new C12681b(new C12681b(minusKey2, bVar), dVar);
            }
        }

        /* renamed from: a */
        public static C12688f m39807a(C12688f fVar, C12688f fVar2) {
            return fVar2 == C12694g.f29383c ? fVar : (C12688f) fVar2.fold(fVar, C12690a.f29382c);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J5\u0010\u0006\u001a\u0002H\u0007\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u0002H\u00072\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u0002H\u00070\nH\u0016¢\u0006\u0002\u0010\u000bJ(\u0010\f\u001a\u0004\u0018\u0001H\r\"\b\b\u0000\u0010\r*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\r0\u0003H\u0002¢\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016R\u0016\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0010"}, mo31007d2 = {"Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext;", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", "E", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "minusKey", "kotlin-stdlib"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* renamed from: kotlin.a0.f$b */
    /* compiled from: CoroutineContext.kt */
    public interface C12691b extends C12688f {

        /* renamed from: kotlin.a0.f$b$a */
        /* compiled from: CoroutineContext.kt */
        public static final class C12692a {
            /* renamed from: a */
            public static <E extends C12691b> E m39810a(C12691b bVar, C12693c<E> cVar) {
                if (!Intrinsics.areEqual((Object) bVar.getKey(), (Object) cVar)) {
                    return null;
                }
                if (bVar != null) {
                    return bVar;
                }
                throw new C13142s("null cannot be cast to non-null type E");
            }

            /* renamed from: a */
            public static C12688f m39811a(C12691b bVar, C12688f fVar) {
                return C12689a.m39807a(bVar, fVar);
            }

            /* renamed from: b */
            public static C12688f m39812b(C12691b bVar, C12693c<?> cVar) {
                return Intrinsics.areEqual((Object) bVar.getKey(), (Object) cVar) ? C12694g.f29383c : bVar;
            }

            /* renamed from: a */
            public static <R> R m39809a(C12691b bVar, R r, Function2<? super R, ? super C12691b, ? extends R> function2) {
                return function2.invoke(r, bVar);
            }
        }

        <E extends C12691b> E get(C12693c<E> cVar);

        C12693c<?> getKey();
    }

    /* renamed from: kotlin.a0.f$c */
    /* compiled from: CoroutineContext.kt */
    public interface C12693c<E extends C12691b> {
    }

    <R> R fold(R r, Function2<? super R, ? super C12691b, ? extends R> function2);

    <E extends C12691b> E get(C12693c<E> cVar);

    C12688f minusKey(C12693c<?> cVar);

    C12688f plus(C12688f fVar);
}
