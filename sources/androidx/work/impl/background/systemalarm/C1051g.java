package androidx.work.impl.background.systemalarm;

import androidx.work.C1034h;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.work.impl.background.systemalarm.g */
/* compiled from: WorkTimer */
class C1051g {

    /* renamed from: f */
    private static final String f4131f = C1034h.m5551a("WorkTimer");

    /* renamed from: a */
    private final ThreadFactory f4132a = new C1052a(this);

    /* renamed from: b */
    private final ScheduledExecutorService f4133b = Executors.newSingleThreadScheduledExecutor(this.f4132a);

    /* renamed from: c */
    final Map<String, C1054c> f4134c = new HashMap();

    /* renamed from: d */
    final Map<String, C1053b> f4135d = new HashMap();

    /* renamed from: e */
    final Object f4136e = new Object();

    /* renamed from: androidx.work.impl.background.systemalarm.g$a */
    /* compiled from: WorkTimer */
    class C1052a implements ThreadFactory {

        /* renamed from: c */
        private int f4137c = 0;

        C1052a(C1051g gVar) {
        }

        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            StringBuilder sb = new StringBuilder();
            sb.append("WorkManager-WorkTimer-thread-");
            sb.append(this.f4137c);
            newThread.setName(sb.toString());
            this.f4137c++;
            return newThread;
        }
    }

    /* renamed from: androidx.work.impl.background.systemalarm.g$b */
    /* compiled from: WorkTimer */
    interface C1053b {
        /* renamed from: a */
        void mo5723a(String str);
    }

    /* renamed from: androidx.work.impl.background.systemalarm.g$c */
    /* compiled from: WorkTimer */
    static class C1054c implements Runnable {

        /* renamed from: U */
        private final String f4138U;

        /* renamed from: c */
        private final C1051g f4139c;

        C1054c(C1051g gVar, String str) {
            this.f4139c = gVar;
            this.f4138U = str;
        }

        public void run() {
            synchronized (this.f4139c.f4136e) {
                if (((C1054c) this.f4139c.f4134c.remove(this.f4138U)) != null) {
                    C1053b bVar = (C1053b) this.f4139c.f4135d.remove(this.f4138U);
                    if (bVar != null) {
                        bVar.mo5723a(this.f4138U);
                    }
                } else {
                    C1034h.m5550a().mo5697a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", new Object[]{this.f4138U}), new Throwable[0]);
                }
            }
        }
    }

    C1051g() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5741a(String str, long j, C1053b bVar) {
        synchronized (this.f4136e) {
            C1034h.m5550a().mo5697a(f4131f, String.format("Starting timer for %s", new Object[]{str}), new Throwable[0]);
            mo5740a(str);
            C1054c cVar = new C1054c(this, str);
            this.f4134c.put(str, cVar);
            this.f4135d.put(str, bVar);
            this.f4133b.schedule(cVar, j, TimeUnit.MILLISECONDS);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5740a(String str) {
        synchronized (this.f4136e) {
            if (((C1054c) this.f4134c.remove(str)) != null) {
                C1034h.m5550a().mo5697a(f4131f, String.format("Stopping timer for %s", new Object[]{str}), new Throwable[0]);
                this.f4135d.remove(str);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5739a() {
        this.f4133b.shutdownNow();
    }
}
