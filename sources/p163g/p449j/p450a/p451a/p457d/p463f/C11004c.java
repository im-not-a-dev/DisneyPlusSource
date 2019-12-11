package p163g.p449j.p450a.p451a.p457d.p463f;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: g.j.a.a.d.f.c */
/* compiled from: com.google.firebase:firebase-iid@@19.0.1 */
final class C11004c implements C11003b {
    private C11004c() {
    }

    /* renamed from: a */
    public final ExecutorService mo28231a(ThreadFactory threadFactory, int i) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    /* renamed from: a */
    public final ScheduledExecutorService mo28232a(int i, ThreadFactory threadFactory, int i2) {
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, threadFactory));
    }
}
