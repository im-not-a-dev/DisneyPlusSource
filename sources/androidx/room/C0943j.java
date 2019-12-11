package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: androidx.room.j */
/* compiled from: TransactionExecutor */
class C0943j implements Executor {

    /* renamed from: U */
    private final ArrayDeque<Runnable> f3755U = new ArrayDeque<>();

    /* renamed from: V */
    private Runnable f3756V;

    /* renamed from: c */
    private final Executor f3757c;

    /* renamed from: androidx.room.j$a */
    /* compiled from: TransactionExecutor */
    class C0944a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ Runnable f3759c;

        C0944a(Runnable runnable) {
            this.f3759c = runnable;
        }

        public void run() {
            try {
                this.f3759c.run();
            } finally {
                C0943j.this.mo5276a();
            }
        }
    }

    C0943j(Executor executor) {
        this.f3757c = executor;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo5276a() {
        Runnable runnable = (Runnable) this.f3755U.poll();
        this.f3756V = runnable;
        if (runnable != null) {
            this.f3757c.execute(this.f3756V);
        }
    }

    public synchronized void execute(Runnable runnable) {
        this.f3755U.offer(new C0944a(runnable));
        if (this.f3756V == null) {
            mo5276a();
        }
    }
}
