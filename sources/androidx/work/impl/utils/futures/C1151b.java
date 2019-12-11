package androidx.work.impl.utils.futures;

import java.util.concurrent.Executor;

/* renamed from: androidx.work.impl.utils.futures.b */
/* compiled from: DirectExecutor */
enum C1151b implements Executor {
    INSTANCE;

    public void execute(Runnable runnable) {
        runnable.run();
    }

    public String toString() {
        return "DirectExecutor";
    }
}
