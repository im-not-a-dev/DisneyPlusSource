package p520io.reactivex.p531y.p544g;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.y.g.o */
/* compiled from: SchedulerPoolFactory */
public final class C12519o {

    /* renamed from: a */
    public static final boolean f29009a;

    /* renamed from: b */
    public static final int f29010b;

    /* renamed from: c */
    static final AtomicReference<ScheduledExecutorService> f29011c = new AtomicReference<>();

    /* renamed from: d */
    static final Map<ScheduledThreadPoolExecutor, Object> f29012d = new ConcurrentHashMap();

    /* renamed from: io.reactivex.y.g.o$a */
    /* compiled from: SchedulerPoolFactory */
    static final class C12520a {

        /* renamed from: a */
        boolean f29013a;

        /* renamed from: b */
        int f29014b;

        C12520a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30639a(Properties properties) {
            String str = "rx2.purge-enabled";
            if (properties.containsKey(str)) {
                this.f29013a = Boolean.parseBoolean(properties.getProperty(str));
            } else {
                this.f29013a = true;
            }
            if (this.f29013a) {
                String str2 = "rx2.purge-period-seconds";
                if (properties.containsKey(str2)) {
                    try {
                        this.f29014b = Integer.parseInt(properties.getProperty(str2));
                        return;
                    } catch (NumberFormatException unused) {
                        this.f29014b = 1;
                        return;
                    }
                }
            }
            this.f29014b = 1;
        }
    }

    /* renamed from: io.reactivex.y.g.o$b */
    /* compiled from: SchedulerPoolFactory */
    static final class C12521b implements Runnable {
        C12521b() {
        }

        public void run() {
            Iterator it = new ArrayList(C12519o.f29012d.keySet()).iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    C12519o.f29012d.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    static {
        Properties properties = System.getProperties();
        C12520a aVar = new C12520a();
        aVar.mo30639a(properties);
        f29009a = aVar.f29013a;
        f29010b = aVar.f29014b;
        m39274a();
    }

    /* renamed from: a */
    public static void m39274a() {
        m39275a(f29009a);
    }

    /* renamed from: a */
    static void m39275a(boolean z) {
        if (z) {
            while (true) {
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) f29011c.get();
                if (scheduledExecutorService == null) {
                    ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new C12513j("RxSchedulerPurge"));
                    if (f29011c.compareAndSet(scheduledExecutorService, newScheduledThreadPool)) {
                        C12521b bVar = new C12521b();
                        int i = f29010b;
                        newScheduledThreadPool.scheduleAtFixedRate(bVar, (long) i, (long) i, TimeUnit.SECONDS);
                        return;
                    }
                    newScheduledThreadPool.shutdownNow();
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public static ScheduledExecutorService m39273a(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        m39276a(f29009a, newScheduledThreadPool);
        return newScheduledThreadPool;
    }

    /* renamed from: a */
    static void m39276a(boolean z, ScheduledExecutorService scheduledExecutorService) {
        if (z && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            f29012d.put((ScheduledThreadPoolExecutor) scheduledExecutorService, scheduledExecutorService);
        }
    }
}
