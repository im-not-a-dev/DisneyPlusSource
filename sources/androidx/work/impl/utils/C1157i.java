package androidx.work.impl.utils;

import java.util.concurrent.Executor;

/* renamed from: androidx.work.impl.utils.i */
/* compiled from: SynchronousExecutor */
public class C1157i implements Executor {
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
