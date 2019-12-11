package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public interface ListenableFuture<V> extends Future<V> {
    /* renamed from: a */
    void mo5913a(Runnable runnable, Executor executor);
}
