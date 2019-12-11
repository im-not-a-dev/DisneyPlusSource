package com.bumptech.glide.load.p334n.p337c0;

import android.os.Process;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy.Builder;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.bumptech.glide.load.n.c0.a */
/* compiled from: GlideExecutor */
public final class C8201a implements ExecutorService {

    /* renamed from: U */
    private static final long f17515U = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: V */
    private static volatile int f17516V;

    /* renamed from: c */
    private final ExecutorService f17517c;

    /* renamed from: com.bumptech.glide.load.n.c0.a$a */
    /* compiled from: GlideExecutor */
    private static final class C8202a implements ThreadFactory {

        /* renamed from: U */
        final C8204b f17518U;

        /* renamed from: V */
        final boolean f17519V;

        /* renamed from: W */
        private int f17520W;

        /* renamed from: c */
        private final String f17521c;

        /* renamed from: com.bumptech.glide.load.n.c0.a$a$a */
        /* compiled from: GlideExecutor */
        class C8203a extends Thread {
            C8203a(Runnable runnable, String str) {
                super(runnable, str);
            }

            public void run() {
                Process.setThreadPriority(9);
                if (C8202a.this.f17519V) {
                    StrictMode.setThreadPolicy(new Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                } catch (Throwable th) {
                    C8202a.this.f17518U.mo21315a(th);
                }
            }
        }

        C8202a(String str, C8204b bVar, boolean z) {
            this.f17521c = str;
            this.f17518U = bVar;
            this.f17519V = z;
        }

        public synchronized Thread newThread(Runnable runnable) {
            C8203a aVar;
            StringBuilder sb = new StringBuilder();
            sb.append("glide-");
            sb.append(this.f17521c);
            sb.append("-thread-");
            sb.append(this.f17520W);
            aVar = new C8203a(runnable, sb.toString());
            this.f17520W++;
            return aVar;
        }
    }

    /* renamed from: com.bumptech.glide.load.n.c0.a$b */
    /* compiled from: GlideExecutor */
    public interface C8204b {

        /* renamed from: a */
        public static final C8204b f17523a = new C8206b();

        /* renamed from: b */
        public static final C8204b f17524b = f17523a;

        /* renamed from: com.bumptech.glide.load.n.c0.a$b$a */
        /* compiled from: GlideExecutor */
        class C8205a implements C8204b {
            C8205a() {
            }

            /* renamed from: a */
            public void mo21315a(Throwable th) {
            }
        }

        /* renamed from: com.bumptech.glide.load.n.c0.a$b$b */
        /* compiled from: GlideExecutor */
        class C8206b implements C8204b {
            C8206b() {
            }

            /* renamed from: a */
            public void mo21315a(Throwable th) {
                if (th != null) {
                    String str = "GlideExecutor";
                    if (Log.isLoggable(str, 6)) {
                        Log.e(str, "Request threw uncaught throwable", th);
                    }
                }
            }
        }

        /* renamed from: com.bumptech.glide.load.n.c0.a$b$c */
        /* compiled from: GlideExecutor */
        class C8207c implements C8204b {
            C8207c() {
            }

            /* renamed from: a */
            public void mo21315a(Throwable th) {
                if (th != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th);
                }
            }
        }

        static {
            new C8205a();
            new C8207c();
        }

        /* renamed from: a */
        void mo21315a(Throwable th);
    }

    C8201a(ExecutorService executorService) {
        this.f17517c = executorService;
    }

    /* renamed from: a */
    public static C8201a m23810a(int i, String str, C8204b bVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C8202a(str, bVar, true));
        return new C8201a(threadPoolExecutor);
    }

    /* renamed from: b */
    public static C8201a m23812b(int i, String str, C8204b bVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C8202a(str, bVar, false));
        return new C8201a(threadPoolExecutor);
    }

    /* renamed from: c */
    public static C8201a m23813c() {
        return m23810a(1, "disk-cache", C8204b.f17524b);
    }

    /* renamed from: d */
    public static C8201a m23814d() {
        return m23812b(m23808a(), "source", C8204b.f17524b);
    }

    /* renamed from: e */
    public static C8201a m23815e() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, f17515U, TimeUnit.MILLISECONDS, new SynchronousQueue(), new C8202a("source-unlimited", C8204b.f17524b, false));
        return new C8201a(threadPoolExecutor);
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f17517c.awaitTermination(j, timeUnit);
    }

    public void execute(Runnable runnable) {
        this.f17517c.execute(runnable);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f17517c.invokeAll(collection);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return this.f17517c.invokeAny(collection);
    }

    public boolean isShutdown() {
        return this.f17517c.isShutdown();
    }

    public boolean isTerminated() {
        return this.f17517c.isTerminated();
    }

    public void shutdown() {
        this.f17517c.shutdown();
    }

    public List<Runnable> shutdownNow() {
        return this.f17517c.shutdownNow();
    }

    public Future<?> submit(Runnable runnable) {
        return this.f17517c.submit(runnable);
    }

    public String toString() {
        return this.f17517c.toString();
    }

    /* renamed from: a */
    public static C8201a m23809a(int i, C8204b bVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, i, f17515U, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C8202a("animation", bVar, true));
        return new C8201a(threadPoolExecutor);
    }

    /* renamed from: b */
    public static C8201a m23811b() {
        return m23809a(m23808a() >= 4 ? 2 : 1, C8204b.f17524b);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f17517c.invokeAll(collection, j, timeUnit);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f17517c.invokeAny(collection, j, timeUnit);
    }

    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.f17517c.submit(runnable, t);
    }

    /* renamed from: a */
    public static int m23808a() {
        if (f17516V == 0) {
            f17516V = Math.min(4, C8208b.m23820a());
        }
        return f17516V;
    }

    public <T> Future<T> submit(Callable<T> callable) {
        return this.f17517c.submit(callable);
    }
}
