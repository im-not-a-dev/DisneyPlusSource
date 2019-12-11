package kotlinx.coroutines;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: kotlinx.coroutines.x0 */
/* compiled from: EventLoop.kt */
public final class C13413x0 {
    /* renamed from: a */
    public static final C13402u0 m41265a() {
        Thread currentThread = Thread.currentThread();
        Intrinsics.checkReturnedValueIsNotNull((Object) currentThread, "Thread.currentThread()");
        return new C13221c(currentThread);
    }
}
