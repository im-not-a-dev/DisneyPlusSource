package kotlinx.coroutines;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p573a0.C12688f;
import kotlinx.coroutines.android.AndroidExceptionPreHandler;

/* renamed from: kotlinx.coroutines.a0 */
/* compiled from: CoroutineExceptionHandlerImpl.kt */
public final class C13211a0 {

    /* renamed from: a */
    private static final List<CoroutineExceptionHandler> f29647a;

    static {
        Iterator it = Arrays.asList(new CoroutineExceptionHandler[]{new AndroidExceptionPreHandler()}).iterator();
        Intrinsics.checkReturnedValueIsNotNull((Object) it, "ServiceLoader.load(\n    ….classLoader\n).iterator()");
        f29647a = C12788p.m39999g(C12781n.m39974a(it));
    }

    /* renamed from: a */
    public static final void m40638a(C12688f fVar, Throwable th) {
        Iterator it = f29647a.iterator();
        while (true) {
            String str = "currentThread";
            if (it.hasNext()) {
                try {
                    ((CoroutineExceptionHandler) it.next()).handleException(fVar, th);
                } catch (Throwable th2) {
                    Thread currentThread = Thread.currentThread();
                    Intrinsics.checkReturnedValueIsNotNull((Object) currentThread, str);
                    currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, C13218b0.m40650a(th, th2));
                }
            } else {
                Thread currentThread2 = Thread.currentThread();
                Intrinsics.checkReturnedValueIsNotNull((Object) currentThread2, str);
                currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
                return;
            }
        }
    }
}
