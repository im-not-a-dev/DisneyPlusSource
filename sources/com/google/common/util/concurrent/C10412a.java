package com.google.common.util.concurrent;

import java.util.concurrent.Executor;

/* renamed from: com.google.common.util.concurrent.a */
/* compiled from: DirectExecutor */
enum C10412a implements Executor {
    INSTANCE;

    public void execute(Runnable runnable) {
        runnable.run();
    }

    public String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
