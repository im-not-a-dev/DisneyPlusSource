package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import kotlin.p573a0.C12688f;
import kotlinx.coroutines.internal.C13256d;

/* renamed from: kotlinx.coroutines.a1 */
/* compiled from: Executors.kt */
public abstract class C13212a1 extends C13419z0 implements C13343m0 {
    /* renamed from: a */
    public void mo34340a(C12688f fVar, Runnable runnable) {
        Runnable runnable2;
        try {
            Executor f = mo34353f();
            C13235e2 a = C13239f2.m40692a();
            if (a != null) {
                runnable2 = a.mo34373a(runnable);
                if (runnable2 != null) {
                    f.execute(runnable2);
                }
            }
            runnable2 = runnable;
            f.execute(runnable2);
        } catch (RejectedExecutionException unused) {
            C13235e2 a2 = C13239f2.m40692a();
            if (a2 != null) {
                a2.mo34378c();
            }
            C13330l0.f29765Z.mo34617a(runnable);
        }
    }

    public void close() {
        Executor f = mo34353f();
        if (!(f instanceof ExecutorService)) {
            f = null;
        }
        ExecutorService executorService = (ExecutorService) f;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C13212a1) && ((C13212a1) obj).mo34353f() == mo34353f();
    }

    /* renamed from: g */
    public final void mo34343g() {
        C13256d.m40747a(mo34353f());
    }

    public int hashCode() {
        return System.identityHashCode(mo34353f());
    }

    public String toString() {
        return mo34353f().toString();
    }
}
