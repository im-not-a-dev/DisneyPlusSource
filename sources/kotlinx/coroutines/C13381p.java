package kotlinx.coroutines;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p573a0.C12688f;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0011\u001a\u0004\u0018\u0001H\u0012\"\u0004\b\u0000\u0010\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0014H\b¢\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\u001c\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001d2\n\u0010\u0013\u001a\u00060\u001ej\u0002`\u001fH\u0016J\b\u0010 \u001a\u00020\u0006H\u0002J!\u0010!\u001a\u00020\u00102\n\u0010\"\u001a\u0006\u0012\u0002\b\u00030#2\u0006\u0010\u0005\u001a\u00020\u0019H\u0000¢\u0006\u0002\b$J\r\u0010%\u001a\u00020\u0017H\u0000¢\u0006\u0002\b&J\u0015\u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020)H\u0000¢\u0006\u0002\b*J\b\u0010+\u001a\u00020\u0004H\u0016J\r\u0010\u000f\u001a\u00020\u0017H\u0000¢\u0006\u0002\b,R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, mo31007d2 = {"Lkotlinx/coroutines/CommonPool;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "()V", "DEFAULT_PARALLELISM_PROPERTY_NAME", "", "executor", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "parallelism", "", "getParallelism", "()I", "pool", "requestedParallelism", "usePrivatePool", "", "Try", "T", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "close", "", "createPlainPool", "Ljava/util/concurrent/ExecutorService;", "createPool", "dispatch", "context", "Lkotlin/coroutines/CoroutineContext;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "getOrCreatePoolSync", "isGoodCommonPool", "fjpClass", "Ljava/lang/Class;", "isGoodCommonPool$kotlinx_coroutines_core", "restore", "restore$kotlinx_coroutines_core", "shutdown", "timeout", "", "shutdown$kotlinx_coroutines_core", "toString", "usePrivatePool$kotlinx_coroutines_core", "kotlinx-coroutines-core"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: kotlinx.coroutines.p */
/* compiled from: CommonPool.kt */
public final class C13381p extends C13419z0 {

    /* renamed from: U */
    private static boolean f29871U;

    /* renamed from: V */
    public static final C13381p f29872V = new C13381p();

    /* renamed from: c */
    private static final int f29873c;
    private static volatile Executor pool;

    /* renamed from: kotlinx.coroutines.p$a */
    /* compiled from: CommonPool.kt */
    static final class C13382a implements ThreadFactory {

        /* renamed from: c */
        final /* synthetic */ AtomicInteger f29874c;

        C13382a(AtomicInteger atomicInteger) {
            this.f29874c = atomicInteger;
        }

        public final Thread newThread(Runnable runnable) {
            StringBuilder sb = new StringBuilder();
            sb.append("CommonPool-worker-");
            sb.append(this.f29874c.incrementAndGet());
            Thread thread = new Thread(runnable, sb.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* renamed from: kotlinx.coroutines.p$b */
    /* compiled from: CommonPool.kt */
    static final class C13383b implements Runnable {

        /* renamed from: c */
        public static final C13383b f29875c = new C13383b();

        C13383b() {
        }

        public final void run() {
        }
    }

    static {
        String str;
        int i;
        try {
            str = System.getProperty("kotlinx.coroutines.default.parallelism");
        } catch (Throwable unused) {
            str = null;
        }
        if (str != null) {
            Integer d = C12831v.m40110d(str);
            if (d == null || d.intValue() < 1) {
                StringBuilder sb = new StringBuilder();
                sb.append("Expected positive number in kotlinx.coroutines.default.parallelism, but has ");
                sb.append(str);
                throw new IllegalStateException(sb.toString().toString());
            }
            i = d.intValue();
        } else {
            i = -1;
        }
        f29873c = i;
    }

    private C13381p() {
    }

    /* renamed from: g */
    private final ExecutorService m41119g() {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(m41122j(), new C13382a(new AtomicInteger()));
        Intrinsics.checkReturnedValueIsNotNull((Object) newFixedThreadPool, "Executors.newFixedThread…Daemon = true }\n        }");
        return newFixedThreadPool;
    }

    /* renamed from: h */
    private final ExecutorService m41120h() {
        Class cls;
        ExecutorService executorService;
        ExecutorService executorService2;
        if (System.getSecurityManager() != null) {
            return m41119g();
        }
        try {
            cls = Class.forName("java.util.concurrent.ForkJoinPool");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return m41119g();
        }
        if (!f29871U && f29873c < 0) {
            try {
                Method method = cls.getMethod("commonPool", new Class[0]);
                Object invoke = method != null ? method.invoke(null, new Object[0]) : null;
                if (!(invoke instanceof ExecutorService)) {
                    invoke = null;
                }
                executorService2 = (ExecutorService) invoke;
            } catch (Throwable unused2) {
                executorService2 = null;
            }
            if (executorService2 != null) {
                if (!f29872V.mo34575a(cls, executorService2)) {
                    executorService2 = null;
                }
                if (executorService2 != null) {
                    return executorService2;
                }
            }
        }
        try {
            Object newInstance = cls.getConstructor(new Class[]{Integer.TYPE}).newInstance(new Object[]{Integer.valueOf(f29872V.m41122j())});
            if (!(newInstance instanceof ExecutorService)) {
                newInstance = null;
            }
            executorService = (ExecutorService) newInstance;
        } catch (Throwable unused3) {
            executorService = null;
        }
        if (executorService != null) {
            return executorService;
        }
        return m41119g();
    }

    /* renamed from: i */
    private final synchronized Executor m41121i() {
        Executor executor;
        executor = pool;
        if (executor == null) {
            executor = m41120h();
            pool = executor;
        }
        return executor;
    }

    /* renamed from: j */
    private final int m41122j() {
        Integer valueOf = Integer.valueOf(f29873c);
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return C12762h.m39913a(Runtime.getRuntime().availableProcessors() - 1, 1);
    }

    /* renamed from: a */
    public final boolean mo34575a(Class<?> cls, ExecutorService executorService) {
        Integer num;
        executorService.submit(C13383b.f29875c);
        try {
            Object invoke = cls.getMethod("getPoolSize", new Class[0]).invoke(executorService, new Object[0]);
            if (!(invoke instanceof Integer)) {
                invoke = null;
            }
            num = (Integer) invoke;
        } catch (Throwable unused) {
            num = null;
        }
        if (num == null) {
            return false;
        }
        boolean z = true;
        if (num.intValue() < 1) {
            z = false;
        }
        return z;
    }

    public void close() {
        throw new IllegalStateException("Close cannot be invoked on CommonPool".toString());
    }

    public String toString() {
        return "CommonPool";
    }

    /* renamed from: a */
    public void mo34340a(C12688f fVar, Runnable runnable) {
        Runnable runnable2;
        try {
            Executor executor = pool;
            if (executor == null) {
                executor = m41121i();
            }
            C13235e2 a = C13239f2.m40692a();
            if (a != null) {
                runnable2 = a.mo34373a(runnable);
                if (runnable2 != null) {
                    executor.execute(runnable2);
                }
            }
            runnable2 = runnable;
            executor.execute(runnable2);
        } catch (RejectedExecutionException unused) {
            C13235e2 a2 = C13239f2.m40692a();
            if (a2 != null) {
                a2.mo34378c();
            }
            C13330l0.f29765Z.mo34617a(runnable);
        }
    }
}
