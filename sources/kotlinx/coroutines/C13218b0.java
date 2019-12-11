package kotlinx.coroutines;

import kotlin.p573a0.C12688f;

/* renamed from: kotlinx.coroutines.b0 */
/* compiled from: CoroutineExceptionHandler.kt */
public final class C13218b0 {
    /* renamed from: a */
    public static final void m40651a(C12688f fVar, Throwable th) {
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) fVar.get(CoroutineExceptionHandler.f29643d);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(fVar, th);
            } else {
                C13211a0.m40638a(fVar, th);
            }
        } catch (Throwable th2) {
            C13211a0.m40638a(fVar, m40650a(th, th2));
        }
    }

    /* renamed from: a */
    public static final Throwable m40650a(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        C12722c.m39860a(runtimeException, th);
        return runtimeException;
    }
}
