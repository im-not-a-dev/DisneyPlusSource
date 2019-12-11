package kotlinx.coroutines.p595m2;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.p573a0.C12688f;
import kotlinx.coroutines.C13419z0;

/* renamed from: kotlinx.coroutines.m2.f */
/* compiled from: Dispatcher.kt */
final class C13353f extends C13419z0 implements C13357j, Executor {

    /* renamed from: X */
    private static final AtomicIntegerFieldUpdater f29826X = AtomicIntegerFieldUpdater.newUpdater(C13353f.class, "inFlightTasks");

    /* renamed from: U */
    private final C13351d f29827U;

    /* renamed from: V */
    private final int f29828V;

    /* renamed from: W */
    private final C13359l f29829W;

    /* renamed from: c */
    private final ConcurrentLinkedQueue<Runnable> f29830c = new ConcurrentLinkedQueue<>();
    private volatile int inFlightTasks = 0;

    public C13353f(C13351d dVar, int i, C13359l lVar) {
        this.f29827U = dVar;
        this.f29828V = i;
        this.f29829W = lVar;
    }

    /* renamed from: a */
    public void mo34340a(C12688f fVar, Runnable runnable) {
        m41049a(runnable, false);
    }

    /* renamed from: b */
    public void mo34546b() {
        Runnable runnable = (Runnable) this.f29830c.poll();
        if (runnable != null) {
            this.f29827U.mo34543a(runnable, this, true);
            return;
        }
        f29826X.decrementAndGet(this);
        Runnable runnable2 = (Runnable) this.f29830c.poll();
        if (runnable2 != null) {
            m41049a(runnable2, true);
        }
    }

    public void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    /* renamed from: e */
    public C13359l mo34547e() {
        return this.f29829W;
    }

    public void execute(Runnable runnable) {
        m41049a(runnable, false);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[dispatcher = ");
        sb.append(this.f29827U);
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: a */
    private final void m41049a(Runnable runnable, boolean z) {
        while (f29826X.incrementAndGet(this) > this.f29828V) {
            this.f29830c.add(runnable);
            if (f29826X.decrementAndGet(this) < this.f29828V) {
                runnable = (Runnable) this.f29830c.poll();
                if (runnable == null) {
                    return;
                }
            } else {
                return;
            }
        }
        this.f29827U.mo34543a(runnable, this, z);
    }
}
