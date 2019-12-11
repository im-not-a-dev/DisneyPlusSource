package kotlin.p573a0;

import kotlin.TypeCastException;
import kotlin.Metadata;
import kotlin.p573a0.C12688f.C12691b;
import kotlin.p573a0.C12688f.C12693c;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ(\u0010\u0002\u001a\u0004\u0018\u0001H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0005H\u0002¢\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\t0\b\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\bH&J\u0014\u0010\u000b\u001a\u00020\f2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0016J\u0014\u0010\r\u001a\u00020\u000e2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¨\u0006\u0010"}, mo31007d2 = {"Lkotlin/coroutines/ContinuationInterceptor;", "Lkotlin/coroutines/CoroutineContext$Element;", "get", "E", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "interceptContinuation", "Lkotlin/coroutines/Continuation;", "T", "continuation", "minusKey", "Lkotlin/coroutines/CoroutineContext;", "releaseInterceptedContinuation", "", "Key", "kotlin-stdlib"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: kotlin.a0.d */
/* compiled from: ContinuationInterceptor.kt */
public interface C12684d extends C12691b {

    /* renamed from: b */
    public static final C12686b f29380b = C12686b.f29381a;

    /* renamed from: kotlin.a0.d$a */
    /* compiled from: ContinuationInterceptor.kt */
    public static final class C12685a {
        /* renamed from: a */
        public static <E extends C12691b> E m39803a(C12684d dVar, C12693c<E> cVar) {
            if (cVar != C12684d.f29380b) {
                return null;
            }
            if (dVar != null) {
                return dVar;
            }
            throw new TypeCastException("null cannot be cast to non-null type E");
        }

        /* renamed from: a */
        public static void m39804a(C12684d dVar, C12683c<?> cVar) {
        }

        /* renamed from: b */
        public static C12688f m39805b(C12684d dVar, C12693c<?> cVar) {
            return cVar == C12684d.f29380b ? C12694g.f29383c : dVar;
        }
    }

    /* renamed from: kotlin.a0.d$b */
    /* compiled from: ContinuationInterceptor.kt */
    public static final class C12686b implements C12693c<C12684d> {

        /* renamed from: a */
        static final /* synthetic */ C12686b f29381a = new C12686b();

        private C12686b() {
        }
    }

    /* renamed from: a */
    void mo31040a(C12683c<?> cVar);

    /* renamed from: b */
    <T> C12683c<T> mo31041b(C12683c<? super T> cVar);
}
