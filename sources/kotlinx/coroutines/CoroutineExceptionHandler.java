package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.p573a0.C12688f;
import kotlin.p573a0.C12688f.C12691b;
import kotlin.p573a0.C12688f.C12693c;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, mo31007d2 = {"Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext$Element;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "Key", "kotlinx-coroutines-core"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: CoroutineExceptionHandler.kt */
public interface CoroutineExceptionHandler extends C12691b {

    /* renamed from: d */
    public static final C13209a f29643d = C13209a.f29644a;

    /* renamed from: kotlinx.coroutines.CoroutineExceptionHandler$a */
    /* compiled from: CoroutineExceptionHandler.kt */
    public static final class C13209a implements C12693c<CoroutineExceptionHandler> {

        /* renamed from: a */
        static final /* synthetic */ C13209a f29644a = new C13209a();

        private C13209a() {
        }
    }

    void handleException(C12688f fVar, Throwable th);
}
