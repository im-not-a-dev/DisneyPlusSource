package com.google.common.util.concurrent;

import com.google.common.base.C10369d;
import com.google.common.base.C10369d.C10371b;
import com.google.common.base.C10374f;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: com.google.common.util.concurrent.c */
/* compiled from: Futures */
public final class C10414c extends C10416d {

    /* renamed from: com.google.common.util.concurrent.c$a */
    /* compiled from: Futures */
    private static final class C10415a<V> implements Runnable {

        /* renamed from: U */
        final C10413b<? super V> f24731U;

        /* renamed from: c */
        final Future<V> f24732c;

        C10415a(Future<V> future, C10413b<? super V> bVar) {
            this.f24732c = future;
            this.f24731U = bVar;
        }

        public void run() {
            try {
                this.f24731U.onSuccess(C10414c.m32921a(this.f24732c));
            } catch (ExecutionException e) {
                this.f24731U.onFailure(e.getCause());
            } catch (Error | RuntimeException e2) {
                this.f24731U.onFailure(e2);
            }
        }

        public String toString() {
            C10371b a = C10369d.m32802a(this);
            a.mo27112a(this.f24731U);
            return a.toString();
        }
    }

    /* renamed from: a */
    public static <V> void m32922a(ListenableFuture<V> listenableFuture, C10413b<? super V> bVar, Executor executor) {
        C10374f.m32809a(bVar);
        listenableFuture.mo5913a(new C10415a(listenableFuture, bVar), executor);
    }

    /* renamed from: a */
    public static <V> V m32921a(Future<V> future) throws ExecutionException {
        C10374f.m32814a(future.isDone(), "Future was expected to be done: %s", (Object) future);
        return C10418f.m32924a(future);
    }
}
