package p161f.p162a;

import com.appboy.p033s.C1557c;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: f.a.z */
public abstract class C4634z extends ThreadPoolExecutor {
    /* access modifiers changed from: private */

    /* renamed from: X */
    public static final String f11568X = C1557c.m7461a(C4634z.class);
    /* access modifiers changed from: private */

    /* renamed from: U */
    public List<Runnable> f11569U = new CopyOnWriteArrayList();
    /* access modifiers changed from: private */

    /* renamed from: V */
    public Map<Runnable, Thread> f11570V = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: W */
    public String f11571W;

    /* renamed from: c */
    private C4595u0 f11572c;

    /* renamed from: f.a.z$b */
    class C4636b implements RejectedExecutionHandler {
        private C4636b() {
        }

        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            String a = C4634z.f11568X;
            StringBuilder sb = new StringBuilder();
            sb.append("Rejected execution on runnable: ");
            sb.append(runnable);
            String str = " . ID: ";
            sb.append(str);
            sb.append(C4634z.this.f11571W);
            C1557c.m7458a(a, sb.toString());
            if (threadPoolExecutor.isShutdown() || threadPoolExecutor.isTerminating()) {
                String a2 = C4634z.f11568X;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ThreadPoolExecutor is shutdown. Dropping rejected task. ID: ");
                sb2.append(C4634z.this.f11571W);
                C1557c.m7469c(a2, sb2.toString());
                return;
            }
            String b = C4634z.this.m16138b();
            try {
                if (!C4634z.this.f11569U.isEmpty()) {
                    Runnable runnable2 = (Runnable) C4634z.this.f11569U.get(0);
                    if (runnable2 instanceof Future) {
                        ((Future) runnable2).cancel(true);
                    } else {
                        Thread thread = (Thread) C4634z.this.f11570V.get(runnable2);
                        if (thread != null) {
                            thread.interrupt();
                        }
                    }
                    C4634z.this.f11569U.remove(runnable2);
                    C4634z.this.f11570V.remove(runnable2);
                }
                Runnable runnable3 = (Runnable) threadPoolExecutor.getQueue().poll();
                if (runnable3 != null) {
                    String a3 = C4634z.f11568X;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Running head of queue on caller thread: ");
                    sb3.append(runnable3);
                    sb3.append(str);
                    sb3.append(C4634z.this.f11571W);
                    C1557c.m7471d(a3, sb3.toString());
                    Executors.newSingleThreadExecutor().invokeAll(Collections.singletonList(Executors.callable(runnable3)), 200, TimeUnit.MILLISECONDS);
                }
                String a4 = C4634z.f11568X;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Re-adding rejected task to queue: ");
                sb4.append(runnable);
                sb4.append(str);
                sb4.append(C4634z.this.f11571W);
                C1557c.m7471d(a4, sb4.toString());
                threadPoolExecutor.execute(runnable);
            } catch (Exception e) {
                String a5 = C4634z.f11568X;
                StringBuilder sb5 = new StringBuilder();
                sb5.append("Caught exception in rejected execution handler for incoming task: ");
                sb5.append(runnable);
                sb5.append(" . Running tasks description: ");
                sb5.append(b);
                C1557c.m7466b(a5, sb5.toString(), (Throwable) e);
            }
            if (b != null) {
                C4634z zVar = C4634z.this;
                StringBuilder sb6 = new StringBuilder();
                sb6.append("Handled rejected execution on incoming task: ");
                sb6.append(b);
                zVar.m16137a(new Exception(sb6.toString()));
            }
        }
    }

    public C4634z(String str, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory);
        this.f11571W = str;
        setRejectedExecutionHandler(new C4636b());
    }

    /* access modifiers changed from: protected */
    public void afterExecute(Runnable runnable, Throwable th) {
        this.f11569U.remove(runnable);
        this.f11570V.remove(runnable);
        super.afterExecute(runnable, th);
    }

    /* access modifiers changed from: protected */
    public void beforeExecute(Thread thread, Runnable runnable) {
        this.f11569U.add(runnable);
        this.f11570V.put(runnable, thread);
        super.beforeExecute(thread, runnable);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public String m16138b() {
        try {
            String str = " ID: ";
            if (this.f11569U.size() != getActiveCount()) {
                String str2 = f11568X;
                StringBuilder sb = new StringBuilder();
                sb.append("Running task count does not match ThreadPoolExecutor active count. Returning null description.  runningTasks.size(): ");
                sb.append(this.f11569U.size());
                sb.append(" getActiveCount(): ");
                sb.append(getActiveCount());
                sb.append(str);
                sb.append(this.f11571W);
                C1557c.m7458a(str2, sb.toString());
                return null;
            }
            StringBuilder sb2 = new StringBuilder(1024);
            sb2.append("There are ");
            sb2.append(this.f11569U.size());
            sb2.append(" known running tasks. Active thread dumps: [\n");
            for (Thread thread : this.f11570V.values()) {
                try {
                    sb2.append(m16135a(thread.getStackTrace()));
                    sb2.append("\n,");
                } catch (Exception e) {
                    String str3 = f11568X;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Failed to create description for active thread: ");
                    sb3.append(thread);
                    sb3.append(str);
                    sb3.append(this.f11571W);
                    C1557c.m7470c(str3, sb3.toString(), e);
                }
            }
            sb2.append("]\nExecutor ID: ");
            sb2.append(this.f11571W);
            sb2.append(" state: ");
            sb2.append(toString());
            return sb2.toString();
        } catch (Exception e2) {
            String str4 = f11568X;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Failed to create running tasks description. ID: ");
            sb4.append(this.f11571W);
            C1557c.m7470c(str4, sb4.toString(), e2);
            return null;
        }
    }

    /* renamed from: a */
    public void mo15949a(C4595u0 u0Var) {
        this.f11572c = u0Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m16137a(Exception exc) {
        String str = f11568X;
        StringBuilder sb = new StringBuilder();
        sb.append("Attempting to publish exception. ID: ");
        sb.append(this.f11571W);
        C1557c.m7470c(str, sb.toString(), exc);
        C4595u0 u0Var = this.f11572c;
        if (u0Var != null) {
            u0Var.mo15769a((Throwable) exc);
        }
    }

    /* renamed from: a */
    private static String m16135a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            sb.append("\nat ");
            sb.append(stackTraceElement);
        }
        return sb.toString();
    }
}
