package androidx.work.impl.utils.taskexecutor;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: androidx.work.impl.utils.taskexecutor.a */
/* compiled from: WorkManagerTaskExecutor */
public class C1159a implements TaskExecutor {

    /* renamed from: a */
    private final Handler f4382a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private final Executor f4383b = new C1160a();

    /* renamed from: c */
    volatile Thread f4384c;

    /* renamed from: d */
    private final ThreadFactory f4385d = new C1161b();

    /* renamed from: e */
    private final ExecutorService f4386e = Executors.newSingleThreadExecutor(this.f4385d);

    /* renamed from: androidx.work.impl.utils.taskexecutor.a$a */
    /* compiled from: WorkManagerTaskExecutor */
    class C1160a implements Executor {
        C1160a() {
        }

        public void execute(Runnable runnable) {
            C1159a.this.mo5942b(runnable);
        }
    }

    /* renamed from: androidx.work.impl.utils.taskexecutor.a$b */
    /* compiled from: WorkManagerTaskExecutor */
    class C1161b implements ThreadFactory {

        /* renamed from: c */
        private int f4389c = 0;

        C1161b() {
        }

        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            StringBuilder sb = new StringBuilder();
            sb.append("WorkManager-WorkManagerTaskExecutor-thread-");
            sb.append(this.f4389c);
            newThread.setName(sb.toString());
            this.f4389c++;
            C1159a.this.f4384c = newThread;
            return newThread;
        }
    }

    /* renamed from: a */
    public void mo5939a(Runnable runnable) {
        this.f4386e.execute(runnable);
    }

    /* renamed from: b */
    public void mo5942b(Runnable runnable) {
        this.f4382a.post(runnable);
    }

    /* renamed from: c */
    public Executor mo5941c() {
        return this.f4386e;
    }

    /* renamed from: a */
    public Thread mo5938a() {
        return this.f4384c;
    }

    /* renamed from: b */
    public Executor mo5940b() {
        return this.f4383b;
    }
}
